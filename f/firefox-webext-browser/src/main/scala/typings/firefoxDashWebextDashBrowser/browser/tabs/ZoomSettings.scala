package typings.firefoxDashWebextDashBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines how zoom changes in a tab are handled and at what scope. */
trait ZoomSettings extends js.Object {
  /** Used to return the default zoom level for the current tab in calls to tabs.getZoomSettings. */
  var defaultZoomFactor: js.UndefOr[Double] = js.undefined
  /**
    * Defines how zoom changes are handled, i.e. which entity is responsible for the actual scaling of the page;
    * defaults to `automatic`.
    */
  var mode: js.UndefOr[ZoomSettingsMode] = js.undefined
  /**
    * Defines whether zoom changes will persist for the page's origin, or only take effect in this tab; defaults
    * to `per-origin` when in `automatic` mode, and `per-tab` otherwise.
    */
  var scope: js.UndefOr[ZoomSettingsScope] = js.undefined
}

object ZoomSettings {
  @scala.inline
  def apply(
    defaultZoomFactor: Int | Double = null,
    mode: ZoomSettingsMode = null,
    scope: ZoomSettingsScope = null
  ): ZoomSettings = {
    val __obj = js.Dynamic.literal()
    if (defaultZoomFactor != null) __obj.updateDynamic("defaultZoomFactor")(defaultZoomFactor.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[ZoomSettings]
  }
}

