package typings.googleAuthLibrary.oauth2clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeVerifierResults extends StObject {
  
  /**
    * The code_challenge that should be sent with the `generateAuthUrl` call
    * to obtain a verifiable authentication url.
    */
  var codeChallenge: js.UndefOr[String] = js.undefined
  
  /**
    * The code verifier that will be used when calling `getToken` to obtain a new
    * access token.
    */
  var codeVerifier: String
}
object CodeVerifierResults {
  
  inline def apply(codeVerifier: String): CodeVerifierResults = {
    val __obj = js.Dynamic.literal(codeVerifier = codeVerifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeVerifierResults]
  }
  
  extension [Self <: CodeVerifierResults](x: Self) {
    
    inline def setCodeChallenge(value: String): Self = StObject.set(x, "codeChallenge", value.asInstanceOf[js.Any])
    
    inline def setCodeChallengeUndefined: Self = StObject.set(x, "codeChallenge", js.undefined)
    
    inline def setCodeVerifier(value: String): Self = StObject.set(x, "codeVerifier", value.asInstanceOf[js.Any])
  }
}
