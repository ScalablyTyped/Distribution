package typings
package ejDotWebDotAllLib.ejNs.SunburstChartNs

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
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Options for customizing the font of the tooltip.
    */
  var font: js.UndefOr[TooltipFont] = js.undefined
  /** Setting the format for the data displayed in the tooltip
    * @Default {#point.x# : #point.y#}
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the opacity of the displayed tooltip
    * @Default {0.95}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Custom template to the tooltip.
    * @Default {null}
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /** tooltip visibility of the Sunburst.
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object Tooltip {
  @scala.inline
  def apply(
    border: TooltipBorder = null,
    fill: java.lang.String = null,
    font: TooltipFont = null,
    format: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    template: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): Tooltip = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (format != null) __obj.updateDynamic("format")(format)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[Tooltip]
  }
}

