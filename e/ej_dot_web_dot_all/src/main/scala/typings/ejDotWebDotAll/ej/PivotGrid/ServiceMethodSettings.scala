package typings.ejDotWebDotAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceMethodSettings extends js.Object {
  /** Allows you to set the custom name for the service method that is responsible for adding a calculated field to the report.
    * @Default {CalculatedField}
    */
  var calculatedField: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for editing the cells.
    * @Default {CellEditing}
    */
  var cellEditing: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method responsible for performing server-side actions based on defer update.
    * @Default {DeferUpdate}
    */
  var deferUpdate: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for service method which is responsible for drill up/down operation in the PivotGrid.
    * @Default {DrillGrid}
    */
  var drillDown: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for performing drill through operation in the data table.
    * @Default {DrillThroughDataTable}
    */
  var drillThroughDataTable: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for performing the drill through operation.
    * @Default {DrillThroughHierarchies}
    */
  var drillThroughHierarchies: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for exporting.
    * @Default {Export}
    */
  var exportPivotGrid: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for getting values of the tree-view inside filter dialog.
    * @Default {FetchMembers}
    */
  var fetchMembers: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for filtering operation in the PivotGrid.
    * @Default {Filtering}
    */
  var filtering: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for initializing the PivotGrid.
    * @Default {InitializeGrid}
    */
  var initialize: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for loading a report from the database.
    * @Default {LoadReportFromDB}
    */
  var loadReport: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for expanding members in the member editor.
    * @Default {MemberExpanded}
    */
  var memberExpand: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for the server-side action when dropping a node from the field list.
    * @Default {NodeDropped}
    */
  var nodeDropped: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for server-side action when changing the checked state of a node in the field list.
    * @Default {NodeStateModified}
    */
  var nodeStateModified: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for performing paging operation in the PivotGrid.
    * @Default {Paging}
    */
  var paging: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for removing the pivot button from the GroupingBar/field list.
    * @Default {RemoveButton}
    */
  var removeButton: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for saving the current report to the database.
    * @Default {SaveReport}
    */
  var saveReport: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for sorting operation in the PivotGrid.
    * @Default {Sorting}
    */
  var sorting: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for performing value sorting operation in the PivotGrid.
    * @Default {ValueSorting}
    */
  var valueSorting: js.UndefOr[String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for write-back operation in the OLAP Cube. This is applicable only in the server-side component.
    * @Default {WriteBack}
    */
  var writeBack: js.UndefOr[String] = js.undefined
}

object ServiceMethodSettings {
  @scala.inline
  def apply(
    calculatedField: String = null,
    cellEditing: String = null,
    deferUpdate: String = null,
    drillDown: String = null,
    drillThroughDataTable: String = null,
    drillThroughHierarchies: String = null,
    exportPivotGrid: String = null,
    fetchMembers: String = null,
    filtering: String = null,
    initialize: String = null,
    loadReport: String = null,
    memberExpand: String = null,
    nodeDropped: String = null,
    nodeStateModified: String = null,
    paging: String = null,
    removeButton: String = null,
    saveReport: String = null,
    sorting: String = null,
    valueSorting: String = null,
    writeBack: String = null
  ): ServiceMethodSettings = {
    val __obj = js.Dynamic.literal()
    if (calculatedField != null) __obj.updateDynamic("calculatedField")(calculatedField.asInstanceOf[js.Any])
    if (cellEditing != null) __obj.updateDynamic("cellEditing")(cellEditing.asInstanceOf[js.Any])
    if (deferUpdate != null) __obj.updateDynamic("deferUpdate")(deferUpdate.asInstanceOf[js.Any])
    if (drillDown != null) __obj.updateDynamic("drillDown")(drillDown.asInstanceOf[js.Any])
    if (drillThroughDataTable != null) __obj.updateDynamic("drillThroughDataTable")(drillThroughDataTable.asInstanceOf[js.Any])
    if (drillThroughHierarchies != null) __obj.updateDynamic("drillThroughHierarchies")(drillThroughHierarchies.asInstanceOf[js.Any])
    if (exportPivotGrid != null) __obj.updateDynamic("exportPivotGrid")(exportPivotGrid.asInstanceOf[js.Any])
    if (fetchMembers != null) __obj.updateDynamic("fetchMembers")(fetchMembers.asInstanceOf[js.Any])
    if (filtering != null) __obj.updateDynamic("filtering")(filtering.asInstanceOf[js.Any])
    if (initialize != null) __obj.updateDynamic("initialize")(initialize.asInstanceOf[js.Any])
    if (loadReport != null) __obj.updateDynamic("loadReport")(loadReport.asInstanceOf[js.Any])
    if (memberExpand != null) __obj.updateDynamic("memberExpand")(memberExpand.asInstanceOf[js.Any])
    if (nodeDropped != null) __obj.updateDynamic("nodeDropped")(nodeDropped.asInstanceOf[js.Any])
    if (nodeStateModified != null) __obj.updateDynamic("nodeStateModified")(nodeStateModified.asInstanceOf[js.Any])
    if (paging != null) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (removeButton != null) __obj.updateDynamic("removeButton")(removeButton.asInstanceOf[js.Any])
    if (saveReport != null) __obj.updateDynamic("saveReport")(saveReport.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    if (valueSorting != null) __obj.updateDynamic("valueSorting")(valueSorting.asInstanceOf[js.Any])
    if (writeBack != null) __obj.updateDynamic("writeBack")(writeBack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceMethodSettings]
  }
}

