package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DispatcherConfig extends js.Object {
  
  var HeartbeatPeriod: js.UndefOr[Duration] = js.native
}
object DispatcherConfig {
  
  @scala.inline
  def apply(): DispatcherConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DispatcherConfig]
  }
  
  @scala.inline
  implicit class DispatcherConfigOps[Self <: DispatcherConfig] (val x: Self) extends AnyVal {
    
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
    def setHeartbeatPeriod(value: Duration): Self = this.set("HeartbeatPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeartbeatPeriod: Self = this.set("HeartbeatPeriod", js.undefined)
  }
}
