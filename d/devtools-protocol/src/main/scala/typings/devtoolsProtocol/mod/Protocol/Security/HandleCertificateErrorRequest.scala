package typings.devtoolsProtocol.mod.Protocol.Security

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleCertificateErrorRequest extends StObject {
  
  /**
    * The action to take on the certificate error.
    */
  var action: CertificateErrorAction
  
  /**
    * The ID of the event.
    */
  var eventId: integer
}
object HandleCertificateErrorRequest {
  
  inline def apply(action: CertificateErrorAction, eventId: integer): HandleCertificateErrorRequest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleCertificateErrorRequest]
  }
  
  extension [Self <: HandleCertificateErrorRequest](x: Self) {
    
    inline def setAction(value: CertificateErrorAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEventId(value: integer): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
  }
}
