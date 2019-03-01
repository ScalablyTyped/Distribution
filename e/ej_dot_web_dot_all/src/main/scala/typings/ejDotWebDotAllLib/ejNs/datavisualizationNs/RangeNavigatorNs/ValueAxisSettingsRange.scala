package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueAxisSettingsRange extends js.Object {
  /** Default Value
    * @Default {null}
    */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /** Default Value
    * @Default {null}
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /** Default Value
    * @Default {null}
    */
  var min: js.UndefOr[scala.Double] = js.undefined
}

object ValueAxisSettingsRange {
  @scala.inline
  def apply(
    interval: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null
  ): ValueAxisSettingsRange = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAxisSettingsRange]
  }
}

