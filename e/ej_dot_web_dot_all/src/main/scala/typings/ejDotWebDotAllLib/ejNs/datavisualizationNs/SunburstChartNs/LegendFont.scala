package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendFont extends js.Object {
  /** Font family for legend item text.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /** Font style for legend item text.
    * @Default {Normal. See FontStyle}
    */
  var fontStyle: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.FontStyle | java.lang.String
  ] = js.undefined
  /** Font weight for legend item text.
    * @Default {Regular. See FontWeight}
    */
  var fontWeight: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.FontWeight | java.lang.String
  ] = js.undefined
  /** Font size for legend item text.
    * @Default {12px}
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object LegendFont {
  @scala.inline
  def apply(
    fontFamily: java.lang.String = null,
    fontStyle: ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.FontStyle | java.lang.String = null,
    fontWeight: ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.FontWeight | java.lang.String = null,
    size: java.lang.String = null
  ): LegendFont = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[LegendFont]
  }
}

