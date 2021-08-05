package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The OAuth2 endpoints (Registration URI, Authorize URI, Token URI)
  */
trait OAuth2Endpoints extends StObject {
  
  /**
    * OAuth2 Authorize URI
    */
  var authorize_uri: js.UndefOr[String] = js.undefined
  
  /**
    * OAuth2 Registration URI
    */
  var registration_uri: js.UndefOr[String] = js.undefined
  
  /**
    * OAuth2 Token URI
    */
  var token_uri: js.UndefOr[String] = js.undefined
}
object OAuth2Endpoints {
  
  inline def apply(): OAuth2Endpoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuth2Endpoints]
  }
  
  extension [Self <: OAuth2Endpoints](x: Self) {
    
    inline def setAuthorize_uri(value: String): Self = StObject.set(x, "authorize_uri", value.asInstanceOf[js.Any])
    
    inline def setAuthorize_uriUndefined: Self = StObject.set(x, "authorize_uri", js.undefined)
    
    inline def setRegistration_uri(value: String): Self = StObject.set(x, "registration_uri", value.asInstanceOf[js.Any])
    
    inline def setRegistration_uriUndefined: Self = StObject.set(x, "registration_uri", js.undefined)
    
    inline def setToken_uri(value: String): Self = StObject.set(x, "token_uri", value.asInstanceOf[js.Any])
    
    inline def setToken_uriUndefined: Self = StObject.set(x, "token_uri", js.undefined)
  }
}
