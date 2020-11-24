package typings.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceMethodSettings extends js.Object {
  
  /** Allows you to set the custom name for the service method that is responsible for updating the report with the calculated member.
    * @Default {CalculatedMember}
    */
  var calculatedMember: js.UndefOr[String] = js.native
  
  /** Allows you to set the custom name for the service method that is responsible for updating the entire report and widget, while changing the cube.
    * @Default {CubeChanged}
    */
  var cubeChanged: js.UndefOr[String] = js.native
  
  /** Allows you to set the custom name for the service method that is responsible for performing the drill through operation in the data table.
    * @Default {DrillThroughDataTable}
    */
  var drillThroughDataTable: js.UndefOr[String] = js.native
  
  /** Allows you to set the custom name for the service method that is responsible for performing the drill through operation.
    * @Default {DrillThroughHierarchies}
    */
  var drillThroughHierarchies: js.UndefOr[String] = js.native
  
  /** Allows to set the custom name for the service method responsible for exporting.
    * @Default {Export}
    */
  var exportPivotClient: js.UndefOr[String] = js.native
  
  /** Allows you to set the custom name for the service method that is responsible to get the members for tree-view in the member-editor dialog.
    * @Default {FetchMemberTreeNodes}
    */
  var fetchMemberTreeNodes: js.UndefOr[String] = js.native
  
  /** Allows you to set the custom name for the service method that is responsible for fetching the report names from the database.
    * @Default {FetchReportListFromDB}
    */
  var fetchReportList: js.UndefOr[String] = js.native
  
  /** Allows you to set the custom name for the service method that is responsible for updating the report while filtering the members.
    * @Default {FilterElement}
    */
  var filterElement: js.UndefOr[String] = js.native
  
  /** Allows you to set the custom name for the service method that is responsible for initializing the pivot client.
    * @Default {InitializeClient}
    */
  var initialize: js.UndefOr[String] = js.native
  
  /** Allows you to set the custom name for the service method that is responsible for loading a report collection from the database.
    * @Default {LoadReportFromDB}
    */
  var loadReport: js.UndefOr[String] = js.native
  
  /** Allows you to set the custom name for the service method that is responsible for retrieving the MDX query for the current report.
    * @Default {GetMDXQuery}
    */
  var mdxQuery: js.UndefOr[String] = js.native
  
  /** Allows you to set the custom name for the service method that is responsible for updating the tree-view in the cube browser, while changing the measure group.
    * @Default {MeasureGroupChanged}
    */
  var measureGroupChanged: js.UndefOr[String] = js.native
  
  /** Allows you to set the custom name for the service method that is responsible to get the child members, on tree-view node expansion.
    * @Default {MemberExpanded}
    */
  var memberExpand: js.UndefOr[String] = js.native
  
  /** Allows you to set the custom name for the service method that is responsible for updating the report while dropping a node/split button in the axis element builder.
    * @Default {NodeDropped}
    */
  var nodeDropped: js.UndefOr[String] = js.native
  
  /** Allows you to set the custom name for the service method while navigating between the pages in the paged pivot client.
    * @Default {Paging}
    */
  var paging: js.UndefOr[String] = js.native
  
  /** Allows you to set the custom name for the service method that is responsible to remove a report collection from the database.
    * @Default {RemoveReportFromDB}
    */
  var removeDBReport: js.UndefOr[String] = js.native
  
  /** Allows you to set the custom name for the service method that is responsible to update the report while removing the split button from the axis element builder.
    * @Default {RemoveSplitButton}
    */
  var removeSplitButton: js.UndefOr[String] = js.native
  
  /** Allows you to set the custom name for the service method that is responsible for renaming the report collection in the database.
    * @Default {RenameReportInDB}
    */
  var renameDBReport: js.UndefOr[String] = js.native
  
  /** Allows you to set the custom name for the service method that is responsible for saving the report collection in the database.
    * @Default {SaveReportToDB}
    */
  var saveReport: js.UndefOr[String] = js.native
  
  /** Allows you to set the custom name for the service method that is responsible for toggling the elements in the row and column axes.
    * @Default {ToggleAxis}
    */
  var toggleAxis: js.UndefOr[String] = js.native
  
  /** Allows you to set the custom name for the service method that is responsible for all the toolbar operations.
    * @Default {ToolbarOperations}
    */
  var toolbarServices: js.UndefOr[String] = js.native
  
  /** Allows you to set the custom name for the service method that is responsible for updating the report collection.
    * @Default {UpdateReport}
    */
  var updateReport: js.UndefOr[String] = js.native
  
  /** Allows you to set the custom name for the service method that is responsible for performing value sorting operation in the PivotClient.
    * @Default {ValueSorting}
    */
  var valueSorting: js.UndefOr[String] = js.native
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
    def setCalculatedMember(value: String): Self = this.set("calculatedMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalculatedMember: Self = this.set("calculatedMember", js.undefined)
    
    @scala.inline
    def setCubeChanged(value: String): Self = this.set("cubeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCubeChanged: Self = this.set("cubeChanged", js.undefined)
    
    @scala.inline
    def setDrillThroughDataTable(value: String): Self = this.set("drillThroughDataTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrillThroughDataTable: Self = this.set("drillThroughDataTable", js.undefined)
    
    @scala.inline
    def setDrillThroughHierarchies(value: String): Self = this.set("drillThroughHierarchies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrillThroughHierarchies: Self = this.set("drillThroughHierarchies", js.undefined)
    
    @scala.inline
    def setExportPivotClient(value: String): Self = this.set("exportPivotClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportPivotClient: Self = this.set("exportPivotClient", js.undefined)
    
    @scala.inline
    def setFetchMemberTreeNodes(value: String): Self = this.set("fetchMemberTreeNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchMemberTreeNodes: Self = this.set("fetchMemberTreeNodes", js.undefined)
    
    @scala.inline
    def setFetchReportList(value: String): Self = this.set("fetchReportList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchReportList: Self = this.set("fetchReportList", js.undefined)
    
    @scala.inline
    def setFilterElement(value: String): Self = this.set("filterElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterElement: Self = this.set("filterElement", js.undefined)
    
    @scala.inline
    def setInitialize(value: String): Self = this.set("initialize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialize: Self = this.set("initialize", js.undefined)
    
    @scala.inline
    def setLoadReport(value: String): Self = this.set("loadReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadReport: Self = this.set("loadReport", js.undefined)
    
    @scala.inline
    def setMdxQuery(value: String): Self = this.set("mdxQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMdxQuery: Self = this.set("mdxQuery", js.undefined)
    
    @scala.inline
    def setMeasureGroupChanged(value: String): Self = this.set("measureGroupChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasureGroupChanged: Self = this.set("measureGroupChanged", js.undefined)
    
    @scala.inline
    def setMemberExpand(value: String): Self = this.set("memberExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberExpand: Self = this.set("memberExpand", js.undefined)
    
    @scala.inline
    def setNodeDropped(value: String): Self = this.set("nodeDropped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeDropped: Self = this.set("nodeDropped", js.undefined)
    
    @scala.inline
    def setPaging(value: String): Self = this.set("paging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaging: Self = this.set("paging", js.undefined)
    
    @scala.inline
    def setRemoveDBReport(value: String): Self = this.set("removeDBReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveDBReport: Self = this.set("removeDBReport", js.undefined)
    
    @scala.inline
    def setRemoveSplitButton(value: String): Self = this.set("removeSplitButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveSplitButton: Self = this.set("removeSplitButton", js.undefined)
    
    @scala.inline
    def setRenameDBReport(value: String): Self = this.set("renameDBReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenameDBReport: Self = this.set("renameDBReport", js.undefined)
    
    @scala.inline
    def setSaveReport(value: String): Self = this.set("saveReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveReport: Self = this.set("saveReport", js.undefined)
    
    @scala.inline
    def setToggleAxis(value: String): Self = this.set("toggleAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleAxis: Self = this.set("toggleAxis", js.undefined)
    
    @scala.inline
    def setToolbarServices(value: String): Self = this.set("toolbarServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarServices: Self = this.set("toolbarServices", js.undefined)
    
    @scala.inline
    def setUpdateReport(value: String): Self = this.set("updateReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateReport: Self = this.set("updateReport", js.undefined)
    
    @scala.inline
    def setValueSorting(value: String): Self = this.set("valueSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueSorting: Self = this.set("valueSorting", js.undefined)
  }
}
