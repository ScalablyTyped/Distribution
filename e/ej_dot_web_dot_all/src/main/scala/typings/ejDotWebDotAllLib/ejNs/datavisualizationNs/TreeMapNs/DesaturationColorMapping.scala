package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DesaturationColorMapping extends js.Object {
  /** Specifies the color for desaturationColorMapping
    * @Default {null}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the from value for desaturation color mapping
    * @Default {0}
    */
  var from: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the rangeMaximum value for desaturation color mapping
    * @Default {0}
    */
  var rangeMaximum: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the rangeMinimum value for desaturation color mapping
    * @Default {0}
    */
  var rangeMinimum: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the to value for desaturation color mapping
    * @Default {0}
    */
  var to: js.UndefOr[scala.Double] = js.undefined
}

object DesaturationColorMapping {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    from: scala.Int | scala.Double = null,
    rangeMaximum: scala.Int | scala.Double = null,
    rangeMinimum: scala.Int | scala.Double = null,
    to: scala.Int | scala.Double = null
  ): DesaturationColorMapping = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (rangeMaximum != null) __obj.updateDynamic("rangeMaximum")(rangeMaximum.asInstanceOf[js.Any])
    if (rangeMinimum != null) __obj.updateDynamic("rangeMinimum")(rangeMinimum.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesaturationColorMapping]
  }
}

