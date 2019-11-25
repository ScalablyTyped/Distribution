package typings.ejDotWebDotAll.ej.datavisualization.SunburstChart

import typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstHighlightMode
import typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstHighlightType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionSettings extends js.Object {
  /** Color of the levels/point on selection.
    * @Default {green}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Enables/disables the ability to select the levels or data point interactively.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether the levels or data point has to be selected.
    * @Default {point. See Mode}
    */
  var mode: js.UndefOr[SunburstHighlightMode | String] = js.undefined
  /** Opacity of the levels/point on selection.
    * @Default {0.5}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specifies whether the levels or data point has to be selected.
    * @Default {opacity. See Mode}
    */
  var `type`: js.UndefOr[SunburstHighlightType | String] = js.undefined
}

object SelectionSettings {
  @scala.inline
  def apply(
    color: String = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    mode: SunburstHighlightMode | String = null,
    opacity: Int | Double = null,
    `type`: SunburstHighlightType | String = null
  ): SelectionSettings = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionSettings]
  }
}

