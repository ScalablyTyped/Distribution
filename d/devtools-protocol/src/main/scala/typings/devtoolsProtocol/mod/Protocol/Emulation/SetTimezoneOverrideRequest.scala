package typings.devtoolsProtocol.mod.Protocol.Emulation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetTimezoneOverrideRequest extends js.Object {
  
  /**
    * The timezone identifier. If empty, disables the override and
    * restores default host system timezone.
    */
  var timezoneId: String = js.native
}
object SetTimezoneOverrideRequest {
  
  @scala.inline
  def apply(timezoneId: String): SetTimezoneOverrideRequest = {
    val __obj = js.Dynamic.literal(timezoneId = timezoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTimezoneOverrideRequest]
  }
  
  @scala.inline
  implicit class SetTimezoneOverrideRequestOps[Self <: SetTimezoneOverrideRequest] (val x: Self) extends AnyVal {
    
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
    def setTimezoneId(value: String): Self = this.set("timezoneId", value.asInstanceOf[js.Any])
  }
}
