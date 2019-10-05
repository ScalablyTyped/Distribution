package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

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
  def apply(interval: Int | Double = null, max: Int | Double = null, min: Int | Double = null): ValueAxisSettingsRange = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAxisSettingsRange]
  }
}

