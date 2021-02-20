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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("expo-web-browser", "coolDownAsync")
  @js.native
  def coolDownAsync(): js.Promise[WebBrowserCoolDownResult] = js.native
  @JSImport("expo-web-browser", "coolDownAsync")
  @js.native
  def coolDownAsync(browserPackage: String): js.Promise[WebBrowserCoolDownResult] = js.native
  
  @JSImport("expo-web-browser", "dismissAuthSession")
  @js.native
  def dismissAuthSession(): Unit = js.native
  
  @JSImport("expo-web-browser", "dismissBrowser")
  @js.native
  def dismissBrowser(): Unit = js.native
  
  @JSImport("expo-web-browser", "getCustomTabsSupportingBrowsersAsync")
  @js.native
  def getCustomTabsSupportingBrowsersAsync(): js.Promise[WebBrowserCustomTabsResults] = js.native
  
  @JSImport("expo-web-browser", "mayInitWithUrlAsync")
  @js.native
  def mayInitWithUrlAsync(url: String): js.Promise[WebBrowserMayInitWithUrlResult] = js.native
  @JSImport("expo-web-browser", "mayInitWithUrlAsync")
  @js.native
  def mayInitWithUrlAsync(url: String, browserPackage: String): js.Promise[WebBrowserMayInitWithUrlResult] = js.native
  
  @JSImport("expo-web-browser", "maybeCompleteAuthSession")
  @js.native
  def maybeCompleteAuthSession(): Message = js.native
  @JSImport("expo-web-browser", "maybeCompleteAuthSession")
  @js.native
  def maybeCompleteAuthSession(options: SkipRedirectCheck): Message = js.native
  
  @JSImport("expo-web-browser", "openAuthSessionAsync")
  @js.native
  def openAuthSessionAsync(url: String, redirectUrl: String): js.Promise[WebBrowserAuthSessionResult] = js.native
  @JSImport("expo-web-browser", "openAuthSessionAsync")
  @js.native
  def openAuthSessionAsync(url: String, redirectUrl: String, browserParams: WebBrowserOpenOptions): js.Promise[WebBrowserAuthSessionResult] = js.native
  
  @JSImport("expo-web-browser", "openBrowserAsync")
  @js.native
  def openBrowserAsync(url: String): js.Promise[WebBrowserResult] = js.native
  @JSImport("expo-web-browser", "openBrowserAsync")
  @js.native
  def openBrowserAsync(url: String, browserParams: WebBrowserOpenOptions): js.Promise[WebBrowserResult] = js.native
  
  @JSImport("expo-web-browser", "warmUpAsync")
  @js.native
  def warmUpAsync(): js.Promise[WebBrowserWarmUpResult] = js.native
  @JSImport("expo-web-browser", "warmUpAsync")
  @js.native
  def warmUpAsync(browserPackage: String): js.Promise[WebBrowserWarmUpResult] = js.native
}
