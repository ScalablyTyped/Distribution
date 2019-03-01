package typings
package ejDotWebDotAllLib.ejNs.PivotChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptions extends js.Object {
  /** Allows you to set the specific chart type for the pivot chart widget.
    * @Default {ej.PivotChart.ChartTypes.Column}
    */
  var `type`: js.UndefOr[ChartTypes | java.lang.String] = js.undefined
}

object CommonSeriesOptions {
  @scala.inline
  def apply(`type`: ChartTypes | java.lang.String = null): CommonSeriesOptions = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSeriesOptions]
  }
}

