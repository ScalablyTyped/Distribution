package typings.firefoxDashWebextDashBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The reason that the event is being dispatched. 'app_update' is used when the restart is needed because the
  * application is updated to a newer version. 'os_update' is used when the restart is needed because the browser/OS
  * is updated to a newer version. 'periodic' is used when the system runs for more than the permitted uptime set in
  * the enterprise policy.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.app_update
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.os_update
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.periodic
*/
trait OnRestartRequiredReason extends js.Object

object OnRestartRequiredReason {
  @scala.inline
  def app_update: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.app_update = this.cast("app_update")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def os_update: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.os_update = this.cast("os_update")
  @scala.inline
  def periodic: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.periodic = this.cast("periodic")
}

