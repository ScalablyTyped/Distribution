package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggered for every Gantt action before its starts.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
  /** Triggered for every Gantt action success event.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.native
  /** Specifies the fields to be included in the add dialog in Gantt
    * @Default {[]}
    */
  var addDialogFields: js.UndefOr[js.Array[AddDialogField]] = js.native
  /** Enables or disables the ability to resize column.
    * @Default {false}
    */
  var allowColumnResize: js.UndefOr[Boolean] = js.native
  /** Enables or disables the ability to drag and drop the row interactively to reorder the rows
    * @Default {false}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.native
  /** Enables or Disables Gantt chart editing in Gantt
    * @Default {true}
    */
  var allowGanttChartEditing: js.UndefOr[Boolean] = js.native
  /** Enables or Disables Keyboard navigation in Gantt
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /** Specifies enabling or disabling multiple sorting for Gantt columns
    * @Default {false}
    */
  var allowMultiSorting: js.UndefOr[Boolean] = js.native
  /** Enables or disables the option for multiple exporting
    * @Default {false}
    */
  var allowMultipleExporting: js.UndefOr[Boolean] = js.native
  /** Enables or disables the interactive selection of a row.
    * @Default {true}
    */
  var allowSelection: js.UndefOr[Boolean] = js.native
  /** Enables or disables sorting. When enabled, we can sort the column by clicking on the column.
    * @Default {false}
    */
  var allowSorting: js.UndefOr[Boolean] = js.native
  /** Enables or disables the rendering of unscheduled tasks.
    * @Default {false}
    */
  var allowUnscheduledTask: js.UndefOr[Boolean] = js.native
  /** Specifies the baseline background color in Gantt
    * @Default {#fba41c}
    */
  var baselineColor: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for baseline end date in datasource
    */
  var baselineEndDateMapping: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for baseline start date of a task in datasource
    */
  var baselineStartDateMapping: js.UndefOr[String] = js.native
  /** Triggered while enter the edit mode in the TreeGrid cell
    */
  var beginEdit: js.UndefOr[js.Function1[/* e */ BeginEditEventArgs, Unit]] = js.native
  /** Triggered after selected a cell
    */
  var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, Unit]] = js.native
  /** Triggered before selecting a cell
    */
  var cellSelecting: js.UndefOr[js.Function1[/* e */ CellSelectingEventArgs, Unit]] = js.native
  /** Specifies the template for cell tooltip
    * @Default {null}
    */
  var cellTooltipTemplate: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for sub tasks in datasource
    */
  var childMapping: js.UndefOr[String] = js.native
  /** Triggered after collapsed the Gantt record
    */
  var collapsed: js.UndefOr[js.Function1[/* e */ CollapsedEventArgs, Unit]] = js.native
  /** Triggered while collapsing the Gantt record
    */
  var collapsing: js.UndefOr[js.Function1[/* e */ CollapsingEventArgs, Unit]] = js.native
  /** To Specify the column fields to be displayed in the dialog while inserting a column using column menu.
    * @Default {[]}
    */
  var columnDialogFields: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the background of connector lines in Gantt
    */
  var connectorLineBackground: js.UndefOr[String] = js.native
  /** Specifies the width of the connector lines in Gantt
    * @Default {1}
    */
  var connectorlineWidth: js.UndefOr[Double] = js.native
  /** Triggered while Context Menu is rendered in Gantt control
    */
  var contextMenuOpen: js.UndefOr[js.Function1[/* e */ ContextMenuOpenEventArgs, Unit]] = js.native
  /** Triggered when Gantt is rendered completely.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Specify the CSS class for Gantt to achieve custom theme.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Collection of data or hierarchical data to represent in Gantt
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the dateFormat for Gantt , given format is displayed in tooltip , Grid .
    * @Default {MM/dd/yyyy}
    */
  var dateFormat: js.UndefOr[String] = js.native
  /** Specifies the customized working time for tasks in Gantt
    * @Default {[{ from: 08:00 AM, to: 12:00 PM , background:   }, { from: 01:00 PM, to: 05:00 PM , background:  }]}
    */
  var dayWorkingTime: js.UndefOr[js.Array[_]] = js.native
  /** Option for customizing the drag tooltip while reordering the rows.
    */
  var dragTooltip: js.UndefOr[DragTooltip] = js.native
  /** Specifies the mapping property path for duration of a task in datasource
    */
  var durationMapping: js.UndefOr[String] = js.native
  /** Specifies the duration unit for each tasks whether days or hours or minutes
    * @Default {ej.Gantt.DurationUnit.Day}
    */
  var durationUnit: js.UndefOr[DurationUnit | String] = js.native
  /** Specifies the mapping property path for task duration unit in datasource
    */
  var durationUnitMapping: js.UndefOr[String] = js.native
  /** Specifies the fields to be included in the edit dialog in Gantt
    * @Default {[]}
    */
  var editDialogFields: js.UndefOr[js.Array[EditDialogField]] = js.native
  /** Specifies the editSettings options in Gantt.
    */
  var editSettings: js.UndefOr[EditSettings] = js.native
  /** Enables or Disables enableAltRow row effect in Gantt
    * @Default {true}
    */
  var enableAltRow: js.UndefOr[Boolean] = js.native
  /** Enables or disables the collapse all records when loading the Gantt.
    * @Default {false}
    */
  var enableCollapseAll: js.UndefOr[Boolean] = js.native
  /** Enables or disables the contextmenu for Gantt , when enabled contextmenu appears on right clicking Gantt
    * @Default {false}
    */
  var enableContextMenu: js.UndefOr[Boolean] = js.native
  /** Enable or disable predecessor validation. When it is true, all the task's start and end dates are aligned based on its predecessors start and end dates.
    * @Default {true}
    */
  var enablePredecessorValidation: js.UndefOr[Boolean] = js.native
  /** Indicates whether we can edit the progress of a task interactively in Gantt.
    * @Default {true}
    */
  var enableProgressBarResizing: js.UndefOr[Boolean] = js.native
  /** Enables or disables the option for dynamically updating the Gantt size on window resizing
    * @Default {false}
    */
  var enableResize: js.UndefOr[Boolean] = js.native
  /** Enables or disables serial number column for Gantt. When enabled, the records will be number sequenced.
    * @Default {false}
    */
  var enableSerialNumber: js.UndefOr[Boolean] = js.native
  /** Enables or disables tooltip while editing (dragging/resizing) the taskbar.
    * @Default {true}
    */
  var enableTaskbarDragTooltip: js.UndefOr[Boolean] = js.native
  /** Enables or disables tooltip for taskbar.
    * @Default {true}
    */
  var enableTaskbarTooltip: js.UndefOr[Boolean] = js.native
  /** Enables/Disables virtualization for rendering Gantt items.
    * @Default {false}
    */
  var enableVirtualization: js.UndefOr[Boolean] = js.native
  /** Enables/disables work breakdown structure column.
    * @Default {false}
    */
  var enableWBS: js.UndefOr[Boolean] = js.native
  /** Enables/disables WBS predecessor column.
    * @Default {false}
    */
  var enableWBSPredecessor: js.UndefOr[Boolean] = js.native
  /** Specifies the mapping property path for end Date of a task in datasource
    */
  var endDateMapping: js.UndefOr[String] = js.native
  /** Triggered after save the modified cellValue in Gantt.
    */
  var endEdit: js.UndefOr[js.Function1[/* e */ EndEditEventArgs, Unit]] = js.native
  /** Specifies the mapping property path for the expand status of a record in data source.
    */
  var expandStateMapping: js.UndefOr[String] = js.native
  /** Triggered after expand the record
    */
  var expanded: js.UndefOr[js.Function1[/* e */ ExpandedEventArgs, Unit]] = js.native
  /** Triggered while expanding the Gantt record
    */
  var expanding: js.UndefOr[js.Function1[/* e */ ExpandingEventArgs, Unit]] = js.native
  /** Options for filtering and customizing filter actions.
    */
  var filterSettings: js.UndefOr[FilterSettings] = js.native
  /** Specifies the data collection for grouping the resources in resource allocation view in Gantt.
    * @Default {[]}
    */
  var groupCollection: js.UndefOr[js.Array[_]] = js.native
  /** Default Value
    */
  var groupIdMapping: js.UndefOr[String] = js.native
  /** Default Value
    */
  var groupNameMapping: js.UndefOr[String] = js.native
  /** Specifies whether to highlight the non working time in Gantt.
    * @Default {false}
    */
  var highlightNonWorkingTime: js.UndefOr[Boolean] = js.native
  /** Specifies whether to highlight the weekends in Gantt .
    * @Default {true}
    */
  var highlightWeekends: js.UndefOr[Boolean] = js.native
  /** Collection of holidays with date, background and label information to be displayed in Gantt.
    * @Default {[]}
    */
  var holidays: js.UndefOr[js.Array[Holiday]] = js.native
  /** Specifies whether to include weekends while calculating the duration of a task.
    * @Default {true}
    */
  var includeWeekend: js.UndefOr[Boolean] = js.native
  /** Enables or disables the responsiveness of Gantt
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Specifies the data source field name to be displayed as left task label
    */
  var leftTaskLabelMapping: js.UndefOr[String] = js.native
  /** Specifies the template for left task label
    */
  var leftTaskLabelTemplate: js.UndefOr[String] = js.native
  /** Triggered while Gantt is loaded
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Specify the locale for Gantt
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for milestone in datasource
    */
  var milestoneMapping: js.UndefOr[String] = js.native
  /** To Specify the JsRender script Id to customize the mile stone with our preference
    */
  var milestoneTemplate: js.UndefOr[String] = js.native
  /** Specifies the background color for non working time in Gantt.
    */
  var nonWorkingBackground: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for the task description in datasource
    */
  var notesMapping: js.UndefOr[String] = js.native
  /** Specifies the background of parent progressbar in Gantt
    */
  var parentProgressbarBackground: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for parent task Id in self reference datasource
    */
  var parentTaskIdMapping: js.UndefOr[String] = js.native
  /** Specifies the background of parent taskbar in Gantt
    */
  var parentTaskbarBackground: js.UndefOr[String] = js.native
  /** Specifies the template for parent taskbar
    */
  var parentTaskbarTemplate: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for predecessors of a task in datasource
    */
  var predecessorMapping: js.UndefOr[String] = js.native
  /** Specifies the JsRender template id or template script for predecessor tooltip on mouse action.
    */
  var predecessorTooltipTemplate: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for progress percentage of a task in datasource
    */
  var progressMapping: js.UndefOr[String] = js.native
  /** Specifies the background of progressbar in Gantt
    */
  var progressbarBackground: js.UndefOr[String] = js.native
  /** Specified the height of the progressbar in taskbar
    * @Default {100}
    */
  var progressbarHeight: js.UndefOr[Double] = js.native
  /** Specifies the template for tooltip on resizing progressbar
    * @Default {null}
    */
  var progressbarTooltipTemplate: js.UndefOr[String] = js.native
  /** Specifies the template ID for customized tooltip for progressbar editing in Gantt
    * @Default {null}
    */
  var progressbarTooltipTemplateId: js.UndefOr[String] = js.native
  /** It receives query to retrieve data from the table (query is same as SQL).
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.native
  /** Triggered while rendering each cell in the TreeGrid
    */
  var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, Unit]] = js.native
  /** Triggered while rendering each taskbar in the Gantt
    */
  var queryTaskbarInfo: js.UndefOr[js.Function1[/* e */ QueryTaskbarInfoEventArgs, Unit]] = js.native
  /** Enables or disables Gantt to read-only mode
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** Enables or Disables rendering baselines in Gantt , when enabled baseline is rendered in Gantt
    * @Default {false}
    */
  var renderBaseline: js.UndefOr[Boolean] = js.native
  /** Default Value
    */
  var resourceCollectionMapping: js.UndefOr[String] = js.native
  /** Specifies the mapping property name for resource ID in resource Collection in Gantt
    */
  var resourceIdMapping: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for resources of a task in datasource
    */
  var resourceInfoMapping: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for resource name of a task in Gantt
    */
  var resourceNameMapping: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for resource's percent effort involved in a task in datasource
    */
  var resourceUnitMapping: js.UndefOr[String] = js.native
  /** Collection of data regarding resources involved in entire project
    * @Default {[]}
    */
  var resources: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the data source field name to be displayed as right task label
    */
  var rightTaskLabelMapping: js.UndefOr[String] = js.native
  /** Specifies the template for right task label
    */
  var rightTaskLabelTemplate: js.UndefOr[String] = js.native
  /** Specifies whether rounding off the day working time edits
    * @Default {true}
    */
  var roundOffDayworkingTime: js.UndefOr[Boolean] = js.native
  /** Triggered while rendering each row
    */
  var rowDataBound: js.UndefOr[js.Function1[/* e */ RowDataBoundEventArgs, Unit]] = js.native
  /** Triggered while dragging a row in Gantt control
    */
  var rowDrag: js.UndefOr[js.Function1[/* e */ RowDragEventArgs, Unit]] = js.native
  /** Triggered while start to drag row in Gantt control
    */
  var rowDragStart: js.UndefOr[js.Function1[/* e */ RowDragStartEventArgs, Unit]] = js.native
  /** Triggered while drop a row in Gantt control
    */
  var rowDragStop: js.UndefOr[js.Function1[/* e */ RowDragStopEventArgs, Unit]] = js.native
  /** Specifies the height of a single row in Gantt. Also, we need to set same height in the CSS style with class name e-rowcell.
    * @Default {30}
    */
  var rowHeight: js.UndefOr[Double] = js.native
  /** Triggered after the row is selected.
    */
  var rowSelected: js.UndefOr[js.Function1[/* e */ RowSelectedEventArgs, Unit]] = js.native
  /** Triggered before the row is going to be selected.
    */
  var rowSelecting: js.UndefOr[js.Function1[/* e */ RowSelectingEventArgs, Unit]] = js.native
  /** Specifies end date of the Gantt schedule. By default, end date will be rounded to its next Saturday.
    * @Default {null}
    */
  var scheduleEndDate: js.UndefOr[String] = js.native
  /** Specifies the options for customizing schedule header.
    */
  var scheduleHeaderSettings: js.UndefOr[ScheduleHeaderSettings] = js.native
  /** Specifies start date of the Gantt schedule. By default, start date will be rounded to its previous Sunday.
    * @Default {null}
    */
  var scheduleStartDate: js.UndefOr[String] = js.native
  /** Specifies the selected cell information on rendering Gantt.
    */
  var selectedCellIndexes: js.UndefOr[js.Array[SelectedCellIndex]] = js.native
  /** Specifies the selected row Index in Gantt , the row with given index will highlighted
    * @Default {-1}
    */
  var selectedRowIndex: js.UndefOr[Double] = js.native
  /** Specifies the type of selection whether to select row or cell.
    * @Default {ej.Gantt.SelectionMode.Row}
    */
  var selectionMode: js.UndefOr[SelectionMode | String] = js.native
  /** Specifies the row selection type.
    * @Default {ej.Gantt.SelectionType.Single}
    */
  var selectionType: js.UndefOr[SelectionType | String] = js.native
  /** Enables or disables the column chooser.
    * @Default {false}
    */
  var showColumnChooser: js.UndefOr[Boolean] = js.native
  /** Enables/disables the options for inserting , deleting and renaming  columns.
    * @Default {false}
    */
  var showColumnOptions: js.UndefOr[Boolean] = js.native
  /** Specifies the template for cell tooltip
    * @Default {true}
    */
  var showGridCellTooltip: js.UndefOr[Boolean] = js.native
  /** Specifies whether to show grid cell tooltip over expander cell alone.
    * @Default {true}
    */
  var showGridExpandCellTooltip: js.UndefOr[Boolean] = js.native
  /** Specifies whether display task progress inside taskbar.
    * @Default {true}
    */
  var showProgressStatus: js.UndefOr[Boolean] = js.native
  /** Specifies whether to display resource names for a task beside taskbar.
    * @Default {true}
    */
  var showResourceNames: js.UndefOr[Boolean] = js.native
  /** Specifies whether to display task name beside task bar.
    * @Default {true}
    */
  var showTaskNames: js.UndefOr[Boolean] = js.native
  /** Specifies the size option of Gantt control.
    */
  var sizeSettings: js.UndefOr[SizeSettings] = js.native
  /** Specifies the sorting options for Gantt.
    */
  var sortSettings: js.UndefOr[SortSettings] = js.native
  /** Specifies splitter position in Gantt.
    * @Default {null}
    */
  var splitterPosition: js.UndefOr[String] = js.native
  /** Triggered after splitter resizing action in Gantt
    */
  var splitterResized: js.UndefOr[js.Function1[/* e */ SplitterResizedEventArgs, Unit]] = js.native
  /** Option to configure the splitter position.
    */
  var splitterSettings: js.UndefOr[SplitterSettings] = js.native
  /** Specifies the mapping property path for start date of a task in datasource
    */
  var startDateMapping: js.UndefOr[String] = js.native
  /** Specifies the options for striplines
    * @Default {[]}
    */
  var stripLines: js.UndefOr[js.Array[StripLine]] = js.native
  /** Default Value
    */
  var taskCollectionMapping: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for task Id in datasource
    */
  var taskIdMapping: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for task name in datasource
    */
  var taskNameMapping: js.UndefOr[String] = js.native
  /** Specifies the task scheduling mode for a project and this will be set to all the tasks available in the project
    * @Default {ej.Gantt.TaskSchedulingMode.Auto}
    */
  var taskSchedulingMode: js.UndefOr[TaskSchedulingMode | String] = js.native
  /** Specifies the mapping property path for the task scheduling mode for a task in datasource
    * @Default {auto}
    */
  var taskSchedulingModeMapping: js.UndefOr[String] = js.native
  /** Specifies the nature of a task for calculating the work,  and it can fixed duration, fixed work and fixed resource unit
    * @Default {ej.Gantt.TaskType.FixedUnit}
    */
  var taskType: js.UndefOr[TaskType | String] = js.native
  /** Specifies the background of the taskbar in Gantt
    */
  var taskbarBackground: js.UndefOr[String] = js.native
  /** Triggered when taskbar item is clicked in Gantt.
    */
  var taskbarClick: js.UndefOr[js.Function1[/* e */ TaskbarClickEventArgs, Unit]] = js.native
  /** Triggered after completing the editing operation in taskbar
    */
  var taskbarEdited: js.UndefOr[js.Function1[/* e */ TaskbarEditedEventArgs, Unit]] = js.native
  /** Triggered while editing the Gantt chart (dragging, resizing the taskbar )
    */
  var taskbarEditing: js.UndefOr[js.Function1[/* e */ TaskbarEditingEventArgs, Unit]] = js.native
  /** Specifies the template script for customized tooltip for taskbar editing in Gantt
    */
  var taskbarEditingTooltipTemplate: js.UndefOr[String] = js.native
  /** Specifies the template Id for customized tooltip for taskbar editing in Gantt
    */
  var taskbarEditingTooltipTemplateId: js.UndefOr[String] = js.native
  /** Specifies the height of taskBar in Gantt.
    * @Default {20}
    */
  var taskbarHeight: js.UndefOr[Double] = js.native
  /** To Specify the JsRender script Id to customize the task bar with our preference
    */
  var taskbarTemplate: js.UndefOr[String] = js.native
  /** Specifies the template for tooltip on mouse action on taskbars
    */
  var taskbarTooltipTemplate: js.UndefOr[String] = js.native
  /** Specifies the template id for tooltip on mouse action on taskbars
    */
  var taskbarTooltipTemplateId: js.UndefOr[String] = js.native
  /** Triggered when toolbar item is clicked in Gantt.
    */
  var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, Unit]] = js.native
  /** Specifies the toolbarSettings options.
    */
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.native
  /** Specifies the tree expander column in Gantt
    * @Default {0}
    */
  var treeColumnIndex: js.UndefOr[Double] = js.native
  /** Enables or disables the schedule date validation while connecting a manually scheduled task with predecessor
    * @Default {false}
    */
  var validateManualTasksOnLinking: js.UndefOr[Boolean] = js.native
  /** Specifies the view type for a project in the Gantt.
    * @Default {ej.Gantt.ViewType.ProjectView}
    */
  var viewType: js.UndefOr[ViewType | String] = js.native
  /** Specifies the weekendBackground color in Gantt
    * @Default {#F2F2F2}
    */
  var weekendBackground: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for the work field of a task in the data source. When it is mapped the end date and duration for a task will be calculated automatically.
    */
  var workMapping: js.UndefOr[String] = js.native
  /** Specifies the unit for the work involved in a task and it can be day, hour or minute
    * @Default {ej.Gantt.WorkUnit.Hour}
    */
  var workUnit: js.UndefOr[WorkUnit | String] = js.native
  /** Gets or sets the working days of a week in a project.
    * @Default {[Monday,Tuesday,Wednesday,Thursday,Friday]}
    */
  var workWeek: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the working time schedule of day
    * @Default {ej.Gantt.workingTimeScale.TimeScale8Hours}
    */
  var workingTimeScale: js.UndefOr[typings.ejWebAll.ej.Gantt.workingTimeScale | String] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
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
    def setActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = this.set("actionBegin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteActionBegin: Self = this.set("actionBegin", js.undefined)
    @scala.inline
    def setActionComplete(value: /* e */ ActionCompleteEventArgs => Unit): Self = this.set("actionComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteActionComplete: Self = this.set("actionComplete", js.undefined)
    @scala.inline
    def setAddDialogFieldsVarargs(value: AddDialogField*): Self = this.set("addDialogFields", js.Array(value :_*))
    @scala.inline
    def setAddDialogFields(value: js.Array[AddDialogField]): Self = this.set("addDialogFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddDialogFields: Self = this.set("addDialogFields", js.undefined)
    @scala.inline
    def setAllowColumnResize(value: Boolean): Self = this.set("allowColumnResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowColumnResize: Self = this.set("allowColumnResize", js.undefined)
    @scala.inline
    def setAllowDragAndDrop(value: Boolean): Self = this.set("allowDragAndDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDragAndDrop: Self = this.set("allowDragAndDrop", js.undefined)
    @scala.inline
    def setAllowGanttChartEditing(value: Boolean): Self = this.set("allowGanttChartEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowGanttChartEditing: Self = this.set("allowGanttChartEditing", js.undefined)
    @scala.inline
    def setAllowKeyboardNavigation(value: Boolean): Self = this.set("allowKeyboardNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowKeyboardNavigation: Self = this.set("allowKeyboardNavigation", js.undefined)
    @scala.inline
    def setAllowMultiSorting(value: Boolean): Self = this.set("allowMultiSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMultiSorting: Self = this.set("allowMultiSorting", js.undefined)
    @scala.inline
    def setAllowMultipleExporting(value: Boolean): Self = this.set("allowMultipleExporting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMultipleExporting: Self = this.set("allowMultipleExporting", js.undefined)
    @scala.inline
    def setAllowSelection(value: Boolean): Self = this.set("allowSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSelection: Self = this.set("allowSelection", js.undefined)
    @scala.inline
    def setAllowSorting(value: Boolean): Self = this.set("allowSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSorting: Self = this.set("allowSorting", js.undefined)
    @scala.inline
    def setAllowUnscheduledTask(value: Boolean): Self = this.set("allowUnscheduledTask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUnscheduledTask: Self = this.set("allowUnscheduledTask", js.undefined)
    @scala.inline
    def setBaselineColor(value: String): Self = this.set("baselineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaselineColor: Self = this.set("baselineColor", js.undefined)
    @scala.inline
    def setBaselineEndDateMapping(value: String): Self = this.set("baselineEndDateMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaselineEndDateMapping: Self = this.set("baselineEndDateMapping", js.undefined)
    @scala.inline
    def setBaselineStartDateMapping(value: String): Self = this.set("baselineStartDateMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaselineStartDateMapping: Self = this.set("baselineStartDateMapping", js.undefined)
    @scala.inline
    def setBeginEdit(value: /* e */ BeginEditEventArgs => Unit): Self = this.set("beginEdit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeginEdit: Self = this.set("beginEdit", js.undefined)
    @scala.inline
    def setCellSelected(value: /* e */ CellSelectedEventArgs => Unit): Self = this.set("cellSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellSelected: Self = this.set("cellSelected", js.undefined)
    @scala.inline
    def setCellSelecting(value: /* e */ CellSelectingEventArgs => Unit): Self = this.set("cellSelecting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellSelecting: Self = this.set("cellSelecting", js.undefined)
    @scala.inline
    def setCellTooltipTemplate(value: String): Self = this.set("cellTooltipTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellTooltipTemplate: Self = this.set("cellTooltipTemplate", js.undefined)
    @scala.inline
    def setChildMapping(value: String): Self = this.set("childMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildMapping: Self = this.set("childMapping", js.undefined)
    @scala.inline
    def setCollapsed(value: /* e */ CollapsedEventArgs => Unit): Self = this.set("collapsed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setCollapsing(value: /* e */ CollapsingEventArgs => Unit): Self = this.set("collapsing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCollapsing: Self = this.set("collapsing", js.undefined)
    @scala.inline
    def setColumnDialogFieldsVarargs(value: js.Any*): Self = this.set("columnDialogFields", js.Array(value :_*))
    @scala.inline
    def setColumnDialogFields(value: js.Array[_]): Self = this.set("columnDialogFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnDialogFields: Self = this.set("columnDialogFields", js.undefined)
    @scala.inline
    def setConnectorLineBackground(value: String): Self = this.set("connectorLineBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectorLineBackground: Self = this.set("connectorLineBackground", js.undefined)
    @scala.inline
    def setConnectorlineWidth(value: Double): Self = this.set("connectorlineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectorlineWidth: Self = this.set("connectorlineWidth", js.undefined)
    @scala.inline
    def setContextMenuOpen(value: /* e */ ContextMenuOpenEventArgs => Unit): Self = this.set("contextMenuOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContextMenuOpen: Self = this.set("contextMenuOpen", js.undefined)
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: js.Array[_]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    @scala.inline
    def setDayWorkingTimeVarargs(value: js.Any*): Self = this.set("dayWorkingTime", js.Array(value :_*))
    @scala.inline
    def setDayWorkingTime(value: js.Array[_]): Self = this.set("dayWorkingTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayWorkingTime: Self = this.set("dayWorkingTime", js.undefined)
    @scala.inline
    def setDragTooltip(value: DragTooltip): Self = this.set("dragTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragTooltip: Self = this.set("dragTooltip", js.undefined)
    @scala.inline
    def setDurationMapping(value: String): Self = this.set("durationMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationMapping: Self = this.set("durationMapping", js.undefined)
    @scala.inline
    def setDurationUnit(value: DurationUnit | String): Self = this.set("durationUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationUnit: Self = this.set("durationUnit", js.undefined)
    @scala.inline
    def setDurationUnitMapping(value: String): Self = this.set("durationUnitMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationUnitMapping: Self = this.set("durationUnitMapping", js.undefined)
    @scala.inline
    def setEditDialogFieldsVarargs(value: EditDialogField*): Self = this.set("editDialogFields", js.Array(value :_*))
    @scala.inline
    def setEditDialogFields(value: js.Array[EditDialogField]): Self = this.set("editDialogFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditDialogFields: Self = this.set("editDialogFields", js.undefined)
    @scala.inline
    def setEditSettings(value: EditSettings): Self = this.set("editSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditSettings: Self = this.set("editSettings", js.undefined)
    @scala.inline
    def setEnableAltRow(value: Boolean): Self = this.set("enableAltRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAltRow: Self = this.set("enableAltRow", js.undefined)
    @scala.inline
    def setEnableCollapseAll(value: Boolean): Self = this.set("enableCollapseAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCollapseAll: Self = this.set("enableCollapseAll", js.undefined)
    @scala.inline
    def setEnableContextMenu(value: Boolean): Self = this.set("enableContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableContextMenu: Self = this.set("enableContextMenu", js.undefined)
    @scala.inline
    def setEnablePredecessorValidation(value: Boolean): Self = this.set("enablePredecessorValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePredecessorValidation: Self = this.set("enablePredecessorValidation", js.undefined)
    @scala.inline
    def setEnableProgressBarResizing(value: Boolean): Self = this.set("enableProgressBarResizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableProgressBarResizing: Self = this.set("enableProgressBarResizing", js.undefined)
    @scala.inline
    def setEnableResize(value: Boolean): Self = this.set("enableResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableResize: Self = this.set("enableResize", js.undefined)
    @scala.inline
    def setEnableSerialNumber(value: Boolean): Self = this.set("enableSerialNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSerialNumber: Self = this.set("enableSerialNumber", js.undefined)
    @scala.inline
    def setEnableTaskbarDragTooltip(value: Boolean): Self = this.set("enableTaskbarDragTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTaskbarDragTooltip: Self = this.set("enableTaskbarDragTooltip", js.undefined)
    @scala.inline
    def setEnableTaskbarTooltip(value: Boolean): Self = this.set("enableTaskbarTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTaskbarTooltip: Self = this.set("enableTaskbarTooltip", js.undefined)
    @scala.inline
    def setEnableVirtualization(value: Boolean): Self = this.set("enableVirtualization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableVirtualization: Self = this.set("enableVirtualization", js.undefined)
    @scala.inline
    def setEnableWBS(value: Boolean): Self = this.set("enableWBS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableWBS: Self = this.set("enableWBS", js.undefined)
    @scala.inline
    def setEnableWBSPredecessor(value: Boolean): Self = this.set("enableWBSPredecessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableWBSPredecessor: Self = this.set("enableWBSPredecessor", js.undefined)
    @scala.inline
    def setEndDateMapping(value: String): Self = this.set("endDateMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDateMapping: Self = this.set("endDateMapping", js.undefined)
    @scala.inline
    def setEndEdit(value: /* e */ EndEditEventArgs => Unit): Self = this.set("endEdit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEndEdit: Self = this.set("endEdit", js.undefined)
    @scala.inline
    def setExpandStateMapping(value: String): Self = this.set("expandStateMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandStateMapping: Self = this.set("expandStateMapping", js.undefined)
    @scala.inline
    def setExpanded(value: /* e */ ExpandedEventArgs => Unit): Self = this.set("expanded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setExpanding(value: /* e */ ExpandingEventArgs => Unit): Self = this.set("expanding", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExpanding: Self = this.set("expanding", js.undefined)
    @scala.inline
    def setFilterSettings(value: FilterSettings): Self = this.set("filterSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterSettings: Self = this.set("filterSettings", js.undefined)
    @scala.inline
    def setGroupCollectionVarargs(value: js.Any*): Self = this.set("groupCollection", js.Array(value :_*))
    @scala.inline
    def setGroupCollection(value: js.Array[_]): Self = this.set("groupCollection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupCollection: Self = this.set("groupCollection", js.undefined)
    @scala.inline
    def setGroupIdMapping(value: String): Self = this.set("groupIdMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupIdMapping: Self = this.set("groupIdMapping", js.undefined)
    @scala.inline
    def setGroupNameMapping(value: String): Self = this.set("groupNameMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupNameMapping: Self = this.set("groupNameMapping", js.undefined)
    @scala.inline
    def setHighlightNonWorkingTime(value: Boolean): Self = this.set("highlightNonWorkingTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightNonWorkingTime: Self = this.set("highlightNonWorkingTime", js.undefined)
    @scala.inline
    def setHighlightWeekends(value: Boolean): Self = this.set("highlightWeekends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightWeekends: Self = this.set("highlightWeekends", js.undefined)
    @scala.inline
    def setHolidaysVarargs(value: Holiday*): Self = this.set("holidays", js.Array(value :_*))
    @scala.inline
    def setHolidays(value: js.Array[Holiday]): Self = this.set("holidays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHolidays: Self = this.set("holidays", js.undefined)
    @scala.inline
    def setIncludeWeekend(value: Boolean): Self = this.set("includeWeekend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeWeekend: Self = this.set("includeWeekend", js.undefined)
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    @scala.inline
    def setLeftTaskLabelMapping(value: String): Self = this.set("leftTaskLabelMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftTaskLabelMapping: Self = this.set("leftTaskLabelMapping", js.undefined)
    @scala.inline
    def setLeftTaskLabelTemplate(value: String): Self = this.set("leftTaskLabelTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftTaskLabelTemplate: Self = this.set("leftTaskLabelTemplate", js.undefined)
    @scala.inline
    def setLoad(value: /* e */ LoadEventArgs => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMilestoneMapping(value: String): Self = this.set("milestoneMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMilestoneMapping: Self = this.set("milestoneMapping", js.undefined)
    @scala.inline
    def setMilestoneTemplate(value: String): Self = this.set("milestoneTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMilestoneTemplate: Self = this.set("milestoneTemplate", js.undefined)
    @scala.inline
    def setNonWorkingBackground(value: String): Self = this.set("nonWorkingBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonWorkingBackground: Self = this.set("nonWorkingBackground", js.undefined)
    @scala.inline
    def setNotesMapping(value: String): Self = this.set("notesMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotesMapping: Self = this.set("notesMapping", js.undefined)
    @scala.inline
    def setParentProgressbarBackground(value: String): Self = this.set("parentProgressbarBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentProgressbarBackground: Self = this.set("parentProgressbarBackground", js.undefined)
    @scala.inline
    def setParentTaskIdMapping(value: String): Self = this.set("parentTaskIdMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentTaskIdMapping: Self = this.set("parentTaskIdMapping", js.undefined)
    @scala.inline
    def setParentTaskbarBackground(value: String): Self = this.set("parentTaskbarBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentTaskbarBackground: Self = this.set("parentTaskbarBackground", js.undefined)
    @scala.inline
    def setParentTaskbarTemplate(value: String): Self = this.set("parentTaskbarTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentTaskbarTemplate: Self = this.set("parentTaskbarTemplate", js.undefined)
    @scala.inline
    def setPredecessorMapping(value: String): Self = this.set("predecessorMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredecessorMapping: Self = this.set("predecessorMapping", js.undefined)
    @scala.inline
    def setPredecessorTooltipTemplate(value: String): Self = this.set("predecessorTooltipTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredecessorTooltipTemplate: Self = this.set("predecessorTooltipTemplate", js.undefined)
    @scala.inline
    def setProgressMapping(value: String): Self = this.set("progressMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressMapping: Self = this.set("progressMapping", js.undefined)
    @scala.inline
    def setProgressbarBackground(value: String): Self = this.set("progressbarBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressbarBackground: Self = this.set("progressbarBackground", js.undefined)
    @scala.inline
    def setProgressbarHeight(value: Double): Self = this.set("progressbarHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressbarHeight: Self = this.set("progressbarHeight", js.undefined)
    @scala.inline
    def setProgressbarTooltipTemplate(value: String): Self = this.set("progressbarTooltipTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressbarTooltipTemplate: Self = this.set("progressbarTooltipTemplate", js.undefined)
    @scala.inline
    def setProgressbarTooltipTemplateId(value: String): Self = this.set("progressbarTooltipTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressbarTooltipTemplateId: Self = this.set("progressbarTooltipTemplateId", js.undefined)
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setQueryCellInfo(value: /* e */ QueryCellInfoEventArgs => Unit): Self = this.set("queryCellInfo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteQueryCellInfo: Self = this.set("queryCellInfo", js.undefined)
    @scala.inline
    def setQueryTaskbarInfo(value: /* e */ QueryTaskbarInfoEventArgs => Unit): Self = this.set("queryTaskbarInfo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteQueryTaskbarInfo: Self = this.set("queryTaskbarInfo", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRenderBaseline(value: Boolean): Self = this.set("renderBaseline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderBaseline: Self = this.set("renderBaseline", js.undefined)
    @scala.inline
    def setResourceCollectionMapping(value: String): Self = this.set("resourceCollectionMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceCollectionMapping: Self = this.set("resourceCollectionMapping", js.undefined)
    @scala.inline
    def setResourceIdMapping(value: String): Self = this.set("resourceIdMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceIdMapping: Self = this.set("resourceIdMapping", js.undefined)
    @scala.inline
    def setResourceInfoMapping(value: String): Self = this.set("resourceInfoMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceInfoMapping: Self = this.set("resourceInfoMapping", js.undefined)
    @scala.inline
    def setResourceNameMapping(value: String): Self = this.set("resourceNameMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceNameMapping: Self = this.set("resourceNameMapping", js.undefined)
    @scala.inline
    def setResourceUnitMapping(value: String): Self = this.set("resourceUnitMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceUnitMapping: Self = this.set("resourceUnitMapping", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: js.Any*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[_]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setRightTaskLabelMapping(value: String): Self = this.set("rightTaskLabelMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightTaskLabelMapping: Self = this.set("rightTaskLabelMapping", js.undefined)
    @scala.inline
    def setRightTaskLabelTemplate(value: String): Self = this.set("rightTaskLabelTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightTaskLabelTemplate: Self = this.set("rightTaskLabelTemplate", js.undefined)
    @scala.inline
    def setRoundOffDayworkingTime(value: Boolean): Self = this.set("roundOffDayworkingTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoundOffDayworkingTime: Self = this.set("roundOffDayworkingTime", js.undefined)
    @scala.inline
    def setRowDataBound(value: /* e */ RowDataBoundEventArgs => Unit): Self = this.set("rowDataBound", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowDataBound: Self = this.set("rowDataBound", js.undefined)
    @scala.inline
    def setRowDrag(value: /* e */ RowDragEventArgs => Unit): Self = this.set("rowDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowDrag: Self = this.set("rowDrag", js.undefined)
    @scala.inline
    def setRowDragStart(value: /* e */ RowDragStartEventArgs => Unit): Self = this.set("rowDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowDragStart: Self = this.set("rowDragStart", js.undefined)
    @scala.inline
    def setRowDragStop(value: /* e */ RowDragStopEventArgs => Unit): Self = this.set("rowDragStop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowDragStop: Self = this.set("rowDragStop", js.undefined)
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    @scala.inline
    def setRowSelected(value: /* e */ RowSelectedEventArgs => Unit): Self = this.set("rowSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowSelected: Self = this.set("rowSelected", js.undefined)
    @scala.inline
    def setRowSelecting(value: /* e */ RowSelectingEventArgs => Unit): Self = this.set("rowSelecting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowSelecting: Self = this.set("rowSelecting", js.undefined)
    @scala.inline
    def setScheduleEndDate(value: String): Self = this.set("scheduleEndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleEndDate: Self = this.set("scheduleEndDate", js.undefined)
    @scala.inline
    def setScheduleHeaderSettings(value: ScheduleHeaderSettings): Self = this.set("scheduleHeaderSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleHeaderSettings: Self = this.set("scheduleHeaderSettings", js.undefined)
    @scala.inline
    def setScheduleStartDate(value: String): Self = this.set("scheduleStartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleStartDate: Self = this.set("scheduleStartDate", js.undefined)
    @scala.inline
    def setSelectedCellIndexesVarargs(value: SelectedCellIndex*): Self = this.set("selectedCellIndexes", js.Array(value :_*))
    @scala.inline
    def setSelectedCellIndexes(value: js.Array[SelectedCellIndex]): Self = this.set("selectedCellIndexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedCellIndexes: Self = this.set("selectedCellIndexes", js.undefined)
    @scala.inline
    def setSelectedRowIndex(value: Double): Self = this.set("selectedRowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedRowIndex: Self = this.set("selectedRowIndex", js.undefined)
    @scala.inline
    def setSelectionMode(value: SelectionMode | String): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setSelectionType(value: SelectionType | String): Self = this.set("selectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionType: Self = this.set("selectionType", js.undefined)
    @scala.inline
    def setShowColumnChooser(value: Boolean): Self = this.set("showColumnChooser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowColumnChooser: Self = this.set("showColumnChooser", js.undefined)
    @scala.inline
    def setShowColumnOptions(value: Boolean): Self = this.set("showColumnOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowColumnOptions: Self = this.set("showColumnOptions", js.undefined)
    @scala.inline
    def setShowGridCellTooltip(value: Boolean): Self = this.set("showGridCellTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowGridCellTooltip: Self = this.set("showGridCellTooltip", js.undefined)
    @scala.inline
    def setShowGridExpandCellTooltip(value: Boolean): Self = this.set("showGridExpandCellTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowGridExpandCellTooltip: Self = this.set("showGridExpandCellTooltip", js.undefined)
    @scala.inline
    def setShowProgressStatus(value: Boolean): Self = this.set("showProgressStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowProgressStatus: Self = this.set("showProgressStatus", js.undefined)
    @scala.inline
    def setShowResourceNames(value: Boolean): Self = this.set("showResourceNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowResourceNames: Self = this.set("showResourceNames", js.undefined)
    @scala.inline
    def setShowTaskNames(value: Boolean): Self = this.set("showTaskNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTaskNames: Self = this.set("showTaskNames", js.undefined)
    @scala.inline
    def setSizeSettings(value: SizeSettings): Self = this.set("sizeSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeSettings: Self = this.set("sizeSettings", js.undefined)
    @scala.inline
    def setSortSettings(value: SortSettings): Self = this.set("sortSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortSettings: Self = this.set("sortSettings", js.undefined)
    @scala.inline
    def setSplitterPosition(value: String): Self = this.set("splitterPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitterPosition: Self = this.set("splitterPosition", js.undefined)
    @scala.inline
    def setSplitterResized(value: /* e */ SplitterResizedEventArgs => Unit): Self = this.set("splitterResized", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSplitterResized: Self = this.set("splitterResized", js.undefined)
    @scala.inline
    def setSplitterSettings(value: SplitterSettings): Self = this.set("splitterSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitterSettings: Self = this.set("splitterSettings", js.undefined)
    @scala.inline
    def setStartDateMapping(value: String): Self = this.set("startDateMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDateMapping: Self = this.set("startDateMapping", js.undefined)
    @scala.inline
    def setStripLinesVarargs(value: StripLine*): Self = this.set("stripLines", js.Array(value :_*))
    @scala.inline
    def setStripLines(value: js.Array[StripLine]): Self = this.set("stripLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripLines: Self = this.set("stripLines", js.undefined)
    @scala.inline
    def setTaskCollectionMapping(value: String): Self = this.set("taskCollectionMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskCollectionMapping: Self = this.set("taskCollectionMapping", js.undefined)
    @scala.inline
    def setTaskIdMapping(value: String): Self = this.set("taskIdMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskIdMapping: Self = this.set("taskIdMapping", js.undefined)
    @scala.inline
    def setTaskNameMapping(value: String): Self = this.set("taskNameMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskNameMapping: Self = this.set("taskNameMapping", js.undefined)
    @scala.inline
    def setTaskSchedulingMode(value: TaskSchedulingMode | String): Self = this.set("taskSchedulingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskSchedulingMode: Self = this.set("taskSchedulingMode", js.undefined)
    @scala.inline
    def setTaskSchedulingModeMapping(value: String): Self = this.set("taskSchedulingModeMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskSchedulingModeMapping: Self = this.set("taskSchedulingModeMapping", js.undefined)
    @scala.inline
    def setTaskType(value: TaskType | String): Self = this.set("taskType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskType: Self = this.set("taskType", js.undefined)
    @scala.inline
    def setTaskbarBackground(value: String): Self = this.set("taskbarBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskbarBackground: Self = this.set("taskbarBackground", js.undefined)
    @scala.inline
    def setTaskbarClick(value: /* e */ TaskbarClickEventArgs => Unit): Self = this.set("taskbarClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTaskbarClick: Self = this.set("taskbarClick", js.undefined)
    @scala.inline
    def setTaskbarEdited(value: /* e */ TaskbarEditedEventArgs => Unit): Self = this.set("taskbarEdited", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTaskbarEdited: Self = this.set("taskbarEdited", js.undefined)
    @scala.inline
    def setTaskbarEditing(value: /* e */ TaskbarEditingEventArgs => Unit): Self = this.set("taskbarEditing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTaskbarEditing: Self = this.set("taskbarEditing", js.undefined)
    @scala.inline
    def setTaskbarEditingTooltipTemplate(value: String): Self = this.set("taskbarEditingTooltipTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskbarEditingTooltipTemplate: Self = this.set("taskbarEditingTooltipTemplate", js.undefined)
    @scala.inline
    def setTaskbarEditingTooltipTemplateId(value: String): Self = this.set("taskbarEditingTooltipTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskbarEditingTooltipTemplateId: Self = this.set("taskbarEditingTooltipTemplateId", js.undefined)
    @scala.inline
    def setTaskbarHeight(value: Double): Self = this.set("taskbarHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskbarHeight: Self = this.set("taskbarHeight", js.undefined)
    @scala.inline
    def setTaskbarTemplate(value: String): Self = this.set("taskbarTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskbarTemplate: Self = this.set("taskbarTemplate", js.undefined)
    @scala.inline
    def setTaskbarTooltipTemplate(value: String): Self = this.set("taskbarTooltipTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskbarTooltipTemplate: Self = this.set("taskbarTooltipTemplate", js.undefined)
    @scala.inline
    def setTaskbarTooltipTemplateId(value: String): Self = this.set("taskbarTooltipTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskbarTooltipTemplateId: Self = this.set("taskbarTooltipTemplateId", js.undefined)
    @scala.inline
    def setToolbarClick(value: /* e */ ToolbarClickEventArgs => Unit): Self = this.set("toolbarClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToolbarClick: Self = this.set("toolbarClick", js.undefined)
    @scala.inline
    def setToolbarSettings(value: ToolbarSettings): Self = this.set("toolbarSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbarSettings: Self = this.set("toolbarSettings", js.undefined)
    @scala.inline
    def setTreeColumnIndex(value: Double): Self = this.set("treeColumnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeColumnIndex: Self = this.set("treeColumnIndex", js.undefined)
    @scala.inline
    def setValidateManualTasksOnLinking(value: Boolean): Self = this.set("validateManualTasksOnLinking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateManualTasksOnLinking: Self = this.set("validateManualTasksOnLinking", js.undefined)
    @scala.inline
    def setViewType(value: ViewType | String): Self = this.set("viewType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewType: Self = this.set("viewType", js.undefined)
    @scala.inline
    def setWeekendBackground(value: String): Self = this.set("weekendBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekendBackground: Self = this.set("weekendBackground", js.undefined)
    @scala.inline
    def setWorkMapping(value: String): Self = this.set("workMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkMapping: Self = this.set("workMapping", js.undefined)
    @scala.inline
    def setWorkUnit(value: WorkUnit | String): Self = this.set("workUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkUnit: Self = this.set("workUnit", js.undefined)
    @scala.inline
    def setWorkWeekVarargs(value: js.Any*): Self = this.set("workWeek", js.Array(value :_*))
    @scala.inline
    def setWorkWeek(value: js.Array[_]): Self = this.set("workWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkWeek: Self = this.set("workWeek", js.undefined)
    @scala.inline
    def setWorkingTimeScale(value: workingTimeScale | String): Self = this.set("workingTimeScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkingTimeScale: Self = this.set("workingTimeScale", js.undefined)
  }
  
}

