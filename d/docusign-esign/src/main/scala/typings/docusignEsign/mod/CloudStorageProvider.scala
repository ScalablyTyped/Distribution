package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudStorageProvider extends StObject {
  
  /**
    * The authentication URL used for the cloud storage provider. This information is only included in the response if the user has not passed authentication
    * for the cloud storage provider. If the redirectUrl query string is provided, the returnUrl is appended to the authenticationUrl.
    */
  var authenticationUrl: js.UndefOr[String] = js.undefined
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * The URL the user is redirected to after the cloud storage provider authenticates the user. Using this will append the redirectUrl to the authenticationUrl.
    *
    * The redirectUrl is restricted to URLs in the docusign.com or docusign.net domains.
    */
  var redirectUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The service name for the cloud storage provider.
    */
  var service: js.UndefOr[String] = js.undefined
  
  /**
    * The DocuSign-generated ID for the cloud storage provider.
    */
  var serviceId: js.UndefOr[String] = js.undefined
}
object CloudStorageProvider {
  
  @scala.inline
  def apply(): CloudStorageProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudStorageProvider]
  }
  
  @scala.inline
  implicit class CloudStorageProviderMutableBuilder[Self <: CloudStorageProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationUrl(value: String): Self = StObject.set(x, "authenticationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationUrlUndefined: Self = StObject.set(x, "authenticationUrl", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
