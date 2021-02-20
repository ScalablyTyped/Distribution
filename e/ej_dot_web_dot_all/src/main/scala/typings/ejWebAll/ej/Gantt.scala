package typings.ejWebAll.ej

import typings.ejWebAll.ej.Gantt.EjPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gantt extends Widget_ {
  
  /** To add a new item in Gantt
    * @param {any} Item to add in Gantt row.
    * @param {string} Defines in which position the row wants to add
    * @returns {void}
    */
  def addRecord(data: js.Any, rowPosition: String): Unit = js.native
  
  /** To cancel the edited state of an item in Gantt
    * @returns {void}
    */
  def cancelEdit(): Unit = js.native
  
  /** To clear all the filtered columns in Gantt.
    * @returns {void}
    */
  def clearFilter(): Unit = js.native
  
  /** To clear the sorted columns in Gantt.
    * @returns {void}
    */
  def clearSorting(): Unit = js.native
  
  /** To collapse all the parent items in Gantt
    * @returns {void}
    */
  def collapseAllItems(): Unit = js.native
  
  var defaults: Model = js.native
  
  /** To delete the dependency between the two tasks.
    * @param {number} taskID of predecessor task
    * @param {number} taskID of successor task
    * @returns {void}
    */
  def deleteDependency(fromTaskId: Double, toTaskId: Double): Unit = js.native
  
  /** To delete a selected item in Gantt
    * @returns {void}
    */
  def deleteItem(): Unit = js.native
  
  /** To Expand all the parent items in Gantt
    * @returns {void}
    */
  def expandAllItems(): Unit = js.native
  
  /** To expand and collapse an item in Gantt using item's ID
    * @param {number} Expand or Collapse a record based on task id.
    * @returns {void}
    */
  def expandCollapseRecord(taskId: Double): Unit = js.native
  
  /** Export the Gantt content to excel or PDF document.
    * @param {string} Pass the controller action name corresponding to exporting
    * @param {string} optionalASP server event name corresponding to exporting
    * @param {boolean} optionalPass the multiple exporting value as true/false
    * @returns {void}
    */
  def export(action: String): Unit = js.native
  def export(action: String, serverEvent: js.UndefOr[scala.Nothing], multipleExport: Boolean): Unit = js.native
  def export(action: String, serverEvent: String): Unit = js.native
  def export(action: String, serverEvent: String, multipleExport: Boolean): Unit = js.native
  
  /** Sends filtering request to filter a column in Gantt dynamically.
    * @param {string} Pass the field name of the column.
    * @param {string} string/integer/date operator.
    * @param {string} Pass the value to be filtered in a column.
    * @param {string} Optional - Pass the predicate as and/or.
    * @param {boolean} Optional - pass the match case value as true/false.
    * @returns {void}
    */
  def filterColumn(fieldName: String, filterOperator: String, filterValue: String): Unit = js.native
  def filterColumn(
    fieldName: String,
    filterOperator: String,
    filterValue: String,
    predicate: js.UndefOr[scala.Nothing],
    matchCase: Boolean
  ): Unit = js.native
  def filterColumn(fieldName: String, filterOperator: String, filterValue: String, predicate: String): Unit = js.native
  def filterColumn(
    fieldName: String,
    filterOperator: String,
    filterValue: String,
    predicate: String,
    matchCase: Boolean
  ): Unit = js.native
  
  /** To filter multiple columns with multiple conditions dynamically in Gantt.
    * @param {Gantt.EjPredicate} Pass the filtering column details and conditions as ejPredicate instance. The ejPredicate object is defined as fieldName,filterOperator, filterValue and
    * ignoreCase properties.
    * @returns {void}
    */
  def filterContent(ejPredicate: EjPredicate): Unit = js.native
  
  /** To get available column collection in Gantt.
    * @returns {void}
    */
  def getColumns(): Unit = js.native
  
  /** To get the column collection which are used to edit the task by using task add/edit dialog in resource view.
    * @returns {void}
    */
  def getResourceViewEditColumns(): Unit = js.native
  
  /** To hide the column by using header text
    * @param {string} you can pass a header text of a column to hide
    * @returns {void}
    */
  def hideColumn(headerText: String): Unit = js.native
  
  /** To indent a selected item in Gantt
    * @returns {void}
    */
  def indentItem(): Unit = js.native
  
  @JSName("model")
  var model_Gantt: Model = js.native
  
  /** To Open the dialog to add new task to the Gantt
    * @returns {void}
    */
  def openAddDialog(): Unit = js.native
  
  /** To Open the dialog to edit existing task to the Gantt
    * @returns {void}
    */
  def openEditDialog(): Unit = js.native
  
  /** To outdent a selected item in Gantt
    * @returns {void}
    */
  def outdentItem(): Unit = js.native
  
  /** To save the edited state of an item in Gantt
    * @returns {void}
    */
  def saveEdit(): Unit = js.native
  
  /** To search an item with search string provided at the run time
    * @param {string} you can pass a text to search in Gantt Control.
    * @returns {void}
    */
  def searchItem(searchString: String): Unit = js.native
  
  /** To select cell based on the cell and row index dynamically.
    * @param {any[]} array of cell indexes to be select
    * @param {boolean} Defines that we need to preserve the previously selected cells of not
    * @returns {void}
    */
  def selectCells(Indexes: js.Array[_], preservePreviousSelectedCell: Boolean): Unit = js.native
  
  /** To select multiple rows dynamically.
    * @param {any[]} array of row indexes to select
    * @returns {void}
    */
  def selectMultipleRows(rowIndexes: js.Array[_]): Unit = js.native
  
  /** Method to set scroll top value for Gantt control.
    * @param {number} Pass a value to set top position of vertical scroll bar.
    * @returns {void}
    */
  def setScrollTop(Top: Double): Unit = js.native
  
  /** Positions the splitter by the specified column index.
    * @param {number} Set the splitter position based on column index.
    * @returns {void}
    */
  def setSplitterIndex(index: Double): Unit = js.native
  
  /** To set the grid width in Gantt
    * @param {string} you can give either percentage or pixels value
    * @returns {void}
    */
  def setSplitterPosition(width: String): Unit = js.native
  
  /** To show the column by using header text
    * @param {string} you can pass a header text of a column to show
    * @returns {void}
    */
  def showColumn(headerText: String): Unit = js.native
  
  /** To show/hide the critical tasks in current project.
    * @param {boolean} To show/hide the critical tasks
    * @returns {void}
    */
  def showCriticalPath(isShown: Boolean): Unit = js.native
  
  /** To sort the column in required direction
    * @param {string} Defines the column's mapping name in which sorting have to be performed
    * @param {string} Defines the sort direction whether the column has to sorted in ascending/descending order. By default it is sorting in an ascending order
    * @returns {void}
    */
  def sortColumn(mappingName: String, columnSortDirection: String): Unit = js.native
  
  /** To update the predecessor type and offset value for existing task dependency.
    * @param {number} taskID of predecessor task
    * @param {number} taskID of successor task
    * @param {string} Type of dependency task.
    * @param {number} Offset value of dependency task.
    * @returns {void}
    */
  def updateDependency(fromTaskId: Double, toTaskId: Double, predecessorType: String, offset: Double): Unit = js.native
  
  /** To update the value of Gantt record by using row index.
    * @param {number} index of Gantt record to be updated
    * @param {any} object with modified field value
    * @returns {void}
    */
  def updateRecordByIndex(index: Double, data: js.Any): Unit = js.native
  
  /** To update the value of Gantt record by using it's task id value.
    * @param {any} object with modified field values and current task id value
    * @returns {void}
    */
  def updateRecordByTaskId(data: js.Any): Unit = js.native
  
  /** To update the schedule start date and schedule end date of project.
    * @param {string} New schedule start date of project
    * @param {string} New schedule end date of project
    * @returns {void}
    */
  def updateScheduleDates(startDate: String, endDate: String): Unit = js.native
  
  /** To change an existing Gantt ID by new ID value dynamically
    * @param {number} you can pass an existing ID value to be change
    * @param {number} you can pass a new ID value to be change
    * @returns {void}
    */
  def updateTaskId(currentId: Double, newId: Double): Unit = js.native
}
object Gantt {
  
  @js.native
  sealed trait BeginEditAction extends StObject
  @JSGlobal("ej.Gantt.BeginEditAction")
  @js.native
  object BeginEditAction extends StObject {
    
    ///you can begin the editing at single click
    @js.native
    sealed trait Click extends BeginEditAction
    
    ///you can begin the editing at double click
    @js.native
    sealed trait DblClick extends BeginEditAction
  }
  
  @js.native
  sealed trait DurationUnit extends StObject
  @JSGlobal("ej.Gantt.DurationUnit")
  @js.native
  object DurationUnit extends StObject {
    
    ///Sets the Duration Unit as day.
    @js.native
    sealed trait Day extends DurationUnit
    
    ///Sets the Duration Unit as hour.
    @js.native
    sealed trait Hour extends DurationUnit
    
    ///Sets the Duration Unit as minute.
    @js.native
    sealed trait Minute extends DurationUnit
  }
  
  @js.native
  sealed trait RowPosition extends StObject
  @JSGlobal("ej.Gantt.RowPosition")
  @js.native
  object RowPosition extends StObject {
    
    ///you can add a new row to above selected row.
    @js.native
    sealed trait AboveSelectedRow extends RowPosition
    
    ///you can add a new row to below selected row.
    @js.native
    sealed trait BelowSelectedRow extends RowPosition
    
    ///you can add a new row at bottom.
    @js.native
    sealed trait Bottom extends RowPosition
    
    ///you can add a new row as a child for selected row.
    @js.native
    sealed trait Child extends RowPosition
    
    ///you can add a new row at top.
    @js.native
    sealed trait Top extends RowPosition
  }
  
  @js.native
  sealed trait ScheduleHeaderType extends StObject
  @JSGlobal("ej.Gantt.ScheduleHeaderType")
  @js.native
  object ScheduleHeaderType extends StObject {
    
    ///Sets day Schedule Mode.
    @js.native
    sealed trait Day extends ScheduleHeaderType
    
    ///Sets hour Schedule Mode.
    @js.native
    sealed trait Hour extends ScheduleHeaderType
    
    ///Sets month Schedule Mode.
    @js.native
    sealed trait Month extends ScheduleHeaderType
    
    ///Sets week Schedule Mode.
    @js.native
    sealed trait Week extends ScheduleHeaderType
    
    ///Sets year Schedule Mode.
    @js.native
    sealed trait Year extends ScheduleHeaderType
  }
  
  @js.native
  sealed trait SelectionMode extends StObject
  @JSGlobal("ej.Gantt.SelectionMode")
  @js.native
  object SelectionMode extends StObject {
    
    ///you can select a cell.
    @js.native
    sealed trait Cell extends SelectionMode
    
    ///you can select a row.
    @js.native
    sealed trait Row extends SelectionMode
  }
  
  @js.native
  sealed trait SelectionType extends StObject
  @JSGlobal("ej.Gantt.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    ///you can select a multiple row.
    @js.native
    sealed trait Multiple extends SelectionType
    
    ///you can select a single row.
    @js.native
    sealed trait Single extends SelectionType
  }
  
  @js.native
  sealed trait TaskSchedulingMode extends StObject
  @JSGlobal("ej.Gantt.TaskSchedulingMode")
  @js.native
  object TaskSchedulingMode extends StObject {
    
    ///All the tasks in the project will be displayed in auto scheduled mode, where the tasks are scheduled automatically over non-working days and holidays.
    @js.native
    sealed trait Auto extends TaskSchedulingMode
    
    ///Project consists of tasks with both auto and manually scheduled modes, based on the datasource values
    @js.native
    sealed trait Custom extends TaskSchedulingMode
    
    ///All the tasks in the project will be displayed in manually scheduled mode.
    @js.native
    sealed trait Manual extends TaskSchedulingMode
  }
  
  @js.native
  sealed trait TaskType extends StObject
  @JSGlobal("ej.Gantt.TaskType")
  @js.native
  object TaskType extends StObject {
    
    ///Duration value remains constant while editing work and resource unit values.
    @js.native
    sealed trait FixedDuration extends TaskType
    
    ///Resource unit remains constant while editing the work and duration values.
    @js.native
    sealed trait FixedUnit extends TaskType
    
    ///Work value of a task remains constant while editing duration and resource unit values.
    @js.native
    sealed trait FixedWork extends TaskType
  }
  
  @js.native
  sealed trait TimescaleRoundMode extends StObject
  @JSGlobal("ej.Gantt.TimescaleRoundMode")
  @js.native
  object TimescaleRoundMode extends StObject {
    
    ///The round-off value will be automatically calculated based on the data source values.
    @js.native
    sealed trait Auto extends TimescaleRoundMode
    
    ///Schedule headers start date will round off to the immediate month
    @js.native
    sealed trait Month extends TimescaleRoundMode
    
    ///Schedule header start date will round-off to the immediate week.
    @js.native
    sealed trait Week extends TimescaleRoundMode
    
