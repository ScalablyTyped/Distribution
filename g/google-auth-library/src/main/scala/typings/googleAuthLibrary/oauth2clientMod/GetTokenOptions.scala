package typings.googleAuthLibrary.oauth2clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTokenOptions extends StObject {
  
  /**
    * The client ID for your application. The value passed into the constructor
    * will be used if not provided. Must match any client_id option passed to
    * a corresponding call to generateAuthUrl.
    */
  var client_id: js.UndefOr[String] = js.undefined
  
  var code: String
  
  var codeVerifier: js.UndefOr[String] = js.undefined
  
  /**
    * Determines where the API server redirects the user after the user
    * completes the authorization flow. The value passed into the constructor
    * will be used if not provided. Must match any redirect_uri option passed to
    * a corresponding call to generateAuthUrl.
    */
  var redirect_uri: js.UndefOr[String] = js.undefined
}
object GetTokenOptions {
  
  inline def apply(code: String): GetTokenOptions = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTokenOptions]
  }
  
  extension [Self <: GetTokenOptions](x: Self) {
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeVerifier(value: String): Self = StObject.set(x, "codeVerifier", value.asInstanceOf[js.Any])
    
    inline def setCodeVerifierUndefined: Self = StObject.set(x, "codeVerifier", js.undefined)
    
    inline def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
    
    inline def setRedirect_uriUndefined: Self = StObject.set(x, "redirect_uri", js.undefined)
  }
}
