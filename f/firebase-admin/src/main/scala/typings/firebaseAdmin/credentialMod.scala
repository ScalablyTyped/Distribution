package typings.firebaseAdmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object credentialMod {
  
  trait Credential extends StObject {
    
    /**
      * Returns a Google OAuth2 access token object used to authenticate with
      * Firebase services.
      *
      * @returns A Google OAuth2 access token object.
      */
    def getAccessToken(): js.Promise[GoogleOAuthAccessToken]
  }
  object Credential {
    
    inline def apply(getAccessToken: () => js.Promise[GoogleOAuthAccessToken]): Credential = {
      val __obj = js.Dynamic.literal(getAccessToken = js.Any.fromFunction0(getAccessToken))
      __obj.asInstanceOf[Credential]
    }
    
    extension [Self <: Credential](x: Self) {
      
      inline def setGetAccessToken(value: () => js.Promise[GoogleOAuthAccessToken]): Self = StObject.set(x, "getAccessToken", js.Any.fromFunction0(value))
    }
  }
  
  trait GoogleOAuthAccessToken extends StObject {
    
    var access_token: String
    
    var expires_in: Double
  }
  object GoogleOAuthAccessToken {
    
    inline def apply(access_token: String, expires_in: Double): GoogleOAuthAccessToken = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoogleOAuthAccessToken]
    }
    
    extension [Self <: GoogleOAuthAccessToken](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceAccount extends StObject {
    
    var clientEmail: js.UndefOr[String] = js.undefined
    
    var privateKey: js.UndefOr[String] = js.undefined
    
    var projectId: js.UndefOr[String] = js.undefined
  }
  object ServiceAccount {
    
    inline def apply(): ServiceAccount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceAccount]
    }
    
    extension [Self <: ServiceAccount](x: Self) {
      
      inline def setClientEmail(value: String): Self = StObject.set(x, "clientEmail", value.asInstanceOf[js.Any])
      
      inline def setClientEmailUndefined: Self = StObject.set(x, "clientEmail", js.undefined)
      
      inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    }
  }
}
