package typings.firefoxDashWebextDashBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The reason that this event is being dispatched. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.install
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.update
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.browser_update
*/
trait OnInstalledReason extends js.Object

object OnInstalledReason {
  @scala.inline
  def browser_update: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.browser_update = this.cast("browser_update")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def install: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.install = this.cast("install")
  @scala.inline
  def update: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.update = this.cast("update")
}

