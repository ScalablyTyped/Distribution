package typings
package ejDotWebDotAllLib.ejNs.SunburstChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendTitle extends js.Object {
  /** Options to customize the font used for legend title
    */
  var font: js.UndefOr[LegendTitleFont] = js.undefined
  /** Text to be displayed in legend title.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Alignment of the legend title.
    * @Default {center. See Alignment}
    */
  var textAlignment: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstAlignment | java.lang.String
  ] = js.undefined
  /** Enables or disables the legend title.
    * @Default {true}
    */
  var visible: js.UndefOr[java.lang.String] = js.undefined
}

object LegendTitle {
  @scala.inline
  def apply(
    font: LegendTitleFont = null,
    text: java.lang.String = null,
    textAlignment: ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstAlignment | java.lang.String = null,
    visible: java.lang.String = null
  ): LegendTitle = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[LegendTitle]
  }
}

