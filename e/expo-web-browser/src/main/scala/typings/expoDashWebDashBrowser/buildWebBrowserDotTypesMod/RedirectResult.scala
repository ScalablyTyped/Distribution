package typings.expoDashWebDashBrowser.buildWebBrowserDotTypesMod

import typings.expoDashWebDashBrowser.expoDashWebDashBrowserStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectResult extends AuthSessionResult {
  var `type`: success
  var url: String
}

object RedirectResult {
  @scala.inline
  def apply(`type`: success, url: String): RedirectResult = {
    val __obj = js.Dynamic.literal(url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RedirectResult]
  }
}

