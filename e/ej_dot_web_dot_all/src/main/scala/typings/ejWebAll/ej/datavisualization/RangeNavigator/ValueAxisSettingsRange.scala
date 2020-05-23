package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueAxisSettingsRange extends js.Object {
  /** Default Value
    * @Default {null}
    */
  var interval: js.UndefOr[Double] = js.undefined
  /** Default Value
    * @Default {null}
    */
  var max: js.UndefOr[Double] = js.undefined
  /** Default Value
    * @Default {null}
    */
  var min: js.UndefOr[Double] = js.undefined
}

object ValueAxisSettingsRange {
  @scala.inline
  def apply(
    interval: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined
  ): ValueAxisSettingsRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAxisSettingsRange]
  }
}

