package typings.firebaseAppCheck

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAppCheck.distSrcProvidersMod.CustomProvider
import typings.firebaseAppCheck.distSrcProvidersMod.ReCaptchaEnterpriseProvider
import typings.firebaseAppCheck.distSrcProvidersMod.ReCaptchaV3Provider
import typings.firebaseAppCheck.firebaseAppCheckStrings.`app-check`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPublicTypesMod {
  
  trait AppCheck extends StObject {
    
    /**
      * The {@link @firebase/app#FirebaseApp} this `AppCheck` instance is associated with.
      */
    var app: FirebaseApp
  }
  object AppCheck {
    
    inline def apply(app: FirebaseApp): AppCheck = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppCheck]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppCheck] (val x: Self) extends AnyVal {
      
      inline def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    }
  }
  
  type AppCheckComponentName = `app-check`
  
  trait AppCheckOptions extends StObject {
    
    /**
      * If set to true, enables automatic background refresh of App Check token.
      */
    var isTokenAutoRefreshEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A reCAPTCHA V3 provider, reCAPTCHA Enterprise provider, or custom provider.
      */
    var provider: CustomProvider | ReCaptchaV3Provider | ReCaptchaEnterpriseProvider
  }
  object AppCheckOptions {
    
    inline def apply(provider: CustomProvider | ReCaptchaV3Provider | ReCaptchaEnterpriseProvider): AppCheckOptions = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppCheckOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppCheckOptions] (val x: Self) extends AnyVal {
      
      inline def setIsTokenAutoRefreshEnabled(value: Boolean): Self = StObject.set(x, "isTokenAutoRefreshEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsTokenAutoRefreshEnabledUndefined: Self = StObject.set(x, "isTokenAutoRefreshEnabled", js.undefined)
      
      inline def setProvider(value: CustomProvider | ReCaptchaV3Provider | ReCaptchaEnterpriseProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppCheckToken extends StObject {
    
    /**
      * The local timestamp after which the token will expire.
      */
    val expireTimeMillis: Double
    
    val token: String
  }
  object AppCheckToken {
    
    inline def apply(expireTimeMillis: Double, token: String): AppCheckToken = {
      val __obj = js.Dynamic.literal(expireTimeMillis = expireTimeMillis.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppCheckToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppCheckToken] (val x: Self) extends AnyVal {
      
      inline def setExpireTimeMillis(value: Double): Self = StObject.set(x, "expireTimeMillis", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  type AppCheckTokenListener = js.Function1[/* token */ AppCheckTokenResult, Unit]
  
  trait AppCheckTokenResult extends StObject {
    
    /**
      * The token string in JWT format.
      */
    val token: String
  }
  object AppCheckTokenResult {
    
    inline def apply(token: String): AppCheckTokenResult = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppCheckTokenResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppCheckTokenResult] (val x: Self) extends AnyVal {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomProviderOptions extends StObject {
    
    /**
      * Function to get an App Check token through a custom provider
      * service.
      */
    def getToken(): js.Promise[AppCheckToken]
  }
  object CustomProviderOptions {
    
    inline def apply(getToken: () => js.Promise[AppCheckToken]): CustomProviderOptions = {
      val __obj = js.Dynamic.literal(getToken = js.Any.fromFunction0(getToken))
      __obj.asInstanceOf[CustomProviderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomProviderOptions] (val x: Self) extends AnyVal {
      
      inline def setGetToken(value: () => js.Promise[AppCheckToken]): Self = StObject.set(x, "getToken", js.Any.fromFunction0(value))
    }
  }
}
