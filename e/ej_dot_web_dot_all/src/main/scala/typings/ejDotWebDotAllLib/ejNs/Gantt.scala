package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Gantt")
@js.native
class Gantt protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.GanttNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.GanttNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.GanttNs.Model = js.native
  @JSName("model")
  var model_Gantt: ejDotWebDotAllLib.ejNs.GanttNs.Model = js.native
  /** To add a new item in Gantt
           * @param {any} Item to add in Gantt row.
           * @param {string} Defines in which position the row wants to add
           * @returns {void}
           */
  def addRecord(data: js.Any, rowPosition: java.lang.String): scala.Unit = js.native
  /** To cancel the edited state of an item in Gantt
           * @returns {void}
           */
  def cancelEdit(): scala.Unit = js.native
  /** To clear all the filtered columns in Gantt.
           * @returns {void}
           */
  def clearFilter(): scala.Unit = js.native
  /** To clear the sorted columns in Gantt.
           * @returns {void}
           */
  def clearSorting(): scala.Unit = js.native
  /** To collapse all the parent items in Gantt
           * @returns {void}
           */
  def collapseAllItems(): scala.Unit = js.native
  /** To delete the dependency between the two tasks.
           * @param {number} taskID of predecessor task
           * @param {number} taskID of successor task
           * @returns {void}
           */
  def deleteDependency(fromTaskId: scala.Double, toTaskId: scala.Double): scala.Unit = js.native
  /** To delete a selected item in Gantt
           * @returns {void}
           */
  def deleteItem(): scala.Unit = js.native
  /** To Expand all the parent items in Gantt
           * @returns {void}
           */
  def expandAllItems(): scala.Unit = js.native
  /** To expand and collapse an item in Gantt using item's ID
           * @param {number} Expand or Collapse a record based on task id.
           * @returns {void}
           */
  def expandCollapseRecord(taskId: scala.Double): scala.Unit = js.native
  /** Export the Gantt content to excel or PDF document.
           * @param {string} Pass the controller action name corresponding to exporting
           * @param {string} optionalASP server event name corresponding to exporting
           * @param {boolean} optionalPass the multiple exporting value as true/false
           * @returns {void}
           */
  def export(action: java.lang.String): scala.Unit = js.native
  /** Export the Gantt content to excel or PDF document.
           * @param {string} Pass the controller action name corresponding to exporting
           * @param {string} optionalASP server event name corresponding to exporting
           * @param {boolean} optionalPass the multiple exporting value as true/false
           * @returns {void}
           */
  def export(action: java.lang.String, serverEvent: java.lang.String): scala.Unit = js.native
  /** Export the Gantt content to excel or PDF document.
           * @param {string} Pass the controller action name corresponding to exporting
           * @param {string} optionalASP server event name corresponding to exporting
           * @param {boolean} optionalPass the multiple exporting value as true/false
           * @returns {void}
           */
  def export(action: java.lang.String, serverEvent: java.lang.String, multipleExport: scala.Boolean): scala.Unit = js.native
  /** Sends filtering request to filter a column in Gantt dynamically.
           * @param {string} Pass the field name of the column.
           * @param {string} string/integer/date operator.
           * @param {string} Pass the value to be filtered in a column.
           * @param {string} Optional - Pass the predicate as and/or.
           * @param {boolean} Optional - pass the match case value as true/false.
           * @returns {void}
           */
  def filterColumn(fieldName: java.lang.String, filterOperator: java.lang.String, filterValue: java.lang.String): scala.Unit = js.native
  /** Sends filtering request to filter a column in Gantt dynamically.
           * @param {string} Pass the field name of the column.
           * @param {string} string/integer/date operator.
           * @param {string} Pass the value to be filtered in a column.
           * @param {string} Optional - Pass the predicate as and/or.
           * @param {boolean} Optional - pass the match case value as true/false.
           * @returns {void}
           */
  def filterColumn(
    fieldName: java.lang.String,
    filterOperator: java.lang.String,
    filterValue: java.lang.String,
    predicate: java.lang.String
  ): scala.Unit = js.native
  /** Sends filtering request to filter a column in Gantt dynamically.
           * @param {string} Pass the field name of the column.
           * @param {string} string/integer/date operator.
           * @param {string} Pass the value to be filtered in a column.
           * @param {string} Optional - Pass the predicate as and/or.
           * @param {boolean} Optional - pass the match case value as true/false.
           * @returns {void}
           */
  def filterColumn(
    fieldName: java.lang.String,
    filterOperator: java.lang.String,
    filterValue: java.lang.String,
    predicate: java.lang.String,
    matchCase: scala.Boolean
  ): scala.Unit = js.native
  /** To filter multiple columns with multiple conditions dynamically in Gantt.
           * @param {Gantt.EjPredicate} Pass the filtering column details and conditions as ejPredicate instance. The ejPredicate object is defined as fieldName,filterOperator, filterValue and
           * ignoreCase properties.
           * @returns {void}
           */
  def filterContent(ejPredicate: ejDotWebDotAllLib.ejNs.GanttNs.EjPredicate): scala.Unit = js.native
  /** To get available column collection in Gantt.
           * @returns {void}
           */
  def getColumns(): scala.Unit = js.native
  /** To get the column collection which are used to edit the task by using task add/edit dialog in resource view.
           * @returns {void}
           */
  def getResourceViewEditColumns(): scala.Unit = js.native
  /** To hide the column by using header text
           * @param {string} you can pass a header text of a column to hide
           * @returns {void}
           */
  def hideColumn(headerText: java.lang.String): scala.Unit = js.native
  /** To indent a selected item in Gantt
           * @returns {void}
           */
  def indentItem(): scala.Unit = js.native
  /** To Open the dialog to add new task to the Gantt
           * @returns {void}
           */
  def openAddDialog(): scala.Unit = js.native
  /** To Open the dialog to edit existing task to the Gantt
           * @returns {void}
           */
  def openEditDialog(): scala.Unit = js.native
  /** To outdent a selected item in Gantt
           * @returns {void}
           */
  def outdentItem(): scala.Unit = js.native
  /** To save the edited state of an item in Gantt
           * @returns {void}
           */
  def saveEdit(): scala.Unit = js.native
  /** To search an item with search string provided at the run time
           * @param {string} you can pass a text to search in Gantt Control.
           * @returns {void}
           */
  def searchItem(searchString: java.lang.String): scala.Unit = js.native
  /** To select cell based on the cell and row index dynamically.
           * @param {any[]} array of cell indexes to be select
           * @param {boolean} Defines that we need to preserve the previously selected cells of not
           * @returns {void}
           */
  def selectCells(Indexes: js.Array[_], preservePreviousSelectedCell: scala.Boolean): scala.Unit = js.native
  /** To select multiple rows dynamically.
           * @param {any[]} array of row indexes to select
           * @returns {void}
           */
  def selectMultipleRows(rowIndexes: js.Array[_]): scala.Unit = js.native
  /** Method to set scroll top value for Gantt control.
           * @param {number} Pass a value to set top position of vertical scroll bar.
           * @returns {void}
           */
  def setScrollTop(Top: scala.Double): scala.Unit = js.native
  /** Positions the splitter by the specified column index.
           * @param {number} Set the splitter position based on column index.
           * @returns {void}
           */
  def setSplitterIndex(index: scala.Double): scala.Unit = js.native
  /** To set the grid width in Gantt
           * @param {string} you can give either percentage or pixels value
           * @returns {void}
           */
  def setSplitterPosition(width: java.lang.String): scala.Unit = js.native
  /** To show the column by using header text
           * @param {string} you can pass a header text of a column to show
           * @returns {void}
           */
  def showColumn(headerText: java.lang.String): scala.Unit = js.native
  /** To show/hide the critical tasks in current project.
           * @param {boolean} To show/hide the critical tasks
           * @returns {void}
           */
  def showCriticalPath(isShown: scala.Boolean): scala.Unit = js.native
  /** To sort the column in required direction
           * @param {string} Defines the column's mapping name in which sorting have to be performed
           * @param {string} Defines the sort direction whether the column has to sorted in ascending/descending order. By default it is sorting in an ascending order
           * @returns {void}
           */
  def sortColumn(mappingName: java.lang.String, columnSortDirection: java.lang.String): scala.Unit = js.native
  /** To update the predecessor type and offset value for existing task dependency.
           * @param {number} taskID of predecessor task
           * @param {number} taskID of successor task
           * @param {string} Type of dependency task.
           * @param {number} Offset value of dependency task.
           * @returns {void}
           */
  def updateDependency(
    fromTaskId: scala.Double,
    toTaskId: scala.Double,
    predecessorType: java.lang.String,
    offset: scala.Double
  ): scala.Unit = js.native
  /** To update the value of Gantt record by using row index.
           * @param {number} index of Gantt record to be updated
           * @param {any} object with modified field value
           * @returns {void}
           */
  def updateRecordByIndex(index: scala.Double, data: js.Any): scala.Unit = js.native
  /** To update the value of Gantt record by using it's task id value.
           * @param {any} object with modified field values and current task id value
           * @returns {void}
           */
  def updateRecordByTaskId(data: js.Any): scala.Unit = js.native
  /** To update the schedule start date and schedule end date of project.
           * @param {string} New schedule start date of project
           * @param {string} New schedule end date of project
           * @returns {void}
           */
  def updateScheduleDates(startDate: java.lang.String, endDate: java.lang.String): scala.Unit = js.native
  /** To change an existing Gantt ID by new ID value dynamically
           * @param {number} you can pass an existing ID value to be change
           * @param {number} you can pass a new ID value to be change
           * @returns {void}
           */
  def updateTaskId(currentId: scala.Double, newId: scala.Double): scala.Unit = js.native
}

@JSGlobal("ej.Gantt")
@js.native
object Gantt extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.Gantt = js.native
}

