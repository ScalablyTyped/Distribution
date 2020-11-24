package typings.dockerode.mod

import typings.dockerode.anon.Percpuusage
import typings.dockerode.anon.Periods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CPUStats extends js.Object {
  
  var cpu_usage: Percpuusage = js.native
  
  var online_cpus: Double = js.native
  
  var system_cpu_usage: Double = js.native
  
  var throttling_data: Periods = js.native
}
object CPUStats {
  
  @scala.inline
  def apply(cpu_usage: Percpuusage, online_cpus: Double, system_cpu_usage: Double, throttling_data: Periods): CPUStats = {
    val __obj = js.Dynamic.literal(cpu_usage = cpu_usage.asInstanceOf[js.Any], online_cpus = online_cpus.asInstanceOf[js.Any], system_cpu_usage = system_cpu_usage.asInstanceOf[js.Any], throttling_data = throttling_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUStats]
  }
  
  @scala.inline
  implicit class CPUStatsOps[Self <: CPUStats] (val x: Self) extends AnyVal {
    
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
    def setCpu_usage(value: Percpuusage): Self = this.set("cpu_usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnline_cpus(value: Double): Self = this.set("online_cpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem_cpu_usage(value: Double): Self = this.set("system_cpu_usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottling_data(value: Periods): Self = this.set("throttling_data", value.asInstanceOf[js.Any])
  }
}
