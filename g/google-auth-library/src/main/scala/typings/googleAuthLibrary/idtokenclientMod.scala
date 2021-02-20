package typings.googleAuthLibrary

import typings.googleAuthLibrary.oauth2clientMod.OAuth2Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idtokenclientMod {
  
  @JSImport("google-auth-library/build/src/auth/idtokenclient", "IdTokenClient")
  @js.native
  class IdTokenClient protected () extends OAuth2Client {
    /**
      * Google ID Token client
      *
      * Retrieve access token from the metadata server.
      * See: https://developers.google.com/compute/docs/authentication
      */
    def this(options: IdTokenOptions) = this()
    
    var getIdTokenExpiryDate: js.Any = js.native
    
    var idTokenProvider: IdTokenProvider = js.native
    
    var targetAudience: String = js.native
  }
  
  @js.native
  trait IdTokenOptions extends StObject {
    
    /**
      * The client to make the request to fetch an ID token.
      */
    var idTokenProvider: IdTokenProvider = js.native
    
    /**
      * The audience to use when requesting an ID token.
      */
    var targetAudience: String = js.native
  }
  object IdTokenOptions {
    
    @scala.inline
    def apply(idTokenProvider: IdTokenProvider, targetAudience: String): IdTokenOptions = {
      val __obj = js.Dynamic.literal(idTokenProvider = idTokenProvider.asInstanceOf[js.Any], targetAudience = targetAudience.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdTokenOptions]
    }
    
    @scala.inline
    implicit class IdTokenOptionsMutableBuilder[Self <: IdTokenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdTokenProvider(value: IdTokenProvider): Self = StObject.set(x, "idTokenProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetAudience(value: String): Self = StObject.set(x, "targetAudience", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IdTokenProvider extends StObject {
    
    def fetchIdToken(targetAudience: String): js.Promise[String] = js.native
  }
  object IdTokenProvider {
    
    @scala.inline
    def apply(fetchIdToken: String => js.Promise[String]): IdTokenProvider = {
      val __obj = js.Dynamic.literal(fetchIdToken = js.Any.fromFunction1(fetchIdToken))
      __obj.asInstanceOf[IdTokenProvider]
    }
    
    @scala.inline
    implicit class IdTokenProviderMutableBuilder[Self <: IdTokenProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetchIdToken(value: String => js.Promise[String]): Self = StObject.set(x, "fetchIdToken", js.Any.fromFunction1(value))
    }
  }
}
