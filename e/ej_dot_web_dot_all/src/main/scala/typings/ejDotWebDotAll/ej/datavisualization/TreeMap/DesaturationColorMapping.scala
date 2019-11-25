package typings.ejDotWebDotAll.ej.datavisualization.TreeMap

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
    from: Int | Double = null,
    rangeMaximum: Int | Double = null,
    rangeMinimum: Int | Double = null,
    to: Int | Double = null
  ): DesaturationColorMapping = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (rangeMaximum != null) __obj.updateDynamic("rangeMaximum")(rangeMaximum.asInstanceOf[js.Any])
    if (rangeMinimum != null) __obj.updateDynamic("rangeMinimum")(rangeMinimum.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesaturationColorMapping]
  }
}

