package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * OAuth2 Provider information. If provided during the Authorize call, the library skips the conformance statement introspection
  */
trait OAuth2Provider extends StObject {
  
  /**
    * Description about the provider
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Unique name for the provider
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The OAuth2 endpoints (Registration URI, Authorize URI, Token URI)
    */
  var oauth2: js.UndefOr[OAuth2Endpoints] = js.undefined
  
  /**
    * FHIR Service URL
    */
  var url: String
}
object OAuth2Provider {
  
  @scala.inline
  def apply(url: String): OAuth2Provider = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2Provider]
  }
  
  @scala.inline
  implicit class OAuth2ProviderMutableBuilder[Self <: OAuth2Provider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOauth2(value: OAuth2Endpoints): Self = StObject.set(x, "oauth2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth2Undefined: Self = StObject.set(x, "oauth2", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
