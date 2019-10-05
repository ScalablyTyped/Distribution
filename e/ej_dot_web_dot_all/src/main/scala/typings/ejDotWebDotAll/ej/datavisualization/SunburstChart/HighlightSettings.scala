package typings.ejDotWebDotAll.ej.datavisualization.SunburstChart

import typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstHighlightMode
import typings.ejDotWebDotAll.ej.datavisualization.Sunburst.SunburstHighlightType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightSettings extends js.Object {
  /** Color of the levels/point on highlight.
    * @Default {red}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Enables/disables the ability to highlight the levels or point interactively.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether the levels or point has to be highlighted.
    * @Default {point. See Mode}
    */
  var mode: js.UndefOr[SunburstHighlightMode | String] = js.undefined
  /** Opacity of the levels/point on highlight.
    * @Default {0.5}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specifies whether the levels or data point has to be highlighted.
    * @Default {opacity. See Mode}
    */
  var `type`: js.UndefOr[SunburstHighlightType | String] = js.undefined
}

object HighlightSettings {
  @scala.inline
  def apply(
    color: String = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    mode: SunburstHighlightMode | String = null,
    opacity: Int | Double = null,
    `type`: SunburstHighlightType | String = null
  ): HighlightSettings = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightSettings]
  }
}

