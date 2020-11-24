package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateConfig extends js.Object {
  
  var Delay: js.UndefOr[Double] = js.native
  
  var FailureAction: js.UndefOr[String] = js.native
  
  var MaxFailureRatio: js.UndefOr[Double] = js.native
  
  var Monitor: js.UndefOr[Double] = js.native
  
  var Order: String = js.native
  
  var Parallelism: Double = js.native
}
object UpdateConfig {
  
  @scala.inline
  def apply(Order: String, Parallelism: Double): UpdateConfig = {
    val __obj = js.Dynamic.literal(Order = Order.asInstanceOf[js.Any], Parallelism = Parallelism.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfig]
  }
  
  @scala.inline
  implicit class UpdateConfigOps[Self <: UpdateConfig] (val x: Self) extends AnyVal {
    
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
    def setOrder(value: String): Self = this.set("Order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelism(value: Double): Self = this.set("Parallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("Delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("Delay", js.undefined)
    
    @scala.inline
    def setFailureAction(value: String): Self = this.set("FailureAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureAction: Self = this.set("FailureAction", js.undefined)
    
    @scala.inline
    def setMaxFailureRatio(value: Double): Self = this.set("MaxFailureRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFailureRatio: Self = this.set("MaxFailureRatio", js.undefined)
    
    @scala.inline
    def setMonitor(value: Double): Self = this.set("Monitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitor: Self = this.set("Monitor", js.undefined)
  }
}
