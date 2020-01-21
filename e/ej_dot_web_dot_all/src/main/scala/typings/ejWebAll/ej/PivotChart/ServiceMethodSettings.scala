package typings.ejWebAll.ej.PivotChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceMethodSettings extends js.Object {
  /** Allows you to set the custom name for the service method that is responsible for drilling up/down in the pivot chart.
    * @Default {DrillChart}
    */
  var drillDown: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method which is responsible for exporting the pivot chart.
    * @Default {Export}
    */
  var exportPivotChart: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method which is responsible for initializing the pivot chart.
    * @Default {InitializeChart}
    */
  var initialize: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method which is responsible for navigating between pages in the paged pivot chart.
    * @Default {Paging}
    */
  var paging: js.UndefOr[String] = js.undefined
}

object ServiceMethodSettings {
  @scala.inline
  def apply(
    drillDown: String = null,
    exportPivotChart: String = null,
    initialize: String = null,
    paging: String = null
  ): ServiceMethodSettings = {
    val __obj = js.Dynamic.literal()
    if (drillDown != null) __obj.updateDynamic("drillDown")(drillDown.asInstanceOf[js.Any])
    if (exportPivotChart != null) __obj.updateDynamic("exportPivotChart")(exportPivotChart.asInstanceOf[js.Any])
    if (initialize != null) __obj.updateDynamic("initialize")(initialize.asInstanceOf[js.Any])
    if (paging != null) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceMethodSettings]
  }
}

