package typings.expoWebBrowser

import typings.expoWebBrowser.anon.Message
import typings.expoWebBrowser.anon.SkipRedirectCheck
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserAuthSessionResult
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserOpenOptions
import typings.expoWebBrowser.webBrowserTypesMod.WebBrowserResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-web-browser/build/ExpoWebBrowser.web", JSImport.Namespace)
@js.native
object expoWebBrowserWebMod extends js.Object {
  @js.native
  object default extends js.Object {
    val name: String = js.native
    def dismissAuthSession(): Unit = js.native
    def maybeCompleteAuthSession(hasSkipRedirectCheck: SkipRedirectCheck): Message = js.native
    def openAuthSessionAsync(url: String): js.Promise[WebBrowserAuthSessionResult] = js.native
    def openAuthSessionAsync(url: String, redirectUrl: String): js.Promise[WebBrowserAuthSessionResult] = js.native
    def openBrowserAsync(url: String): js.Promise[WebBrowserResult] = js.native
    def openBrowserAsync(url: String, browserParams: WebBrowserOpenOptions): js.Promise[WebBrowserResult] = js.native
  }
  
}

