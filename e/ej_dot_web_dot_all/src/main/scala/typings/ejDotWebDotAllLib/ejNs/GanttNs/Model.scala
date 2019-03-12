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

object Model {
  @scala.inline
  def apply(
    actionBegin: /* e */ ActionBeginEventArgs => scala.Unit = null,
    actionComplete: /* e */ ActionCompleteEventArgs => scala.Unit = null,
    addDialogFields: js.Array[AddDialogField] = null,
    allowColumnResize: js.UndefOr[scala.Boolean] = js.undefined,
    allowDragAndDrop: js.UndefOr[scala.Boolean] = js.undefined,
    allowGanttChartEditing: js.UndefOr[scala.Boolean] = js.undefined,
    allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    allowMultiSorting: js.UndefOr[scala.Boolean] = js.undefined,
    allowMultipleExporting: js.UndefOr[scala.Boolean] = js.undefined,
    allowSelection: js.UndefOr[scala.Boolean] = js.undefined,
    allowSorting: js.UndefOr[scala.Boolean] = js.undefined,
    allowUnscheduledTask: js.UndefOr[scala.Boolean] = js.undefined,
    baselineColor: java.lang.String = null,
    baselineEndDateMapping: java.lang.String = null,
    baselineStartDateMapping: java.lang.String = null,
    beginEdit: /* e */ BeginEditEventArgs => scala.Unit = null,
    cellSelected: /* e */ CellSelectedEventArgs => scala.Unit = null,
    cellSelecting: /* e */ CellSelectingEventArgs => scala.Unit = null,
    cellTooltipTemplate: java.lang.String = null,
    childMapping: java.lang.String = null,
    collapsed: /* e */ CollapsedEventArgs => scala.Unit = null,
    collapsing: /* e */ CollapsingEventArgs => scala.Unit = null,
    columnDialogFields: js.Array[_] = null,
    connectorLineBackground: java.lang.String = null,
    connectorlineWidth: scala.Int | scala.Double = null,
    contextMenuOpen: /* e */ ContextMenuOpenEventArgs => scala.Unit = null,
    create: /* e */ CreateEventArgs => scala.Unit = null,
    cssClass: java.lang.String = null,
    dataSource: js.Array[_] = null,
    dateFormat: java.lang.String = null,
    dayWorkingTime: js.Array[_] = null,
    dragTooltip: DragTooltip = null,
    durationMapping: java.lang.String = null,
    durationUnit: DurationUnit | java.lang.String = null,
    durationUnitMapping: java.lang.String = null,
    editDialogFields: js.Array[EditDialogField] = null,
    editSettings: EditSettings = null,
    enableAltRow: js.UndefOr[scala.Boolean] = js.undefined,
    enableCollapseAll: js.UndefOr[scala.Boolean] = js.undefined,
    enableContextMenu: js.UndefOr[scala.Boolean] = js.undefined,
    enablePredecessorValidation: js.UndefOr[scala.Boolean] = js.undefined,
    enableProgressBarResizing: js.UndefOr[scala.Boolean] = js.undefined,
    enableResize: js.UndefOr[scala.Boolean] = js.undefined,
    enableSerialNumber: js.UndefOr[scala.Boolean] = js.undefined,
    enableTaskbarDragTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    enableTaskbarTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    enableVirtualization: js.UndefOr[scala.Boolean] = js.undefined,
    enableWBS: js.UndefOr[scala.Boolean] = js.undefined,
    enableWBSPredecessor: js.UndefOr[scala.Boolean] = js.undefined,
    endDateMapping: java.lang.String = null,
    endEdit: /* e */ EndEditEventArgs => scala.Unit = null,
    expandStateMapping: java.lang.String = null,
    expanded: /* e */ ExpandedEventArgs => scala.Unit = null,
    expanding: /* e */ ExpandingEventArgs => scala.Unit = null,
    filterSettings: FilterSettings = null,
    groupCollection: js.Array[_] = null,
    groupIdMapping: java.lang.String = null,
    groupNameMapping: java.lang.String = null,
    highlightNonWorkingTime: js.UndefOr[scala.Boolean] = js.undefined,
    highlightWeekends: js.UndefOr[scala.Boolean] = js.undefined,
    holidays: js.Array[Holiday] = null,
    includeWeekend: js.UndefOr[scala.Boolean] = js.undefined,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    leftTaskLabelMapping: java.lang.String = null,
    leftTaskLabelTemplate: java.lang.String = null,
    load: /* e */ LoadEventArgs => scala.Unit = null,
    locale: java.lang.String = null,
    milestoneMapping: java.lang.String = null,
    milestoneTemplate: java.lang.String = null,
    nonWorkingBackground: java.lang.String = null,
    notesMapping: java.lang.String = null,
    parentProgressbarBackground: java.lang.String = null,
    parentTaskIdMapping: java.lang.String = null,
    parentTaskbarBackground: java.lang.String = null,
    parentTaskbarTemplate: java.lang.String = null,
    predecessorMapping: java.lang.String = null,
    predecessorTooltipTemplate: java.lang.String = null,
    progressMapping: java.lang.String = null,
    progressbarBackground: java.lang.String = null,
    progressbarHeight: scala.Int | scala.Double = null,
    progressbarTooltipTemplate: java.lang.String = null,
    progressbarTooltipTemplateId: java.lang.String = null,
    query: js.Any = null,
    queryCellInfo: /* e */ QueryCellInfoEventArgs => scala.Unit = null,
    queryTaskbarInfo: /* e */ QueryTaskbarInfoEventArgs => scala.Unit = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    renderBaseline: js.UndefOr[scala.Boolean] = js.undefined,
    resourceCollectionMapping: java.lang.String = null,
    resourceIdMapping: java.lang.String = null,
    resourceInfoMapping: java.lang.String = null,
    resourceNameMapping: java.lang.String = null,
    resourceUnitMapping: java.lang.String = null,
    resources: js.Array[_] = null,
    rightTaskLabelMapping: java.lang.String = null,
    rightTaskLabelTemplate: java.lang.String = null,
    roundOffDayworkingTime: js.UndefOr[scala.Boolean] = js.undefined,
    rowDataBound: /* e */ RowDataBoundEventArgs => scala.Unit = null,
    rowDrag: /* e */ RowDragEventArgs => scala.Unit = null,
    rowDragStart: /* e */ RowDragStartEventArgs => scala.Unit = null,
    rowDragStop: /* e */ RowDragStopEventArgs => scala.Unit = null,
    rowHeight: scala.Int | scala.Double = null,
    rowSelected: /* e */ RowSelectedEventArgs => scala.Unit = null,
    rowSelecting: /* e */ RowSelectingEventArgs => scala.Unit = null,
    scheduleEndDate: java.lang.String = null,
    scheduleHeaderSettings: ScheduleHeaderSettings = null,
    scheduleStartDate: java.lang.String = null,
    selectedCellIndexes: js.Array[SelectedCellIndex] = null,
    selectedRowIndex: scala.Int | scala.Double = null,
    selectionMode: SelectionMode | java.lang.String = null,
    selectionType: SelectionType | java.lang.String = null,
    showColumnChooser: js.UndefOr[scala.Boolean] = js.undefined,
    showColumnOptions: js.UndefOr[scala.Boolean] = js.undefined,
    showGridCellTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    showGridExpandCellTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    showProgressStatus: js.UndefOr[scala.Boolean] = js.undefined,
    showResourceNames: js.UndefOr[scala.Boolean] = js.undefined,
    showTaskNames: js.UndefOr[scala.Boolean] = js.undefined,
    sizeSettings: SizeSettings = null,
    sortSettings: SortSettings = null,
    splitterPosition: java.lang.String = null,
    splitterResized: /* e */ SplitterResizedEventArgs => scala.Unit = null,
    splitterSettings: SplitterSettings = null,
    startDateMapping: java.lang.String = null,
    stripLines: js.Array[StripLine] = null,
    taskCollectionMapping: java.lang.String = null,
    taskIdMapping: java.lang.String = null,
    taskNameMapping: java.lang.String = null,
    taskSchedulingMode: TaskSchedulingMode | java.lang.String = null,
    taskSchedulingModeMapping: java.lang.String = null,
    taskType: TaskType | java.lang.String = null,
    taskbarBackground: java.lang.String = null,
    taskbarClick: /* e */ TaskbarClickEventArgs => scala.Unit = null,
    taskbarEdited: /* e */ TaskbarEditedEventArgs => scala.Unit = null,
    taskbarEditing: /* e */ TaskbarEditingEventArgs => scala.Unit = null,
    taskbarEditingTooltipTemplate: java.lang.String = null,
    taskbarEditingTooltipTemplateId: java.lang.String = null,
    taskbarHeight: scala.Int | scala.Double = null,
    taskbarTemplate: java.lang.String = null,
    taskbarTooltipTemplate: java.lang.String = null,
    taskbarTooltipTemplateId: java.lang.String = null,
    toolbarClick: /* e */ ToolbarClickEventArgs => scala.Unit = null,
    toolbarSettings: ToolbarSettings = null,
    treeColumnIndex: scala.Int | scala.Double = null,
    validateManualTasksOnLinking: js.UndefOr[scala.Boolean] = js.undefined,
    viewType: ViewType | java.lang.String = null,
    weekendBackground: java.lang.String = null,
    workMapping: java.lang.String = null,
    workUnit: WorkUnit | java.lang.String = null,
    workWeek: js.Array[_] = null,
    workingTimeScale: workingTimeScale | java.lang.String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (actionBegin != null) __obj.updateDynamic("actionBegin")(js.Any.fromFunction1(actionBegin))
    if (actionComplete != null) __obj.updateDynamic("actionComplete")(js.Any.fromFunction1(actionComplete))
    if (addDialogFields != null) __obj.updateDynamic("addDialogFields")(addDialogFields)
    if (!js.isUndefined(allowColumnResize)) __obj.updateDynamic("allowColumnResize")(allowColumnResize)
    if (!js.isUndefined(allowDragAndDrop)) __obj.updateDynamic("allowDragAndDrop")(allowDragAndDrop)
    if (!js.isUndefined(allowGanttChartEditing)) __obj.updateDynamic("allowGanttChartEditing")(allowGanttChartEditing)
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation)
    if (!js.isUndefined(allowMultiSorting)) __obj.updateDynamic("allowMultiSorting")(allowMultiSorting)
    if (!js.isUndefined(allowMultipleExporting)) __obj.updateDynamic("allowMultipleExporting")(allowMultipleExporting)
    if (!js.isUndefined(allowSelection)) __obj.updateDynamic("allowSelection")(allowSelection)
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting)
    if (!js.isUndefined(allowUnscheduledTask)) __obj.updateDynamic("allowUnscheduledTask")(allowUnscheduledTask)
    if (baselineColor != null) __obj.updateDynamic("baselineColor")(baselineColor)
    if (baselineEndDateMapping != null) __obj.updateDynamic("baselineEndDateMapping")(baselineEndDateMapping)
    if (baselineStartDateMapping != null) __obj.updateDynamic("baselineStartDateMapping")(baselineStartDateMapping)
    if (beginEdit != null) __obj.updateDynamic("beginEdit")(js.Any.fromFunction1(beginEdit))
    if (cellSelected != null) __obj.updateDynamic("cellSelected")(js.Any.fromFunction1(cellSelected))
    if (cellSelecting != null) __obj.updateDynamic("cellSelecting")(js.Any.fromFunction1(cellSelecting))
    if (cellTooltipTemplate != null) __obj.updateDynamic("cellTooltipTemplate")(cellTooltipTemplate)
    if (childMapping != null) __obj.updateDynamic("childMapping")(childMapping)
    if (collapsed != null) __obj.updateDynamic("collapsed")(js.Any.fromFunction1(collapsed))
    if (collapsing != null) __obj.updateDynamic("collapsing")(js.Any.fromFunction1(collapsing))
    if (columnDialogFields != null) __obj.updateDynamic("columnDialogFields")(columnDialogFields)
    if (connectorLineBackground != null) __obj.updateDynamic("connectorLineBackground")(connectorLineBackground)
    if (connectorlineWidth != null) __obj.updateDynamic("connectorlineWidth")(connectorlineWidth.asInstanceOf[js.Any])
    if (contextMenuOpen != null) __obj.updateDynamic("contextMenuOpen")(js.Any.fromFunction1(contextMenuOpen))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (dayWorkingTime != null) __obj.updateDynamic("dayWorkingTime")(dayWorkingTime)
    if (dragTooltip != null) __obj.updateDynamic("dragTooltip")(dragTooltip)
    if (durationMapping != null) __obj.updateDynamic("durationMapping")(durationMapping)
    if (durationUnit != null) __obj.updateDynamic("durationUnit")(durationUnit.asInstanceOf[js.Any])
    if (durationUnitMapping != null) __obj.updateDynamic("durationUnitMapping")(durationUnitMapping)
    if (editDialogFields != null) __obj.updateDynamic("editDialogFields")(editDialogFields)
    if (editSettings != null) __obj.updateDynamic("editSettings")(editSettings)
    if (!js.isUndefined(enableAltRow)) __obj.updateDynamic("enableAltRow")(enableAltRow)
    if (!js.isUndefined(enableCollapseAll)) __obj.updateDynamic("enableCollapseAll")(enableCollapseAll)
    if (!js.isUndefined(enableContextMenu)) __obj.updateDynamic("enableContextMenu")(enableContextMenu)
    if (!js.isUndefined(enablePredecessorValidation)) __obj.updateDynamic("enablePredecessorValidation")(enablePredecessorValidation)
    if (!js.isUndefined(enableProgressBarResizing)) __obj.updateDynamic("enableProgressBarResizing")(enableProgressBarResizing)
    if (!js.isUndefined(enableResize)) __obj.updateDynamic("enableResize")(enableResize)
    if (!js.isUndefined(enableSerialNumber)) __obj.updateDynamic("enableSerialNumber")(enableSerialNumber)
    if (!js.isUndefined(enableTaskbarDragTooltip)) __obj.updateDynamic("enableTaskbarDragTooltip")(enableTaskbarDragTooltip)
    if (!js.isUndefined(enableTaskbarTooltip)) __obj.updateDynamic("enableTaskbarTooltip")(enableTaskbarTooltip)
    if (!js.isUndefined(enableVirtualization)) __obj.updateDynamic("enableVirtualization")(enableVirtualization)
    if (!js.isUndefined(enableWBS)) __obj.updateDynamic("enableWBS")(enableWBS)
    if (!js.isUndefined(enableWBSPredecessor)) __obj.updateDynamic("enableWBSPredecessor")(enableWBSPredecessor)
    if (endDateMapping != null) __obj.updateDynamic("endDateMapping")(endDateMapping)
    if (endEdit != null) __obj.updateDynamic("endEdit")(js.Any.fromFunction1(endEdit))
    if (expandStateMapping != null) __obj.updateDynamic("expandStateMapping")(expandStateMapping)
    if (expanded != null) __obj.updateDynamic("expanded")(js.Any.fromFunction1(expanded))
    if (expanding != null) __obj.updateDynamic("expanding")(js.Any.fromFunction1(expanding))
    if (filterSettings != null) __obj.updateDynamic("filterSettings")(filterSettings)
    if (groupCollection != null) __obj.updateDynamic("groupCollection")(groupCollection)
    if (groupIdMapping != null) __obj.updateDynamic("groupIdMapping")(groupIdMapping)
    if (groupNameMapping != null) __obj.updateDynamic("groupNameMapping")(groupNameMapping)
    if (!js.isUndefined(highlightNonWorkingTime)) __obj.updateDynamic("highlightNonWorkingTime")(highlightNonWorkingTime)
    if (!js.isUndefined(highlightWeekends)) __obj.updateDynamic("highlightWeekends")(highlightWeekends)
    if (holidays != null) __obj.updateDynamic("holidays")(holidays)
    if (!js.isUndefined(includeWeekend)) __obj.updateDynamic("includeWeekend")(includeWeekend)
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (leftTaskLabelMapping != null) __obj.updateDynamic("leftTaskLabelMapping")(leftTaskLabelMapping)
    if (leftTaskLabelTemplate != null) __obj.updateDynamic("leftTaskLabelTemplate")(leftTaskLabelTemplate)
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (milestoneMapping != null) __obj.updateDynamic("milestoneMapping")(milestoneMapping)
    if (milestoneTemplate != null) __obj.updateDynamic("milestoneTemplate")(milestoneTemplate)
    if (nonWorkingBackground != null) __obj.updateDynamic("nonWorkingBackground")(nonWorkingBackground)
    if (notesMapping != null) __obj.updateDynamic("notesMapping")(notesMapping)
    if (parentProgressbarBackground != null) __obj.updateDynamic("parentProgressbarBackground")(parentProgressbarBackground)
    if (parentTaskIdMapping != null) __obj.updateDynamic("parentTaskIdMapping")(parentTaskIdMapping)
    if (parentTaskbarBackground != null) __obj.updateDynamic("parentTaskbarBackground")(parentTaskbarBackground)
    if (parentTaskbarTemplate != null) __obj.updateDynamic("parentTaskbarTemplate")(parentTaskbarTemplate)
    if (predecessorMapping != null) __obj.updateDynamic("predecessorMapping")(predecessorMapping)
    if (predecessorTooltipTemplate != null) __obj.updateDynamic("predecessorTooltipTemplate")(predecessorTooltipTemplate)
    if (progressMapping != null) __obj.updateDynamic("progressMapping")(progressMapping)
    if (progressbarBackground != null) __obj.updateDynamic("progressbarBackground")(progressbarBackground)
    if (progressbarHeight != null) __obj.updateDynamic("progressbarHeight")(progressbarHeight.asInstanceOf[js.Any])
    if (progressbarTooltipTemplate != null) __obj.updateDynamic("progressbarTooltipTemplate")(progressbarTooltipTemplate)
    if (progressbarTooltipTemplateId != null) __obj.updateDynamic("progressbarTooltipTemplateId")(progressbarTooltipTemplateId)
    if (query != null) __obj.updateDynamic("query")(query)
    if (queryCellInfo != null) __obj.updateDynamic("queryCellInfo")(js.Any.fromFunction1(queryCellInfo))
    if (queryTaskbarInfo != null) __obj.updateDynamic("queryTaskbarInfo")(js.Any.fromFunction1(queryTaskbarInfo))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(renderBaseline)) __obj.updateDynamic("renderBaseline")(renderBaseline)
    if (resourceCollectionMapping != null) __obj.updateDynamic("resourceCollectionMapping")(resourceCollectionMapping)
    if (resourceIdMapping != null) __obj.updateDynamic("resourceIdMapping")(resourceIdMapping)
    if (resourceInfoMapping != null) __obj.updateDynamic("resourceInfoMapping")(resourceInfoMapping)
    if (resourceNameMapping != null) __obj.updateDynamic("resourceNameMapping")(resourceNameMapping)
    if (resourceUnitMapping != null) __obj.updateDynamic("resourceUnitMapping")(resourceUnitMapping)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (rightTaskLabelMapping != null) __obj.updateDynamic("rightTaskLabelMapping")(rightTaskLabelMapping)
    if (rightTaskLabelTemplate != null) __obj.updateDynamic("rightTaskLabelTemplate")(rightTaskLabelTemplate)
    if (!js.isUndefined(roundOffDayworkingTime)) __obj.updateDynamic("roundOffDayworkingTime")(roundOffDayworkingTime)
    if (rowDataBound != null) __obj.updateDynamic("rowDataBound")(js.Any.fromFunction1(rowDataBound))
    if (rowDrag != null) __obj.updateDynamic("rowDrag")(js.Any.fromFunction1(rowDrag))
    if (rowDragStart != null) __obj.updateDynamic("rowDragStart")(js.Any.fromFunction1(rowDragStart))
    if (rowDragStop != null) __obj.updateDynamic("rowDragStop")(js.Any.fromFunction1(rowDragStop))
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rowSelected != null) __obj.updateDynamic("rowSelected")(js.Any.fromFunction1(rowSelected))
    if (rowSelecting != null) __obj.updateDynamic("rowSelecting")(js.Any.fromFunction1(rowSelecting))
    if (scheduleEndDate != null) __obj.updateDynamic("scheduleEndDate")(scheduleEndDate)
    if (scheduleHeaderSettings != null) __obj.updateDynamic("scheduleHeaderSettings")(scheduleHeaderSettings)
    if (scheduleStartDate != null) __obj.updateDynamic("scheduleStartDate")(scheduleStartDate)
    if (selectedCellIndexes != null) __obj.updateDynamic("selectedCellIndexes")(selectedCellIndexes)
    if (selectedRowIndex != null) __obj.updateDynamic("selectedRowIndex")(selectedRowIndex.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (selectionType != null) __obj.updateDynamic("selectionType")(selectionType.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnChooser)) __obj.updateDynamic("showColumnChooser")(showColumnChooser)
    if (!js.isUndefined(showColumnOptions)) __obj.updateDynamic("showColumnOptions")(showColumnOptions)
    if (!js.isUndefined(showGridCellTooltip)) __obj.updateDynamic("showGridCellTooltip")(showGridCellTooltip)
    if (!js.isUndefined(showGridExpandCellTooltip)) __obj.updateDynamic("showGridExpandCellTooltip")(showGridExpandCellTooltip)
    if (!js.isUndefined(showProgressStatus)) __obj.updateDynamic("showProgressStatus")(showProgressStatus)
    if (!js.isUndefined(showResourceNames)) __obj.updateDynamic("showResourceNames")(showResourceNames)
    if (!js.isUndefined(showTaskNames)) __obj.updateDynamic("showTaskNames")(showTaskNames)
    if (sizeSettings != null) __obj.updateDynamic("sizeSettings")(sizeSettings)
    if (sortSettings != null) __obj.updateDynamic("sortSettings")(sortSettings)
    if (splitterPosition != null) __obj.updateDynamic("splitterPosition")(splitterPosition)
    if (splitterResized != null) __obj.updateDynamic("splitterResized")(js.Any.fromFunction1(splitterResized))
    if (splitterSettings != null) __obj.updateDynamic("splitterSettings")(splitterSettings)
    if (startDateMapping != null) __obj.updateDynamic("startDateMapping")(startDateMapping)
    if (stripLines != null) __obj.updateDynamic("stripLines")(stripLines)
    if (taskCollectionMapping != null) __obj.updateDynamic("taskCollectionMapping")(taskCollectionMapping)
    if (taskIdMapping != null) __obj.updateDynamic("taskIdMapping")(taskIdMapping)
    if (taskNameMapping != null) __obj.updateDynamic("taskNameMapping")(taskNameMapping)
    if (taskSchedulingMode != null) __obj.updateDynamic("taskSchedulingMode")(taskSchedulingMode.asInstanceOf[js.Any])
    if (taskSchedulingModeMapping != null) __obj.updateDynamic("taskSchedulingModeMapping")(taskSchedulingModeMapping)
    if (taskType != null) __obj.updateDynamic("taskType")(taskType.asInstanceOf[js.Any])
    if (taskbarBackground != null) __obj.updateDynamic("taskbarBackground")(taskbarBackground)
    if (taskbarClick != null) __obj.updateDynamic("taskbarClick")(js.Any.fromFunction1(taskbarClick))
    if (taskbarEdited != null) __obj.updateDynamic("taskbarEdited")(js.Any.fromFunction1(taskbarEdited))
    if (taskbarEditing != null) __obj.updateDynamic("taskbarEditing")(js.Any.fromFunction1(taskbarEditing))
    if (taskbarEditingTooltipTemplate != null) __obj.updateDynamic("taskbarEditingTooltipTemplate")(taskbarEditingTooltipTemplate)
    if (taskbarEditingTooltipTemplateId != null) __obj.updateDynamic("taskbarEditingTooltipTemplateId")(taskbarEditingTooltipTemplateId)
    if (taskbarHeight != null) __obj.updateDynamic("taskbarHeight")(taskbarHeight.asInstanceOf[js.Any])
    if (taskbarTemplate != null) __obj.updateDynamic("taskbarTemplate")(taskbarTemplate)
    if (taskbarTooltipTemplate != null) __obj.updateDynamic("taskbarTooltipTemplate")(taskbarTooltipTemplate)
    if (taskbarTooltipTemplateId != null) __obj.updateDynamic("taskbarTooltipTemplateId")(taskbarTooltipTemplateId)
    if (toolbarClick != null) __obj.updateDynamic("toolbarClick")(js.Any.fromFunction1(toolbarClick))
    if (toolbarSettings != null) __obj.updateDynamic("toolbarSettings")(toolbarSettings)
    if (treeColumnIndex != null) __obj.updateDynamic("treeColumnIndex")(treeColumnIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(validateManualTasksOnLinking)) __obj.updateDynamic("validateManualTasksOnLinking")(validateManualTasksOnLinking)
    if (viewType != null) __obj.updateDynamic("viewType")(viewType.asInstanceOf[js.Any])
    if (weekendBackground != null) __obj.updateDynamic("weekendBackground")(weekendBackground)
    if (workMapping != null) __obj.updateDynamic("workMapping")(workMapping)
    if (workUnit != null) __obj.updateDynamic("workUnit")(workUnit.asInstanceOf[js.Any])
    if (workWeek != null) __obj.updateDynamic("workWeek")(workWeek)
    if (workingTimeScale != null) __obj.updateDynamic("workingTimeScale")(workingTimeScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

