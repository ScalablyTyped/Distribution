package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalDocServiceErrorDetails extends StObject {
  
  /**
    * Reserved: TBD
    */
  var authenticationUrl: js.UndefOr[String] = js.undefined
  
  /**
    * A code associated with the error condition.
    */
  var errorCode: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
}
object ExternalDocServiceErrorDetails {
  
  inline def apply(): ExternalDocServiceErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalDocServiceErrorDetails]
  }
  
  extension [Self <: ExternalDocServiceErrorDetails](x: Self) {
    
    inline def setAuthenticationUrl(value: String): Self = StObject.set(x, "authenticationUrl", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationUrlUndefined: Self = StObject.set(x, "authenticationUrl", js.undefined)
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
