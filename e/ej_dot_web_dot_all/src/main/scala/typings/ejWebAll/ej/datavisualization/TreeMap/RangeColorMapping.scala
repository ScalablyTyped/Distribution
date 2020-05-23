package typings.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeColorMapping extends js.Object {
  /** Specifies the color value for rangeColorMapping.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the from value for rangeColorMapping.
    * @Default {-1}
    */
  var from: js.UndefOr[Double] = js.undefined
  /** specifies the gradient colors for th given range value
    * @Default {[]}
    */
  var gradientColors: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the legend label value for rangeColorMapping.
    * @Default {null}
    */
  var legendLabel: js.UndefOr[String] = js.undefined
  /** Specifies the to value for rangeColorMapping.
    * @Default {-1}
    */
  var to: js.UndefOr[Double] = js.undefined
}

object RangeColorMapping {
  @scala.inline
  def apply(
    color: String = null,
    from: js.UndefOr[Double] = js.undefined,
    gradientColors: js.Array[_] = null,
    legendLabel: String = null,
    to: js.UndefOr[Double] = js.undefined
  ): RangeColorMapping = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (gradientColors != null) __obj.updateDynamic("gradientColors")(gradientColors.asInstanceOf[js.Any])
    if (legendLabel != null) __obj.updateDynamic("legendLabel")(legendLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeColorMapping]
  }
}

