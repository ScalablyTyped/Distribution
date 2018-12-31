package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggered for every Gantt action before its starts.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, scala.Unit]] = js.undefined
  /** Triggered for every Gantt action success event.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, scala.Unit]] = js.undefined
  /** Specifies the fields to be included in the add dialog in Gantt
    * @Default {[]}
    */
  var addDialogFields: js.UndefOr[js.Array[AddDialogField]] = js.undefined
  /** Enables or disables the ability to resize column.
    * @Default {false}
    */
  var allowColumnResize: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the ability to drag and drop the row interactively to reorder the rows
    * @Default {false}
    */
  var allowDragAndDrop: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or Disables Gantt chart editing in Gantt
    * @Default {true}
    */
  var allowGanttChartEditing: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or Disables Keyboard navigation in Gantt
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies enabling or disabling multiple sorting for Gantt columns
    * @Default {false}
    */
  var allowMultiSorting: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the option for multiple exporting
    * @Default {false}
    */
  var allowMultipleExporting: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the interactive selection of a row.
    * @Default {true}
    */
  var allowSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables sorting. When enabled, we can sort the column by clicking on the column.
    * @Default {false}
    */
  var allowSorting: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the rendering of unscheduled tasks.
    * @Default {false}
    */
  var allowUnscheduledTask: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the baseline background color in Gantt
    * @Default {#fba41c}
    */
  var baselineColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mapping property path for baseline end date in datasource
    */
  var baselineEndDateMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mapping property path for baseline start date of a task in datasource
    */
  var baselineStartDateMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Triggered while enter the edit mode in the TreeGrid cell
    */
  var beginEdit: js.UndefOr[js.Function1[/* e */ BeginEditEventArgs, scala.Unit]] = js.undefined
  /** Triggered after selected a cell
    */
  var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, scala.Unit]] = js.undefined
  /** Triggered before selecting a cell
    */
  var cellSelecting: js.UndefOr[js.Function1[/* e */ CellSelectingEventArgs, scala.Unit]] = js.undefined
  /** Specifies the template for cell tooltip
    * @Default {null}
    */
  var cellTooltipTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mapping property path for sub tasks in datasource
    */
  var childMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Triggered after collapsed the Gantt record
    */
  var collapsed: js.UndefOr[js.Function1[/* e */ CollapsedEventArgs, scala.Unit]] = js.undefined
  /** Triggered while collapsing the Gantt record
    */
  var collapsing: js.UndefOr[js.Function1[/* e */ CollapsingEventArgs, scala.Unit]] = js.undefined
  /** To Specify the column fields to be displayed in the dialog while inserting a column using column menu.
    * @Default {[]}
    */
  var columnDialogFields: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the background of connector lines in Gantt
    */
  var connectorLineBackground: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the width of the connector lines in Gantt
    * @Default {1}
    */
  var connectorlineWidth: js.UndefOr[scala.Double] = js.undefined
  /** Triggered while Context Menu is rendered in Gantt control
    */
  var contextMenuOpen: js.UndefOr[js.Function1[/* e */ ContextMenuOpenEventArgs, scala.Unit]] = js.undefined
  /** Triggered when Gantt is rendered completely.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Specify the CSS class for Gantt to achieve custom theme.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Collection of data or hierarchical data to represent in Gantt
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the dateFormat for Gantt , given format is displayed in tooltip , Grid .
    * @Default {MM/dd/yyyy}
    */
  var dateFormat: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the customized working time for tasks in Gantt
    * @Default {[{ from: 08:00 AM, to: 12:00 PM , background:   }, { from: 01:00 PM, to: 05:00 PM , background:  }]}
    */
  var dayWorkingTime: js.UndefOr[js.Array[_]] = js.undefined
  /** Option for customizing the drag tooltip while reordering the rows.
    */
  var dragTooltip: js.UndefOr[DragTooltip] = js.undefined
  /** Specifies the mapping property path for duration of a task in datasource
    */
  var durationMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the duration unit for each tasks whether days or hours or minutes
    * @Default {ej.Gantt.DurationUnit.Day}
    */
  var durationUnit: js.UndefOr[DurationUnit | java.lang.String] = js.undefined
  /** Specifies the mapping property path for task duration unit in datasource
    */
  var durationUnitMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the fields to be included in the edit dialog in Gantt
    * @Default {[]}
    */
  var editDialogFields: js.UndefOr[js.Array[EditDialogField]] = js.undefined
  /** Specifies the editSettings options in Gantt.
    */
  var editSettings: js.UndefOr[EditSettings] = js.undefined
  /** Enables or Disables enableAltRow row effect in Gantt
    * @Default {true}
    */
  var enableAltRow: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the collapse all records when loading the Gantt.
    * @Default {false}
    */
  var enableCollapseAll: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the contextmenu for Gantt , when enabled contextmenu appears on right clicking Gantt
    * @Default {false}
    */
  var enableContextMenu: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable or disable predecessor validation. When it is true, all the task's start and end dates are aligned based on its predecessors start and end dates.
    * @Default {true}
    */
  var enablePredecessorValidation: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether we can edit the progress of a task interactively in Gantt.
    * @Default {true}
    */
  var enableProgressBarResizing: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the option for dynamically updating the Gantt size on window resizing
    * @Default {false}
    */
  var enableResize: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables serial number column for Gantt. When enabled, the records will be number sequenced.
    * @Default {false}
    */
  var enableSerialNumber: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables tooltip while editing (dragging/resizing) the taskbar.
    * @Default {true}
    */
  var enableTaskbarDragTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables tooltip for taskbar.
    * @Default {true}
    */
  var enableTaskbarTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/Disables virtualization for rendering Gantt items.
    * @Default {false}
    */
  var enableVirtualization: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/disables work breakdown structure column.
    * @Default {false}
    */
  var enableWBS: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/disables WBS predecessor column.
    * @Default {false}
    */
  var enableWBSPredecessor: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the mapping property path for end Date of a task in datasource
    */
  var endDateMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Triggered after save the modified cellValue in Gantt.
    */
  var endEdit: js.UndefOr[js.Function1[/* e */ EndEditEventArgs, scala.Unit]] = js.undefined
  /** Specifies the mapping property path for the expand status of a record in data source.
    */
  var expandStateMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Triggered after expand the record
    */
  var expanded: js.UndefOr[js.Function1[/* e */ ExpandedEventArgs, scala.Unit]] = js.undefined
  /** Triggered while expanding the Gantt record
    */
  var expanding: js.UndefOr[js.Function1[/* e */ ExpandingEventArgs, scala.Unit]] = js.undefined
  /** Options for filtering and customizing filter actions.
    */
  var filterSettings: js.UndefOr[FilterSettings] = js.undefined
  /** Specifies the data collection for grouping the resources in resource allocation view in Gantt.
    * @Default {[]}
    */
  var groupCollection: js.UndefOr[js.Array[_]] = js.undefined
  /** Default Value
    */
  var groupIdMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Default Value
    */
  var groupNameMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies whether to highlight the non working time in Gantt.
    * @Default {false}
    */
  var highlightNonWorkingTime: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to highlight the weekends in Gantt .
    * @Default {true}
    */
  var highlightWeekends: js.UndefOr[scala.Boolean] = js.undefined
  /** Collection of holidays with date, background and label information to be displayed in Gantt.
    * @Default {[]}
    */
  var holidays: js.UndefOr[js.Array[Holiday]] = js.undefined
  /** Specifies whether to include weekends while calculating the duration of a task.
    * @Default {true}
    */
  var includeWeekend: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the responsiveness of Gantt
    * @Default {false}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the data source field name to be displayed as left task label
    */
  var leftTaskLabelMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the template for left task label
    */
  var leftTaskLabelTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Triggered while Gantt is loaded
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.undefined
  /** Specify the locale for Gantt
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mapping property path for milestone in datasource
    */
  var milestoneMapping: js.UndefOr[java.lang.String] = js.undefined
  /** To Specify the JsRender script Id to customize the mile stone with our preference
    */
  var milestoneTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the background color for non working time in Gantt.
    */
  var nonWorkingBackground: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mapping property path for the task description in datasource
    */
  var notesMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the background of parent progressbar in Gantt
    */
  var parentProgressbarBackground: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mapping property path for parent task Id in self reference datasource
    */
  var parentTaskIdMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the background of parent taskbar in Gantt
    */
  var parentTaskbarBackground: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the template for parent taskbar
    */
  var parentTaskbarTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mapping property path for predecessors of a task in datasource
    */
  var predecessorMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the JsRender template id or template script for predecessor tooltip on mouse action.
    */
  var predecessorTooltipTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mapping property path for progress percentage of a task in datasource
    */
  var progressMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the background of progressbar in Gantt
    */
  var progressbarBackground: js.UndefOr[java.lang.String] = js.undefined
  /** Specified the height of the progressbar in taskbar
    * @Default {100}
    */
  var progressbarHeight: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the template for tooltip on resizing progressbar
    * @Default {null}
    */
  var progressbarTooltipTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the template ID for customized tooltip for progressbar editing in Gantt
    * @Default {null}
    */
  var progressbarTooltipTemplateId: js.UndefOr[java.lang.String] = js.undefined
  /** It receives query to retrieve data from the table (query is same as SQL).
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Triggered while rendering each cell in the TreeGrid
    */
  var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, scala.Unit]] = js.undefined
  /** Triggered while rendering each taskbar in the Gantt
    */
  var queryTaskbarInfo: js.UndefOr[js.Function1[/* e */ QueryTaskbarInfoEventArgs, scala.Unit]] = js.undefined
  /** Enables or disables Gantt to read-only mode
    * @Default {false}
    */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or Disables rendering baselines in Gantt , when enabled baseline is rendered in Gantt
    * @Default {false}
    */
  var renderBaseline: js.UndefOr[scala.Boolean] = js.undefined
  /** Default Value
    */
  var resourceCollectionMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mapping property name for resource ID in resource Collection in Gantt
    */
  var resourceIdMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mapping property path for resources of a task in datasource
    */
  var resourceInfoMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mapping property path for resource name of a task in Gantt
    */
  var resourceNameMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mapping property path for resource's percent effort involved in a task in datasource
    */
  var resourceUnitMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Collection of data regarding resources involved in entire project
    * @Default {[]}
    */
  var resources: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the data source field name to be displayed as right task label
    */
  var rightTaskLabelMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the template for right task label
    */
  var rightTaskLabelTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies whether rounding off the day working time edits
    * @Default {true}
    */
  var roundOffDayworkingTime: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggered while rendering each row
    */
  var rowDataBound: js.UndefOr[js.Function1[/* e */ RowDataBoundEventArgs, scala.Unit]] = js.undefined
  /** Triggered while dragging a row in Gantt control
    */
  var rowDrag: js.UndefOr[js.Function1[/* e */ RowDragEventArgs, scala.Unit]] = js.undefined
  /** Triggered while start to drag row in Gantt control
    */
  var rowDragStart: js.UndefOr[js.Function1[/* e */ RowDragStartEventArgs, scala.Unit]] = js.undefined
  /** Triggered while drop a row in Gantt control
    */
  var rowDragStop: js.UndefOr[js.Function1[/* e */ RowDragStopEventArgs, scala.Unit]] = js.undefined
  /** Specifies the height of a single row in Gantt. Also, we need to set same height in the CSS style with class name e-rowcell.
    * @Default {30}
    */
  var rowHeight: js.UndefOr[scala.Double] = js.undefined
  /** Triggered after the row is selected.
    */
  var rowSelected: js.UndefOr[js.Function1[/* e */ RowSelectedEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the row is going to be selected.
    */
  var rowSelecting: js.UndefOr[js.Function1[/* e */ RowSelectingEventArgs, scala.Unit]] = js.undefined
  /** Specifies end date of the Gantt schedule. By default, end date will be rounded to its next Saturday.
    * @Default {null}
    */
  var scheduleEndDate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the options for customizing schedule header.
    */
  var scheduleHeaderSettings: js.UndefOr[ScheduleHeaderSettings] = js.undefined
  /** Specifies start date of the Gantt schedule. By default, start date will be rounded to its previous Sunday.
    * @Default {null}
    */
  var scheduleStartDate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the selected cell information on rendering Gantt.
    */
  var selectedCellIndexes: js.UndefOr[js.Array[SelectedCellIndex]] = js.undefined
  /** Specifies the selected row Index in Gantt , the row with given index will highlighted
    * @Default {-1}
    */
  var selectedRowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the type of selection whether to select row or cell.
    * @Default {ej.Gantt.SelectionMode.Row}
    */
  var selectionMode: js.UndefOr[SelectionMode | java.lang.String] = js.undefined
  /** Specifies the row selection type.
    * @Default {ej.Gantt.SelectionType.Single}
    */
  var selectionType: js.UndefOr[SelectionType | java.lang.String] = js.undefined
  /** Enables or disables the column chooser.
    * @Default {false}
    */
  var showColumnChooser: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/disables the options for inserting , deleting and renaming  columns.
    * @Default {false}
    */
  var showColumnOptions: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the template for cell tooltip
    * @Default {true}
    */
  var showGridCellTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to show grid cell tooltip over expander cell alone.
    * @Default {true}
    */
  var showGridExpandCellTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether display task progress inside taskbar.
    * @Default {true}
    */
  var showProgressStatus: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to display resource names for a task beside taskbar.
    * @Default {true}
    */
  var showResourceNames: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to display task name beside task bar.
    * @Default {true}
    */
  var showTaskNames: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the size option of Gantt control.
    */
  var sizeSettings: js.UndefOr[SizeSettings] = js.undefined
  /** Specifies the sorting options for Gantt.
    */
  var sortSettings: js.UndefOr[SortSettings] = js.undefined
  /** Specifies splitter position in Gantt.
    * @Default {null}
    */
  var splitterPosition: js.UndefOr[java.lang.String] = js.undefined
  /** Triggered after splitter resizing action in Gantt
    */
  var splitterResized: js.UndefOr[js.Function1[/* e */ SplitterResizedEventArgs, scala.Unit]] = js.undefined
  /** Option to configure the splitter position.
    */
  var splitterSettings: js.UndefOr[SplitterSettings] = js.undefined
  /** Specifies the mapping property path for start date of a task in datasource
    */
  var startDateMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the options for striplines
    * @Default {[]}
    */
  var stripLines: js.UndefOr[js.Array[StripLine]] = js.undefined
  /** Default Value
    */
  var taskCollectionMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mapping property path for task Id in datasource
    */
  var taskIdMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mapping property path for task name in datasource
    */
  var taskNameMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the task scheduling mode for a project and this will be set to all the tasks available in the project
    * @Default {ej.Gantt.TaskSchedulingMode.Auto}
    */
  var taskSchedulingMode: js.UndefOr[TaskSchedulingMode | java.lang.String] = js.undefined
  /** Specifies the mapping property path for the task scheduling mode for a task in datasource
    * @Default {auto}
    */
  var taskSchedulingModeMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the nature of a task for calculating the work,  and it can fixed duration, fixed work and fixed resource unit
    * @Default {ej.Gantt.TaskType.FixedUnit}
    */
  var taskType: js.UndefOr[TaskType | java.lang.String] = js.undefined
  /** Specifies the background of the taskbar in Gantt
    */
  var taskbarBackground: js.UndefOr[java.lang.String] = js.undefined
  /** Triggered when taskbar item is clicked in Gantt.
    */
  var taskbarClick: js.UndefOr[js.Function1[/* e */ TaskbarClickEventArgs, scala.Unit]] = js.undefined
  /** Triggered after completing the editing operation in taskbar
    */
  var taskbarEdited: js.UndefOr[js.Function1[/* e */ TaskbarEditedEventArgs, scala.Unit]] = js.undefined
  /** Triggered while editing the Gantt chart (dragging, resizing the taskbar )
    */
  var taskbarEditing: js.UndefOr[js.Function1[/* e */ TaskbarEditingEventArgs, scala.Unit]] = js.undefined
  /** Specifies the template script for customized tooltip for taskbar editing in Gantt
    */
  var taskbarEditingTooltipTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the template Id for customized tooltip for taskbar editing in Gantt
    */
  var taskbarEditingTooltipTemplateId: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the height of taskBar in Gantt.
    * @Default {20}
    */
  var taskbarHeight: js.UndefOr[scala.Double] = js.undefined
  /** To Specify the JsRender script Id to customize the task bar with our preference
    */
  var taskbarTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the template for tooltip on mouse action on taskbars
    */
  var taskbarTooltipTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the template id for tooltip on mouse action on taskbars
    */
  var taskbarTooltipTemplateId: js.UndefOr[java.lang.String] = js.undefined
  /** Triggered when toolbar item is clicked in Gantt.
    */
  var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, scala.Unit]] = js.undefined
  /** Specifies the toolbarSettings options.
    */
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.undefined
  /** Specifies the tree expander column in Gantt
    * @Default {0}
    */
  var treeColumnIndex: js.UndefOr[scala.Double] = js.undefined
  /** Enables or disables the schedule date validation while connecting a manually scheduled task with predecessor
    * @Default {false}
    */
  var validateManualTasksOnLinking: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the view type for a project in the Gantt.
    * @Default {ej.Gantt.ViewType.ProjectView}
    */
  var viewType: js.UndefOr[ViewType | java.lang.String] = js.undefined
  /** Specifies the weekendBackground color in Gantt
    * @Default {#F2F2F2}
    */
  var weekendBackground: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mapping property path for the work field of a task in the data source. When it is mapped the end date and duration for a task will be calculated automatically.
    */
  var workMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the unit for the work involved in a task and it can be day, hour or minute
    * @Default {ej.Gantt.WorkUnit.Hour}
    */
  var workUnit: js.UndefOr[WorkUnit | java.lang.String] = js.undefined
  /** Gets or sets the working days of a week in a project.
    * @Default {[Monday,Tuesday,Wednesday,Thursday,Friday]}
    */
  var workWeek: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the working time schedule of day
    * @Default {ej.Gantt.workingTimeScale.TimeScale8Hours}
    */
  var workingTimeScale: js.UndefOr[workingTimeScale | java.lang.String] = js.undefined
}

