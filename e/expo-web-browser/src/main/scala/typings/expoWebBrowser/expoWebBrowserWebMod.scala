package typings.expoWebBrowser

import typings.expoWebBrowser.anon.Message
import typings.expoWebBrowser.anon.SkipRedirectCheck
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserAuthSessionResult
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserOpenOptions
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserResult
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-web-browser/build/ExpoWebBrowser.web", JSImport.Namespace)
@js.native
object expoWebBrowserWebMod extends js.Object {
  def featureObjectToString(features: Record[String, _]): String = js.native
  @js.native
  object default extends js.Object {
    val name: String = js.native
    def dismissAuthSession(): Unit = js.native
    def maybeCompleteAuthSession(hasSkipRedirectCheck: SkipRedirectCheck): Message = js.native
    def openAuthSessionAsync(url: String): js.Promise[WebBrowserAuthSessionResult] = js.native
    def openAuthSessionAsync(url: String, redirectUrl: js.UndefOr[scala.Nothing], openOptions: WebBrowserOpenOptions): js.Promise[WebBrowserAuthSessionResult] = js.native
    def openAuthSessionAsync(url: String, redirectUrl: String): js.Promise[WebBrowserAuthSessionResult] = js.native
    def openAuthSessionAsync(url: String, redirectUrl: String, openOptions: WebBrowserOpenOptions): js.Promise[WebBrowserAuthSessionResult] = js.native
    def openBrowserAsync(url: String): js.Promise[WebBrowserResult] = js.native
    def openBrowserAsync(url: String, browserParams: WebBrowserOpenOptions): js.Promise[WebBrowserResult] = js.native
  }
  
}

