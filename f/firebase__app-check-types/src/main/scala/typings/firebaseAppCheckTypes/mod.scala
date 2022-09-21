package typings.firebaseAppCheckTypes

import typings.firebaseAppCheckTypes.firebaseAppCheckTypesStrings.appCheck
import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseUtil.mod.PartialObserver
import typings.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/app-check-types", "CustomProvider")
  @js.native
  open class CustomProvider protected () extends StObject {
    /**
      * @param options - Options for creating the custom provider.
      */
    def this(options: CustomProviderOptions) = this()
  }
  
  @JSImport("@firebase/app-check-types", "ReCaptchaV3Provider")
  @js.native
  open class ReCaptchaV3Provider protected () extends StObject {
    /**
      * @param siteKey - ReCAPTCHA v3 site key (public key).
      */
    def this(siteKey: String) = this()
  }
  
  type AppCheckComponentName = appCheck
  
  /**
    * An App Check provider. This can be either the built-in reCAPTCHA provider
    * or a custom provider. For more on custom providers, see
    * https://firebase.google.com/docs/app-check/web-custom-provider
    */
  trait AppCheckProvider extends StObject {
    
    /**
      * Returns an AppCheck token.
      */
    def getToken(): js.Promise[AppCheckToken]
  }
  object AppCheckProvider {
    
    inline def apply(getToken: () => js.Promise[AppCheckToken]): AppCheckProvider = {
      val __obj = js.Dynamic.literal(getToken = js.Any.fromFunction0(getToken))
      __obj.asInstanceOf[AppCheckProvider]
    }
    
    extension [Self <: AppCheckProvider](x: Self) {
      
      inline def setGetToken(value: () => js.Promise[AppCheckToken]): Self = StObject.set(x, "getToken", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * The token returned from an `AppCheckProvider`.
    */
  trait AppCheckToken extends StObject {
    
    /**
      * The local timestamp after which the token will expire.
      */
    val expireTimeMillis: Double
    
    /**
      * The token string in JWT format.
      */
    val token: String
  }
  object AppCheckToken {
    
    inline def apply(expireTimeMillis: Double, token: String): AppCheckToken = {
      val __obj = js.Dynamic.literal(expireTimeMillis = expireTimeMillis.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppCheckToken]
    }
    
    extension [Self <: AppCheckToken](x: Self) {
      
      inline def setExpireTimeMillis(value: Double): Self = StObject.set(x, "expireTimeMillis", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Result returned by `getToken()`.
    */
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
    
    extension [Self <: AppCheckTokenResult](x: Self) {
      
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
    
    extension [Self <: CustomProviderOptions](x: Self) {
      
      inline def setGetToken(value: () => js.Promise[AppCheckToken]): Self = StObject.set(x, "getToken", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait FirebaseAppCheck extends StObject {
    
    /**
      * Activate AppCheck
      * @param siteKeyOrProvider - reCAPTCHA sitekey or custom token provider
      * @param isTokenAutoRefreshEnabled - If true, enables SDK to automatically
      * refresh AppCheck token as needed. If undefined, the value will default
      * to the value of `app.automaticDataCollectionEnabled`. That property
      * defaults to false and can be set in the app config.
      */
    def activate(siteKeyOrProvider: String): Unit = js.native
    def activate(siteKeyOrProvider: String, isTokenAutoRefreshEnabled: Boolean): Unit = js.native
    def activate(siteKeyOrProvider: AppCheckProvider): Unit = js.native
    def activate(siteKeyOrProvider: AppCheckProvider, isTokenAutoRefreshEnabled: Boolean): Unit = js.native
    def activate(siteKeyOrProvider: CustomProvider): Unit = js.native
    def activate(siteKeyOrProvider: CustomProvider, isTokenAutoRefreshEnabled: Boolean): Unit = js.native
    def activate(siteKeyOrProvider: ReCaptchaV3Provider): Unit = js.native
    def activate(siteKeyOrProvider: ReCaptchaV3Provider, isTokenAutoRefreshEnabled: Boolean): Unit = js.native
    
    /** The `FirebaseApp` associated with this instance. */
    var app: FirebaseApp = js.native
    
    /**
      * Get the current App Check token. Attaches to the most recent
      * in-flight request if one is present. Returns null if no token
      * is present and no token requests are in flight.
      *
      * @param forceRefresh - If true, will always try to fetch a fresh token.
      * If false, will use a cached token if found in storage.
      */
    def getToken(): js.Promise[AppCheckTokenResult] = js.native
    def getToken(forceRefresh: Boolean): js.Promise[AppCheckTokenResult] = js.native
    
    /**
      * Registers a listener to changes in the token state. There can be more
      * than one listener registered at the same time for one or more
      * App Check instances. The listeners call back on the UI thread whenever
      * the current token associated with this App Check instance changes.
      *
      * @returns A function that unsubscribes this listener.
      */
    def onTokenChanged(observer: PartialObserver[AppCheckTokenResult]): Unsubscribe = js.native
    /**
      * Registers a listener to changes in the token state. There can be more
      * than one listener registered at the same time for one or more
      * App Check instances. The listeners call back on the UI thread whenever
      * the current token associated with this App Check instance changes.
      *
      * @returns A function that unsubscribes this listener.
      */
    def onTokenChanged(onNext: js.Function1[/* tokenResult */ AppCheckTokenResult, Unit]): Unsubscribe = js.native
    def onTokenChanged(
      onNext: js.Function1[/* tokenResult */ AppCheckTokenResult, Unit],
      onError: js.Function1[/* error */ js.Error, Unit]
    ): Unsubscribe = js.native
    def onTokenChanged(
      onNext: js.Function1[/* tokenResult */ AppCheckTokenResult, Unit],
      onError: js.Function1[/* error */ js.Error, Unit],
      onCompletion: js.Function0[Unit]
    ): Unsubscribe = js.native
    def onTokenChanged(
      onNext: js.Function1[/* tokenResult */ AppCheckTokenResult, Unit],
      onError: Unit,
      onCompletion: js.Function0[Unit]
    ): Unsubscribe = js.native
    
    /**
      *
      * @param isTokenAutoRefreshEnabled - If true, the SDK automatically
      * refreshes App Check tokens as needed. This overrides any value set
      * during `activate()`.
      */
    def setTokenAutoRefreshEnabled(isTokenAutoRefreshEnabled: Boolean): Unit = js.native
  }
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var `appCheck-compat`: FirebaseAppCheck
    }
    object NameServiceMapping {
      
      inline def apply(`appCheck-compat`: FirebaseAppCheck): NameServiceMapping = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("appCheck-compat")(`appCheck-compat`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def `setAppCheck-compat`(value: FirebaseAppCheck): Self = StObject.set(x, "appCheck-compat", value.asInstanceOf[js.Any])
      }
    }
  }
}
