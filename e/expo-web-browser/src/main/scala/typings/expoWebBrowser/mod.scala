package typings.expoWebBrowser

import typings.expoWebBrowser.anon.Message
import typings.expoWebBrowser.anon.SkipRedirectCheck
import typings.expoWebBrowser.expoWebBrowserStrings.cancel
import typings.expoWebBrowser.expoWebBrowserStrings.dismiss
import typings.expoWebBrowser.expoWebBrowserStrings.opened
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserAuthSessionResult
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserCoolDownResult
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserCustomTabsResults
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserMayInitWithUrlResult
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserOpenOptions
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserResult
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserWarmUpResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-web-browser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def coolDownAsync(): js.Promise[WebBrowserCoolDownResult] = js.native
  def coolDownAsync(browserPackage: String): js.Promise[WebBrowserCoolDownResult] = js.native
  def dismissAuthSession(): Unit = js.native
  def dismissBrowser(): Unit = js.native
  def getCustomTabsSupportingBrowsersAsync(): js.Promise[WebBrowserCustomTabsResults] = js.native
  def mayInitWithUrlAsync(url: String): js.Promise[WebBrowserMayInitWithUrlResult] = js.native
  def mayInitWithUrlAsync(url: String, browserPackage: String): js.Promise[WebBrowserMayInitWithUrlResult] = js.native
  def maybeCompleteAuthSession(): Message = js.native
  def maybeCompleteAuthSession(options: SkipRedirectCheck): Message = js.native
  def openAuthSessionAsync(url: String, redirectUrl: String): js.Promise[WebBrowserAuthSessionResult] = js.native
  def openAuthSessionAsync(url: String, redirectUrl: String, browserParams: WebBrowserOpenOptions): js.Promise[WebBrowserAuthSessionResult] = js.native
  def openBrowserAsync(url: String): js.Promise[WebBrowserResult] = js.native
  def openBrowserAsync(url: String, browserParams: WebBrowserOpenOptions): js.Promise[WebBrowserResult] = js.native
  def warmUpAsync(): js.Promise[WebBrowserWarmUpResult] = js.native
  def warmUpAsync(browserPackage: String): js.Promise[WebBrowserWarmUpResult] = js.native
  @js.native
  object WebBrowserResultType extends js.Object {
    /**
      * iOS only
      */
    val CANCEL: cancel = js.native
    /**
      * iOS only
      */
    val DISMISS: dismiss = js.native
    /**
      * Android only
      */
    val OPENED: opened = js.native
  }
  
}

