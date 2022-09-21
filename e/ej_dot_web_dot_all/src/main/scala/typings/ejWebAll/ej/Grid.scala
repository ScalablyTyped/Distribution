package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import typings.std.HTMLElement
import typings.std.HTMLTableElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grid
  extends StObject
     with Widget_ {
  
  /** Adds a grid model property which is to be ignored upon exporting.
    * @param {any[]} Pass the array of parameters which need to be ignored on exporting
    * @returns {void}
    */
  def addIgnoreOnExport(propertyNames: js.Array[Any]): Unit = js.native
  
  /** Adds a grid model property which is to be ignored upon OnServerToolbarClick.
    * @param {any[]} Pass the array of parameters which need to be ignored on OnServerToolbarClick
    * @returns {void}
    */
  def addIgnoreOnToolbarServerClick(propertyNames: js.Array[Any]): Unit = js.native
  
  /** Add a new record in grid control when allowAdding is set as true.Without passing parameters it will add empty row.
    * @param {any[]} Pass the array of added Records
    * @param {any[]} optionalIf we pass serverChange as true, send post to server side for server action.
    * @returns {void}
    */
  def addRecord(): Unit = js.native
  def addRecord(data: js.Array[Any]): Unit = js.native
  def addRecord(data: js.Array[Any], serverChange: js.Array[Any]): Unit = js.native
  def addRecord(data: Unit, serverChange: js.Array[Any]): Unit = js.native
  
  /** Cancel the modified changes in grid control when edit mode is &quot;batch&quot;.
    * @returns {void}
    */
  def batchCancel(): Unit = js.native
  
  /** Save the modified changes to data source in grid control when edit mode is &quot;batch&quot;.
    * @returns {void}
    */
  def batchSave(): Unit = js.native
  
  /** Returns the total page size need to be displayed in grid based on the given container height. This method will also work when the property allowTextWrap as true only when wrap
    * mode is header.
    * @param {number} When passing the container height as integer or percentage, it will returns the page size that need to be displayed for grid.
    * @returns {number}
    */
  def calculatePageSizeByParentHeight(containerHeight: Double): Double = js.native
  
  /** Send a cancel request in grid.
    * @returns {void}
    */
  def cancelEdit(): Unit = js.native
  
  /** Send a cancel request to the edited cell in grid.
    * @returns {void}
    */
  def cancelEditCell(): Unit = js.native
  
  /** It is used to change the number of records displayed per page in grid based on the given page size.
    * @param {number} When passing the page size, it will change the number of records displayed per page in grid.
    * @returns {void}
    */
  def changePageSize(pageSize: Double): Unit = js.native
  
  /** It is used to clear all the cell selection.
    * @returns {boolean}
    */
  def clearCellSelection(): Boolean = js.native
  /** It is used to clear specified cell selection based on the rowIndex and columnIndex provided.
    * @param {number} It is used to pass the row index of the cell
    * @param {number} It is used to pass the column index of the cell.
    * @returns {boolean}
    */
  def clearCellSelection(rowIndex: Double, columnIndex: Double): Boolean = js.native
  
  /** It is used to clear all the row selection or at specific row selection based on the index provided.
    * @param {number} optional If index of the column is specified then it will remove the selection from the particular column else it will clears all of the column selection
    * @returns {boolean}
    */
  def clearColumnSelection(): Boolean = js.native
  def clearColumnSelection(index: Double): Boolean = js.native
  
  /** It is used to clear all the filtering done.
    * @param {string}  If field of the column is specified then it will clear the  particular filtering column
    * @returns {void}
    */
  def clearFiltering(field: String): Unit = js.native
  
  /** Clear the searching from the grid
    * @returns {void}
    */
  def clearSearching(): Unit = js.native
  
  /** Clear all the row selection or at specific row selection based on the index provided
    * @param {number} optional If index of the row is specified then it will remove the selection from the particular row else it will clears all of the row selection
    * @returns {boolean}
    */
  def clearSelection(): Boolean = js.native
  def clearSelection(index: Double): Boolean = js.native
  
  /** Clear the sorting from columns in the grid
    * @returns {void}
    */
  def clearSorting(): Unit = js.native
  
  /** Collapse all the group caption rows in grid
    * @returns {void}
    */
  def collapseAll(): Unit = js.native
  
  /** Collapse the group drop area in grid
    * @returns {void}
    */
  def collapseGroupDropArea(): Unit = js.native
  
  def columns(columnDetails: String): Unit = js.native
  def columns(columnDetails: String, action: String): Unit = js.native
  /** Add or remove columns in grid column collections
    * @param {any[]|string} Pass array of columns or string of field name to add/remove the column in grid
    * @param {string} optional Pass add/remove action to be performed. By default "add" action will perform
    * @returns {void}
    */
  def columns(columnDetails: js.Array[Any]): Unit = js.native
  def columns(columnDetails: js.Array[Any], action: String): Unit = js.native
  
  /** Refresh the grid with new data source
    * @param {any} Pass new data source to the grid
    * @param {boolean} optional When templateRefresh is set true, both header and contents get refreshed
    * @returns {void}
    */
  def dataSource(datasource: Any): Unit = js.native
  def dataSource(datasource: Any, templateRefresh: Boolean): Unit = js.native
  
  var defaults: Model = js.native
  
  /** Delete a record in grid control when allowDeleting is set as true
    * @param {string} Pass the primary key field Name of the column
    * @param {any} Pass the JSON data of record need to be delete.
    * @returns {void}
    */
  def deleteRecord(fieldName: String, data: Any): Unit = js.native
  
  /** Delete the row based on the given tr element in grid.
    * @param {JQuery} Pass the tr element in grid content to get its row index
    * @returns {HTMLElement}
    */
  def deleteRow($tr: JQuery): HTMLElement = js.native
  
  /** Edit a particular cell based on the row index and field name provided in &quot;batch&quot; edit mode.
    * @param {number} Pass row index to edit particular cell
    * @param {string} Pass the field name of the column to perform batch edit
    * @returns {void}
    */
  def editCell(index: Double, fieldName: String): Unit = js.native
  
  /** It returns a value and if the input field values of edit form is not based on the validation rules then it will show the validation message.
    * @returns {boolean}
    */
  def editFormValidate(): Boolean = js.native
  
  /** Send a save request in grid.
    * @returns {void}
    */
  def endEdit(): Unit = js.native
  
  /** Expand all the group caption rows in grid.
    * @returns {void}
    */
  def expandAll(): Unit = js.native
  
  /** Expand or collapse the row based on the row state in grid
    * @param {JQuery} Pass the target object to expand/collapse the row based on its row state
    * @returns {void}
    */
  def expandCollapse($target: JQuery): Unit = js.native
  
  /** Expand the group drop area in grid.
    * @returns {void}
    */
  def expandGroupDropArea(): Unit = js.native
  
  /** Export the grid content to excel, word or PDF document.
    * @param {string} Pass the controller action name corresponding to exporting
    * @param {string} optionalASP server event name corresponding to exporting
    * @param {boolean} optionalPass the multiple exporting value as true/false
    * @param {any[]} optionalPass the array of the gridIds to be filtered
    * @returns {void}
    */
  def `export`(): Unit = js.native
  def `export`(action: String): Unit = js.native
  def `export`(action: String, serverEvent: String): Unit = js.native
  def `export`(action: String, serverEvent: String, multipleExport: Boolean): Unit = js.native
  def `export`(action: String, serverEvent: String, multipleExport: Boolean, gridIds: js.Array[Any]): Unit = js.native
  def `export`(action: String, serverEvent: String, multipleExport: Unit, gridIds: js.Array[Any]): Unit = js.native
  def `export`(action: String, serverEvent: Unit, multipleExport: Boolean): Unit = js.native
  def `export`(action: String, serverEvent: Unit, multipleExport: Boolean, gridIds: js.Array[Any]): Unit = js.native
  def `export`(action: String, serverEvent: Unit, multipleExport: Unit, gridIds: js.Array[Any]): Unit = js.native
  def `export`(action: Unit, serverEvent: String): Unit = js.native
  def `export`(action: Unit, serverEvent: String, multipleExport: Boolean): Unit = js.native
  def `export`(action: Unit, serverEvent: String, multipleExport: Boolean, gridIds: js.Array[Any]): Unit = js.native
  def `export`(action: Unit, serverEvent: String, multipleExport: Unit, gridIds: js.Array[Any]): Unit = js.native
  def `export`(action: Unit, serverEvent: Unit, multipleExport: Boolean): Unit = js.native
  def `export`(action: Unit, serverEvent: Unit, multipleExport: Boolean, gridIds: js.Array[Any]): Unit = js.native
  def `export`(action: Unit, serverEvent: Unit, multipleExport: Unit, gridIds: js.Array[Any]): Unit = js.native
  
  def filterColumn(fieldName: String, filterOperator: String, filterValue: String, predicate: String): Unit = js.native
  def filterColumn(
    fieldName: String,
    filterOperator: String,
    filterValue: String,
    predicate: String,
    matchcase: Boolean
  ): Unit = js.native
  def filterColumn(
    fieldName: String,
    filterOperator: String,
    filterValue: String,
    predicate: String,
    matchcase: Boolean,
    actualFilterValue: Any
  ): Unit = js.native
  def filterColumn(
    fieldName: String,
    filterOperator: String,
    filterValue: String,
    predicate: String,
    matchcase: Unit,
    actualFilterValue: Any
  ): Unit = js.native
  /** Send a filtering request to filter one column in grid.
    * @param {any[]|string} Pass the field name of the column
    * @param {string} string/integer/dateTime operator
    * @param {string} Pass the value to be filtered in a column
    * @param {string} Pass the predicate as and/or
    * @param {boolean} optional Pass the match case value as true/false
    * @param {any} optionalactualFilterValue denote the filter object of current filtered columns.Pass the value to filtered in a column
    * @returns {void}
    */
  def filterColumn(fieldName: js.Array[Any], filterOperator: String, filterValue: String, predicate: String): Unit = js.native
  def filterColumn(
    fieldName: js.Array[Any],
    filterOperator: String,
    filterValue: String,
    predicate: String,
    matchcase: Boolean
  ): Unit = js.native
  def filterColumn(
    fieldName: js.Array[Any],
    filterOperator: String,
    filterValue: String,
    predicate: String,
    matchcase: Boolean,
    actualFilterValue: Any
  ): Unit = js.native
  def filterColumn(
    fieldName: js.Array[Any],
    filterOperator: String,
    filterValue: String,
    predicate: String,
    matchcase: Unit,
    actualFilterValue: Any
  ): Unit = js.native
  /** Send a filtering request to filter single or multiple column in grid.
    * @param {any[]} Pass array of filterColumn query for performing filter operation
    * @returns {void}
    */
  def filterColumn(filterQueries: js.Array[Any]): Unit = js.native
  
  /** Get the batch changes of edit, delete and add operations of grid.
    * @returns {any}
    */
  def getBatchChanges(): Any = js.native
  
  /** Get the browser details
    * @returns {any}
    */
  def getBrowserDetails(): Any = js.native
  
  /** Get the column details based on the given field in grid
    * @param {string} Pass the field name of the column to get the corresponding column object
    * @returns {any}
    */
  def getColumnByField(fieldName: String): Any = js.native
  
  /** Get the column details based on the given header text in grid.
    * @param {string} Pass the header text of the column to get the corresponding column object
    * @returns {any}
    */
  def getColumnByHeaderText(headerText: String): Any = js.native
  
  /** Get the column details based on the given column index in grid
    * @param {number} Pass the index of the column to get the corresponding column object
    * @returns {any}
    */
  def getColumnByIndex(columnIndex: Double): Any = js.native
  
  /** Get the list of field names from column collection in grid.
    * @returns {any[]}
    */
  def getColumnFieldNames(): js.Array[Any] = js.native
  
  /** Get the column index of the given field in grid.
    * @param {string} Pass the field name of the column to get the corresponding column index
    * @returns {number}
    */
  def getColumnIndexByField(fieldName: String): Double = js.native
  
  /** Get the column index of the given headerText of column in grid.
    * @param {string} Pass the headerText of the column to get that column index
    * @param {string} optionalOptional Pass the field name of the column.
    * @returns {number}
    */
  def getColumnIndexByHeaderText(headerText: String): Double = js.native
  def getColumnIndexByHeaderText(headerText: String, field: String): Double = js.native
  
  /** Get the content div element of grid.
    * @returns {HTMLElement}
    */
  def getContent(): HTMLElement = js.native
  
  /** Get the content table element of grid
    * @returns {HTMLTableElement[]}
    */
  def getContentTable(): js.Array[HTMLTableElement] = js.native
  
  /** Get the data of currently edited cell value in &quot;batch&quot; edit mode
    * @returns {any}
    */
  def getCurrentEditCellData(): Any = js.native
  
  /** Get the current page index in grid pager.
    * @returns {number}
    */
  def getCurrentIndex(): Double = js.native
  
  /** Get the current page data source of grid.
    * @returns {any[]}
    */
  def getCurrentViewData(): js.Array[Any] = js.native
  
  /** Get the data of given row index in grid.
    * @returns {any}
    */
  def getDataByIndex(): Any = js.native
  
  /** Get the column field name from the given header text in grid.
    * @param {string} Pass header text of the column to get its corresponding field name
    * @returns {string}
    */
  def getFieldNameByHeaderText(headerText: String): String = js.native
  
  /** Get the filter bar of grid
    * @returns {HTMLElement}
    */
  def getFilterBar(): HTMLElement = js.native
  
  /** Get the records filtered or searched in Grid
    * @returns {any[]}
    */
  def getFilteredRecords(): js.Array[Any] = js.native
  
  /** Get the footer content of grid.
    * @returns {HTMLElement}
    */
  def getFooterContent(): HTMLElement = js.native
  
  /** Get the footer table element of grid.
    * @returns {HTMLElement}
    */
  def getFooterTable(): HTMLElement = js.native
  
  /** Get the header content div element of grid.
    * @returns {HTMLElement}
    */
  def getHeaderContent(): HTMLElement = js.native
  
  /** Get the header table element of grid
    * @returns {HTMLElement}
    */
  def getHeaderTable(): HTMLElement = js.native
  
  /** Get the column header text from the given field name in grid.
    * @param {string} Pass field name of the column to get its corresponding header text
    * @returns {string}
    */
  def getHeaderTextByFieldName(field: String): String = js.native
  
  /** Get the names of all the hidden column collections in grid.
    * @returns {any[]}
    */
  def getHiddenColumnNames(): js.Array[Any] = js.native
  
  /** Get the row index based on the given tr element in grid.
    * @param {JQuery} Pass the tr element in grid content to get its row index
    * @returns {number}
    */
  def getIndexByRow($tr: JQuery): Double = js.native
  
  /** Get the pager of grid.
    * @returns {HTMLElement}
    */
  def getPager(): HTMLElement = js.native
  
  /** Get the names of primary key columns in Grid
    * @returns {any[]}
    */
  def getPrimaryKeyFieldNames(): js.Array[Any] = js.native
  
  /** Get the rows(tr element) from the given from and to row index in grid
    * @param {number} Pass the from index from which the rows to be returned
    * @param {number} Pass the to index to which the rows to be returned
    * @returns {HTMLElement}
    */
  def getRowByIndex(from: Double, to: Double): HTMLElement = js.native
  
  /** Get the row height of grid.
    * @returns {number}
    */
  def getRowHeight(): Double = js.native
  
  /** Get the rows(tr element)of grid which is displayed in the current page.
    * @returns {HTMLElement}
    */
  def getRows(): HTMLElement = js.native
  
  /** Get the scroller object of grid.
    * @returns {ej.Scroller}
    */
  def getScrollObject(): Scroller = js.native
  
  /** Get the selected records details in grid.
    * @returns {any[]}
    */
  def getSelectedRecords(): js.Array[Any] = js.native
  
  /** Get the selected row element details in grid.
    * @returns {any[]}
    */
  def getSelectedRows(): js.Array[Any] = js.native
  
  /** Get the calculated summary values of JSON data passed to it
    * @param {any} Pass Summary Column details
    * @param {any} Pass JSON Array for which its field values to be calculated
    * @returns {number}
    */
  def getSummaryValues(summaryCol: Any, summaryData: Any): Double = js.native
  
  /** Get the names of all the visible column collections in grid
    * @returns {any[]}
    */
  def getVisibleColumnNames(): js.Array[Any] = js.native
  
  /** It accepts the string value and returns the field and sorted direction of the column in grid.
    * @param {string} Pass the field of the column to get the sorted direction of the corresponding column in Grid.
    * @returns {number}
    */
  def getsortColumnByField(field: String): Double = js.native
  
  /** Send a paging request to specified page in grid
    * @param {number} Pass the page index to perform paging at specified page index
    * @returns {void}
    */
  def gotoPage(pageIndex: Double): Unit = js.native
  
  /** Send a column grouping request in grid.
    * @param {string} Pass the field Name of the column to be grouped in grid control
    * @returns {void}
    */
  def groupColumn(fieldName: String): Unit = js.native
  
  def hideColumns(headerText: String): Unit = js.native
  /** Hide columns from the grid based on the header text
    * @param {any[]|string} you can pass either array of header text of various columns or a header text of a column to hide
    * @returns {void}
    */
  def hideColumns(headerText: js.Array[Any]): Unit = js.native
  
  @JSName("model")
  var model_Grid: Model = js.native
  
  /** Print the grid control
    * @returns {void}
    */
  def print(): Unit = js.native
  
  /** It is used to refresh and reset the changes made in &quot;batch&quot; edit mode
    * @returns {void}
    */
  def refreshBatchEditChanges(): Unit = js.native
  
  /** Refresh the grid contents. The template refreshment is based on the argument passed along with this method
    * @param {boolean} optional When templateRefresh is set true, template and grid contents both are refreshed in grid else only grid content is refreshed
    * @returns {void}
    */
  def refreshContent(): Unit = js.native
  def refreshContent(templateRefresh: Boolean): Unit = js.native
  
  /** Refresh the grid contents with updated server Data, using XMLHttpRequest. Url Path should be provided in Grid datasource otherwise it refreshes with local data without
    * XMLHttpRequest.
    * @param {any} optionalData to the server
    * @returns {void}
    */
  def refreshData(): Unit = js.native
  def refreshData(additionalParameters: Any): Unit = js.native
  
  /** It is used to refresh the grid header.
    * @returns {void}
    */
  def refreshHeader(): Unit = js.native
  
  /** Refresh the template of the grid
    * @returns {void}
    */
  def refreshTemplate(): Unit = js.native
  
  /** Refresh the toolbar items in grid.
    * @returns {void}
    */
  def refreshToolbar(): Unit = js.native
  
  def removeSortedColumns(fieldName: String): Unit = js.native
  /** Remove a column or collection of columns from a sorted column collections in grid.
    * @param {any[]|string} Pass array of field names of the columns to remove a collection of sorted columns or pass a string of field name to remove a column from sorted column
    * collections
    * @returns {void}
    */
  def removeSortedColumns(fieldName: js.Array[Any]): Unit = js.native
  
  /** Creates a grid control
    * @returns {void}
    */
  def render(): Unit = js.native
  
  /** Re-order the column in grid
    * @param {string} Pass the from field name of the column needs to be changed
    * @param {string} Pass the to field name of the column needs to be changed
    * @returns {void}
    */
  def reorderColumns(fromFieldName: String, toFieldName: String): Unit = js.native
  
  /** Re-order the row in grid
    * @param {any[]} Pass the indexes of the rows needs to reorder.
    * @param {number} Pass the index of a row where to be reordered.
    * @returns {void}
    */
  def reorderRows(indexes: js.Array[Any], toIndex: Double): Unit = js.native
  
  /** Reset the model collections like pageSettings, groupSettings, filterSettings, sortSettings and summaryRows.
    * @returns {void}
    */
  def resetModelCollections(): Unit = js.native
  
  /** Resize the columns by giving column name and width for the corresponding one.
    * @param {string} Pass the column name that needs to be changed
    * @param {string} Pass the width to resize the particular columns
    * @returns {void}
    */
  def resizeColumns(column: String, width: String): Unit = js.native
  
  /** Resolves row height issue when unbound column is used with FrozenColumn
    * @returns {void}
    */
  def rowHeightRefresh(): Unit = js.native
  
  /** We can prevent the client side cellSave event triggering by passing the preventSaveEvent argument as true.Without argument it will save the particular edited grid cell.
    * @param {boolean} optionalIf we pass preventSaveEvent as true, it prevents the client side cellSave event triggering
    * @returns {void}
    */
  def saveCell(): Unit = js.native
  def saveCell(preventSaveEvent: Boolean): Unit = js.native
  
  /** Send a search request to grid with specified string passed in it
    * @param {string} Pass the string to search in Grid records
    * @returns {void}
    */
  def search(searchString: String): Unit = js.native
  
  /** Select cells in grid.
    * @param {any} It is used to set the starting index of row and indexes of cells for that corresponding row for selecting cells.
    * @returns {void}
    */
  def selectCells(rowCellIndexes: Any): Unit = js.native
  
  /** Select the specified columns in grid based on Index provided.
    * @param {number} It is used to set the starting index of column for selecting columns.
    * @param {number} optionalIt is used to set the ending index of column for selecting columns.
    * @returns {boolean}
    */
  def selectColumns(columnIndex: Double): Boolean = js.native
  def selectColumns(columnIndex: Double, toIndex: Double): Boolean = js.native
  /** Select columns in grid.
    * @param {number} It is used to set the starting index of column for selecting columns.
    * @returns {void}
    */
  @JSName("selectColumns")
  def selectColumns_Unit(fromIndex: Double): Unit = js.native
  
  /** Select rows in grid.
    * @param {number} It is used to set the starting index of row for selecting rows.
    * @param {number} It is used to set the ending index of row for selecting rows.
    * @returns {void}
    */
  def selectRows(fromIndex: Double, toIndex: Double): Unit = js.native
  /** Select specified rows in grid based on Index provided.
    * @param {any[]|number} It is used to set the starting index of row for selecting rows.
    * @param {number} optionalIt is used to set the ending index of row for selecting rows.
    * @param {any} optionalTarget element which is clicked.
    * @returns {void}
    */
  def selectRows(from: js.Array[Any], to: Double): Unit = js.native
  def selectRows(from: js.Array[Any], to: Double, target: Any): Unit = js.native
  def selectRows(from: Double, to: Double, target: Any): Unit = js.native
  /** Select rows in grid.
    * @param {any[]} Pass array of rowIndexes for selecting rows
    * @returns {void}
    */
  def selectRows(rowIndexes: js.Array[Any]): Unit = js.native
  
  /** Used to update a particular cell value.
    * @returns {void}
    */
  def setCellText(): Unit = js.native
  
  /** Used to update a particular cell value based on specified row Index and the fieldName.
    * @param {number} It is used to set the index for selecting the row.
    * @param {string} It is used to set the field name for selecting column.
    * @param {any} It is used to set the value for the selected cell.
    * @returns {void}
    */
  def setCellValue(Index: Double, fieldName: String, value: Any): Unit = js.native
  
  /** It sets the default data to the column in grid during adding record in batch edit mode.
    * @returns {void}
    */
  def setDefaultData(): Unit = js.native
  
  /** Set dimension for grid with corresponding to grid parent.
    * @param {number} Pass the height of the grid container
    * @param {number} Pass the width of the grid container
    * @returns {void}
    */
  def setDimension(height: Double, width: Double): Unit = js.native
  
  /** The grid rows has to be rendered as detail view in mobile mode based on given value.
    * @param {number} It is used to render grid rows as details view in mobile mode.
    * @returns {void}
    */
  def setPhoneModeMaxWidth(Index: Double): Unit = js.native
  
  /** Set validation to edit form in the grid.
    * @returns {void}
    */
  def setValidation(): Unit = js.native
  
  /** Set validation to a particular input field in a edit form dynamically.
    * @param {string} Specify the field name of the column to set validation rules
    * @param {any} Specify the validation rules for the field
    * @returns {void}
    */
  def setValidationToField(fieldName: String, rules: Any): Unit = js.native
  
  /** Send a request to grid to refresh the width set to columns
    * @returns {void}
    */
  def setWidthToColumns(): Unit = js.native
  
  def showColumns(headerText: String): Unit = js.native
  /** Show columns in the grid based on the header text
    * @param {any[]|string} you can pass either array of header text of various columns or a header text of a column to show
    * @returns {void}
    */
  def showColumns(headerText: js.Array[Any]): Unit = js.native
  
  /** Send a sorting request in grid.
    * @param {string} Pass the field name of the column as columnName for which sorting have to be performed
    * @param {string} optional Pass the sort direction ascending/descending by which the column have to be sort. By default it is sorting in an ascending order
    * @returns {void}
    */
  def sortColumn(columnName: String): Unit = js.native
  def sortColumn(columnName: String, sortingDirection: String): Unit = js.native
  
  /** Send an edit record request in grid
    * @param {JQuery} Pass the tr- selected row element to be edited in grid
    * @returns {void}
    */
  def startEdit($tr: JQuery): Unit = js.native
  
  /** Un-group a column from grouped columns collection in grid
    * @param {string} Pass the field Name of the column to be ungrouped from grouped column collection
    * @returns {void}
    */
  def ungroupColumn(fieldName: String): Unit = js.native
  
  /** Update a edited record in grid control when allowEditing is set as true.
    * @param {string} Pass the primary key field Name of the column
    * @param {any[]} Pass the edited JSON data of record need to be update.
    * @returns {void}
    */
  def updateRecord(fieldName: String, data: js.Array[Any]): Unit = js.native
  
  /** It adapts grid to its parent element or to the browsers window.
    * @returns {void}
    */
  def windowonresize(): Unit = js.native
}
object Grid {
  
