package typings.ejWebAll.ej.datavisualization.Chart

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
    opacity: js.UndefOr[Double] = js.undefined,
    rx: js.UndefOr[Double] = js.undefined,
    ry: js.UndefOr[Double] = js.undefined,
    template: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): SeriesTooltip = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation.get.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rx)) __obj.updateDynamic("rx")(rx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ry)) __obj.updateDynamic("ry")(ry.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesTooltip]
  }
}

