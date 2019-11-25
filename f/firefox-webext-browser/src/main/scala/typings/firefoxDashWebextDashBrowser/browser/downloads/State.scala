package typings.firefoxDashWebextDashBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * *in_progress*:
  *   The download is currently receiving data from the server.
  * *interrupted*:
  *   An error broke the connection with the file host.
  * *complete*:
  *   The download completed successfully.
  *
  * These string constants will never change, however the set of States may change.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.in_progress
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.interrupted
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.complete
*/
trait State extends js.Object

object State {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.complete = this.cast("complete")
  @scala.inline
  def in_progress: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.in_progress = this.cast("in_progress")
  @scala.inline
  def interrupted: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.interrupted = this.cast("interrupted")
}

