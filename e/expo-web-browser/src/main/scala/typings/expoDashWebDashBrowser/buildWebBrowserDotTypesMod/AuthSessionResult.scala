package typings.expoDashWebDashBrowser.buildWebBrowserDotTypesMod

import typings.expoDashWebDashBrowser.expoDashWebDashBrowserStrings.cancel
import typings.expoDashWebDashBrowser.expoDashWebDashBrowserStrings.dismiss
import typings.expoDashWebDashBrowser.expoDashWebDashBrowserStrings.opened
import typings.expoDashWebDashBrowser.expoDashWebDashBrowserStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.expoDashWebDashBrowser.buildWebBrowserDotTypesMod.RedirectResult
  - typings.expoDashWebDashBrowser.buildWebBrowserDotTypesMod.BrowserResult
*/
trait AuthSessionResult extends js.Object

object AuthSessionResult {
  @scala.inline
  def RedirectResult(`type`: success, url: String): AuthSessionResult = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSessionResult]
  }
  @scala.inline
  def BrowserResult(`type`: cancel | dismiss | opened): AuthSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSessionResult]
  }
}

