package typings.devtoolsProtocol.mod.Protocol.Security

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateErrorEvent extends StObject {
  
  /**
    * The type of the error.
    */
  var errorType: String
  
  /**
    * The ID of the event.
    */
  var eventId: integer
  
  /**
    * The url that was requested.
    */
  var requestURL: String
}
object CertificateErrorEvent {
  
  inline def apply(errorType: String, eventId: integer, requestURL: String): CertificateErrorEvent = {
    val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], requestURL = requestURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateErrorEvent]
  }
  
  extension [Self <: CertificateErrorEvent](x: Self) {
    
    inline def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setEventId(value: integer): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setRequestURL(value: String): Self = StObject.set(x, "requestURL", value.asInstanceOf[js.Any])
  }
}
