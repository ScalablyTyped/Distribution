package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendTitleFont extends js.Object {
  /** Font family for the text in legend title.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** Font style for legend title.
    * @Default {normal. See FontStyle}
    */
  var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
  /** Font weight for legend title.
    * @Default {normal. See FontWeight}
    */
  var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
  /** Font size for legend title.
    * @Default {12px}
    */
  var size: js.UndefOr[String] = js.undefined
}

object LegendTitleFont {
  @scala.inline
  def apply(
    fontFamily: String = null,
    fontStyle: FontStyle | String = null,
    fontWeight: FontWeight | String = null,
    size: String = null
  ): LegendTitleFont = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[LegendTitleFont]
  }
}

