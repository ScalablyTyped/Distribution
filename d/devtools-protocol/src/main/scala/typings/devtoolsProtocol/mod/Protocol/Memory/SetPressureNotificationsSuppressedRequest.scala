package typings.devtoolsProtocol.mod.Protocol.Memory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetPressureNotificationsSuppressedRequest extends js.Object {
  
  /**
    * If true, memory pressure notifications will be suppressed.
    */
  var suppressed: Boolean = js.native
}
object SetPressureNotificationsSuppressedRequest {
  
  @scala.inline
  def apply(suppressed: Boolean): SetPressureNotificationsSuppressedRequest = {
    val __obj = js.Dynamic.literal(suppressed = suppressed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPressureNotificationsSuppressedRequest]
  }
  
  @scala.inline
  implicit class SetPressureNotificationsSuppressedRequestOps[Self <: SetPressureNotificationsSuppressedRequest] (val x: Self) extends AnyVal {
    
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
    def setSuppressed(value: Boolean): Self = this.set("suppressed", value.asInstanceOf[js.Any])
  }
}
