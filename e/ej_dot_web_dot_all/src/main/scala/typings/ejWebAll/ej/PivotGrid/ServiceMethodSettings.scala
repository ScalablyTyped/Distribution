package typings.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceMethodSettings extends js.Object {
  /** Allows you to set the custom name for the service method that is responsible for adding a calculated field to the report.
    * @Default {CalculatedField}
    */
  var calculatedField: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for editing the cells.
    * @Default {CellEditing}
    */
  var cellEditing: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method responsible for performing server-side actions based on defer update.
    * @Default {DeferUpdate}
    */
  var deferUpdate: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for service method which is responsible for drill up/down operation in the PivotGrid.
    * @Default {DrillGrid}
    */
  var drillDown: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for performing drill through operation in the data table.
    * @Default {DrillThroughDataTable}
    */
  var drillThroughDataTable: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for performing the drill through operation.
    * @Default {DrillThroughHierarchies}
    */
  var drillThroughHierarchies: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for exporting.
    * @Default {Export}
    */
  var exportPivotGrid: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for getting values of the tree-view inside filter dialog.
    * @Default {FetchMembers}
    */
  var fetchMembers: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for filtering operation in the PivotGrid.
    * @Default {Filtering}
    */
  var filtering: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for initializing the PivotGrid.
    * @Default {InitializeGrid}
    */
  var initialize: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for loading a report from the database.
    * @Default {LoadReportFromDB}
    */
  var loadReport: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for expanding members in the member editor.
    * @Default {MemberExpanded}
    */
  var memberExpand: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for the server-side action when dropping a node from the field list.
    * @Default {NodeDropped}
    */
  var nodeDropped: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for server-side action when changing the checked state of a node in the field list.
    * @Default {NodeStateModified}
    */
  var nodeStateModified: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for performing paging operation in the PivotGrid.
    * @Default {Paging}
    */
  var paging: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for removing the pivot button from the GroupingBar/field list.
    * @Default {RemoveButton}
    */
  var removeButton: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for saving the current report to the database.
    * @Default {SaveReport}
    */
  var saveReport: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for sorting operation in the PivotGrid.
    * @Default {Sorting}
    */
  var sorting: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for performing value sorting operation in the PivotGrid.
    * @Default {ValueSorting}
    */
  var valueSorting: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for write-back operation in the OLAP Cube. This is applicable only in the server-side component.
    * @Default {WriteBack}
    */
  var writeBack: js.UndefOr[String] = js.native
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
    def setCalculatedField(value: String): Self = this.set("calculatedField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculatedField: Self = this.set("calculatedField", js.undefined)
    @scala.inline
    def setCellEditing(value: String): Self = this.set("cellEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellEditing: Self = this.set("cellEditing", js.undefined)
    @scala.inline
    def setDeferUpdate(value: String): Self = this.set("deferUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferUpdate: Self = this.set("deferUpdate", js.undefined)
    @scala.inline
    def setDrillDown(value: String): Self = this.set("drillDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrillDown: Self = this.set("drillDown", js.undefined)
    @scala.inline
    def setDrillThroughDataTable(value: String): Self = this.set("drillThroughDataTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrillThroughDataTable: Self = this.set("drillThroughDataTable", js.undefined)
    @scala.inline
    def setDrillThroughHierarchies(value: String): Self = this.set("drillThroughHierarchies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrillThroughHierarchies: Self = this.set("drillThroughHierarchies", js.undefined)
    @scala.inline
    def setExportPivotGrid(value: String): Self = this.set("exportPivotGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportPivotGrid: Self = this.set("exportPivotGrid", js.undefined)
    @scala.inline
    def setFetchMembers(value: String): Self = this.set("fetchMembers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchMembers: Self = this.set("fetchMembers", js.undefined)
    @scala.inline
    def setFiltering(value: String): Self = this.set("filtering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiltering: Self = this.set("filtering", js.undefined)
    @scala.inline
    def setInitialize(value: String): Self = this.set("initialize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialize: Self = this.set("initialize", js.undefined)
    @scala.inline
    def setLoadReport(value: String): Self = this.set("loadReport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadReport: Self = this.set("loadReport", js.undefined)
    @scala.inline
    def setMemberExpand(value: String): Self = this.set("memberExpand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberExpand: Self = this.set("memberExpand", js.undefined)
    @scala.inline
    def setNodeDropped(value: String): Self = this.set("nodeDropped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeDropped: Self = this.set("nodeDropped", js.undefined)
    @scala.inline
    def setNodeStateModified(value: String): Self = this.set("nodeStateModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeStateModified: Self = this.set("nodeStateModified", js.undefined)
    @scala.inline
    def setPaging(value: String): Self = this.set("paging", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaging: Self = this.set("paging", js.undefined)
    @scala.inline
    def setRemoveButton(value: String): Self = this.set("removeButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveButton: Self = this.set("removeButton", js.undefined)
    @scala.inline
    def setSaveReport(value: String): Self = this.set("saveReport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveReport: Self = this.set("saveReport", js.undefined)
    @scala.inline
    def setSorting(value: String): Self = this.set("sorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorting: Self = this.set("sorting", js.undefined)
    @scala.inline
    def setValueSorting(value: String): Self = this.set("valueSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueSorting: Self = this.set("valueSorting", js.undefined)
    @scala.inline
    def setWriteBack(value: String): Self = this.set("writeBack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteBack: Self = this.set("writeBack", js.undefined)
  }
  
}

