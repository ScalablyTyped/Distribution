package typings.ejWebAll.ej.datavisualization.Sparkline

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
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tooltip]
  }
}

