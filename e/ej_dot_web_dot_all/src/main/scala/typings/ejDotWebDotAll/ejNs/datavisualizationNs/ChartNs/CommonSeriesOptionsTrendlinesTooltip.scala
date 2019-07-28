package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsTrendlinesTooltip extends js.Object {
  /** Options for customizing the border of the  trendline tooltip.
    */
  var border: js.UndefOr[CommonSeriesOptionsTrendlinesTooltipBorder] = js.undefined
  /** Specifies the duration, the tooltip has to be displayed.
    * @Default {500ms}
    */
  var duration: js.UndefOr[String] = js.undefined
  /** Enables/disables the animation of the trendline tooltip when moving from one point to other.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  /** Background color of the trendline tooltip.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Format of the tooltip content displayed in the trendlines.
    * @Default {#point.x# : #point.y#}
    */
  var format: js.UndefOr[String] = js.undefined
  /** Opacity of the trendline tooltip.
    * @Default {0.5}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Customize the corner radius of the trendline tooltip rectangle.
    * @Default {0}
    */
  var rx: js.UndefOr[Double] = js.undefined
  /** Customize the corner radius of the trendline tooltip rectangle.
    * @Default {0}
    */
  var ry: js.UndefOr[Double] = js.undefined
}

object CommonSeriesOptionsTrendlinesTooltip {
  @scala.inline
  def apply(
    border: CommonSeriesOptionsTrendlinesTooltipBorder = null,
    duration: String = null,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    fill: String = null,
    format: String = null,
    opacity: Int | Double = null,
    rx: Int | Double = null,
    ry: Int | Double = null
  ): CommonSeriesOptionsTrendlinesTooltip = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (format != null) __obj.updateDynamic("format")(format)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (rx != null) __obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
    if (ry != null) __obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSeriesOptionsTrendlinesTooltip]
  }
}

