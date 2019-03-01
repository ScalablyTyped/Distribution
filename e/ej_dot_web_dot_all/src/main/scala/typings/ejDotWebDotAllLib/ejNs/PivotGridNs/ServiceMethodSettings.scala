package typings
package ejDotWebDotAllLib.ejNs.PivotGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceMethodSettings extends js.Object {
  /** Allows you to set the custom name for the service method that is responsible for adding a calculated field to the report.
    * @Default {CalculatedField}
    */
  var calculatedField: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for editing the cells.
    * @Default {CellEditing}
    */
  var cellEditing: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method responsible for performing server-side actions based on defer update.
    * @Default {DeferUpdate}
    */
  var deferUpdate: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for service method which is responsible for drill up/down operation in the PivotGrid.
    * @Default {DrillGrid}
    */
  var drillDown: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for performing drill through operation in the data table.
    * @Default {DrillThroughDataTable}
    */
  var drillThroughDataTable: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for performing the drill through operation.
    * @Default {DrillThroughHierarchies}
    */
  var drillThroughHierarchies: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for exporting.
    * @Default {Export}
    */
  var exportPivotGrid: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for getting values of the tree-view inside filter dialog.
    * @Default {FetchMembers}
    */
  var fetchMembers: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for filtering operation in the PivotGrid.
    * @Default {Filtering}
    */
  var filtering: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for initializing the PivotGrid.
    * @Default {InitializeGrid}
    */
  var initialize: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for loading a report from the database.
    * @Default {LoadReportFromDB}
    */
  var loadReport: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for expanding members in the member editor.
    * @Default {MemberExpanded}
    */
  var memberExpand: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for the server-side action when dropping a node from the field list.
    * @Default {NodeDropped}
    */
  var nodeDropped: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for server-side action when changing the checked state of a node in the field list.
    * @Default {NodeStateModified}
    */
  var nodeStateModified: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for performing paging operation in the PivotGrid.
    * @Default {Paging}
    */
  var paging: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for removing the pivot button from the GroupingBar/field list.
    * @Default {RemoveButton}
    */
  var removeButton: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for saving the current report to the database.
    * @Default {SaveReport}
    */
  var saveReport: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for sorting operation in the PivotGrid.
    * @Default {Sorting}
    */
  var sorting: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for performing value sorting operation in the PivotGrid.
    * @Default {ValueSorting}
    */
  var valueSorting: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for write-back operation in the OLAP Cube. This is applicable only in the server-side component.
    * @Default {WriteBack}
    */
  var writeBack: js.UndefOr[java.lang.String] = js.undefined
}

object ServiceMethodSettings {
  @scala.inline
  def apply(
    calculatedField: java.lang.String = null,
    cellEditing: java.lang.String = null,
    deferUpdate: java.lang.String = null,
    drillDown: java.lang.String = null,
    drillThroughDataTable: java.lang.String = null,
    drillThroughHierarchies: java.lang.String = null,
    exportPivotGrid: java.lang.String = null,
    fetchMembers: java.lang.String = null,
    filtering: java.lang.String = null,
    initialize: java.lang.String = null,
    loadReport: java.lang.String = null,
    memberExpand: java.lang.String = null,
    nodeDropped: java.lang.String = null,
    nodeStateModified: java.lang.String = null,
    paging: java.lang.String = null,
    removeButton: java.lang.String = null,
    saveReport: java.lang.String = null,
    sorting: java.lang.String = null,
    valueSorting: java.lang.String = null,
    writeBack: java.lang.String = null
  ): ServiceMethodSettings = {
    val __obj = js.Dynamic.literal()
    if (calculatedField != null) __obj.updateDynamic("calculatedField")(calculatedField)
    if (cellEditing != null) __obj.updateDynamic("cellEditing")(cellEditing)
    if (deferUpdate != null) __obj.updateDynamic("deferUpdate")(deferUpdate)
    if (drillDown != null) __obj.updateDynamic("drillDown")(drillDown)
    if (drillThroughDataTable != null) __obj.updateDynamic("drillThroughDataTable")(drillThroughDataTable)
    if (drillThroughHierarchies != null) __obj.updateDynamic("drillThroughHierarchies")(drillThroughHierarchies)
    if (exportPivotGrid != null) __obj.updateDynamic("exportPivotGrid")(exportPivotGrid)
    if (fetchMembers != null) __obj.updateDynamic("fetchMembers")(fetchMembers)
    if (filtering != null) __obj.updateDynamic("filtering")(filtering)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (loadReport != null) __obj.updateDynamic("loadReport")(loadReport)
    if (memberExpand != null) __obj.updateDynamic("memberExpand")(memberExpand)
    if (nodeDropped != null) __obj.updateDynamic("nodeDropped")(nodeDropped)
    if (nodeStateModified != null) __obj.updateDynamic("nodeStateModified")(nodeStateModified)
    if (paging != null) __obj.updateDynamic("paging")(paging)
    if (removeButton != null) __obj.updateDynamic("removeButton")(removeButton)
    if (saveReport != null) __obj.updateDynamic("saveReport")(saveReport)
    if (sorting != null) __obj.updateDynamic("sorting")(sorting)
    if (valueSorting != null) __obj.updateDynamic("valueSorting")(valueSorting)
    if (writeBack != null) __obj.updateDynamic("writeBack")(writeBack)
    __obj.asInstanceOf[ServiceMethodSettings]
  }
}

