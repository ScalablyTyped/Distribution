package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tabs types */
/** An event that caused a muted state change. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.user
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.capture
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.extension
*/
trait MutedInfoReason extends js.Object

object MutedInfoReason {
  @scala.inline
  def capture: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.capture = this.cast("capture")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def extension: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.extension = this.cast("extension")
  @scala.inline
  def user: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.user = this.cast("user")
}

