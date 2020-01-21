package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollRangeSettings extends js.Object {
  /** Specifies the ending range of range navigator scrollbar and that should be greater than the rangenavigator datasource end value.
    * @Default {null}
    */
  var end: js.UndefOr[String] = js.undefined
  /** Specifies the starting range of range navigator scrollbar and that should be less than the rangenavigator datasource start value.
    * @Default {null}
    */
  var start: js.UndefOr[String] = js.undefined
}

object ScrollRangeSettings {
  @scala.inline
  def apply(end: String = null, start: String = null): ScrollRangeSettings = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollRangeSettings]
  }
}

