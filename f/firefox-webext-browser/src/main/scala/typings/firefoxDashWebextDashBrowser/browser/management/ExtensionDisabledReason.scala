package typings.firefoxDashWebextDashBrowser.browser.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A reason the item is disabled. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.unknown
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.permissions_increase
*/
trait ExtensionDisabledReason extends js.Object

object ExtensionDisabledReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def permissions_increase: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.permissions_increase = this.cast("permissions_increase")
  @scala.inline
  def unknown: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.unknown = this.cast("unknown")
}

