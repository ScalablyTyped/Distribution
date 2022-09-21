package typings.firebase.firebaseMod.firebase

import typings.firebase.anon.CompleteError
import typings.firebase.anon.GetToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @webonly
  */
object appCheck {
  
  @js.native
  trait AppCheck extends StObject {
    
    def activate(provider: String): Unit = js.native
    def activate(provider: String, isTokenAutoRefreshEnabled: Boolean): Unit = js.native
    def activate(provider: GetToken): Unit = js.native
    def activate(provider: GetToken, isTokenAutoRefreshEnabled: Boolean): Unit = js.native
    def activate(provider: AppCheckProvider): Unit = js.native
    def activate(provider: AppCheckProvider, isTokenAutoRefreshEnabled: Boolean): Unit = js.native
    def activate(provider: CustomProvider): Unit = js.native
    def activate(provider: CustomProvider, isTokenAutoRefreshEnabled: Boolean): Unit = js.native
    def activate(provider: ReCaptchaEnterpriseProvider): Unit = js.native
    def activate(provider: ReCaptchaEnterpriseProvider, isTokenAutoRefreshEnabled: Boolean): Unit = js.native
    /**
      * Activate AppCheck
      * @param provider This can be a `ReCaptchaV3Provider` instance,
      * a `ReCaptchaEnterpriseProvider` instance, a `CustomProvider` instance,
      * an object with a custom `getToken()` method, or a reCAPTCHA site key.
      * @param isTokenAutoRefreshEnabled If true, the SDK automatically
      * refreshes App Check tokens as needed. If undefined, defaults to the
      * value of `app.automaticDataCollectionEnabled`, which defaults to
      * false and can be set in the app config.
      */
    def activate(provider: ReCaptchaV3Provider): Unit = js.native
    def activate(provider: ReCaptchaV3Provider, isTokenAutoRefreshEnabled: Boolean): Unit = js.native
    
    /**
      * Get the current App Check token. Attaches to the most recent
      * in-flight request if one is present. Returns null if no token
      * is present and no token requests are in-flight.
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
      * @param observer An object with `next`, `error`, and `complete`
      * properties. `next` is called with an
      * {@link firebase.appCheck.AppCheckTokenResult `AppCheckTokenResult`}
      * whenever the token changes. `error` is optional and is called if an
      * error is thrown by the listener (the `next` function). `complete`
      * is unused, as the token stream is unending.
      *
      * @returns A function that unsubscribes this listener.
      */
    def onTokenChanged(observer: CompleteError): Unsubscribe = js.native
    /**
      * Registers a listener to changes in the token state. There can be more
      * than one listener registered at the same time for one or more
      * App Check instances. The listeners call back on the UI thread whenever
      * the current token associated with this App Check instance changes.
      *
      * @param onNext When the token changes, this function is called with aa
      * {@link firebase.appCheck.AppCheckTokenResult `AppCheckTokenResult`}.
      * @param onError Optional. Called if there is an error thrown by the
      * listener (the `onNext` function).
      * @param onCompletion Currently unused, as the token stream is unending.
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
      * @param isTokenAutoRefreshEnabled If true, the SDK automatically
      * refreshes App Check tokens as needed. This overrides any value set
      * during `activate()`.
      */
    def setTokenAutoRefreshEnabled(isTokenAutoRefreshEnabled: Boolean): Unit = js.native
  }
  
  /**
    * An App Check provider. This can be either the built-in reCAPTCHA
    * provider or a custom provider. For more on custom providers, see
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
    * The token returned from an {@link firebase.appCheck.AppCheckProvider `AppCheckProvider`}.
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
    * Result returned by
    * {@link firebase.appCheck.AppCheck.getToken `firebase.appCheck().getToken()`}.
    */
  trait AppCheckTokenResult extends StObject {
    
    var token: String
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
  
  /*
    * Custom token provider.
    */
  trait CustomProvider extends StObject
  
  /**
    * Options when creating a CustomProvider.
    */
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
  
  /*
    * reCAPTCHA Enterprise token provider.
    */
  trait ReCaptchaEnterpriseProvider extends StObject
  
  /*
    * reCAPTCHA v3 token provider.
    */
  trait ReCaptchaV3Provider extends StObject
}
