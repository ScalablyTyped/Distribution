package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import typings.std.HTMLElement
import typings.std.HTMLTableElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grid_ extends Widget_ {
  
  /** Adds a grid model property which is to be ignored upon exporting.
    * @param {any[]} Pass the array of parameters which need to be ignored on exporting
    * @returns {void}
    */
  def addIgnoreOnExport(propertyNames: js.Array[_]): Unit = js.native
  
  /** Adds a grid model property which is to be ignored upon OnServerToolbarClick.
    * @param {any[]} Pass the array of parameters which need to be ignored on OnServerToolbarClick
    * @returns {void}
    */
  def addIgnoreOnToolbarServerClick(propertyNames: js.Array[_]): Unit = js.native
  
  /** Add a new record in grid control when allowAdding is set as true.Without passing parameters it will add empty row.
    * @param {any[]} Pass the array of added Records
    * @param {any[]} optionalIf we pass serverChange as true, send post to server side for server action.
    * @returns {void}
    */
  def addRecord(): Unit = js.native
  def addRecord(data: js.UndefOr[scala.Nothing], serverChange: js.Array[_]): Unit = js.native
  def addRecord(data: js.Array[_]): Unit = js.native
  def addRecord(data: js.Array[_], serverChange: js.Array[_]): Unit = js.native
  
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
  def columns(columnDetails: js.Array[_]): Unit = js.native
  def columns(columnDetails: js.Array[_], action: String): Unit = js.native
  
  /** Refresh the grid with new data source
    * @param {any} Pass new data source to the grid
    * @param {boolean} optional When templateRefresh is set true, both header and contents get refreshed
    * @returns {void}
    */
  def dataSource(datasource: js.Any): Unit = js.native
  def dataSource(datasource: js.Any, templateRefresh: Boolean): Unit = js.native
  
  var defaults: typings.ejWebAll.ej.Grid.Model = js.native
  
  /** Delete a record in grid control when allowDeleting is set as true
    * @param {string} Pass the primary key field Name of the column
    * @param {any} Pass the JSON data of record need to be delete.
    * @returns {void}
    */
  def deleteRecord(fieldName: String, data: js.Any): Unit = js.native
  
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
  def export(): Unit = js.native
  def export(
    action: js.UndefOr[scala.Nothing],
    serverEvent: js.UndefOr[scala.Nothing],
    multipleExport: js.UndefOr[scala.Nothing],
    gridIds: js.Array[_]
  ): Unit = js.native
  def export(action: js.UndefOr[scala.Nothing], serverEvent: js.UndefOr[scala.Nothing], multipleExport: Boolean): Unit = js.native
  def export(
    action: js.UndefOr[scala.Nothing],
    serverEvent: js.UndefOr[scala.Nothing],
    multipleExport: Boolean,
    gridIds: js.Array[_]
  ): Unit = js.native
  def export(action: js.UndefOr[scala.Nothing], serverEvent: String): Unit = js.native
  def export(
    action: js.UndefOr[scala.Nothing],
    serverEvent: String,
    multipleExport: js.UndefOr[scala.Nothing],
    gridIds: js.Array[_]
  ): Unit = js.native
  def export(action: js.UndefOr[scala.Nothing], serverEvent: String, multipleExport: Boolean): Unit = js.native
  def export(
    action: js.UndefOr[scala.Nothing],
    serverEvent: String,
    multipleExport: Boolean,
    gridIds: js.Array[_]
  ): Unit = js.native
  def export(action: String): Unit = js.native
  def export(
    action: String,
    serverEvent: js.UndefOr[scala.Nothing],
    multipleExport: js.UndefOr[scala.Nothing],
    gridIds: js.Array[_]
  ): Unit = js.native
  def export(action: String, serverEvent: js.UndefOr[scala.Nothing], multipleExport: Boolean): Unit = js.native
  def export(
    action: String,
    serverEvent: js.UndefOr[scala.Nothing],
    multipleExport: Boolean,
    gridIds: js.Array[_]
  ): Unit = js.native
  def export(action: String, serverEvent: String): Unit = js.native
  def export(
    action: String,
    serverEvent: String,
    multipleExport: js.UndefOr[scala.Nothing],
    gridIds: js.Array[_]
  ): Unit = js.native
  def export(action: String, serverEvent: String, multipleExport: Boolean): Unit = js.native
  def export(action: String, serverEvent: String, multipleExport: Boolean, gridIds: js.Array[_]): Unit = js.native
  
  def filterColumn(fieldName: String, filterOperator: String, filterValue: String, predicate: String): Unit = js.native
  def filterColumn(
    fieldName: String,
    filterOperator: String,
    filterValue: String,
    predicate: String,
    matchcase: js.UndefOr[scala.Nothing],
    actualFilterValue: js.Any
  ): Unit = js.native
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
    actualFilterValue: js.Any
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
  def filterColumn(fieldName: js.Array[_], filterOperator: String, filterValue: String, predicate: String): Unit = js.native
  def filterColumn(
    fieldName: js.Array[_],
    filterOperator: String,
    filterValue: String,
    predicate: String,
    matchcase: js.UndefOr[scala.Nothing],
    actualFilterValue: js.Any
  ): Unit = js.native
  def filterColumn(
    fieldName: js.Array[_],
    filterOperator: String,
    filterValue: String,
    predicate: String,
    matchcase: Boolean
  ): Unit = js.native
  def filterColumn(
    fieldName: js.Array[_],
    filterOperator: String,
    filterValue: String,
    predicate: String,
    matchcase: Boolean,
    actualFilterValue: js.Any
  ): Unit = js.native
  /** Send a filtering request to filter single or multiple column in grid.
    * @param {any[]} Pass array of filterColumn query for performing filter operation
    * @returns {void}
    */
  def filterColumn(filterQueries: js.Array[_]): Unit = js.native
  
  /** Get the batch changes of edit, delete and add operations of grid.
    * @returns {any}
    */
  def getBatchChanges(): js.Any = js.native
  
  /** Get the browser details
    * @returns {any}
    */
  def getBrowserDetails(): js.Any = js.native
  
  /** Get the column details based on the given field in grid
    * @param {string} Pass the field name of the column to get the corresponding column object
    * @returns {any}
    */
  def getColumnByField(fieldName: String): js.Any = js.native
  
  /** Get the column details based on the given header text in grid.
    * @param {string} Pass the header text of the column to get the corresponding column object
    * @returns {any}
    */
  def getColumnByHeaderText(headerText: String): js.Any = js.native
  
  /** Get the column details based on the given column index in grid
    * @param {number} Pass the index of the column to get the corresponding column object
    * @returns {any}
    */
  def getColumnByIndex(columnIndex: Double): js.Any = js.native
  
  /** Get the list of field names from column collection in grid.
    * @returns {any[]}
    */
  def getColumnFieldNames(): js.Array[_] = js.native
  
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
  def getCurrentEditCellData(): js.Any = js.native
  
  /** Get the current page index in grid pager.
    * @returns {number}
    */
  def getCurrentIndex(): Double = js.native
  
  /** Get the current page data source of grid.
    * @returns {any[]}
    */
  def getCurrentViewData(): js.Array[_] = js.native
  
  /** Get the data of given row index in grid.
    * @returns {any}
    */
  def getDataByIndex(): js.Any = js.native
  
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
  def getFilteredRecords(): js.Array[_] = js.native
  
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
  def getHiddenColumnNames(): js.Array[_] = js.native
  
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
  def getPrimaryKeyFieldNames(): js.Array[_] = js.native
  
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
  def getSelectedRecords(): js.Array[_] = js.native
  
  /** Get the selected row element details in grid.
    * @returns {any[]}
    */
  def getSelectedRows(): js.Array[_] = js.native
  
  /** Get the calculated summary values of JSON data passed to it
    * @param {any} Pass Summary Column details
    * @param {any} Pass JSON Array for which its field values to be calculated
    * @returns {number}
    */
  def getSummaryValues(summaryCol: js.Any, summaryData: js.Any): Double = js.native
  
  /** Get the names of all the visible column collections in grid
    * @returns {any[]}
    */
  def getVisibleColumnNames(): js.Array[_] = js.native
  
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
  def hideColumns(headerText: js.Array[_]): Unit = js.native
  
  @JSName("model")
  var model_Grid_ : typings.ejWebAll.ej.Grid.Model = js.native
  
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
  def refreshData(additionalParameters: js.Any): Unit = js.native
  
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
  def removeSortedColumns(fieldName: js.Array[_]): Unit = js.native
  
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
  def reorderRows(indexes: js.Array[_], toIndex: Double): Unit = js.native
  
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
  def selectCells(rowCellIndexes: js.Any): Unit = js.native
  
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
  def selectRows(from: js.Array[_], to: Double): Unit = js.native
  def selectRows(from: js.Array[_], to: Double, target: js.Any): Unit = js.native
  def selectRows(from: Double, to: Double, target: js.Any): Unit = js.native
  /** Select rows in grid.
    * @param {any[]} Pass array of rowIndexes for selecting rows
    * @returns {void}
    */
  def selectRows(rowIndexes: js.Array[_]): Unit = js.native
  
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
  def setCellValue(Index: Double, fieldName: String, value: js.Any): Unit = js.native
  
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
  def setValidationToField(fieldName: String, rules: js.Any): Unit = js.native
  
  /** Send a request to grid to refresh the width set to columns
    * @returns {void}
    */
  def setWidthToColumns(): Unit = js.native
  
  def showColumns(headerText: String): Unit = js.native
  /** Show columns in the grid based on the header text
    * @param {any[]|string} you can pass either array of header text of various columns or a header text of a column to show
    * @returns {void}
    */
  def showColumns(headerText: js.Array[_]): Unit = js.native
  
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
  def updateRecord(fieldName: String, data: js.Array[_]): Unit = js.native
  
  /** It adapts grid to its parent element or to the browsers window.
    * @returns {void}
    */
  def windowonresize(): Unit = js.native
}
