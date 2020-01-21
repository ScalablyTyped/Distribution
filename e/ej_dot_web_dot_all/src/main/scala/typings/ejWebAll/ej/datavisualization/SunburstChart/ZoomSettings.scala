package typings.ejWebAll.ej.datavisualization.SunburstChart

import typings.ejWebAll.ej.datavisualization.Sunburst.SunburstHorizontalAlignment
import typings.ejWebAll.ej.datavisualization.Sunburst.SunburstVerticalAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomSettings extends js.Object {
  /** Enables or disables zooming.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  /** Toolbar horizontal alignment
    * @Default {right. See Alignment}
    */
  var toolbarHorizontalAlignment: js.UndefOr[SunburstHorizontalAlignment | String] = js.undefined
  /** Toolbar vertical alignment
    * @Default {top. See Alignment}
    */
  var toolbarVerticalAlignment: js.UndefOr[SunburstVerticalAlignment | String] = js.undefined
}

object ZoomSettings {
  @scala.inline
  def apply(
    enable: js.UndefOr[Boolean] = js.undefined,
    toolbarHorizontalAlignment: SunburstHorizontalAlignment | String = null,
    toolbarVerticalAlignment: SunburstVerticalAlignment | String = null
  ): ZoomSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (toolbarHorizontalAlignment != null) __obj.updateDynamic("toolbarHorizontalAlignment")(toolbarHorizontalAlignment.asInstanceOf[js.Any])
    if (toolbarVerticalAlignment != null) __obj.updateDynamic("toolbarVerticalAlignment")(toolbarVerticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomSettings]
  }
}

