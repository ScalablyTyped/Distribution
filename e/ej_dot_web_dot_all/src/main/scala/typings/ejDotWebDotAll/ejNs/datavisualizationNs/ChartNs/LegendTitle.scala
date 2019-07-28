package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendTitle extends js.Object {
  /** Options to customize the font used for legend title
    */
  var font: js.UndefOr[LegendTitleFont] = js.undefined
  /** Text to be displayed in legend title.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Alignment of the legend title.
    * @Default {center. See Alignment}
    */
  var textAlignment: js.UndefOr[Alignment | String] = js.undefined
}

object LegendTitle {
  @scala.inline
  def apply(font: LegendTitleFont = null, text: String = null, textAlignment: Alignment | String = null): LegendTitle = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendTitle]
  }
}