  @js.native
  sealed trait CellSelectionMode extends StObject
  @JSGlobal("ej.Grid.CellSelectionMode")
  @js.native
  object CellSelectionMode extends StObject {
    
    ///It selects range of cells as a block from start cell to the end cell.
    @js.native
    sealed trait Box
      extends StObject
         with CellSelectionMode
    
    ///It selects cells continuously from the start cell to end cell.
    @js.native
    sealed trait Flow
      extends StObject
         with CellSelectionMode
  }
  
  @js.native
  sealed trait ClipMode extends StObject
  @JSGlobal("ej.Grid.ClipMode")
  @js.native
  object ClipMode extends StObject {
    
    ///Truncate the text in the cell
    @js.native
    sealed trait Clip
      extends StObject
         with ClipMode
    
    ///Shows ellipsis for the overflown cell.
    @js.native
    sealed trait Ellipsis
      extends StObject
         with ClipMode
    
    ///Shows ellipsis and tooltip for the overflown cell.
    @js.native
    sealed trait EllipsisWithTooltip
      extends StObject
         with ClipMode
  }
  
  @js.native
  sealed trait ColumnLayout extends StObject
  @JSGlobal("ej.Grid.ColumnLayout")
  @js.native
  object ColumnLayout extends StObject {
    
    ///Column layout is auto(based on width).
    @js.native
    sealed trait Auto
      extends StObject
         with ColumnLayout
    
    ///Column layout is fixed(based on width).
    @js.native
    sealed trait Fixed
      extends StObject
         with ColumnLayout
  }
  
  @js.native
  sealed trait DragBehavior extends StObject
  @JSGlobal("ej.Grid.DragBehavior")
  @js.native
  object DragBehavior extends StObject {
    
    ///Allows to copy a record from one grid to another or within the grid.
    @js.native
    sealed trait Copy
      extends StObject
         with DragBehavior
    
    ///Allows to move a record from one grid to another or within the grid.
    @js.native
    sealed trait Move
      extends StObject
         with DragBehavior
  }
  
  @js.native
  sealed trait EditMode extends StObject
  @JSGlobal("ej.Grid.EditMode")
  @js.native
  object EditMode extends StObject {
    
    ///Edit mode is batch.
    @js.native
    sealed trait Batch
      extends StObject
         with EditMode
    
    ///Edit mode is dialog.
    @js.native
    sealed trait Dialog
      extends StObject
         with EditMode
    
    ///Edit mode is dialog template.
    @js.native
    sealed trait DialogTemplate
      extends StObject
         with EditMode
    
    ///Edit mode is external form.
    @js.native
    sealed trait ExternalForm
      extends StObject
         with EditMode
    
    ///Edit mode is external form template.
    @js.native
    sealed trait ExternalFormTemplate
      extends StObject
         with EditMode
    
    ///Edit mode is inline form.
    @js.native
    sealed trait InlineForm
      extends StObject
         with EditMode
    
    ///Edit mode is inline template form.
    @js.native
    sealed trait InlineTemplateForm
      extends StObject
         with EditMode
    
    ///Edit mode is normal.
    @js.native
    sealed trait Normal
      extends StObject
         with EditMode
  }
  
  @js.native
  sealed trait EditingType extends StObject
  @JSGlobal("ej.Grid.EditingType")
  @js.native
  object EditingType extends StObject {
    
    ///Specifies editing type as boolean edit.
    @js.native
    sealed trait Boolean
      extends StObject
         with EditingType
    
    ///Specifies editing type as datepicker.
    @js.native
    sealed trait DatePicker
      extends StObject
         with EditingType
    
    ///Specifies editing type as datetime picker.
    @js.native
    sealed trait DateTimePicker
      extends StObject
         with EditingType
    
    ///Specifies editing type as dropdown edit.
    @js.native
    sealed trait Dropdown
      extends StObject
         with EditingType
    
    ///Specifies editing type as numeric edit.
    @js.native
    sealed trait Numeric
      extends StObject
         with EditingType
    
    ///Specifies editing type as string edit.
    @js.native
    sealed trait String
      extends StObject
         with EditingType
  }
  
  @js.native
  sealed trait FilterBarMode extends StObject
  @JSGlobal("ej.Grid.FilterBarMode")
  @js.native
  object FilterBarMode extends StObject {
    
    ///Initiate filter operation on typing the filter query.
    @js.native
    sealed trait Immediate
      extends StObject
         with FilterBarMode
    
    ///Initiate filter operation after Enter key is pressed.
    @js.native
    sealed trait OnEnter
      extends StObject
         with FilterBarMode
  }
  
  @js.native
  sealed trait FilterType extends StObject
  @JSGlobal("ej.Grid.FilterType")
  @js.native
  object FilterType extends StObject {
    
    ///Specifies the filter type as excel.
    @js.native
    sealed trait Excel
      extends StObject
         with FilterType
    
    ///Specifies the filter type as menu.
    @js.native
    sealed trait Menu
      extends StObject
         with FilterType
  }
  
  @js.native
  sealed trait FormPosition extends StObject
  @JSGlobal("ej.Grid.FormPosition")
  @js.native
  object FormPosition extends StObject {
    
    ///Form position is bottomleft.
    @js.native
    sealed trait BottomLeft
      extends StObject
         with FormPosition
    
    ///Form position is topright.
    @js.native
    sealed trait TopRight
      extends StObject
         with FormPosition
  }
  
  @js.native
  sealed trait GridLines extends StObject
  @JSGlobal("ej.Grid.GridLines")
  @js.native
  object GridLines extends StObject {
    
    ///Displays both the horizontal and vertical grid lines.
    @js.native
    sealed trait Both
      extends StObject
         with GridLines
    
    ///Displays the horizontal grid lines only.
    @js.native
    sealed trait Horizontal
      extends StObject
         with GridLines
    
    ///No grid lines are displayed.
    @js.native
    sealed trait None
      extends StObject
         with GridLines
    
    ///Displays the vertical grid lines only.
    @js.native
    sealed trait Vertical
      extends StObject
         with GridLines
  }
  
  @js.native
  sealed trait PrintMode extends StObject
  @JSGlobal("ej.Grid.PrintMode")
  @js.native
  object PrintMode extends StObject {
    
    ///Prints all pages.
    @js.native
    sealed trait AllPages
      extends StObject
         with PrintMode
    
    ///Prints current page.
    @js.native
    sealed trait CurrentPage
      extends StObject
         with PrintMode
  }
  
  @js.native
  sealed trait ResizeMode extends StObject
  @JSGlobal("ej.Grid.ResizeMode")
  @js.native
  object ResizeMode extends StObject {
    
    ///New column Size will be adjusted using entire control
    @js.native
    sealed trait Control
      extends StObject
         with ResizeMode
    
    ///New column Size will be adjusted using next column.
    @js.native
    sealed trait NextColumn
      extends StObject
         with ResizeMode
    
    ///New column size will be adjusted by all other Columns
    @js.native
    sealed trait Normal
      extends StObject
         with ResizeMode
  }
  
  @js.native
  sealed trait RowPosition extends StObject
  @JSGlobal("ej.Grid.RowPosition")
  @js.native
  object RowPosition extends StObject {
    
    ///Specifies position of add new row as bottom.
    @js.native
    sealed trait Bottom
      extends StObject
         with RowPosition
    
    ///Specifies position of add new row as top.
    @js.native
    sealed trait Top
      extends StObject
         with RowPosition
  }
  
  @js.native
  sealed trait SelectionType extends StObject
  @JSGlobal("ej.Grid.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    ///Specifies the selection type as multiple.
    @js.native
    sealed trait Multiple
      extends StObject
         with SelectionType
    
    ///Specifies the selection type as single.
    @js.native
    sealed trait Single
      extends StObject
         with SelectionType
  }
  
  @js.native
  sealed trait SummaryType extends StObject
  @JSGlobal("ej.Grid.SummaryType")
  @js.native
  object SummaryType extends StObject {
    
    ///Summary type is average.
    @js.native
    sealed trait Average
      extends StObject
         with SummaryType
    
    ///Summary type is count.
    @js.native
    sealed trait Count
      extends StObject
         with SummaryType
    
    ///Summary type is custom.
    @js.native
    sealed trait Custom
      extends StObject
         with SummaryType
    
    ///Summary type is false count.
    @js.native
    sealed trait FalseCount
      extends StObject
         with SummaryType
    
    ///Summary type is maximum.
    @js.native
    sealed trait Maximum
      extends StObject
         with SummaryType
    
    ///Summary type is minimum.
    @js.native
    sealed trait Minimum
      extends StObject
         with SummaryType
    
    ///Summary type is sum.
    @js.native
    sealed trait Sum
      extends StObject
         with SummaryType
    
    ///Summary type is true count.
    @js.native
    sealed trait TrueCount
      extends StObject
         with SummaryType
  }
  
  @js.native
  sealed trait ToolBarItems extends StObject
  @JSGlobal("ej.Grid.ToolBarItems")
  @js.native
  object ToolBarItems extends StObject {
    
    ///Toolbar item is add.
    @js.native
    sealed trait Add
      extends StObject
         with ToolBarItems
    
    ///Toolbar item is cancel.
    @js.native
    sealed trait Cancel
      extends StObject
         with ToolBarItems
    
    ///Toolbar item is delete.
    @js.native
    sealed trait Delete
      extends StObject
         with ToolBarItems
    
    ///Toolbar item is edit.
    @js.native
    sealed trait Edit
      extends StObject
         with ToolBarItems
    
    ///Toolbar item is pdfExport.
    @js.native
    sealed trait PdfExport
      extends StObject
         with ToolBarItems
    
    ///Toolbar item is printGrid.
    @js.native
    sealed trait PrintGrid
      extends StObject
         with ToolBarItems
    
    ///Toolbar item is search.
    @js.native
    sealed trait Search
      extends StObject
         with ToolBarItems
    
    ///Toolbar item is update.
    @js.native
    sealed trait Update
      extends StObject
         with ToolBarItems
    
    ///Toolbar item is wordExport.
    @js.native
    sealed trait WordExport
      extends StObject
         with ToolBarItems
  }
  
  @js.native
  sealed trait UnboundType extends StObject
  @JSGlobal("ej.Grid.UnboundType")
  @js.native
  object UnboundType extends StObject {
    
    ///Unbound type is cancel.
    @js.native
    sealed trait Cancel
      extends StObject
         with UnboundType
    
    ///Unbound type is delete.
    @js.native
    sealed trait Delete
      extends StObject
         with UnboundType
    
    ///Unbound type is edit.
    @js.native
    sealed trait Edit
      extends StObject
         with UnboundType
    
    ///Unbound type is save.
    @js.native
    sealed trait Save
      extends StObject
         with UnboundType
  }
  
  @js.native
  sealed trait VirtualScrollMode extends StObject
  @JSGlobal("ej.Grid.VirtualScrollMode")
  @js.native
  object VirtualScrollMode extends StObject {
    
    ///virtual scroll mode is continuous.
    @js.native
    sealed trait Continuous
      extends StObject
         with typings.ejWebAll.ej.Grid.VirtualScrollMode
    
    ///virtual scroll mode is normal.
    @js.native
    sealed trait Normal
      extends StObject
         with typings.ejWebAll.ej.Grid.VirtualScrollMode
  }
  
  @js.native
  sealed trait WrapMode extends StObject
  @JSGlobal("ej.Grid.WrapMode")
  @js.native
  object WrapMode extends StObject {
    
    ///Auto wrap is applied for both content and header.
    @js.native
    sealed trait Both
      extends StObject
         with WrapMode
    
    ///Auto wrap is applied only for content.
    @js.native
    sealed trait Content
      extends StObject
         with WrapMode
    
    ///Auto wrap is applied only for header.
    @js.native
    sealed trait Header
      extends StObject
         with WrapMode
  }
  
  trait ActionBeginEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current grouped column field name.
      */
    var columnName: js.UndefOr[String] = js.undefined
    
    /** Returns the column sort direction.
      */
    var columnSortDirection: js.UndefOr[String] = js.undefined
    
    /** Returns type of the column like number, string and so on.
      */
    var columnType: js.UndefOr[String] = js.undefined
    
    /** Returns current filtering object.
      */
    var currentFilterObject: js.UndefOr[Any] = js.undefined
    
    /** Returns current filtering column field name.
      */
    var currentFilteringColumn: js.UndefOr[Any] = js.undefined
    
    /** Returns the current selected page number.
      */
    var currentPage: js.UndefOr[Double] = js.undefined
    
    /** Returns the record object (JSON).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the dataSource.
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Returns the end row index of that current page.
      */
    var endIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns filter details.
      */
    var filterCollection: js.UndefOr[Any] = js.undefined
    
    /** Returns the excel filter model.
      */
    var filtermodel: js.UndefOr[Any] = js.undefined
    
    /** Returns the foreign key record object (JSON).
      */
    var foreignKeyData: js.UndefOr[Any] = js.undefined
    
    /** Returns the customfilter option value.
      */
    var isCustomFilter: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the current action event type.
      */
    var originalEventType: js.UndefOr[String] = js.undefined
    
    /** Returns the previous selected page number.
      */
    var previousPage: js.UndefOr[Double] = js.undefined
    
    /** Returns primary key.
      */
    var primaryKey: js.UndefOr[String] = js.undefined
    
    /** Returns primary key value.
      */
    var primaryKeyValue: js.UndefOr[String] = js.undefined
    
    /** Returns the query manager.
      */
    var query: js.UndefOr[Any] = js.undefined
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns current edited row.
      */
    var row: js.UndefOr[Any] = js.undefined
    
    /** Returns the record object (JSON).
      */
    var rowData: js.UndefOr[Any] = js.undefined
    
    /** Returns the edited row index.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the selected row index.
      */
    var selectedRow: js.UndefOr[Double] = js.undefined
    
