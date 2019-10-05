package typings.ejDotWebDotAll.ej.SunburstChart

import typings.ejDotWebDotAll.ej.datavisualization.Sunburst.FontStyle
import typings.ejDotWebDotAll.ej.datavisualization.Sunburst.FontWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipFont extends js.Object {
  /** Font color of the text in the tooltip.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Font Family for the tooltip.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** Specifies the font Style for the tooltip.
    * @Default {Normal}
    */
  var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
  /** Specifies the font weight for the tooltip.
    * @Default {Regular}
    */
  var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
  /** Opacity for text in the tooltip.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Font size for text in the tooltip.
    * @Default {12px}
    */
  var size: js.UndefOr[String] = js.undefined
}

object TooltipFont {
  @scala.inline
  def apply(
    color: String = null,
    fontFamily: String = null,
    fontStyle: FontStyle | String = null,
    fontWeight: FontWeight | String = null,
    opacity: Int | Double = null,
    size: String = null
  ): TooltipFont = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[TooltipFont]
  }
}

