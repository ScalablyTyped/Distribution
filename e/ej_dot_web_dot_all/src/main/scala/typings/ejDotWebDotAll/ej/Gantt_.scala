package typings.ejDotWebDotAll.ej

import typings.ejDotWebDotAll.JQuery
import typings.ejDotWebDotAll.ej.Gantt.EjPredicate
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Gantt")
@js.native
class Gantt_ protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ej.Gantt.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ej.Gantt.Model) = this()
  var defaults: typings.ejDotWebDotAll.ej.Gantt.Model = js.native
  @JSName("model")
  var model_Gantt_ : typings.ejDotWebDotAll.ej.Gantt.Model = js.native
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

