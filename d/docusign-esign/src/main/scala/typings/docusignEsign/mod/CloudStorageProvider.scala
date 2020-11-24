package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudStorageProvider extends js.Object {
  
  /**
    * The authentication URL used for the cloud storage provider. This information is only included in the response if the user has not passed authentication
    * for the cloud storage provider. If the redirectUrl query string is provided, the returnUrl is appended to the authenticationUrl.
    */
  var authenticationUrl: js.UndefOr[String] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * The URL the user is redirected to after the cloud storage provider authenticates the user. Using this will append the redirectUrl to the authenticationUrl.
    *
    * The redirectUrl is restricted to URLs in the docusign.com or docusign.net domains.
    */
  var redirectUrl: js.UndefOr[String] = js.native
  
  /**
    * The service name for the cloud storage provider.
    */
  var service: js.UndefOr[String] = js.native
  
  /**
    * The DocuSign-generated ID for the cloud storage provider.
    */
  var serviceId: js.UndefOr[String] = js.native
}
object CloudStorageProvider {
  
  @scala.inline
  def apply(): CloudStorageProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudStorageProvider]
  }
  
  @scala.inline
  implicit class CloudStorageProviderOps[Self <: CloudStorageProvider] (val x: Self) extends AnyVal {
    
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
    def setAuthenticationUrl(value: String): Self = this.set("authenticationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationUrl: Self = this.set("authenticationUrl", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setRedirectUrl(value: String): Self = this.set("redirectUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectUrl: Self = this.set("redirectUrl", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    
    @scala.inline
    def setServiceId(value: String): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceId: Self = this.set("serviceId", js.undefined)
  }
}
