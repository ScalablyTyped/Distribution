package typings.expoWebBrowser

import typings.expoWebBrowser.anon.Message
import typings.expoWebBrowser.anon.SkipRedirectCheck
import typings.expoWebBrowser.expoWebBrowserStrings.cancel
import typings.expoWebBrowser.expoWebBrowserStrings.dismiss
import typings.expoWebBrowser.expoWebBrowserStrings.locked
import typings.expoWebBrowser.expoWebBrowserStrings.opened
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserAuthSessionResult
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserCoolDownResult
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserCustomTabsResults
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserMayInitWithUrlResult
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserOpenOptions
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserResult
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserWarmUpResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-web-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object WebBrowserResultType {
    
    /**
      * iOS only
      */
    @JSImport("expo-web-browser", "WebBrowserResultType.CANCEL")
    @js.native
    val CANCEL: cancel = js.native
    
    /**
      * iOS only
      */
    @JSImport("expo-web-browser", "WebBrowserResultType.DISMISS")
    @js.native
    val DISMISS: dismiss = js.native
    
    @JSImport("expo-web-browser", "WebBrowserResultType.LOCKED")
    @js.native
    val LOCKED: locked = js.native
    
    /**
      * Android only
      */
    @JSImport("expo-web-browser", "WebBrowserResultType.OPENED")
    @js.native
    val OPENED: opened = js.native
  }
  
  inline def coolDownAsync(): js.Promise[WebBrowserCoolDownResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("coolDownAsync")().asInstanceOf[js.Promise[WebBrowserCoolDownResult]]
  inline def coolDownAsync(browserPackage: String): js.Promise[WebBrowserCoolDownResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("coolDownAsync")(browserPackage.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebBrowserCoolDownResult]]
  
  inline def dismissAuthSession(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissAuthSession")().asInstanceOf[Unit]
  
  inline def dismissBrowser(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissBrowser")().asInstanceOf[Unit]
  
  inline def getCustomTabsSupportingBrowsersAsync(): js.Promise[WebBrowserCustomTabsResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomTabsSupportingBrowsersAsync")().asInstanceOf[js.Promise[WebBrowserCustomTabsResults]]
  
  inline def mayInitWithUrlAsync(url: String): js.Promise[WebBrowserMayInitWithUrlResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("mayInitWithUrlAsync")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebBrowserMayInitWithUrlResult]]
  inline def mayInitWithUrlAsync(url: String, browserPackage: String): js.Promise[WebBrowserMayInitWithUrlResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("mayInitWithUrlAsync")(url.asInstanceOf[js.Any], browserPackage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebBrowserMayInitWithUrlResult]]
  
  inline def maybeCompleteAuthSession(): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("maybeCompleteAuthSession")().asInstanceOf[Message]
  inline def maybeCompleteAuthSession(options: SkipRedirectCheck): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("maybeCompleteAuthSession")(options.asInstanceOf[js.Any]).asInstanceOf[Message]
  
  inline def openAuthSessionAsync(url: String, redirectUrl: String): js.Promise[WebBrowserAuthSessionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("openAuthSessionAsync")(url.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebBrowserAuthSessionResult]]
  inline def openAuthSessionAsync(url: String, redirectUrl: String, browserParams: WebBrowserOpenOptions): js.Promise[WebBrowserAuthSessionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("openAuthSessionAsync")(url.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], browserParams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebBrowserAuthSessionResult]]
  
  inline def openBrowserAsync(url: String): js.Promise[WebBrowserResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("openBrowserAsync")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebBrowserResult]]
  inline def openBrowserAsync(url: String, browserParams: WebBrowserOpenOptions): js.Promise[WebBrowserResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("openBrowserAsync")(url.asInstanceOf[js.Any], browserParams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebBrowserResult]]
  
  inline def warmUpAsync(): js.Promise[WebBrowserWarmUpResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("warmUpAsync")().asInstanceOf[js.Promise[WebBrowserWarmUpResult]]
  inline def warmUpAsync(browserPackage: String): js.Promise[WebBrowserWarmUpResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("warmUpAsync")(browserPackage.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebBrowserWarmUpResult]]
}
