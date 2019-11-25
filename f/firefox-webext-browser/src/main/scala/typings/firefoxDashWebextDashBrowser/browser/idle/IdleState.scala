package typings.firefoxDashWebextDashBrowser.browser.idle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* idle types */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.active
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.idle
*/
trait IdleState extends js.Object

object IdleState {
  @scala.inline
  def active: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def idle: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.idle = this.cast("idle")
}

