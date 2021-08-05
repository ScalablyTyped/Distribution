package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Client or application specific settings provided on the FHIR server during the client/application registration.
  */
trait OAuth2ClientSettings extends StObject {
  
  /**
    * Unique ID representing the client or application
    */
  var client_id: String
  
  /**
    * URI to which the code is sent via query string during the OAuth2 authorization workflow. Defaults to the applications base url.
    */
  var redirect_uri: js.UndefOr[String] = js.undefined
  
  /**
    * Scopes based on the access required by the application
    */
  var scope: js.UndefOr[String] = js.undefined
  
  /**
    * If the application registered is a confidential application, the client_secret needs to be provided during the Token workflow. (Not recommended for public applications)
    */
  var secret: js.UndefOr[String] = js.undefined
  
  /**
    * Override the state parameter set by the SMART JS Client library. The library generates a random string as state.
    */
  var state: js.UndefOr[String] = js.undefined
}
object OAuth2ClientSettings {
  
  inline def apply(client_id: String): OAuth2ClientSettings = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2ClientSettings]
  }
  
  extension [Self <: OAuth2ClientSettings](x: Self) {
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
    
    inline def setRedirect_uriUndefined: Self = StObject.set(x, "redirect_uri", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
