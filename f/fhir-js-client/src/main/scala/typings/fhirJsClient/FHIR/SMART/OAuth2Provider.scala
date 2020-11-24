package typings.fhirJsClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * OAuth2 Provider information. If provided during the Authorize call, the library skips the conformance statement introspection
  */
@js.native
trait OAuth2Provider extends js.Object {
  
  /**
    * Description about the provider
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Unique name for the provider
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The OAuth2 endpoints (Registration URI, Authorize URI, Token URI)
    */
  var oauth2: js.UndefOr[OAuth2Endpoints] = js.native
  
  /**
    * FHIR Service URL
    */
  var url: String = js.native
}
object OAuth2Provider {
  
  @scala.inline
  def apply(url: String): OAuth2Provider = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2Provider]
  }
  
  @scala.inline
  implicit class OAuth2ProviderOps[Self <: OAuth2Provider] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOauth2(value: OAuth2Endpoints): Self = this.set("oauth2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth2: Self = this.set("oauth2", js.undefined)
  }
}
