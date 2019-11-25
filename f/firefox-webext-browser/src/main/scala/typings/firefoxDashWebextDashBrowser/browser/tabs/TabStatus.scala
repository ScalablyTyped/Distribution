package typings.firefoxDashWebextDashBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Whether the tabs have completed loading. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.loading
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.complete
*/
trait TabStatus extends js.Object

object TabStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.complete = this.cast("complete")
  @scala.inline
  def loading: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.loading = this.cast("loading")
}

