package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleSubtitleFont extends js.Object {
  /** Font family of sub title.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /** Font style for sub title.
    * @Default {Normal. See FontStyle}
    */
  var fontStyle: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.FontStyle | java.lang.String
  ] = js.undefined
  /** Font weight for sub title.
    * @Default {Regular. See FontWeight}
    */
  var fontWeight: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.FontWeight | java.lang.String
  ] = js.undefined
  /** Opacity of the sub title.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Font size for sub title.
    * @Default {12px}
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object TitleSubtitleFont {
  @scala.inline
  def apply(
    fontFamily: java.lang.String = null,
    fontStyle: ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.FontStyle | java.lang.String = null,
    fontWeight: ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.FontWeight | java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    size: java.lang.String = null
  ): TitleSubtitleFont = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[TitleSubtitleFont]
  }
}

