package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesTrendlinesTooltip extends js.Object {
  /** Options for customizing the border of the trendline tooltip.
    */
  var border: js.UndefOr[SeriesTrendlinesTooltipBorder] = js.undefined
  /** Specifies the duration of the trendline tooltip to be displayed.
    * @Default {500ms}
    */
  var duration: js.UndefOr[java.lang.String] = js.undefined
  /** Enables/disables the animation of the trendline tooltip when moving from one point to other.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Background color of the trendline tooltip.
    * @Default {null}
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Format of the trendline tooltip content.
    * @Default {#point.x# : #point.y#}
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** Opacity of the trendline tooltip.
    * @Default {0.5}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Customize the corner radius of the trendline tooltip rectangle.
    * @Default {0}
    */
  var rx: js.UndefOr[scala.Double] = js.undefined
  /** Customize the corner radius of the trendline tooltip rectangle.
    * @Default {0}
    */
  var ry: js.UndefOr[scala.Double] = js.undefined
}

object SeriesTrendlinesTooltip {
  @scala.inline
  def apply(
    border: SeriesTrendlinesTooltipBorder = null,
    duration: java.lang.String = null,
    enableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    fill: java.lang.String = null,
    format: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    rx: scala.Int | scala.Double = null,
    ry: scala.Int | scala.Double = null
  ): SeriesTrendlinesTooltip = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (format != null) __obj.updateDynamic("format")(format)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (rx != null) __obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
    if (ry != null) __obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesTrendlinesTooltip]
  }
}

