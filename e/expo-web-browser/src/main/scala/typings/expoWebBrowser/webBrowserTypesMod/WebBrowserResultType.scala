package typings.expoWebBrowser.webBrowserTypesMod

import typings.expoWebBrowser.expoWebBrowserStrings.cancel
import typings.expoWebBrowser.expoWebBrowserStrings.dismiss
import typings.expoWebBrowser.expoWebBrowserStrings.opened
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined { readonly CANCEL  :'cancel',  readonly DISMISS  :'dismiss',  readonly OPENED  :'opened'}[keyof { readonly CANCEL  :'cancel',  readonly DISMISS  :'dismiss',  readonly OPENED  :'opened'}] */
/* Rewritten from type alias, can be one of: 
  - typings.expoWebBrowser.expoWebBrowserStrings.cancel
  - typings.expoWebBrowser.expoWebBrowserStrings.dismiss
  - typings.expoWebBrowser.expoWebBrowserStrings.opened
*/
trait WebBrowserResultType extends js.Object

@JSImport("expo-web-browser/build/WebBrowser.types", "WebBrowserResultType")
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

