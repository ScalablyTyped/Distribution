package typings.expoWebBrowser.webBrowserTypesMod

import typings.expoWebBrowser.expoWebBrowserStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.expoWebBrowser.webBrowserTypesMod.WebBrowserRedirectResult
  - typings.expoWebBrowser.webBrowserTypesMod.WebBrowserResult
*/
trait WebBrowserAuthSessionResult extends js.Object

object WebBrowserAuthSessionResult {
  @scala.inline
  def WebBrowserRedirectResult(`type`: success, url: String): WebBrowserAuthSessionResult = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebBrowserAuthSessionResult]
  }
  @scala.inline
  def WebBrowserResult(`type`: WebBrowserResultType): WebBrowserAuthSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebBrowserAuthSessionResult]
  }
}

