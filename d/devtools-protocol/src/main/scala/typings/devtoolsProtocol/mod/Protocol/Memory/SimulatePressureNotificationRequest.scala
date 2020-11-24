package typings.devtoolsProtocol.mod.Protocol.Memory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimulatePressureNotificationRequest extends js.Object {
  
  /**
    * Memory pressure level of the notification.
    */
  var level: PressureLevel = js.native
}
object SimulatePressureNotificationRequest {
  
  @scala.inline
  def apply(level: PressureLevel): SimulatePressureNotificationRequest = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimulatePressureNotificationRequest]
  }
  
  @scala.inline
  implicit class SimulatePressureNotificationRequestOps[Self <: SimulatePressureNotificationRequest] (val x: Self) extends AnyVal {
    
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
    def setLevel(value: PressureLevel): Self = this.set("level", value.asInstanceOf[js.Any])
  }
}