    ///Schedule headers start date will round off to the immediate year
    @js.native
    sealed trait Year extends TimescaleRoundMode
  }
  
  @js.native
  sealed trait ToolbarItems extends StObject
  @JSGlobal("ej.Gantt.ToolbarItems")
  @js.native
  object ToolbarItems extends StObject {
    
    ///Enables the add icon in toolbar
    @js.native
    sealed trait Add extends ToolbarItems
    
    ///Enables the cancel icon in toolbar
    @js.native
    sealed trait Cancel extends ToolbarItems
    
    ///Enables the collapse all icon in toolbar
    @js.native
    sealed trait CollapseAll extends ToolbarItems
    
    ///Enables the critical path icon in toolbar
    @js.native
    sealed trait CriticalPath extends ToolbarItems
    
    ///Enables the edit icon in toolbar
    @js.native
    sealed trait Delete extends ToolbarItems
    
    ///Enables the edit icon in toolbar
    @js.native
    sealed trait Edit extends ToolbarItems
    
    ///Enables the excel export toolbar icon
    @js.native
    sealed trait ExcelExport extends ToolbarItems
    
    ///Enables the expand all icon in toolbar
    @js.native
    sealed trait ExpandAll extends ToolbarItems
    
    ///Enables the indent icon in toolbar
    @js.native
    sealed trait Indent extends ToolbarItems
    
    ///Enables the next time span icon in toolbar
    @js.native
    sealed trait NextTimeSpan extends ToolbarItems
    
    ///Enables the outdent icon in toolbar
    @js.native
    sealed trait Outdent extends ToolbarItems
    
    ///Enables the pdf export toolbar icon
    @js.native
    sealed trait PdfExport extends ToolbarItems
    
    ///Enables the previous time span icon in toolbar
    @js.native
    sealed trait PrevTimeSpan extends ToolbarItems
    
    ///Enables the search icon in toolbar
    @js.native
    sealed trait Search extends ToolbarItems
    
    ///Enables the update icon in toolbar
    @js.native
    sealed trait Update extends ToolbarItems
  }
  
  @js.native
  sealed trait ViewType extends StObject
  @JSGlobal("ej.Gantt.ViewType")
  @js.native
  object ViewType extends StObject {
    
    ///Displays the project in histogram view in Gantt
    @js.native
    sealed trait HistogramView extends ViewType
    
    ///Displays the project in task view in Gantt.
    @js.native
    sealed trait ProjectView extends ViewType
    
    ///Displays the project in resource allocation view in Gantt.
    @js.native
    sealed trait ResourceView extends ViewType
  }
  
  @js.native
  sealed trait WorkUnit extends StObject
  @JSGlobal("ej.Gantt.WorkUnit")
  @js.native
  object WorkUnit extends StObject {
    
    ///Displays the work involved in a task in days.
    @js.native
    sealed trait Day extends WorkUnit
    
    ///Displays the work involved in a task in hours.
    @js.native
    sealed trait Hour extends WorkUnit
    
    ///Displays the work involved in a task in minutes
    @js.native
    sealed trait Minute extends WorkUnit
  }
  
  @js.native
  sealed trait minutesPerInterval extends StObject
  @JSGlobal("ej.Gantt.minutesPerInterval")
  @js.native
  object minutesPerInterval extends StObject {
    
    ///Sets the interval automatically according with schedule start and end date.
    @js.native
    sealed trait Auto extends minutesPerInterval
    
    ///Sets fifteen minute intervals per hour.
    @js.native
    sealed trait FifteenMinutes extends minutesPerInterval
    
    ///Sets Five minute intervals per hour.
    @js.native
    sealed trait FiveMinutes extends minutesPerInterval
    
    ///Sets one minute intervals per hour.
    @js.native
    sealed trait OneMinute extends minutesPerInterval
    
    ///Sets thirty minute intervals per hour.
    @js.native
    sealed trait ThirtyMinutes extends minutesPerInterval
  }
  
  @js.native
  sealed trait workingTimeScale extends StObject
  @JSGlobal("ej.Gantt.workingTimeScale")
  @js.native
  object workingTimeScale extends StObject {
    
    ///Sets twenty four hour timescale.
    @js.native
    sealed trait TimeScale24Hours extends workingTimeScale
    
    ///Sets eight hour timescale.
    @js.native
    sealed trait TimeScale8Hours extends workingTimeScale
  }
  
  @js.native
  trait ActionBeginEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the current grouped column field name.
      */
    var columnName: js.UndefOr[String] = js.native
    
    /** Returns the direction of sorting ascending or descending
      */
    var columnSortDirection: js.UndefOr[String] = js.native
    
    /** Returns the data of deleting element.
      */
    var data: js.UndefOr[String] = js.native
    
    /** Returns the edit dialog element.
      */
    var element: js.UndefOr[String] = js.native
    
