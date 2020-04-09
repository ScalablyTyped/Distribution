package typings.expoWebBrowser.webBrowserTypesMod

import typings.expoWebBrowser.expoWebBrowserStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebBrowserRedirectResult extends WebBrowserAuthSessionResult {
  var `type`: success
  var url: String
}

object WebBrowserRedirectResult {
  @scala.inline
  def apply(`type`: success, url: String): WebBrowserRedirectResult = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebBrowserRedirectResult]
  }
}

