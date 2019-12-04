package typings.expoDashWebDashBrowser

import typings.expoDashWebDashBrowser.buildWebBrowserDotTypesMod.BrowserResult
import typings.expoDashWebDashBrowser.buildWebBrowserDotTypesMod.OpenBrowserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-web-browser/build/ExpoWebBrowser.web", JSImport.Namespace)
@js.native
object buildExpoWebBrowserDotWebMod extends js.Object {
  @js.native
  object default extends js.Object {
    val name: String = js.native
    def openBrowserAsync(url: String): js.Promise[BrowserResult] = js.native
    def openBrowserAsync(url: String, browserParams: OpenBrowserOptions): js.Promise[BrowserResult] = js.native
  }
  
}

