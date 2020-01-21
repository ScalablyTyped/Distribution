package typings.firefoxWebextBrowser.browser.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A reason the item is disabled. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.permissions_increase
*/
trait ExtensionDisabledReason extends js.Object

object ExtensionDisabledReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def permissions_increase: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.permissions_increase = this.cast("permissions_increase")
  @scala.inline
  def unknown: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = this.cast("unknown")
}

