package typings
package ejDotWebDotAllLib.ejNs.PivotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ServiceMethodSettings extends js.Object {
  /** Allows you to set the custom name for the service method that is responsible for updating the report with the calculated member.
               * @Default {CalculatedMember}
               */
  var calculatedMember: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for updating the entire report and widget, while changing the cube.
               * @Default {CubeChanged}
               */
  var cubeChanged: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for performing the drill through operation in the data table.
               * @Default {DrillThroughDataTable}
               */
  var drillThroughDataTable: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for performing the drill through operation.
               * @Default {DrillThroughHierarchies}
               */
  var drillThroughHierarchies: js.UndefOr[java.lang.String] = js.undefined
  /** Allows to set the custom name for the service method responsible for exporting.
               * @Default {Export}
               */
  var exportPivotClient: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible to get the members for tree-view in the member-editor dialog.
               * @Default {FetchMemberTreeNodes}
               */
  var fetchMemberTreeNodes: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for fetching the report names from the database.
               * @Default {FetchReportListFromDB}
               */
  var fetchReportList: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for updating the report while filtering the members.
               * @Default {FilterElement}
               */
  var filterElement: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for initializing the pivot client.
               * @Default {InitializeClient}
               */
  var initialize: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for loading a report collection from the database.
               * @Default {LoadReportFromDB}
               */
  var loadReport: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for retrieving the MDX query for the current report.
               * @Default {GetMDXQuery}
               */
  var mdxQuery: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for updating the tree-view in the cube browser, while changing the measure group.
               * @Default {MeasureGroupChanged}
               */
  var measureGroupChanged: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible to get the child members, on tree-view node expansion.
               * @Default {MemberExpanded}
               */
  var memberExpand: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for updating the report while dropping a node/split button in the axis element builder.
               * @Default {NodeDropped}
               */
  var nodeDropped: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method while navigating between the pages in the paged pivot client.
               * @Default {Paging}
               */
  var paging: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible to remove a report collection from the database.
               * @Default {RemoveReportFromDB}
               */
  var removeDBReport: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible to update the report while removing the split button from the axis element builder.
               * @Default {RemoveSplitButton}
               */
  var removeSplitButton: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for renaming the report collection in the database.
               * @Default {RenameReportInDB}
               */
  var renameDBReport: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for saving the report collection in the database.
               * @Default {SaveReportToDB}
               */
  var saveReport: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for toggling the elements in the row and column axes.
               * @Default {ToggleAxis}
               */
  var toggleAxis: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for all the toolbar operations.
               * @Default {ToolbarOperations}
               */
  var toolbarServices: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for updating the report collection.
               * @Default {UpdateReport}
               */
  var updateReport: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the custom name for the service method that is responsible for performing value sorting operation in the PivotClient.
               * @Default {ValueSorting}
               */
  var valueSorting: js.UndefOr[java.lang.String] = js.undefined
}

