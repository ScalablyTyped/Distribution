package typings.ejDotWebDotAll.ejNs.SparklineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tooltip extends js.Object {
  /** Options for customizing the border of the tooltip.
    */
  var border: js.UndefOr[TooltipBorder] = js.undefined
  /** Fill color for the sparkline tooltip.
    * @Default {white}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Options for customizing the font of the tooltip.
    */
  var font: js.UndefOr[TooltipFont] = js.undefined
  /** Custom template to the tooltip.
    */
  var template: js.UndefOr[String] = js.undefined
  /** Show/hides the tooltip visibility.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Tooltip {
  @scala.inline
  def apply(
    border: TooltipBorder = null,
    fill: String = null,
    font: TooltipFont = null,
    template: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Tooltip = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (template != null) __obj.updateDynamic("template")(template)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[Tooltip]
  }
}

