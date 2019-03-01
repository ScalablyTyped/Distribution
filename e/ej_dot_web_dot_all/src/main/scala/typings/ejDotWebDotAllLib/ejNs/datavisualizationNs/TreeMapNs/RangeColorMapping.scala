package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeColorMapping extends js.Object {
  /** Specifies the color value for rangeColorMapping.
    * @Default {null}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the from value for rangeColorMapping.
    * @Default {-1}
    */
  var from: js.UndefOr[scala.Double] = js.undefined
  /** specifies the gradient colors for th given range value
    * @Default {[]}
    */
  var gradientColors: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the legend label value for rangeColorMapping.
    * @Default {null}
    */
  var legendLabel: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the to value for rangeColorMapping.
    * @Default {-1}
    */
  var to: js.UndefOr[scala.Double] = js.undefined
}

object RangeColorMapping {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    from: scala.Int | scala.Double = null,
    gradientColors: js.Array[_] = null,
    legendLabel: java.lang.String = null,
    to: scala.Int | scala.Double = null
  ): RangeColorMapping = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (gradientColors != null) __obj.updateDynamic("gradientColors")(gradientColors)
    if (legendLabel != null) __obj.updateDynamic("legendLabel")(legendLabel)
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeColorMapping]
  }
}

