package typings.expoWebBrowser.webBrowserTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebBrowserResult extends WebBrowserAuthSessionResult {
  var `type`: WebBrowserResultType
}

object WebBrowserResult {
  @scala.inline
  def apply(`type`: WebBrowserResultType): WebBrowserResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebBrowserResult]
  }
}