    /** Returns the start row index of that current page.
      */
    var startIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns selected row for delete.
      */
    var tr: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ActionBeginEventArgs {
    
    inline def apply(): ActionBeginEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionBeginEventArgs]
    }
    
    extension [Self <: ActionBeginEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
      
      inline def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
      
      inline def setColumnSortDirection(value: String): Self = StObject.set(x, "columnSortDirection", value.asInstanceOf[js.Any])
      
      inline def setColumnSortDirectionUndefined: Self = StObject.set(x, "columnSortDirection", js.undefined)
      
      inline def setColumnType(value: String): Self = StObject.set(x, "columnType", value.asInstanceOf[js.Any])
      
      inline def setColumnTypeUndefined: Self = StObject.set(x, "columnType", js.undefined)
      
      inline def setCurrentFilterObject(value: Any): Self = StObject.set(x, "currentFilterObject", value.asInstanceOf[js.Any])
      
      inline def setCurrentFilterObjectUndefined: Self = StObject.set(x, "currentFilterObject", js.undefined)
      
      inline def setCurrentFilteringColumn(value: Any): Self = StObject.set(x, "currentFilteringColumn", value.asInstanceOf[js.Any])
      
      inline def setCurrentFilteringColumnUndefined: Self = StObject.set(x, "currentFilteringColumn", js.undefined)
      
      inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
      
      inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
      
      inline def setFilterCollection(value: Any): Self = StObject.set(x, "filterCollection", value.asInstanceOf[js.Any])
      
      inline def setFilterCollectionUndefined: Self = StObject.set(x, "filterCollection", js.undefined)
      
      inline def setFiltermodel(value: Any): Self = StObject.set(x, "filtermodel", value.asInstanceOf[js.Any])
      
      inline def setFiltermodelUndefined: Self = StObject.set(x, "filtermodel", js.undefined)
      
      inline def setForeignKeyData(value: Any): Self = StObject.set(x, "foreignKeyData", value.asInstanceOf[js.Any])
      
      inline def setForeignKeyDataUndefined: Self = StObject.set(x, "foreignKeyData", js.undefined)
      
      inline def setIsCustomFilter(value: Boolean): Self = StObject.set(x, "isCustomFilter", value.asInstanceOf[js.Any])
      
      inline def setIsCustomFilterUndefined: Self = StObject.set(x, "isCustomFilter", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setOriginalEventType(value: String): Self = StObject.set(x, "originalEventType", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventTypeUndefined: Self = StObject.set(x, "originalEventType", js.undefined)
      
      inline def setPreviousPage(value: Double): Self = StObject.set(x, "previousPage", value.asInstanceOf[js.Any])
      
      inline def setPreviousPageUndefined: Self = StObject.set(x, "previousPage", js.undefined)
      
      inline def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      inline def setPrimaryKeyValue(value: String): Self = StObject.set(x, "primaryKeyValue", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyValueUndefined: Self = StObject.set(x, "primaryKeyValue", js.undefined)
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setRow(value: Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setSelectedRow(value: Double): Self = StObject.set(x, "selectedRow", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowUndefined: Self = StObject.set(x, "selectedRow", js.undefined)
      
      inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
      
      inline def setTr(value: Any): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      inline def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ActionCompleteEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current sorted column field name.
      */
    var columnName: js.UndefOr[String] = js.undefined
    
    /** Returns the column sort direction.
      */
    var columnSortDirection: js.UndefOr[String] = js.undefined
    
    /** Returns type of the column like number, string and so on.
      */
    var columnType: js.UndefOr[String] = js.undefined
    
    /** Returns current filtering object.
      */
    var currentFilterObject: js.UndefOr[Any] = js.undefined
    
    /** Returns current filtering column field name.
      */
    var currentFilteringColumn: js.UndefOr[String] = js.undefined
    
    /** Returns the current selected page number.
      */
    var currentPage: js.UndefOr[Double] = js.undefined
    
    /** Returns the record object (JSON).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the dataSource.
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Returns the end row index of that current page.
      */
    var endIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns filter details.
      */
    var filterCollection: js.UndefOr[Any] = js.undefined
    
    /** Returns the excel filter model.
      */
    var filtermodel: js.UndefOr[Any] = js.undefined
    
    /** Returns the foreign key record object (JSON).
      */
    var foreignKeyData: js.UndefOr[Any] = js.undefined
    
    /** Returns the customfilter option value.
      */
    var isCustomFilter: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns current action event type.
      */
    var originalEventType: js.UndefOr[String] = js.undefined
    
    /** Returns the previous selected page number.
      */
    var previousPage: js.UndefOr[Double] = js.undefined
    
    /** Returns primary key.
      */
    var primaryKey: js.UndefOr[String] = js.undefined
    
    /** Returns primary key value.
      */
    var primaryKeyValue: js.UndefOr[String] = js.undefined
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns current edited row.
      */
    var row: js.UndefOr[Any] = js.undefined
    
    /** Returns the record object (JSON).
      */
    var rowData: js.UndefOr[Any] = js.undefined
    
    /** Returns the edited row index.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the selectedRow index.
      */
    var selectedRow: js.UndefOr[Double] = js.undefined
    
    /** Returns the start row index of the current page.
      */
    var startIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns grid element.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns selected row for delete.
      */
    var tr: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ActionCompleteEventArgs {
    
    inline def apply(): ActionCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionCompleteEventArgs]
    }
    
    extension [Self <: ActionCompleteEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
      
      inline def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
      
      inline def setColumnSortDirection(value: String): Self = StObject.set(x, "columnSortDirection", value.asInstanceOf[js.Any])
      
      inline def setColumnSortDirectionUndefined: Self = StObject.set(x, "columnSortDirection", js.undefined)
      
      inline def setColumnType(value: String): Self = StObject.set(x, "columnType", value.asInstanceOf[js.Any])
      
      inline def setColumnTypeUndefined: Self = StObject.set(x, "columnType", js.undefined)
      
      inline def setCurrentFilterObject(value: Any): Self = StObject.set(x, "currentFilterObject", value.asInstanceOf[js.Any])
      
      inline def setCurrentFilterObjectUndefined: Self = StObject.set(x, "currentFilterObject", js.undefined)
      
      inline def setCurrentFilteringColumn(value: String): Self = StObject.set(x, "currentFilteringColumn", value.asInstanceOf[js.Any])
      
      inline def setCurrentFilteringColumnUndefined: Self = StObject.set(x, "currentFilteringColumn", js.undefined)
      
      inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
      
      inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
      
      inline def setFilterCollection(value: Any): Self = StObject.set(x, "filterCollection", value.asInstanceOf[js.Any])
      
      inline def setFilterCollectionUndefined: Self = StObject.set(x, "filterCollection", js.undefined)
      
      inline def setFiltermodel(value: Any): Self = StObject.set(x, "filtermodel", value.asInstanceOf[js.Any])
      
      inline def setFiltermodelUndefined: Self = StObject.set(x, "filtermodel", js.undefined)
      
      inline def setForeignKeyData(value: Any): Self = StObject.set(x, "foreignKeyData", value.asInstanceOf[js.Any])
      
      inline def setForeignKeyDataUndefined: Self = StObject.set(x, "foreignKeyData", js.undefined)
      
      inline def setIsCustomFilter(value: Boolean): Self = StObject.set(x, "isCustomFilter", value.asInstanceOf[js.Any])
      
      inline def setIsCustomFilterUndefined: Self = StObject.set(x, "isCustomFilter", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setOriginalEventType(value: String): Self = StObject.set(x, "originalEventType", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventTypeUndefined: Self = StObject.set(x, "originalEventType", js.undefined)
      
      inline def setPreviousPage(value: Double): Self = StObject.set(x, "previousPage", value.asInstanceOf[js.Any])
      
      inline def setPreviousPageUndefined: Self = StObject.set(x, "previousPage", js.undefined)
      
      inline def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      inline def setPrimaryKeyValue(value: String): Self = StObject.set(x, "primaryKeyValue", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyValueUndefined: Self = StObject.set(x, "primaryKeyValue", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setRow(value: Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setSelectedRow(value: Double): Self = StObject.set(x, "selectedRow", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowUndefined: Self = StObject.set(x, "selectedRow", js.undefined)
      
      inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTr(value: Any): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      inline def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ActionFailureEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current sorted column field name.
      */
    var columnName: js.UndefOr[String] = js.undefined
    
    /** Returns the column sort direction.
      */
    var columnSortDirection: js.UndefOr[String] = js.undefined
    
    /** Returns current filtering object.
      */
    var currentFilterObject: js.UndefOr[Any] = js.undefined
    
    /** Returns current filtering column field name.
      */
    var currentFilteringColumn: js.UndefOr[String] = js.undefined
    
    /** Returns the current selected page number.
      */
    var currentPage: js.UndefOr[Double] = js.undefined
    
    /** Returns the record object (JSON).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the end row index of that current page.
      */
    var endIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the error return by server.
      */
    var error: js.UndefOr[Any] = js.undefined
    
    /** Returns filter details.
      */
    var filterCollection: js.UndefOr[Any] = js.undefined
    
    /** Returns the foreign key record object (JSON).
      */
    var foreignKeyData: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns current action event type.
      */
    var originalEventType: js.UndefOr[String] = js.undefined
    
    /** Returns the previous selected page number.
      */
    var previousPage: js.UndefOr[Double] = js.undefined
    
    /** Returns primary key.
      */
    var primaryKey: js.UndefOr[String] = js.undefined
    
    /** Returns primary key value.
      */
    var primaryKeyValue: js.UndefOr[String] = js.undefined
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns current edited row.
      */
    var row: js.UndefOr[Any] = js.undefined
    
    /** Returns the record object (JSON).
      */
    var rowData: js.UndefOr[Any] = js.undefined
    
    /** Returns the edited row index.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the selectedRow index.
      */
    var selectedRow: js.UndefOr[Double] = js.undefined
    
    /** Returns the start row index of the current page.
      */
    var startIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns grid element.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns selected row for delete.
      */
    var tr: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ActionFailureEventArgs {
    
    inline def apply(): ActionFailureEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionFailureEventArgs]
    }
    
    extension [Self <: ActionFailureEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
      
      inline def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
      
      inline def setColumnSortDirection(value: String): Self = StObject.set(x, "columnSortDirection", value.asInstanceOf[js.Any])
      
      inline def setColumnSortDirectionUndefined: Self = StObject.set(x, "columnSortDirection", js.undefined)
      
      inline def setCurrentFilterObject(value: Any): Self = StObject.set(x, "currentFilterObject", value.asInstanceOf[js.Any])
      
      inline def setCurrentFilterObjectUndefined: Self = StObject.set(x, "currentFilterObject", js.undefined)
      
      inline def setCurrentFilteringColumn(value: String): Self = StObject.set(x, "currentFilteringColumn", value.asInstanceOf[js.Any])
      
      inline def setCurrentFilteringColumnUndefined: Self = StObject.set(x, "currentFilteringColumn", js.undefined)
      
      inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
      
      inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFilterCollection(value: Any): Self = StObject.set(x, "filterCollection", value.asInstanceOf[js.Any])
      
      inline def setFilterCollectionUndefined: Self = StObject.set(x, "filterCollection", js.undefined)
      
      inline def setForeignKeyData(value: Any): Self = StObject.set(x, "foreignKeyData", value.asInstanceOf[js.Any])
      
      inline def setForeignKeyDataUndefined: Self = StObject.set(x, "foreignKeyData", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setOriginalEventType(value: String): Self = StObject.set(x, "originalEventType", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventTypeUndefined: Self = StObject.set(x, "originalEventType", js.undefined)
      
      inline def setPreviousPage(value: Double): Self = StObject.set(x, "previousPage", value.asInstanceOf[js.Any])
      
      inline def setPreviousPageUndefined: Self = StObject.set(x, "previousPage", js.undefined)
      
      inline def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      inline def setPrimaryKeyValue(value: String): Self = StObject.set(x, "primaryKeyValue", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyValueUndefined: Self = StObject.set(x, "primaryKeyValue", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setRow(value: Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setSelectedRow(value: Double): Self = StObject.set(x, "selectedRow", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowUndefined: Self = StObject.set(x, "selectedRow", js.undefined)
      
      inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTr(value: Any): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      inline def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BatchAddEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the cell object.
      */
    var cell: js.UndefOr[Any] = js.undefined
    
    /** Returns the column index.
      */
    var columnIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the column object.
      */
    var columnObject: js.UndefOr[Any] = js.undefined
    
    /** Returns deleted data.
      */
    var defaultData: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the primaryKey.
      */
    var primaryKey: js.UndefOr[Any] = js.undefined
    
    /** Returns the row element.
      */
    var row: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BatchAddEventArgs {
    
    inline def apply(): BatchAddEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchAddEventArgs]
    }
    
    extension [Self <: BatchAddEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCell(value: Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      inline def setColumnObject(value: Any): Self = StObject.set(x, "columnObject", value.asInstanceOf[js.Any])
      
      inline def setColumnObjectUndefined: Self = StObject.set(x, "columnObject", js.undefined)
      
      inline def setDefaultData(value: Any): Self = StObject.set(x, "defaultData", value.asInstanceOf[js.Any])
      
      inline def setDefaultDataUndefined: Self = StObject.set(x, "defaultData", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrimaryKey(value: Any): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      inline def setRow(value: Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BatchDeleteEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the primary key.
      */
    var primaryKey: js.UndefOr[Any] = js.undefined
    
    /** Returns deleted data.
      */
    var rowData: js.UndefOr[Any] = js.undefined
    
    /** Returns the row Index.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BatchDeleteEventArgs {
    
    inline def apply(): BatchDeleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchDeleteEventArgs]
    }
    
    extension [Self <: BatchDeleteEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrimaryKey(value: Any): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeBatchAddEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the default data object.
      */
    var defaultData: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the primaryKey.
      */
    var primaryKey: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeBatchAddEventArgs {
    
    inline def apply(): BeforeBatchAddEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeBatchAddEventArgs]
    }
    
    extension [Self <: BeforeBatchAddEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setDefaultData(value: Any): Self = StObject.set(x, "defaultData", value.asInstanceOf[js.Any])
      
      inline def setDefaultDataUndefined: Self = StObject.set(x, "defaultData", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrimaryKey(value: Any): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeBatchDeleteEventArgs extends StObject {
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the primaryKey.
      */
    var primaryKey: js.UndefOr[Any] = js.undefined
    
    /** Returns the row element.
      */
    var row: js.UndefOr[Any] = js.undefined
    
    /** Returns deleted data.
      */
    var rowData: js.UndefOr[Any] = js.undefined
    
    /** Returns the row index.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeBatchDeleteEventArgs {
    
    inline def apply(): BeforeBatchDeleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeBatchDeleteEventArgs]
    }
    
    extension [Self <: BeforeBatchDeleteEventArgs](x: Self) {
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrimaryKey(value: Any): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      inline def setRow(value: Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeBatchSaveEventArgs extends StObject {
    
    /** Returns the changed record object.
      */
    var batchChanges: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeBatchSaveEventArgs {
    
    inline def apply(): BeforeBatchSaveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeBatchSaveEventArgs]
    }
    
    extension [Self <: BeforeBatchSaveEventArgs](x: Self) {
      
      inline def setBatchChanges(value: Any): Self = StObject.set(x, "batchChanges", value.asInstanceOf[js.Any])
      
      inline def setBatchChangesUndefined: Self = StObject.set(x, "batchChanges", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforePrintEventArgs extends StObject {
    
    /** Returns the Grid element.
      */
    var element: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the selected records.
      */
    var selectedRows: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforePrintEventArgs {
    
    inline def apply(): BeforePrintEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforePrintEventArgs]
    }
    
    extension [Self <: BeforePrintEventArgs](x: Self) {
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSelectedRows(value: Any): Self = StObject.set(x, "selectedRows", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowsUndefined: Self = StObject.set(x, "selectedRows", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeRowDropEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the dragged record details
      */
    var draggedRecords: js.UndefOr[Any] = js.undefined
    
    /** Returns the drop details
      */
    var dropDetails: js.UndefOr[Any] = js.undefined
    
    /** Returns the targeted row.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the targeted row index.
      */
    var targetIndex: js.UndefOr[Any] = js.undefined
  }
  object BeforeRowDropEventArgs {
    
    inline def apply(): BeforeRowDropEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeRowDropEventArgs]
    }
    
    extension [Self <: BeforeRowDropEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setDraggedRecords(value: Any): Self = StObject.set(x, "draggedRecords", value.asInstanceOf[js.Any])
      
      inline def setDraggedRecordsUndefined: Self = StObject.set(x, "draggedRecords", js.undefined)
      
      inline def setDropDetails(value: Any): Self = StObject.set(x, "dropDetails", value.asInstanceOf[js.Any])
      
      inline def setDropDetailsUndefined: Self = StObject.set(x, "dropDetails", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetIndex(value: Any): Self = StObject.set(x, "targetIndex", value.asInstanceOf[js.Any])
      
      inline def setTargetIndexUndefined: Self = StObject.set(x, "targetIndex", js.undefined)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait BeginEditEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the primary key.
      */
    var primaryKey: js.UndefOr[Any] = js.undefined
    
    /** Returns the primary key value.
      */
    var primaryKeyValue: js.UndefOr[Any] = js.undefined
    
    /** Returns the current edited row.
      */
    var row: js.UndefOr[Any] = js.undefined
    
    /** Returns the edited row index.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeginEditEventArgs {
    
    inline def apply(): BeginEditEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeginEditEventArgs]
    }
    
    extension [Self <: BeginEditEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrimaryKey(value: Any): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      inline def setPrimaryKeyValue(value: Any): Self = StObject.set(x, "primaryKeyValue", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyValueUndefined: Self = StObject.set(x, "primaryKeyValue", js.undefined)
      
      inline def setRow(value: Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CellDeselectedEventArgs extends StObject {
    
    /** Returns the deselected cell index value.
      */
    var cellIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the deselected cell element.
      */
    var currentCell: js.UndefOr[Any] = js.undefined
    
    /** Returns current record object (JSON).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns current record object (JSON).
      */
    var selectedData: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CellDeselectedEventArgs {
    
    inline def apply(): CellDeselectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellDeselectedEventArgs]
    }
    
    extension [Self <: CellDeselectedEventArgs](x: Self) {
      
      inline def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      inline def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      inline def setCurrentCell(value: Any): Self = StObject.set(x, "currentCell", value.asInstanceOf[js.Any])
      
      inline def setCurrentCellUndefined: Self = StObject.set(x, "currentCell", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSelectedData(value: Any): Self = StObject.set(x, "selectedData", value.asInstanceOf[js.Any])
      
      inline def setSelectedDataUndefined: Self = StObject.set(x, "selectedData", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CellDeselectingEventArgs extends StObject {
    
    /** Returns the deselecting cell index value.
      */
    var cellIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the deselecting cell element.
      */
    var currentCell: js.UndefOr[Any] = js.undefined
    
    /** Returns current record object (JSON).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns whether the ctrl key is pressed while deselecting cell
      */
    var isCtrlKeyPressed: js.UndefOr[Boolean] = js.undefined
    
    /** Returns whether the shift key is pressed while deselecting cell
      */
    var isShiftKeyPressed: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns current record object (JSON).
      */
    var selectedData: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CellDeselectingEventArgs {
    
    inline def apply(): CellDeselectingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellDeselectingEventArgs]
    }
    
    extension [Self <: CellDeselectingEventArgs](x: Self) {
      
      inline def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      inline def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      inline def setCurrentCell(value: Any): Self = StObject.set(x, "currentCell", value.asInstanceOf[js.Any])
      
      inline def setCurrentCellUndefined: Self = StObject.set(x, "currentCell", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setIsCtrlKeyPressed(value: Boolean): Self = StObject.set(x, "isCtrlKeyPressed", value.asInstanceOf[js.Any])
      
      inline def setIsCtrlKeyPressedUndefined: Self = StObject.set(x, "isCtrlKeyPressed", js.undefined)
      
      inline def setIsShiftKeyPressed(value: Boolean): Self = StObject.set(x, "isShiftKeyPressed", value.asInstanceOf[js.Any])
      
      inline def setIsShiftKeyPressedUndefined: Self = StObject.set(x, "isShiftKeyPressed", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSelectedData(value: Any): Self = StObject.set(x, "selectedData", value.asInstanceOf[js.Any])
      
      inline def setSelectedDataUndefined: Self = StObject.set(x, "selectedData", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CellEditEventArgs extends StObject {
    
    /** Returns the cell object.
      */
    var cell: js.UndefOr[Any] = js.undefined
    
    /** Returns the column name.
      */
    var columnName: js.UndefOr[String] = js.undefined
    
    /** Returns the column object.
      */
    var columnObject: js.UndefOr[Any] = js.undefined
    
    /** Returns isForeignKey option value.
      */
    var isForeignKey: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the previous value of the cell.
      */
    var previousValue: js.UndefOr[String] = js.undefined
    
    /** Returns the row data object.
      */
    var rowData: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Returns the validation rules.
      */
    var validationRules: js.UndefOr[Any] = js.undefined
    
    /** Returns the cell value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object CellEditEventArgs {
    
    inline def apply(): CellEditEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellEditEventArgs]
    }
    
    extension [Self <: CellEditEventArgs](x: Self) {
      
      inline def setCell(value: Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
      
      inline def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
      
      inline def setColumnObject(value: Any): Self = StObject.set(x, "columnObject", value.asInstanceOf[js.Any])
      
      inline def setColumnObjectUndefined: Self = StObject.set(x, "columnObject", js.undefined)
      
      inline def setIsForeignKey(value: Boolean): Self = StObject.set(x, "isForeignKey", value.asInstanceOf[js.Any])
      
      inline def setIsForeignKeyUndefined: Self = StObject.set(x, "isForeignKey", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPreviousValue(value: String): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
      
      inline def setPreviousValueUndefined: Self = StObject.set(x, "previousValue", js.undefined)
      
      inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValidationRules(value: Any): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
      
      inline def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CellSaveEventArgs extends StObject {
    
    /** Returns the cell object.
      */
    var cell: js.UndefOr[Any] = js.undefined
    
    /** Returns the column name.
      */
    var columnName: js.UndefOr[String] = js.undefined
    
    /** Returns the column object.
      */
    var columnObject: js.UndefOr[Any] = js.undefined
    
    /** Returns isForeignKey option value.
      */
    var isForeignKey: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the previous value of the cell.
      */
    var previousValue: js.UndefOr[String] = js.undefined
    
    /** Returns the row data object.
      */
    var rowData: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Returns the cell value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object CellSaveEventArgs {
    
    inline def apply(): CellSaveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellSaveEventArgs]
    }
    
    extension [Self <: CellSaveEventArgs](x: Self) {
      
      inline def setCell(value: Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
      
      inline def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
      
      inline def setColumnObject(value: Any): Self = StObject.set(x, "columnObject", value.asInstanceOf[js.Any])
      
      inline def setColumnObjectUndefined: Self = StObject.set(x, "columnObject", js.undefined)
      
      inline def setIsForeignKey(value: Boolean): Self = StObject.set(x, "isForeignKey", value.asInstanceOf[js.Any])
      
      inline def setIsForeignKeyUndefined: Self = StObject.set(x, "isForeignKey", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPreviousValue(value: String): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
      
      inline def setPreviousValueUndefined: Self = StObject.set(x, "previousValue", js.undefined)
      
      inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CellSelectedEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the selected cell index value.
      */
    var cellIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the selected cell element.
      */
    var currentCell: js.UndefOr[Any] = js.undefined
    
    /** Returns current record object (JSON).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the previous selected cell element.
      */
    var previousRowCell: js.UndefOr[Any] = js.undefined
    
    /** Returns the previous selected cell index value.
      */
    var previousRowCellIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns current record object (JSON).
      */
    var selectedData: js.UndefOr[Any] = js.undefined
    
    /** Returns the selected row cell index values.
      */
    var selectedRowCellIndex: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CellSelectedEventArgs {
    
    inline def apply(): CellSelectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellSelectedEventArgs]
    }
    
    extension [Self <: CellSelectedEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      inline def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      inline def setCurrentCell(value: Any): Self = StObject.set(x, "currentCell", value.asInstanceOf[js.Any])
      
      inline def setCurrentCellUndefined: Self = StObject.set(x, "currentCell", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPreviousRowCell(value: Any): Self = StObject.set(x, "previousRowCell", value.asInstanceOf[js.Any])
      
      inline def setPreviousRowCellIndex(value: Double): Self = StObject.set(x, "previousRowCellIndex", value.asInstanceOf[js.Any])
      
      inline def setPreviousRowCellIndexUndefined: Self = StObject.set(x, "previousRowCellIndex", js.undefined)
      
      inline def setPreviousRowCellUndefined: Self = StObject.set(x, "previousRowCell", js.undefined)
      
      inline def setSelectedData(value: Any): Self = StObject.set(x, "selectedData", value.asInstanceOf[js.Any])
      
      inline def setSelectedDataUndefined: Self = StObject.set(x, "selectedData", js.undefined)
      
      inline def setSelectedRowCellIndex(value: js.Array[Any]): Self = StObject.set(x, "selectedRowCellIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowCellIndexUndefined: Self = StObject.set(x, "selectedRowCellIndex", js.undefined)
      
      inline def setSelectedRowCellIndexVarargs(value: Any*): Self = StObject.set(x, "selectedRowCellIndex", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CellSelectingEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the selected cell index value.
      */
    var cellIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the selected cell element.
      */
    var currentCell: js.UndefOr[Any] = js.undefined
    
    /** Returns current record object (JSON).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns whether the ctrl key is pressed while selecting cell
      */
    var isCtrlKeyPressed: js.UndefOr[Boolean] = js.undefined
    
    /** Returns whether the shift key is pressed while selecting cell
      */
    var isShiftKeyPressed: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the previous selected cell element.
      */
    var previousRowCell: js.UndefOr[Any] = js.undefined
    
    /** Returns the previous selected cell index value.
      */
    var previousRowCellIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns current record object (JSON).
      */
    var selectedData: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CellSelectingEventArgs {
    
    inline def apply(): CellSelectingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellSelectingEventArgs]
    }
    
    extension [Self <: CellSelectingEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      inline def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      inline def setCurrentCell(value: Any): Self = StObject.set(x, "currentCell", value.asInstanceOf[js.Any])
      
      inline def setCurrentCellUndefined: Self = StObject.set(x, "currentCell", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setIsCtrlKeyPressed(value: Boolean): Self = StObject.set(x, "isCtrlKeyPressed", value.asInstanceOf[js.Any])
      
      inline def setIsCtrlKeyPressedUndefined: Self = StObject.set(x, "isCtrlKeyPressed", js.undefined)
      
      inline def setIsShiftKeyPressed(value: Boolean): Self = StObject.set(x, "isShiftKeyPressed", value.asInstanceOf[js.Any])
      
      inline def setIsShiftKeyPressedUndefined: Self = StObject.set(x, "isShiftKeyPressed", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPreviousRowCell(value: Any): Self = StObject.set(x, "previousRowCell", value.asInstanceOf[js.Any])
      
      inline def setPreviousRowCellIndex(value: Double): Self = StObject.set(x, "previousRowCellIndex", value.asInstanceOf[js.Any])
      
      inline def setPreviousRowCellIndexUndefined: Self = StObject.set(x, "previousRowCellIndex", js.undefined)
      
      inline def setPreviousRowCellUndefined: Self = StObject.set(x, "previousRowCell", js.undefined)
      
      inline def setSelectedData(value: Any): Self = StObject.set(x, "selectedData", value.asInstanceOf[js.Any])
      
      inline def setSelectedDataUndefined: Self = StObject.set(x, "selectedData", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Column extends StObject {
    
    /** Gets or sets a value that indicates whether to enable editing behavior for particular column.
      * @Default {true}
      */
    var allowEditing: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable dynamic filtering behavior for particular column.
      * @Default {true}
      */
    var allowFiltering: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable dynamic grouping behavior for particular column.
      * @Default {true}
      */
    var allowGrouping: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable dynamic resizable for particular column.
      * @Default {true}
      */
    var allowResizing: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable dynamic sorting behavior for particular column.
      * @Default {true}
      */
    var allowSorting: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the clip mode for Grid cell as ellipsis or clipped content(both header and content)
      * @Default {ej.Grid.ClipMode.Clip}
      */
    var clipMode: js.UndefOr[ClipMode | String] = js.undefined
    
    /** Gets or sets an object that indicates to define a command column in the grid.
      * @Default {[]}
      */
    var commands: js.UndefOr[js.Array[ColumnsCommand]] = js.undefined
    
    /** Gets or sets a value that indicates to provide custom CSS for an individual column.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates the attribute values to the td element of a particular column
      */
    var customAttributes: js.UndefOr[Any] = js.undefined
    
    /** Gets or sets a value that indicates to bind the external datasource to the particular column when column editType as dropdownedit and also it is used to bind the datasource to the
      * foreign key column while editing the grid. //Where data is array of JSON objects of text and value for the drop-down and array of JSON objects for foreign key column.
      * @Default {null}
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Gets or sets a value that indicates to display the specified default value while adding a new record to the grid
      */
    var defaultValue: js.UndefOr[String | Double | Boolean | js.Date] = js.undefined
    
    /** Gets or sets a value that indicates to render the grid content and header with an HTML elements
      * @Default {false}
      */
    var disableHtmlEncode: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates to display a column value as checkbox or string
      * @Default {true}
      */
    var displayAsCheckbox: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates to customize ejNumericTextbox of an editable column. See editingType
      */
    var editParams: js.UndefOr[Any] = js.undefined
    
    /** Gets or sets a template that displays a custom editor used to edit column values. See editTemplate
      * @Default {null}
      */
    var editTemplate: js.UndefOr[Any] = js.undefined
    
    /** Gets or sets a value that indicates to render the element(based on edit type) for editing the grid record. See editingType
      * @Default {ej.Grid.EditingType.String}
      */
    var editType: js.UndefOr[EditingType | String] = js.undefined
    
    /** Gets or sets a value that indicates to groups the column based on its column format.
      * @Default {false}
      */
    var enableGroupByFormat: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates to display the columns in the grid mapping with column name of the dataSource.
      */
    var field: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a template that customize the filter control from default . See filterBarTemplate
      * @Default {null}
      */
    var filterBarTemplate: js.UndefOr[Any] = js.undefined
    
    /** Gets or sets a value that indicates to render the excel or menu filter dialog to the grid columns. See filterType
      * @Default {null}
      */
    var filterType: js.UndefOr[FilterType_ | String] = js.undefined
    
    /** Gets or sets a value that indicates to define foreign key field name of the grid datasource.
      * @Default {null}
      */
    var foreignKeyField: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates to bind the field which is in foreign column datasource based on the foreignKeyField
      * @Default {null}
      */
    var foreignKeyValue: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates the format for the text applied on the column
      */
    var format: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates to add the template within the header element of the particular column.
      * @Default {null}
      */
    var headerTemplateID: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates to display the title of that particular column.
      */
    var headerText: js.UndefOr[String] = js.undefined
    
    /** This defines the text alignment of a particular column header cell value. See headerTextAlign
      * @Default {null}
      */
    var headerTextAlign: js.UndefOr[TextAlign | String] = js.undefined
    
    /** It accepts the string value and shows the tooltip for the Grid column header.
      * @Default {null}
      */
    var headerTooltip: js.UndefOr[String] = js.undefined
    
    /** You can use this property to freeze selected columns in grid at the time of scrolling.
      * @Default {false}
      */
    var isFrozen: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates the column has an identity in the database.
      * @Default {false}
      */
    var isIdentity: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates the column is act as a primary key(read-only) of the grid. The editing is performed based on the primary key column
      * @Default {false}
      */
    var isPrimaryKey: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates the order of Column that are to be hidden or visible when Grid element is in responsive mode and could not occupy all columns.
      * @Default {-1}
      */
    var priority: js.UndefOr[Double] = js.undefined
    
    /** Used to hide the particular column in column chooser by giving value as false.
      * @Default {true}
      */
    var showInColumnChooser: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enables column template for a particular column.
      * @Default {false}
      */
    var template: js.UndefOr[Boolean | String] = js.undefined
    
    /** Gets or sets a value that indicates to align the text within the column. See textAlign
      * @Default {ej.TextAlign.Left}
      */
    var textAlign: js.UndefOr[TextAlign | String] = js.undefined
    
    /** Sets the template for Tooltip in Grid Columns(both header and content)
      */
    var tooltip: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates to specify the data type of the specified columns.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates to define constraints for saving data to the database.
      */
    var validationRules: js.UndefOr[Any] = js.undefined
    
    /** Gets or sets a value that indicates whether this column is visible in the grid.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates to define the width for a particular column in the grid.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Column {
    
    inline def apply(): Column = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Column]
    }
    
    extension [Self <: Column](x: Self) {
      
      inline def setAllowEditing(value: Boolean): Self = StObject.set(x, "allowEditing", value.asInstanceOf[js.Any])
      
      inline def setAllowEditingUndefined: Self = StObject.set(x, "allowEditing", js.undefined)
      
      inline def setAllowFiltering(value: Boolean): Self = StObject.set(x, "allowFiltering", value.asInstanceOf[js.Any])
      
      inline def setAllowFilteringUndefined: Self = StObject.set(x, "allowFiltering", js.undefined)
      
      inline def setAllowGrouping(value: Boolean): Self = StObject.set(x, "allowGrouping", value.asInstanceOf[js.Any])
      
      inline def setAllowGroupingUndefined: Self = StObject.set(x, "allowGrouping", js.undefined)
      
      inline def setAllowResizing(value: Boolean): Self = StObject.set(x, "allowResizing", value.asInstanceOf[js.Any])
      
      inline def setAllowResizingUndefined: Self = StObject.set(x, "allowResizing", js.undefined)
      
      inline def setAllowSorting(value: Boolean): Self = StObject.set(x, "allowSorting", value.asInstanceOf[js.Any])
      
      inline def setAllowSortingUndefined: Self = StObject.set(x, "allowSorting", js.undefined)
      
      inline def setClipMode(value: ClipMode | String): Self = StObject.set(x, "clipMode", value.asInstanceOf[js.Any])
      
      inline def setClipModeUndefined: Self = StObject.set(x, "clipMode", js.undefined)
      
      inline def setCommands(value: js.Array[ColumnsCommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
      
      inline def setCommandsVarargs(value: ColumnsCommand*): Self = StObject.set(x, "commands", js.Array(value*))
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setCustomAttributes(value: Any): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
      
      inline def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDefaultValue(value: String | Double | Boolean | js.Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisableHtmlEncode(value: Boolean): Self = StObject.set(x, "disableHtmlEncode", value.asInstanceOf[js.Any])
      
      inline def setDisableHtmlEncodeUndefined: Self = StObject.set(x, "disableHtmlEncode", js.undefined)
      
      inline def setDisplayAsCheckbox(value: Boolean): Self = StObject.set(x, "displayAsCheckbox", value.asInstanceOf[js.Any])
      
      inline def setDisplayAsCheckboxUndefined: Self = StObject.set(x, "displayAsCheckbox", js.undefined)
      
      inline def setEditParams(value: Any): Self = StObject.set(x, "editParams", value.asInstanceOf[js.Any])
      
      inline def setEditParamsUndefined: Self = StObject.set(x, "editParams", js.undefined)
      
      inline def setEditTemplate(value: Any): Self = StObject.set(x, "editTemplate", value.asInstanceOf[js.Any])
      
      inline def setEditTemplateUndefined: Self = StObject.set(x, "editTemplate", js.undefined)
      
      inline def setEditType(value: EditingType | String): Self = StObject.set(x, "editType", value.asInstanceOf[js.Any])
      
      inline def setEditTypeUndefined: Self = StObject.set(x, "editType", js.undefined)
      
      inline def setEnableGroupByFormat(value: Boolean): Self = StObject.set(x, "enableGroupByFormat", value.asInstanceOf[js.Any])
      
      inline def setEnableGroupByFormatUndefined: Self = StObject.set(x, "enableGroupByFormat", js.undefined)
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setFilterBarTemplate(value: Any): Self = StObject.set(x, "filterBarTemplate", value.asInstanceOf[js.Any])
      
      inline def setFilterBarTemplateUndefined: Self = StObject.set(x, "filterBarTemplate", js.undefined)
      
      inline def setFilterType(value: FilterType_ | String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      inline def setForeignKeyField(value: String): Self = StObject.set(x, "foreignKeyField", value.asInstanceOf[js.Any])
      
      inline def setForeignKeyFieldUndefined: Self = StObject.set(x, "foreignKeyField", js.undefined)
      
      inline def setForeignKeyValue(value: String): Self = StObject.set(x, "foreignKeyValue", value.asInstanceOf[js.Any])
      
      inline def setForeignKeyValueUndefined: Self = StObject.set(x, "foreignKeyValue", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeaderTemplateID(value: String): Self = StObject.set(x, "headerTemplateID", value.asInstanceOf[js.Any])
      
      inline def setHeaderTemplateIDUndefined: Self = StObject.set(x, "headerTemplateID", js.undefined)
      
      inline def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      inline def setHeaderTextAlign(value: TextAlign | String): Self = StObject.set(x, "headerTextAlign", value.asInstanceOf[js.Any])
      
      inline def setHeaderTextAlignUndefined: Self = StObject.set(x, "headerTextAlign", js.undefined)
      
      inline def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
      
      inline def setHeaderTooltip(value: String): Self = StObject.set(x, "headerTooltip", value.asInstanceOf[js.Any])
      
      inline def setHeaderTooltipUndefined: Self = StObject.set(x, "headerTooltip", js.undefined)
      
      inline def setIsFrozen(value: Boolean): Self = StObject.set(x, "isFrozen", value.asInstanceOf[js.Any])
      
      inline def setIsFrozenUndefined: Self = StObject.set(x, "isFrozen", js.undefined)
      
      inline def setIsIdentity(value: Boolean): Self = StObject.set(x, "isIdentity", value.asInstanceOf[js.Any])
      
      inline def setIsIdentityUndefined: Self = StObject.set(x, "isIdentity", js.undefined)
      
      inline def setIsPrimaryKey(value: Boolean): Self = StObject.set(x, "isPrimaryKey", value.asInstanceOf[js.Any])
      
      inline def setIsPrimaryKeyUndefined: Self = StObject.set(x, "isPrimaryKey", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setShowInColumnChooser(value: Boolean): Self = StObject.set(x, "showInColumnChooser", value.asInstanceOf[js.Any])
      
      inline def setShowInColumnChooserUndefined: Self = StObject.set(x, "showInColumnChooser", js.undefined)
      
      inline def setTemplate(value: Boolean | String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTextAlign(value: TextAlign | String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValidationRules(value: Any): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
      
      inline def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ColumnDeselectedEventArgs extends StObject {
    
    /** Returns corresponding column object (JSON).
      */
    var column: js.UndefOr[Any] = js.undefined
    
    /** Returns the Deselected column index value.
      */
    var columnIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the Deselected column header element.
      */
    var headerCell: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ColumnDeselectedEventArgs {
    
    inline def apply(): ColumnDeselectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnDeselectedEventArgs]
    }
    
    extension [Self <: ColumnDeselectedEventArgs](x: Self) {
      
      inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setHeaderCell(value: Any): Self = StObject.set(x, "headerCell", value.asInstanceOf[js.Any])
      
      inline def setHeaderCellUndefined: Self = StObject.set(x, "headerCell", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ColumnDeselectingEventArgs extends StObject {
    
    /** Returns corresponding column object (JSON).
      */
    var column: js.UndefOr[Any] = js.undefined
    
    /** Returns the deselecting column index value.
      */
    var columnIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the deselecting column header element.
      */
    var headerCell: js.UndefOr[Any] = js.undefined
    
    /** Returns whether the ctrl key is pressed while deselecting column
      */
    var isCtrlKeyPressed: js.UndefOr[Boolean] = js.undefined
    
    /** Returns whether the shift key is pressed while deselecting column
      */
    var isShiftKeyPressed: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ColumnDeselectingEventArgs {
    
    inline def apply(): ColumnDeselectingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnDeselectingEventArgs]
    }
    
    extension [Self <: ColumnDeselectingEventArgs](x: Self) {
      
      inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setHeaderCell(value: Any): Self = StObject.set(x, "headerCell", value.asInstanceOf[js.Any])
      
      inline def setHeaderCellUndefined: Self = StObject.set(x, "headerCell", js.undefined)
      
      inline def setIsCtrlKeyPressed(value: Boolean): Self = StObject.set(x, "isCtrlKeyPressed", value.asInstanceOf[js.Any])
      
      inline def setIsCtrlKeyPressedUndefined: Self = StObject.set(x, "isCtrlKeyPressed", js.undefined)
      
      inline def setIsShiftKeyPressed(value: Boolean): Self = StObject.set(x, "isShiftKeyPressed", value.asInstanceOf[js.Any])
      
      inline def setIsShiftKeyPressedUndefined: Self = StObject.set(x, "isShiftKeyPressed", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ColumnDragEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the draggable column object.
      */
    var column: js.UndefOr[Any] = js.undefined
    
    /** Returns draggable element type.
      */
    var draggableType: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns target elements based on mouse move position.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ColumnDragEventArgs {
    
    inline def apply(): ColumnDragEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnDragEventArgs]
    }
    
    extension [Self <: ColumnDragEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setDraggableType(value: Any): Self = StObject.set(x, "draggableType", value.asInstanceOf[js.Any])
      
      inline def setDraggableTypeUndefined: Self = StObject.set(x, "draggableType", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ColumnDragStartEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the draggable column object.
      */
    var column: js.UndefOr[Any] = js.undefined
    
    /** Returns draggable element type.
      */
    var draggableType: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns drag start element.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ColumnDragStartEventArgs {
    
    inline def apply(): ColumnDragStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnDragStartEventArgs]
    }
    
    extension [Self <: ColumnDragStartEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setDraggableType(value: Any): Self = StObject.set(x, "draggableType", value.asInstanceOf[js.Any])
      
      inline def setDraggableTypeUndefined: Self = StObject.set(x, "draggableType", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ColumnDropEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the draggable column object.
      */
    var column: js.UndefOr[Any] = js.undefined
    
    /** Returns draggable element type.
      */
    var draggableType: js.UndefOr[String] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns dropped dragged element.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ColumnDropEventArgs {
    
    inline def apply(): ColumnDropEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnDropEventArgs]
    }
    
    extension [Self <: ColumnDropEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setDraggableType(value: String): Self = StObject.set(x, "draggableType", value.asInstanceOf[js.Any])
      
      inline def setDraggableTypeUndefined: Self = StObject.set(x, "draggableType", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ColumnSelectedEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns corresponding column object (JSON).
      */
    var column: js.UndefOr[Any] = js.undefined
    
    /** Returns the selected cell index value.
      */
    var columnIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the selected header cell element.
      */
    var headerCell: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the previous selected header cell element.
      */
    var prevColumnHeaderCell: js.UndefOr[Any] = js.undefined
    
    /** Returns the previous selected column index value.
      */
    var previousColumnIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the selected columns values.
      */
    var selectedColumnsIndex: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ColumnSelectedEventArgs {
    
    inline def apply(): ColumnSelectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnSelectedEventArgs]
    }
    
    extension [Self <: ColumnSelectedEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setHeaderCell(value: Any): Self = StObject.set(x, "headerCell", value.asInstanceOf[js.Any])
      
      inline def setHeaderCellUndefined: Self = StObject.set(x, "headerCell", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrevColumnHeaderCell(value: Any): Self = StObject.set(x, "prevColumnHeaderCell", value.asInstanceOf[js.Any])
      
      inline def setPrevColumnHeaderCellUndefined: Self = StObject.set(x, "prevColumnHeaderCell", js.undefined)
      
      inline def setPreviousColumnIndex(value: Double): Self = StObject.set(x, "previousColumnIndex", value.asInstanceOf[js.Any])
      
      inline def setPreviousColumnIndexUndefined: Self = StObject.set(x, "previousColumnIndex", js.undefined)
      
      inline def setSelectedColumnsIndex(value: js.Array[Any]): Self = StObject.set(x, "selectedColumnsIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedColumnsIndexUndefined: Self = StObject.set(x, "selectedColumnsIndex", js.undefined)
      
      inline def setSelectedColumnsIndexVarargs(value: Any*): Self = StObject.set(x, "selectedColumnsIndex", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ColumnSelectingEventArgs extends StObject {
    
    /** Returns corresponding column object (JSON).
      */
    var column: js.UndefOr[Any] = js.undefined
    
    /** Returns the selected column index value.
      */
    var columnIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the selected header cell element.
      */
    var headerCell: js.UndefOr[Any] = js.undefined
    
    /** Returns whether the ctrl key is pressed while selecting cell
      */
    var isCtrlKeyPressed: js.UndefOr[Boolean] = js.undefined
    
    /** Returns whether the shift key is pressed while selecting cell
      */
    var isShiftKeyPressed: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the previous selected header cell element.
      */
    var prevColumnHeaderCell: js.UndefOr[Any] = js.undefined
    
    /** Returns the previous selected column index value.
      */
    var previousColumnIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ColumnSelectingEventArgs {
    
    inline def apply(): ColumnSelectingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnSelectingEventArgs]
    }
    
    extension [Self <: ColumnSelectingEventArgs](x: Self) {
      
      inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setHeaderCell(value: Any): Self = StObject.set(x, "headerCell", value.asInstanceOf[js.Any])
      
      inline def setHeaderCellUndefined: Self = StObject.set(x, "headerCell", js.undefined)
      
      inline def setIsCtrlKeyPressed(value: Boolean): Self = StObject.set(x, "isCtrlKeyPressed", value.asInstanceOf[js.Any])
      
      inline def setIsCtrlKeyPressedUndefined: Self = StObject.set(x, "isCtrlKeyPressed", js.undefined)
      
      inline def setIsShiftKeyPressed(value: Boolean): Self = StObject.set(x, "isShiftKeyPressed", value.asInstanceOf[js.Any])
      
      inline def setIsShiftKeyPressedUndefined: Self = StObject.set(x, "isShiftKeyPressed", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrevColumnHeaderCell(value: Any): Self = StObject.set(x, "prevColumnHeaderCell", value.asInstanceOf[js.Any])
      
      inline def setPrevColumnHeaderCellUndefined: Self = StObject.set(x, "prevColumnHeaderCell", js.undefined)
      
      inline def setPreviousColumnIndex(value: Double): Self = StObject.set(x, "previousColumnIndex", value.asInstanceOf[js.Any])
      
      inline def setPreviousColumnIndexUndefined: Self = StObject.set(x, "previousColumnIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ColumnsCommand extends StObject {
    
    /** Gets or sets an object that indicates to define all the button options which are available in ejButton.
      */
    var buttonOptions: js.UndefOr[Any] = js.undefined
    
    /** Gets or sets a value that indicates to add the command column button. See unboundType
      */
    var `type`: js.UndefOr[UnboundType | String] = js.undefined
  }
  object ColumnsCommand {
    
    inline def apply(): ColumnsCommand = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnsCommand]
    }
    
    extension [Self <: ColumnsCommand](x: Self) {
      
      inline def setButtonOptions(value: Any): Self = StObject.set(x, "buttonOptions", value.asInstanceOf[js.Any])
      
      inline def setButtonOptionsUndefined: Self = StObject.set(x, "buttonOptions", js.undefined)
      
      inline def setType(value: UnboundType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ContextClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current item.
      */
    var currentTarget: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the status of contextmenu item which denotes its enabled state
      */
    var status: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the target item.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ContextClickEventArgs {
    
    inline def apply(): ContextClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextClickEventArgs]
    }
    
    extension [Self <: ContextClickEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentTarget(value: Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ContextMenuSettings extends StObject {
    
    /** Gets or sets a value that indicates whether to add the default context menu actions as a context menu items If enableContextMenu is true it will show all the items related to the
      * target, if you want selected items from contextmenu you have to mention in the contextMenuItems
      * @Default {[]}
      */
    var contextMenuItems: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Gets or sets a value that indicates whether to add custom contextMenu items within the toolbar to perform any action in the grid
      * @Default {[]}
      */
    var customContextMenuItems: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Gets or sets a value that indicates whether to disable the default context menu items in the grid.
      * @Default {false}
      */
    var disableDefaultItems: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable the context menu action in the grid.
      * @Default {false}
      */
    var enableContextMenu: js.UndefOr[Boolean] = js.undefined
    
    /** Used to get or set the subMenu to the corresponding custom context menu item.
      */
    var subContextMenu: js.UndefOr[js.Array[ContextMenuSettingsSubContextMenu]] = js.undefined
  }
  object ContextMenuSettings {
    
    inline def apply(): ContextMenuSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuSettings]
    }
    
    extension [Self <: ContextMenuSettings](x: Self) {
      
      inline def setContextMenuItems(value: js.Array[Any]): Self = StObject.set(x, "contextMenuItems", value.asInstanceOf[js.Any])
      
      inline def setContextMenuItemsUndefined: Self = StObject.set(x, "contextMenuItems", js.undefined)
      
      inline def setContextMenuItemsVarargs(value: Any*): Self = StObject.set(x, "contextMenuItems", js.Array(value*))
      
      inline def setCustomContextMenuItems(value: js.Array[Any]): Self = StObject.set(x, "customContextMenuItems", value.asInstanceOf[js.Any])
      
      inline def setCustomContextMenuItemsUndefined: Self = StObject.set(x, "customContextMenuItems", js.undefined)
      
      inline def setCustomContextMenuItemsVarargs(value: Any*): Self = StObject.set(x, "customContextMenuItems", js.Array(value*))
      
      inline def setDisableDefaultItems(value: Boolean): Self = StObject.set(x, "disableDefaultItems", value.asInstanceOf[js.Any])
      
      inline def setDisableDefaultItemsUndefined: Self = StObject.set(x, "disableDefaultItems", js.undefined)
      
      inline def setEnableContextMenu(value: Boolean): Self = StObject.set(x, "enableContextMenu", value.asInstanceOf[js.Any])
      
      inline def setEnableContextMenuUndefined: Self = StObject.set(x, "enableContextMenu", js.undefined)
      
      inline def setSubContextMenu(value: js.Array[ContextMenuSettingsSubContextMenu]): Self = StObject.set(x, "subContextMenu", value.asInstanceOf[js.Any])
      
      inline def setSubContextMenuUndefined: Self = StObject.set(x, "subContextMenu", js.undefined)
      
      inline def setSubContextMenuVarargs(value: ContextMenuSettingsSubContextMenu*): Self = StObject.set(x, "subContextMenu", js.Array(value*))
    }
  }
  
  trait ContextMenuSettingsSubContextMenu extends StObject {
    
    /** Used to get or set the corresponding custom context menu item to which the submenu to be appended.
      * @Default {null}
      */
    var contextMenuItem: js.UndefOr[String] = js.undefined
    
    /** Used to get or set the sub menu items to the custom context menu item.
      * @Default {[]}
      */
    var subMenu: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Used to get or set the sub menu items to the custom context menu item using JsRender template.
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.undefined
  }
  object ContextMenuSettingsSubContextMenu {
    
    inline def apply(): ContextMenuSettingsSubContextMenu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuSettingsSubContextMenu]
    }
    
    extension [Self <: ContextMenuSettingsSubContextMenu](x: Self) {
      
      inline def setContextMenuItem(value: String): Self = StObject.set(x, "contextMenuItem", value.asInstanceOf[js.Any])
      
      inline def setContextMenuItemUndefined: Self = StObject.set(x, "contextMenuItem", js.undefined)
      
      inline def setSubMenu(value: js.Array[Any]): Self = StObject.set(x, "subMenu", value.asInstanceOf[js.Any])
      
      inline def setSubMenuUndefined: Self = StObject.set(x, "subMenu", js.undefined)
      
      inline def setSubMenuVarargs(value: Any*): Self = StObject.set(x, "subMenu", js.Array(value*))
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  trait ContextOpenEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current item.
      */
    var currentTarget: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the status of contextmenu item which denotes its enabled state
      */
    var status: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the target item.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ContextOpenEventArgs {
    
    inline def apply(): ContextOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextOpenEventArgs]
    }
    
    extension [Self <: ContextOpenEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentTarget(value: Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventArgs {
    
    inline def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    extension [Self <: CreateEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DataBoundEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DataBoundEventArgs {
    
    inline def apply(): DataBoundEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataBoundEventArgs]
    }
    
    extension [Self <: DataBoundEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    extension [Self <: DestroyEventArgs](x: Self) {
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DetailsCollapseEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns detail row element.
      */
    var detailsRow: js.UndefOr[Any] = js.undefined
    
    /** Returns the foreign key record object (JSON).
      */
    var foreignKeyData: js.UndefOr[Any] = js.undefined
    
    /** Returns master row of detail row record object (JSON).
      */
    var masterData: js.UndefOr[Any] = js.undefined
    
    /** Returns master row element.
      */
    var masterRow: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DetailsCollapseEventArgs {
    
    inline def apply(): DetailsCollapseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetailsCollapseEventArgs]
    }
    
    extension [Self <: DetailsCollapseEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setDetailsRow(value: Any): Self = StObject.set(x, "detailsRow", value.asInstanceOf[js.Any])
      
      inline def setDetailsRowUndefined: Self = StObject.set(x, "detailsRow", js.undefined)
      
      inline def setForeignKeyData(value: Any): Self = StObject.set(x, "foreignKeyData", value.asInstanceOf[js.Any])
      
      inline def setForeignKeyDataUndefined: Self = StObject.set(x, "foreignKeyData", js.undefined)
      
      inline def setMasterData(value: Any): Self = StObject.set(x, "masterData", value.asInstanceOf[js.Any])
      
      inline def setMasterDataUndefined: Self = StObject.set(x, "masterData", js.undefined)
      
      inline def setMasterRow(value: Any): Self = StObject.set(x, "masterRow", value.asInstanceOf[js.Any])
      
      inline def setMasterRowUndefined: Self = StObject.set(x, "masterRow", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DetailsDataBoundEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the details row data.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns details row element.
      */
    var detailsElement: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the details row data.
      */
    var rowData: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DetailsDataBoundEventArgs {
    
    inline def apply(): DetailsDataBoundEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetailsDataBoundEventArgs]
    }
    
    extension [Self <: DetailsDataBoundEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDetailsElement(value: Any): Self = StObject.set(x, "detailsElement", value.asInstanceOf[js.Any])
      
      inline def setDetailsElementUndefined: Self = StObject.set(x, "detailsElement", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DetailsExpandEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns detail row element.
      */
    var detailsRow: js.UndefOr[Any] = js.undefined
    
    /** Returns the foreign key record object (JSON).
      */
    var foreignKeyData: js.UndefOr[Any] = js.undefined
    
    /** Returns master row of detail row record object (JSON).
      */
    var masterData: js.UndefOr[Any] = js.undefined
    
    /** Returns master row element.
      */
    var masterRow: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DetailsExpandEventArgs {
    
    inline def apply(): DetailsExpandEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetailsExpandEventArgs]
    }
    
    extension [Self <: DetailsExpandEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setDetailsRow(value: Any): Self = StObject.set(x, "detailsRow", value.asInstanceOf[js.Any])
      
      inline def setDetailsRowUndefined: Self = StObject.set(x, "detailsRow", js.undefined)
      
      inline def setForeignKeyData(value: Any): Self = StObject.set(x, "foreignKeyData", value.asInstanceOf[js.Any])
      
      inline def setForeignKeyDataUndefined: Self = StObject.set(x, "foreignKeyData", js.undefined)
      
      inline def setMasterData(value: Any): Self = StObject.set(x, "masterData", value.asInstanceOf[js.Any])
      
      inline def setMasterDataUndefined: Self = StObject.set(x, "masterData", js.undefined)
      
      inline def setMasterRow(value: Any): Self = StObject.set(x, "masterRow", value.asInstanceOf[js.Any])
      
      inline def setMasterRowUndefined: Self = StObject.set(x, "masterRow", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait EditSettings extends StObject {
    
    /** Gets or sets a value that indicates whether to enable insert action in the editing mode.
      * @Default {false}
      */
    var allowAdding: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable the delete action in the editing mode.
      * @Default {false}
      */
    var allowDeleting: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable the editing action while double click on the record
      * @Default {true}
      */
    var allowEditOnDblClick: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable the edit action in the editing mode.
      * @Default {false}
      */
    var allowEditing: js.UndefOr[Boolean] = js.undefined
    
    /** This specifies the id of the template. This template can be used to display the data that you require to be edited using the Dialog Box
      * @Default {null}
      */
    var dialogEditorTemplateID: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates whether to define the mode of editing See editMode
      * @Default {ej.Grid.EditMode.Normal}
      */
    var editMode: js.UndefOr[EditMode | String] = js.undefined
    
    /** This specifies the id of the template. This template can be used to display the data that you require to be edited using the External edit form
      * @Default {null}
      */
    var externalFormTemplateID: js.UndefOr[String] = js.undefined
    
    /** This specifies to set the position of an External edit form either in the top-right or bottom-left of the grid. See formPosition
      * @Default {ej.Grid.FormPosition.BottomLeft}
      */
    var formPosition: js.UndefOr[FormPosition | String] = js.undefined
    
    /** This specifies the id of the template. This template can be used to display the data that you require to be edited using the Inline edit form
      * @Default {null}
      */
    var inlineFormTemplateID: js.UndefOr[String] = js.undefined
    
    /** This specifies to set the position of an adding new row either in the top or bottom of the grid. See rowPosition
      * @Default {ej.Grid.RowPosition.Top}
      */
    var rowPosition: js.UndefOr[RowPosition | String] = js.undefined
    
    /** Gets or sets a value that indicates whether to display the add new form by default in the grid.
      * @Default {false}
      */
    var showAddNewRow: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether the confirm dialog has to be shown while saving or discarding the batch changes
      * @Default {true}
      */
    var showConfirmDialog: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether the confirm dialog has to be shown while deleting record
      * @Default {false}
      */
    var showDeleteConfirmDialog: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether the title for edit form is different from the primarykey column.
      * @Default {null}
      */
    var titleColumn: js.UndefOr[String] = js.undefined
  }
  object EditSettings {
    
    inline def apply(): EditSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditSettings]
    }
    
    extension [Self <: EditSettings](x: Self) {
      
      inline def setAllowAdding(value: Boolean): Self = StObject.set(x, "allowAdding", value.asInstanceOf[js.Any])
      
      inline def setAllowAddingUndefined: Self = StObject.set(x, "allowAdding", js.undefined)
      
      inline def setAllowDeleting(value: Boolean): Self = StObject.set(x, "allowDeleting", value.asInstanceOf[js.Any])
      
      inline def setAllowDeletingUndefined: Self = StObject.set(x, "allowDeleting", js.undefined)
      
      inline def setAllowEditOnDblClick(value: Boolean): Self = StObject.set(x, "allowEditOnDblClick", value.asInstanceOf[js.Any])
      
      inline def setAllowEditOnDblClickUndefined: Self = StObject.set(x, "allowEditOnDblClick", js.undefined)
      
      inline def setAllowEditing(value: Boolean): Self = StObject.set(x, "allowEditing", value.asInstanceOf[js.Any])
      
      inline def setAllowEditingUndefined: Self = StObject.set(x, "allowEditing", js.undefined)
      
      inline def setDialogEditorTemplateID(value: String): Self = StObject.set(x, "dialogEditorTemplateID", value.asInstanceOf[js.Any])
      
      inline def setDialogEditorTemplateIDUndefined: Self = StObject.set(x, "dialogEditorTemplateID", js.undefined)
      
      inline def setEditMode(value: EditMode | String): Self = StObject.set(x, "editMode", value.asInstanceOf[js.Any])
      
      inline def setEditModeUndefined: Self = StObject.set(x, "editMode", js.undefined)
      
      inline def setExternalFormTemplateID(value: String): Self = StObject.set(x, "externalFormTemplateID", value.asInstanceOf[js.Any])
      
      inline def setExternalFormTemplateIDUndefined: Self = StObject.set(x, "externalFormTemplateID", js.undefined)
      
      inline def setFormPosition(value: FormPosition | String): Self = StObject.set(x, "formPosition", value.asInstanceOf[js.Any])
      
      inline def setFormPositionUndefined: Self = StObject.set(x, "formPosition", js.undefined)
      
      inline def setInlineFormTemplateID(value: String): Self = StObject.set(x, "inlineFormTemplateID", value.asInstanceOf[js.Any])
      
      inline def setInlineFormTemplateIDUndefined: Self = StObject.set(x, "inlineFormTemplateID", js.undefined)
      
      inline def setRowPosition(value: RowPosition | String): Self = StObject.set(x, "rowPosition", value.asInstanceOf[js.Any])
      
      inline def setRowPositionUndefined: Self = StObject.set(x, "rowPosition", js.undefined)
      
      inline def setShowAddNewRow(value: Boolean): Self = StObject.set(x, "showAddNewRow", value.asInstanceOf[js.Any])
      
      inline def setShowAddNewRowUndefined: Self = StObject.set(x, "showAddNewRow", js.undefined)
      
      inline def setShowConfirmDialog(value: Boolean): Self = StObject.set(x, "showConfirmDialog", value.asInstanceOf[js.Any])
      
      inline def setShowConfirmDialogUndefined: Self = StObject.set(x, "showConfirmDialog", js.undefined)
      
      inline def setShowDeleteConfirmDialog(value: Boolean): Self = StObject.set(x, "showDeleteConfirmDialog", value.asInstanceOf[js.Any])
      
      inline def setShowDeleteConfirmDialogUndefined: Self = StObject.set(x, "showDeleteConfirmDialog", js.undefined)
      
      inline def setTitleColumn(value: String): Self = StObject.set(x, "titleColumn", value.asInstanceOf[js.Any])
      
      inline def setTitleColumnUndefined: Self = StObject.set(x, "titleColumn", js.undefined)
    }
  }
  
  trait EndAddEventArgs extends StObject {
    
    /** Returns added data.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns added data.
      */
    var rowData: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object EndAddEventArgs {
    
    inline def apply(): EndAddEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndAddEventArgs]
    }
    
    extension [Self <: EndAddEventArgs](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait EndDeleteEventArgs extends StObject {
    
    /** Returns deleted data.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns deleted data.
      */
    var rowData: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object EndDeleteEventArgs {
    
    inline def apply(): EndDeleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndDeleteEventArgs]
    }
    
    extension [Self <: EndDeleteEventArgs](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait EndEditEventArgs extends StObject {
    
    /** Returns modified data.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns modified data.
      */
    var rowData: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object EndEditEventArgs {
    
    inline def apply(): EndEditEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndEditEventArgs]
    }
    
    extension [Self <: EndEditEventArgs](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait FilterSettings extends StObject {
    
    /** Gets or sets a value that indicates to perform the filter operation with case sensitive in excel styled filter menu mode
      * @Default {false}
      */
    var enableCaseSensitivity: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates to define the interDeterminateState of checkbox in excel filter dialog.
      * @Default {true}
      */
    var enableInterDeterminateState: js.UndefOr[Boolean] = js.undefined
    
    /** This specifies the grid to starts the filter action while typing in the filterBar or after pressing the enter key. based on the filterBarMode. See filterBarMode.
      * @Default {ej.Grid.FilterBarMode.Immediate}
      */
    var filterBarMode: js.UndefOr[FilterBarMode | String] = js.undefined
    
    /** This specifies the grid to show the filterBar or filterMenu to the grid records. See filterType
      * @Default {ej.Grid.FilterType.FilterBar}
      */
    var filterType: js.UndefOr[FilterType_ | String] = js.undefined
    
    /** Gets or sets a value that indicates whether to define the filtered columns details programmatically at initial load
      * @Default {[]}
      */
    var filteredColumns: js.UndefOr[js.Array[FilterSettingsFilteredColumn]] = js.undefined
    
    /** This specifies the grid to delay the filter action while typing in the filterBar.
      * @Default {1500}
      */
    var immediateModeDelay: js.UndefOr[Double] = js.undefined
    
    /** Gets or sets a value that indicates the maximum number of filter choices that can be showed in the excel styled filter menu.
      * @Default {1000}
      */
    var maxFilterChoices: js.UndefOr[Double] = js.undefined
    
    /** This specifies the grid to show the filter text within the grid pager itself.
      * @Default {true}
      */
    var showFilterBarStatus: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable the predicate options in the filtering menu
      * @Default {false}
      */
    var showPredicate: js.UndefOr[Boolean] = js.undefined
  }
  object FilterSettings {
    
    inline def apply(): FilterSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterSettings]
    }
    
    extension [Self <: FilterSettings](x: Self) {
      
      inline def setEnableCaseSensitivity(value: Boolean): Self = StObject.set(x, "enableCaseSensitivity", value.asInstanceOf[js.Any])
      
      inline def setEnableCaseSensitivityUndefined: Self = StObject.set(x, "enableCaseSensitivity", js.undefined)
      
      inline def setEnableInterDeterminateState(value: Boolean): Self = StObject.set(x, "enableInterDeterminateState", value.asInstanceOf[js.Any])
      
      inline def setEnableInterDeterminateStateUndefined: Self = StObject.set(x, "enableInterDeterminateState", js.undefined)
      
      inline def setFilterBarMode(value: FilterBarMode | String): Self = StObject.set(x, "filterBarMode", value.asInstanceOf[js.Any])
      
      inline def setFilterBarModeUndefined: Self = StObject.set(x, "filterBarMode", js.undefined)
      
      inline def setFilterType(value: FilterType_ | String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      inline def setFilteredColumns(value: js.Array[FilterSettingsFilteredColumn]): Self = StObject.set(x, "filteredColumns", value.asInstanceOf[js.Any])
      
      inline def setFilteredColumnsUndefined: Self = StObject.set(x, "filteredColumns", js.undefined)
      
      inline def setFilteredColumnsVarargs(value: FilterSettingsFilteredColumn*): Self = StObject.set(x, "filteredColumns", js.Array(value*))
      
      inline def setImmediateModeDelay(value: Double): Self = StObject.set(x, "immediateModeDelay", value.asInstanceOf[js.Any])
      
      inline def setImmediateModeDelayUndefined: Self = StObject.set(x, "immediateModeDelay", js.undefined)
      
      inline def setMaxFilterChoices(value: Double): Self = StObject.set(x, "maxFilterChoices", value.asInstanceOf[js.Any])
      
      inline def setMaxFilterChoicesUndefined: Self = StObject.set(x, "maxFilterChoices", js.undefined)
      
      inline def setShowFilterBarStatus(value: Boolean): Self = StObject.set(x, "showFilterBarStatus", value.asInstanceOf[js.Any])
      
      inline def setShowFilterBarStatusUndefined: Self = StObject.set(x, "showFilterBarStatus", js.undefined)
      
      inline def setShowPredicate(value: Boolean): Self = StObject.set(x, "showPredicate", value.asInstanceOf[js.Any])
      
      inline def setShowPredicateUndefined: Self = StObject.set(x, "showPredicate", js.undefined)
    }
  }
  
  trait FilterSettingsFilteredColumn extends StObject {
    
    /** Gets or sets a value that indicates whether to define the field name of the column to be filter.
      */
    var field: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates whether to define the matchCase of given value to be filter.
      */
    var matchCase: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to define the filter condition to filtered column. See operator
      */
    var operator: js.UndefOr[FilterOperators | String] = js.undefined
    
    /** Gets or sets a value that indicates whether to define the predicate as and/or.
      */
    var predicate: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates whether to define the value to be filtered in a column.
      */
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object FilterSettingsFilteredColumn {
    
    inline def apply(): FilterSettingsFilteredColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterSettingsFilteredColumn]
    }
    
    extension [Self <: FilterSettingsFilteredColumn](x: Self) {
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
      
      inline def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
      
      inline def setOperator(value: FilterOperators | String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      inline def setPredicate(value: String): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
      
      inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait GroupSettings extends StObject {
    
    /** Gets or sets a value that customize the group caption format.
      * @Default {null}
      */
    var captionFormat: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable animation button option in the group drop area of the grid.
      * @Default {false}
      */
    var enableDropAreaAutoSizing: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to add grouped columns programmatically at initial load
      * @Default {[]}
      */
    var groupedColumns: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Gets or sets a value that indicates whether to show the group drop area just above the column header. It can be used to avoid ungrouping the already grouped column using
      * groupSettings.
      * @Default {true}
      */
    var showDropArea: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to hide the grouped columns from the grid
      * @Default {false}
      */
    var showGroupedColumn: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to show the group button image(toggle button)in the column header and also in the grouped column in the group drop area . It can be
      * used to group/ungroup the columns by clicking on the toggle button.
      * @Default {false}
      */
    var showToggleButton: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable the close button in the grouped column which is in the group drop area to ungroup the grouped column
      * @Default {false}
      */
    var showUngroupButton: js.UndefOr[Boolean] = js.undefined
  }
  object GroupSettings {
    
    inline def apply(): GroupSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupSettings]
    }
    
    extension [Self <: GroupSettings](x: Self) {
      
      inline def setCaptionFormat(value: String): Self = StObject.set(x, "captionFormat", value.asInstanceOf[js.Any])
      
      inline def setCaptionFormatUndefined: Self = StObject.set(x, "captionFormat", js.undefined)
      
      inline def setEnableDropAreaAutoSizing(value: Boolean): Self = StObject.set(x, "enableDropAreaAutoSizing", value.asInstanceOf[js.Any])
      
      inline def setEnableDropAreaAutoSizingUndefined: Self = StObject.set(x, "enableDropAreaAutoSizing", js.undefined)
      
      inline def setGroupedColumns(value: js.Array[Any]): Self = StObject.set(x, "groupedColumns", value.asInstanceOf[js.Any])
      
      inline def setGroupedColumnsUndefined: Self = StObject.set(x, "groupedColumns", js.undefined)
      
      inline def setGroupedColumnsVarargs(value: Any*): Self = StObject.set(x, "groupedColumns", js.Array(value*))
      
      inline def setShowDropArea(value: Boolean): Self = StObject.set(x, "showDropArea", value.asInstanceOf[js.Any])
      
      inline def setShowDropAreaUndefined: Self = StObject.set(x, "showDropArea", js.undefined)
      
      inline def setShowGroupedColumn(value: Boolean): Self = StObject.set(x, "showGroupedColumn", value.asInstanceOf[js.Any])
      
      inline def setShowGroupedColumnUndefined: Self = StObject.set(x, "showGroupedColumn", js.undefined)
      
      inline def setShowToggleButton(value: Boolean): Self = StObject.set(x, "showToggleButton", value.asInstanceOf[js.Any])
      
      inline def setShowToggleButtonUndefined: Self = StObject.set(x, "showToggleButton", js.undefined)
      
      inline def setShowUngroupButton(value: Boolean): Self = StObject.set(x, "showUngroupButton", value.asInstanceOf[js.Any])
      
      inline def setShowUngroupButtonUndefined: Self = StObject.set(x, "showUngroupButton", js.undefined)
    }
  }
  
  trait LoadEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LoadEventArgs {
    
    inline def apply(): LoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadEventArgs]
    }
    
    extension [Self <: LoadEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MergeCellInfoEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns grid cell.
      */
    var cell: js.UndefOr[Any] = js.undefined
    
    /** Method to merge Grid columns.
      */
    var colMerge: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Returns the column object.
      */
    var column: js.UndefOr[Any] = js.undefined
    
    /** Returns current row record object (JSON).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Method to merge Grid rows and columns.
      */
    var merge: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns current row record object (JSON).
      */
    var rowData: js.UndefOr[Any] = js.undefined
    
    /** Method to merge Grid rows.
      */
    var rowMerge: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Returns the text value in the cell.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MergeCellInfoEventArgs {
    
    inline def apply(): MergeCellInfoEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeCellInfoEventArgs]
    }
    
    extension [Self <: MergeCellInfoEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCell(value: Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setColMerge(value: () => Unit): Self = StObject.set(x, "colMerge", js.Any.fromFunction0(value))
      
      inline def setColMergeUndefined: Self = StObject.set(x, "colMerge", js.undefined)
      
      inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setMerge(value: () => Unit): Self = StObject.set(x, "merge", js.Any.fromFunction0(value))
      
      inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      inline def setRowMerge(value: () => Unit): Self = StObject.set(x, "rowMerge", js.Any.fromFunction0(value))
      
      inline def setRowMergeUndefined: Self = StObject.set(x, "rowMerge", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MergeHeaderCellInfoEventArgs extends StObject {
    
    /** Returns the column headers.
      */
    var columnHeaders: js.UndefOr[Any] = js.undefined
    
    /** Method to merge the header cells.
      */
    var headerCellMerge: js.UndefOr[js.Function2[/* startIndex */ Double, /* count */ Double, Unit]] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
  }
  object MergeHeaderCellInfoEventArgs {
    
    inline def apply(): MergeHeaderCellInfoEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeHeaderCellInfoEventArgs]
    }
    
    extension [Self <: MergeHeaderCellInfoEventArgs](x: Self) {
      
      inline def setColumnHeaders(value: Any): Self = StObject.set(x, "columnHeaders", value.asInstanceOf[js.Any])
      
      inline def setColumnHeadersUndefined: Self = StObject.set(x, "columnHeaders", js.undefined)
      
      inline def setHeaderCellMerge(value: (/* startIndex */ Double, /* count */ Double) => Unit): Self = StObject.set(x, "headerCellMerge", js.Any.fromFunction2(value))
      
      inline def setHeaderCellMergeUndefined: Self = StObject.set(x, "headerCellMerge", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Triggered for every grid action before its starts.
      */
    var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.undefined
    
    /** Triggered for every grid action success event.
      */
    var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.undefined
    
    /** Triggered for every grid action server failure event.
      */
    var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.undefined
    
    /** Gets or sets a value that indicates whether to customizing cell based on our needs.
      * @Default {false}
      */
    var allowCellMerging: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable dynamic filtering behavior on grid. Filtering can be used to limit the records displayed using required criteria and this can
      * be further customized through â€œfilterSettingsâ€ property
      * @Default {false}
      */
    var allowFiltering: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable dynamic grouping behavior. Grouping can be done by drag on drop desired columns to gridâ€™s GroupDropArea. This can be
      * further customized through â€œgroupSettingsâ€ property.
      * @Default {false}
      */
    var allowGrouping: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable keyboard support for performing grid actions. selectionType â€“ Gets or sets a value that indicates whether to enable single
      * row or multiple rows selection behavior in grid. Multiple selection can be done through by holding CTRL and clicking the grid rows
      * @Default {true}
      */
    var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable multi columns sorting behavior in grid. Sort multiple columns by holding CTRL and click on the corresponding column header.
      * @Default {false}
      */
    var allowMultiSorting: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable the multiple exporting behavior on grid data.
      * @Default {false}
      */
    var allowMultipleExporting: js.UndefOr[Boolean] = js.undefined
    
    /** This specifies the grid to show the paginated data. Also enables pager control at the bottom of grid for dynamic navigation through data source. Paging can be further customized
      * through â€œpageSettingsâ€ property.
      * @Default {false}
      */
    var allowPaging: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable the columns reordering behavior in the grid. Reordering can be done through by drag and drop the particular column from one
      * index to another index within the grid.
      * @Default {false}
      */
    var allowReordering: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether the column is non resizable. Column width is set automatically based on the content or header text which is large.
      * @Default {false}
      */
    var allowResizeToFit: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable dynamic resizable of columns. Resize the width of the columns by simply click and move the particular column header line
      * @Default {false}
      */
    var allowResizing: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable the rows reordering in Grid and drag &amp; drop rows between multiple Grid.
      * @Default {false}
      */
    var allowRowDragAndDrop: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable the scrollbar in the grid and view the records by scroll through the grid manually
      * @Default {false}
      */
    var allowScrolling: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable dynamic searching behavior in grid. Currently search box can be enabled through â€œtoolbarSettingsâ€
      * @Default {false}
      */
    var allowSearching: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether user can select rows on grid. On enabling feature, selected row will be highlighted.
      * @Default {true}
      */
    var allowSelection: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable the dynamic sorting behavior on grid data. Sorting can be done through clicking on particular column header.
      * @Default {false}
      */
    var allowSorting: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether the Content will wrap to the next line if the content exceeds the boundary of the Column Cells.
      * @Default {false}
      */
    var allowTextWrap: js.UndefOr[Boolean] = js.undefined
    
    /** Triggered when record batch add.
      */
    var batchAdd: js.UndefOr[js.Function1[/* e */ BatchAddEventArgs, Unit]] = js.undefined
    
    /** Triggered when record batch delete.
      */
    var batchDelete: js.UndefOr[js.Function1[/* e */ BatchDeleteEventArgs, Unit]] = js.undefined
    
    /** Triggered before the batch add.
      */
    var beforeBatchAdd: js.UndefOr[js.Function1[/* e */ BeforeBatchAddEventArgs, Unit]] = js.undefined
    
    /** Triggered before the batch delete.
      */
    var beforeBatchDelete: js.UndefOr[js.Function1[/* e */ BeforeBatchDeleteEventArgs, Unit]] = js.undefined
    
    /** Triggered before the batch save.
      */
    var beforeBatchSave: js.UndefOr[js.Function1[/* e */ BeforeBatchSaveEventArgs, Unit]] = js.undefined
    
    /** Triggered before the print.
      */
    var beforePrint: js.UndefOr[js.Function1[/* e */ BeforePrintEventArgs, Unit]] = js.undefined
    
    /** Triggered before row drop in the grid
      */
    var beforeRowDrop: js.UndefOr[js.Function1[/* e */ BeforeRowDropEventArgs, Unit]] = js.undefined
    
    /** Triggered before the record is going to be edited.
      */
    var beginEdit: js.UndefOr[js.Function1[/* e */ BeginEditEventArgs, Unit]] = js.undefined
    
    /** Triggered after the cell is deselected.
      */
    var cellDeselected: js.UndefOr[js.Function1[/* e */ CellDeselectedEventArgs, Unit]] = js.undefined
    
    /** Triggered before the cell is going to be deselected.
      */
    var cellDeselecting: js.UndefOr[js.Function1[/* e */ CellDeselectingEventArgs, Unit]] = js.undefined
    
    /** Triggered when record cell edit.
      */
    var cellEdit: js.UndefOr[js.Function1[/* e */ CellEditEventArgs, Unit]] = js.undefined
    
    /** Triggered when record cell save.
      */
    var cellSave: js.UndefOr[js.Function1[/* e */ CellSaveEventArgs, Unit]] = js.undefined
    
    /** Triggered after the cell is selected.
      */
    var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, Unit]] = js.undefined
    
    /** Triggered before the cell is going to be selected.
      */
    var cellSelecting: js.UndefOr[js.Function1[/* e */ CellSelectingEventArgs, Unit]] = js.undefined
    
    /** This specifies the grid to add the grid control inside the grid row of the parent with expand/collapse options
      * @Default {null}
      */
    var childGrid: js.UndefOr[Any] = js.undefined
    
    /** Triggered after the column is deselected.
      */
    var columnDeselected: js.UndefOr[js.Function1[/* e */ ColumnDeselectedEventArgs, Unit]] = js.undefined
    
    /** Triggered before the column is going to be deselected.
      */
    var columnDeselecting: js.UndefOr[js.Function1[/* e */ ColumnDeselectingEventArgs, Unit]] = js.undefined
    
    /** Triggered when the column is being dragged.
      */
    var columnDrag: js.UndefOr[js.Function1[/* e */ ColumnDragEventArgs, Unit]] = js.undefined
    
    /** Triggered when column dragging begins.
      */
    var columnDragStart: js.UndefOr[js.Function1[/* e */ ColumnDragStartEventArgs, Unit]] = js.undefined
    
    /** Triggered when the column is dropped.
      */
    var columnDrop: js.UndefOr[js.Function1[/* e */ ColumnDropEventArgs, Unit]] = js.undefined
    
    /** Used to enable or disable static width settings for column. If the columnLayout is set as fixed, then column width will be static.
      * @Default {ej.Grid.ColumnLayout.Auto}
      */
    var columnLayout: js.UndefOr[ColumnLayout | String] = js.undefined
    
    /** Triggered after the column is selected.
      */
    var columnSelected: js.UndefOr[js.Function1[/* e */ ColumnSelectedEventArgs, Unit]] = js.undefined
    
    /** Triggered before the column is going to be selected.
      */
    var columnSelecting: js.UndefOr[js.Function1[/* e */ ColumnSelectingEventArgs, Unit]] = js.undefined
    
    /** Gets or sets an object that indicates to render the grid with specified columns
      * @Default {[]}
      */
    var columns: js.UndefOr[js.Array[Column]] = js.undefined
    
    /** Gets or sets a value that indicates to define common width for all the columns in the grid.
      */
    var commonWidth: js.UndefOr[Double] = js.undefined
    
    /** Triggered when context menu item is clicked
      */
    var contextClick: js.UndefOr[js.Function1[/* e */ ContextClickEventArgs, Unit]] = js.undefined
    
    /** Gets or sets an object that indicates whether to customize the context menu behavior of the grid.
      */
    var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.undefined
    
    /** Triggered before the context menu is opened.
      */
    var contextOpen: js.UndefOr[js.Function1[/* e */ ContextOpenEventArgs, Unit]] = js.undefined
    
    /** Triggered when the grid is rendered completely.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Gets or sets a value that indicates to render the grid with custom theme.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Triggered when the grid is bound with data during initial rendering.
      */
    var dataBound: js.UndefOr[js.Function1[/* e */ DataBoundEventArgs, Unit]] = js.undefined
    
    /** Gets or sets the data to render the grid with records
      * @Default {null}
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Triggered when grid going to destroy.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Triggered when detail template row is clicked to collapse.
      */
    var detailsCollapse: js.UndefOr[js.Function1[/* e */ DetailsCollapseEventArgs, Unit]] = js.undefined
    
    /** Triggered detail template row is initialized.
      */
    var detailsDataBound: js.UndefOr[js.Function1[/* e */ DetailsDataBoundEventArgs, Unit]] = js.undefined
    
    /** Triggered when detail template row is clicked to expand.
      */
    var detailsExpand: js.UndefOr[js.Function1[/* e */ DetailsExpandEventArgs, Unit]] = js.undefined
    
    /** Default Value:
      * @Default {null}
      */
    var detailsTemplate: js.UndefOr[String] = js.undefined
    
    /** Gets or sets an object that indicates whether to customize the editing behavior of the grid.
      */
    var editSettings: js.UndefOr[EditSettings] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable the alternative rows differentiation in the grid records based on corresponding theme.
      * @Default {true}
      */
    var enableAltRow: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable the save action in the grid through row selection
      * @Default {true}
      */
    var enableAutoSaveOnSelectionChange: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable mouse over effect on the corresponding column header cell of the grid
      * @Default {false}
      */
    var enableHeaderHover: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to persist the grid model state in page using applicable medium i.e., HTML5 localStorage or cookies
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.undefined
    
    /** Align content in the grid control from right to left by setting the property as true.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether the grid rows has to be rendered as detail view in mobile mode
      * @Default {false}
      */
    var enableResponsiveRow: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable mouse over effect on corresponding grid row.
      * @Default {true}
      */
    var enableRowHover: js.UndefOr[Boolean] = js.undefined
    
    /** It sets a value that indicates whether to enable toolbar items, when allowEditing, allowAdding and allowDeleting property set as false in the grid.
      * @Default {false}
      */
    var enableToolbarItems: js.UndefOr[Boolean] = js.undefined
    
    /** To Disable the mouse swipe property as false.
      * @Default {true}
      */
    var enableTouch: js.UndefOr[Boolean] = js.undefined
    
    /** Triggered after the record is added.
      */
    var endAdd: js.UndefOr[js.Function1[/* e */ EndAddEventArgs, Unit]] = js.undefined
    
    /** Triggered after the record is deleted.
      */
    var endDelete: js.UndefOr[js.Function1[/* e */ EndDeleteEventArgs, Unit]] = js.undefined
    
    /** Triggered after the record is edited.
      */
    var endEdit: js.UndefOr[js.Function1[/* e */ EndEditEventArgs, Unit]] = js.undefined
    
    /** Act as mapper for the excel exporting URL.
      * @Default {ExportToExcel}
      */
    var exportToExcelAction: js.UndefOr[String] = js.undefined
    
    /** Act as mapper for the PDF exporting URL.
      * @Default {ExportToPdf}
      */
    var exportToPdfAction: js.UndefOr[String] = js.undefined
    
    /** Act as mapper for the Word exporting URL.
      * @Default {ExportToWord}
      */
    var exportToWordAction: js.UndefOr[String] = js.undefined
    
    /** Gets or sets an object that indicates whether to customize the filtering behavior of the grid
      */
    var filterSettings: js.UndefOr[FilterSettings] = js.undefined
    
    /** Gets or sets a value that indicates to enable the visibility of the grid lines.
      * @Default {ej.Grid.GridLines.Both}
      */
    var gridLines: js.UndefOr[GridLines | String] = js.undefined
    
    /** Gets or sets an object that indicates whether to customize the grouping behavior of the grid.
      */
    var groupSettings: js.UndefOr[GroupSettings] = js.undefined
    
    /** Gets or sets a value that indicates whether the grid design has be to made responsive.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** This specifies to change the key in keyboard interaction to grid control
      * @Default {null}
      */
    var keySettings: js.UndefOr[Any] = js.undefined
    
    /** Triggered initial load.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
    
    /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data i.e. in a language and culture specific to
      * a particular country or region.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Triggered every time a request is made to access particular cell information, element and data.
      */
    var mergeCellInfo: js.UndefOr[js.Function1[/* e */ MergeCellInfoEventArgs, Unit]] = js.undefined
    
    /** Triggered every time a request is made to access particular header cell information, element and data.
      */
    var mergeHeaderCellInfo: js.UndefOr[js.Function1[/* e */ MergeHeaderCellInfoEventArgs, Unit]] = js.undefined
    
    /** Gets or sets a value that indicates whether to set the minimum width of the responsive grid while isResponsive property is true and enableResponsiveRow property is set as false.
      * @Default {0}
      */
    var minWidth: js.UndefOr[Double] = js.undefined
    
    /** Gets or sets an object that indicates whether to modify the pager default configuration.
      */
    var pageSettings: js.UndefOr[PageSettings] = js.undefined
    
    /** Query the dataSource from the table for Grid.
      * @Default {null}
      */
    var query: js.UndefOr[Any] = js.undefined
    
    /** Triggered every time a request is made to access particular cell information, element and data.
      */
    var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, Unit]] = js.undefined
    
    /** Triggered when record is clicked.
      */
    var recordClick: js.UndefOr[js.Function1[/* e */ RecordClickEventArgs, Unit]] = js.undefined
    
    /** Triggered when record is double clicked.
      */
    var recordDoubleClick: js.UndefOr[js.Function1[/* e */ RecordDoubleClickEventArgs, Unit]] = js.undefined
    
    /** Triggered when column resize end.
      */
    var resizeEnd: js.UndefOr[js.Function1[/* e */ ResizeEndEventArgs, Unit]] = js.undefined
    
    /** Gets or sets an object that indicates whether to modify the resizing behavior.
      */
    var resizeSettings: js.UndefOr[ResizeSettings] = js.undefined
    
    /** Triggered when column resize start.
      */
    var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, Unit]] = js.undefined
    
    /** Triggered after column resized.
      */
    var resized: js.UndefOr[js.Function1[/* e */ ResizedEventArgs, Unit]] = js.undefined
    
    /** Triggered when right clicked on grid element.
      */
    var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.undefined
    
    /** Triggered every time a request is made to access row information, element and data.
      */
    var rowDataBound: js.UndefOr[js.Function1[/* e */ RowDataBoundEventArgs, Unit]] = js.undefined
    
    /** Triggered after the row is deselected.
      */
    var rowDeselected: js.UndefOr[js.Function1[/* e */ RowDeselectedEventArgs, Unit]] = js.undefined
    
    /** Triggered before the row is going to be deselected.
      */
    var rowDeselecting: js.UndefOr[js.Function1[/* e */ RowDeselectingEventArgs, Unit]] = js.undefined
    
    /** Triggered when the row is being dragged.
      */
    var rowDrag: js.UndefOr[js.Function1[/* e */ RowDragEventArgs, Unit]] = js.undefined
    
    /** Triggered when row dragging begins.
      */
    var rowDragStart: js.UndefOr[js.Function1[/* e */ RowDragStartEventArgs, Unit]] = js.undefined
    
    /** Triggered when the row is dropped.
      */
    var rowDrop: js.UndefOr[js.Function1[/* e */ RowDropEventArgs, Unit]] = js.undefined
    
    /** Gets or sets an object that indicates whether to customize the drag and drop behavior of the grid rows
      */
    var rowDropSettings: js.UndefOr[RowDropSettings] = js.undefined
    
    /** Triggered while hover the grid row.
      */
    var rowHover: js.UndefOr[js.Function1[/* e */ RowHoverEventArgs, Unit]] = js.undefined
    
    /** Triggered after the row is selected.
      */
    var rowSelected: js.UndefOr[js.Function1[/* e */ RowSelectedEventArgs, Unit]] = js.undefined
    
    /** Triggered before the row is going to be selected.
      */
    var rowSelecting: js.UndefOr[js.Function1[/* e */ RowSelectingEventArgs, Unit]] = js.undefined
    
    /** Gets or sets a value that indicates to render the grid with template rows. The template row must be a table row. That table row must have the JavaScript render binding format
      * ({{:columnName}}) then the grid data source binds the data to the corresponding table row of the template.
      * @Default {null}
      */
    var rowTemplate: js.UndefOr[String] = js.undefined
    
    /** Gets or sets an object that indicates whether to customize the scrolling behavior of the grid.
      */
    var scrollSettings: js.UndefOr[ScrollSettings] = js.undefined
    
    /** Gets or sets an object that indicates whether to customize the searching behavior of the grid
      */
    var searchSettings: js.UndefOr[SearchSettings] = js.undefined
    
    /** Gets a value that display the array of selected records in the Grid.
      * @Default {null}
      */
    var selectedRecords: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Gets or sets a value that indicates to select the row while initializing the grid
      * @Default {-1}
      */
    var selectedRowIndex: js.UndefOr[Double] = js.undefined
    
    /** Gets or sets a value that indicates the selected rows in grid
      * @Default {[]}
      */
    var selectedRowIndices: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** This property is used to configure the selection behavior of the grid.
      */
    var selectionSettings: js.UndefOr[SelectionSettings] = js.undefined
    
    /** The row selection behavior of grid. Accepting types are &quot;single&quot; and &quot;multiple&quot;.
      * @Default {ej.Grid.SelectionType.Single}
      */
    var selectionType: js.UndefOr[SelectionType | String] = js.undefined
    
    /** Default Value:
      * @Default {false}
      */
    var showColumnChooser: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates stacked header should be shown on grid layout when the property â€œstackedHeaderRowsâ€ is set.
      * @Default {false}
      */
    var showStackedHeader: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates summary rows should be shown on grid layout when the property â€œsummaryRowsâ€ is set
      * @Default {false}
      */
    var showSummary: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to customize the sorting behavior of the grid.
      */
    var sortSettings: js.UndefOr[SortSettings] = js.undefined
    
    /** Gets or sets an object that indicates to managing the collection of stacked header rows for the grid.
      * @Default {[]}
      */
    var stackedHeaderRows: js.UndefOr[js.Array[StackedHeaderRow]] = js.undefined
    
    /** Gets or sets an object that indicates to managing the collection of summary rows for the grid.
      * @Default {[]}
      */
    var summaryRows: js.UndefOr[js.Array[SummaryRow]] = js.undefined
    
    /** Triggered when refresh the template column elements in the Grid.
      */
    var templateRefresh: js.UndefOr[js.Function1[/* e */ TemplateRefreshEventArgs, Unit]] = js.undefined
    
    /** Gets or sets an object that indicates whether to auto wrap the grid header or content or both
      */
    var textWrapSettings: js.UndefOr[TextWrapSettings] = js.undefined
    
    /** Triggered when toolbar item is clicked in grid.
      */
    var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, Unit]] = js.undefined
    
    /** Gets or sets an object that indicates whether to enable the toolbar in the grid and add toolbar items
      */
    var toolbarSettings: js.UndefOr[ToolbarSettings] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.Grid.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Grid.Model]
    }
    
    extension [Self <: typings.ejWebAll.ej.Grid.Model](x: Self) {
      
      inline def setActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = StObject.set(x, "actionBegin", js.Any.fromFunction1(value))
      
      inline def setActionBeginUndefined: Self = StObject.set(x, "actionBegin", js.undefined)
      
      inline def setActionComplete(value: /* e */ ActionCompleteEventArgs => Unit): Self = StObject.set(x, "actionComplete", js.Any.fromFunction1(value))
      
      inline def setActionCompleteUndefined: Self = StObject.set(x, "actionComplete", js.undefined)
      
      inline def setActionFailure(value: /* e */ ActionFailureEventArgs => Unit): Self = StObject.set(x, "actionFailure", js.Any.fromFunction1(value))
      
      inline def setActionFailureUndefined: Self = StObject.set(x, "actionFailure", js.undefined)
      
      inline def setAllowCellMerging(value: Boolean): Self = StObject.set(x, "allowCellMerging", value.asInstanceOf[js.Any])
      
      inline def setAllowCellMergingUndefined: Self = StObject.set(x, "allowCellMerging", js.undefined)
      
      inline def setAllowFiltering(value: Boolean): Self = StObject.set(x, "allowFiltering", value.asInstanceOf[js.Any])
      
      inline def setAllowFilteringUndefined: Self = StObject.set(x, "allowFiltering", js.undefined)
      
      inline def setAllowGrouping(value: Boolean): Self = StObject.set(x, "allowGrouping", value.asInstanceOf[js.Any])
      
      inline def setAllowGroupingUndefined: Self = StObject.set(x, "allowGrouping", js.undefined)
      
      inline def setAllowKeyboardNavigation(value: Boolean): Self = StObject.set(x, "allowKeyboardNavigation", value.asInstanceOf[js.Any])
      
      inline def setAllowKeyboardNavigationUndefined: Self = StObject.set(x, "allowKeyboardNavigation", js.undefined)
      
      inline def setAllowMultiSorting(value: Boolean): Self = StObject.set(x, "allowMultiSorting", value.asInstanceOf[js.Any])
      
      inline def setAllowMultiSortingUndefined: Self = StObject.set(x, "allowMultiSorting", js.undefined)
      
      inline def setAllowMultipleExporting(value: Boolean): Self = StObject.set(x, "allowMultipleExporting", value.asInstanceOf[js.Any])
      
      inline def setAllowMultipleExportingUndefined: Self = StObject.set(x, "allowMultipleExporting", js.undefined)
      
      inline def setAllowPaging(value: Boolean): Self = StObject.set(x, "allowPaging", value.asInstanceOf[js.Any])
      
      inline def setAllowPagingUndefined: Self = StObject.set(x, "allowPaging", js.undefined)
      
      inline def setAllowReordering(value: Boolean): Self = StObject.set(x, "allowReordering", value.asInstanceOf[js.Any])
      
      inline def setAllowReorderingUndefined: Self = StObject.set(x, "allowReordering", js.undefined)
      
      inline def setAllowResizeToFit(value: Boolean): Self = StObject.set(x, "allowResizeToFit", value.asInstanceOf[js.Any])
      
      inline def setAllowResizeToFitUndefined: Self = StObject.set(x, "allowResizeToFit", js.undefined)
      
      inline def setAllowResizing(value: Boolean): Self = StObject.set(x, "allowResizing", value.asInstanceOf[js.Any])
      
      inline def setAllowResizingUndefined: Self = StObject.set(x, "allowResizing", js.undefined)
      
      inline def setAllowRowDragAndDrop(value: Boolean): Self = StObject.set(x, "allowRowDragAndDrop", value.asInstanceOf[js.Any])
      
      inline def setAllowRowDragAndDropUndefined: Self = StObject.set(x, "allowRowDragAndDrop", js.undefined)
      
      inline def setAllowScrolling(value: Boolean): Self = StObject.set(x, "allowScrolling", value.asInstanceOf[js.Any])
      
      inline def setAllowScrollingUndefined: Self = StObject.set(x, "allowScrolling", js.undefined)
      
      inline def setAllowSearching(value: Boolean): Self = StObject.set(x, "allowSearching", value.asInstanceOf[js.Any])
      
      inline def setAllowSearchingUndefined: Self = StObject.set(x, "allowSearching", js.undefined)
      
      inline def setAllowSelection(value: Boolean): Self = StObject.set(x, "allowSelection", value.asInstanceOf[js.Any])
      
      inline def setAllowSelectionUndefined: Self = StObject.set(x, "allowSelection", js.undefined)
      
      inline def setAllowSorting(value: Boolean): Self = StObject.set(x, "allowSorting", value.asInstanceOf[js.Any])
      
      inline def setAllowSortingUndefined: Self = StObject.set(x, "allowSorting", js.undefined)
      
      inline def setAllowTextWrap(value: Boolean): Self = StObject.set(x, "allowTextWrap", value.asInstanceOf[js.Any])
      
      inline def setAllowTextWrapUndefined: Self = StObject.set(x, "allowTextWrap", js.undefined)
      
      inline def setBatchAdd(value: /* e */ BatchAddEventArgs => Unit): Self = StObject.set(x, "batchAdd", js.Any.fromFunction1(value))
      
      inline def setBatchAddUndefined: Self = StObject.set(x, "batchAdd", js.undefined)
      
      inline def setBatchDelete(value: /* e */ BatchDeleteEventArgs => Unit): Self = StObject.set(x, "batchDelete", js.Any.fromFunction1(value))
      
      inline def setBatchDeleteUndefined: Self = StObject.set(x, "batchDelete", js.undefined)
      
      inline def setBeforeBatchAdd(value: /* e */ BeforeBatchAddEventArgs => Unit): Self = StObject.set(x, "beforeBatchAdd", js.Any.fromFunction1(value))
      
      inline def setBeforeBatchAddUndefined: Self = StObject.set(x, "beforeBatchAdd", js.undefined)
      
      inline def setBeforeBatchDelete(value: /* e */ BeforeBatchDeleteEventArgs => Unit): Self = StObject.set(x, "beforeBatchDelete", js.Any.fromFunction1(value))
      
      inline def setBeforeBatchDeleteUndefined: Self = StObject.set(x, "beforeBatchDelete", js.undefined)
      
      inline def setBeforeBatchSave(value: /* e */ BeforeBatchSaveEventArgs => Unit): Self = StObject.set(x, "beforeBatchSave", js.Any.fromFunction1(value))
      
      inline def setBeforeBatchSaveUndefined: Self = StObject.set(x, "beforeBatchSave", js.undefined)
      
      inline def setBeforePrint(value: /* e */ BeforePrintEventArgs => Unit): Self = StObject.set(x, "beforePrint", js.Any.fromFunction1(value))
      
      inline def setBeforePrintUndefined: Self = StObject.set(x, "beforePrint", js.undefined)
      
      inline def setBeforeRowDrop(value: /* e */ BeforeRowDropEventArgs => Unit): Self = StObject.set(x, "beforeRowDrop", js.Any.fromFunction1(value))
      
      inline def setBeforeRowDropUndefined: Self = StObject.set(x, "beforeRowDrop", js.undefined)
      
      inline def setBeginEdit(value: /* e */ BeginEditEventArgs => Unit): Self = StObject.set(x, "beginEdit", js.Any.fromFunction1(value))
      
      inline def setBeginEditUndefined: Self = StObject.set(x, "beginEdit", js.undefined)
      
      inline def setCellDeselected(value: /* e */ CellDeselectedEventArgs => Unit): Self = StObject.set(x, "cellDeselected", js.Any.fromFunction1(value))
      
      inline def setCellDeselectedUndefined: Self = StObject.set(x, "cellDeselected", js.undefined)
      
      inline def setCellDeselecting(value: /* e */ CellDeselectingEventArgs => Unit): Self = StObject.set(x, "cellDeselecting", js.Any.fromFunction1(value))
      
      inline def setCellDeselectingUndefined: Self = StObject.set(x, "cellDeselecting", js.undefined)
      
      inline def setCellEdit(value: /* e */ CellEditEventArgs => Unit): Self = StObject.set(x, "cellEdit", js.Any.fromFunction1(value))
      
      inline def setCellEditUndefined: Self = StObject.set(x, "cellEdit", js.undefined)
      
      inline def setCellSave(value: /* e */ CellSaveEventArgs => Unit): Self = StObject.set(x, "cellSave", js.Any.fromFunction1(value))
      
      inline def setCellSaveUndefined: Self = StObject.set(x, "cellSave", js.undefined)
      
      inline def setCellSelected(value: /* e */ CellSelectedEventArgs => Unit): Self = StObject.set(x, "cellSelected", js.Any.fromFunction1(value))
      
      inline def setCellSelectedUndefined: Self = StObject.set(x, "cellSelected", js.undefined)
      
      inline def setCellSelecting(value: /* e */ CellSelectingEventArgs => Unit): Self = StObject.set(x, "cellSelecting", js.Any.fromFunction1(value))
      
      inline def setCellSelectingUndefined: Self = StObject.set(x, "cellSelecting", js.undefined)
      
      inline def setChildGrid(value: Any): Self = StObject.set(x, "childGrid", value.asInstanceOf[js.Any])
      
      inline def setChildGridUndefined: Self = StObject.set(x, "childGrid", js.undefined)
      
      inline def setColumnDeselected(value: /* e */ ColumnDeselectedEventArgs => Unit): Self = StObject.set(x, "columnDeselected", js.Any.fromFunction1(value))
      
      inline def setColumnDeselectedUndefined: Self = StObject.set(x, "columnDeselected", js.undefined)
      
      inline def setColumnDeselecting(value: /* e */ ColumnDeselectingEventArgs => Unit): Self = StObject.set(x, "columnDeselecting", js.Any.fromFunction1(value))
      
      inline def setColumnDeselectingUndefined: Self = StObject.set(x, "columnDeselecting", js.undefined)
      
      inline def setColumnDrag(value: /* e */ ColumnDragEventArgs => Unit): Self = StObject.set(x, "columnDrag", js.Any.fromFunction1(value))
      
      inline def setColumnDragStart(value: /* e */ ColumnDragStartEventArgs => Unit): Self = StObject.set(x, "columnDragStart", js.Any.fromFunction1(value))
      
      inline def setColumnDragStartUndefined: Self = StObject.set(x, "columnDragStart", js.undefined)
      
      inline def setColumnDragUndefined: Self = StObject.set(x, "columnDrag", js.undefined)
      
      inline def setColumnDrop(value: /* e */ ColumnDropEventArgs => Unit): Self = StObject.set(x, "columnDrop", js.Any.fromFunction1(value))
      
      inline def setColumnDropUndefined: Self = StObject.set(x, "columnDrop", js.undefined)
      
      inline def setColumnLayout(value: ColumnLayout | String): Self = StObject.set(x, "columnLayout", value.asInstanceOf[js.Any])
      
      inline def setColumnLayoutUndefined: Self = StObject.set(x, "columnLayout", js.undefined)
      
      inline def setColumnSelected(value: /* e */ ColumnSelectedEventArgs => Unit): Self = StObject.set(x, "columnSelected", js.Any.fromFunction1(value))
      
      inline def setColumnSelectedUndefined: Self = StObject.set(x, "columnSelected", js.undefined)
      
      inline def setColumnSelecting(value: /* e */ ColumnSelectingEventArgs => Unit): Self = StObject.set(x, "columnSelecting", js.Any.fromFunction1(value))
      
      inline def setColumnSelectingUndefined: Self = StObject.set(x, "columnSelecting", js.undefined)
      
      inline def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setCommonWidth(value: Double): Self = StObject.set(x, "commonWidth", value.asInstanceOf[js.Any])
      
      inline def setCommonWidthUndefined: Self = StObject.set(x, "commonWidth", js.undefined)
      
      inline def setContextClick(value: /* e */ ContextClickEventArgs => Unit): Self = StObject.set(x, "contextClick", js.Any.fromFunction1(value))
      
      inline def setContextClickUndefined: Self = StObject.set(x, "contextClick", js.undefined)
      
      inline def setContextMenuSettings(value: ContextMenuSettings): Self = StObject.set(x, "contextMenuSettings", value.asInstanceOf[js.Any])
      
      inline def setContextMenuSettingsUndefined: Self = StObject.set(x, "contextMenuSettings", js.undefined)
      
      inline def setContextOpen(value: /* e */ ContextOpenEventArgs => Unit): Self = StObject.set(x, "contextOpen", js.Any.fromFunction1(value))
      
      inline def setContextOpenUndefined: Self = StObject.set(x, "contextOpen", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDataBound(value: /* e */ DataBoundEventArgs => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
      
      inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setDetailsCollapse(value: /* e */ DetailsCollapseEventArgs => Unit): Self = StObject.set(x, "detailsCollapse", js.Any.fromFunction1(value))
      
      inline def setDetailsCollapseUndefined: Self = StObject.set(x, "detailsCollapse", js.undefined)
      
      inline def setDetailsDataBound(value: /* e */ DetailsDataBoundEventArgs => Unit): Self = StObject.set(x, "detailsDataBound", js.Any.fromFunction1(value))
      
      inline def setDetailsDataBoundUndefined: Self = StObject.set(x, "detailsDataBound", js.undefined)
      
      inline def setDetailsExpand(value: /* e */ DetailsExpandEventArgs => Unit): Self = StObject.set(x, "detailsExpand", js.Any.fromFunction1(value))
      
      inline def setDetailsExpandUndefined: Self = StObject.set(x, "detailsExpand", js.undefined)
      
      inline def setDetailsTemplate(value: String): Self = StObject.set(x, "detailsTemplate", value.asInstanceOf[js.Any])
      
      inline def setDetailsTemplateUndefined: Self = StObject.set(x, "detailsTemplate", js.undefined)
      
      inline def setEditSettings(value: EditSettings): Self = StObject.set(x, "editSettings", value.asInstanceOf[js.Any])
      
      inline def setEditSettingsUndefined: Self = StObject.set(x, "editSettings", js.undefined)
      
      inline def setEnableAltRow(value: Boolean): Self = StObject.set(x, "enableAltRow", value.asInstanceOf[js.Any])
      
      inline def setEnableAltRowUndefined: Self = StObject.set(x, "enableAltRow", js.undefined)
      
      inline def setEnableAutoSaveOnSelectionChange(value: Boolean): Self = StObject.set(x, "enableAutoSaveOnSelectionChange", value.asInstanceOf[js.Any])
      
      inline def setEnableAutoSaveOnSelectionChangeUndefined: Self = StObject.set(x, "enableAutoSaveOnSelectionChange", js.undefined)
      
      inline def setEnableHeaderHover(value: Boolean): Self = StObject.set(x, "enableHeaderHover", value.asInstanceOf[js.Any])
      
      inline def setEnableHeaderHoverUndefined: Self = StObject.set(x, "enableHeaderHover", js.undefined)
      
      inline def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      inline def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnableResponsiveRow(value: Boolean): Self = StObject.set(x, "enableResponsiveRow", value.asInstanceOf[js.Any])
      
      inline def setEnableResponsiveRowUndefined: Self = StObject.set(x, "enableResponsiveRow", js.undefined)
      
      inline def setEnableRowHover(value: Boolean): Self = StObject.set(x, "enableRowHover", value.asInstanceOf[js.Any])
      
      inline def setEnableRowHoverUndefined: Self = StObject.set(x, "enableRowHover", js.undefined)
      
      inline def setEnableToolbarItems(value: Boolean): Self = StObject.set(x, "enableToolbarItems", value.asInstanceOf[js.Any])
      
      inline def setEnableToolbarItemsUndefined: Self = StObject.set(x, "enableToolbarItems", js.undefined)
      
      inline def setEnableTouch(value: Boolean): Self = StObject.set(x, "enableTouch", value.asInstanceOf[js.Any])
      
      inline def setEnableTouchUndefined: Self = StObject.set(x, "enableTouch", js.undefined)
      
      inline def setEndAdd(value: /* e */ EndAddEventArgs => Unit): Self = StObject.set(x, "endAdd", js.Any.fromFunction1(value))
      
      inline def setEndAddUndefined: Self = StObject.set(x, "endAdd", js.undefined)
      
      inline def setEndDelete(value: /* e */ EndDeleteEventArgs => Unit): Self = StObject.set(x, "endDelete", js.Any.fromFunction1(value))
      
      inline def setEndDeleteUndefined: Self = StObject.set(x, "endDelete", js.undefined)
      
      inline def setEndEdit(value: /* e */ EndEditEventArgs => Unit): Self = StObject.set(x, "endEdit", js.Any.fromFunction1(value))
      
      inline def setEndEditUndefined: Self = StObject.set(x, "endEdit", js.undefined)
      
      inline def setExportToExcelAction(value: String): Self = StObject.set(x, "exportToExcelAction", value.asInstanceOf[js.Any])
      
      inline def setExportToExcelActionUndefined: Self = StObject.set(x, "exportToExcelAction", js.undefined)
      
      inline def setExportToPdfAction(value: String): Self = StObject.set(x, "exportToPdfAction", value.asInstanceOf[js.Any])
      
      inline def setExportToPdfActionUndefined: Self = StObject.set(x, "exportToPdfAction", js.undefined)
      
      inline def setExportToWordAction(value: String): Self = StObject.set(x, "exportToWordAction", value.asInstanceOf[js.Any])
      
      inline def setExportToWordActionUndefined: Self = StObject.set(x, "exportToWordAction", js.undefined)
      
      inline def setFilterSettings(value: FilterSettings): Self = StObject.set(x, "filterSettings", value.asInstanceOf[js.Any])
      
      inline def setFilterSettingsUndefined: Self = StObject.set(x, "filterSettings", js.undefined)
      
      inline def setGridLines(value: GridLines | String): Self = StObject.set(x, "gridLines", value.asInstanceOf[js.Any])
      
      inline def setGridLinesUndefined: Self = StObject.set(x, "gridLines", js.undefined)
      
      inline def setGroupSettings(value: GroupSettings): Self = StObject.set(x, "groupSettings", value.asInstanceOf[js.Any])
      
      inline def setGroupSettingsUndefined: Self = StObject.set(x, "groupSettings", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setKeySettings(value: Any): Self = StObject.set(x, "keySettings", value.asInstanceOf[js.Any])
      
      inline def setKeySettingsUndefined: Self = StObject.set(x, "keySettings", js.undefined)
      
      inline def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMergeCellInfo(value: /* e */ MergeCellInfoEventArgs => Unit): Self = StObject.set(x, "mergeCellInfo", js.Any.fromFunction1(value))
      
      inline def setMergeCellInfoUndefined: Self = StObject.set(x, "mergeCellInfo", js.undefined)
      
      inline def setMergeHeaderCellInfo(value: /* e */ MergeHeaderCellInfoEventArgs => Unit): Self = StObject.set(x, "mergeHeaderCellInfo", js.Any.fromFunction1(value))
      
      inline def setMergeHeaderCellInfoUndefined: Self = StObject.set(x, "mergeHeaderCellInfo", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setPageSettings(value: PageSettings): Self = StObject.set(x, "pageSettings", value.asInstanceOf[js.Any])
      
      inline def setPageSettingsUndefined: Self = StObject.set(x, "pageSettings", js.undefined)
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryCellInfo(value: /* e */ QueryCellInfoEventArgs => Unit): Self = StObject.set(x, "queryCellInfo", js.Any.fromFunction1(value))
      
      inline def setQueryCellInfoUndefined: Self = StObject.set(x, "queryCellInfo", js.undefined)
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRecordClick(value: /* e */ RecordClickEventArgs => Unit): Self = StObject.set(x, "recordClick", js.Any.fromFunction1(value))
      
      inline def setRecordClickUndefined: Self = StObject.set(x, "recordClick", js.undefined)
      
      inline def setRecordDoubleClick(value: /* e */ RecordDoubleClickEventArgs => Unit): Self = StObject.set(x, "recordDoubleClick", js.Any.fromFunction1(value))
      
      inline def setRecordDoubleClickUndefined: Self = StObject.set(x, "recordDoubleClick", js.undefined)
      
      inline def setResizeEnd(value: /* e */ ResizeEndEventArgs => Unit): Self = StObject.set(x, "resizeEnd", js.Any.fromFunction1(value))
      
      inline def setResizeEndUndefined: Self = StObject.set(x, "resizeEnd", js.undefined)
      
      inline def setResizeSettings(value: ResizeSettings): Self = StObject.set(x, "resizeSettings", value.asInstanceOf[js.Any])
      
      inline def setResizeSettingsUndefined: Self = StObject.set(x, "resizeSettings", js.undefined)
      
      inline def setResizeStart(value: /* e */ ResizeStartEventArgs => Unit): Self = StObject.set(x, "resizeStart", js.Any.fromFunction1(value))
      
      inline def setResizeStartUndefined: Self = StObject.set(x, "resizeStart", js.undefined)
      
      inline def setResized(value: /* e */ ResizedEventArgs => Unit): Self = StObject.set(x, "resized", js.Any.fromFunction1(value))
      
      inline def setResizedUndefined: Self = StObject.set(x, "resized", js.undefined)
      
      inline def setRightClick(value: /* e */ RightClickEventArgs => Unit): Self = StObject.set(x, "rightClick", js.Any.fromFunction1(value))
      
      inline def setRightClickUndefined: Self = StObject.set(x, "rightClick", js.undefined)
      
      inline def setRowDataBound(value: /* e */ RowDataBoundEventArgs => Unit): Self = StObject.set(x, "rowDataBound", js.Any.fromFunction1(value))
      
      inline def setRowDataBoundUndefined: Self = StObject.set(x, "rowDataBound", js.undefined)
      
      inline def setRowDeselected(value: /* e */ RowDeselectedEventArgs => Unit): Self = StObject.set(x, "rowDeselected", js.Any.fromFunction1(value))
      
      inline def setRowDeselectedUndefined: Self = StObject.set(x, "rowDeselected", js.undefined)
      
      inline def setRowDeselecting(value: /* e */ RowDeselectingEventArgs => Unit): Self = StObject.set(x, "rowDeselecting", js.Any.fromFunction1(value))
      
      inline def setRowDeselectingUndefined: Self = StObject.set(x, "rowDeselecting", js.undefined)
      
      inline def setRowDrag(value: /* e */ RowDragEventArgs => Unit): Self = StObject.set(x, "rowDrag", js.Any.fromFunction1(value))
      
      inline def setRowDragStart(value: /* e */ RowDragStartEventArgs => Unit): Self = StObject.set(x, "rowDragStart", js.Any.fromFunction1(value))
      
      inline def setRowDragStartUndefined: Self = StObject.set(x, "rowDragStart", js.undefined)
      
      inline def setRowDragUndefined: Self = StObject.set(x, "rowDrag", js.undefined)
      
      inline def setRowDrop(value: /* e */ RowDropEventArgs => Unit): Self = StObject.set(x, "rowDrop", js.Any.fromFunction1(value))
      
      inline def setRowDropSettings(value: RowDropSettings): Self = StObject.set(x, "rowDropSettings", value.asInstanceOf[js.Any])
      
      inline def setRowDropSettingsUndefined: Self = StObject.set(x, "rowDropSettings", js.undefined)
      
      inline def setRowDropUndefined: Self = StObject.set(x, "rowDrop", js.undefined)
      
      inline def setRowHover(value: /* e */ RowHoverEventArgs => Unit): Self = StObject.set(x, "rowHover", js.Any.fromFunction1(value))
      
      inline def setRowHoverUndefined: Self = StObject.set(x, "rowHover", js.undefined)
      
      inline def setRowSelected(value: /* e */ RowSelectedEventArgs => Unit): Self = StObject.set(x, "rowSelected", js.Any.fromFunction1(value))
      
      inline def setRowSelectedUndefined: Self = StObject.set(x, "rowSelected", js.undefined)
      
      inline def setRowSelecting(value: /* e */ RowSelectingEventArgs => Unit): Self = StObject.set(x, "rowSelecting", js.Any.fromFunction1(value))
      
      inline def setRowSelectingUndefined: Self = StObject.set(x, "rowSelecting", js.undefined)
      
      inline def setRowTemplate(value: String): Self = StObject.set(x, "rowTemplate", value.asInstanceOf[js.Any])
      
      inline def setRowTemplateUndefined: Self = StObject.set(x, "rowTemplate", js.undefined)
      
      inline def setScrollSettings(value: ScrollSettings): Self = StObject.set(x, "scrollSettings", value.asInstanceOf[js.Any])
      
      inline def setScrollSettingsUndefined: Self = StObject.set(x, "scrollSettings", js.undefined)
      
      inline def setSearchSettings(value: SearchSettings): Self = StObject.set(x, "searchSettings", value.asInstanceOf[js.Any])
      
      inline def setSearchSettingsUndefined: Self = StObject.set(x, "searchSettings", js.undefined)
      
      inline def setSelectedRecords(value: js.Array[Any]): Self = StObject.set(x, "selectedRecords", value.asInstanceOf[js.Any])
      
      inline def setSelectedRecordsUndefined: Self = StObject.set(x, "selectedRecords", js.undefined)
      
      inline def setSelectedRecordsVarargs(value: Any*): Self = StObject.set(x, "selectedRecords", js.Array(value*))
      
      inline def setSelectedRowIndex(value: Double): Self = StObject.set(x, "selectedRowIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowIndexUndefined: Self = StObject.set(x, "selectedRowIndex", js.undefined)
      
      inline def setSelectedRowIndices(value: js.Array[Any]): Self = StObject.set(x, "selectedRowIndices", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowIndicesUndefined: Self = StObject.set(x, "selectedRowIndices", js.undefined)
      
      inline def setSelectedRowIndicesVarargs(value: Any*): Self = StObject.set(x, "selectedRowIndices", js.Array(value*))
      
      inline def setSelectionSettings(value: SelectionSettings): Self = StObject.set(x, "selectionSettings", value.asInstanceOf[js.Any])
      
      inline def setSelectionSettingsUndefined: Self = StObject.set(x, "selectionSettings", js.undefined)
      
      inline def setSelectionType(value: SelectionType | String): Self = StObject.set(x, "selectionType", value.asInstanceOf[js.Any])
      
      inline def setSelectionTypeUndefined: Self = StObject.set(x, "selectionType", js.undefined)
      
      inline def setShowColumnChooser(value: Boolean): Self = StObject.set(x, "showColumnChooser", value.asInstanceOf[js.Any])
      
      inline def setShowColumnChooserUndefined: Self = StObject.set(x, "showColumnChooser", js.undefined)
      
      inline def setShowStackedHeader(value: Boolean): Self = StObject.set(x, "showStackedHeader", value.asInstanceOf[js.Any])
      
      inline def setShowStackedHeaderUndefined: Self = StObject.set(x, "showStackedHeader", js.undefined)
      
      inline def setShowSummary(value: Boolean): Self = StObject.set(x, "showSummary", value.asInstanceOf[js.Any])
      
      inline def setShowSummaryUndefined: Self = StObject.set(x, "showSummary", js.undefined)
      
      inline def setSortSettings(value: SortSettings): Self = StObject.set(x, "sortSettings", value.asInstanceOf[js.Any])
      
      inline def setSortSettingsUndefined: Self = StObject.set(x, "sortSettings", js.undefined)
      
      inline def setStackedHeaderRows(value: js.Array[StackedHeaderRow]): Self = StObject.set(x, "stackedHeaderRows", value.asInstanceOf[js.Any])
      
      inline def setStackedHeaderRowsUndefined: Self = StObject.set(x, "stackedHeaderRows", js.undefined)
      
      inline def setStackedHeaderRowsVarargs(value: StackedHeaderRow*): Self = StObject.set(x, "stackedHeaderRows", js.Array(value*))
      
      inline def setSummaryRows(value: js.Array[SummaryRow]): Self = StObject.set(x, "summaryRows", value.asInstanceOf[js.Any])
      
      inline def setSummaryRowsUndefined: Self = StObject.set(x, "summaryRows", js.undefined)
      
      inline def setSummaryRowsVarargs(value: SummaryRow*): Self = StObject.set(x, "summaryRows", js.Array(value*))
      
      inline def setTemplateRefresh(value: /* e */ TemplateRefreshEventArgs => Unit): Self = StObject.set(x, "templateRefresh", js.Any.fromFunction1(value))
      
      inline def setTemplateRefreshUndefined: Self = StObject.set(x, "templateRefresh", js.undefined)
      
      inline def setTextWrapSettings(value: TextWrapSettings): Self = StObject.set(x, "textWrapSettings", value.asInstanceOf[js.Any])
      
      inline def setTextWrapSettingsUndefined: Self = StObject.set(x, "textWrapSettings", js.undefined)
      
      inline def setToolbarClick(value: /* e */ ToolbarClickEventArgs => Unit): Self = StObject.set(x, "toolbarClick", js.Any.fromFunction1(value))
      
      inline def setToolbarClickUndefined: Self = StObject.set(x, "toolbarClick", js.undefined)
      
      inline def setToolbarSettings(value: ToolbarSettings): Self = StObject.set(x, "toolbarSettings", value.asInstanceOf[js.Any])
      
      inline def setToolbarSettingsUndefined: Self = StObject.set(x, "toolbarSettings", js.undefined)
    }
  }
  
  trait PageSettings extends StObject {
    
    /** Gets or sets a value that indicates whether to define which page to display currently in the grid
      * @Default {1}
      */
    var currentPage: js.UndefOr[Double] = js.undefined
    
    /** Gets or sets a value that indicates whether to pass the current page information as a query string along with the URL while navigating to other page.
      * @Default {false}
      */
    var enableQueryString: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enables pager template for the grid.
      * @Default {false}
      */
    var enableTemplates: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to define the number of pages displayed in the pager for navigation
      * @Default {8}
      */
    var pageCount: js.UndefOr[Double] = js.undefined
    
    /** Gets or sets a value that indicates whether to define the number of records displayed per page
      * @Default {12}
      */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** Gets or sets different page size values to the Dropdown in Grid Pager, by which number of records in a page can be changed dynamically.
      * @Default {[]}
      */
    var pageSizeList: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Gets or sets a value that indicates whether to define the number of pages to print. See printMode.
      * @Default {ej.Grid.PrintMode.AllPages}
      */
    var printMode: js.UndefOr[PrintMode | String] = js.undefined
    
    /** Gets or sets a value that indicates whether to enables default pager for the grid.
      * @Default {false}
      */
    var showDefaults: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates to add the template as a pager template for grid.
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** Get the value of total number of pages in the grid. The totalPages value is calculated based on page size and total records of grid
      * @Default {null}
      */
    var totalPages: js.UndefOr[Double] = js.undefined
    
    /** Get the value of total number of records which is bound to the grid. The totalRecordsCount value is calculated based on dataSource bound to the grid.
      * @Default {null}
      */
    var totalRecordsCount: js.UndefOr[Double] = js.undefined
  }
  object PageSettings {
    
    inline def apply(): PageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageSettings]
    }
    
    extension [Self <: PageSettings](x: Self) {
      
      inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      inline def setEnableQueryString(value: Boolean): Self = StObject.set(x, "enableQueryString", value.asInstanceOf[js.Any])
      
      inline def setEnableQueryStringUndefined: Self = StObject.set(x, "enableQueryString", js.undefined)
      
      inline def setEnableTemplates(value: Boolean): Self = StObject.set(x, "enableTemplates", value.asInstanceOf[js.Any])
      
      inline def setEnableTemplatesUndefined: Self = StObject.set(x, "enableTemplates", js.undefined)
      
      inline def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
      
      inline def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeList(value: js.Array[Any]): Self = StObject.set(x, "pageSizeList", value.asInstanceOf[js.Any])
      
      inline def setPageSizeListUndefined: Self = StObject.set(x, "pageSizeList", js.undefined)
      
      inline def setPageSizeListVarargs(value: Any*): Self = StObject.set(x, "pageSizeList", js.Array(value*))
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPrintMode(value: PrintMode | String): Self = StObject.set(x, "printMode", value.asInstanceOf[js.Any])
      
      inline def setPrintModeUndefined: Self = StObject.set(x, "printMode", js.undefined)
      
      inline def setShowDefaults(value: Boolean): Self = StObject.set(x, "showDefaults", value.asInstanceOf[js.Any])
      
      inline def setShowDefaultsUndefined: Self = StObject.set(x, "showDefaults", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
      
      inline def setTotalPagesUndefined: Self = StObject.set(x, "totalPages", js.undefined)
      
      inline def setTotalRecordsCount(value: Double): Self = StObject.set(x, "totalRecordsCount", value.asInstanceOf[js.Any])
      
      inline def setTotalRecordsCountUndefined: Self = StObject.set(x, "totalRecordsCount", js.undefined)
    }
  }
  
  trait QueryCellInfoEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns grid cell.
      */
    var cell: js.UndefOr[Any] = js.undefined
    
    /** Returns the column object.
      */
    var column: js.UndefOr[Any] = js.undefined
    
    /** Returns current row record object (JSON).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the foreign key record object (JSON).
      */
    var foreignKeyData: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns current row record object (JSON).
      */
    var rowData: js.UndefOr[Any] = js.undefined
    
    /** Returns the text value in the cell.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object QueryCellInfoEventArgs {
    
    inline def apply(): QueryCellInfoEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryCellInfoEventArgs]
    }
    
    extension [Self <: QueryCellInfoEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCell(value: Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setForeignKeyData(value: Any): Self = StObject.set(x, "foreignKeyData", value.asInstanceOf[js.Any])
      
      inline def setForeignKeyDataUndefined: Self = StObject.set(x, "foreignKeyData", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RecordClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current selected cell.
      */
    var cell: js.UndefOr[Any] = js.undefined
    
    /** Returns the cell index value.
      */
    var cellIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the corresponding cell value.
      */
    var cellValue: js.UndefOr[String] = js.undefined
    
    /** Returns the Header text of the column corresponding to the selected cell.
      */
    var columnName: js.UndefOr[String] = js.undefined
    
    /** Returns current record object (JSON).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the jQuery object of the current selected row.
      */
    var row: js.UndefOr[Any] = js.undefined
    
    /** Returns current record object (JSON).
      */
    var rowData: js.UndefOr[Any] = js.undefined
    
    /** Returns the row index of the selected row.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RecordClickEventArgs {
    
    inline def apply(): RecordClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordClickEventArgs]
    }
    
    extension [Self <: RecordClickEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCell(value: Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      inline def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setCellValue(value: String): Self = StObject.set(x, "cellValue", value.asInstanceOf[js.Any])
      
      inline def setCellValueUndefined: Self = StObject.set(x, "cellValue", js.undefined)
      
      inline def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
      
      inline def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRow(value: Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RecordDoubleClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current selected cell.
      */
    var cell: js.UndefOr[Any] = js.undefined
    
    /** Returns the selected cell index value.
      */
    var cellIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the corresponding cell value.
      */
    var cellValue: js.UndefOr[String] = js.undefined
    
    /** Returns the Header text of the column corresponding to the selected cell.
      */
    var columnName: js.UndefOr[String] = js.undefined
    
    /** Returns current record object (JSON).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the jQuery object of the current selected row.
      */
    var row: js.UndefOr[Any] = js.undefined
    
    /** Returns current record object (JSON).
      */
    var rowData: js.UndefOr[Any] = js.undefined
    
    /** Returns the row index of the selected row.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RecordDoubleClickEventArgs {
    
    inline def apply(): RecordDoubleClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordDoubleClickEventArgs]
    }
    
    extension [Self <: RecordDoubleClickEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCell(value: Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      inline def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setCellValue(value: String): Self = StObject.set(x, "cellValue", value.asInstanceOf[js.Any])
      
      inline def setCellValueUndefined: Self = StObject.set(x, "cellValue", js.undefined)
      
      inline def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
      
      inline def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRow(value: Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ResizeEndEventArgs extends StObject {
    
    /** Returns the column object.
      */
    var column: js.UndefOr[Any] = js.undefined
    
    /** Returns the column index.
      */
    var columnIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the extra width value.
      */
    var extra: js.UndefOr[Double] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the new width value.
      */
    var newWidth: js.UndefOr[Double] = js.undefined
    
    /** Returns the old width value.
      */
    var oldWidth: js.UndefOr[Double] = js.undefined
    
    /** Returns the grid object.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ResizeEndEventArgs {
    
    inline def apply(): ResizeEndEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeEndEventArgs]
    }
    
    extension [Self <: ResizeEndEventArgs](x: Self) {
      
      inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setExtra(value: Double): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setNewWidth(value: Double): Self = StObject.set(x, "newWidth", value.asInstanceOf[js.Any])
      
      inline def setNewWidthUndefined: Self = StObject.set(x, "newWidth", js.undefined)
      
      inline def setOldWidth(value: Double): Self = StObject.set(x, "oldWidth", value.asInstanceOf[js.Any])
      
      inline def setOldWidthUndefined: Self = StObject.set(x, "oldWidth", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ResizeSettings extends StObject {
    
    /** Gets or sets a value that indicates whether to define the mode of resizing.
      * @Default {ej.Grid.ResizeMode.Normal}
      */
    var resizeMode: js.UndefOr[ResizeMode | String] = js.undefined
  }
  object ResizeSettings {
    
    inline def apply(): ResizeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeSettings]
    }
    
    extension [Self <: ResizeSettings](x: Self) {
      
      inline def setResizeMode(value: ResizeMode | String): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
      
      inline def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
    }
  }
  
  trait ResizeStartEventArgs extends StObject {
    
    /** Returns the column object.
      */
    var column: js.UndefOr[Any] = js.undefined
    
    /** Returns the column index.
      */
    var columnIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the old width value.
      */
    var oldWidth: js.UndefOr[Double] = js.undefined
    
    /** Returns the grid object.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ResizeStartEventArgs {
    
    inline def apply(): ResizeStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeStartEventArgs]
    }
    
    extension [Self <: ResizeStartEventArgs](x: Self) {
      
      inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setOldWidth(value: Double): Self = StObject.set(x, "oldWidth", value.asInstanceOf[js.Any])
      
      inline def setOldWidthUndefined: Self = StObject.set(x, "oldWidth", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ResizedEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the column object.
      */
    var column: js.UndefOr[Any] = js.undefined
    
    /** Returns the column index.
      */
    var columnIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the new width value.
      */
    var newWidth: js.UndefOr[Double] = js.undefined
    
    /** Returns the old width value.
      */
    var oldWidth: js.UndefOr[Double] = js.undefined
    
    /** Returns the grid object.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ResizedEventArgs {
    
    inline def apply(): ResizedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizedEventArgs]
    }
    
    extension [Self <: ResizedEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setNewWidth(value: Double): Self = StObject.set(x, "newWidth", value.asInstanceOf[js.Any])
      
      inline def setNewWidthUndefined: Self = StObject.set(x, "newWidth", js.undefined)
      
      inline def setOldWidth(value: Double): Self = StObject.set(x, "oldWidth", value.asInstanceOf[js.Any])
      
      inline def setOldWidthUndefined: Self = StObject.set(x, "oldWidth", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RightClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the cell object.
      */
    var cell: js.UndefOr[Any] = js.undefined
    
    /** Returns the cell index of the selected cell.
      */
    var cellIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the cell value.
      */
    var cellValue: js.UndefOr[String] = js.undefined
    
    /** Returns current record object (JSON).
      */
    var currentData: js.UndefOr[Any] = js.undefined
    
    /** Returns the selected row data object.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the current selected row.
      */
    var row: js.UndefOr[Any] = js.undefined
    
    /** Returns the selected row data object.
      */
    var rowData: js.UndefOr[Any] = js.undefined
    
    /** Returns the row index of the selected row.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RightClickEventArgs {
    
    inline def apply(): RightClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RightClickEventArgs]
    }
    
    extension [Self <: RightClickEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCell(value: Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      inline def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setCellValue(value: String): Self = StObject.set(x, "cellValue", value.asInstanceOf[js.Any])
      
      inline def setCellValueUndefined: Self = StObject.set(x, "cellValue", js.undefined)
      
      inline def setCurrentData(value: Any): Self = StObject.set(x, "currentData", value.asInstanceOf[js.Any])
      
      inline def setCurrentDataUndefined: Self = StObject.set(x, "currentData", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRow(value: Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RowDataBoundEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns current row record object (JSON).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the foreign key record object (JSON).
      */
    var foreignKeyData: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns grid row.
      */
    var row: js.UndefOr[Any] = js.undefined
    
    /** Returns current row record object (JSON).
      */
    var rowData: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RowDataBoundEventArgs {
    
    inline def apply(): RowDataBoundEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowDataBoundEventArgs]
    }
    
    extension [Self <: RowDataBoundEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setForeignKeyData(value: Any): Self = StObject.set(x, "foreignKeyData", value.asInstanceOf[js.Any])
      
      inline def setForeignKeyDataUndefined: Self = StObject.set(x, "foreignKeyData", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRow(value: Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RowDeselectedEventArgs extends StObject {
    
    /** Returns current record object (JSON).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the current deselected row element.
      */
    var row: js.UndefOr[Any] = js.undefined
    
    /** Returns the row index of the deselected row.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns current record object (JSON).
      */
    var selectedData: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RowDeselectedEventArgs {
    
    inline def apply(): RowDeselectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowDeselectedEventArgs]
    }
    
    extension [Self <: RowDeselectedEventArgs](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRow(value: Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setSelectedData(value: Any): Self = StObject.set(x, "selectedData", value.asInstanceOf[js.Any])
      
      inline def setSelectedDataUndefined: Self = StObject.set(x, "selectedData", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RowDeselectingEventArgs extends StObject {
    
    /** Returns current record object (JSON).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns whether the ctrl key is pressed while deselecting row
      */
    var isCtrlKeyPressed: js.UndefOr[Boolean] = js.undefined
    
    /** Returns whether the shift key is pressed while deselecting row
      */
    var isShiftKeyPressed: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the deselecting row element.
      */
    var row: js.UndefOr[Any] = js.undefined
    
    /** Returns the deselecting row index value.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns current record object (JSON).
      */
    var selectedData: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RowDeselectingEventArgs {
    
    inline def apply(): RowDeselectingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowDeselectingEventArgs]
    }
    
    extension [Self <: RowDeselectingEventArgs](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setIsCtrlKeyPressed(value: Boolean): Self = StObject.set(x, "isCtrlKeyPressed", value.asInstanceOf[js.Any])
      
      inline def setIsCtrlKeyPressedUndefined: Self = StObject.set(x, "isCtrlKeyPressed", js.undefined)
      
      inline def setIsShiftKeyPressed(value: Boolean): Self = StObject.set(x, "isShiftKeyPressed", value.asInstanceOf[js.Any])
      
      inline def setIsShiftKeyPressedUndefined: Self = StObject.set(x, "isShiftKeyPressed", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRow(value: Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setSelectedData(value: Any): Self = StObject.set(x, "selectedData", value.asInstanceOf[js.Any])
      
      inline def setSelectedDataUndefined: Self = StObject.set(x, "selectedData", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RowDragEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns target elements based on mouse move position.
      */
    var currentTarget: js.UndefOr[Any] = js.undefined
    
    /** Returns JSON data of dragged rows.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns draggable element type.
      */
    var draggableType: js.UndefOr[Any] = js.undefined
    
    /** Returns JSON data of dragged rows.
      */
    var draggedRecords: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the draggable row object.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RowDragEventArgs {
    
    inline def apply(): RowDragEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowDragEventArgs]
    }
    
    extension [Self <: RowDragEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentTarget(value: Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDraggableType(value: Any): Self = StObject.set(x, "draggableType", value.asInstanceOf[js.Any])
      
      inline def setDraggableTypeUndefined: Self = StObject.set(x, "draggableType", js.undefined)
      
      inline def setDraggedRecords(value: Any): Self = StObject.set(x, "draggedRecords", value.asInstanceOf[js.Any])
      
      inline def setDraggedRecordsUndefined: Self = StObject.set(x, "draggedRecords", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RowDragStartEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns drag start element cell.
      */
    var currentTarget: js.UndefOr[Any] = js.undefined
    
    /** Returns the JSON data of dragged rows.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns draggable element type.
      */
    var draggableType: js.UndefOr[Any] = js.undefined
    
    /** Returns the JSON data of dragged rows.
      */
    var draggedRecords: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the draggable row object.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RowDragStartEventArgs {
    
    inline def apply(): RowDragStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowDragStartEventArgs]
    }
    
    extension [Self <: RowDragStartEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentTarget(value: Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDraggableType(value: Any): Self = StObject.set(x, "draggableType", value.asInstanceOf[js.Any])
      
      inline def setDraggableTypeUndefined: Self = StObject.set(x, "draggableType", js.undefined)
      
      inline def setDraggedRecords(value: Any): Self = StObject.set(x, "draggedRecords", value.asInstanceOf[js.Any])
      
      inline def setDraggedRecordsUndefined: Self = StObject.set(x, "draggedRecords", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RowDropEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the JSON data of dragged rows.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns draggable element type.
      */
    var draggableType: js.UndefOr[String] = js.undefined
    
    /** Returns the JSON data of dragged rows.
      */
    var droppedRecords: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the draggable row object.
      */
    var rows: js.UndefOr[Any] = js.undefined
    
    /** Returns the current mouse position cell element.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RowDropEventArgs {
    
    inline def apply(): RowDropEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowDropEventArgs]
    }
    
    extension [Self <: RowDropEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDraggableType(value: String): Self = StObject.set(x, "draggableType", value.asInstanceOf[js.Any])
      
      inline def setDraggableTypeUndefined: Self = StObject.set(x, "draggableType", js.undefined)
      
      inline def setDroppedRecords(value: Any): Self = StObject.set(x, "droppedRecords", value.asInstanceOf[js.Any])
      
      inline def setDroppedRecordsUndefined: Self = StObject.set(x, "droppedRecords", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRows(value: Any): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RowDropSettings extends StObject {
    
    /** Gets or sets a value that indicates whether move or copy a record from one grid to another or within the grid
      * @Default {ej.Grid.DragBehavior.Move}
      */
    var dragBehavior: js.UndefOr[DragBehavior | String] = js.undefined
    
    /** This helps in mapping server-side action when rows are dragged from Grid.
      * @Default {null}
      */
    var dragMapper: js.UndefOr[String] = js.undefined
    
    /** This helps in mapping server-side action when rows are dropped in Grid.
      * @Default {null}
      */
    var dropMapper: js.UndefOr[String] = js.undefined
    
    /** This specifies the grid to drop the grid rows only at particular target element.
      * @Default {null}
      */
    var dropTargetID: js.UndefOr[Any] = js.undefined
  }
  object RowDropSettings {
    
    inline def apply(): RowDropSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowDropSettings]
    }
    
    extension [Self <: RowDropSettings](x: Self) {
      
      inline def setDragBehavior(value: DragBehavior | String): Self = StObject.set(x, "dragBehavior", value.asInstanceOf[js.Any])
      
      inline def setDragBehaviorUndefined: Self = StObject.set(x, "dragBehavior", js.undefined)
      
      inline def setDragMapper(value: String): Self = StObject.set(x, "dragMapper", value.asInstanceOf[js.Any])
      
      inline def setDragMapperUndefined: Self = StObject.set(x, "dragMapper", js.undefined)
      
      inline def setDropMapper(value: String): Self = StObject.set(x, "dropMapper", value.asInstanceOf[js.Any])
      
      inline def setDropMapperUndefined: Self = StObject.set(x, "dropMapper", js.undefined)
      
      inline def setDropTargetID(value: Any): Self = StObject.set(x, "dropTargetID", value.asInstanceOf[js.Any])
      
      inline def setDropTargetIDUndefined: Self = StObject.set(x, "dropTargetID", js.undefined)
    }
  }
  
  trait RowHoverEventArgs extends StObject {
    
    /** Returns the hovered row cell
      */
    var cell: js.UndefOr[Any] = js.undefined
    
    /** Returns the hovered row.
      */
    var row: js.UndefOr[Any] = js.undefined
    
    /** Returns the hovered record details
      */
    var rowData: js.UndefOr[Any] = js.undefined
    
    /** Returns the hovered row index.
      */
    var rowIndex: js.UndefOr[Any] = js.undefined
  }
  object RowHoverEventArgs {
    
    inline def apply(): RowHoverEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowHoverEventArgs]
    }
    
    extension [Self <: RowHoverEventArgs](x: Self) {
      
      inline def setCell(value: Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setRow(value: Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      inline def setRowIndex(value: Any): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
  
  trait RowSelectedEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns current record object (JSON).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the foreign key record object (JSON).
      */
    var foreignKeyData: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the previous selected row element.
      */
    var prevRow: js.UndefOr[Any] = js.undefined
    
    /** Returns the previous selected row index.
      */
    var prevRowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the current selected row.
      */
    var row: js.UndefOr[Any] = js.undefined
    
    /** Returns the row index of the selected row.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns current record object (JSON).
      */
    var selectedData: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RowSelectedEventArgs {
    
    inline def apply(): RowSelectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowSelectedEventArgs]
    }
    
    extension [Self <: RowSelectedEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setForeignKeyData(value: Any): Self = StObject.set(x, "foreignKeyData", value.asInstanceOf[js.Any])
      
      inline def setForeignKeyDataUndefined: Self = StObject.set(x, "foreignKeyData", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrevRow(value: Any): Self = StObject.set(x, "prevRow", value.asInstanceOf[js.Any])
      
      inline def setPrevRowIndex(value: Double): Self = StObject.set(x, "prevRowIndex", value.asInstanceOf[js.Any])
      
      inline def setPrevRowIndexUndefined: Self = StObject.set(x, "prevRowIndex", js.undefined)
      
      inline def setPrevRowUndefined: Self = StObject.set(x, "prevRow", js.undefined)
      
      inline def setRow(value: Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setSelectedData(value: Any): Self = StObject.set(x, "selectedData", value.asInstanceOf[js.Any])
      
      inline def setSelectedDataUndefined: Self = StObject.set(x, "selectedData", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RowSelectingEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns current record object (JSON).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the previous selected row element.
      */
    var prevRow: js.UndefOr[Any] = js.undefined
    
    /** Returns the previous selected row index.
      */
    var prevRowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the selected row element.
      */
    var row: js.UndefOr[Any] = js.undefined
    
    /** Returns the selected row index value.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns current record object (JSON).
      */
    var selectedData: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RowSelectingEventArgs {
    
    inline def apply(): RowSelectingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowSelectingEventArgs]
    }
    
    extension [Self <: RowSelectingEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrevRow(value: Any): Self = StObject.set(x, "prevRow", value.asInstanceOf[js.Any])
      
      inline def setPrevRowIndex(value: Double): Self = StObject.set(x, "prevRowIndex", value.asInstanceOf[js.Any])
      
      inline def setPrevRowIndexUndefined: Self = StObject.set(x, "prevRowIndex", js.undefined)
      
      inline def setPrevRowUndefined: Self = StObject.set(x, "prevRow", js.undefined)
      
      inline def setRow(value: Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setSelectedData(value: Any): Self = StObject.set(x, "selectedData", value.asInstanceOf[js.Any])
      
      inline def setSelectedDataUndefined: Self = StObject.set(x, "selectedData", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ScrollSettings extends StObject {
    
    /** This specify the grid to to view data that you require without buffering the entire load of a huge database
      * @Default {false}
      */
    var allowVirtualScrolling: js.UndefOr[Boolean] = js.undefined
    
    /** It accepts the boolean value and shows or hides the scrollbar while focus in or focus out of the Grid.
      * @Default {false}
      */
    var autoHide: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the height and width of button in the scrollbar.
      * @Default {18}
      */
    var buttonSize: js.UndefOr[Double] = js.undefined
    
    /** This specify the grid to enable/disable touch control for scrolling.
      * @Default {true}
      */
    var enableTouchScroll: js.UndefOr[Boolean] = js.undefined
    
    /** This is used to enable the enhanced virtual scrolling in Grid.
      * @Default {false}
      */
    var enableVirtualization: js.UndefOr[Boolean] = js.undefined
    
    /** This specify the grid to freeze particular columns at the time of scrolling.
      * @Default {0}
      */
    var frozenColumns: js.UndefOr[Double] = js.undefined
    
    /** This specify the grid to freeze particular rows at the time of scrolling.
      * @Default {0}
      */
    var frozenRows: js.UndefOr[Double] = js.undefined
    
    /** This specify the grid to show the vertical scroll bar, to scroll and view the grid contents.
      * @Default {0}
      */
    var height: js.UndefOr[String | Double] = js.undefined
    
    /** This specify the scroll down pixel of mouse wheel, to scroll mouse wheel and view the grid contents.
      * @Default {57}
      */
    var scrollOneStepBy: js.UndefOr[Double] = js.undefined
    
    /** It accepts the integer value and sets the width of scrollbar.
      * @Default {18}
      */
    var scrollerSize: js.UndefOr[Double] = js.undefined
    
    /** This is used to define the mode of virtual scrolling in grid. See virtualScrollMode
      * @Default {ej.Grid.VirtualScrollMode.Normal}
      */
    var virtualScrollMode: js.UndefOr[typings.ejWebAll.ej.VirtualScrollMode | String] = js.undefined
    
    /** This specify the grid to show the horizontal scroll bar, to scroll and view the grid contents
      * @Default {250}
      */
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object ScrollSettings {
    
    inline def apply(): ScrollSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollSettings]
    }
    
    extension [Self <: ScrollSettings](x: Self) {
      
      inline def setAllowVirtualScrolling(value: Boolean): Self = StObject.set(x, "allowVirtualScrolling", value.asInstanceOf[js.Any])
      
      inline def setAllowVirtualScrollingUndefined: Self = StObject.set(x, "allowVirtualScrolling", js.undefined)
      
      inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
      
      inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
      
      inline def setButtonSize(value: Double): Self = StObject.set(x, "buttonSize", value.asInstanceOf[js.Any])
      
      inline def setButtonSizeUndefined: Self = StObject.set(x, "buttonSize", js.undefined)
      
      inline def setEnableTouchScroll(value: Boolean): Self = StObject.set(x, "enableTouchScroll", value.asInstanceOf[js.Any])
      
      inline def setEnableTouchScrollUndefined: Self = StObject.set(x, "enableTouchScroll", js.undefined)
      
      inline def setEnableVirtualization(value: Boolean): Self = StObject.set(x, "enableVirtualization", value.asInstanceOf[js.Any])
      
      inline def setEnableVirtualizationUndefined: Self = StObject.set(x, "enableVirtualization", js.undefined)
      
      inline def setFrozenColumns(value: Double): Self = StObject.set(x, "frozenColumns", value.asInstanceOf[js.Any])
      
      inline def setFrozenColumnsUndefined: Self = StObject.set(x, "frozenColumns", js.undefined)
      
      inline def setFrozenRows(value: Double): Self = StObject.set(x, "frozenRows", value.asInstanceOf[js.Any])
      
      inline def setFrozenRowsUndefined: Self = StObject.set(x, "frozenRows", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setScrollOneStepBy(value: Double): Self = StObject.set(x, "scrollOneStepBy", value.asInstanceOf[js.Any])
      
      inline def setScrollOneStepByUndefined: Self = StObject.set(x, "scrollOneStepBy", js.undefined)
      
      inline def setScrollerSize(value: Double): Self = StObject.set(x, "scrollerSize", value.asInstanceOf[js.Any])
      
      inline def setScrollerSizeUndefined: Self = StObject.set(x, "scrollerSize", js.undefined)
      
      inline def setVirtualScrollMode(value: typings.ejWebAll.ej.VirtualScrollMode | String): Self = StObject.set(x, "virtualScrollMode", value.asInstanceOf[js.Any])
      
      inline def setVirtualScrollModeUndefined: Self = StObject.set(x, "virtualScrollMode", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SearchSettings extends StObject {
    
    /** This specify the grid to search for the value in particular columns that is mentioned in the field.
      * @Default {[]}
      */
    var fields: js.UndefOr[Any] = js.undefined
    
    /** It enables or disables case-sensitivity while searching the search key in grid.
      * @Default {true}
      */
    var ignoreCase: js.UndefOr[Boolean] = js.undefined
    
    /** This specifies the grid to search the particular data that is mentioned in the key.
      */
    var key: js.UndefOr[String] = js.undefined
    
    /** It specifies the grid to search the records based on operator.
      * @Default {contains}
      */
    var operator: js.UndefOr[String] = js.undefined
  }
  object SearchSettings {
    
    inline def apply(): SearchSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchSettings]
    }
    
    extension [Self <: SearchSettings](x: Self) {
      
      inline def setFields(value: Any): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    }
  }
  
  trait SelectionSettings extends StObject {
    
    /** Gets or sets a value that indicates whether to select multiple rows or cells by performing dragging in Grid.
      * @Default {false}
      */
    var allowDragSelection: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates the cell selection actions based on the cell selection mode.
      * @Default {ej.Grid.CellSelectionMode.Flow}
      */
    var cellSelectionMode: js.UndefOr[CellSelectionMode | String] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable the toggle selection behavior for row, cell and column.
      * @Default {false}
      */
    var enableToggle: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to add the default selection actions as a selection mode.See selectionMode
      * @Default {[row]}
      */
    var selectionMode: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object SelectionSettings {
    
    inline def apply(): SelectionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionSettings]
    }
    
    extension [Self <: SelectionSettings](x: Self) {
      
      inline def setAllowDragSelection(value: Boolean): Self = StObject.set(x, "allowDragSelection", value.asInstanceOf[js.Any])
      
      inline def setAllowDragSelectionUndefined: Self = StObject.set(x, "allowDragSelection", js.undefined)
      
      inline def setCellSelectionMode(value: CellSelectionMode | String): Self = StObject.set(x, "cellSelectionMode", value.asInstanceOf[js.Any])
      
      inline def setCellSelectionModeUndefined: Self = StObject.set(x, "cellSelectionMode", js.undefined)
      
      inline def setEnableToggle(value: Boolean): Self = StObject.set(x, "enableToggle", value.asInstanceOf[js.Any])
      
      inline def setEnableToggleUndefined: Self = StObject.set(x, "enableToggle", js.undefined)
      
      inline def setSelectionMode(value: js.Array[Any]): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setSelectionModeVarargs(value: Any*): Self = StObject.set(x, "selectionMode", js.Array(value*))
    }
  }
  
  trait SortSettings extends StObject {
    
    /** Gets or sets a value that indicates whether to define the direction and field to sort the column.
      */
    var sortedColumns: js.UndefOr[js.Array[SortSettingsSortedColumn]] = js.undefined
  }
  object SortSettings {
    
    inline def apply(): SortSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortSettings]
    }
    
    extension [Self <: SortSettings](x: Self) {
      
      inline def setSortedColumns(value: js.Array[SortSettingsSortedColumn]): Self = StObject.set(x, "sortedColumns", value.asInstanceOf[js.Any])
      
      inline def setSortedColumnsUndefined: Self = StObject.set(x, "sortedColumns", js.undefined)
      
      inline def setSortedColumnsVarargs(value: SortSettingsSortedColumn*): Self = StObject.set(x, "sortedColumns", js.Array(value*))
    }
  }
  
  trait SortSettingsSortedColumn extends StObject {
    
    /** Gets or sets a value that indicates whether to define the direction to sort the column.
      */
    var direction: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates whether to define the field name of the column to be sort
      */
    var field: js.UndefOr[String] = js.undefined
  }
  object SortSettingsSortedColumn {
    
    inline def apply(): SortSettingsSortedColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortSettingsSortedColumn]
    }
    
    extension [Self <: SortSettingsSortedColumn](x: Self) {
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    }
  }
  
  trait StackedHeaderRow extends StObject {
    
    /** Gets or sets a value that indicates whether to add stacked header columns into the stacked header rows
      * @Default {[]}
      */
    var stackedHeaderColumns: js.UndefOr[js.Array[StackedHeaderRowsStackedHeaderColumn]] = js.undefined
  }
  object StackedHeaderRow {
    
    inline def apply(): StackedHeaderRow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackedHeaderRow]
    }
    
    extension [Self <: StackedHeaderRow](x: Self) {
      
      inline def setStackedHeaderColumns(value: js.Array[StackedHeaderRowsStackedHeaderColumn]): Self = StObject.set(x, "stackedHeaderColumns", value.asInstanceOf[js.Any])
      
      inline def setStackedHeaderColumnsUndefined: Self = StObject.set(x, "stackedHeaderColumns", js.undefined)
      
      inline def setStackedHeaderColumnsVarargs(value: StackedHeaderRowsStackedHeaderColumn*): Self = StObject.set(x, "stackedHeaderColumns", js.Array(value*))
    }
  }
  
  trait StackedHeaderRowsStackedHeaderColumn extends StObject {
    
    /** Gets or sets a value that indicates the header text for the particular stacked header column.
      * @Default {null}
      */
    var column: js.UndefOr[Any] = js.undefined
    
    /** Gets or sets a value that indicates class to the corresponding stackedHeaderColumn.
      * @Default {null}
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates the header text for the particular stacked header column.
      * @Default {null}
      */
    var headerText: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates the text alignment of the corresponding headerText.
      * @Default {ej.TextAlign.Left}
      */
    var textAlign: js.UndefOr[String] = js.undefined
    
    /** Sets the template for tooltip for the Grid stackedHeaderColumns.
      * @Default {null}
      */
    var tooltip: js.UndefOr[String] = js.undefined
  }
  object StackedHeaderRowsStackedHeaderColumn {
    
    inline def apply(): StackedHeaderRowsStackedHeaderColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackedHeaderRowsStackedHeaderColumn]
    }
    
    extension [Self <: StackedHeaderRowsStackedHeaderColumn](x: Self) {
      
      inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      inline def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
      
      inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  trait SummaryRow extends StObject {
    
    /** Gets or sets a value that indicates whether to show the summary value within the group caption area for the corresponding summary column while grouping the column
      * @Default {false}
      */
    var showCaptionSummary: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to show the group summary value for the corresponding summary column while grouping a column
      * @Default {false}
      */
    var showGroupSummary: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to show the total summary value the for the corresponding summary column. The summary row is added after the grid content.
      * @Default {true}
      */
    var showTotalSummary: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to add summary columns into the summary rows.
      * @Default {[]}
      */
    var summaryColumns: js.UndefOr[js.Array[SummaryRowsSummaryColumn]] = js.undefined
    
    /** This specifies the grid to show the title for the summary rows.
      */
    var title: js.UndefOr[String] = js.undefined
    
    /** This specifies the grid to show the title of summary row in the specified column.
      * @Default {null}
      */
    var titleColumn: js.UndefOr[String] = js.undefined
  }
  object SummaryRow {
    
    inline def apply(): SummaryRow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SummaryRow]
    }
    
    extension [Self <: SummaryRow](x: Self) {
      
      inline def setShowCaptionSummary(value: Boolean): Self = StObject.set(x, "showCaptionSummary", value.asInstanceOf[js.Any])
      
      inline def setShowCaptionSummaryUndefined: Self = StObject.set(x, "showCaptionSummary", js.undefined)
      
      inline def setShowGroupSummary(value: Boolean): Self = StObject.set(x, "showGroupSummary", value.asInstanceOf[js.Any])
      
      inline def setShowGroupSummaryUndefined: Self = StObject.set(x, "showGroupSummary", js.undefined)
      
      inline def setShowTotalSummary(value: Boolean): Self = StObject.set(x, "showTotalSummary", value.asInstanceOf[js.Any])
      
      inline def setShowTotalSummaryUndefined: Self = StObject.set(x, "showTotalSummary", js.undefined)
      
      inline def setSummaryColumns(value: js.Array[SummaryRowsSummaryColumn]): Self = StObject.set(x, "summaryColumns", value.asInstanceOf[js.Any])
      
      inline def setSummaryColumnsUndefined: Self = StObject.set(x, "summaryColumns", js.undefined)
      
      inline def setSummaryColumnsVarargs(value: SummaryRowsSummaryColumn*): Self = StObject.set(x, "summaryColumns", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleColumn(value: String): Self = StObject.set(x, "titleColumn", value.asInstanceOf[js.Any])
      
      inline def setTitleColumnUndefined: Self = StObject.set(x, "titleColumn", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait SummaryRowsSummaryColumn extends StObject {
    
    /** Gets or sets a value that indicates the text displayed in the summary column as a value
      * @Default {null}
      */
    var customSummaryValue: js.UndefOr[String] = js.undefined
    
    /** This specifies summary column used to perform the summary calculation
      * @Default {null}
      */
    var dataMember: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates to define the target column at which to display the summary.
      * @Default {null}
      */
    var displayColumn: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates the format for the text applied on the column
      * @Default {null}
      */
    var format: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates the text displayed before the summary column value
      * @Default {null}
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates the text displayed after the summary column value
      * @Default {null}
      */
    var suffix: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates the type of calculations to be performed for the corresponding summary column. See summaryType.
      * @Default {[]}
      */
    var summaryType: js.UndefOr[SummaryType | String] = js.undefined
    
    /** Gets or sets a value that indicates to add the template for the summary value of dataMember given.
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.undefined
  }
  object SummaryRowsSummaryColumn {
    
    inline def apply(): SummaryRowsSummaryColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SummaryRowsSummaryColumn]
    }
    
    extension [Self <: SummaryRowsSummaryColumn](x: Self) {
      
      inline def setCustomSummaryValue(value: String): Self = StObject.set(x, "customSummaryValue", value.asInstanceOf[js.Any])
      
      inline def setCustomSummaryValueUndefined: Self = StObject.set(x, "customSummaryValue", js.undefined)
      
      inline def setDataMember(value: String): Self = StObject.set(x, "dataMember", value.asInstanceOf[js.Any])
      
      inline def setDataMemberUndefined: Self = StObject.set(x, "dataMember", js.undefined)
      
      inline def setDisplayColumn(value: String): Self = StObject.set(x, "displayColumn", value.asInstanceOf[js.Any])
      
      inline def setDisplayColumnUndefined: Self = StObject.set(x, "displayColumn", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setSummaryType(value: SummaryType | String): Self = StObject.set(x, "summaryType", value.asInstanceOf[js.Any])
      
      inline def setSummaryTypeUndefined: Self = StObject.set(x, "summaryType", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  trait TemplateRefreshEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the cell object.
      */
    var cell: js.UndefOr[Any] = js.undefined
    
    /** Returns the column object.
      */
    var column: js.UndefOr[Any] = js.undefined
    
    /** Returns the current row data.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the current row data.
      */
    var rowData: js.UndefOr[Any] = js.undefined
    
    /** Returns the current row index.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object TemplateRefreshEventArgs {
    
    inline def apply(): TemplateRefreshEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateRefreshEventArgs]
    }
    
    extension [Self <: TemplateRefreshEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCell(value: Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait TextWrapSettings extends StObject {
    
    /** This specifies the grid to apply the auto wrap for grid content or header or both.
      * @Default {ej.Grid.WrapMode.Both}
      */
    var wrapMode: js.UndefOr[WrapMode | String] = js.undefined
  }
  object TextWrapSettings {
    
    inline def apply(): TextWrapSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextWrapSettings]
    }
    
    extension [Self <: TextWrapSettings](x: Self) {
      
      inline def setWrapMode(value: WrapMode | String): Self = StObject.set(x, "wrapMode", value.asInstanceOf[js.Any])
      
      inline def setWrapModeUndefined: Self = StObject.set(x, "wrapMode", js.undefined)
    }
  }
  
  trait ToolbarClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current item.
      */
    var currentTarget: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model.
      */
    var gridModel: js.UndefOr[Any] = js.undefined
    
    /** Returns the Id of the current toolbar element.
      */
    var itemId: js.UndefOr[String] = js.undefined
    
    /** Returns the index of the current toolbar element.
      */
    var itemIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the current toolbar element.
      */
    var itemName: js.UndefOr[String] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the status of toolbar item which denotes its enabled state
      */
    var status: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the target item.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the toolbar object of the selected toolbar element.
      */
    var toolbarData: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ToolbarClickEventArgs {
    
    inline def apply(): ToolbarClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarClickEventArgs]
    }
    
    extension [Self <: ToolbarClickEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentTarget(value: Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      inline def setGridModel(value: Any): Self = StObject.set(x, "gridModel", value.asInstanceOf[js.Any])
      
      inline def setGridModelUndefined: Self = StObject.set(x, "gridModel", js.undefined)
      
      inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      inline def setItemIndexUndefined: Self = StObject.set(x, "itemIndex", js.undefined)
      
      inline def setItemName(value: String): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
      
      inline def setItemNameUndefined: Self = StObject.set(x, "itemName", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setToolbarData(value: Any): Self = StObject.set(x, "toolbarData", value.asInstanceOf[js.Any])
      
      inline def setToolbarDataUndefined: Self = StObject.set(x, "toolbarData", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ToolbarSettings extends StObject {
    
    /** Gets or sets a value that indicates whether to add custom toolbar items within the toolbar to perform any action in the grid
      * @Default {[]}
      */
    var customToolbarItems: js.UndefOr[js.Array[ToolbarSettingsCustomToolbarItem]] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable toolbar in the grid.
      * @Default {false}
      */
    var showToolbar: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to add the default editing actions as a toolbar items. See toolbarItems.
      * @Default {[]}
      */
    var toolbarItems: js.UndefOr[js.Array[ToolBarItems | String]] = js.undefined
  }
  object ToolbarSettings {
    
    inline def apply(): ToolbarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarSettings]
    }
    
    extension [Self <: ToolbarSettings](x: Self) {
      
      inline def setCustomToolbarItems(value: js.Array[ToolbarSettingsCustomToolbarItem]): Self = StObject.set(x, "customToolbarItems", value.asInstanceOf[js.Any])
      
      inline def setCustomToolbarItemsUndefined: Self = StObject.set(x, "customToolbarItems", js.undefined)
      
      inline def setCustomToolbarItemsVarargs(value: ToolbarSettingsCustomToolbarItem*): Self = StObject.set(x, "customToolbarItems", js.Array(value*))
      
      inline def setShowToolbar(value: Boolean): Self = StObject.set(x, "showToolbar", value.asInstanceOf[js.Any])
      
      inline def setShowToolbarUndefined: Self = StObject.set(x, "showToolbar", js.undefined)
      
      inline def setToolbarItems(value: js.Array[ToolBarItems | String]): Self = StObject.set(x, "toolbarItems", value.asInstanceOf[js.Any])
      
      inline def setToolbarItemsUndefined: Self = StObject.set(x, "toolbarItems", js.undefined)
      
      inline def setToolbarItemsVarargs(value: (ToolBarItems | String)*): Self = StObject.set(x, "toolbarItems", js.Array(value*))
    }
  }
  
  trait ToolbarSettingsCustomToolbarItem extends StObject {
    
    /** Gets or sets a value that indicates whether to add custom toolbar item as a template element.
      */
    var templateID: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates whether to add custom toolbar item with a custom tooltip.
      */
    var tooltip: js.UndefOr[String] = js.undefined
  }
  object ToolbarSettingsCustomToolbarItem {
    
    inline def apply(): ToolbarSettingsCustomToolbarItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarSettingsCustomToolbarItem]
    }
    
    extension [Self <: ToolbarSettingsCustomToolbarItem](x: Self) {
      
      inline def setTemplateID(value: String): Self = StObject.set(x, "templateID", value.asInstanceOf[js.Any])
      
      inline def setTemplateIDUndefined: Self = StObject.set(x, "templateID", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
}
