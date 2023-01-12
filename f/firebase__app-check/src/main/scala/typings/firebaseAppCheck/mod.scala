package typings.firebaseAppCheck

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseUtil.mod.PartialObserver
import typings.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/app-check", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/app-check", "CustomProvider")
  @js.native
  open class CustomProvider protected ()
    extends StObject
       with AppCheckProvider {
    def this(_customProviderOptions: CustomProviderOptions) = this()
    
    /* private */ var _app: Any = js.native
    
    /* private */ var _customProviderOptions: Any = js.native
  }
  
  @JSImport("@firebase/app-check", "ReCaptchaEnterpriseProvider")
  @js.native
  open class ReCaptchaEnterpriseProvider protected ()
    extends StObject
       with AppCheckProvider {
    /**
      * Create a ReCaptchaEnterpriseProvider instance.
      * @param siteKey - reCAPTCHA Enterprise score-based site key.
      */
    def this(_siteKey: String) = this()
    
    /* private */ var _app: Any = js.native
    
    /* private */ var _heartbeatServiceProvider: Any = js.native
    
    /* private */ var _siteKey: Any = js.native
    
    /**
      * Throttle requests on certain error codes to prevent too many retries
      * in a short time.
      */
    /* private */ var _throttleData: Any = js.native
  }
  
  @JSImport("@firebase/app-check", "ReCaptchaV3Provider")
  @js.native
  open class ReCaptchaV3Provider protected ()
    extends StObject
       with AppCheckProvider {
    /**
      * Create a ReCaptchaV3Provider instance.
      * @param siteKey - ReCAPTCHA V3 siteKey.
      */
    def this(_siteKey: String) = this()
    
    /* private */ var _app: Any = js.native
    
    /* private */ var _heartbeatServiceProvider: Any = js.native
    
    /* private */ var _siteKey: Any = js.native
    
    /**
      * Throttle requests on certain error codes to prevent too many retries
      * in a short time.
      */
    /* private */ var _throttleData: Any = js.native
  }
  
  inline def getToken(appCheckInstance: AppCheck): js.Promise[AppCheckTokenResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(appCheckInstance.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AppCheckTokenResult]]
  inline def getToken(appCheckInstance: AppCheck, forceRefresh: Boolean): js.Promise[AppCheckTokenResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(appCheckInstance.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AppCheckTokenResult]]
  
  inline def initializeAppCheck(app: Unit, options: AppCheckOptions): AppCheck = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeAppCheck")(app.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AppCheck]
  inline def initializeAppCheck(app: FirebaseApp, options: AppCheckOptions): AppCheck = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeAppCheck")(app.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AppCheck]
  
  inline def onTokenChanged(appCheckInstance: AppCheck, observer: PartialObserver[AppCheckTokenResult]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onTokenChanged")(appCheckInstance.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onTokenChanged(appCheckInstance: AppCheck, onNext: js.Function1[/* tokenResult */ AppCheckTokenResult, Unit]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onTokenChanged")(appCheckInstance.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onTokenChanged(
    appCheckInstance: AppCheck,
    onNext: js.Function1[/* tokenResult */ AppCheckTokenResult, Unit],
    onError: js.Function1[/* error */ js.Error, Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onTokenChanged")(appCheckInstance.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onTokenChanged(
    appCheckInstance: AppCheck,
    onNext: js.Function1[/* tokenResult */ AppCheckTokenResult, Unit],
    onError: js.Function1[/* error */ js.Error, Unit],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onTokenChanged")(appCheckInstance.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onTokenChanged(
    appCheckInstance: AppCheck,
    onNext: js.Function1[/* tokenResult */ AppCheckTokenResult, Unit],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onTokenChanged")(appCheckInstance.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def setTokenAutoRefreshEnabled(appCheckInstance: AppCheck, isTokenAutoRefreshEnabled: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTokenAutoRefreshEnabled")(appCheckInstance.asInstanceOf[js.Any], isTokenAutoRefreshEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  
  trait AppCheckProvider extends StObject
  
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
  
  trait AppCheckTokenInternal
    extends StObject
       with AppCheckToken {
    
    var issuedAtTimeMillis: Double
  }
  object AppCheckTokenInternal {
    
    inline def apply(expireTimeMillis: Double, issuedAtTimeMillis: Double, token: String): AppCheckTokenInternal = {
      val __obj = js.Dynamic.literal(expireTimeMillis = expireTimeMillis.asInstanceOf[js.Any], issuedAtTimeMillis = issuedAtTimeMillis.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppCheckTokenInternal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppCheckTokenInternal] (val x: Self) extends AnyVal {
      
      inline def setIssuedAtTimeMillis(value: Double): Self = StObject.set(x, "issuedAtTimeMillis", value.asInstanceOf[js.Any])
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
