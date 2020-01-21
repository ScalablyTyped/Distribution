package typings.firefoxWebextBrowser.browser.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.client_redirect
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.server_redirect
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.forward_back
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.from_address_bar
*/
trait TransitionQualifier extends js.Object

object TransitionQualifier {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def client_redirect: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.client_redirect = this.cast("client_redirect")
  @scala.inline
  def forward_back: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.forward_back = this.cast("forward_back")
  @scala.inline
  def from_address_bar: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.from_address_bar = this.cast("from_address_bar")
  @scala.inline
  def server_redirect: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.server_redirect = this.cast("server_redirect")
}

