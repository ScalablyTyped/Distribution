package typings.expoWebBrowser

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
    def openBrowserAsync(url: String): js.Promise[WebBrowserResult] = js.native
    def openBrowserAsync(url: String, browserParams: WebBrowserOpenOptions): js.Promise[WebBrowserResult] = js.native
  }
  
}

