package typings
package ejDotWebDotAllLib.ejNs.SunburstChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionSettings extends js.Object {
  /** Color of the levels/point on selection.
    * @Default {green}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Enables/disables the ability to select the levels or data point interactively.
    * @Default {false}
    */
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether the levels or data point has to be selected.
    * @Default {point. See Mode}
    */
  var mode: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstHighlightMode | java.lang.String
  ] = js.undefined
  /** Opacity of the levels/point on selection.
    * @Default {0.5}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies whether the levels or data point has to be selected.
    * @Default {opacity. See Mode}
    */
  var `type`: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstHighlightType | java.lang.String
  ] = js.undefined
}

object SelectionSettings {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    mode: ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstHighlightMode | java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    `type`: ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstHighlightType | java.lang.String = null
  ): SelectionSettings = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionSettings]
  }
}

