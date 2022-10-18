package typings.expoWebBrowser

import typings.expoWebBrowser.buildWebBrowserDottypesMod.AuthSessionOpenOptions
import typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserAuthSessionResult
import typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserCompleteAuthSessionOptions
import typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserCompleteAuthSessionResult
import typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserCoolDownResult
import typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserCustomTabsResults
import typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserMayInitWithUrlResult
import typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserOpenOptions
import typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserResult
import typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserWarmUpResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-web-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("expo-web-browser", "WebBrowserPresentationStyle")
  @js.native
  object WebBrowserPresentationStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserPresentationStyle & String
      ] = js.native
    
    /* "automatic" */ val AUTOMATIC: typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserPresentationStyle.AUTOMATIC & String = js.native
    
    /* "currentContext" */ val CURRENT_CONTEXT: typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserPresentationStyle.CURRENT_CONTEXT & String = js.native
    
    /* "formSheet" */ val FORM_SHEET: typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserPresentationStyle.FORM_SHEET & String = js.native
    
    /* "fullScreen" */ val FULL_SCREEN: typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserPresentationStyle.FULL_SCREEN & String = js.native
    
    /* "overCurrentContext" */ val OVER_CURRENT_CONTEXT: typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserPresentationStyle.OVER_CURRENT_CONTEXT & String = js.native
    
    /* "overFullScreen" */ val OVER_FULL_SCREEN: typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserPresentationStyle.OVER_FULL_SCREEN & String = js.native
    
    /* "pageSheet" */ val PAGE_SHEET: typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserPresentationStyle.PAGE_SHEET & String = js.native
    
    /* "popover" */ val POPOVER: typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserPresentationStyle.POPOVER & String = js.native
  }
  
  @JSImport("expo-web-browser", "WebBrowserResultType")
  @js.native
  object WebBrowserResultType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserResultType & String] = js.native
    
    /* "cancel" */ val CANCEL: typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserResultType.CANCEL & String = js.native
    
    /* "dismiss" */ val DISMISS: typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserResultType.DISMISS & String = js.native
    
    /* "locked" */ val LOCKED: typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserResultType.LOCKED & String = js.native
    
    /* "opened" */ val OPENED: typings.expoWebBrowser.buildWebBrowserDottypesMod.WebBrowserResultType.OPENED & String = js.native
  }
  
  inline def coolDownAsync(): js.Promise[WebBrowserCoolDownResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("coolDownAsync")().asInstanceOf[js.Promise[WebBrowserCoolDownResult]]
  inline def coolDownAsync(browserPackage: String): js.Promise[WebBrowserCoolDownResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("coolDownAsync")(browserPackage.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebBrowserCoolDownResult]]
  
  inline def dismissAuthSession(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissAuthSession")().asInstanceOf[Unit]
  
  inline def dismissBrowser(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissBrowser")().asInstanceOf[Unit]
  
  inline def getCustomTabsSupportingBrowsersAsync(): js.Promise[WebBrowserCustomTabsResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomTabsSupportingBrowsersAsync")().asInstanceOf[js.Promise[WebBrowserCustomTabsResults]]
  
  inline def mayInitWithUrlAsync(url: String): js.Promise[WebBrowserMayInitWithUrlResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("mayInitWithUrlAsync")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebBrowserMayInitWithUrlResult]]
  inline def mayInitWithUrlAsync(url: String, browserPackage: String): js.Promise[WebBrowserMayInitWithUrlResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("mayInitWithUrlAsync")(url.asInstanceOf[js.Any], browserPackage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebBrowserMayInitWithUrlResult]]
  
  inline def maybeCompleteAuthSession(): WebBrowserCompleteAuthSessionResult = ^.asInstanceOf[js.Dynamic].applyDynamic("maybeCompleteAuthSession")().asInstanceOf[WebBrowserCompleteAuthSessionResult]
  inline def maybeCompleteAuthSession(options: WebBrowserCompleteAuthSessionOptions): WebBrowserCompleteAuthSessionResult = ^.asInstanceOf[js.Dynamic].applyDynamic("maybeCompleteAuthSession")(options.asInstanceOf[js.Any]).asInstanceOf[WebBrowserCompleteAuthSessionResult]
  
  inline def openAuthSessionAsync(url: String): js.Promise[WebBrowserAuthSessionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("openAuthSessionAsync")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebBrowserAuthSessionResult]]
  inline def openAuthSessionAsync(url: String, redirectUrl: String): js.Promise[WebBrowserAuthSessionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("openAuthSessionAsync")(url.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebBrowserAuthSessionResult]]
  inline def openAuthSessionAsync(url: String, redirectUrl: String, options: AuthSessionOpenOptions): js.Promise[WebBrowserAuthSessionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("openAuthSessionAsync")(url.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebBrowserAuthSessionResult]]
  inline def openAuthSessionAsync(url: String, redirectUrl: Null, options: AuthSessionOpenOptions): js.Promise[WebBrowserAuthSessionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("openAuthSessionAsync")(url.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebBrowserAuthSessionResult]]
  inline def openAuthSessionAsync(url: String, redirectUrl: Unit, options: AuthSessionOpenOptions): js.Promise[WebBrowserAuthSessionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("openAuthSessionAsync")(url.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebBrowserAuthSessionResult]]
  
  inline def openBrowserAsync(url: String): js.Promise[WebBrowserResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("openBrowserAsync")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebBrowserResult]]
  inline def openBrowserAsync(url: String, browserParams: WebBrowserOpenOptions): js.Promise[WebBrowserResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("openBrowserAsync")(url.asInstanceOf[js.Any], browserParams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebBrowserResult]]
  
  inline def warmUpAsync(): js.Promise[WebBrowserWarmUpResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("warmUpAsync")().asInstanceOf[js.Promise[WebBrowserWarmUpResult]]
  inline def warmUpAsync(browserPackage: String): js.Promise[WebBrowserWarmUpResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("warmUpAsync")(browserPackage.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebBrowserWarmUpResult]]
}
