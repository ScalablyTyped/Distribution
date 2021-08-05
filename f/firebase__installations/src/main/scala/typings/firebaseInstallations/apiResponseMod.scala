package typings.firebaseInstallations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiResponseMod {
  
  trait CreateInstallationResponse extends StObject {
    
    val authToken: GenerateAuthTokenResponse
    
    val fid: js.UndefOr[String] = js.undefined
    
    val refreshToken: String
  }
  object CreateInstallationResponse {
    
    inline def apply(authToken: GenerateAuthTokenResponse, refreshToken: String): CreateInstallationResponse = {
      val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateInstallationResponse]
    }
    
    extension [Self <: CreateInstallationResponse](x: Self) {
      
      inline def setAuthToken(value: GenerateAuthTokenResponse): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      inline def setFid(value: String): Self = StObject.set(x, "fid", value.asInstanceOf[js.Any])
      
      inline def setFidUndefined: Self = StObject.set(x, "fid", js.undefined)
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait GenerateAuthTokenResponse extends StObject {
    
    /**
      * Encoded as a string with the suffix 's' (indicating seconds), preceded by
      * the number of seconds.
      *
      * Example: "604800s".
      */
    val expiresIn: String
    
    val token: String
  }
  object GenerateAuthTokenResponse {
    
    inline def apply(expiresIn: String, token: String): GenerateAuthTokenResponse = {
      val __obj = js.Dynamic.literal(expiresIn = expiresIn.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateAuthTokenResponse]
    }
    
    extension [Self <: GenerateAuthTokenResponse](x: Self) {
      
      inline def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
