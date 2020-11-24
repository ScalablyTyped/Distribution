package typings.devtoolsProtocol.mod.Protocol.Security

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleCertificateErrorRequest extends js.Object {
  
  /**
    * The action to take on the certificate error.
    */
  var action: CertificateErrorAction = js.native
  
  /**
    * The ID of the event.
    */
  var eventId: integer = js.native
}
object HandleCertificateErrorRequest {
  
  @scala.inline
  def apply(action: CertificateErrorAction, eventId: integer): HandleCertificateErrorRequest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleCertificateErrorRequest]
  }
  
  @scala.inline
  implicit class HandleCertificateErrorRequestOps[Self <: HandleCertificateErrorRequest] (val x: Self) extends AnyVal {
    
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
    def setAction(value: CertificateErrorAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventId(value: integer): Self = this.set("eventId", value.asInstanceOf[js.Any])
  }
}
