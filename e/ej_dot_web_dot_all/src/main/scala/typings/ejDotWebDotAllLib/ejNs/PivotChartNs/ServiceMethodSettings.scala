package typings
package ejDotWebDotAllLib.ejNs.PivotChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceMethodSettings extends js.Object {
  /** Allows you to set the custom name for the service method that is responsible for drilling up/down in the pivot chart.
    * @Default {DrillChart}
    */
  var drillDown: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method which is responsible for exporting the pivot chart.
    * @Default {Export}
    */
  var exportPivotChart: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method which is responsible for initializing the pivot chart.
    * @Default {InitializeChart}
    */
  var initialize: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method which is responsible for navigating between pages in the paged pivot chart.
    * @Default {Paging}
    */
  var paging: js.UndefOr[java.lang.String] = js.undefined
}

object ServiceMethodSettings {
  @scala.inline
  def apply(
    drillDown: java.lang.String = null,
    exportPivotChart: java.lang.String = null,
    initialize: java.lang.String = null,
    paging: java.lang.String = null
  ): ServiceMethodSettings = {
    val __obj = js.Dynamic.literal()
    if (drillDown != null) __obj.updateDynamic("drillDown")(drillDown)
    if (exportPivotChart != null) __obj.updateDynamic("exportPivotChart")(exportPivotChart)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (paging != null) __obj.updateDynamic("paging")(paging)
    __obj.asInstanceOf[ServiceMethodSettings]
  }
}

