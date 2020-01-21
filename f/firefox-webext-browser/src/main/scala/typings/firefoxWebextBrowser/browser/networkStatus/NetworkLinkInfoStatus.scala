package typings.firefoxWebextBrowser.browser.networkStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Status of the network link, if "unknown" then link is usually assumed to be "up" */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.up
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.down
*/
trait NetworkLinkInfoStatus extends js.Object

object NetworkLinkInfoStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def down: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.down = this.cast("down")
  @scala.inline
  def unknown: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = this.cast("unknown")
  @scala.inline
  def up: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.up = this.cast("up")
}

