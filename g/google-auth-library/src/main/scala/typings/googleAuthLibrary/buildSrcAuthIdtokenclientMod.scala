package typings.googleAuthLibrary

import typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.OAuth2Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAuthIdtokenclientMod {
  
  @JSImport("google-auth-library/build/src/auth/idtokenclient", "IdTokenClient")
  @js.native
  open class IdTokenClient protected () extends OAuth2Client {
    /**
      * Google ID Token client
      *
      * Retrieve access token from the metadata server.
      * See: https://developers.google.com/compute/docs/authentication
      */
    def this(options: IdTokenOptions) = this()
    
    /* private */ var getIdTokenExpiryDate: Any = js.native
    
    var idTokenProvider: IdTokenProvider = js.native
    
    var targetAudience: String = js.native
  }
  
  trait IdTokenOptions extends StObject {
    
    /**
      * The client to make the request to fetch an ID token.
      */
    var idTokenProvider: IdTokenProvider
    
    /**
      * The audience to use when requesting an ID token.
      */
    var targetAudience: String
  }
  object IdTokenOptions {
    
    inline def apply(idTokenProvider: IdTokenProvider, targetAudience: String): IdTokenOptions = {
      val __obj = js.Dynamic.literal(idTokenProvider = idTokenProvider.asInstanceOf[js.Any], targetAudience = targetAudience.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdTokenOptions]
    }
    
    extension [Self <: IdTokenOptions](x: Self) {
      
      inline def setIdTokenProvider(value: IdTokenProvider): Self = StObject.set(x, "idTokenProvider", value.asInstanceOf[js.Any])
      
      inline def setTargetAudience(value: String): Self = StObject.set(x, "targetAudience", value.asInstanceOf[js.Any])
    }
  }
  
  trait IdTokenProvider extends StObject {
    
    def fetchIdToken(targetAudience: String): js.Promise[String]
  }
  object IdTokenProvider {
    
    inline def apply(fetchIdToken: String => js.Promise[String]): IdTokenProvider = {
      val __obj = js.Dynamic.literal(fetchIdToken = js.Any.fromFunction1(fetchIdToken))
      __obj.asInstanceOf[IdTokenProvider]
    }
    
    extension [Self <: IdTokenProvider](x: Self) {
      
      inline def setFetchIdToken(value: String => js.Promise[String]): Self = StObject.set(x, "fetchIdToken", js.Any.fromFunction1(value))
    }
  }
}
