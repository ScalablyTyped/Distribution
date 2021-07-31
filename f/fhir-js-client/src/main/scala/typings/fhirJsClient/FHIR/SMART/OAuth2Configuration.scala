package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * OAuth2 Configuration of the SMART on FHIR Server
  */
trait OAuth2Configuration extends StObject {
  
  /**
    * Client or application specific settings provided on the FHIR server during the client/application registration.
    */
  var client: js.UndefOr[OAuth2ClientSettings] = js.undefined
  
  /**
    * Fake Access Token Response. Should contain the patient property to set the patient context.
    */
  var fake_token_response: js.UndefOr[js.Any] = js.undefined
  
  /**
    * OAuth2 Provider information. If provided during the Authorize call, the library skips the conformance statement introspection
    */
  var provider: js.UndefOr[OAuth2Provider] = js.undefined
  
  /**
    * Set the response type based on the Authorization Grant eg. code(Authorization Code Grant), token(Implicit Grant)
    */
  var response_type: js.UndefOr[String] = js.undefined
  
  /**
    * FHIR Service URL
    */
  var server: js.UndefOr[String] = js.undefined
}
object OAuth2Configuration {
  
  @scala.inline
  def apply(): OAuth2Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuth2Configuration]
  }
  
  @scala.inline
  implicit class OAuth2ConfigurationMutableBuilder[Self <: OAuth2Configuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: OAuth2ClientSettings): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    @scala.inline
    def setFake_token_response(value: js.Any): Self = StObject.set(x, "fake_token_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFake_token_responseUndefined: Self = StObject.set(x, "fake_token_response", js.undefined)
    
    @scala.inline
    def setProvider(value: OAuth2Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    @scala.inline
    def setResponse_type(value: String): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
    
    @scala.inline
    def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
