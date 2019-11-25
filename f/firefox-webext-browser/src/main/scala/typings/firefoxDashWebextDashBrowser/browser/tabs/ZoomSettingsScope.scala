package typings.firefoxDashWebextDashBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines whether zoom changes will persist for the page's origin, or only take effect in this tab; defaults to
  * `per-origin` when in `automatic` mode, and `per-tab` otherwise.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.`per-origin`
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.`per-tab`
*/
trait ZoomSettingsScope extends js.Object

object ZoomSettingsScope {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `per-origin`: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.`per-origin` = this.cast("per-origin")
  @scala.inline
  def `per-tab`: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.`per-tab` = this.cast("per-tab")
}

