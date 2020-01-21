package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggered for every Gantt action before its starts.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.undefined
  /** Triggered for every Gantt action success event.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.undefined
  /** Specifies the fields to be included in the add dialog in Gantt
    * @Default {[]}
    */
  var addDialogFields: js.UndefOr[js.Array[AddDialogField]] = js.undefined
  /** Enables or disables the ability to resize column.
    * @Default {false}
    */
  var allowColumnResize: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the ability to drag and drop the row interactively to reorder the rows
    * @Default {false}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.undefined
  /** Enables or Disables Gantt chart editing in Gantt
    * @Default {true}
    */
  var allowGanttChartEditing: js.UndefOr[Boolean] = js.undefined
  /** Enables or Disables Keyboard navigation in Gantt
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
  /** Specifies enabling or disabling multiple sorting for Gantt columns
    * @Default {false}
    */
  var allowMultiSorting: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the option for multiple exporting
    * @Default {false}
    */
  var allowMultipleExporting: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the interactive selection of a row.
    * @Default {true}
    */
  var allowSelection: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables sorting. When enabled, we can sort the column by clicking on the column.
    * @Default {false}
    */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the rendering of unscheduled tasks.
    * @Default {false}
    */
  var allowUnscheduledTask: js.UndefOr[Boolean] = js.undefined
  /** Specifies the baseline background color in Gantt
    * @Default {#fba41c}
    */
  var baselineColor: js.UndefOr[String] = js.undefined
  /** Specifies the mapping property path for baseline end date in datasource
    */
  var baselineEndDateMapping: js.UndefOr[String] = js.undefined
  /** Specifies the mapping property path for baseline start date of a task in datasource
    */
  var baselineStartDateMapping: js.UndefOr[String] = js.undefined
  /** Triggered while enter the edit mode in the TreeGrid cell
    */
  var beginEdit: js.UndefOr[js.Function1[/* e */ BeginEditEventArgs, Unit]] = js.undefined
  /** Triggered after selected a cell
    */
  var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, Unit]] = js.undefined
  /** Triggered before selecting a cell
    */
  var cellSelecting: js.UndefOr[js.Function1[/* e */ CellSelectingEventArgs, Unit]] = js.undefined
  /** Specifies the template for cell tooltip
    * @Default {null}
    */
  var cellTooltipTemplate: js.UndefOr[String] = js.undefined
  /** Specifies the mapping property path for sub tasks in datasource
    */
  var childMapping: js.UndefOr[String] = js.undefined
  /** Triggered after collapsed the Gantt record
    */
  var collapsed: js.UndefOr[js.Function1[/* e */ CollapsedEventArgs, Unit]] = js.undefined
  /** Triggered while collapsing the Gantt record
    */
  var collapsing: js.UndefOr[js.Function1[/* e */ CollapsingEventArgs, Unit]] = js.undefined
  /** To Specify the column fields to be displayed in the dialog while inserting a column using column menu.
    * @Default {[]}
    */
  var columnDialogFields: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the background of connector lines in Gantt
    */
  var connectorLineBackground: js.UndefOr[String] = js.undefined
  /** Specifies the width of the connector lines in Gantt
    * @Default {1}
    */
  var connectorlineWidth: js.UndefOr[Double] = js.undefined
  /** Triggered while Context Menu is rendered in Gantt control
    */
  var contextMenuOpen: js.UndefOr[js.Function1[/* e */ ContextMenuOpenEventArgs, Unit]] = js.undefined
  /** Triggered when Gantt is rendered completely.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Specify the CSS class for Gantt to achieve custom theme.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Collection of data or hierarchical data to represent in Gantt
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the dateFormat for Gantt , given format is displayed in tooltip , Grid .
    * @Default {MM/dd/yyyy}
    */
  var dateFormat: js.UndefOr[String] = js.undefined
  /** Specifies the customized working time for tasks in Gantt
    * @Default {[{ from: 08:00 AM, to: 12:00 PM , background:   }, { from: 01:00 PM, to: 05:00 PM , background:  }]}
    */
  var dayWorkingTime: js.UndefOr[js.Array[_]] = js.undefined
  /** Option for customizing the drag tooltip while reordering the rows.
    */
  var dragTooltip: js.UndefOr[DragTooltip] = js.undefined
  /** Specifies the mapping property path for duration of a task in datasource
    */
  var durationMapping: js.UndefOr[String] = js.undefined
  /** Specifies the duration unit for each tasks whether days or hours or minutes
    * @Default {ej.Gantt.DurationUnit.Day}
    */
  var durationUnit: js.UndefOr[DurationUnit | String] = js.undefined
  /** Specifies the mapping property path for task duration unit in datasource
    */
  var durationUnitMapping: js.UndefOr[String] = js.undefined
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
  var enableAltRow: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the collapse all records when loading the Gantt.
    * @Default {false}
    */
  var enableCollapseAll: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the contextmenu for Gantt , when enabled contextmenu appears on right clicking Gantt
    * @Default {false}
    */
  var enableContextMenu: js.UndefOr[Boolean] = js.undefined
  /** Enable or disable predecessor validation. When it is true, all the task's start and end dates are aligned based on its predecessors start and end dates.
    * @Default {true}
    */
  var enablePredecessorValidation: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether we can edit the progress of a task interactively in Gantt.
    * @Default {true}
    */
  var enableProgressBarResizing: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the option for dynamically updating the Gantt size on window resizing
    * @Default {false}
    */
  var enableResize: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables serial number column for Gantt. When enabled, the records will be number sequenced.
    * @Default {false}
    */
  var enableSerialNumber: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables tooltip while editing (dragging/resizing) the taskbar.
    * @Default {true}
    */
  var enableTaskbarDragTooltip: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables tooltip for taskbar.
    * @Default {true}
    */
  var enableTaskbarTooltip: js.UndefOr[Boolean] = js.undefined
  /** Enables/Disables virtualization for rendering Gantt items.
    * @Default {false}
    */
  var enableVirtualization: js.UndefOr[Boolean] = js.undefined
  /** Enables/disables work breakdown structure column.
    * @Default {false}
    */
  var enableWBS: js.UndefOr[Boolean] = js.undefined
  /** Enables/disables WBS predecessor column.
    * @Default {false}
    */
  var enableWBSPredecessor: js.UndefOr[Boolean] = js.undefined
  /** Specifies the mapping property path for end Date of a task in datasource
    */
  var endDateMapping: js.UndefOr[String] = js.undefined
  /** Triggered after save the modified cellValue in Gantt.
    */
  var endEdit: js.UndefOr[js.Function1[/* e */ EndEditEventArgs, Unit]] = js.undefined
  /** Specifies the mapping property path for the expand status of a record in data source.
    */
  var expandStateMapping: js.UndefOr[String] = js.undefined
  /** Triggered after expand the record
    */
  var expanded: js.UndefOr[js.Function1[/* e */ ExpandedEventArgs, Unit]] = js.undefined
  /** Triggered while expanding the Gantt record
    */
  var expanding: js.UndefOr[js.Function1[/* e */ ExpandingEventArgs, Unit]] = js.undefined
  /** Options for filtering and customizing filter actions.
    */
  var filterSettings: js.UndefOr[FilterSettings] = js.undefined
  /** Specifies the data collection for grouping the resources in resource allocation view in Gantt.
    * @Default {[]}
    */
  var groupCollection: js.UndefOr[js.Array[_]] = js.undefined
  /** Default Value
    */
  var groupIdMapping: js.UndefOr[String] = js.undefined
  /** Default Value
    */
  var groupNameMapping: js.UndefOr[String] = js.undefined
  /** Specifies whether to highlight the non working time in Gantt.
    * @Default {false}
    */
  var highlightNonWorkingTime: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to highlight the weekends in Gantt .
    * @Default {true}
    */
  var highlightWeekends: js.UndefOr[Boolean] = js.undefined
  /** Collection of holidays with date, background and label information to be displayed in Gantt.
    * @Default {[]}
    */
  var holidays: js.UndefOr[js.Array[Holiday]] = js.undefined
  /** Specifies whether to include weekends while calculating the duration of a task.
    * @Default {true}
    */
  var includeWeekend: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the responsiveness of Gantt
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Specifies the data source field name to be displayed as left task label
    */
  var leftTaskLabelMapping: js.UndefOr[String] = js.undefined
  /** Specifies the template for left task label
    */
  var leftTaskLabelTemplate: js.UndefOr[String] = js.undefined
  /** Triggered while Gantt is loaded
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
  /** Specify the locale for Gantt
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Specifies the mapping property path for milestone in datasource
    */
  var milestoneMapping: js.UndefOr[String] = js.undefined
  /** To Specify the JsRender script Id to customize the mile stone with our preference
    */
  var milestoneTemplate: js.UndefOr[String] = js.undefined
  /** Specifies the background color for non working time in Gantt.
    */
  var nonWorkingBackground: js.UndefOr[String] = js.undefined
  /** Specifies the mapping property path for the task description in datasource
    */
  var notesMapping: js.UndefOr[String] = js.undefined
  /** Specifies the background of parent progressbar in Gantt
    */
  var parentProgressbarBackground: js.UndefOr[String] = js.undefined
  /** Specifies the mapping property path for parent task Id in self reference datasource
    */
  var parentTaskIdMapping: js.UndefOr[String] = js.undefined
  /** Specifies the background of parent taskbar in Gantt
    */
  var parentTaskbarBackground: js.UndefOr[String] = js.undefined
  /** Specifies the template for parent taskbar
    */
  var parentTaskbarTemplate: js.UndefOr[String] = js.undefined
  /** Specifies the mapping property path for predecessors of a task in datasource
    */
  var predecessorMapping: js.UndefOr[String] = js.undefined
  /** Specifies the JsRender template id or template script for predecessor tooltip on mouse action.
    */
  var predecessorTooltipTemplate: js.UndefOr[String] = js.undefined
  /** Specifies the mapping property path for progress percentage of a task in datasource
    */
  var progressMapping: js.UndefOr[String] = js.undefined
  /** Specifies the background of progressbar in Gantt
    */
  var progressbarBackground: js.UndefOr[String] = js.undefined
  /** Specified the height of the progressbar in taskbar
    * @Default {100}
    */
  var progressbarHeight: js.UndefOr[Double] = js.undefined
  /** Specifies the template for tooltip on resizing progressbar
    * @Default {null}
    */
  var progressbarTooltipTemplate: js.UndefOr[String] = js.undefined
  /** Specifies the template ID for customized tooltip for progressbar editing in Gantt
    * @Default {null}
    */
  var progressbarTooltipTemplateId: js.UndefOr[String] = js.undefined
  /** It receives query to retrieve data from the table (query is same as SQL).
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Triggered while rendering each cell in the TreeGrid
    */
  var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, Unit]] = js.undefined
  /** Triggered while rendering each taskbar in the Gantt
    */
  var queryTaskbarInfo: js.UndefOr[js.Function1[/* e */ QueryTaskbarInfoEventArgs, Unit]] = js.undefined
  /** Enables or disables Gantt to read-only mode
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** Enables or Disables rendering baselines in Gantt , when enabled baseline is rendered in Gantt
    * @Default {false}
    */
  var renderBaseline: js.UndefOr[Boolean] = js.undefined
  /** Default Value
    */
  var resourceCollectionMapping: js.UndefOr[String] = js.undefined
  /** Specifies the mapping property name for resource ID in resource Collection in Gantt
    */
  var resourceIdMapping: js.UndefOr[String] = js.undefined
  /** Specifies the mapping property path for resources of a task in datasource
    */
  var resourceInfoMapping: js.UndefOr[String] = js.undefined
  /** Specifies the mapping property path for resource name of a task in Gantt
    */
  var resourceNameMapping: js.UndefOr[String] = js.undefined
  /** Specifies the mapping property path for resource's percent effort involved in a task in datasource
    */
  var resourceUnitMapping: js.UndefOr[String] = js.undefined
  /** Collection of data regarding resources involved in entire project
    * @Default {[]}
    */
  var resources: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the data source field name to be displayed as right task label
    */
  var rightTaskLabelMapping: js.UndefOr[String] = js.undefined
  /** Specifies the template for right task label
    */
  var rightTaskLabelTemplate: js.UndefOr[String] = js.undefined
  /** Specifies whether rounding off the day working time edits
    * @Default {true}
    */
  var roundOffDayworkingTime: js.UndefOr[Boolean] = js.undefined
  /** Triggered while rendering each row
    */
  var rowDataBound: js.UndefOr[js.Function1[/* e */ RowDataBoundEventArgs, Unit]] = js.undefined
  /** Triggered while dragging a row in Gantt control
    */
  var rowDrag: js.UndefOr[js.Function1[/* e */ RowDragEventArgs, Unit]] = js.undefined
  /** Triggered while start to drag row in Gantt control
    */
  var rowDragStart: js.UndefOr[js.Function1[/* e */ RowDragStartEventArgs, Unit]] = js.undefined
  /** Triggered while drop a row in Gantt control
    */
  var rowDragStop: js.UndefOr[js.Function1[/* e */ RowDragStopEventArgs, Unit]] = js.undefined
  /** Specifies the height of a single row in Gantt. Also, we need to set same height in the CSS style with class name e-rowcell.
    * @Default {30}
    */
  var rowHeight: js.UndefOr[Double] = js.undefined
  /** Triggered after the row is selected.
    */
  var rowSelected: js.UndefOr[js.Function1[/* e */ RowSelectedEventArgs, Unit]] = js.undefined
  /** Triggered before the row is going to be selected.
    */
  var rowSelecting: js.UndefOr[js.Function1[/* e */ RowSelectingEventArgs, Unit]] = js.undefined
  /** Specifies end date of the Gantt schedule. By default, end date will be rounded to its next Saturday.
    * @Default {null}
    */
  var scheduleEndDate: js.UndefOr[String] = js.undefined
  /** Specifies the options for customizing schedule header.
    */
  var scheduleHeaderSettings: js.UndefOr[ScheduleHeaderSettings] = js.undefined
  /** Specifies start date of the Gantt schedule. By default, start date will be rounded to its previous Sunday.
    * @Default {null}
    */
  var scheduleStartDate: js.UndefOr[String] = js.undefined
  /** Specifies the selected cell information on rendering Gantt.
    */
  var selectedCellIndexes: js.UndefOr[js.Array[SelectedCellIndex]] = js.undefined
  /** Specifies the selected row Index in Gantt , the row with given index will highlighted
    * @Default {-1}
    */
  var selectedRowIndex: js.UndefOr[Double] = js.undefined
  /** Specifies the type of selection whether to select row or cell.
    * @Default {ej.Gantt.SelectionMode.Row}
    */
  var selectionMode: js.UndefOr[SelectionMode | String] = js.undefined
  /** Specifies the row selection type.
    * @Default {ej.Gantt.SelectionType.Single}
    */
  var selectionType: js.UndefOr[SelectionType | String] = js.undefined
  /** Enables or disables the column chooser.
    * @Default {false}
    */
  var showColumnChooser: js.UndefOr[Boolean] = js.undefined
  /** Enables/disables the options for inserting , deleting and renaming  columns.
    * @Default {false}
    */
  var showColumnOptions: js.UndefOr[Boolean] = js.undefined
  /** Specifies the template for cell tooltip
    * @Default {true}
    */
  var showGridCellTooltip: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to show grid cell tooltip over expander cell alone.
    * @Default {true}
    */
  var showGridExpandCellTooltip: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether display task progress inside taskbar.
    * @Default {true}
    */
  var showProgressStatus: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to display resource names for a task beside taskbar.
    * @Default {true}
    */
  var showResourceNames: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to display task name beside task bar.
    * @Default {true}
    */
  var showTaskNames: js.UndefOr[Boolean] = js.undefined
  /** Specifies the size option of Gantt control.
    */
  var sizeSettings: js.UndefOr[SizeSettings] = js.undefined
  /** Specifies the sorting options for Gantt.
    */
  var sortSettings: js.UndefOr[SortSettings] = js.undefined
  /** Specifies splitter position in Gantt.
    * @Default {null}
    */
  var splitterPosition: js.UndefOr[String] = js.undefined
  /** Triggered after splitter resizing action in Gantt
    */
  var splitterResized: js.UndefOr[js.Function1[/* e */ SplitterResizedEventArgs, Unit]] = js.undefined
  /** Option to configure the splitter position.
    */
  var splitterSettings: js.UndefOr[SplitterSettings] = js.undefined
  /** Specifies the mapping property path for start date of a task in datasource
    */
  var startDateMapping: js.UndefOr[String] = js.undefined
  /** Specifies the options for striplines
    * @Default {[]}
    */
  var stripLines: js.UndefOr[js.Array[StripLine]] = js.undefined
  /** Default Value
    */
  var taskCollectionMapping: js.UndefOr[String] = js.undefined
  /** Specifies the mapping property path for task Id in datasource
    */
  var taskIdMapping: js.UndefOr[String] = js.undefined
  /** Specifies the mapping property path for task name in datasource
    */
  var taskNameMapping: js.UndefOr[String] = js.undefined
  /** Specifies the task scheduling mode for a project and this will be set to all the tasks available in the project
    * @Default {ej.Gantt.TaskSchedulingMode.Auto}
    */
  var taskSchedulingMode: js.UndefOr[TaskSchedulingMode | String] = js.undefined
  /** Specifies the mapping property path for the task scheduling mode for a task in datasource
    * @Default {auto}
    */
  var taskSchedulingModeMapping: js.UndefOr[String] = js.undefined
  /** Specifies the nature of a task for calculating the work,  and it can fixed duration, fixed work and fixed resource unit
    * @Default {ej.Gantt.TaskType.FixedUnit}
    */
  var taskType: js.UndefOr[TaskType | String] = js.undefined
  /** Specifies the background of the taskbar in Gantt
    */
  var taskbarBackground: js.UndefOr[String] = js.undefined
  /** Triggered when taskbar item is clicked in Gantt.
    */
  var taskbarClick: js.UndefOr[js.Function1[/* e */ TaskbarClickEventArgs, Unit]] = js.undefined
  /** Triggered after completing the editing operation in taskbar
    */
  var taskbarEdited: js.UndefOr[js.Function1[/* e */ TaskbarEditedEventArgs, Unit]] = js.undefined
  /** Triggered while editing the Gantt chart (dragging, resizing the taskbar )
    */
  var taskbarEditing: js.UndefOr[js.Function1[/* e */ TaskbarEditingEventArgs, Unit]] = js.undefined
  /** Specifies the template script for customized tooltip for taskbar editing in Gantt
    */
  var taskbarEditingTooltipTemplate: js.UndefOr[String] = js.undefined
  /** Specifies the template Id for customized tooltip for taskbar editing in Gantt
    */
  var taskbarEditingTooltipTemplateId: js.UndefOr[String] = js.undefined
  /** Specifies the height of taskBar in Gantt.
    * @Default {20}
    */
  var taskbarHeight: js.UndefOr[Double] = js.undefined
  /** To Specify the JsRender script Id to customize the task bar with our preference
    */
  var taskbarTemplate: js.UndefOr[String] = js.undefined
  /** Specifies the template for tooltip on mouse action on taskbars
    */
  var taskbarTooltipTemplate: js.UndefOr[String] = js.undefined
  /** Specifies the template id for tooltip on mouse action on taskbars
    */
  var taskbarTooltipTemplateId: js.UndefOr[String] = js.undefined
  /** Triggered when toolbar item is clicked in Gantt.
    */
  var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, Unit]] = js.undefined
  /** Specifies the toolbarSettings options.
    */
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.undefined
  /** Specifies the tree expander column in Gantt
    * @Default {0}
    */
  var treeColumnIndex: js.UndefOr[Double] = js.undefined
  /** Enables or disables the schedule date validation while connecting a manually scheduled task with predecessor
    * @Default {false}
    */
  var validateManualTasksOnLinking: js.UndefOr[Boolean] = js.undefined
  /** Specifies the view type for a project in the Gantt.
    * @Default {ej.Gantt.ViewType.ProjectView}
    */
  var viewType: js.UndefOr[ViewType | String] = js.undefined
  /** Specifies the weekendBackground color in Gantt
    * @Default {#F2F2F2}
    */
  var weekendBackground: js.UndefOr[String] = js.undefined
  /** Specifies the mapping property path for the work field of a task in the data source. When it is mapped the end date and duration for a task will be calculated automatically.
    */
  var workMapping: js.UndefOr[String] = js.undefined
  /** Specifies the unit for the work involved in a task and it can be day, hour or minute
    * @Default {ej.Gantt.WorkUnit.Hour}
    */
  var workUnit: js.UndefOr[WorkUnit | String] = js.undefined
  /** Gets or sets the working days of a week in a project.
    * @Default {[Monday,Tuesday,Wednesday,Thursday,Friday]}
    */
  var workWeek: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the working time schedule of day
    * @Default {ej.Gantt.workingTimeScale.TimeScale8Hours}
    */
  var workingTimeScale: js.UndefOr[typings.ejWebAll.ej.Gantt.workingTimeScale | String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    actionBegin: /* e */ ActionBeginEventArgs => Unit = null,
    actionComplete: /* e */ ActionCompleteEventArgs => Unit = null,
    addDialogFields: js.Array[AddDialogField] = null,
    allowColumnResize: js.UndefOr[Boolean] = js.undefined,
    allowDragAndDrop: js.UndefOr[Boolean] = js.undefined,
    allowGanttChartEditing: js.UndefOr[Boolean] = js.undefined,
    allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    allowMultiSorting: js.UndefOr[Boolean] = js.undefined,
    allowMultipleExporting: js.UndefOr[Boolean] = js.undefined,
    allowSelection: js.UndefOr[Boolean] = js.undefined,
    allowSorting: js.UndefOr[Boolean] = js.undefined,
    allowUnscheduledTask: js.UndefOr[Boolean] = js.undefined,
    baselineColor: String = null,
    baselineEndDateMapping: String = null,
    baselineStartDateMapping: String = null,
    beginEdit: /* e */ BeginEditEventArgs => Unit = null,
    cellSelected: /* e */ CellSelectedEventArgs => Unit = null,
    cellSelecting: /* e */ CellSelectingEventArgs => Unit = null,
    cellTooltipTemplate: String = null,
    childMapping: String = null,
    collapsed: /* e */ CollapsedEventArgs => Unit = null,
    collapsing: /* e */ CollapsingEventArgs => Unit = null,
    columnDialogFields: js.Array[_] = null,
    connectorLineBackground: String = null,
    connectorlineWidth: Int | Double = null,
    contextMenuOpen: /* e */ ContextMenuOpenEventArgs => Unit = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    dataSource: js.Array[_] = null,
    dateFormat: String = null,
    dayWorkingTime: js.Array[_] = null,
    dragTooltip: DragTooltip = null,
    durationMapping: String = null,
    durationUnit: DurationUnit | String = null,
    durationUnitMapping: String = null,
    editDialogFields: js.Array[EditDialogField] = null,
    editSettings: EditSettings = null,
    enableAltRow: js.UndefOr[Boolean] = js.undefined,
    enableCollapseAll: js.UndefOr[Boolean] = js.undefined,
    enableContextMenu: js.UndefOr[Boolean] = js.undefined,
    enablePredecessorValidation: js.UndefOr[Boolean] = js.undefined,
    enableProgressBarResizing: js.UndefOr[Boolean] = js.undefined,
    enableResize: js.UndefOr[Boolean] = js.undefined,
    enableSerialNumber: js.UndefOr[Boolean] = js.undefined,
    enableTaskbarDragTooltip: js.UndefOr[Boolean] = js.undefined,
    enableTaskbarTooltip: js.UndefOr[Boolean] = js.undefined,
    enableVirtualization: js.UndefOr[Boolean] = js.undefined,
    enableWBS: js.UndefOr[Boolean] = js.undefined,
    enableWBSPredecessor: js.UndefOr[Boolean] = js.undefined,
    endDateMapping: String = null,
    endEdit: /* e */ EndEditEventArgs => Unit = null,
    expandStateMapping: String = null,
    expanded: /* e */ ExpandedEventArgs => Unit = null,
    expanding: /* e */ ExpandingEventArgs => Unit = null,
    filterSettings: FilterSettings = null,
    groupCollection: js.Array[_] = null,
    groupIdMapping: String = null,
    groupNameMapping: String = null,
    highlightNonWorkingTime: js.UndefOr[Boolean] = js.undefined,
    highlightWeekends: js.UndefOr[Boolean] = js.undefined,
    holidays: js.Array[Holiday] = null,
    includeWeekend: js.UndefOr[Boolean] = js.undefined,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    leftTaskLabelMapping: String = null,
    leftTaskLabelTemplate: String = null,
    load: /* e */ LoadEventArgs => Unit = null,
    locale: String = null,
    milestoneMapping: String = null,
    milestoneTemplate: String = null,
    nonWorkingBackground: String = null,
    notesMapping: String = null,
    parentProgressbarBackground: String = null,
    parentTaskIdMapping: String = null,
    parentTaskbarBackground: String = null,
    parentTaskbarTemplate: String = null,
    predecessorMapping: String = null,
    predecessorTooltipTemplate: String = null,
    progressMapping: String = null,
    progressbarBackground: String = null,
    progressbarHeight: Int | Double = null,
    progressbarTooltipTemplate: String = null,
    progressbarTooltipTemplateId: String = null,
    query: js.Any = null,
    queryCellInfo: /* e */ QueryCellInfoEventArgs => Unit = null,
    queryTaskbarInfo: /* e */ QueryTaskbarInfoEventArgs => Unit = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    renderBaseline: js.UndefOr[Boolean] = js.undefined,
    resourceCollectionMapping: String = null,
    resourceIdMapping: String = null,
    resourceInfoMapping: String = null,
    resourceNameMapping: String = null,
    resourceUnitMapping: String = null,
    resources: js.Array[_] = null,
    rightTaskLabelMapping: String = null,
    rightTaskLabelTemplate: String = null,
    roundOffDayworkingTime: js.UndefOr[Boolean] = js.undefined,
    rowDataBound: /* e */ RowDataBoundEventArgs => Unit = null,
    rowDrag: /* e */ RowDragEventArgs => Unit = null,
    rowDragStart: /* e */ RowDragStartEventArgs => Unit = null,
    rowDragStop: /* e */ RowDragStopEventArgs => Unit = null,
    rowHeight: Int | Double = null,
    rowSelected: /* e */ RowSelectedEventArgs => Unit = null,
    rowSelecting: /* e */ RowSelectingEventArgs => Unit = null,
    scheduleEndDate: String = null,
    scheduleHeaderSettings: ScheduleHeaderSettings = null,
    scheduleStartDate: String = null,
    selectedCellIndexes: js.Array[SelectedCellIndex] = null,
    selectedRowIndex: Int | Double = null,
    selectionMode: SelectionMode | String = null,
    selectionType: SelectionType | String = null,
    showColumnChooser: js.UndefOr[Boolean] = js.undefined,
    showColumnOptions: js.UndefOr[Boolean] = js.undefined,
    showGridCellTooltip: js.UndefOr[Boolean] = js.undefined,
    showGridExpandCellTooltip: js.UndefOr[Boolean] = js.undefined,
    showProgressStatus: js.UndefOr[Boolean] = js.undefined,
    showResourceNames: js.UndefOr[Boolean] = js.undefined,
    showTaskNames: js.UndefOr[Boolean] = js.undefined,
    sizeSettings: SizeSettings = null,
    sortSettings: SortSettings = null,
    splitterPosition: String = null,
    splitterResized: /* e */ SplitterResizedEventArgs => Unit = null,
    splitterSettings: SplitterSettings = null,
    startDateMapping: String = null,
    stripLines: js.Array[StripLine] = null,
    taskCollectionMapping: String = null,
    taskIdMapping: String = null,
    taskNameMapping: String = null,
    taskSchedulingMode: TaskSchedulingMode | String = null,
    taskSchedulingModeMapping: String = null,
    taskType: TaskType | String = null,
    taskbarBackground: String = null,
    taskbarClick: /* e */ TaskbarClickEventArgs => Unit = null,
    taskbarEdited: /* e */ TaskbarEditedEventArgs => Unit = null,
    taskbarEditing: /* e */ TaskbarEditingEventArgs => Unit = null,
    taskbarEditingTooltipTemplate: String = null,
    taskbarEditingTooltipTemplateId: String = null,
    taskbarHeight: Int | Double = null,
    taskbarTemplate: String = null,
    taskbarTooltipTemplate: String = null,
    taskbarTooltipTemplateId: String = null,
    toolbarClick: /* e */ ToolbarClickEventArgs => Unit = null,
    toolbarSettings: ToolbarSettings = null,
    treeColumnIndex: Int | Double = null,
    validateManualTasksOnLinking: js.UndefOr[Boolean] = js.undefined,
    viewType: ViewType | String = null,
    weekendBackground: String = null,
    workMapping: String = null,
    workUnit: WorkUnit | String = null,
    workWeek: js.Array[_] = null,
    workingTimeScale: workingTimeScale | String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (actionBegin != null) __obj.updateDynamic("actionBegin")(js.Any.fromFunction1(actionBegin))
    if (actionComplete != null) __obj.updateDynamic("actionComplete")(js.Any.fromFunction1(actionComplete))
    if (addDialogFields != null) __obj.updateDynamic("addDialogFields")(addDialogFields.asInstanceOf[js.Any])
    if (!js.isUndefined(allowColumnResize)) __obj.updateDynamic("allowColumnResize")(allowColumnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDragAndDrop)) __obj.updateDynamic("allowDragAndDrop")(allowDragAndDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(allowGanttChartEditing)) __obj.updateDynamic("allowGanttChartEditing")(allowGanttChartEditing.asInstanceOf[js.Any])
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation.asInstanceOf[js.Any])
    if (!js.isUndefined(allowMultiSorting)) __obj.updateDynamic("allowMultiSorting")(allowMultiSorting.asInstanceOf[js.Any])
    if (!js.isUndefined(allowMultipleExporting)) __obj.updateDynamic("allowMultipleExporting")(allowMultipleExporting.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSelection)) __obj.updateDynamic("allowSelection")(allowSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUnscheduledTask)) __obj.updateDynamic("allowUnscheduledTask")(allowUnscheduledTask.asInstanceOf[js.Any])
    if (baselineColor != null) __obj.updateDynamic("baselineColor")(baselineColor.asInstanceOf[js.Any])
    if (baselineEndDateMapping != null) __obj.updateDynamic("baselineEndDateMapping")(baselineEndDateMapping.asInstanceOf[js.Any])
    if (baselineStartDateMapping != null) __obj.updateDynamic("baselineStartDateMapping")(baselineStartDateMapping.asInstanceOf[js.Any])
    if (beginEdit != null) __obj.updateDynamic("beginEdit")(js.Any.fromFunction1(beginEdit))
    if (cellSelected != null) __obj.updateDynamic("cellSelected")(js.Any.fromFunction1(cellSelected))
    if (cellSelecting != null) __obj.updateDynamic("cellSelecting")(js.Any.fromFunction1(cellSelecting))
    if (cellTooltipTemplate != null) __obj.updateDynamic("cellTooltipTemplate")(cellTooltipTemplate.asInstanceOf[js.Any])
    if (childMapping != null) __obj.updateDynamic("childMapping")(childMapping.asInstanceOf[js.Any])
    if (collapsed != null) __obj.updateDynamic("collapsed")(js.Any.fromFunction1(collapsed))
    if (collapsing != null) __obj.updateDynamic("collapsing")(js.Any.fromFunction1(collapsing))
    if (columnDialogFields != null) __obj.updateDynamic("columnDialogFields")(columnDialogFields.asInstanceOf[js.Any])
    if (connectorLineBackground != null) __obj.updateDynamic("connectorLineBackground")(connectorLineBackground.asInstanceOf[js.Any])
    if (connectorlineWidth != null) __obj.updateDynamic("connectorlineWidth")(connectorlineWidth.asInstanceOf[js.Any])
    if (contextMenuOpen != null) __obj.updateDynamic("contextMenuOpen")(js.Any.fromFunction1(contextMenuOpen))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dayWorkingTime != null) __obj.updateDynamic("dayWorkingTime")(dayWorkingTime.asInstanceOf[js.Any])
    if (dragTooltip != null) __obj.updateDynamic("dragTooltip")(dragTooltip.asInstanceOf[js.Any])
    if (durationMapping != null) __obj.updateDynamic("durationMapping")(durationMapping.asInstanceOf[js.Any])
    if (durationUnit != null) __obj.updateDynamic("durationUnit")(durationUnit.asInstanceOf[js.Any])
    if (durationUnitMapping != null) __obj.updateDynamic("durationUnitMapping")(durationUnitMapping.asInstanceOf[js.Any])
    if (editDialogFields != null) __obj.updateDynamic("editDialogFields")(editDialogFields.asInstanceOf[js.Any])
    if (editSettings != null) __obj.updateDynamic("editSettings")(editSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAltRow)) __obj.updateDynamic("enableAltRow")(enableAltRow.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCollapseAll)) __obj.updateDynamic("enableCollapseAll")(enableCollapseAll.asInstanceOf[js.Any])
    if (!js.isUndefined(enableContextMenu)) __obj.updateDynamic("enableContextMenu")(enableContextMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePredecessorValidation)) __obj.updateDynamic("enablePredecessorValidation")(enablePredecessorValidation.asInstanceOf[js.Any])
    if (!js.isUndefined(enableProgressBarResizing)) __obj.updateDynamic("enableProgressBarResizing")(enableProgressBarResizing.asInstanceOf[js.Any])
    if (!js.isUndefined(enableResize)) __obj.updateDynamic("enableResize")(enableResize.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSerialNumber)) __obj.updateDynamic("enableSerialNumber")(enableSerialNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTaskbarDragTooltip)) __obj.updateDynamic("enableTaskbarDragTooltip")(enableTaskbarDragTooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTaskbarTooltip)) __obj.updateDynamic("enableTaskbarTooltip")(enableTaskbarTooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(enableVirtualization)) __obj.updateDynamic("enableVirtualization")(enableVirtualization.asInstanceOf[js.Any])
    if (!js.isUndefined(enableWBS)) __obj.updateDynamic("enableWBS")(enableWBS.asInstanceOf[js.Any])
    if (!js.isUndefined(enableWBSPredecessor)) __obj.updateDynamic("enableWBSPredecessor")(enableWBSPredecessor.asInstanceOf[js.Any])
    if (endDateMapping != null) __obj.updateDynamic("endDateMapping")(endDateMapping.asInstanceOf[js.Any])
    if (endEdit != null) __obj.updateDynamic("endEdit")(js.Any.fromFunction1(endEdit))
    if (expandStateMapping != null) __obj.updateDynamic("expandStateMapping")(expandStateMapping.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(js.Any.fromFunction1(expanded))
    if (expanding != null) __obj.updateDynamic("expanding")(js.Any.fromFunction1(expanding))
    if (filterSettings != null) __obj.updateDynamic("filterSettings")(filterSettings.asInstanceOf[js.Any])
    if (groupCollection != null) __obj.updateDynamic("groupCollection")(groupCollection.asInstanceOf[js.Any])
    if (groupIdMapping != null) __obj.updateDynamic("groupIdMapping")(groupIdMapping.asInstanceOf[js.Any])
    if (groupNameMapping != null) __obj.updateDynamic("groupNameMapping")(groupNameMapping.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightNonWorkingTime)) __obj.updateDynamic("highlightNonWorkingTime")(highlightNonWorkingTime.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightWeekends)) __obj.updateDynamic("highlightWeekends")(highlightWeekends.asInstanceOf[js.Any])
    if (holidays != null) __obj.updateDynamic("holidays")(holidays.asInstanceOf[js.Any])
    if (!js.isUndefined(includeWeekend)) __obj.updateDynamic("includeWeekend")(includeWeekend.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (leftTaskLabelMapping != null) __obj.updateDynamic("leftTaskLabelMapping")(leftTaskLabelMapping.asInstanceOf[js.Any])
    if (leftTaskLabelTemplate != null) __obj.updateDynamic("leftTaskLabelTemplate")(leftTaskLabelTemplate.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (milestoneMapping != null) __obj.updateDynamic("milestoneMapping")(milestoneMapping.asInstanceOf[js.Any])
    if (milestoneTemplate != null) __obj.updateDynamic("milestoneTemplate")(milestoneTemplate.asInstanceOf[js.Any])
    if (nonWorkingBackground != null) __obj.updateDynamic("nonWorkingBackground")(nonWorkingBackground.asInstanceOf[js.Any])
    if (notesMapping != null) __obj.updateDynamic("notesMapping")(notesMapping.asInstanceOf[js.Any])
    if (parentProgressbarBackground != null) __obj.updateDynamic("parentProgressbarBackground")(parentProgressbarBackground.asInstanceOf[js.Any])
    if (parentTaskIdMapping != null) __obj.updateDynamic("parentTaskIdMapping")(parentTaskIdMapping.asInstanceOf[js.Any])
    if (parentTaskbarBackground != null) __obj.updateDynamic("parentTaskbarBackground")(parentTaskbarBackground.asInstanceOf[js.Any])
    if (parentTaskbarTemplate != null) __obj.updateDynamic("parentTaskbarTemplate")(parentTaskbarTemplate.asInstanceOf[js.Any])
    if (predecessorMapping != null) __obj.updateDynamic("predecessorMapping")(predecessorMapping.asInstanceOf[js.Any])
    if (predecessorTooltipTemplate != null) __obj.updateDynamic("predecessorTooltipTemplate")(predecessorTooltipTemplate.asInstanceOf[js.Any])
    if (progressMapping != null) __obj.updateDynamic("progressMapping")(progressMapping.asInstanceOf[js.Any])
    if (progressbarBackground != null) __obj.updateDynamic("progressbarBackground")(progressbarBackground.asInstanceOf[js.Any])
    if (progressbarHeight != null) __obj.updateDynamic("progressbarHeight")(progressbarHeight.asInstanceOf[js.Any])
    if (progressbarTooltipTemplate != null) __obj.updateDynamic("progressbarTooltipTemplate")(progressbarTooltipTemplate.asInstanceOf[js.Any])
    if (progressbarTooltipTemplateId != null) __obj.updateDynamic("progressbarTooltipTemplateId")(progressbarTooltipTemplateId.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (queryCellInfo != null) __obj.updateDynamic("queryCellInfo")(js.Any.fromFunction1(queryCellInfo))
    if (queryTaskbarInfo != null) __obj.updateDynamic("queryTaskbarInfo")(js.Any.fromFunction1(queryTaskbarInfo))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(renderBaseline)) __obj.updateDynamic("renderBaseline")(renderBaseline.asInstanceOf[js.Any])
    if (resourceCollectionMapping != null) __obj.updateDynamic("resourceCollectionMapping")(resourceCollectionMapping.asInstanceOf[js.Any])
    if (resourceIdMapping != null) __obj.updateDynamic("resourceIdMapping")(resourceIdMapping.asInstanceOf[js.Any])
    if (resourceInfoMapping != null) __obj.updateDynamic("resourceInfoMapping")(resourceInfoMapping.asInstanceOf[js.Any])
    if (resourceNameMapping != null) __obj.updateDynamic("resourceNameMapping")(resourceNameMapping.asInstanceOf[js.Any])
    if (resourceUnitMapping != null) __obj.updateDynamic("resourceUnitMapping")(resourceUnitMapping.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (rightTaskLabelMapping != null) __obj.updateDynamic("rightTaskLabelMapping")(rightTaskLabelMapping.asInstanceOf[js.Any])
    if (rightTaskLabelTemplate != null) __obj.updateDynamic("rightTaskLabelTemplate")(rightTaskLabelTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(roundOffDayworkingTime)) __obj.updateDynamic("roundOffDayworkingTime")(roundOffDayworkingTime.asInstanceOf[js.Any])
    if (rowDataBound != null) __obj.updateDynamic("rowDataBound")(js.Any.fromFunction1(rowDataBound))
    if (rowDrag != null) __obj.updateDynamic("rowDrag")(js.Any.fromFunction1(rowDrag))
    if (rowDragStart != null) __obj.updateDynamic("rowDragStart")(js.Any.fromFunction1(rowDragStart))
    if (rowDragStop != null) __obj.updateDynamic("rowDragStop")(js.Any.fromFunction1(rowDragStop))
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rowSelected != null) __obj.updateDynamic("rowSelected")(js.Any.fromFunction1(rowSelected))
    if (rowSelecting != null) __obj.updateDynamic("rowSelecting")(js.Any.fromFunction1(rowSelecting))
    if (scheduleEndDate != null) __obj.updateDynamic("scheduleEndDate")(scheduleEndDate.asInstanceOf[js.Any])
    if (scheduleHeaderSettings != null) __obj.updateDynamic("scheduleHeaderSettings")(scheduleHeaderSettings.asInstanceOf[js.Any])
    if (scheduleStartDate != null) __obj.updateDynamic("scheduleStartDate")(scheduleStartDate.asInstanceOf[js.Any])
    if (selectedCellIndexes != null) __obj.updateDynamic("selectedCellIndexes")(selectedCellIndexes.asInstanceOf[js.Any])
    if (selectedRowIndex != null) __obj.updateDynamic("selectedRowIndex")(selectedRowIndex.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (selectionType != null) __obj.updateDynamic("selectionType")(selectionType.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnChooser)) __obj.updateDynamic("showColumnChooser")(showColumnChooser.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnOptions)) __obj.updateDynamic("showColumnOptions")(showColumnOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(showGridCellTooltip)) __obj.updateDynamic("showGridCellTooltip")(showGridCellTooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(showGridExpandCellTooltip)) __obj.updateDynamic("showGridExpandCellTooltip")(showGridExpandCellTooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(showProgressStatus)) __obj.updateDynamic("showProgressStatus")(showProgressStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(showResourceNames)) __obj.updateDynamic("showResourceNames")(showResourceNames.asInstanceOf[js.Any])
    if (!js.isUndefined(showTaskNames)) __obj.updateDynamic("showTaskNames")(showTaskNames.asInstanceOf[js.Any])
    if (sizeSettings != null) __obj.updateDynamic("sizeSettings")(sizeSettings.asInstanceOf[js.Any])
    if (sortSettings != null) __obj.updateDynamic("sortSettings")(sortSettings.asInstanceOf[js.Any])
    if (splitterPosition != null) __obj.updateDynamic("splitterPosition")(splitterPosition.asInstanceOf[js.Any])
    if (splitterResized != null) __obj.updateDynamic("splitterResized")(js.Any.fromFunction1(splitterResized))
    if (splitterSettings != null) __obj.updateDynamic("splitterSettings")(splitterSettings.asInstanceOf[js.Any])
    if (startDateMapping != null) __obj.updateDynamic("startDateMapping")(startDateMapping.asInstanceOf[js.Any])
    if (stripLines != null) __obj.updateDynamic("stripLines")(stripLines.asInstanceOf[js.Any])
    if (taskCollectionMapping != null) __obj.updateDynamic("taskCollectionMapping")(taskCollectionMapping.asInstanceOf[js.Any])
    if (taskIdMapping != null) __obj.updateDynamic("taskIdMapping")(taskIdMapping.asInstanceOf[js.Any])
    if (taskNameMapping != null) __obj.updateDynamic("taskNameMapping")(taskNameMapping.asInstanceOf[js.Any])
    if (taskSchedulingMode != null) __obj.updateDynamic("taskSchedulingMode")(taskSchedulingMode.asInstanceOf[js.Any])
    if (taskSchedulingModeMapping != null) __obj.updateDynamic("taskSchedulingModeMapping")(taskSchedulingModeMapping.asInstanceOf[js.Any])
    if (taskType != null) __obj.updateDynamic("taskType")(taskType.asInstanceOf[js.Any])
    if (taskbarBackground != null) __obj.updateDynamic("taskbarBackground")(taskbarBackground.asInstanceOf[js.Any])
    if (taskbarClick != null) __obj.updateDynamic("taskbarClick")(js.Any.fromFunction1(taskbarClick))
    if (taskbarEdited != null) __obj.updateDynamic("taskbarEdited")(js.Any.fromFunction1(taskbarEdited))
    if (taskbarEditing != null) __obj.updateDynamic("taskbarEditing")(js.Any.fromFunction1(taskbarEditing))
    if (taskbarEditingTooltipTemplate != null) __obj.updateDynamic("taskbarEditingTooltipTemplate")(taskbarEditingTooltipTemplate.asInstanceOf[js.Any])
    if (taskbarEditingTooltipTemplateId != null) __obj.updateDynamic("taskbarEditingTooltipTemplateId")(taskbarEditingTooltipTemplateId.asInstanceOf[js.Any])
    if (taskbarHeight != null) __obj.updateDynamic("taskbarHeight")(taskbarHeight.asInstanceOf[js.Any])
    if (taskbarTemplate != null) __obj.updateDynamic("taskbarTemplate")(taskbarTemplate.asInstanceOf[js.Any])
    if (taskbarTooltipTemplate != null) __obj.updateDynamic("taskbarTooltipTemplate")(taskbarTooltipTemplate.asInstanceOf[js.Any])
    if (taskbarTooltipTemplateId != null) __obj.updateDynamic("taskbarTooltipTemplateId")(taskbarTooltipTemplateId.asInstanceOf[js.Any])
    if (toolbarClick != null) __obj.updateDynamic("toolbarClick")(js.Any.fromFunction1(toolbarClick))
    if (toolbarSettings != null) __obj.updateDynamic("toolbarSettings")(toolbarSettings.asInstanceOf[js.Any])
    if (treeColumnIndex != null) __obj.updateDynamic("treeColumnIndex")(treeColumnIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(validateManualTasksOnLinking)) __obj.updateDynamic("validateManualTasksOnLinking")(validateManualTasksOnLinking.asInstanceOf[js.Any])
    if (viewType != null) __obj.updateDynamic("viewType")(viewType.asInstanceOf[js.Any])
    if (weekendBackground != null) __obj.updateDynamic("weekendBackground")(weekendBackground.asInstanceOf[js.Any])
    if (workMapping != null) __obj.updateDynamic("workMapping")(workMapping.asInstanceOf[js.Any])
    if (workUnit != null) __obj.updateDynamic("workUnit")(workUnit.asInstanceOf[js.Any])
    if (workWeek != null) __obj.updateDynamic("workWeek")(workWeek.asInstanceOf[js.Any])
    if (workingTimeScale != null) __obj.updateDynamic("workingTimeScale")(workingTimeScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

