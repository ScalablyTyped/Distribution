package typings.firebaseAdmin.libAuthAuthConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthResponseType extends StObject {
  
  /**
    * Whether authorization code is returned from IdP's authorization endpoint.
    */
  var code: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether ID token is returned from IdP's authorization endpoint.
    */
  var idToken: js.UndefOr[Boolean] = js.undefined
}
object OAuthResponseType {
  
  inline def apply(): OAuthResponseType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthResponseType]
  }
  
  extension [Self <: OAuthResponseType](x: Self) {
    
    inline def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setIdToken(value: Boolean): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
  }
}
