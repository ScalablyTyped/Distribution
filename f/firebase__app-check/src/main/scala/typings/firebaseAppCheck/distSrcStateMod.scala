package typings.firebaseAppCheck

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAppCheck.distSrcProactiveRefreshMod.Refresher
import typings.firebaseAppCheck.distSrcRecaptchaMod.GreCAPTCHA
import typings.firebaseAppCheck.distSrcTypesMod.AppCheckProvider
import typings.firebaseAppCheck.distSrcTypesMod.AppCheckTokenInternal
import typings.firebaseAppCheck.distSrcTypesMod.AppCheckTokenObserver
import typings.firebaseUtil.mod.Deferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStateMod {
  
  @JSImport("@firebase/app-check/dist/src/state", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/app-check/dist/src/state", "DEFAULT_STATE")
  @js.native
  val DEFAULT_STATE: AppCheckState = js.native
  
  inline def clearState(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearState")().asInstanceOf[Unit]
  
  inline def getDebugState(): DebugState = ^.asInstanceOf[js.Dynamic].applyDynamic("getDebugState")().asInstanceOf[DebugState]
  
  inline def getStateReference(app: FirebaseApp): AppCheckState = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateReference")(app.asInstanceOf[js.Any]).asInstanceOf[AppCheckState]
  
  inline def setInitialState(app: FirebaseApp, state: AppCheckState): AppCheckState = (^.asInstanceOf[js.Dynamic].applyDynamic("setInitialState")(app.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[AppCheckState]
  
  trait AppCheckState extends StObject {
    
    var activated: Boolean
    
    var cachedTokenPromise: js.UndefOr[js.Promise[js.UndefOr[AppCheckTokenInternal]]] = js.undefined
    
    var exchangeTokenPromise: js.UndefOr[js.Promise[AppCheckTokenInternal]] = js.undefined
    
    var isTokenAutoRefreshEnabled: js.UndefOr[Boolean] = js.undefined
    
    var provider: js.UndefOr[AppCheckProvider] = js.undefined
    
    var reCAPTCHAState: js.UndefOr[ReCAPTCHAState] = js.undefined
    
    var token: js.UndefOr[AppCheckTokenInternal] = js.undefined
    
    var tokenObservers: js.Array[AppCheckTokenObserver]
    
    var tokenRefresher: js.UndefOr[Refresher] = js.undefined
  }
  object AppCheckState {
    
    inline def apply(activated: Boolean, tokenObservers: js.Array[AppCheckTokenObserver]): AppCheckState = {
      val __obj = js.Dynamic.literal(activated = activated.asInstanceOf[js.Any], tokenObservers = tokenObservers.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppCheckState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppCheckState] (val x: Self) extends AnyVal {
      
      inline def setActivated(value: Boolean): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
      
      inline def setCachedTokenPromise(value: js.Promise[js.UndefOr[AppCheckTokenInternal]]): Self = StObject.set(x, "cachedTokenPromise", value.asInstanceOf[js.Any])
      
      inline def setCachedTokenPromiseUndefined: Self = StObject.set(x, "cachedTokenPromise", js.undefined)
      
      inline def setExchangeTokenPromise(value: js.Promise[AppCheckTokenInternal]): Self = StObject.set(x, "exchangeTokenPromise", value.asInstanceOf[js.Any])
      
      inline def setExchangeTokenPromiseUndefined: Self = StObject.set(x, "exchangeTokenPromise", js.undefined)
      
      inline def setIsTokenAutoRefreshEnabled(value: Boolean): Self = StObject.set(x, "isTokenAutoRefreshEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsTokenAutoRefreshEnabledUndefined: Self = StObject.set(x, "isTokenAutoRefreshEnabled", js.undefined)
      
      inline def setProvider(value: AppCheckProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      inline def setReCAPTCHAState(value: ReCAPTCHAState): Self = StObject.set(x, "reCAPTCHAState", value.asInstanceOf[js.Any])
      
      inline def setReCAPTCHAStateUndefined: Self = StObject.set(x, "reCAPTCHAState", js.undefined)
      
      inline def setToken(value: AppCheckTokenInternal): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenObservers(value: js.Array[AppCheckTokenObserver]): Self = StObject.set(x, "tokenObservers", value.asInstanceOf[js.Any])
      
      inline def setTokenObserversVarargs(value: AppCheckTokenObserver*): Self = StObject.set(x, "tokenObservers", js.Array(value*))
      
      inline def setTokenRefresher(value: Refresher): Self = StObject.set(x, "tokenRefresher", value.asInstanceOf[js.Any])
      
      inline def setTokenRefresherUndefined: Self = StObject.set(x, "tokenRefresher", js.undefined)
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  trait DebugState extends StObject {
    
    var enabled: Boolean
    
    var initialized: Boolean
    
    var token: js.UndefOr[Deferred[String]] = js.undefined
  }
  object DebugState {
    
    inline def apply(enabled: Boolean, initialized: Boolean): DebugState = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any])
      __obj.asInstanceOf[DebugState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DebugState] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setInitialized(value: Boolean): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
      
      inline def setToken(value: Deferred[String]): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  trait ReCAPTCHAState extends StObject {
    
    var initialized: Deferred[GreCAPTCHA]
    
    var widgetId: js.UndefOr[String] = js.undefined
  }
  object ReCAPTCHAState {
    
    inline def apply(initialized: Deferred[GreCAPTCHA]): ReCAPTCHAState = {
      val __obj = js.Dynamic.literal(initialized = initialized.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReCAPTCHAState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReCAPTCHAState] (val x: Self) extends AnyVal {
      
      inline def setInitialized(value: Deferred[GreCAPTCHA]): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
      
      inline def setWidgetId(value: String): Self = StObject.set(x, "widgetId", value.asInstanceOf[js.Any])
      
      inline def setWidgetIdUndefined: Self = StObject.set(x, "widgetId", js.undefined)
    }
  }
}
