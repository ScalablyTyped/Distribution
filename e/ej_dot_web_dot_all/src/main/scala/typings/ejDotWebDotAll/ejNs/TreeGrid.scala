package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.ejDotWebDotAll.ejNs.TreeGridNs.EjPredicate
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.TreeGrid")
@js.native
class TreeGrid protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.TreeGridNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.TreeGridNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.TreeGridNs.Model = js.native
  @JSName("model")
  var model_TreeGrid: typings.ejDotWebDotAll.ejNs.TreeGridNs.Model = js.native
  /** Add a new row in TreeGrid, while allowAdding is set to true
    * @param {any} Item to add in TreeGrid row.
    * @param {string} Defines in which position the row wants to be added
    * @returns {void}
    */
  def addRow(data: js.Any, rowPosition: String): Unit = js.native
  /** Clears the filter applied to a specific column.
    * @param {string} Pass the column field name to clear filtering done in that column.
    * @returns {void}
    */
  def clearFilter(fieldName: String): Unit = js.native
  /** To clear all the selection in TreeGrid
    * @param {number} you can pass a row index to clear the row selection.
    * @returns {void}
    */
  def clearSelection(index: Double): Unit = js.native
  /** To clear the sorting from sorted columns in TreeGrid.
    * @returns {void}
    */
  def clearSorting(): Unit = js.native
  /** To collapse all the parent items in tree grid
    * @returns {void}
    */
  def collapseAll(): Unit = js.native
  /** Collapses the records at specific hierarchical level
    * @param {number} you can pass the particular level as index.
    * @returns {void}
    */
  def collapseAtLevel(index: Double): Unit = js.native
  /** To change the index of the tree column in TreeGrid.
    * @param {number} Pass the column index to make the column as treeColumnIndex.
    * @returns {void}
    */
  def columnIndex(Index: Double): Unit = js.native
  /** To delete the specified column
    * @param {number} Index of the column to be deleted
    * @returns {void}
    */
  def deleteColumn(columnIndex: Double): Unit = js.native
  /** To delete a selected row in TreeGrid.
    * @returns {void}
    */
  def deleteRow(): Unit = js.native
  /** To expand all the root level nodes in TreeGrid.
    * @returns {void}
    */
  def expandAll(): Unit = js.native
  /** Expands the records at specific hierarchical level
    * @param {number} you can pass the level as index number to expand
    * @returns {void}
    */
  def expandAtLevel(index: Double): Unit = js.native
  /** To expand and collapse an item in TreeGrid using itemâ€™s index.
    * @param {number} Pass the row index of row to expand/collapse.
    * @returns {void}
    */
  def expandCollapseRow(Index: Double): Unit = js.native
  /** To expand collapse the total summary row.
    * @param {boolean} Decides to expand/collapse the total summary
    * @returns {void}
    */
  def expandCollapseTotalSummary(expanded: Boolean): Unit = js.native
  /** Sends filtering request to filter a column in TreeGrid.
    * @param {string} Pass the field name of the column.
    * @param {string} string/integer/dateTime operator.
    * @param {string} Pass the value to be filtered in a column.
    * @param {string} Pass the predicate as and/or.
    * @param {boolean} Optional pass the match case value as true/false.
    * @param {any} Optional actualFilterValue denote the filter object of current filtered columns.
    * @returns {void}
    */
  def filterColumn(
    fieldName: String,
    filterOperator: String,
    filterValue: String,
    predicate: String,
    matchcase: Boolean,
    actualFilterValue: js.Any
  ): Unit = js.native
  /** To filter multiple columns with multiple conditions dynamically in TreeGrid.
    * @param {TreeGrid.EjPredicate} Pass the filtering column details and conditions as ejPredicate instance. ejPredicate object is defined as fieldName,filterOperator, filterValue and
    * ignoreCase properties
    * @returns {void}
    */
  def filterContent(ejPredicate: EjPredicate): Unit = js.native
  /** Freeze/unfreeze the specified column.
    * @param {string} Freeze/Unfreeze this field column.
    * @param {boolean} Decides to Freeze/Unfreeze this field column.
    * @returns {void}
    */
  def freezeColumn(field: String, isFrozen: Boolean): Unit = js.native
  /** Freeze all the columns preceding to the column specified by the field name.
    * @param {string} Freeze all Columns before this field column.
    * @returns {void}
    */
  def freezePrecedingColumns(field: String): Unit = js.native
  /** Gets the column object of specific column.
    * @param {string} Pass the column field name to get details of that column.
    * @returns {any}
    */
  def getColumnByField(fieldName: String): js.Any = js.native
  /** Gets the column object of specific column.
    * @param {string} Pass the column header text to get details of that column.
    * @returns {any}
    */
  def getColumnByHeaderText(headerText: String): js.Any = js.native
  /** Gets the column index of specific column with data source field.
    * @param {string} Pass the column field name to get its index.
    * @returns {number}
    */
  def getColumnIndexByField(fieldName: String): Double = js.native
  /** Gets the column field name using column header text.
    * @param {string} Pass the column header text to get its field name.
    * @returns {string}
    */
  def getFieldNameByHeaderText(headerText: String): String = js.native
  /** Gets the scroll left offset of TreeGrid.
    * @returns {number}
    */
  def getScrollLeftOffset(): Double = js.native
  /** Gets the scroll top offset of TreeGrid.
    * @returns {number}
    */
  def getScrollTopOffset(): Double = js.native
  /** Gets the selected cell(s) element details in TreeGrid.
    * @returns {any[]}
    */
  def getSelectedCells(): js.Array[_] = js.native
  /** To get the updated data source of TreeGrid.
    * @returns {any[]}
    */
  def getUpdatedRecords(): js.Array[_] = js.native
  /** Sends request to navigate to a specific page in TreeGrid.
    * @param {number} Pass the page index to perform paging at specified page index.
    * @returns {void}
    */
  def gotoPage(PageIndex: Double): Unit = js.native
  /** To hide the column by using header text
    * @param {string} you can pass a header text of a column to hide.
    * @returns {void}
    */
  def hideColumn(headerText: String): Unit = js.native
  /** To move the TreeGrid rows programmatically with from index ,to index and position.
    * @param {number} you can pass drag Index of the row
    * @param {number} you can pass target Index of the row.
    * @param {string} you can pass the drop position as above,below,child
    * @returns {void}
    */
  def moveRow(fromIndex: Double, toIndex: Double, position: String): Unit = js.native
  /** To refresh the changes in tree grid
    * @param {any[]} Pass which data source you want to show in tree grid
    * @param {any} Pass which data you want to show in tree grid
    * @returns {void}
    */
  def refresh(dataSource: js.Array[_], query: js.Any): Unit = js.native
  /** To rename a column with the specified name
    * @param {number} Index of the column to be renamed
    * @param {string} Header text of the column
    * @returns {void}
    */
  def renameColumn(columnIndex: Double, name: String): Unit = js.native
  /** To reorder the column with field name and target index values
    * @param {string} you can pass a name of column to reorder.
    * @param {string} you can pass a target column index to be inserted.
    * @returns {void}
    */
  def reorderColumn(fieldName: String, targetIndex: String): Unit = js.native
  /** To save the edited cell in TreeGrid
    * @returns {void}
    */
  def saveCell(): Unit = js.native
  /** Sets the scroll left and scroll top offsets of TreeGrid.
    * @param {string} Pass a value to set left position of horizontal scroll bar.
    * @param {string} Pass a value to set top position of vertical scroll bar.
    * @returns {void}
    */
  def scrollOffset(Left: String, Top: String): Unit = js.native
  /** Sets the scroll top offset of TreeGrid to maximum value.
    * @returns {void}
    */
  def scrollToBottom(): Unit = js.native
  /** Sets the scroll top offset of TreeGrid to 0.
    * @returns {void}
    */
  def scrollToTop(): Unit = js.native
  /** To select cell based on the cell and row index dynamically.
    * @param {any[]} array of cell indexes to be select
    * @param {boolean} Defines that we need to preserve the previously selected cells or not
    * @returns {void}
    */
  def selectCells(Indexes: js.Array[_], preservePreviousSelectedCell: Boolean): Unit = js.native
  /** To open the dialog to add new record/row in TreeGrid.
    * @returns {void}
    */
  def showAddDialog(): Unit = js.native
  /** To show the column by using header text
    * @param {string} you can pass a header text of a column to show.
    * @returns {void}
    */
  def showColumn(headerText: String): Unit = js.native
  /** To open the dialog to edit a row/record in TreeGrid.
    * @param {number} Pass the index of row to be edit.
    * @returns {void}
    */
  def showEditDialog(Index: Double): Unit = js.native
  /** Show/Hide the detail row of a specific record.
    * @param {number} Pass the row index of record to show/hide the detail row.
    * @returns {void}
    */
  def showHideDetailsRow(rowIndex: Double): Unit = js.native
  /** To sorting the data based on the particular fields
    * @param {string} you can pass a name of column to sort.
    * @param {string} you can pass a sort direction to sort the column.
    * @returns {void}
    */
  def sortColumn(fieldName: String, columnSortDirection: String): Unit = js.native
  /** To change the checkbox selection to any column.
    * @param {string} Pass the column field name to check box selection to that column.
    * @returns {void}
    */
  def updateCheckboxColumn(fieldName: String): Unit = js.native
  /** To update the value of TreeGrid row by using row index.
    * @param {number} index of record to be updated
    * @param {any} object with modified field value
    * @returns {void}
    */
  def updateRecordByIndex(index: Double, data: js.Any): Unit = js.native
  /** Sets the minimum responsive width for TreeGrid.
    * @param {string} Pass the minimum responsive width, above which the TreeGrid needs to work in responsive mode.
    * @returns {void}
    */
  def updateResponsiveMinWidth(width: String): Unit = js.native
}

/* static members */
@JSGlobal("ej.TreeGrid")
@js.native
object TreeGrid extends js.Object {
  var Locale: js.Any = js.native
  var fn: TreeGrid = js.native
}

