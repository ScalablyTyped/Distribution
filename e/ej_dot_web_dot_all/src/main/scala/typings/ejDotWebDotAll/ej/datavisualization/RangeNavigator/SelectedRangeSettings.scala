package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectedRangeSettings extends js.Object {
  /** Specifies the ending range of range navigator.
    * @Default {null}
    */
  var end: js.UndefOr[String] = js.undefined
  /** Specifies the starting range of range navigator.
    * @Default {null}
    */
  var start: js.UndefOr[String] = js.undefined
}

object SelectedRangeSettings {
  @scala.inline
  def apply(end: String = null, start: String = null): SelectedRangeSettings = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedRangeSettings]
  }
}

