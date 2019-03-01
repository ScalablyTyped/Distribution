package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectedRangeSettings extends js.Object {
  /** Specifies the ending range of range navigator.
    * @Default {null}
    */
  var end: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the starting range of range navigator.
    * @Default {null}
    */
  var start: js.UndefOr[java.lang.String] = js.undefined
}

object SelectedRangeSettings {
  @scala.inline
  def apply(end: java.lang.String = null, start: java.lang.String = null): SelectedRangeSettings = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[SelectedRangeSettings]
  }
}

