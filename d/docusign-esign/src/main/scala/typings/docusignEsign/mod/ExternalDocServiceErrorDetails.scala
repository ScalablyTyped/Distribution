package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalDocServiceErrorDetails extends StObject {
  
  /**
    * Reserved: TBD
    */
  var authenticationUrl: js.UndefOr[String] = js.native
  
  /**
    * A code associated with the error condition.
    */
  var errorCode: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
}
object ExternalDocServiceErrorDetails {
  
  @scala.inline
  def apply(): ExternalDocServiceErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalDocServiceErrorDetails]
  }
  
  @scala.inline
  implicit class ExternalDocServiceErrorDetailsMutableBuilder[Self <: ExternalDocServiceErrorDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationUrl(value: String): Self = StObject.set(x, "authenticationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationUrlUndefined: Self = StObject.set(x, "authenticationUrl", js.undefined)
    
    @scala.inline
    def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
