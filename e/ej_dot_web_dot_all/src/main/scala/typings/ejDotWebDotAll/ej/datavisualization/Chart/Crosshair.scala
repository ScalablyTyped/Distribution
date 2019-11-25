package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Crosshair extends js.Object {
  /** Options for customizing the crosshair line.
    */
  var line: js.UndefOr[CrosshairLine] = js.undefined
  /** Options for customizing the marker in crosshair.
    */
  var marker: js.UndefOr[CrosshairMarker] = js.undefined
  /** Options for customizing the trackball tooltip.
    */
  var trackballTooltipSettings: js.UndefOr[CrosshairTrackballTooltipSettings] = js.undefined
  /** Specifies the type of the crosshair. It can be trackball or crosshair
    * @Default {crosshair. See CrosshairType}
    */
  var `type`: js.UndefOr[CrosshairType | String] = js.undefined
  /** Show/hides the crosshair/trackball visibility.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Crosshair {
  @scala.inline
  def apply(
    line: CrosshairLine = null,
    marker: CrosshairMarker = null,
    trackballTooltipSettings: CrosshairTrackballTooltipSettings = null,
    `type`: CrosshairType | String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Crosshair = {
    val __obj = js.Dynamic.literal()
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (trackballTooltipSettings != null) __obj.updateDynamic("trackballTooltipSettings")(trackballTooltipSettings.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crosshair]
  }
}

