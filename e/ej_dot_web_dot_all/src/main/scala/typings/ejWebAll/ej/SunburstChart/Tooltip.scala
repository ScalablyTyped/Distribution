package typings.ejWebAll.ej.SunburstChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tooltip extends js.Object {
  /** Options for customizing the border of the sunburst tooltip.
    */
  var border: js.UndefOr[TooltipBorder] = js.undefined
  /** Fill color for the sunburst tooltip.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Options for customizing the font of the tooltip.
    */
  var font: js.UndefOr[TooltipFont] = js.undefined
  /** Setting the format for the data displayed in the tooltip
    * @Default {#point.x# : #point.y#}
    */
  var format: js.UndefOr[String] = js.undefined
  /** Sets the opacity of the displayed tooltip
    * @Default {0.95}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Custom template to the tooltip.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.undefined
  /** tooltip visibility of the Sunburst.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Tooltip {
  @scala.inline
  def apply(
    border: TooltipBorder = null,
    fill: String = null,
    font: TooltipFont = null,
    format: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    template: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Tooltip = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tooltip]
  }
}

