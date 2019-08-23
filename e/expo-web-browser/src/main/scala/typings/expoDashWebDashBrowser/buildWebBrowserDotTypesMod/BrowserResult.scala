package typings.expoDashWebDashBrowser.buildWebBrowserDotTypesMod

import typings.expoDashWebDashBrowser.expoDashWebDashBrowserStrings.cancel
import typings.expoDashWebDashBrowser.expoDashWebDashBrowserStrings.dismiss
import typings.expoDashWebDashBrowser.expoDashWebDashBrowserStrings.opened
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserResult extends AuthSessionResult {
  var `type`: cancel | dismiss | opened
}

object BrowserResult {
  @scala.inline
  def apply(`type`: cancel | dismiss | opened): BrowserResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserResult]
  }
}

