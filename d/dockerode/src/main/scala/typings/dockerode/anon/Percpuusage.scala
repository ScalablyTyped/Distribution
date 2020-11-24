package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Percpuusage extends js.Object {
  
  var percpu_usage: js.Array[Double] = js.native
  
  var total_usage: Double = js.native
  
  var usage_in_kernelmode: Double = js.native
  
  var usage_in_usermode: Double = js.native
}
object Percpuusage {
  
  @scala.inline
  def apply(
    percpu_usage: js.Array[Double],
    total_usage: Double,
    usage_in_kernelmode: Double,
    usage_in_usermode: Double
  ): Percpuusage = {
    val __obj = js.Dynamic.literal(percpu_usage = percpu_usage.asInstanceOf[js.Any], total_usage = total_usage.asInstanceOf[js.Any], usage_in_kernelmode = usage_in_kernelmode.asInstanceOf[js.Any], usage_in_usermode = usage_in_usermode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Percpuusage]
  }
  
  @scala.inline
  implicit class PercpuusageOps[Self <: Percpuusage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPercpu_usageVarargs(value: Double*): Self = this.set("percpu_usage", js.Array(value :_*))
    
    @scala.inline
    def setPercpu_usage(value: js.Array[Double]): Self = this.set("percpu_usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_usage(value: Double): Self = this.set("total_usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsage_in_kernelmode(value: Double): Self = this.set("usage_in_kernelmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsage_in_usermode(value: Double): Self = this.set("usage_in_usermode", value.asInstanceOf[js.Any])
  }
}