    /** Returns the value of searching element.
      */
    var keyValue: js.UndefOr[String] = js.native
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns selected record index
      */
    var recordIndex: js.UndefOr[Double] = js.native
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ActionBeginEventArgs {
    
    @scala.inline
    def apply(): ActionBeginEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionBeginEventArgs]
    }
    
    @scala.inline
    implicit class ActionBeginEventArgsMutableBuilder[Self <: ActionBeginEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
      
      @scala.inline
      def setColumnSortDirection(value: String): Self = StObject.set(x, "columnSortDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnSortDirectionUndefined: Self = StObject.set(x, "columnSortDirection", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setKeyValue(value: String): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setRecordIndex(value: Double): Self = StObject.set(x, "recordIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordIndexUndefined: Self = StObject.set(x, "recordIndex", js.undefined)
      
      @scala.inline
      def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ActionCompleteEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the current grouped column field name.
      */
    var columnName: js.UndefOr[String] = js.native
    
    /** Returns the direction of sorting ascending or descending
      */
    var columnSortDirection: js.UndefOr[String] = js.native
    
    /** Returns the data of deleted element.
      */
    var data: js.UndefOr[String] = js.native
    
    /** Returns the value of searched element.
      */
    var keyValue: js.UndefOr[String] = js.native
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns selected record index
      */
    var recordIndex: js.UndefOr[Double] = js.native
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ActionCompleteEventArgs {
    
    @scala.inline
    def apply(): ActionCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionCompleteEventArgs]
    }
    
    @scala.inline
    implicit class ActionCompleteEventArgsMutableBuilder[Self <: ActionCompleteEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
      
      @scala.inline
      def setColumnSortDirection(value: String): Self = StObject.set(x, "columnSortDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnSortDirectionUndefined: Self = StObject.set(x, "columnSortDirection", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setKeyValue(value: String): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setRecordIndex(value: Double): Self = StObject.set(x, "recordIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordIndexUndefined: Self = StObject.set(x, "recordIndex", js.undefined)
      
      @scala.inline
      def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait AddDialogField extends StObject {
    
    /** Specifies the custom column field was displayed in General tab of add dialog or not.
      * @Default {false}
      */
    var displayInGeneralTab: js.UndefOr[Boolean] = js.native
    
    /** Specifies editType of fields to be included in the add dialog in Gantt
      */
    var editType: js.UndefOr[String] = js.native
    
    /** Specifies mapping name to include required fields in Gantt
      */
    var field: js.UndefOr[String] = js.native
  }
  object AddDialogField {
    
    @scala.inline
    def apply(): AddDialogField = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddDialogField]
    }
    
    @scala.inline
    implicit class AddDialogFieldMutableBuilder[Self <: AddDialogField] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayInGeneralTab(value: Boolean): Self = StObject.set(x, "displayInGeneralTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayInGeneralTabUndefined: Self = StObject.set(x, "displayInGeneralTab", js.undefined)
      
      @scala.inline
      def setEditType(value: String): Self = StObject.set(x, "editType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditTypeUndefined: Self = StObject.set(x, "editType", js.undefined)
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    }
  }
  
  @js.native
  trait BeginEditEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the Element of editing cell.
      */
    var cellElement: js.UndefOr[js.Any] = js.native
    
    /** Returns the column Index of cell belongs.
      */
    var columnIndex: js.UndefOr[Double] = js.native
    
    /** Returns the data of current cell record.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns the row element of editing cell.
      */
    var rowElement: js.UndefOr[js.Any] = js.native
  }
  object BeginEditEventArgs {
    
    @scala.inline
    def apply(): BeginEditEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeginEditEventArgs]
    }
    
    @scala.inline
    implicit class BeginEditEventArgsMutableBuilder[Self <: BeginEditEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCellElement(value: js.Any): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellElementUndefined: Self = StObject.set(x, "cellElement", js.undefined)
      
      @scala.inline
      def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setRowElement(value: js.Any): Self = StObject.set(x, "rowElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowElementUndefined: Self = StObject.set(x, "rowElement", js.undefined)
    }
  }
  
  @js.native
  trait CellSelectedEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the cell index on the selection.
      */
    var cellIndex: js.UndefOr[Double] = js.native
    
    /** Returns the selecting record object
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns the Gantt object Model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the previously selected cell index
      */
    var previousCellIndex: js.UndefOr[js.Any] = js.native
    
    /** Returns the previously selected row data
      */
    var previousData: js.UndefOr[js.Any] = js.native
    
    /** Returns the previously selected row index
      */
    var previousRowIndex: js.UndefOr[js.Any] = js.native
    
    /** Returns the previously selected cell element
      */
    var previousTargetCell: js.UndefOr[js.Any] = js.native
    
    /** Returns the previously selected row element
      */
    var previousTargetRow: js.UndefOr[js.Any] = js.native
    
    /** Returns the row index on the selection
      */
    var rowIndex: js.UndefOr[Double] = js.native
    
    /** Returns the selecting cell element
      */
    var targetCell: js.UndefOr[js.Any] = js.native
    
    /** Returns the selecting row element
      */
    var targetRow: js.UndefOr[js.Any] = js.native
  }
  object CellSelectedEventArgs {
    
    @scala.inline
    def apply(): CellSelectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellSelectedEventArgs]
    }
    
    @scala.inline
    implicit class CellSelectedEventArgsMutableBuilder[Self <: CellSelectedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPreviousCellIndex(value: js.Any): Self = StObject.set(x, "previousCellIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousCellIndexUndefined: Self = StObject.set(x, "previousCellIndex", js.undefined)
      
      @scala.inline
      def setPreviousData(value: js.Any): Self = StObject.set(x, "previousData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousDataUndefined: Self = StObject.set(x, "previousData", js.undefined)
      
      @scala.inline
      def setPreviousRowIndex(value: js.Any): Self = StObject.set(x, "previousRowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousRowIndexUndefined: Self = StObject.set(x, "previousRowIndex", js.undefined)
      
      @scala.inline
      def setPreviousTargetCell(value: js.Any): Self = StObject.set(x, "previousTargetCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousTargetCellUndefined: Self = StObject.set(x, "previousTargetCell", js.undefined)
      
      @scala.inline
      def setPreviousTargetRow(value: js.Any): Self = StObject.set(x, "previousTargetRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousTargetRowUndefined: Self = StObject.set(x, "previousTargetRow", js.undefined)
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      @scala.inline
      def setTargetCell(value: js.Any): Self = StObject.set(x, "targetCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetCellUndefined: Self = StObject.set(x, "targetCell", js.undefined)
      
      @scala.inline
      def setTargetRow(value: js.Any): Self = StObject.set(x, "targetRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetRowUndefined: Self = StObject.set(x, "targetRow", js.undefined)
    }
  }
  
  @js.native
  trait CellSelectingEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the cell index on the selection.
      */
    var cellIndex: js.UndefOr[Double] = js.native
    
    /** Returns the selecting record object
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns the Gantt object Model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the row index on the selection
      */
    var rowIndex: js.UndefOr[Double] = js.native
    
    /** Returns the selecting cell element
      */
    var targetCell: js.UndefOr[js.Any] = js.native
    
    /** Returns the selecting row element
      */
    var targetRow: js.UndefOr[js.Any] = js.native
  }
  object CellSelectingEventArgs {
    
    @scala.inline
    def apply(): CellSelectingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellSelectingEventArgs]
    }
    
    @scala.inline
    implicit class CellSelectingEventArgsMutableBuilder[Self <: CellSelectingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      @scala.inline
      def setTargetCell(value: js.Any): Self = StObject.set(x, "targetCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetCellUndefined: Self = StObject.set(x, "targetCell", js.undefined)
      
      @scala.inline
      def setTargetRow(value: js.Any): Self = StObject.set(x, "targetRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetRowUndefined: Self = StObject.set(x, "targetRow", js.undefined)
    }
  }
  
  @js.native
  trait CollapsedEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the data of collapsed record.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns state of a record whether it is in expanded or collapsed state.
      */
    var expanded: js.UndefOr[Boolean] = js.native
    
    /** Returns the row index of collapsed record.
      */
    var recordIndex: js.UndefOr[Double] = js.native
    
    /** Returns Request Type.
      */
    var requestType: js.UndefOr[String] = js.native
  }
  object CollapsedEventArgs {
    
    @scala.inline
    def apply(): CollapsedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapsedEventArgs]
    }
    
    @scala.inline
    implicit class CollapsedEventArgsMutableBuilder[Self <: CollapsedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setRecordIndex(value: Double): Self = StObject.set(x, "recordIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordIndexUndefined: Self = StObject.set(x, "recordIndex", js.undefined)
      
      @scala.inline
      def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
    }
  }
  
  @js.native
  trait CollapsingEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the data of edited cell record..
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns state of a record whether it is in expanded or collapsed state.
      */
    var expanded: js.UndefOr[Boolean] = js.native
    
    /** Returns the row index of collapsing record.
      */
    var recordIndex: js.UndefOr[Double] = js.native
  }
  object CollapsingEventArgs {
    
    @scala.inline
    def apply(): CollapsingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapsingEventArgs]
    }
    
    @scala.inline
    implicit class CollapsingEventArgsMutableBuilder[Self <: CollapsingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setRecordIndex(value: Double): Self = StObject.set(x, "recordIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordIndexUndefined: Self = StObject.set(x, "recordIndex", js.undefined)
    }
  }
  
  @js.native
  trait ContextMenuOpenEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the default context menu items to which we add custom items.
      */
    var contextMenuItems: js.UndefOr[js.Array[_]] = js.native
    
    /** Returns the Gantt model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ContextMenuOpenEventArgs {
    
    @scala.inline
    def apply(): ContextMenuOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuOpenEventArgs]
    }
    
    @scala.inline
    implicit class ContextMenuOpenEventArgsMutableBuilder[Self <: ContextMenuOpenEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContextMenuItems(value: js.Array[_]): Self = StObject.set(x, "contextMenuItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuItemsUndefined: Self = StObject.set(x, "contextMenuItems", js.undefined)
      
      @scala.inline
      def setContextMenuItemsVarargs(value: js.Any*): Self = StObject.set(x, "contextMenuItems", js.Array(value :_*))
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CreateEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the Gantt model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CreateEventArgs {
    
    @scala.inline
    def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit class CreateEventArgsMutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DragTooltip extends StObject {
    
    /** Specifies option to enable/disable tooltip while drag and drop a row.
      * @Default {true}
      */
    var showTooltip: js.UndefOr[Boolean] = js.native
    
    /** Specifies the data source fields to be displayed in the drag tooltip.
      * @Default {[]}
      */
    var tooltipItems: js.UndefOr[js.Array[_]] = js.native
    
    /** Specifies the custom template for drag tooltip.
      * @Default {null}
      */
    var tooltipTemplate: js.UndefOr[String] = js.native
  }
  object DragTooltip {
    
    @scala.inline
    def apply(): DragTooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragTooltip]
    }
    
    @scala.inline
    implicit class DragTooltipMutableBuilder[Self <: DragTooltip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      @scala.inline
      def setTooltipItems(value: js.Array[_]): Self = StObject.set(x, "tooltipItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipItemsUndefined: Self = StObject.set(x, "tooltipItems", js.undefined)
      
      @scala.inline
      def setTooltipItemsVarargs(value: js.Any*): Self = StObject.set(x, "tooltipItems", js.Array(value :_*))
      
      @scala.inline
      def setTooltipTemplate(value: String): Self = StObject.set(x, "tooltipTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
    }
  }
  
  @js.native
  trait EditDialogField extends StObject {
    
    /** Specifies the custom column field was displayed in General tab of edit dialog or not.
      * @Default {false}
      */
    var displayInGeneralTab: js.UndefOr[Boolean] = js.native
    
    /** Specifies editType of fields to be included in the edit dialog in Gantt
      */
    var editType: js.UndefOr[String] = js.native
    
    /** Specifies mapping name to include required fields in Gantt
      */
    var field: js.UndefOr[String] = js.native
  }
  object EditDialogField {
    
    @scala.inline
    def apply(): EditDialogField = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditDialogField]
    }
    
    @scala.inline
    implicit class EditDialogFieldMutableBuilder[Self <: EditDialogField] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayInGeneralTab(value: Boolean): Self = StObject.set(x, "displayInGeneralTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayInGeneralTabUndefined: Self = StObject.set(x, "displayInGeneralTab", js.undefined)
      
      @scala.inline
      def setEditType(value: String): Self = StObject.set(x, "editType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditTypeUndefined: Self = StObject.set(x, "editType", js.undefined)
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    }
  }
  
  @js.native
  trait EditSettings extends StObject {
    
    /** Enables or disables add record icon in Gantt toolbar
      * @Default {false}
      */
    var allowAdding: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables delete icon in Gantt toolbar
      * @Default {false}
      */
    var allowDeleting: js.UndefOr[Boolean] = js.native
    
    /** Specifies the option for enabling or disabling editing in Gantt grid part
      * @Default {false}
      */
    var allowEditing: js.UndefOr[Boolean] = js.native
    
    /** Specifies the option for enabling or disabling indent action in Gantt.
      * @Default {false}
      */
    var allowIndent: js.UndefOr[Boolean] = js.native
    
    /** Specifies the mouse action whether single click or double click to begin the editing
      * @Default {ej.Gantt.BeginEditAction.DblClick}
      */
    var beginEditAction: js.UndefOr[BeginEditAction | String] = js.native
    
    /** Specifies the edit mode in Gantt, &quot;normal&quot; is for dialog editing ,&quot;cellEditing&quot; is for cell type editing
      * @Default {normal}
      */
    var editMode: js.UndefOr[String] = js.native
    
    /** Specifies the position where the new row has to be added.
      * @Default {ej.Gantt.RowPosition.BelowSelectedRow}
      */
    var rowPosition: js.UndefOr[RowPosition | String] = js.native
    
    /** Enable or disable the confirmation dialog while deleting the record.
      * @Default {false}
      */
    var showDeleteConfirmDialog: js.UndefOr[Boolean] = js.native
  }
  object EditSettings {
    
    @scala.inline
    def apply(): EditSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditSettings]
    }
    
    @scala.inline
    implicit class EditSettingsMutableBuilder[Self <: EditSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowAdding(value: Boolean): Self = StObject.set(x, "allowAdding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowAddingUndefined: Self = StObject.set(x, "allowAdding", js.undefined)
      
      @scala.inline
      def setAllowDeleting(value: Boolean): Self = StObject.set(x, "allowDeleting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDeletingUndefined: Self = StObject.set(x, "allowDeleting", js.undefined)
      
      @scala.inline
      def setAllowEditing(value: Boolean): Self = StObject.set(x, "allowEditing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEditingUndefined: Self = StObject.set(x, "allowEditing", js.undefined)
      
      @scala.inline
      def setAllowIndent(value: Boolean): Self = StObject.set(x, "allowIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowIndentUndefined: Self = StObject.set(x, "allowIndent", js.undefined)
      
      @scala.inline
      def setBeginEditAction(value: BeginEditAction | String): Self = StObject.set(x, "beginEditAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeginEditActionUndefined: Self = StObject.set(x, "beginEditAction", js.undefined)
      
      @scala.inline
      def setEditMode(value: String): Self = StObject.set(x, "editMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditModeUndefined: Self = StObject.set(x, "editMode", js.undefined)
      
      @scala.inline
      def setRowPosition(value: RowPosition | String): Self = StObject.set(x, "rowPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowPositionUndefined: Self = StObject.set(x, "rowPosition", js.undefined)
      
      @scala.inline
      def setShowDeleteConfirmDialog(value: Boolean): Self = StObject.set(x, "showDeleteConfirmDialog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDeleteConfirmDialogUndefined: Self = StObject.set(x, "showDeleteConfirmDialog", js.undefined)
    }
  }
  
  @js.native
  trait EjPredicate extends StObject {
    
    /** Pass the field name of the column.
      */
    var fieldName: js.UndefOr[String] = js.native
    
    /** string/integer/date operator.
      */
    var filterOperator: js.UndefOr[String] = js.native
    
    /** Pass the value to be filtered in a column.
      */
    var filterValue: js.UndefOr[String] = js.native
    
    /** Optional - pass the ignore case value as true/false.
      */
    var ignoreCase: js.UndefOr[Boolean] = js.native
  }
  object EjPredicate {
    
    @scala.inline
    def apply(): EjPredicate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EjPredicate]
    }
    
    @scala.inline
    implicit class EjPredicateMutableBuilder[Self <: EjPredicate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
      
      @scala.inline
      def setFilterOperator(value: String): Self = StObject.set(x, "filterOperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterOperatorUndefined: Self = StObject.set(x, "filterOperator", js.undefined)
      
      @scala.inline
      def setFilterValue(value: String): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterValueUndefined: Self = StObject.set(x, "filterValue", js.undefined)
      
      @scala.inline
      def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    }
  }
  
  @js.native
  trait EndEditEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the Element of editing cell.
      */
    var cellElement: js.UndefOr[js.Any] = js.native
    
    /** Returns the column name of edited cell belongs.
      */
    var columnName: js.UndefOr[String] = js.native
    
    /** Returns the column object of edited cell belongs.
      */
    var columnObject: js.UndefOr[js.Any] = js.native
    
    /** Returns the data of edited cell record.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns the row element of editing cell.
      */
    var rowElement: js.UndefOr[js.Any] = js.native
  }
  object EndEditEventArgs {
    
    @scala.inline
    def apply(): EndEditEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndEditEventArgs]
    }
    
    @scala.inline
    implicit class EndEditEventArgsMutableBuilder[Self <: EndEditEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCellElement(value: js.Any): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellElementUndefined: Self = StObject.set(x, "cellElement", js.undefined)
      
      @scala.inline
      def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
      
      @scala.inline
      def setColumnObject(value: js.Any): Self = StObject.set(x, "columnObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnObjectUndefined: Self = StObject.set(x, "columnObject", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setRowElement(value: js.Any): Self = StObject.set(x, "rowElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowElementUndefined: Self = StObject.set(x, "rowElement", js.undefined)
    }
  }
  
  @js.native
  trait ExpandedEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the data of expanded record.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns state of a record whether it is in expanded or collapsed state.
      */
    var expanded: js.UndefOr[Boolean] = js.native
    
    /** Returns the row index of record.
      */
    var recordIndex: js.UndefOr[Double] = js.native
    
    /** Returns Request Type.
      */
    var requestType: js.UndefOr[String] = js.native
  }
  object ExpandedEventArgs {
    
    @scala.inline
    def apply(): ExpandedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpandedEventArgs]
    }
    
    @scala.inline
    implicit class ExpandedEventArgsMutableBuilder[Self <: ExpandedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setRecordIndex(value: Double): Self = StObject.set(x, "recordIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordIndexUndefined: Self = StObject.set(x, "recordIndex", js.undefined)
      
      @scala.inline
      def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
    }
  }
  
  @js.native
  trait ExpandingEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the data of edited cell record..
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns state of a record whether it is in expanded or collapsed state.
      */
    var expanded: js.UndefOr[Boolean] = js.native
    
    /** Returns the row index of record.
      */
    var recordIndex: js.UndefOr[js.Any] = js.native
  }
  object ExpandingEventArgs {
    
    @scala.inline
    def apply(): ExpandingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpandingEventArgs]
    }
    
    @scala.inline
    implicit class ExpandingEventArgsMutableBuilder[Self <: ExpandingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setRecordIndex(value: js.Any): Self = StObject.set(x, "recordIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordIndexUndefined: Self = StObject.set(x, "recordIndex", js.undefined)
    }
  }
  
  @js.native
  trait FilterSettings extends StObject {
    
    /** Specifies the column collection for filtering the Gantt content on initial load
      * @Default {[]}
      */
    var filteredColumns: js.UndefOr[js.Array[FilterSettingsFilteredColumn]] = js.native
  }
  object FilterSettings {
    
    @scala.inline
    def apply(): FilterSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterSettings]
    }
    
    @scala.inline
    implicit class FilterSettingsMutableBuilder[Self <: FilterSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilteredColumns(value: js.Array[FilterSettingsFilteredColumn]): Self = StObject.set(x, "filteredColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredColumnsUndefined: Self = StObject.set(x, "filteredColumns", js.undefined)
      
      @scala.inline
      def setFilteredColumnsVarargs(value: FilterSettingsFilteredColumn*): Self = StObject.set(x, "filteredColumns", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FilterSettingsFilteredColumn extends StObject {
    
    /** Specifies the field where filtering has to be performed.
      */
    var field: js.UndefOr[String] = js.native
    
    /** Specifies the filter condition to filtered column. See operator
      */
    var operator: js.UndefOr[String] = js.native
    
    /** Specifies the predicate(and/or) value to perform filtering.
      */
    var predicate: js.UndefOr[String] = js.native
    
    /** Specifies the value to be filtered in Gantt.
      */
    var value: js.UndefOr[String] = js.native
  }
  object FilterSettingsFilteredColumn {
    
    @scala.inline
    def apply(): FilterSettingsFilteredColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterSettingsFilteredColumn]
    }
    
    @scala.inline
    implicit class FilterSettingsFilteredColumnMutableBuilder[Self <: FilterSettingsFilteredColumn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      @scala.inline
      def setPredicate(value: String): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Holiday extends StObject {
    
    /** Specifies the background color for holiday date in Gantt Schedule
      */
    var background: js.UndefOr[String] = js.native
    
    /** Specifies holiday date to be displayed in Gantt
      */
    var day: js.UndefOr[String] = js.native
    
    /** Specifies the label to be displayed for rendered holiday in Gantt
      */
    var label: js.UndefOr[String] = js.native
  }
  object Holiday {
    
    @scala.inline
    def apply(): Holiday = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Holiday]
    }
    
    @scala.inline
    implicit class HolidayMutableBuilder[Self <: Holiday] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  @js.native
  trait LoadEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the Gantt model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object LoadEventArgs {
    
    @scala.inline
    def apply(): LoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadEventArgs]
    }
    
    @scala.inline
    implicit class LoadEventArgsMutableBuilder[Self <: LoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
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
    var selectionMode: js.UndefOr[typings.std.SelectionMode | String] = js.native
    
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
    def apply(): typings.ejWebAll.ej.Gantt.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Gantt.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.Gantt.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = StObject.set(x, "actionBegin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionBeginUndefined: Self = StObject.set(x, "actionBegin", js.undefined)
      
      @scala.inline
      def setActionComplete(value: /* e */ ActionCompleteEventArgs => Unit): Self = StObject.set(x, "actionComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionCompleteUndefined: Self = StObject.set(x, "actionComplete", js.undefined)
      
      @scala.inline
      def setAddDialogFields(value: js.Array[AddDialogField]): Self = StObject.set(x, "addDialogFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddDialogFieldsUndefined: Self = StObject.set(x, "addDialogFields", js.undefined)
      
      @scala.inline
      def setAddDialogFieldsVarargs(value: AddDialogField*): Self = StObject.set(x, "addDialogFields", js.Array(value :_*))
      
      @scala.inline
      def setAllowColumnResize(value: Boolean): Self = StObject.set(x, "allowColumnResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowColumnResizeUndefined: Self = StObject.set(x, "allowColumnResize", js.undefined)
      
      @scala.inline
      def setAllowDragAndDrop(value: Boolean): Self = StObject.set(x, "allowDragAndDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDragAndDropUndefined: Self = StObject.set(x, "allowDragAndDrop", js.undefined)
      
      @scala.inline
      def setAllowGanttChartEditing(value: Boolean): Self = StObject.set(x, "allowGanttChartEditing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowGanttChartEditingUndefined: Self = StObject.set(x, "allowGanttChartEditing", js.undefined)
      
      @scala.inline
      def setAllowKeyboardNavigation(value: Boolean): Self = StObject.set(x, "allowKeyboardNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowKeyboardNavigationUndefined: Self = StObject.set(x, "allowKeyboardNavigation", js.undefined)
      
      @scala.inline
      def setAllowMultiSorting(value: Boolean): Self = StObject.set(x, "allowMultiSorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMultiSortingUndefined: Self = StObject.set(x, "allowMultiSorting", js.undefined)
      
      @scala.inline
      def setAllowMultipleExporting(value: Boolean): Self = StObject.set(x, "allowMultipleExporting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMultipleExportingUndefined: Self = StObject.set(x, "allowMultipleExporting", js.undefined)
      
      @scala.inline
      def setAllowSelection(value: Boolean): Self = StObject.set(x, "allowSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSelectionUndefined: Self = StObject.set(x, "allowSelection", js.undefined)
      
      @scala.inline
      def setAllowSorting(value: Boolean): Self = StObject.set(x, "allowSorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSortingUndefined: Self = StObject.set(x, "allowSorting", js.undefined)
      
      @scala.inline
      def setAllowUnscheduledTask(value: Boolean): Self = StObject.set(x, "allowUnscheduledTask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnscheduledTaskUndefined: Self = StObject.set(x, "allowUnscheduledTask", js.undefined)
      
      @scala.inline
      def setBaselineColor(value: String): Self = StObject.set(x, "baselineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaselineColorUndefined: Self = StObject.set(x, "baselineColor", js.undefined)
      
      @scala.inline
      def setBaselineEndDateMapping(value: String): Self = StObject.set(x, "baselineEndDateMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaselineEndDateMappingUndefined: Self = StObject.set(x, "baselineEndDateMapping", js.undefined)
      
      @scala.inline
      def setBaselineStartDateMapping(value: String): Self = StObject.set(x, "baselineStartDateMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaselineStartDateMappingUndefined: Self = StObject.set(x, "baselineStartDateMapping", js.undefined)
      
      @scala.inline
      def setBeginEdit(value: /* e */ BeginEditEventArgs => Unit): Self = StObject.set(x, "beginEdit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeginEditUndefined: Self = StObject.set(x, "beginEdit", js.undefined)
      
      @scala.inline
      def setCellSelected(value: /* e */ CellSelectedEventArgs => Unit): Self = StObject.set(x, "cellSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellSelectedUndefined: Self = StObject.set(x, "cellSelected", js.undefined)
      
      @scala.inline
      def setCellSelecting(value: /* e */ CellSelectingEventArgs => Unit): Self = StObject.set(x, "cellSelecting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellSelectingUndefined: Self = StObject.set(x, "cellSelecting", js.undefined)
      
      @scala.inline
      def setCellTooltipTemplate(value: String): Self = StObject.set(x, "cellTooltipTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellTooltipTemplateUndefined: Self = StObject.set(x, "cellTooltipTemplate", js.undefined)
      
      @scala.inline
      def setChildMapping(value: String): Self = StObject.set(x, "childMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildMappingUndefined: Self = StObject.set(x, "childMapping", js.undefined)
      
      @scala.inline
      def setCollapsed(value: /* e */ CollapsedEventArgs => Unit): Self = StObject.set(x, "collapsed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setCollapsing(value: /* e */ CollapsingEventArgs => Unit): Self = StObject.set(x, "collapsing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCollapsingUndefined: Self = StObject.set(x, "collapsing", js.undefined)
      
      @scala.inline
      def setColumnDialogFields(value: js.Array[_]): Self = StObject.set(x, "columnDialogFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnDialogFieldsUndefined: Self = StObject.set(x, "columnDialogFields", js.undefined)
      
      @scala.inline
      def setColumnDialogFieldsVarargs(value: js.Any*): Self = StObject.set(x, "columnDialogFields", js.Array(value :_*))
      
      @scala.inline
      def setConnectorLineBackground(value: String): Self = StObject.set(x, "connectorLineBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectorLineBackgroundUndefined: Self = StObject.set(x, "connectorLineBackground", js.undefined)
      
      @scala.inline
      def setConnectorlineWidth(value: Double): Self = StObject.set(x, "connectorlineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectorlineWidthUndefined: Self = StObject.set(x, "connectorlineWidth", js.undefined)
      
      @scala.inline
      def setContextMenuOpen(value: /* e */ ContextMenuOpenEventArgs => Unit): Self = StObject.set(x, "contextMenuOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContextMenuOpenUndefined: Self = StObject.set(x, "contextMenuOpen", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Array[_]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
      
      @scala.inline
      def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      @scala.inline
      def setDayWorkingTime(value: js.Array[_]): Self = StObject.set(x, "dayWorkingTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayWorkingTimeUndefined: Self = StObject.set(x, "dayWorkingTime", js.undefined)
      
      @scala.inline
      def setDayWorkingTimeVarargs(value: js.Any*): Self = StObject.set(x, "dayWorkingTime", js.Array(value :_*))
      
      @scala.inline
      def setDragTooltip(value: DragTooltip): Self = StObject.set(x, "dragTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragTooltipUndefined: Self = StObject.set(x, "dragTooltip", js.undefined)
      
      @scala.inline
      def setDurationMapping(value: String): Self = StObject.set(x, "durationMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationMappingUndefined: Self = StObject.set(x, "durationMapping", js.undefined)
      
      @scala.inline
      def setDurationUnit(value: DurationUnit | String): Self = StObject.set(x, "durationUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUnitMapping(value: String): Self = StObject.set(x, "durationUnitMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUnitMappingUndefined: Self = StObject.set(x, "durationUnitMapping", js.undefined)
      
      @scala.inline
      def setDurationUnitUndefined: Self = StObject.set(x, "durationUnit", js.undefined)
      
      @scala.inline
      def setEditDialogFields(value: js.Array[EditDialogField]): Self = StObject.set(x, "editDialogFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditDialogFieldsUndefined: Self = StObject.set(x, "editDialogFields", js.undefined)
      
      @scala.inline
      def setEditDialogFieldsVarargs(value: EditDialogField*): Self = StObject.set(x, "editDialogFields", js.Array(value :_*))
      
      @scala.inline
      def setEditSettings(value: EditSettings): Self = StObject.set(x, "editSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditSettingsUndefined: Self = StObject.set(x, "editSettings", js.undefined)
      
      @scala.inline
      def setEnableAltRow(value: Boolean): Self = StObject.set(x, "enableAltRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAltRowUndefined: Self = StObject.set(x, "enableAltRow", js.undefined)
      
      @scala.inline
      def setEnableCollapseAll(value: Boolean): Self = StObject.set(x, "enableCollapseAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCollapseAllUndefined: Self = StObject.set(x, "enableCollapseAll", js.undefined)
      
      @scala.inline
      def setEnableContextMenu(value: Boolean): Self = StObject.set(x, "enableContextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableContextMenuUndefined: Self = StObject.set(x, "enableContextMenu", js.undefined)
      
      @scala.inline
      def setEnablePredecessorValidation(value: Boolean): Self = StObject.set(x, "enablePredecessorValidation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePredecessorValidationUndefined: Self = StObject.set(x, "enablePredecessorValidation", js.undefined)
      
      @scala.inline
      def setEnableProgressBarResizing(value: Boolean): Self = StObject.set(x, "enableProgressBarResizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableProgressBarResizingUndefined: Self = StObject.set(x, "enableProgressBarResizing", js.undefined)
      
      @scala.inline
      def setEnableResize(value: Boolean): Self = StObject.set(x, "enableResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableResizeUndefined: Self = StObject.set(x, "enableResize", js.undefined)
      
      @scala.inline
      def setEnableSerialNumber(value: Boolean): Self = StObject.set(x, "enableSerialNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSerialNumberUndefined: Self = StObject.set(x, "enableSerialNumber", js.undefined)
      
      @scala.inline
      def setEnableTaskbarDragTooltip(value: Boolean): Self = StObject.set(x, "enableTaskbarDragTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTaskbarDragTooltipUndefined: Self = StObject.set(x, "enableTaskbarDragTooltip", js.undefined)
      
      @scala.inline
      def setEnableTaskbarTooltip(value: Boolean): Self = StObject.set(x, "enableTaskbarTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTaskbarTooltipUndefined: Self = StObject.set(x, "enableTaskbarTooltip", js.undefined)
      
      @scala.inline
      def setEnableVirtualization(value: Boolean): Self = StObject.set(x, "enableVirtualization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableVirtualizationUndefined: Self = StObject.set(x, "enableVirtualization", js.undefined)
      
      @scala.inline
      def setEnableWBS(value: Boolean): Self = StObject.set(x, "enableWBS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableWBSPredecessor(value: Boolean): Self = StObject.set(x, "enableWBSPredecessor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableWBSPredecessorUndefined: Self = StObject.set(x, "enableWBSPredecessor", js.undefined)
      
      @scala.inline
      def setEnableWBSUndefined: Self = StObject.set(x, "enableWBS", js.undefined)
      
      @scala.inline
      def setEndDateMapping(value: String): Self = StObject.set(x, "endDateMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDateMappingUndefined: Self = StObject.set(x, "endDateMapping", js.undefined)
      
      @scala.inline
      def setEndEdit(value: /* e */ EndEditEventArgs => Unit): Self = StObject.set(x, "endEdit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEndEditUndefined: Self = StObject.set(x, "endEdit", js.undefined)
      
      @scala.inline
      def setExpandStateMapping(value: String): Self = StObject.set(x, "expandStateMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandStateMappingUndefined: Self = StObject.set(x, "expandStateMapping", js.undefined)
      
      @scala.inline
      def setExpanded(value: /* e */ ExpandedEventArgs => Unit): Self = StObject.set(x, "expanded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setExpanding(value: /* e */ ExpandingEventArgs => Unit): Self = StObject.set(x, "expanding", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpandingUndefined: Self = StObject.set(x, "expanding", js.undefined)
      
      @scala.inline
      def setFilterSettings(value: FilterSettings): Self = StObject.set(x, "filterSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterSettingsUndefined: Self = StObject.set(x, "filterSettings", js.undefined)
      
      @scala.inline
      def setGroupCollection(value: js.Array[_]): Self = StObject.set(x, "groupCollection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupCollectionUndefined: Self = StObject.set(x, "groupCollection", js.undefined)
      
      @scala.inline
      def setGroupCollectionVarargs(value: js.Any*): Self = StObject.set(x, "groupCollection", js.Array(value :_*))
      
      @scala.inline
      def setGroupIdMapping(value: String): Self = StObject.set(x, "groupIdMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupIdMappingUndefined: Self = StObject.set(x, "groupIdMapping", js.undefined)
      
      @scala.inline
      def setGroupNameMapping(value: String): Self = StObject.set(x, "groupNameMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupNameMappingUndefined: Self = StObject.set(x, "groupNameMapping", js.undefined)
      
      @scala.inline
      def setHighlightNonWorkingTime(value: Boolean): Self = StObject.set(x, "highlightNonWorkingTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightNonWorkingTimeUndefined: Self = StObject.set(x, "highlightNonWorkingTime", js.undefined)
      
      @scala.inline
      def setHighlightWeekends(value: Boolean): Self = StObject.set(x, "highlightWeekends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightWeekendsUndefined: Self = StObject.set(x, "highlightWeekends", js.undefined)
      
      @scala.inline
      def setHolidays(value: js.Array[Holiday]): Self = StObject.set(x, "holidays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHolidaysUndefined: Self = StObject.set(x, "holidays", js.undefined)
      
      @scala.inline
      def setHolidaysVarargs(value: Holiday*): Self = StObject.set(x, "holidays", js.Array(value :_*))
      
      @scala.inline
      def setIncludeWeekend(value: Boolean): Self = StObject.set(x, "includeWeekend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeWeekendUndefined: Self = StObject.set(x, "includeWeekend", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setLeftTaskLabelMapping(value: String): Self = StObject.set(x, "leftTaskLabelMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftTaskLabelMappingUndefined: Self = StObject.set(x, "leftTaskLabelMapping", js.undefined)
      
      @scala.inline
      def setLeftTaskLabelTemplate(value: String): Self = StObject.set(x, "leftTaskLabelTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftTaskLabelTemplateUndefined: Self = StObject.set(x, "leftTaskLabelTemplate", js.undefined)
      
      @scala.inline
      def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMilestoneMapping(value: String): Self = StObject.set(x, "milestoneMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMilestoneMappingUndefined: Self = StObject.set(x, "milestoneMapping", js.undefined)
      
      @scala.inline
      def setMilestoneTemplate(value: String): Self = StObject.set(x, "milestoneTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMilestoneTemplateUndefined: Self = StObject.set(x, "milestoneTemplate", js.undefined)
      
      @scala.inline
      def setNonWorkingBackground(value: String): Self = StObject.set(x, "nonWorkingBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonWorkingBackgroundUndefined: Self = StObject.set(x, "nonWorkingBackground", js.undefined)
      
      @scala.inline
      def setNotesMapping(value: String): Self = StObject.set(x, "notesMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotesMappingUndefined: Self = StObject.set(x, "notesMapping", js.undefined)
      
      @scala.inline
      def setParentProgressbarBackground(value: String): Self = StObject.set(x, "parentProgressbarBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentProgressbarBackgroundUndefined: Self = StObject.set(x, "parentProgressbarBackground", js.undefined)
      
      @scala.inline
      def setParentTaskIdMapping(value: String): Self = StObject.set(x, "parentTaskIdMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentTaskIdMappingUndefined: Self = StObject.set(x, "parentTaskIdMapping", js.undefined)
      
      @scala.inline
      def setParentTaskbarBackground(value: String): Self = StObject.set(x, "parentTaskbarBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentTaskbarBackgroundUndefined: Self = StObject.set(x, "parentTaskbarBackground", js.undefined)
      
      @scala.inline
      def setParentTaskbarTemplate(value: String): Self = StObject.set(x, "parentTaskbarTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentTaskbarTemplateUndefined: Self = StObject.set(x, "parentTaskbarTemplate", js.undefined)
      
      @scala.inline
      def setPredecessorMapping(value: String): Self = StObject.set(x, "predecessorMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredecessorMappingUndefined: Self = StObject.set(x, "predecessorMapping", js.undefined)
      
      @scala.inline
      def setPredecessorTooltipTemplate(value: String): Self = StObject.set(x, "predecessorTooltipTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredecessorTooltipTemplateUndefined: Self = StObject.set(x, "predecessorTooltipTemplate", js.undefined)
      
      @scala.inline
      def setProgressMapping(value: String): Self = StObject.set(x, "progressMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressMappingUndefined: Self = StObject.set(x, "progressMapping", js.undefined)
      
      @scala.inline
      def setProgressbarBackground(value: String): Self = StObject.set(x, "progressbarBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressbarBackgroundUndefined: Self = StObject.set(x, "progressbarBackground", js.undefined)
      
      @scala.inline
      def setProgressbarHeight(value: Double): Self = StObject.set(x, "progressbarHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressbarHeightUndefined: Self = StObject.set(x, "progressbarHeight", js.undefined)
      
      @scala.inline
      def setProgressbarTooltipTemplate(value: String): Self = StObject.set(x, "progressbarTooltipTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressbarTooltipTemplateId(value: String): Self = StObject.set(x, "progressbarTooltipTemplateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressbarTooltipTemplateIdUndefined: Self = StObject.set(x, "progressbarTooltipTemplateId", js.undefined)
      
      @scala.inline
      def setProgressbarTooltipTemplateUndefined: Self = StObject.set(x, "progressbarTooltipTemplate", js.undefined)
      
      @scala.inline
      def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryCellInfo(value: /* e */ QueryCellInfoEventArgs => Unit): Self = StObject.set(x, "queryCellInfo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQueryCellInfoUndefined: Self = StObject.set(x, "queryCellInfo", js.undefined)
      
      @scala.inline
      def setQueryTaskbarInfo(value: /* e */ QueryTaskbarInfoEventArgs => Unit): Self = StObject.set(x, "queryTaskbarInfo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQueryTaskbarInfoUndefined: Self = StObject.set(x, "queryTaskbarInfo", js.undefined)
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRenderBaseline(value: Boolean): Self = StObject.set(x, "renderBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderBaselineUndefined: Self = StObject.set(x, "renderBaseline", js.undefined)
      
      @scala.inline
      def setResourceCollectionMapping(value: String): Self = StObject.set(x, "resourceCollectionMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceCollectionMappingUndefined: Self = StObject.set(x, "resourceCollectionMapping", js.undefined)
      
      @scala.inline
      def setResourceIdMapping(value: String): Self = StObject.set(x, "resourceIdMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceIdMappingUndefined: Self = StObject.set(x, "resourceIdMapping", js.undefined)
      
      @scala.inline
      def setResourceInfoMapping(value: String): Self = StObject.set(x, "resourceInfoMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceInfoMappingUndefined: Self = StObject.set(x, "resourceInfoMapping", js.undefined)
      
      @scala.inline
      def setResourceNameMapping(value: String): Self = StObject.set(x, "resourceNameMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceNameMappingUndefined: Self = StObject.set(x, "resourceNameMapping", js.undefined)
      
      @scala.inline
      def setResourceUnitMapping(value: String): Self = StObject.set(x, "resourceUnitMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUnitMappingUndefined: Self = StObject.set(x, "resourceUnitMapping", js.undefined)
      
      @scala.inline
      def setResources(value: js.Array[_]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      @scala.inline
      def setResourcesVarargs(value: js.Any*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      @scala.inline
      def setRightTaskLabelMapping(value: String): Self = StObject.set(x, "rightTaskLabelMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightTaskLabelMappingUndefined: Self = StObject.set(x, "rightTaskLabelMapping", js.undefined)
      
      @scala.inline
      def setRightTaskLabelTemplate(value: String): Self = StObject.set(x, "rightTaskLabelTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightTaskLabelTemplateUndefined: Self = StObject.set(x, "rightTaskLabelTemplate", js.undefined)
      
      @scala.inline
      def setRoundOffDayworkingTime(value: Boolean): Self = StObject.set(x, "roundOffDayworkingTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundOffDayworkingTimeUndefined: Self = StObject.set(x, "roundOffDayworkingTime", js.undefined)
      
      @scala.inline
      def setRowDataBound(value: /* e */ RowDataBoundEventArgs => Unit): Self = StObject.set(x, "rowDataBound", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowDataBoundUndefined: Self = StObject.set(x, "rowDataBound", js.undefined)
      
      @scala.inline
      def setRowDrag(value: /* e */ RowDragEventArgs => Unit): Self = StObject.set(x, "rowDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowDragStart(value: /* e */ RowDragStartEventArgs => Unit): Self = StObject.set(x, "rowDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowDragStartUndefined: Self = StObject.set(x, "rowDragStart", js.undefined)
      
      @scala.inline
      def setRowDragStop(value: /* e */ RowDragStopEventArgs => Unit): Self = StObject.set(x, "rowDragStop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowDragStopUndefined: Self = StObject.set(x, "rowDragStop", js.undefined)
      
      @scala.inline
      def setRowDragUndefined: Self = StObject.set(x, "rowDrag", js.undefined)
      
      @scala.inline
      def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
      
      @scala.inline
      def setRowSelected(value: /* e */ RowSelectedEventArgs => Unit): Self = StObject.set(x, "rowSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowSelectedUndefined: Self = StObject.set(x, "rowSelected", js.undefined)
      
      @scala.inline
      def setRowSelecting(value: /* e */ RowSelectingEventArgs => Unit): Self = StObject.set(x, "rowSelecting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowSelectingUndefined: Self = StObject.set(x, "rowSelecting", js.undefined)
      
      @scala.inline
      def setScheduleEndDate(value: String): Self = StObject.set(x, "scheduleEndDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleEndDateUndefined: Self = StObject.set(x, "scheduleEndDate", js.undefined)
      
      @scala.inline
      def setScheduleHeaderSettings(value: ScheduleHeaderSettings): Self = StObject.set(x, "scheduleHeaderSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleHeaderSettingsUndefined: Self = StObject.set(x, "scheduleHeaderSettings", js.undefined)
      
      @scala.inline
      def setScheduleStartDate(value: String): Self = StObject.set(x, "scheduleStartDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleStartDateUndefined: Self = StObject.set(x, "scheduleStartDate", js.undefined)
      
      @scala.inline
      def setSelectedCellIndexes(value: js.Array[SelectedCellIndex]): Self = StObject.set(x, "selectedCellIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedCellIndexesUndefined: Self = StObject.set(x, "selectedCellIndexes", js.undefined)
      
      @scala.inline
      def setSelectedCellIndexesVarargs(value: SelectedCellIndex*): Self = StObject.set(x, "selectedCellIndexes", js.Array(value :_*))
      
      @scala.inline
      def setSelectedRowIndex(value: Double): Self = StObject.set(x, "selectedRowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedRowIndexUndefined: Self = StObject.set(x, "selectedRowIndex", js.undefined)
      
      @scala.inline
      def setSelectionMode(value: typings.std.SelectionMode | String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      @scala.inline
      def setSelectionType(value: SelectionType | String): Self = StObject.set(x, "selectionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionTypeUndefined: Self = StObject.set(x, "selectionType", js.undefined)
      
      @scala.inline
      def setShowColumnChooser(value: Boolean): Self = StObject.set(x, "showColumnChooser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowColumnChooserUndefined: Self = StObject.set(x, "showColumnChooser", js.undefined)
      
      @scala.inline
      def setShowColumnOptions(value: Boolean): Self = StObject.set(x, "showColumnOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowColumnOptionsUndefined: Self = StObject.set(x, "showColumnOptions", js.undefined)
      
      @scala.inline
      def setShowGridCellTooltip(value: Boolean): Self = StObject.set(x, "showGridCellTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowGridCellTooltipUndefined: Self = StObject.set(x, "showGridCellTooltip", js.undefined)
      
      @scala.inline
      def setShowGridExpandCellTooltip(value: Boolean): Self = StObject.set(x, "showGridExpandCellTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowGridExpandCellTooltipUndefined: Self = StObject.set(x, "showGridExpandCellTooltip", js.undefined)
      
      @scala.inline
      def setShowProgressStatus(value: Boolean): Self = StObject.set(x, "showProgressStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowProgressStatusUndefined: Self = StObject.set(x, "showProgressStatus", js.undefined)
      
      @scala.inline
      def setShowResourceNames(value: Boolean): Self = StObject.set(x, "showResourceNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowResourceNamesUndefined: Self = StObject.set(x, "showResourceNames", js.undefined)
      
      @scala.inline
      def setShowTaskNames(value: Boolean): Self = StObject.set(x, "showTaskNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTaskNamesUndefined: Self = StObject.set(x, "showTaskNames", js.undefined)
      
      @scala.inline
      def setSizeSettings(value: SizeSettings): Self = StObject.set(x, "sizeSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeSettingsUndefined: Self = StObject.set(x, "sizeSettings", js.undefined)
      
      @scala.inline
      def setSortSettings(value: SortSettings): Self = StObject.set(x, "sortSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortSettingsUndefined: Self = StObject.set(x, "sortSettings", js.undefined)
      
      @scala.inline
      def setSplitterPosition(value: String): Self = StObject.set(x, "splitterPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitterPositionUndefined: Self = StObject.set(x, "splitterPosition", js.undefined)
      
      @scala.inline
      def setSplitterResized(value: /* e */ SplitterResizedEventArgs => Unit): Self = StObject.set(x, "splitterResized", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSplitterResizedUndefined: Self = StObject.set(x, "splitterResized", js.undefined)
      
      @scala.inline
      def setSplitterSettings(value: SplitterSettings): Self = StObject.set(x, "splitterSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitterSettingsUndefined: Self = StObject.set(x, "splitterSettings", js.undefined)
      
      @scala.inline
      def setStartDateMapping(value: String): Self = StObject.set(x, "startDateMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDateMappingUndefined: Self = StObject.set(x, "startDateMapping", js.undefined)
      
      @scala.inline
      def setStripLines(value: js.Array[StripLine]): Self = StObject.set(x, "stripLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripLinesUndefined: Self = StObject.set(x, "stripLines", js.undefined)
      
      @scala.inline
      def setStripLinesVarargs(value: StripLine*): Self = StObject.set(x, "stripLines", js.Array(value :_*))
      
      @scala.inline
      def setTaskCollectionMapping(value: String): Self = StObject.set(x, "taskCollectionMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskCollectionMappingUndefined: Self = StObject.set(x, "taskCollectionMapping", js.undefined)
      
      @scala.inline
      def setTaskIdMapping(value: String): Self = StObject.set(x, "taskIdMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskIdMappingUndefined: Self = StObject.set(x, "taskIdMapping", js.undefined)
      
      @scala.inline
      def setTaskNameMapping(value: String): Self = StObject.set(x, "taskNameMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskNameMappingUndefined: Self = StObject.set(x, "taskNameMapping", js.undefined)
      
      @scala.inline
      def setTaskSchedulingMode(value: TaskSchedulingMode | String): Self = StObject.set(x, "taskSchedulingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskSchedulingModeMapping(value: String): Self = StObject.set(x, "taskSchedulingModeMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskSchedulingModeMappingUndefined: Self = StObject.set(x, "taskSchedulingModeMapping", js.undefined)
      
      @scala.inline
      def setTaskSchedulingModeUndefined: Self = StObject.set(x, "taskSchedulingMode", js.undefined)
      
      @scala.inline
      def setTaskType(value: TaskType | String): Self = StObject.set(x, "taskType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskTypeUndefined: Self = StObject.set(x, "taskType", js.undefined)
      
      @scala.inline
      def setTaskbarBackground(value: String): Self = StObject.set(x, "taskbarBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskbarBackgroundUndefined: Self = StObject.set(x, "taskbarBackground", js.undefined)
      
      @scala.inline
      def setTaskbarClick(value: /* e */ TaskbarClickEventArgs => Unit): Self = StObject.set(x, "taskbarClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTaskbarClickUndefined: Self = StObject.set(x, "taskbarClick", js.undefined)
      
      @scala.inline
      def setTaskbarEdited(value: /* e */ TaskbarEditedEventArgs => Unit): Self = StObject.set(x, "taskbarEdited", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTaskbarEditedUndefined: Self = StObject.set(x, "taskbarEdited", js.undefined)
      
      @scala.inline
      def setTaskbarEditing(value: /* e */ TaskbarEditingEventArgs => Unit): Self = StObject.set(x, "taskbarEditing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTaskbarEditingTooltipTemplate(value: String): Self = StObject.set(x, "taskbarEditingTooltipTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskbarEditingTooltipTemplateId(value: String): Self = StObject.set(x, "taskbarEditingTooltipTemplateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskbarEditingTooltipTemplateIdUndefined: Self = StObject.set(x, "taskbarEditingTooltipTemplateId", js.undefined)
      
      @scala.inline
      def setTaskbarEditingTooltipTemplateUndefined: Self = StObject.set(x, "taskbarEditingTooltipTemplate", js.undefined)
      
      @scala.inline
      def setTaskbarEditingUndefined: Self = StObject.set(x, "taskbarEditing", js.undefined)
      
      @scala.inline
      def setTaskbarHeight(value: Double): Self = StObject.set(x, "taskbarHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskbarHeightUndefined: Self = StObject.set(x, "taskbarHeight", js.undefined)
      
      @scala.inline
      def setTaskbarTemplate(value: String): Self = StObject.set(x, "taskbarTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskbarTemplateUndefined: Self = StObject.set(x, "taskbarTemplate", js.undefined)
      
      @scala.inline
      def setTaskbarTooltipTemplate(value: String): Self = StObject.set(x, "taskbarTooltipTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskbarTooltipTemplateId(value: String): Self = StObject.set(x, "taskbarTooltipTemplateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskbarTooltipTemplateIdUndefined: Self = StObject.set(x, "taskbarTooltipTemplateId", js.undefined)
      
      @scala.inline
      def setTaskbarTooltipTemplateUndefined: Self = StObject.set(x, "taskbarTooltipTemplate", js.undefined)
      
      @scala.inline
      def setToolbarClick(value: /* e */ ToolbarClickEventArgs => Unit): Self = StObject.set(x, "toolbarClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToolbarClickUndefined: Self = StObject.set(x, "toolbarClick", js.undefined)
      
      @scala.inline
      def setToolbarSettings(value: ToolbarSettings): Self = StObject.set(x, "toolbarSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarSettingsUndefined: Self = StObject.set(x, "toolbarSettings", js.undefined)
      
      @scala.inline
      def setTreeColumnIndex(value: Double): Self = StObject.set(x, "treeColumnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeColumnIndexUndefined: Self = StObject.set(x, "treeColumnIndex", js.undefined)
      
      @scala.inline
      def setValidateManualTasksOnLinking(value: Boolean): Self = StObject.set(x, "validateManualTasksOnLinking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateManualTasksOnLinkingUndefined: Self = StObject.set(x, "validateManualTasksOnLinking", js.undefined)
      
      @scala.inline
      def setViewType(value: ViewType | String): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
      
      @scala.inline
      def setWeekendBackground(value: String): Self = StObject.set(x, "weekendBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekendBackgroundUndefined: Self = StObject.set(x, "weekendBackground", js.undefined)
      
      @scala.inline
      def setWorkMapping(value: String): Self = StObject.set(x, "workMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkMappingUndefined: Self = StObject.set(x, "workMapping", js.undefined)
      
      @scala.inline
      def setWorkUnit(value: WorkUnit | String): Self = StObject.set(x, "workUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkUnitUndefined: Self = StObject.set(x, "workUnit", js.undefined)
      
      @scala.inline
      def setWorkWeek(value: js.Array[_]): Self = StObject.set(x, "workWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkWeekUndefined: Self = StObject.set(x, "workWeek", js.undefined)
      
      @scala.inline
      def setWorkWeekVarargs(value: js.Any*): Self = StObject.set(x, "workWeek", js.Array(value :_*))
      
      @scala.inline
      def setWorkingTimeScale(value: workingTimeScale | String): Self = StObject.set(x, "workingTimeScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkingTimeScaleUndefined: Self = StObject.set(x, "workingTimeScale", js.undefined)
    }
  }
  
  @js.native
  trait QueryCellInfoEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the selecting cell element.
      */
    var cellElement: js.UndefOr[js.Any] = js.native
    
    /** Returns the value of cell.
      */
    var cellValue: js.UndefOr[String] = js.native
    
    /** Returns the column of cell belongs.
      */
    var column: js.UndefOr[js.Any] = js.native
    
    /** Returns the data of current cell record.
      */
    var data: js.UndefOr[js.Any] = js.native
  }
  object QueryCellInfoEventArgs {
    
    @scala.inline
    def apply(): QueryCellInfoEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryCellInfoEventArgs]
    }
    
    @scala.inline
    implicit class QueryCellInfoEventArgsMutableBuilder[Self <: QueryCellInfoEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCellElement(value: js.Any): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellElementUndefined: Self = StObject.set(x, "cellElement", js.undefined)
      
      @scala.inline
      def setCellValue(value: String): Self = StObject.set(x, "cellValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellValueUndefined: Self = StObject.set(x, "cellValue", js.undefined)
      
      @scala.inline
      def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
  
  @js.native
  trait QueryTaskbarInfoEventArgs extends StObject {
    
    /** Returns the baseline background of current item.
      */
    var baselineBackground: js.UndefOr[String] = js.native
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the data of the record.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns the milestone background of current item.
      */
    var milestoneBackground: js.UndefOr[String] = js.native
    
    /** Returns the parent progressbar background of current item.
      */
    var parentProgressbarBackground: js.UndefOr[String] = js.native
    
    /** Returns the parent progressbar border color of current item.
      */
    var parentProgressbarBorder: js.UndefOr[String] = js.native
    
    /** Returns the parent taskbar background of current item.
      */
    var parentTaskbarBackground: js.UndefOr[String] = js.native
    
    /** Returns the parent taskbar border color of current item.
      */
    var parentTaskbarBorder: js.UndefOr[String] = js.native
    
    /** Returns the progressbar background of current item.
      */
    var progressbarBackground: js.UndefOr[String] = js.native
    
    /** Returns the progressbar border color of current item.
      */
    var progressbarBorder: js.UndefOr[String] = js.native
    
    /** Returns the taskbar background of current item.
      */
    var taskbarBackground: js.UndefOr[String] = js.native
    
    /** Returns the taskbar border color of current item.
      */
    var taskbarBorder: js.UndefOr[String] = js.native
    
    /** Returns the taskbar text color of current item.
      */
    var taskbarTextColor: js.UndefOr[String] = js.native
  }
  object QueryTaskbarInfoEventArgs {
    
    @scala.inline
    def apply(): QueryTaskbarInfoEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryTaskbarInfoEventArgs]
    }
    
    @scala.inline
    implicit class QueryTaskbarInfoEventArgsMutableBuilder[Self <: QueryTaskbarInfoEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaselineBackground(value: String): Self = StObject.set(x, "baselineBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaselineBackgroundUndefined: Self = StObject.set(x, "baselineBackground", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setMilestoneBackground(value: String): Self = StObject.set(x, "milestoneBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMilestoneBackgroundUndefined: Self = StObject.set(x, "milestoneBackground", js.undefined)
      
      @scala.inline
      def setParentProgressbarBackground(value: String): Self = StObject.set(x, "parentProgressbarBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentProgressbarBackgroundUndefined: Self = StObject.set(x, "parentProgressbarBackground", js.undefined)
      
      @scala.inline
      def setParentProgressbarBorder(value: String): Self = StObject.set(x, "parentProgressbarBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentProgressbarBorderUndefined: Self = StObject.set(x, "parentProgressbarBorder", js.undefined)
      
      @scala.inline
      def setParentTaskbarBackground(value: String): Self = StObject.set(x, "parentTaskbarBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentTaskbarBackgroundUndefined: Self = StObject.set(x, "parentTaskbarBackground", js.undefined)
      
      @scala.inline
      def setParentTaskbarBorder(value: String): Self = StObject.set(x, "parentTaskbarBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentTaskbarBorderUndefined: Self = StObject.set(x, "parentTaskbarBorder", js.undefined)
      
      @scala.inline
      def setProgressbarBackground(value: String): Self = StObject.set(x, "progressbarBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressbarBackgroundUndefined: Self = StObject.set(x, "progressbarBackground", js.undefined)
      
      @scala.inline
      def setProgressbarBorder(value: String): Self = StObject.set(x, "progressbarBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressbarBorderUndefined: Self = StObject.set(x, "progressbarBorder", js.undefined)
      
      @scala.inline
      def setTaskbarBackground(value: String): Self = StObject.set(x, "taskbarBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskbarBackgroundUndefined: Self = StObject.set(x, "taskbarBackground", js.undefined)
      
      @scala.inline
      def setTaskbarBorder(value: String): Self = StObject.set(x, "taskbarBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskbarBorderUndefined: Self = StObject.set(x, "taskbarBorder", js.undefined)
      
      @scala.inline
      def setTaskbarTextColor(value: String): Self = StObject.set(x, "taskbarTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskbarTextColorUndefined: Self = StObject.set(x, "taskbarTextColor", js.undefined)
    }
  }
  
  @js.native
  trait RowDataBoundEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the data of rendering row record..
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns the row element of rendering row.
      */
    var rowElement: js.UndefOr[js.Any] = js.native
  }
  object RowDataBoundEventArgs {
    
    @scala.inline
    def apply(): RowDataBoundEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowDataBoundEventArgs]
    }
    
    @scala.inline
    implicit class RowDataBoundEventArgsMutableBuilder[Self <: RowDataBoundEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setRowElement(value: js.Any): Self = StObject.set(x, "rowElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowElementUndefined: Self = StObject.set(x, "rowElement", js.undefined)
    }
  }
  
  @js.native
  trait RowDragEventArgs extends StObject {
    
    /** Returns that we can drop over that record or not.
      */
    var canDrop: js.UndefOr[Boolean] = js.native
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the row which we start to drag.
      */
    var draggedRow: js.UndefOr[js.Any] = js.native
    
    /** Returns the row index which we start to drag.
      */
    var draggedRowIndex: js.UndefOr[Double] = js.native
    
    /** Returns the drop position value on current target row.
      */
    var dropPosition: js.UndefOr[String] = js.native
    
    /** Returns the Gantt model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.native
    
    /** Duration is rounded off when it is set true.
      */
    var roundOffDuration: js.UndefOr[Boolean] = js.native
    
    /** Returns the row on which we are dragging.
      */
    var targetRow: js.UndefOr[js.Any] = js.native
    
    /** Returns the row index on which we are dragging.
      */
    var targetRowIndex: js.UndefOr[Double] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object RowDragEventArgs {
    
    @scala.inline
    def apply(): RowDragEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowDragEventArgs]
    }
    
    @scala.inline
    implicit class RowDragEventArgsMutableBuilder[Self <: RowDragEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanDrop(value: Boolean): Self = StObject.set(x, "canDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanDropUndefined: Self = StObject.set(x, "canDrop", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDraggedRow(value: js.Any): Self = StObject.set(x, "draggedRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedRowIndex(value: Double): Self = StObject.set(x, "draggedRowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedRowIndexUndefined: Self = StObject.set(x, "draggedRowIndex", js.undefined)
      
      @scala.inline
      def setDraggedRowUndefined: Self = StObject.set(x, "draggedRow", js.undefined)
      
      @scala.inline
      def setDropPosition(value: String): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropPositionUndefined: Self = StObject.set(x, "dropPosition", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      @scala.inline
      def setRoundOffDuration(value: Boolean): Self = StObject.set(x, "roundOffDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundOffDurationUndefined: Self = StObject.set(x, "roundOffDuration", js.undefined)
      
      @scala.inline
      def setTargetRow(value: js.Any): Self = StObject.set(x, "targetRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetRowIndex(value: Double): Self = StObject.set(x, "targetRowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetRowIndexUndefined: Self = StObject.set(x, "targetRowIndex", js.undefined)
      
      @scala.inline
      def setTargetRowUndefined: Self = StObject.set(x, "targetRow", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait RowDragStartEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the row which we start to drag.
      */
    var draggedRow: js.UndefOr[js.Any] = js.native
    
    /** Returns the row index which we start to drag.
      */
    var draggedRowIndex: js.UndefOr[Boolean] = js.native
    
    /** Returns the Gantt model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object RowDragStartEventArgs {
    
    @scala.inline
    def apply(): RowDragStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowDragStartEventArgs]
    }
    
    @scala.inline
    implicit class RowDragStartEventArgsMutableBuilder[Self <: RowDragStartEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDraggedRow(value: js.Any): Self = StObject.set(x, "draggedRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedRowIndex(value: Boolean): Self = StObject.set(x, "draggedRowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedRowIndexUndefined: Self = StObject.set(x, "draggedRowIndex", js.undefined)
      
      @scala.inline
      def setDraggedRowUndefined: Self = StObject.set(x, "draggedRow", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait RowDragStopEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the row which we start to drag.
      */
    var draggedRow: js.UndefOr[js.Any] = js.native
    
    /** Returns the row index which we start to drag.
      */
    var draggedRowIndex: js.UndefOr[Double] = js.native
    
    /** Returns the Gantt model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.native
    
    /** Returns the row which we are dropped to row.
      */
    var targetRow: js.UndefOr[js.Any] = js.native
    
    /** Returns the row index which we are dropped to row.
      */
    var targetRowIndex: js.UndefOr[Double] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object RowDragStopEventArgs {
    
    @scala.inline
    def apply(): RowDragStopEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowDragStopEventArgs]
    }
    
    @scala.inline
    implicit class RowDragStopEventArgsMutableBuilder[Self <: RowDragStopEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDraggedRow(value: js.Any): Self = StObject.set(x, "draggedRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedRowIndex(value: Double): Self = StObject.set(x, "draggedRowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedRowIndexUndefined: Self = StObject.set(x, "draggedRowIndex", js.undefined)
      
      @scala.inline
      def setDraggedRowUndefined: Self = StObject.set(x, "draggedRow", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      @scala.inline
      def setTargetRow(value: js.Any): Self = StObject.set(x, "targetRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetRowIndex(value: Double): Self = StObject.set(x, "targetRowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetRowIndexUndefined: Self = StObject.set(x, "targetRowIndex", js.undefined)
      
      @scala.inline
      def setTargetRowUndefined: Self = StObject.set(x, "targetRow", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait RowSelectedEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the data of selected record.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns the index of selecting row record.
      */
    var recordIndex: js.UndefOr[Double] = js.native
    
    /** Returns the selecting row element.
      */
    var targetRow: js.UndefOr[js.Any] = js.native
  }
  object RowSelectedEventArgs {
    
    @scala.inline
    def apply(): RowSelectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowSelectedEventArgs]
    }
    
    @scala.inline
    implicit class RowSelectedEventArgsMutableBuilder[Self <: RowSelectedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setRecordIndex(value: Double): Self = StObject.set(x, "recordIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordIndexUndefined: Self = StObject.set(x, "recordIndex", js.undefined)
      
      @scala.inline
      def setTargetRow(value: js.Any): Self = StObject.set(x, "targetRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetRowUndefined: Self = StObject.set(x, "targetRow", js.undefined)
    }
  }
  
  @js.native
  trait RowSelectingEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the data selecting record.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns the previous selected row chart element.
      */
    var previousChartRow: js.UndefOr[js.Any] = js.native
    
    /** Returns the previous selected data.
      */
    var previousData: js.UndefOr[js.Any] = js.native
    
    /** Returns the previous selected row grid element.
      */
    var previousGridRow: js.UndefOr[js.Any] = js.native
    
    /** Returns the previous selected row index.
      */
    var previousIndex: js.UndefOr[String] = js.native
    
    /** Returns the index of selecting row record.
      */
    var recordIndex: js.UndefOr[String] = js.native
    
    /** Returns the selecting row chart element.
      */
    var targetChartRow: js.UndefOr[js.Any] = js.native
    
    /** Returns the selecting row grid element.
      */
    var targetGridRow: js.UndefOr[js.Any] = js.native
  }
  object RowSelectingEventArgs {
    
    @scala.inline
    def apply(): RowSelectingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowSelectingEventArgs]
    }
    
    @scala.inline
    implicit class RowSelectingEventArgsMutableBuilder[Self <: RowSelectingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setPreviousChartRow(value: js.Any): Self = StObject.set(x, "previousChartRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousChartRowUndefined: Self = StObject.set(x, "previousChartRow", js.undefined)
      
      @scala.inline
      def setPreviousData(value: js.Any): Self = StObject.set(x, "previousData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousDataUndefined: Self = StObject.set(x, "previousData", js.undefined)
      
      @scala.inline
      def setPreviousGridRow(value: js.Any): Self = StObject.set(x, "previousGridRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousGridRowUndefined: Self = StObject.set(x, "previousGridRow", js.undefined)
      
      @scala.inline
      def setPreviousIndex(value: String): Self = StObject.set(x, "previousIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousIndexUndefined: Self = StObject.set(x, "previousIndex", js.undefined)
      
      @scala.inline
      def setRecordIndex(value: String): Self = StObject.set(x, "recordIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordIndexUndefined: Self = StObject.set(x, "recordIndex", js.undefined)
      
      @scala.inline
      def setTargetChartRow(value: js.Any): Self = StObject.set(x, "targetChartRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetChartRowUndefined: Self = StObject.set(x, "targetChartRow", js.undefined)
      
      @scala.inline
      def setTargetGridRow(value: js.Any): Self = StObject.set(x, "targetGridRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetGridRowUndefined: Self = StObject.set(x, "targetGridRow", js.undefined)
    }
  }
  
  @js.native
  trait ScheduleHeaderSettings extends StObject {
    
    /** Specified the format for day view in schedule header
      */
    var dayHeaderFormat: js.UndefOr[String] = js.native
    
    /** Specified the format for Hour view in schedule header
      * @Default {HH}
      */
    var hourHeaderFormat: js.UndefOr[String] = js.native
    
    /** Specifies the number of minutes per interval
      * @Default {ej.Gantt.minutesPerInterval.Auto}
      */
    var minutesPerInterval: js.UndefOr[typings.ejWebAll.ej.Gantt.minutesPerInterval | String] = js.native
    
    /** Specified the format for month view in schedule header
      * @Default {MMM}
      */
    var monthHeaderFormat: js.UndefOr[String] = js.native
    
    /** Specifies the schedule mode
      * @Default {ej.Gantt.ScheduleHeaderType.Week}
      */
    var scheduleHeaderType: js.UndefOr[ScheduleHeaderType | String] = js.native
    
    /** Specifies the round-off mode for the start date in schedule header.
      * @Default {ej.Gantt.TimescaleRoundMode.Auto}
      */
    var timescaleStartDateMode: js.UndefOr[TimescaleRoundMode | String] = js.native
    
    /** Specifies the size of the lowest time unit along the timescale, with minimum value as &quot;50%&quot; and maximum value as &quot;500%&quot;. It is also possible to set the value
      * in pixels.
      * @Default {100%}
      */
    var timescaleUnitSize: js.UndefOr[String] = js.native
    
    /** Enable or disable the automatic timescale update on cell editing, dialog editing and taskbar editing.
      * @Default {true}
      */
    var updateTimescaleView: js.UndefOr[Boolean] = js.native
    
    /** Specified the format for week view in schedule header
      * @Default {MMM dd , yyyy}
      */
    var weekHeaderFormat: js.UndefOr[String] = js.native
    
    /** Specifies the start day of the week in week timescale mode
      * @Default {0}
      */
    var weekStartDay: js.UndefOr[Double] = js.native
    
    /** Specified the background for weekends in Gantt
      * @Default {#F2F2F2}
      */
    var weekendBackground: js.UndefOr[String] = js.native
    
    /** Specified the format for year view in schedule header
      * @Default {yyyy}
      */
    var yearHeaderFormat: js.UndefOr[String] = js.native
  }
  object ScheduleHeaderSettings {
    
    @scala.inline
    def apply(): ScheduleHeaderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScheduleHeaderSettings]
    }
    
    @scala.inline
    implicit class ScheduleHeaderSettingsMutableBuilder[Self <: ScheduleHeaderSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDayHeaderFormat(value: String): Self = StObject.set(x, "dayHeaderFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayHeaderFormatUndefined: Self = StObject.set(x, "dayHeaderFormat", js.undefined)
      
      @scala.inline
      def setHourHeaderFormat(value: String): Self = StObject.set(x, "hourHeaderFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourHeaderFormatUndefined: Self = StObject.set(x, "hourHeaderFormat", js.undefined)
      
      @scala.inline
      def setMinutesPerInterval(value: minutesPerInterval | String): Self = StObject.set(x, "minutesPerInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutesPerIntervalUndefined: Self = StObject.set(x, "minutesPerInterval", js.undefined)
      
      @scala.inline
      def setMonthHeaderFormat(value: String): Self = StObject.set(x, "monthHeaderFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthHeaderFormatUndefined: Self = StObject.set(x, "monthHeaderFormat", js.undefined)
      
      @scala.inline
      def setScheduleHeaderType(value: ScheduleHeaderType | String): Self = StObject.set(x, "scheduleHeaderType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleHeaderTypeUndefined: Self = StObject.set(x, "scheduleHeaderType", js.undefined)
      
      @scala.inline
      def setTimescaleStartDateMode(value: TimescaleRoundMode | String): Self = StObject.set(x, "timescaleStartDateMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimescaleStartDateModeUndefined: Self = StObject.set(x, "timescaleStartDateMode", js.undefined)
      
      @scala.inline
      def setTimescaleUnitSize(value: String): Self = StObject.set(x, "timescaleUnitSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimescaleUnitSizeUndefined: Self = StObject.set(x, "timescaleUnitSize", js.undefined)
      
      @scala.inline
      def setUpdateTimescaleView(value: Boolean): Self = StObject.set(x, "updateTimescaleView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateTimescaleViewUndefined: Self = StObject.set(x, "updateTimescaleView", js.undefined)
      
      @scala.inline
      def setWeekHeaderFormat(value: String): Self = StObject.set(x, "weekHeaderFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekHeaderFormatUndefined: Self = StObject.set(x, "weekHeaderFormat", js.undefined)
      
      @scala.inline
      def setWeekStartDay(value: Double): Self = StObject.set(x, "weekStartDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekStartDayUndefined: Self = StObject.set(x, "weekStartDay", js.undefined)
      
      @scala.inline
      def setWeekendBackground(value: String): Self = StObject.set(x, "weekendBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekendBackgroundUndefined: Self = StObject.set(x, "weekendBackground", js.undefined)
      
      @scala.inline
      def setYearHeaderFormat(value: String): Self = StObject.set(x, "yearHeaderFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearHeaderFormatUndefined: Self = StObject.set(x, "yearHeaderFormat", js.undefined)
    }
  }
  
  @js.native
  trait SelectedCellIndex extends StObject {
    
    /** Specifies the cell index to be selected in the row.
      * @Default {-1}
      */
    var cellIndex: js.UndefOr[Double] = js.native
    
    /** Specifies the row index of the cell to be selected Gantt control
      * @Default {-1}
      */
    var rowIndex: js.UndefOr[Double] = js.native
  }
  object SelectedCellIndex {
    
    @scala.inline
    def apply(): SelectedCellIndex = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectedCellIndex]
    }
    
    @scala.inline
    implicit class SelectedCellIndexMutableBuilder[Self <: SelectedCellIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    }
  }
  
  @js.native
  trait SizeSettings extends StObject {
    
    /** Specifies the height of Gantt control
      */
    var height: js.UndefOr[String] = js.native
    
    /** Specifies the width of Gantt control
      */
    var width: js.UndefOr[String] = js.native
  }
  object SizeSettings {
    
    @scala.inline
    def apply(): SizeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeSettings]
    }
    
    @scala.inline
    implicit class SizeSettingsMutableBuilder[Self <: SizeSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SortSettings extends StObject {
    
    /** Specifies the sorted columns for Gantt
      * @Default {[]}
      */
    var sortedColumns: js.UndefOr[js.Array[SortSettingsSortedColumn]] = js.native
  }
  object SortSettings {
    
    @scala.inline
    def apply(): SortSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortSettings]
    }
    
    @scala.inline
    implicit class SortSettingsMutableBuilder[Self <: SortSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSortedColumns(value: js.Array[SortSettingsSortedColumn]): Self = StObject.set(x, "sortedColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortedColumnsUndefined: Self = StObject.set(x, "sortedColumns", js.undefined)
      
      @scala.inline
      def setSortedColumnsVarargs(value: SortSettingsSortedColumn*): Self = StObject.set(x, "sortedColumns", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SortSettingsSortedColumn extends StObject {
    
    /** Specifies the sort direction in Gantt
      */
    var direction: js.UndefOr[String] = js.native
    
    /** Specifies the field to be sorted in Gantt
      */
    var field: js.UndefOr[String] = js.native
  }
  object SortSettingsSortedColumn {
    
    @scala.inline
    def apply(): SortSettingsSortedColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortSettingsSortedColumn]
    }
    
    @scala.inline
    implicit class SortSettingsSortedColumnMutableBuilder[Self <: SortSettingsSortedColumn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    }
  }
  
  @js.native
  trait SplitterResizedEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the value based on current splitter position.
      */
    var currentSplitterPosition: js.UndefOr[String] = js.native
    
    /** To set custom position for splitter after resize action.
      */
    var customSplitterPosition: js.UndefOr[String] = js.native
    
    /** Returns the value to differentiate whether splitter resizing is performed either by manual resizing or by method
      */
    var isOnResize: js.UndefOr[Boolean] = js.native
    
    /** To differentiate `customSplitterPosition` value was index or position.
      */
    var isSplitterIndex: js.UndefOr[Boolean] = js.native
    
    /** Returns the previous splitter position
      */
    var prevSplitterPosition: js.UndefOr[String] = js.native
  }
  object SplitterResizedEventArgs {
    
    @scala.inline
    def apply(): SplitterResizedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SplitterResizedEventArgs]
    }
    
    @scala.inline
    implicit class SplitterResizedEventArgsMutableBuilder[Self <: SplitterResizedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentSplitterPosition(value: String): Self = StObject.set(x, "currentSplitterPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentSplitterPositionUndefined: Self = StObject.set(x, "currentSplitterPosition", js.undefined)
      
      @scala.inline
      def setCustomSplitterPosition(value: String): Self = StObject.set(x, "customSplitterPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSplitterPositionUndefined: Self = StObject.set(x, "customSplitterPosition", js.undefined)
      
      @scala.inline
      def setIsOnResize(value: Boolean): Self = StObject.set(x, "isOnResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOnResizeUndefined: Self = StObject.set(x, "isOnResize", js.undefined)
      
      @scala.inline
      def setIsSplitterIndex(value: Boolean): Self = StObject.set(x, "isSplitterIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSplitterIndexUndefined: Self = StObject.set(x, "isSplitterIndex", js.undefined)
      
      @scala.inline
      def setPrevSplitterPosition(value: String): Self = StObject.set(x, "prevSplitterPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevSplitterPositionUndefined: Self = StObject.set(x, "prevSplitterPosition", js.undefined)
    }
  }
  
  @js.native
  trait SplitterSettings extends StObject {
    
    /** Specifies the position of splitter in Gantt, based on column index in Gantt.
      */
    var index: js.UndefOr[String] = js.native
    
    /** Specifies position of the splitter in Gantt , splitter can be placed either based on percentage values or pixel values.
      */
    var position: js.UndefOr[String] = js.native
  }
  object SplitterSettings {
    
    @scala.inline
    def apply(): SplitterSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SplitterSettings]
    }
    
    @scala.inline
    implicit class SplitterSettingsMutableBuilder[Self <: SplitterSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  @js.native
  trait StripLine extends StObject {
    
    /** Specifies date to render striplines in Gantt
      */
    var day: js.UndefOr[String] = js.native
    
    /** Specifies label to be displayed for striplines in Gantt
      */
    var label: js.UndefOr[String] = js.native
    
    /** Specifies the line color for rendered striplines in Gantt
      */
    var lineColor: js.UndefOr[String] = js.native
    
    /** Specifies line style for rendered striplines in Gantt
      */
    var lineStyle: js.UndefOr[String] = js.native
    
    /** Specifies the width of the stripline in Gantt
      */
    var lineWidth: js.UndefOr[String] = js.native
  }
  object StripLine {
    
    @scala.inline
    def apply(): StripLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StripLine]
    }
    
    @scala.inline
    implicit class StripLineMutableBuilder[Self <: StripLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
      
      @scala.inline
      def setLineStyle(value: String): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
      
      @scala.inline
      def setLineWidth(value: String): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    }
  }
  
  @js.native
  trait TaskbarClickEventArgs extends StObject {
    
    /** Returns currently clicked row data
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns the current item index.
      */
    var index: js.UndefOr[Double] = js.native
    
    /** Returns the Gantt model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the target element.
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** Returns the clicked row element
      */
    var taskbarElement: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object TaskbarClickEventArgs {
    
    @scala.inline
    def apply(): TaskbarClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskbarClickEventArgs]
    }
    
    @scala.inline
    implicit class TaskbarClickEventArgsMutableBuilder[Self <: TaskbarClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTaskbarElement(value: js.Any): Self = StObject.set(x, "taskbarElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskbarElementUndefined: Self = StObject.set(x, "taskbarElement", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait TaskbarEditedEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the data of edited record.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns 'true' if taskbar is dragged.
      */
    var dragging: js.UndefOr[Boolean] = js.native
    
    /** Returns the field values of record being edited.
      */
    var editingFields: js.UndefOr[js.Any] = js.native
    
    /** Returns 'true' if taskbar is left resized.
      */
    var leftResizing: js.UndefOr[Boolean] = js.native
    
    /** Returns the Gantt model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the previous data value of edited record.
      */
    var previousData: js.UndefOr[js.Any] = js.native
    
    /** Returns 'true' if taskbar is progress resized.
      */
    var progressResizing: js.UndefOr[Boolean] = js.native
    
    /** Returns 'true' if taskbar is right resized.
      */
    var rightResizing: js.UndefOr[Boolean] = js.native
  }
  object TaskbarEditedEventArgs {
    
    @scala.inline
    def apply(): TaskbarEditedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskbarEditedEventArgs]
    }
    
    @scala.inline
    implicit class TaskbarEditedEventArgsMutableBuilder[Self <: TaskbarEditedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      @scala.inline
      def setEditingFields(value: js.Any): Self = StObject.set(x, "editingFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditingFieldsUndefined: Self = StObject.set(x, "editingFields", js.undefined)
      
      @scala.inline
      def setLeftResizing(value: Boolean): Self = StObject.set(x, "leftResizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftResizingUndefined: Self = StObject.set(x, "leftResizing", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPreviousData(value: js.Any): Self = StObject.set(x, "previousData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousDataUndefined: Self = StObject.set(x, "previousData", js.undefined)
      
      @scala.inline
      def setProgressResizing(value: Boolean): Self = StObject.set(x, "progressResizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressResizingUndefined: Self = StObject.set(x, "progressResizing", js.undefined)
      
      @scala.inline
      def setRightResizing(value: Boolean): Self = StObject.set(x, "rightResizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightResizingUndefined: Self = StObject.set(x, "rightResizing", js.undefined)
    }
  }
  
  @js.native
  trait TaskbarEditingEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the field values of record being edited.
      */
    var editingFields: js.UndefOr[js.Any] = js.native
    
    /** Returns the Gantt model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns duration value will be round-off or not.
      */
    var roundOffDuration: js.UndefOr[Boolean] = js.native
    
    /** Returns the row object being edited.
      */
    var rowData: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object TaskbarEditingEventArgs {
    
    @scala.inline
    def apply(): TaskbarEditingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskbarEditingEventArgs]
    }
    
    @scala.inline
    implicit class TaskbarEditingEventArgsMutableBuilder[Self <: TaskbarEditingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEditingFields(value: js.Any): Self = StObject.set(x, "editingFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditingFieldsUndefined: Self = StObject.set(x, "editingFields", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setRoundOffDuration(value: Boolean): Self = StObject.set(x, "roundOffDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundOffDurationUndefined: Self = StObject.set(x, "roundOffDuration", js.undefined)
      
      @scala.inline
      def setRowData(value: js.Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ToolbarClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the current item.
      */
    var currentTarget: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the toolbar item on which mouse click has been performed
      */
    var itemName: js.UndefOr[String] = js.native
    
    /** Returns the Gantt model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ToolbarClickEventArgs {
    
    @scala.inline
    def apply(): ToolbarClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarClickEventArgs]
    }
    
    @scala.inline
    implicit class ToolbarClickEventArgsMutableBuilder[Self <: ToolbarClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentTarget(value: js.Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      @scala.inline
      def setItemName(value: String): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemNameUndefined: Self = StObject.set(x, "itemName", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ToolbarSettings extends StObject {
    
    /** Allows the user to insert custom toolbar items.
      */
    var customToolbarItems: js.UndefOr[js.Array[ToolbarSettingsCustomToolbarItem]] = js.native
    
    /** Specifies the state of enabling or disabling toolbar
      * @Default {true}
      */
    var showToolbar: js.UndefOr[Boolean] = js.native
    
    /** Specifies the list of toolbar items to be rendered in Gantt toolbar
      * @Default {[]}
      */
    var toolbarItems: js.UndefOr[js.Array[ToolbarItems | String]] = js.native
  }
  object ToolbarSettings {
    
    @scala.inline
    def apply(): ToolbarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarSettings]
    }
    
    @scala.inline
    implicit class ToolbarSettingsMutableBuilder[Self <: ToolbarSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomToolbarItems(value: js.Array[ToolbarSettingsCustomToolbarItem]): Self = StObject.set(x, "customToolbarItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomToolbarItemsUndefined: Self = StObject.set(x, "customToolbarItems", js.undefined)
      
      @scala.inline
      def setCustomToolbarItemsVarargs(value: ToolbarSettingsCustomToolbarItem*): Self = StObject.set(x, "customToolbarItems", js.Array(value :_*))
      
      @scala.inline
      def setShowToolbar(value: Boolean): Self = StObject.set(x, "showToolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowToolbarUndefined: Self = StObject.set(x, "showToolbar", js.undefined)
      
      @scala.inline
      def setToolbarItems(value: js.Array[ToolbarItems | String]): Self = StObject.set(x, "toolbarItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarItemsUndefined: Self = StObject.set(x, "toolbarItems", js.undefined)
      
      @scala.inline
      def setToolbarItemsVarargs(value: (ToolbarItems | String)*): Self = StObject.set(x, "toolbarItems", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ToolbarSettingsCustomToolbarItem extends StObject {
    
    /** Allows the user to insert the custom icons in toolbar using script templates. Using this property we can bind HTML elements and other EJ controls to Gantt toolbar.
      */
    var templateID: js.UndefOr[String] = js.native
    
    /** Allows the user to insert the custom icons in toolbar using CSS class name selector.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Allows the user to display custom tooltip text for Gantt custom toolbar items.
      */
    var tooltipText: js.UndefOr[String] = js.native
  }
  object ToolbarSettingsCustomToolbarItem {
    
    @scala.inline
    def apply(): ToolbarSettingsCustomToolbarItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarSettingsCustomToolbarItem]
    }
    
    @scala.inline
    implicit class ToolbarSettingsCustomToolbarItemMutableBuilder[Self <: ToolbarSettingsCustomToolbarItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTemplateID(value: String): Self = StObject.set(x, "templateID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateIDUndefined: Self = StObject.set(x, "templateID", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTooltipText(value: String): Self = StObject.set(x, "tooltipText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipTextUndefined: Self = StObject.set(x, "tooltipText", js.undefined)
    }
  }
}
