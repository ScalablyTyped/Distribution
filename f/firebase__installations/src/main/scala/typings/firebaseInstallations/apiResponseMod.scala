package typings.firebaseInstallations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiResponseMod {
  
  @js.native
  trait CreateInstallationResponse extends StObject {
    
    val authToken: GenerateAuthTokenResponse = js.native
    
    val fid: js.UndefOr[String] = js.native
    
    val refreshToken: String = js.native
  }
  object CreateInstallationResponse {
    
    @scala.inline
    def apply(authToken: GenerateAuthTokenResponse, refreshToken: String): CreateInstallationResponse = {
      val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateInstallationResponse]
    }
    
    @scala.inline
    implicit class CreateInstallationResponseMutableBuilder[Self <: CreateInstallationResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthToken(value: GenerateAuthTokenResponse): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFid(value: String): Self = StObject.set(x, "fid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFidUndefined: Self = StObject.set(x, "fid", js.undefined)
      
      @scala.inline
      def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GenerateAuthTokenResponse extends StObject {
    
    /**
      * Encoded as a string with the suffix 's' (indicating seconds), preceded by
      * the number of seconds.
      *
      * Example: "604800s".
      */
    val expiresIn: String = js.native
    
    val token: String = js.native
  }
  object GenerateAuthTokenResponse {
    
    @scala.inline
    def apply(expiresIn: String, token: String): GenerateAuthTokenResponse = {
      val __obj = js.Dynamic.literal(expiresIn = expiresIn.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateAuthTokenResponse]
    }
    
    @scala.inline
    implicit class GenerateAuthTokenResponseMutableBuilder[Self <: GenerateAuthTokenResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
