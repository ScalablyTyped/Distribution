package typings.firefoxDashWebextDashBrowser.browser.networkStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Status of the network link, if "unknown" then link is usually assumed to be "up" */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.unknown
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.up
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.down
*/
trait _NetworkLinkInfoStatus extends js.Object

object _NetworkLinkInfoStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def down: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.down = this.cast("down")
  @scala.inline
  def unknown: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.unknown = this.cast("unknown")
  @scala.inline
  def up: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.up = this.cast("up")
}

