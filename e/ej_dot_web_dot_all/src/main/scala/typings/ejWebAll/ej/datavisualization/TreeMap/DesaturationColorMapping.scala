package typings.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DesaturationColorMapping extends js.Object {
  /** Specifies the color for desaturationColorMapping
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the from value for desaturation color mapping
    * @Default {0}
    */
  var from: js.UndefOr[Double] = js.undefined
  /** Specifies the rangeMaximum value for desaturation color mapping
    * @Default {0}
    */
  var rangeMaximum: js.UndefOr[Double] = js.undefined
  /** Specifies the rangeMinimum value for desaturation color mapping
    * @Default {0}
    */
  var rangeMinimum: js.UndefOr[Double] = js.undefined
  /** Specifies the to value for desaturation color mapping
    * @Default {0}
    */
  var to: js.UndefOr[Double] = js.undefined
}

object DesaturationColorMapping {
  @scala.inline
  def apply(
    color: String = null,
    from: js.UndefOr[Double] = js.undefined,
    rangeMaximum: js.UndefOr[Double] = js.undefined,
    rangeMinimum: js.UndefOr[Double] = js.undefined,
    to: js.UndefOr[Double] = js.undefined
  ): DesaturationColorMapping = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeMaximum)) __obj.updateDynamic("rangeMaximum")(rangeMaximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeMinimum)) __obj.updateDynamic("rangeMinimum")(rangeMinimum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesaturationColorMapping]
  }
}

