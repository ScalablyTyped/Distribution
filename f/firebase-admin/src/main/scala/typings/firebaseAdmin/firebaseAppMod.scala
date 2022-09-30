package typings.firebaseAdmin

import typings.firebaseAdmin.credentialMod.Credential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseAppMod {
  
  @JSImport("firebase-admin/lib/app/firebase-app", "FirebaseAppInternals")
  @js.native
  open class FirebaseAppInternals protected () extends StObject {
    def this(credential_ : Credential) = this()
    
    /**
      * Adds a listener that is called each time a token changes.
      *
      * @param listener - The listener that will be called with each new token.
      */
    def addAuthTokenListener(listener: js.Function1[/* token */ String, Unit]): Unit = js.native
    
    /* private */ var cachedToken_ : Any = js.native
    
    /* private */ var credential_ : Any = js.native
    
    def getCachedToken(): FirebaseAccessToken | Null = js.native
    
    def getToken(): js.Promise[FirebaseAccessToken] = js.native
    def getToken(forceRefresh: Boolean): js.Promise[FirebaseAccessToken] = js.native
    
    /* private */ var refreshToken: Any = js.native
    
    /**
      * Removes a token listener.
      *
      * @param listener - The listener to remove.
      */
    def removeAuthTokenListener(listener: js.Function1[/* token */ String, Unit]): Unit = js.native
    
    /* private */ var shouldRefresh: Any = js.native
    
    /* private */ var tokenListeners_ : Any = js.native
  }
  
  trait FirebaseAccessToken extends StObject {
    
    var accessToken: String
    
    var expirationTime: Double
  }
  object FirebaseAccessToken {
    
    inline def apply(accessToken: String, expirationTime: Double): FirebaseAccessToken = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseAccessToken]
    }
    
    extension [Self <: FirebaseAccessToken](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setExpirationTime(value: Double): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    }
  }
}
