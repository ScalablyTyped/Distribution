package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendFont extends js.Object {
  /** Font color of the text for legend items.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Font family for legend item text.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** Font style for legend item text.
    * @Default {Normal}
    */
  var fontStyle: js.UndefOr[String] = js.undefined
  /** Font weight for legend item text.
    * @Default {Regular}
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  /** Font size for legend item text.
    * @Default {12px}
    */
  var size: js.UndefOr[String] = js.undefined
}

object LegendFont {
  @scala.inline
  def apply(
    color: String = null,
    fontFamily: String = null,
    fontStyle: String = null,
    fontWeight: String = null,
    size: String = null
  ): LegendFont = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[LegendFont]
  }
}

