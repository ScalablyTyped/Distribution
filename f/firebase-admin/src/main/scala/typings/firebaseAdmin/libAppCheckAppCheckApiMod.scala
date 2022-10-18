package typings.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAppCheckAppCheckApiMod {
  
  trait AppCheckToken extends StObject {
    
    /**
      * The Firebase App Check token.
      */
    var token: String
    
    /**
      * The time-to-live duration of the token in milliseconds.
      */
    var ttlMillis: Double
  }
  object AppCheckToken {
    
    inline def apply(token: String, ttlMillis: Double): AppCheckToken = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], ttlMillis = ttlMillis.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppCheckToken]
    }
    
    extension [Self <: AppCheckToken](x: Self) {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTtlMillis(value: Double): Self = StObject.set(x, "ttlMillis", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppCheckTokenOptions extends StObject {
    
    /**
      * The length of time, in milliseconds, for which the App Check token will
      * be valid. This value must be between 30 minutes and 7 days, inclusive.
      */
    var ttlMillis: js.UndefOr[Double] = js.undefined
  }
  object AppCheckTokenOptions {
    
    inline def apply(): AppCheckTokenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppCheckTokenOptions]
    }
    
    extension [Self <: AppCheckTokenOptions](x: Self) {
      
      inline def setTtlMillis(value: Double): Self = StObject.set(x, "ttlMillis", value.asInstanceOf[js.Any])
      
      inline def setTtlMillisUndefined: Self = StObject.set(x, "ttlMillis", js.undefined)
    }
  }
  
  trait DecodedAppCheckToken
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /**
      * The App ID corresponding to the App the App Check token belonged to.
      * This value is not actually one of the JWT token claims. It is added as a
      * convenience, and is set as the value of the {@link DecodedAppCheckToken.sub | sub} property.
      */
    var app_id: String
    
    /**
      * The audience for which this token is intended.
      * This value is a JSON array of two strings, the first is the project number of your
      * Firebase project, and the second is the project ID of the same project.
      */
    var aud: js.Array[String]
    
    /**
      * The App Check token's expiration time, in seconds since the Unix epoch. That is, the
      * time at which this App Check token expires and should no longer be considered valid.
      */
    var exp: Double
    
    /**
      * The App Check token's issued-at time, in seconds since the Unix epoch. That is, the
      * time at which this App Check token was issued and should start to be considered
      * valid.
      */
    var iat: Double
    
    /**
      * The issuer identifier for the issuer of the response.
      * This value is a URL with the format
      * `https://firebaseappcheck.googleapis.com/<PROJECT_NUMBER>`, where `<PROJECT_NUMBER>` is the
      * same project number specified in the {@link DecodedAppCheckToken.aud | aud} property.
      */
    var iss: String
    
    /**
      * The Firebase App ID corresponding to the app the token belonged to.
      * As a convenience, this value is copied over to the {@link DecodedAppCheckToken.app_id | app_id} property.
      */
    var sub: String
  }
  object DecodedAppCheckToken {
    
    inline def apply(app_id: String, aud: js.Array[String], exp: Double, iat: Double, iss: String, sub: String): DecodedAppCheckToken = {
      val __obj = js.Dynamic.literal(app_id = app_id.asInstanceOf[js.Any], aud = aud.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodedAppCheckToken]
    }
    
    extension [Self <: DecodedAppCheckToken](x: Self) {
      
      inline def setApp_id(value: String): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
      
      inline def setAud(value: js.Array[String]): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setAudVarargs(value: String*): Self = StObject.set(x, "aud", js.Array(value*))
      
      inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    }
  }
  
  trait VerifyAppCheckTokenResponse extends StObject {
    
    /**
      * The App ID corresponding to the App the App Check token belonged to.
      */
    var appId: String
    
    /**
      * The decoded Firebase App Check token.
      */
    var token: DecodedAppCheckToken
  }
  object VerifyAppCheckTokenResponse {
    
    inline def apply(appId: String, token: DecodedAppCheckToken): VerifyAppCheckTokenResponse = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyAppCheckTokenResponse]
    }
    
    extension [Self <: VerifyAppCheckTokenResponse](x: Self) {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setToken(value: DecodedAppCheckToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
