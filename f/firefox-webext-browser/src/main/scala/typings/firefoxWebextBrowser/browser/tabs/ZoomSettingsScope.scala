package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines whether zoom changes will persist for the page's origin, or only take effect in this tab; defaults to
  * `per-origin` when in `automatic` mode, and `per-tab` otherwise.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`per-origin`
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`per-tab`
*/
trait ZoomSettingsScope extends js.Object

object ZoomSettingsScope {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `per-origin`: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`per-origin` = this.cast("per-origin")
  @scala.inline
  def `per-tab`: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`per-tab` = this.cast("per-tab")
}

