package typings.ejWebAll.ej.PivotChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceMethodSettings extends js.Object {
  /** Allows you to set the custom name for the service method that is responsible for drilling up/down in the pivot chart.
    * @Default {DrillChart}
    */
  var drillDown: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method which is responsible for exporting the pivot chart.
    * @Default {Export}
    */
  var exportPivotChart: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method which is responsible for initializing the pivot chart.
    * @Default {InitializeChart}
    */
  var initialize: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method which is responsible for navigating between pages in the paged pivot chart.
    * @Default {Paging}
    */
  var paging: js.UndefOr[String] = js.native
}

object ServiceMethodSettings {
  @scala.inline
  def apply(): ServiceMethodSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceMethodSettings]
  }
  @scala.inline
  implicit class ServiceMethodSettingsOps[Self <: ServiceMethodSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDrillDown(value: String): Self = this.set("drillDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrillDown: Self = this.set("drillDown", js.undefined)
    @scala.inline
    def setExportPivotChart(value: String): Self = this.set("exportPivotChart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportPivotChart: Self = this.set("exportPivotChart", js.undefined)
    @scala.inline
    def setInitialize(value: String): Self = this.set("initialize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialize: Self = this.set("initialize", js.undefined)
    @scala.inline
    def setPaging(value: String): Self = this.set("paging", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaging: Self = this.set("paging", js.undefined)
  }
  
}

