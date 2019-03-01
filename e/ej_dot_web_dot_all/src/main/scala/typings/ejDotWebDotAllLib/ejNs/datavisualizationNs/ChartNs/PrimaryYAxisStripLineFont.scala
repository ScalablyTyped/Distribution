package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryYAxisStripLineFont extends js.Object {
  /** Font color of the strip line text.
    * @Default {black}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Font family of the strip line text.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /** Font style of the strip line text.
    * @Default {Normal}
    */
  var fontStyle: js.UndefOr[FontStyle | java.lang.String] = js.undefined
  /** Font weight of the strip line text.
    * @Default {regular}
    */
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  /** Opacity of the strip line text.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Font size of the strip line text.
    * @Default {12px}
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object PrimaryYAxisStripLineFont {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontStyle: FontStyle | java.lang.String = null,
    fontWeight: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    size: java.lang.String = null
  ): PrimaryYAxisStripLineFont = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[PrimaryYAxisStripLineFont]
  }
}

