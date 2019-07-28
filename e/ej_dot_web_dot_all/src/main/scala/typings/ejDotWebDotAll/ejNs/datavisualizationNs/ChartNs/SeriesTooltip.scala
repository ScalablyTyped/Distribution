package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesTooltip extends js.Object {
  /** Options for customizing the border of the tooltip.
    */
  var border: js.UndefOr[SeriesTooltipBorder] = js.undefined
  /** Specifies the duration, the tooltip has to be displayed.
    * @Default {500ms}
    */
  var duration: js.UndefOr[String] = js.undefined
  /** Enables/disables the animation of the tooltip when moving from one point to another.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  /** Background color of the tooltip.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Format of the tooltip content.
    * @Default {#point.x# : #point.y#}
    */
  var format: js.UndefOr[String] = js.undefined
  /** Opacity of the tooltip.
    * @Default {0.95}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Customize the corner radius of the tooltip rectangle.
    * @Default {0}
    */
  var rx: js.UndefOr[Double] = js.undefined
  /** Customize the corner radius of the tooltip rectangle.
    * @Default {0}
    */
  var ry: js.UndefOr[Double] = js.undefined
  /** Custom template to format the tooltip content. Use â€œpoint.xâ€ and â€œpoint.yâ€ as a placeholder text to display the corresponding data pointâ€™s x and y value.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.undefined
  /** Controls the visibility of the tooltip.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object SeriesTooltip {
  @scala.inline
  def apply(
    border: SeriesTooltipBorder = null,
    duration: String = null,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    fill: String = null,
    format: String = null,
    opacity: Int | Double = null,
    rx: Int | Double = null,
    ry: Int | Double = null,
    template: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): SeriesTooltip = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (format != null) __obj.updateDynamic("format")(format)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (rx != null) __obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
    if (ry != null) __obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[SeriesTooltip]
  }
}

