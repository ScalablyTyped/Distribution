package typings.ejWebAll.ej

import typings.ejWebAll.ej.TreeGrid.EjPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeGrid
  extends StObject
     with Widget_ {
  
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
  
  var defaults: Model = js.native
  
  /** To delete the specified column
    * @param {number} Index of the column to be deleted
    * @returns {void}
    */
  def deleteColumn(columnIndex: Double): Unit = js.native
  
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
  def getSelectedCells(): js.Array[js.Any] = js.native
  
  /** To get the updated data source of TreeGrid.
    * @returns {any[]}
    */
  def getUpdatedRecords(): js.Array[js.Any] = js.native
  
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
  
  @JSName("model")
  var model_TreeGrid: Model = js.native
  
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
  def refresh(dataSource: js.Array[js.Any], query: js.Any): Unit = js.native
  
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
  def selectCells(Indexes: js.Array[js.Any], preservePreviousSelectedCell: Boolean): Unit = js.native
  
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
object TreeGrid {
  
  @js.native
  sealed trait BatchEditMode extends StObject
  @JSGlobal("ej.TreeGrid.BatchEditMode")
  @js.native
  object BatchEditMode extends StObject {
    
    ///you can edit a cell
    @js.native
    sealed trait Cell
      extends StObject
         with BatchEditMode
    
    ///you can edit a row in dialog form
    @js.native
    sealed trait Dialog
      extends StObject
         with BatchEditMode
    
    ///you can edit a row
    @js.native
    sealed trait Row
      extends StObject
         with BatchEditMode
  }
  
  @js.native
  sealed trait BeginEditAction extends StObject
  @JSGlobal("ej.TreeGrid.BeginEditAction")
  @js.native
  object BeginEditAction extends StObject {
    
    ///you can begin the editing at single click
    @js.native
    sealed trait Click
      extends StObject
         with BeginEditAction
    
    ///you can begin the editing at double click
    @js.native
    sealed trait DblClick
      extends StObject
         with BeginEditAction
  }
  
  @js.native
  sealed trait ClipMode extends StObject
  @JSGlobal("ej.TreeGrid.ClipMode")
  @js.native
  object ClipMode extends StObject {
    
    ///Truncate the text in the cell.
    @js.native
    sealed trait Clip
      extends StObject
         with ClipMode
    
    ///Shows ellipsis for the overflown cell.
    @js.native
    sealed trait Ellipsis
      extends StObject
         with ClipMode
  }
  
  @js.native
  sealed trait ColumnResizeMode extends StObject
  @JSGlobal("ej.TreeGrid.ColumnResizeMode")
  @js.native
  object ColumnResizeMode extends StObject {
    
    ///At load time column are rendered with given width value, while resizing the column only current column width is changed
    @js.native
    sealed trait FixedColumns
      extends StObject
         with ColumnResizeMode
    
    ///At load time columns are stretched with control width, while resizing the column, current column width adjusted based on next column
    @js.native
    sealed trait NextColumn
      extends StObject
         with ColumnResizeMode
    
    ///In this mode columns are stretched with control width in load time and on resizing action current column width was adjusted with all columns.
    @js.native
    sealed trait Normal
      extends StObject
         with ColumnResizeMode
  }
  
  @js.native
  sealed trait ContextMenuItems extends StObject
  @JSGlobal("ej.TreeGrid.ContextMenuItems")
  @js.native
  object ContextMenuItems extends StObject {
    
    ///Enables the add menu item in context menu
    @js.native
    sealed trait Add
      extends StObject
         with ContextMenuItems
    
    ///Enables the edit menu item in context menu
    @js.native
    sealed trait Delete
      extends StObject
         with ContextMenuItems
    
    ///Enables the edit menu item in context menu
    @js.native
    sealed trait Edit
      extends StObject
         with ContextMenuItems
  }
  
  @js.native
  sealed trait EditMode extends StObject
  @JSGlobal("ej.TreeGrid.EditMode")
  @js.native
  object EditMode extends StObject {
    
    ///you can edit and save bulk of records
    @js.native
    sealed trait BatchEditing
      extends StObject
         with EditMode
    
    ///you can edit a cell.
    @js.native
    sealed trait CellEditing
      extends StObject
         with EditMode
    
    ///you can edit a row in dialog form.
    @js.native
    sealed trait DialogEditing
      extends StObject
         with EditMode
    
    ///you can edit a row.
    @js.native
    sealed trait RowEditing
      extends StObject
         with EditMode
  }
  
  @js.native
  sealed trait EditingType extends StObject
  @JSGlobal("ej.TreeGrid.EditingType")
  @js.native
  object EditingType extends StObject {
    
    ///It Specifies Boolean edit type.
    @js.native
    sealed trait Boolean
      extends StObject
         with EditingType
    
    ///It Specifies DatePicker edit type.
    @js.native
    sealed trait DatePicker
      extends StObject
         with EditingType
    
    ///It Specifies DateTimePicker edit type.
    @js.native
    sealed trait DateTimePicker
      extends StObject
         with EditingType
    
    ///It Specifies Dropdown edit type.
    @js.native
    sealed trait Dropdown
      extends StObject
         with EditingType
    
    ///It Specifies Maskedit edit type.
    @js.native
    sealed trait Maskedit
      extends StObject
         with EditingType
    
    ///It Specifies Numeric edit type.
    @js.native
    sealed trait Numeric
      extends StObject
         with EditingType
    
    ///It Specifies String edit type.
    @js.native
    sealed trait String
      extends StObject
         with EditingType
  }
  
  @js.native
  sealed trait FilterHierarchyMode extends StObject
  @JSGlobal("ej.TreeGrid.FilterHierarchyMode")
  @js.native
  object FilterHierarchyMode extends StObject {
    
    ///shows the filtered record with both parent and child record
    @js.native
    sealed trait Both
      extends StObject
         with FilterHierarchyMode
    
    ///Shows the filtered record with child record
    @js.native
    sealed trait Child
      extends StObject
         with FilterHierarchyMode
    
    ///Shows only filtered record.
    @js.native
    sealed trait None
      extends StObject
         with FilterHierarchyMode
    
    ///Shows the filtered record with parent record
    @js.native
    sealed trait Parent
      extends StObject
         with FilterHierarchyMode
  }
  
  @js.native
  sealed trait FilterType extends StObject
  @JSGlobal("ej.TreeGrid.FilterType")
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
  sealed trait HeaderTextOverflow extends StObject
  @JSGlobal("ej.TreeGrid.HeaderTextOverflow")
  @js.native
  object HeaderTextOverflow extends StObject {
    
    ///You can disable the word wrap
    @js.native
    sealed trait None
      extends StObject
         with HeaderTextOverflow
    
    ///You can wrap the header content
    @js.native
    sealed trait Wrap
      extends StObject
         with HeaderTextOverflow
  }
  
  @js.native
  sealed trait PageSizeMode extends StObject
  @JSGlobal("ej.TreeGrid.PageSizeMode")
  @js.native
  object PageSizeMode extends StObject {
    
    ///To count all the parent and child records.
    @js.native
    sealed trait All
      extends StObject
         with PageSizeMode
    
    ///To count the Zeroth level parent records.
    @js.native
    sealed trait Root
      extends StObject
         with PageSizeMode
  }
  
  @js.native
  sealed trait PrintMode extends StObject
  @JSGlobal("ej.TreeGrid.PrintMode")
  @js.native
  object PrintMode extends StObject {
    
    ///To print all the pages
    @js.native
    sealed trait AllPages
      extends StObject
         with PrintMode
    
    ///To print only the current page content.
    @js.native
    sealed trait CurrentPage
      extends StObject
         with PrintMode
  }
  
  @js.native
  sealed trait RowPosition extends StObject
  @JSGlobal("ej.TreeGrid.RowPosition")
  @js.native
  object RowPosition extends StObject {
    
    ///you can add a new row to above selected row.
    @js.native
    sealed trait Above
      extends StObject
         with RowPosition
    
    ///you can add a new row to below selected row.
    @js.native
    sealed trait Below
      extends StObject
         with RowPosition
    
    ///you can add a new row at bottom.
    @js.native
    sealed trait Bottom
      extends StObject
         with RowPosition
    
    ///you can add a new row as a child for selected row.
    @js.native
    sealed trait Child
      extends StObject
         with RowPosition
    
    ///you can add a new row at top.
    @js.native
    sealed trait Top
      extends StObject
         with RowPosition
  }
  
  @js.native
  sealed trait SearchHierarchyMode extends StObject
  @JSGlobal("ej.TreeGrid.SearchHierarchyMode")
  @js.native
  object SearchHierarchyMode extends StObject {
    
    ///Filtered child records will be displayed with parents and parents will be displayed along with its children
    @js.native
    sealed trait Both
      extends StObject
         with SearchHierarchyMode
    
    ///Filtered child records will be displayed and parent records displayed along with its children.
    @js.native
    sealed trait Child
      extends StObject
         with SearchHierarchyMode
    
    ///Filtered records alone will be displayed without it parents or children
    @js.native
    sealed trait None
      extends StObject
         with SearchHierarchyMode
    
    ///Parent level records will be included in searching
    @js.native
    sealed trait Parent
      extends StObject
         with SearchHierarchyMode
  }
  
  @js.native
  sealed trait SelectionMode extends StObject
  @JSGlobal("ej.TreeGrid.SelectionMode")
  @js.native
  object SelectionMode extends StObject {
    
    ///you can select a cell.
    @js.native
    sealed trait Cell
      extends StObject
         with SelectionMode
    
    ///you can select a row.
    @js.native
    sealed trait Row
      extends StObject
         with SelectionMode
  }
  
  @js.native
  sealed trait SelectionType extends StObject
  @JSGlobal("ej.TreeGrid.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    ///you can select rows using checkbox.
    @js.native
    sealed trait Checkbox
      extends StObject
         with SelectionType
    
    ///you can select a multiple row.
    @js.native
    sealed trait Multiple
      extends StObject
         with SelectionType
    
    ///you can select a single row.
    @js.native
    sealed trait Single
      extends StObject
         with SelectionType
  }
  
  @js.native
  sealed trait SummaryType extends StObject
  @JSGlobal("ej.TreeGrid.SummaryType")
  @js.native
  object SummaryType extends StObject {
    
    ///Displays the average of summary column
    @js.native
    sealed trait Average
      extends StObject
         with SummaryType
    
    ///Displays the total count of summary column
    @js.native
    sealed trait Count
      extends StObject
         with SummaryType
    
    ///Displays the value from custom summary function
    @js.native
    sealed trait Custom
      extends StObject
         with SummaryType
    
    ///Displays the false count value for boolean summary columns
    @js.native
    sealed trait FalseCount
      extends StObject
         with SummaryType
    
    ///Displays the maximum value of summary column
    @js.native
    sealed trait Maximum
      extends StObject
         with SummaryType
    
    ///Displays the maximum date value in summary column
    @js.native
    sealed trait MaximumDate
      extends StObject
         with SummaryType
    
    ///Displays the minimum value of summary column
    @js.native
    sealed trait Minimum
      extends StObject
         with SummaryType
    
    ///Displays the minimum date value in summary column
    @js.native
    sealed trait MinimumDate
      extends StObject
         with SummaryType
    
    ///Displays the sum of summary column
    @js.native
    sealed trait Sum
      extends StObject
         with SummaryType
    
    ///Displays the true count value for boolean summary columns
    @js.native
    sealed trait TrueCount
      extends StObject
         with SummaryType
  }
  
  @js.native
  sealed trait ToolbarItems extends StObject
  @JSGlobal("ej.TreeGrid.ToolbarItems")
  @js.native
  object ToolbarItems extends StObject {
    
    ///Enables the add icon in toolbar
    @js.native
    sealed trait Add
      extends StObject
         with ToolbarItems
    
    ///Enables the cancel icon in toolbar
    @js.native
    sealed trait Cancel
      extends StObject
         with ToolbarItems
    
    ///Enables the collapse all icon in toolbar
    @js.native
    sealed trait CollapseAll
      extends StObject
         with ToolbarItems
    
    ///Enables the edit icon in toolbar
    @js.native
    sealed trait Delete
      extends StObject
         with ToolbarItems
    
    ///Enables the edit icon in toolbar
    @js.native
    sealed trait Edit
      extends StObject
         with ToolbarItems
    
    ///Enables the excel export icon in toolbar
    @js.native
    sealed trait ExcelExport
      extends StObject
         with ToolbarItems
    
    ///Enables the expand all icon in toolbar
    @js.native
    sealed trait ExpandAll
      extends StObject
         with ToolbarItems
    
    ///Enables the PDF export icon in toolbar
    @js.native
    sealed trait PdfExport
      extends StObject
         with ToolbarItems
    
    ///Enables the printing icon in toolbar
    @js.native
    sealed trait Print
      extends StObject
         with ToolbarItems
    
    ///Enables the search textbox in toolbar
    @js.native
    sealed trait Search
      extends StObject
         with ToolbarItems
    
    ///Enables the update icon in toolbar
    @js.native
    sealed trait Update
      extends StObject
         with ToolbarItems
  }
  
  @js.native
  sealed trait UnboundType extends StObject
  @JSGlobal("ej.TreeGrid.UnboundType")
  @js.native
  object UnboundType extends StObject {
    
    ///Unbound type to perform cancel action
    @js.native
    sealed trait Cancel
      extends StObject
         with UnboundType
    
    ///Unbound type to perform delete action
    @js.native
    sealed trait Delete
      extends StObject
         with UnboundType
    
    ///Unbound type to perform edit action
    @js.native
    sealed trait Edit
      extends StObject
         with UnboundType
    
    ///Unbound type to perform save action
    @js.native
    sealed trait Save
      extends StObject
         with UnboundType
  }
  
  trait ActionBeginEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current grouped column field name.
      */
    var columnName: js.UndefOr[String] = js.undefined
    
    /** Returns the direction of sorting ascending or descending.
      */
    var columnSortDirection: js.UndefOr[String] = js.undefined
    
    /** Returns the data or deleting element.
      */
    var data: js.UndefOr[String] = js.undefined
    
    /** Returns the value of expanding parent element.
      */
    var keyValue: js.UndefOr[String] = js.undefined
    
    /** Returns the TreeGrid model.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
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
      def setKeyValue(value: String): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
      
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
  
  trait ActionCompleteEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current grouped column field name.
      */
    var columnName: js.UndefOr[String] = js.undefined
    
    /** Returns the direction of sorting ascending or descending
      */
    var columnSortDirection: js.UndefOr[String] = js.undefined
    
    /** Returns the data of deleted element.
      */
    var data: js.UndefOr[String] = js.undefined
    
    /** Returns the value of searched element.
      */
    var keyValue: js.UndefOr[String] = js.undefined
    
    /** Returns the grid model.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** Returns selected record index
      */
    var recordIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
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
  
  trait BeforePrintEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the TreeGrid element which is going to be print
      */
    var element: js.UndefOr[js.Any] = js.undefined
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.undefined
  }
  object BeforePrintEventArgs {
    
    @scala.inline
    def apply(): BeforePrintEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforePrintEventArgs]
    }
    
    @scala.inline
    implicit class BeforePrintEventArgsMutableBuilder[Self <: BeforePrintEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
    }
  }
  
  trait BeginEditEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Element of editing cell.
      */
    var cellElement: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the column Index of cell belongs.
      */
    var columnIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the data of current cell record.
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the row element of editing cell.
      */
    var rowElement: js.UndefOr[js.Any] = js.undefined
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
  
  trait CellSelectedEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the cell index on the selection.
      */
    var cellIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the selecting record object
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the Gantt object Model
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the previously selected cell index
      */
    var previousCellIndex: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the previously selected row data
      */
    var previousData: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the previously selected row index
      */
    var previousRowIndex: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the previously selected cell element
      */
    var previousTargetCell: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the previously selected row element
      */
    var previousTargetRow: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the row index on the selection
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the selecting cell element
      */
    var targetCell: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the selecting row element
      */
    var targetRow: js.UndefOr[js.Any] = js.undefined
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
  
  trait CellSelectingEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the cell index on the selection.
      */
    var cellIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the selecting record object
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the Gantt object Model
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the row index on the selection
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the selecting cell element
      */
    var targetCell: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the selecting row element
      */
    var targetRow: js.UndefOr[js.Any] = js.undefined
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
  
  trait CollapsedEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the data of collapsed record..
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** Returns state of a record whether it is in expanded or collapsed state.
      */
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the row index of collapsed record.
      */
    var recordIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns Request Type.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the event type.
      */
    var `type`: js.UndefOr[String] = js.undefined
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
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CollapsingEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the data of collapsing record..
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** Returns state of a record whether it is in expanded or collapsing state.
      */
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the row index of collapsing record.
      */
    var recordIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the event Type.
      */
    var `type`: js.UndefOr[String] = js.undefined
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
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Column extends StObject {
    
    /** Enables/disables cell selection.
      * @Default {false}
      */
    var allowCellSelection: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the ability to edit a row or cell.
      * @Default {false}
      */
    var allowEditing: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the ability to filter the rows based on this column.
      * @Default {false}
      */
    var allowFiltering: js.UndefOr[Boolean] = js.undefined
    
    /** Enables the blanks option in ejDropDownList mapped in TreeGrid column
      * @Default {true}
      */
    var allowFilteringBlankContent: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the ability to freeze/unfreeze the columns
      * @Default {false}
      */
    var allowFreezing: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the ability to sort the rows based on this column/field.
      * @Default {false}
      */
    var allowSorting: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the template ID or the template string of the AngularJS script element to enable column template for a column.
      */
    var angularTemplate: js.UndefOr[String] = js.undefined
    
    /** Sets the clip mode for TreeGrid cell as ellipsis or clipped content(both header and content)
      * @Default {ej.TreeGrid.ClipMode.Clip}
      */
    var clipMode: js.UndefOr[ClipMode | String] = js.undefined
    
    /** Gets or sets an object to define a command column in TreeGrid.
      * @Default {[]}
      */
    var commands: js.UndefOr[js.Array[ColumnsCommand]] = js.undefined
    
    /** Gets or sets a value that indicates to display a column value as checkbox or string
      * @Default {false}
      */
    var displayAsCheckbox: js.UndefOr[Boolean] = js.undefined
    
    /** To bind the dropdown data for TreeGrid column mapped with ejDropDownList
      */
    var dropdownData: js.UndefOr[String] = js.undefined
    
    /** To customize the ej controls defined in TreeGrid column with their native property.
      */
    var editParams: js.UndefOr[js.Any] = js.undefined
    
    /** Gets or sets a template that displays a custom editor for editing the column values.
      * @Default {null}
      */
    var editTemplate: js.UndefOr[js.Any] = js.undefined
    
    /** Specifies the edit type of the column.
      * @Default {ej.TreeGrid.EditingType.String}
      */
    var editType: js.UndefOr[EditingType | String] = js.undefined
    
    /** Specifies the name of the field from the dataSource to bind with this column.
      */
    var field: js.UndefOr[String] = js.undefined
    
    /** Specifies the type of the editor control to be used to filter the rows.
      * @Default {ej.TreeGrid.EditingType.String}
      */
    var filterEditType: js.UndefOr[EditingType | String] = js.undefined
    
    /** Gets or sets a value to render either excel or menu filtering in TreeGrid column filtering.
      * @Default {null}
      */
    var filterType: js.UndefOr[FilterType_ | String] = js.undefined
    
    /** Specifies the display format of a column
      * @Default {null}
      */
    var format: js.UndefOr[js.Any] = js.undefined
    
    /** Specifies the header template value for the column header
      */
    var headerTemplateID: js.UndefOr[String] = js.undefined
    
    /** Header text of the column.
      * @Default {null}
      */
    var headerText: js.UndefOr[String] = js.undefined
    
    /** Specifies the alignment of the column header text
      * @Default {ej.TextAlign.Left}
      */
    var headerTextAlign: js.UndefOr[TextAlign | String] = js.undefined
    
    /** Sets the tooltip template for the column header
      * @Default {null}
      */
    var headerTooltip: js.UndefOr[String] = js.undefined
    
    /** Specifies whether the column is frozen
      * @Default {false}
      */
    var isFrozen: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether the column is a template column
      * @Default {false}
      */
    var isTemplateColumn: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets the priority value of the column. It is used to show/hide TreeGrid columns in responsive mode.
      * @Default {-1}
      */
    var priority: js.UndefOr[Double] = js.undefined
    
    /** Enables or disables the checkbox visibility in a column for checkbox selection.
      * @Default {false}
      */
    var showCheckbox: js.UndefOr[Boolean] = js.undefined
    
    /** We can include or exclude particular column from column visibility list in column menu.
      * @Default {true}
      */
    var showInColumnChooser: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the template string of the script element to enable column template for a column.
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** Specifies the template ID of the script element to enable column template for a column.
      */
    var templateID: js.UndefOr[String] = js.undefined
    
    /** Specifies the text alignment for the column
      * @Default {ej.TextAlign.Left}
      */
    var textAlign: js.UndefOr[TextAlign | String] = js.undefined
    
    /** Sets the tooltip template for the specific column.
      * @Default {null}
      */
    var tooltip: js.UndefOr[String] = js.undefined
    
    /** specifies the conditions for saving data to the database while adding or editing the fields.
      */
    var validationRules: js.UndefOr[js.Any] = js.undefined
    
    /** Controls the visibility of the column.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value for TreeGrid column width
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Column {
    
    @scala.inline
    def apply(): Column = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowCellSelection(value: Boolean): Self = StObject.set(x, "allowCellSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowCellSelectionUndefined: Self = StObject.set(x, "allowCellSelection", js.undefined)
      
      @scala.inline
      def setAllowEditing(value: Boolean): Self = StObject.set(x, "allowEditing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEditingUndefined: Self = StObject.set(x, "allowEditing", js.undefined)
      
      @scala.inline
      def setAllowFiltering(value: Boolean): Self = StObject.set(x, "allowFiltering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFilteringBlankContent(value: Boolean): Self = StObject.set(x, "allowFilteringBlankContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFilteringBlankContentUndefined: Self = StObject.set(x, "allowFilteringBlankContent", js.undefined)
      
      @scala.inline
      def setAllowFilteringUndefined: Self = StObject.set(x, "allowFiltering", js.undefined)
      
      @scala.inline
      def setAllowFreezing(value: Boolean): Self = StObject.set(x, "allowFreezing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFreezingUndefined: Self = StObject.set(x, "allowFreezing", js.undefined)
      
      @scala.inline
      def setAllowSorting(value: Boolean): Self = StObject.set(x, "allowSorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSortingUndefined: Self = StObject.set(x, "allowSorting", js.undefined)
      
      @scala.inline
      def setAngularTemplate(value: String): Self = StObject.set(x, "angularTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngularTemplateUndefined: Self = StObject.set(x, "angularTemplate", js.undefined)
      
      @scala.inline
      def setClipMode(value: ClipMode | String): Self = StObject.set(x, "clipMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipModeUndefined: Self = StObject.set(x, "clipMode", js.undefined)
      
      @scala.inline
      def setCommands(value: js.Array[ColumnsCommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
      
      @scala.inline
      def setCommandsVarargs(value: ColumnsCommand*): Self = StObject.set(x, "commands", js.Array(value :_*))
      
      @scala.inline
      def setDisplayAsCheckbox(value: Boolean): Self = StObject.set(x, "displayAsCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayAsCheckboxUndefined: Self = StObject.set(x, "displayAsCheckbox", js.undefined)
      
      @scala.inline
      def setDropdownData(value: String): Self = StObject.set(x, "dropdownData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownDataUndefined: Self = StObject.set(x, "dropdownData", js.undefined)
      
      @scala.inline
      def setEditParams(value: js.Any): Self = StObject.set(x, "editParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditParamsUndefined: Self = StObject.set(x, "editParams", js.undefined)
      
      @scala.inline
      def setEditTemplate(value: js.Any): Self = StObject.set(x, "editTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditTemplateUndefined: Self = StObject.set(x, "editTemplate", js.undefined)
      
      @scala.inline
      def setEditType(value: EditingType | String): Self = StObject.set(x, "editType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditTypeUndefined: Self = StObject.set(x, "editType", js.undefined)
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setFilterEditType(value: EditingType | String): Self = StObject.set(x, "filterEditType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterEditTypeUndefined: Self = StObject.set(x, "filterEditType", js.undefined)
      
      @scala.inline
      def setFilterType(value: FilterType_ | String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      @scala.inline
      def setFormat(value: js.Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHeaderTemplateID(value: String): Self = StObject.set(x, "headerTemplateID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTemplateIDUndefined: Self = StObject.set(x, "headerTemplateID", js.undefined)
      
      @scala.inline
      def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTextAlign(value: TextAlign | String): Self = StObject.set(x, "headerTextAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTextAlignUndefined: Self = StObject.set(x, "headerTextAlign", js.undefined)
      
      @scala.inline
      def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
      
      @scala.inline
      def setHeaderTooltip(value: String): Self = StObject.set(x, "headerTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTooltipUndefined: Self = StObject.set(x, "headerTooltip", js.undefined)
      
      @scala.inline
      def setIsFrozen(value: Boolean): Self = StObject.set(x, "isFrozen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFrozenUndefined: Self = StObject.set(x, "isFrozen", js.undefined)
      
      @scala.inline
      def setIsTemplateColumn(value: Boolean): Self = StObject.set(x, "isTemplateColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTemplateColumnUndefined: Self = StObject.set(x, "isTemplateColumn", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setShowCheckbox(value: Boolean): Self = StObject.set(x, "showCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCheckboxUndefined: Self = StObject.set(x, "showCheckbox", js.undefined)
      
      @scala.inline
      def setShowInColumnChooser(value: Boolean): Self = StObject.set(x, "showInColumnChooser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowInColumnChooserUndefined: Self = StObject.set(x, "showInColumnChooser", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateID(value: String): Self = StObject.set(x, "templateID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateIDUndefined: Self = StObject.set(x, "templateID", js.undefined)
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTextAlign(value: TextAlign | String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setValidationRules(value: js.Any): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ColumnDragEventArgs extends StObject {
    
    /** Returns that we can drop over the column or not.
      */
    var canDrop: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the column data which is dragged
      */
    var draggedColumn: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the index of the column being dragged
      */
    var draggedColumnIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the control model values.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the target column data
      */
    var targetColumn: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the index of the target column
      */
    var targetColumnIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the event Type.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ColumnDragEventArgs {
    
    @scala.inline
    def apply(): ColumnDragEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnDragEventArgs]
    }
    
    @scala.inline
    implicit class ColumnDragEventArgsMutableBuilder[Self <: ColumnDragEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanDrop(value: Boolean): Self = StObject.set(x, "canDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanDropUndefined: Self = StObject.set(x, "canDrop", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDraggedColumn(value: js.Any): Self = StObject.set(x, "draggedColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedColumnIndex(value: Double): Self = StObject.set(x, "draggedColumnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedColumnIndexUndefined: Self = StObject.set(x, "draggedColumnIndex", js.undefined)
      
      @scala.inline
      def setDraggedColumnUndefined: Self = StObject.set(x, "draggedColumn", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setTargetColumn(value: js.Any): Self = StObject.set(x, "targetColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetColumnIndex(value: Double): Self = StObject.set(x, "targetColumnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetColumnIndexUndefined: Self = StObject.set(x, "targetColumnIndex", js.undefined)
      
      @scala.inline
      def setTargetColumnUndefined: Self = StObject.set(x, "targetColumn", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ColumnDragStartEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the column data which is dragged
      */
    var draggedColumn: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the index of the column being dragged
      */
    var draggedColumnIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the control model values.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the event Type.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ColumnDragStartEventArgs {
    
    @scala.inline
    def apply(): ColumnDragStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnDragStartEventArgs]
    }
    
    @scala.inline
    implicit class ColumnDragStartEventArgsMutableBuilder[Self <: ColumnDragStartEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDraggedColumn(value: js.Any): Self = StObject.set(x, "draggedColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedColumnIndex(value: Double): Self = StObject.set(x, "draggedColumnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedColumnIndexUndefined: Self = StObject.set(x, "draggedColumnIndex", js.undefined)
      
      @scala.inline
      def setDraggedColumnUndefined: Self = StObject.set(x, "draggedColumn", js.undefined)
      
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
  
  trait ColumnDropEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the column data which is dragged
      */
    var draggedColumn: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the index of the column being dragged
      */
    var draggedColumnIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the control model values.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the target column data
      */
    var targetColumn: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the index of the target column
      */
    var targetColumnIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the event Type.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ColumnDropEventArgs {
    
    @scala.inline
    def apply(): ColumnDropEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnDropEventArgs]
    }
    
    @scala.inline
    implicit class ColumnDropEventArgsMutableBuilder[Self <: ColumnDropEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDraggedColumn(value: js.Any): Self = StObject.set(x, "draggedColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedColumnIndex(value: Double): Self = StObject.set(x, "draggedColumnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedColumnIndexUndefined: Self = StObject.set(x, "draggedColumnIndex", js.undefined)
      
      @scala.inline
      def setDraggedColumnUndefined: Self = StObject.set(x, "draggedColumn", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setTargetColumn(value: js.Any): Self = StObject.set(x, "targetColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetColumnIndex(value: Double): Self = StObject.set(x, "targetColumnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetColumnIndexUndefined: Self = StObject.set(x, "targetColumnIndex", js.undefined)
      
      @scala.inline
      def setTargetColumnUndefined: Self = StObject.set(x, "targetColumn", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ColumnResizeEndEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the column data in which the resizing started
      */
    var column: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the column index in which the resizing started
      */
    var columnIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the column width difference, before and after the resizing
      */
    var extra: js.UndefOr[Double] = js.undefined
    
    /** Returns the control model values.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the new column width after resized
      */
    var newWidth: js.UndefOr[Double] = js.undefined
    
    /** Returns column width before dragging
      */
    var oldWidth: js.UndefOr[Double] = js.undefined
    
    /** Returns initial column element object.
      */
    var target: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the event Type.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ColumnResizeEndEventArgs {
    
    @scala.inline
    def apply(): ColumnResizeEndEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnResizeEndEventArgs]
    }
    
    @scala.inline
    implicit class ColumnResizeEndEventArgsMutableBuilder[Self <: ColumnResizeEndEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setExtra(value: Double): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setNewWidth(value: Double): Self = StObject.set(x, "newWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewWidthUndefined: Self = StObject.set(x, "newWidth", js.undefined)
      
      @scala.inline
      def setOldWidth(value: Double): Self = StObject.set(x, "oldWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldWidthUndefined: Self = StObject.set(x, "oldWidth", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ColumnResizeSettings extends StObject {
    
    /** Specifies the mode for column resizing
      * @Default {ej.TreeGrid.ColumnResizeMode.Normal}
      */
    var columnResizeMode: js.UndefOr[ColumnResizeMode | String] = js.undefined
  }
  object ColumnResizeSettings {
    
    @scala.inline
    def apply(): ColumnResizeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnResizeSettings]
    }
    
    @scala.inline
    implicit class ColumnResizeSettingsMutableBuilder[Self <: ColumnResizeSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnResizeMode(value: ColumnResizeMode | String): Self = StObject.set(x, "columnResizeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnResizeModeUndefined: Self = StObject.set(x, "columnResizeMode", js.undefined)
    }
  }
  
  trait ColumnResizeStartEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the column data in which the resizing started
      */
    var column: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the column index in which the resizing started
      */
    var columnIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the control model values.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** Returns column width before dragging
      */
    var oldWidth: js.UndefOr[Double] = js.undefined
    
    /** Returns initial column element object.
      */
    var target: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the event Type.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ColumnResizeStartEventArgs {
    
    @scala.inline
    def apply(): ColumnResizeStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnResizeStartEventArgs]
    }
    
    @scala.inline
    implicit class ColumnResizeStartEventArgsMutableBuilder[Self <: ColumnResizeStartEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setOldWidth(value: Double): Self = StObject.set(x, "oldWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldWidthUndefined: Self = StObject.set(x, "oldWidth", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ColumnResizedEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the column data which is resized
      */
    var column: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the index of the column being resized.
      */
    var columnIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the control model values.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** Returns resized column width after resized.
      */
    var newWidth: js.UndefOr[Double] = js.undefined
    
    /** Returns resized column width before resizing
      */
    var oldWidth: js.UndefOr[Double] = js.undefined
    
    /** Returns the event Type.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ColumnResizedEventArgs {
    
    @scala.inline
    def apply(): ColumnResizedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnResizedEventArgs]
    }
    
    @scala.inline
    implicit class ColumnResizedEventArgsMutableBuilder[Self <: ColumnResizedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setNewWidth(value: Double): Self = StObject.set(x, "newWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewWidthUndefined: Self = StObject.set(x, "newWidth", js.undefined)
      
      @scala.inline
      def setOldWidth(value: Double): Self = StObject.set(x, "oldWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldWidthUndefined: Self = StObject.set(x, "oldWidth", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ColumnsCommand extends StObject {
    
    /** Gets or sets an object to customize command button with available ejButton properties.
      */
    var buttonOptions: js.UndefOr[js.Any] = js.undefined
    
    /** Gets or sets a value that define the command column buttons to be displayed.
      */
    var `type`: js.UndefOr[UnboundType | String] = js.undefined
  }
  object ColumnsCommand {
    
    @scala.inline
    def apply(): ColumnsCommand = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnsCommand]
    }
    
    @scala.inline
    implicit class ColumnsCommandMutableBuilder[Self <: ColumnsCommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonOptions(value: js.Any): Self = StObject.set(x, "buttonOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonOptionsUndefined: Self = StObject.set(x, "buttonOptions", js.undefined)
      
      @scala.inline
      def setType(value: UnboundType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ContextMenuOpenEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the default context menu items to which we add custom items.
      */
    var contextMenuItems: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Returns the TreeGrid model.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
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
      def setContextMenuItems(value: js.Array[js.Any]): Self = StObject.set(x, "contextMenuItems", value.asInstanceOf[js.Any])
      
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
  
  trait ContextMenuSettings extends StObject {
    
    /** Option for adding items to context menu.
      * @Default {[]}
      */
    var contextMenuItems: js.UndefOr[js.Array[ContextMenuItems | String]] = js.undefined
    
    /** Shows/hides the context menu.
      * @Default {false}
      */
    var showContextMenu: js.UndefOr[Boolean] = js.undefined
  }
  object ContextMenuSettings {
    
    @scala.inline
    def apply(): ContextMenuSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuSettings]
    }
    
    @scala.inline
    implicit class ContextMenuSettingsMutableBuilder[Self <: ContextMenuSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContextMenuItems(value: js.Array[ContextMenuItems | String]): Self = StObject.set(x, "contextMenuItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuItemsUndefined: Self = StObject.set(x, "contextMenuItems", js.undefined)
      
      @scala.inline
      def setContextMenuItemsVarargs(value: (ContextMenuItems | String)*): Self = StObject.set(x, "contextMenuItems", js.Array(value :_*))
      
      @scala.inline
      def setShowContextMenu(value: Boolean): Self = StObject.set(x, "showContextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowContextMenuUndefined: Self = StObject.set(x, "showContextMenu", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the TreeGrid model
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
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
  
  trait DetailsDataBoundEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the data collection of selected row.
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the details element of selected row.
      */
    var detailsElement: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the TreeGrid model
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the rowIndex of selected row.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DetailsDataBoundEventArgs {
    
    @scala.inline
    def apply(): DetailsDataBoundEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetailsDataBoundEventArgs]
    }
    
    @scala.inline
    implicit class DetailsDataBoundEventArgsMutableBuilder[Self <: DetailsDataBoundEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDetailsElement(value: js.Any): Self = StObject.set(x, "detailsElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsElementUndefined: Self = StObject.set(x, "detailsElement", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DetailsHiddenEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the TreeGrid model
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the data collection of hidden details Template
      */
    var rowData: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DetailsHiddenEventArgs {
    
    @scala.inline
    def apply(): DetailsHiddenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetailsHiddenEventArgs]
    }
    
    @scala.inline
    implicit class DetailsHiddenEventArgsMutableBuilder[Self <: DetailsHiddenEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
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
  
  trait DetailsShownEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the data collection of selected row.
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the details element of selected row.
      */
    var detailsElement: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the TreeGrid model
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the rowIndex of selected row.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DetailsShownEventArgs {
    
    @scala.inline
    def apply(): DetailsShownEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetailsShownEventArgs]
    }
    
    @scala.inline
    implicit class DetailsShownEventArgsMutableBuilder[Self <: DetailsShownEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDetailsElement(value: js.Any): Self = StObject.set(x, "detailsElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsElementUndefined: Self = StObject.set(x, "detailsElement", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DragTooltip extends StObject {
    
    /** Specifies whether to show tooltip while dragging a row.
      * @Default {true}
      */
    var showTooltip: js.UndefOr[Boolean] = js.undefined
    
    /** Option to add field names whose corresponding values in the dragged row needs to be shown in the preview tooltip.
      * @Default {[]}
      */
    var tooltipItems: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Custom template for that tooltip that is shown while dragging a row.
      * @Default {null}
      */
    var tooltipTemplate: js.UndefOr[String] = js.undefined
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
      def setTooltipItems(value: js.Array[js.Any]): Self = StObject.set(x, "tooltipItems", value.asInstanceOf[js.Any])
      
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
  
  trait EditSettings extends StObject {
    
    /** Enables or disables the button to add new row in context menu as well as in toolbar.
      * @Default {true}
      */
    var allowAdding: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the button to delete the selected row in context menu as well as in toolbar.
      * @Default {true}
      */
    var allowDeleting: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the ability to edit a row or cell.
      * @Default {false}
      */
    var allowEditing: js.UndefOr[Boolean] = js.undefined
    
    /** specifies the batch edit mode in TreeGrid.
      */
    var batchEditSettings: js.UndefOr[EditSettingsBatchEditSettings] = js.undefined
    
    /** Specifies the mouse action whether single click or double click to begin the editing
      * @Default {ej.TreeGrid.BeginEditAction.DblClick}
      */
    var beginEditAction: js.UndefOr[BeginEditAction | String] = js.undefined
    
    /** Specifies the template ID for the custom dialog.
      * @Default {null}
      */
    var dialogEditorTemplateID: js.UndefOr[String] = js.undefined
    
    /** specifies the edit mode in TreeGrid , &quot;cellEditing&quot; is for cell type editing and &quot;rowEditing&quot; is for entire row.
      * @Default {ej.TreeGrid.EditMode.CellEditing}
      */
    var editMode: js.UndefOr[EditMode | String] = js.undefined
    
    /** Specifies the position where the new row has to be added.
      * @Default {ej.TreeGrid.RowPosition.Top}
      */
    var rowPosition: js.UndefOr[RowPosition | String] = js.undefined
    
    /** Enable or disable the confirmation dialog while deleting the record.
      * @Default {false}
      */
    var showDeleteConfirmDialog: js.UndefOr[Boolean] = js.undefined
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
      def setBatchEditSettings(value: EditSettingsBatchEditSettings): Self = StObject.set(x, "batchEditSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchEditSettingsUndefined: Self = StObject.set(x, "batchEditSettings", js.undefined)
      
      @scala.inline
      def setBeginEditAction(value: BeginEditAction | String): Self = StObject.set(x, "beginEditAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeginEditActionUndefined: Self = StObject.set(x, "beginEditAction", js.undefined)
      
      @scala.inline
      def setDialogEditorTemplateID(value: String): Self = StObject.set(x, "dialogEditorTemplateID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogEditorTemplateIDUndefined: Self = StObject.set(x, "dialogEditorTemplateID", js.undefined)
      
      @scala.inline
      def setEditMode(value: EditMode | String): Self = StObject.set(x, "editMode", value.asInstanceOf[js.Any])
      
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
  
  trait EditSettingsBatchEditSettings extends StObject {
    
    /** Specifies the batch edit mode whether it is cell, row or dialog.
      * @Default {ej.TreeGrid.BatchEditMode.Cell}
      */
    var editMode: js.UndefOr[BatchEditMode | String] = js.undefined
  }
  object EditSettingsBatchEditSettings {
    
    @scala.inline
    def apply(): EditSettingsBatchEditSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditSettingsBatchEditSettings]
    }
    
    @scala.inline
    implicit class EditSettingsBatchEditSettingsMutableBuilder[Self <: EditSettingsBatchEditSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEditMode(value: BatchEditMode | String): Self = StObject.set(x, "editMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditModeUndefined: Self = StObject.set(x, "editMode", js.undefined)
    }
  }
  
  trait EjPredicate extends StObject {
    
    /** Pass the field name of the column.
      */
    var fieldName: js.UndefOr[String] = js.undefined
    
    /** string/integer/date operator.
      */
    var filterOperator: js.UndefOr[String] = js.undefined
    
    /** Pass the value to be filtered in a column.
      */
    var filterValue: js.UndefOr[String] = js.undefined
    
    /** Optional - pass the ignore case value as true/false.
      */
    var ignoreCase: js.UndefOr[Boolean] = js.undefined
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
  
  trait EndEditEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Element of editing cell.
      */
    var cellElement: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the column name of edited cell belongs.
      */
    var columnName: js.UndefOr[String] = js.undefined
    
    /** Returns the column object of edited cell belongs.
      */
    var columnObject: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the data of edited cell record.
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the row element of editing cell.
      */
    var rowElement: js.UndefOr[js.Any] = js.undefined
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
  
  trait ExpandedEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the data of expanded record..
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** Returns state of a record whether it is in expanded or expanded state.
      */
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the row index of expanded record.
      */
    var recordIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns Request Type.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the event type.
      */
    var `type`: js.UndefOr[String] = js.undefined
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
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ExpandingEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the data of expanding record..
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** Returns state of a record whether it is in expanded or collapsed state.
      */
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the row index of expanding record.
      */
    var recordIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the event Type.
      */
    var `type`: js.UndefOr[String] = js.undefined
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
      def setRecordIndex(value: Double): Self = StObject.set(x, "recordIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordIndexUndefined: Self = StObject.set(x, "recordIndex", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait FilterSettings extends StObject {
    
    /** Gets or sets a value that indicates to perform the filter operation with case sensitive in excel styled filter menu mode.
      * @Default {false}
      */
    var enableCaseSensitivity: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the ability to filter the columns with empty, null and undefined values.
      * @Default {true}
      */
    var enableComplexBlankFilter: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the mode on which column filtering should start
      * @Default {immediate}
      */
    var filterBarMode: js.UndefOr[String] = js.undefined
    
    /** Specifies the mode of filtering to filter the record with or without hierarchy.
      * @Default {ej.TreeGrid.FilterHierarchyMode.Parent}
      */
    var filterHierarchyMode: js.UndefOr[FilterHierarchyMode | String] = js.undefined
    
    /** Specifies the type of column filtering.
      * @Default {ej.TreeGrid.FilterType.FilterBar}
      */
    var filterType: js.UndefOr[FilterType_ | String] = js.undefined
    
    /** Specifies the column collection for filtering the TreeGrid content on initial load
      * @Default {[]}
      */
    var filteredColumns: js.UndefOr[js.Array[FilterSettingsFilteredColumn]] = js.undefined
    
    /** Gets or sets a value that indicates the maximum number of filter choices that can be showed in the excel styled filter menu.
      * @Default {1000}
      */
    var maxFilterChoices: js.UndefOr[Double] = js.undefined
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
      def setEnableCaseSensitivity(value: Boolean): Self = StObject.set(x, "enableCaseSensitivity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCaseSensitivityUndefined: Self = StObject.set(x, "enableCaseSensitivity", js.undefined)
      
      @scala.inline
      def setEnableComplexBlankFilter(value: Boolean): Self = StObject.set(x, "enableComplexBlankFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableComplexBlankFilterUndefined: Self = StObject.set(x, "enableComplexBlankFilter", js.undefined)
      
      @scala.inline
      def setFilterBarMode(value: String): Self = StObject.set(x, "filterBarMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterBarModeUndefined: Self = StObject.set(x, "filterBarMode", js.undefined)
      
      @scala.inline
      def setFilterHierarchyMode(value: FilterHierarchyMode | String): Self = StObject.set(x, "filterHierarchyMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterHierarchyModeUndefined: Self = StObject.set(x, "filterHierarchyMode", js.undefined)
      
      @scala.inline
      def setFilterType(value: FilterType_ | String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      @scala.inline
      def setFilteredColumns(value: js.Array[FilterSettingsFilteredColumn]): Self = StObject.set(x, "filteredColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredColumnsUndefined: Self = StObject.set(x, "filteredColumns", js.undefined)
      
      @scala.inline
      def setFilteredColumnsVarargs(value: FilterSettingsFilteredColumn*): Self = StObject.set(x, "filteredColumns", js.Array(value :_*))
      
      @scala.inline
      def setMaxFilterChoices(value: Double): Self = StObject.set(x, "maxFilterChoices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFilterChoicesUndefined: Self = StObject.set(x, "maxFilterChoices", js.undefined)
    }
  }
  
  trait FilterSettingsFilteredColumn extends StObject {
    
    /** Specifies the field where filtering has to be performed.
      */
    var field: js.UndefOr[String] = js.undefined
    
    /** Specifies the filter condition to filtered column. See operator
      */
    var operator: js.UndefOr[String] = js.undefined
    
    /** Specifies the predicate(and/or) value to perform filtering.
      */
    var predicate: js.UndefOr[String] = js.undefined
    
    /** Specifies the value to be filtered in TreeGrid.
      */
    var value: js.UndefOr[String] = js.undefined
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
  
  trait LoadEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the TreeGrid model
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
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
  
  trait Model extends StObject {
    
    /** Triggered before every success event of TreeGrid action.
      */
    var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.undefined
    
    /** Triggered for every TreeGrid action success event.
      */
    var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.undefined
    
    /** Enables or disables the option for column reordering
      * @Default {false}
      */
    var allowColumnReordering: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the ability to resize the column width interactively.
      * @Default {false}
      */
    var allowColumnResize: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the ability to drag and drop the row interactively to reorder the rows.
      * @Default {false}
      */
    var allowDragAndDrop: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the ability to filter the data on all the columns. Enabling this property will display a row with editor controls corresponding to each column. You can
      * restrict filtering on particular column by disabling this property directly on that column instance itself.
      * @Default {false}
      */
    var allowFiltering: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables keyboard navigation.
      * @Default {true}
      */
    var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the ability to sort the rows based on multiple columns/fields by clicking on each column header. Rows will be sorted recursively on clicking the column headers.
      * @Default {false}
      */
    var allowMultiSorting: js.UndefOr[Boolean] = js.undefined
    
    /** Enables/disables pagination of rows in TreeGrid
      * @Default {false}
      */
    var allowPaging: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the toolbar searching in TreeGrid.
      * @Default {false}
      */
    var allowSearching: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the ability to select a row interactively.
      * @Default {true}
      */
    var allowSelection: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the ability to sort the rows based on a single field/column by clicking on that column header. When enabled, rows can be sorted only by single field/column.
      * @Default {false}
      */
    var allowSorting: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether the Content will wrap to the next line if the content exceeds the boundary of the Column Cells.
      * @Default {false}
      */
    var allowTextWrap: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the id of the template that has to be applied for alternate rows.
      */
    var altRowTemplateID: js.UndefOr[String] = js.undefined
    
    /** Triggered before the printing initiated in TreeGrid.
      */
    var beforePrint: js.UndefOr[js.Function1[/* e */ BeforePrintEventArgs, Unit]] = js.undefined
    
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
    
    /** Triggered after collapsed the TreeGrid record
      */
    var collapsed: js.UndefOr[js.Function1[/* e */ CollapsedEventArgs, Unit]] = js.undefined
    
    /** Enables or disables the expandable/collapsible footer summary row. By default expander icon for footer summary will be rendered in first column of first summary row.
      * @Default {false}
      */
    var collapsibleTotalSummary: js.UndefOr[Boolean] = js.undefined
    
    /** Triggered while collapsing the TreeGrid record
      */
    var collapsing: js.UndefOr[js.Function1[/* e */ CollapsingEventArgs, Unit]] = js.undefined
    
    /** To Specify the column fields to be displayed in the dialog while inserting a column using column menu.
      * @Default {[]}
      */
    var columnDialogFields: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Triggered while dragging a column
      */
    var columnDrag: js.UndefOr[js.Function1[/* e */ ColumnDragEventArgs, Unit]] = js.undefined
    
    /** Triggered  when you start to drag a column
      */
    var columnDragStart: js.UndefOr[js.Function1[/* e */ ColumnDragStartEventArgs, Unit]] = js.undefined
    
    /** Triggered when a column is dropped
      */
    var columnDrop: js.UndefOr[js.Function1[/* e */ ColumnDropEventArgs, Unit]] = js.undefined
    
    /** Triggered when a column has been resized
      */
    var columnResizeEnd: js.UndefOr[js.Function1[/* e */ ColumnResizeEndEventArgs, Unit]] = js.undefined
    
    /** Specifies the settings for column resize
      */
    var columnResizeSettings: js.UndefOr[ColumnResizeSettings] = js.undefined
    
    /** Triggered while start to resize a column
      */
    var columnResizeStart: js.UndefOr[js.Function1[/* e */ ColumnResizeStartEventArgs, Unit]] = js.undefined
    
    /** Triggered after a column resized
      */
    var columnResized: js.UndefOr[js.Function1[/* e */ ColumnResizedEventArgs, Unit]] = js.undefined
    
    /** Option for adding columns; each column has the option to bind to a field in the dataSource.
      */
    var columns: js.UndefOr[js.Array[Column]] = js.undefined
    
    /** Defines the common width for all the columns in TreeGrid
      * @Default {150}
      */
    var commonWidth: js.UndefOr[Double] = js.undefined
    
    /** Triggered while Context Menu is rendered in TreeGrid control
      */
    var contextMenuOpen: js.UndefOr[js.Function1[/* e */ ContextMenuOpenEventArgs, Unit]] = js.undefined
    
    /** Options for displaying and customizing context menu items.
      */
    var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.undefined
    
    /** Triggered when TreeGrid is rendered completely
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Specify the CSS class for TreeGrid to achieve custom theme.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Specifies hierarchical or self-referential data to populate the TreeGrid.
      * @Default {null}
      */
    var dataSource: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Triggered while rendering details template in TreeGrid
      */
    var detailsDataBound: js.UndefOr[js.Function1[/* e */ DetailsDataBoundEventArgs, Unit]] = js.undefined
    
    /** Triggered when details template pop-up is hidden.
      */
    var detailsHidden: js.UndefOr[js.Function1[/* e */ DetailsHiddenEventArgs, Unit]] = js.undefined
    
    /** Specifies the row height of the details view
      * @Default {100}
      */
    var detailsRowHeight: js.UndefOr[Double] = js.undefined
    
    /** Triggered when details template pop-up is shown.
      */
    var detailsShown: js.UndefOr[js.Function1[/* e */ DetailsShownEventArgs, Unit]] = js.undefined
    
    /** Specifies the template for details view
      */
    var detailsTemplate: js.UndefOr[String] = js.undefined
    
    /** Options for displaying and customizing the tooltip. This tooltip will show the preview of the row that is being dragged.
      */
    var dragTooltip: js.UndefOr[DragTooltip] = js.undefined
    
    /** Options for enabling and configuring the editing related operations.
      */
    var editSettings: js.UndefOr[EditSettings] = js.undefined
    
    /** Specifies whether to render alternate rows in different background colors.
      * @Default {true}
      */
    var enableAltRow: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether to load all the rows in collapsed state when the TreeGrid is rendered for the first time.
      * @Default {false}
      */
    var enableCollapseAll: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable load on demand approach, for rendering child records and page records.
      * @Default {false}
      */
    var enableLoadOnDemand: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether to resize TreeGrid whenever window size changes.
      * @Default {false}
      */
    var enableResize: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether to render only the visual elements that are visible in the UI. When you enable this property, it will reduce the loading time for loading large number of records.
      * @Default {false}
      */
    var enableVirtualization: js.UndefOr[Boolean] = js.undefined
    
    /** Triggered after saved the modified cellValue in TreeGrid
      */
    var endEdit: js.UndefOr[js.Function1[/* e */ EndEditEventArgs, Unit]] = js.undefined
    
    /** Specifies the mapping property path for the expand status of a record in data source.
      */
    var expandStateMapping: js.UndefOr[String] = js.undefined
    
    /** Triggered after expand the record
      */
    var expanded: js.UndefOr[js.Function1[/* e */ ExpandedEventArgs, Unit]] = js.undefined
    
    /** Triggered while expanding the TreeGrid record
      */
    var expanding: js.UndefOr[js.Function1[/* e */ ExpandingEventArgs, Unit]] = js.undefined
    
    /** Options for filtering and customizing filter actions.
      */
    var filterSettings: js.UndefOr[FilterSettings] = js.undefined
    
    /** Specifies whether to wrap the header text when it is overflown i.e., when it exceeds the header width.
      * @Default {ej.TreeGrid.HeaderTextOverflow.None}
      */
    var headerTextOverflow: js.UndefOr[HeaderTextOverflow | String] = js.undefined
    
    /** Specifies the name of the field in the dataSource, which contains the id of that row.
      */
    var idMapping: js.UndefOr[String] = js.undefined
    
    /** Enables or disables the responsiveness of TreeGrid
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Triggered while Treegrid is loaded
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
    
    /** Specifies the localization information to customize the User Interface (UI) to support regional language and culture
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Specifies the options for customizing the pager.
      */
    var pageSettings: js.UndefOr[PageSettings] = js.undefined
    
    /** Specifies the name of the field in the dataSource, which contains the parent's id. This is necessary to form a parent-child hierarchy, if the dataSource contains self-referential
      * data.
      */
    var parentIdMapping: js.UndefOr[String] = js.undefined
    
    /** Enables or disables internal parsing of a row. When disabled this property, row will be displayed using the defined template without any internal event bindings.
      * @Default {true}
      */
    var parseRowTemplate: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies ej.Query to select data from the dataSource. This property is applicable only when the dataSource is ej.DataManager.
      * @Default {null}
      */
    var query: js.UndefOr[js.Any] = js.undefined
    
    /** Triggered while rendering each cell in the TreeGrid
      */
    var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, Unit]] = js.undefined
    
    /** Triggered while clicking a row, even when allowSelection property is disabled.
      */
    var recordClick: js.UndefOr[js.Function1[/* e */ RecordClickEventArgs, Unit]] = js.undefined
    
    /** Triggered during record double click action, even when allowSelection property is disabled.
      */
    var recordDoubleClick: js.UndefOr[js.Function1[/* e */ RecordDoubleClickEventArgs, Unit]] = js.undefined
    
    /** Triggered while rendering each row
      */
    var rowDataBound: js.UndefOr[js.Function1[/* e */ RowDataBoundEventArgs, Unit]] = js.undefined
    
    /** Triggered while dragging a row in TreeGrid control
      */
    var rowDrag: js.UndefOr[js.Function1[/* e */ RowDragEventArgs, Unit]] = js.undefined
    
    /** Triggered while start to drag row in TreeGrid control
      */
    var rowDragStart: js.UndefOr[js.Function1[/* e */ RowDragStartEventArgs, Unit]] = js.undefined
    
    /** Triggered while drop a row in TreeGrid control
      */
    var rowDragStop: js.UndefOr[js.Function1[/* e */ RowDragStopEventArgs, Unit]] = js.undefined
    
    /** Triggered before row drop action begins.
      */
    var rowDropActionBegin: js.UndefOr[js.Function1[/* e */ RowDropActionBeginEventArgs, Unit]] = js.undefined
    
    /** Specifies the height of a single row in tree grid. Also, we need to set same height in the CSS style with class name e-rowcell.
      * @Default {30}
      */
    var rowHeight: js.UndefOr[Double] = js.undefined
    
    /** Triggered after the row is selected.
      */
    var rowSelected: js.UndefOr[js.Function1[/* e */ RowSelectedEventArgs, Unit]] = js.undefined
    
    /** Triggered before the row is going to be selected.
      */
    var rowSelecting: js.UndefOr[js.Function1[/* e */ RowSelectingEventArgs, Unit]] = js.undefined
    
    /** Specifies the id of the template to be applied for all the rows.
      */
    var rowTemplateID: js.UndefOr[String] = js.undefined
    
    /** Specifies the toolbar searching customizations.
      */
    var searchSettings: js.UndefOr[SearchSettings] = js.undefined
    
    /** Specifies the selected cell information on rendering TreeGrid.
      */
    var selectedCellIndexes: js.UndefOr[js.Array[SelectedCellIndex]] = js.undefined
    
    /** Specifies the index of the selected row.
      * @Default {-1}
      */
    var selectedRowIndex: js.UndefOr[Double] = js.undefined
    
    /** Specifies the settings for row and cell selection.
      */
    var selectionSettings: js.UndefOr[SelectionSettings] = js.undefined
    
    /** Controls the visibility of the menu button, which is displayed on the column header. Clicking on this button will show a popup menu. When you choose Columns item from this popup,
      * a list box with column names will be shown, from which you can select/deselect a column name to control the visibility of the respective columns.
      * @Default {false}
      */
    var showColumnChooser: js.UndefOr[Boolean] = js.undefined
    
    /** Enables/disables the options for inserting , deleting and renaming  columns.
      * @Default {false}
      */
    var showColumnOptions: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the visibility of details view
      * @Default {false}
      */
    var showDetailsRow: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the visibility of the expander column which is used to expand or collapse the details view
      * @Default {false}
      */
    var showDetailsRowInfoColumn: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether to show tooltip when mouse is hovered on the cell.
      * @Default {true}
      */
    var showGridCellTooltip: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether to show tooltip for the cells, which has expander button.
      * @Default {true}
      */
    var showGridExpandCellTooltip: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates stacked header should be shown on TreeGrid layout when the property â€œstackedHeaderRowsâ€ is set.
      * @Default {false}
      */
    var showStackedHeader: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the visibility of summary row
      * @Default {false}
      */
    var showSummaryRow: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the visibility of total summary row for the corresponding summary column
      * @Default {false}
      */
    var showTotalSummary: js.UndefOr[Boolean] = js.undefined
    
    /** Options for setting width and height for TreeGrid.
      */
    var sizeSettings: js.UndefOr[SizeSettings] = js.undefined
    
    /** Options for sorting the rows.
      */
    var sortSettings: js.UndefOr[SortSettings] = js.undefined
    
    /** Gets or sets an object that indicates to managing the collection of stacked header rows for the TreeGrid.
      * @Default {[]}
      */
    var stackedHeaderRows: js.UndefOr[js.Array[StackedHeaderRow]] = js.undefined
    
    /** Specifies the summary row collection object to be displayed
      * @Default {[]}
      */
    var summaryRows: js.UndefOr[js.Array[SummaryRow]] = js.undefined
    
    /** Triggered when toolbar item is clicked in TreeGrid.
      */
    var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, Unit]] = js.undefined
    
    /** Options for displaying and customizing the toolbar items.
      */
    var toolbarSettings: js.UndefOr[ToolbarSettings] = js.undefined
    
    /** Specifies the height of footer summary container.
      * @Default {90}
      */
    var totalSummaryHeight: js.UndefOr[Double] = js.undefined
    
    /** Specifies the index of the column that needs to have the expander button. By default, cells in the first column contain the expander button.
      * @Default {0}
      */
    var treeColumnIndex: js.UndefOr[Double] = js.undefined
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.TreeGrid.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.TreeGrid.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.TreeGrid.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = StObject.set(x, "actionBegin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionBeginUndefined: Self = StObject.set(x, "actionBegin", js.undefined)
      
      @scala.inline
      def setActionComplete(value: /* e */ ActionCompleteEventArgs => Unit): Self = StObject.set(x, "actionComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionCompleteUndefined: Self = StObject.set(x, "actionComplete", js.undefined)
      
      @scala.inline
      def setAllowColumnReordering(value: Boolean): Self = StObject.set(x, "allowColumnReordering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowColumnReorderingUndefined: Self = StObject.set(x, "allowColumnReordering", js.undefined)
      
      @scala.inline
      def setAllowColumnResize(value: Boolean): Self = StObject.set(x, "allowColumnResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowColumnResizeUndefined: Self = StObject.set(x, "allowColumnResize", js.undefined)
      
      @scala.inline
      def setAllowDragAndDrop(value: Boolean): Self = StObject.set(x, "allowDragAndDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDragAndDropUndefined: Self = StObject.set(x, "allowDragAndDrop", js.undefined)
      
      @scala.inline
      def setAllowFiltering(value: Boolean): Self = StObject.set(x, "allowFiltering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFilteringUndefined: Self = StObject.set(x, "allowFiltering", js.undefined)
      
      @scala.inline
      def setAllowKeyboardNavigation(value: Boolean): Self = StObject.set(x, "allowKeyboardNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowKeyboardNavigationUndefined: Self = StObject.set(x, "allowKeyboardNavigation", js.undefined)
      
      @scala.inline
      def setAllowMultiSorting(value: Boolean): Self = StObject.set(x, "allowMultiSorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMultiSortingUndefined: Self = StObject.set(x, "allowMultiSorting", js.undefined)
      
      @scala.inline
      def setAllowPaging(value: Boolean): Self = StObject.set(x, "allowPaging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowPagingUndefined: Self = StObject.set(x, "allowPaging", js.undefined)
      
      @scala.inline
      def setAllowSearching(value: Boolean): Self = StObject.set(x, "allowSearching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSearchingUndefined: Self = StObject.set(x, "allowSearching", js.undefined)
      
      @scala.inline
      def setAllowSelection(value: Boolean): Self = StObject.set(x, "allowSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSelectionUndefined: Self = StObject.set(x, "allowSelection", js.undefined)
      
      @scala.inline
      def setAllowSorting(value: Boolean): Self = StObject.set(x, "allowSorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSortingUndefined: Self = StObject.set(x, "allowSorting", js.undefined)
      
      @scala.inline
      def setAllowTextWrap(value: Boolean): Self = StObject.set(x, "allowTextWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowTextWrapUndefined: Self = StObject.set(x, "allowTextWrap", js.undefined)
      
      @scala.inline
      def setAltRowTemplateID(value: String): Self = StObject.set(x, "altRowTemplateID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltRowTemplateIDUndefined: Self = StObject.set(x, "altRowTemplateID", js.undefined)
      
      @scala.inline
      def setBeforePrint(value: /* e */ BeforePrintEventArgs => Unit): Self = StObject.set(x, "beforePrint", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforePrintUndefined: Self = StObject.set(x, "beforePrint", js.undefined)
      
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
      def setCollapsibleTotalSummary(value: Boolean): Self = StObject.set(x, "collapsibleTotalSummary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsibleTotalSummaryUndefined: Self = StObject.set(x, "collapsibleTotalSummary", js.undefined)
      
      @scala.inline
      def setCollapsing(value: /* e */ CollapsingEventArgs => Unit): Self = StObject.set(x, "collapsing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCollapsingUndefined: Self = StObject.set(x, "collapsing", js.undefined)
      
      @scala.inline
      def setColumnDialogFields(value: js.Array[js.Any]): Self = StObject.set(x, "columnDialogFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnDialogFieldsUndefined: Self = StObject.set(x, "columnDialogFields", js.undefined)
      
      @scala.inline
      def setColumnDialogFieldsVarargs(value: js.Any*): Self = StObject.set(x, "columnDialogFields", js.Array(value :_*))
      
      @scala.inline
      def setColumnDrag(value: /* e */ ColumnDragEventArgs => Unit): Self = StObject.set(x, "columnDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColumnDragStart(value: /* e */ ColumnDragStartEventArgs => Unit): Self = StObject.set(x, "columnDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColumnDragStartUndefined: Self = StObject.set(x, "columnDragStart", js.undefined)
      
      @scala.inline
      def setColumnDragUndefined: Self = StObject.set(x, "columnDrag", js.undefined)
      
      @scala.inline
      def setColumnDrop(value: /* e */ ColumnDropEventArgs => Unit): Self = StObject.set(x, "columnDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColumnDropUndefined: Self = StObject.set(x, "columnDrop", js.undefined)
      
      @scala.inline
      def setColumnResizeEnd(value: /* e */ ColumnResizeEndEventArgs => Unit): Self = StObject.set(x, "columnResizeEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColumnResizeEndUndefined: Self = StObject.set(x, "columnResizeEnd", js.undefined)
      
      @scala.inline
      def setColumnResizeSettings(value: ColumnResizeSettings): Self = StObject.set(x, "columnResizeSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnResizeSettingsUndefined: Self = StObject.set(x, "columnResizeSettings", js.undefined)
      
      @scala.inline
      def setColumnResizeStart(value: /* e */ ColumnResizeStartEventArgs => Unit): Self = StObject.set(x, "columnResizeStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColumnResizeStartUndefined: Self = StObject.set(x, "columnResizeStart", js.undefined)
      
      @scala.inline
      def setColumnResized(value: /* e */ ColumnResizedEventArgs => Unit): Self = StObject.set(x, "columnResized", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColumnResizedUndefined: Self = StObject.set(x, "columnResized", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setCommonWidth(value: Double): Self = StObject.set(x, "commonWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonWidthUndefined: Self = StObject.set(x, "commonWidth", js.undefined)
      
      @scala.inline
      def setContextMenuOpen(value: /* e */ ContextMenuOpenEventArgs => Unit): Self = StObject.set(x, "contextMenuOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContextMenuOpenUndefined: Self = StObject.set(x, "contextMenuOpen", js.undefined)
      
      @scala.inline
      def setContextMenuSettings(value: ContextMenuSettings): Self = StObject.set(x, "contextMenuSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuSettingsUndefined: Self = StObject.set(x, "contextMenuSettings", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Array[js.Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
      
      @scala.inline
      def setDetailsDataBound(value: /* e */ DetailsDataBoundEventArgs => Unit): Self = StObject.set(x, "detailsDataBound", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDetailsDataBoundUndefined: Self = StObject.set(x, "detailsDataBound", js.undefined)
      
      @scala.inline
      def setDetailsHidden(value: /* e */ DetailsHiddenEventArgs => Unit): Self = StObject.set(x, "detailsHidden", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDetailsHiddenUndefined: Self = StObject.set(x, "detailsHidden", js.undefined)
      
      @scala.inline
      def setDetailsRowHeight(value: Double): Self = StObject.set(x, "detailsRowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsRowHeightUndefined: Self = StObject.set(x, "detailsRowHeight", js.undefined)
      
      @scala.inline
      def setDetailsShown(value: /* e */ DetailsShownEventArgs => Unit): Self = StObject.set(x, "detailsShown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDetailsShownUndefined: Self = StObject.set(x, "detailsShown", js.undefined)
      
      @scala.inline
      def setDetailsTemplate(value: String): Self = StObject.set(x, "detailsTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsTemplateUndefined: Self = StObject.set(x, "detailsTemplate", js.undefined)
      
      @scala.inline
      def setDragTooltip(value: DragTooltip): Self = StObject.set(x, "dragTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragTooltipUndefined: Self = StObject.set(x, "dragTooltip", js.undefined)
      
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
      def setEnableLoadOnDemand(value: Boolean): Self = StObject.set(x, "enableLoadOnDemand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableLoadOnDemandUndefined: Self = StObject.set(x, "enableLoadOnDemand", js.undefined)
      
      @scala.inline
      def setEnableResize(value: Boolean): Self = StObject.set(x, "enableResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableResizeUndefined: Self = StObject.set(x, "enableResize", js.undefined)
      
      @scala.inline
      def setEnableVirtualization(value: Boolean): Self = StObject.set(x, "enableVirtualization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableVirtualizationUndefined: Self = StObject.set(x, "enableVirtualization", js.undefined)
      
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
      def setHeaderTextOverflow(value: HeaderTextOverflow | String): Self = StObject.set(x, "headerTextOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTextOverflowUndefined: Self = StObject.set(x, "headerTextOverflow", js.undefined)
      
      @scala.inline
      def setIdMapping(value: String): Self = StObject.set(x, "idMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdMappingUndefined: Self = StObject.set(x, "idMapping", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setPageSettings(value: PageSettings): Self = StObject.set(x, "pageSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSettingsUndefined: Self = StObject.set(x, "pageSettings", js.undefined)
      
      @scala.inline
      def setParentIdMapping(value: String): Self = StObject.set(x, "parentIdMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdMappingUndefined: Self = StObject.set(x, "parentIdMapping", js.undefined)
      
      @scala.inline
      def setParseRowTemplate(value: Boolean): Self = StObject.set(x, "parseRowTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseRowTemplateUndefined: Self = StObject.set(x, "parseRowTemplate", js.undefined)
      
      @scala.inline
      def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryCellInfo(value: /* e */ QueryCellInfoEventArgs => Unit): Self = StObject.set(x, "queryCellInfo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQueryCellInfoUndefined: Self = StObject.set(x, "queryCellInfo", js.undefined)
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setRecordClick(value: /* e */ RecordClickEventArgs => Unit): Self = StObject.set(x, "recordClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRecordClickUndefined: Self = StObject.set(x, "recordClick", js.undefined)
      
      @scala.inline
      def setRecordDoubleClick(value: /* e */ RecordDoubleClickEventArgs => Unit): Self = StObject.set(x, "recordDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRecordDoubleClickUndefined: Self = StObject.set(x, "recordDoubleClick", js.undefined)
      
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
      def setRowDropActionBegin(value: /* e */ RowDropActionBeginEventArgs => Unit): Self = StObject.set(x, "rowDropActionBegin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowDropActionBeginUndefined: Self = StObject.set(x, "rowDropActionBegin", js.undefined)
      
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
      def setRowTemplateID(value: String): Self = StObject.set(x, "rowTemplateID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowTemplateIDUndefined: Self = StObject.set(x, "rowTemplateID", js.undefined)
      
      @scala.inline
      def setSearchSettings(value: SearchSettings): Self = StObject.set(x, "searchSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchSettingsUndefined: Self = StObject.set(x, "searchSettings", js.undefined)
      
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
      def setSelectionSettings(value: SelectionSettings): Self = StObject.set(x, "selectionSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionSettingsUndefined: Self = StObject.set(x, "selectionSettings", js.undefined)
      
      @scala.inline
      def setShowColumnChooser(value: Boolean): Self = StObject.set(x, "showColumnChooser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowColumnChooserUndefined: Self = StObject.set(x, "showColumnChooser", js.undefined)
      
      @scala.inline
      def setShowColumnOptions(value: Boolean): Self = StObject.set(x, "showColumnOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowColumnOptionsUndefined: Self = StObject.set(x, "showColumnOptions", js.undefined)
      
      @scala.inline
      def setShowDetailsRow(value: Boolean): Self = StObject.set(x, "showDetailsRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDetailsRowInfoColumn(value: Boolean): Self = StObject.set(x, "showDetailsRowInfoColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDetailsRowInfoColumnUndefined: Self = StObject.set(x, "showDetailsRowInfoColumn", js.undefined)
      
      @scala.inline
      def setShowDetailsRowUndefined: Self = StObject.set(x, "showDetailsRow", js.undefined)
      
      @scala.inline
      def setShowGridCellTooltip(value: Boolean): Self = StObject.set(x, "showGridCellTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowGridCellTooltipUndefined: Self = StObject.set(x, "showGridCellTooltip", js.undefined)
      
      @scala.inline
      def setShowGridExpandCellTooltip(value: Boolean): Self = StObject.set(x, "showGridExpandCellTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowGridExpandCellTooltipUndefined: Self = StObject.set(x, "showGridExpandCellTooltip", js.undefined)
      
      @scala.inline
      def setShowStackedHeader(value: Boolean): Self = StObject.set(x, "showStackedHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowStackedHeaderUndefined: Self = StObject.set(x, "showStackedHeader", js.undefined)
      
      @scala.inline
      def setShowSummaryRow(value: Boolean): Self = StObject.set(x, "showSummaryRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSummaryRowUndefined: Self = StObject.set(x, "showSummaryRow", js.undefined)
      
      @scala.inline
      def setShowTotalSummary(value: Boolean): Self = StObject.set(x, "showTotalSummary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTotalSummaryUndefined: Self = StObject.set(x, "showTotalSummary", js.undefined)
      
      @scala.inline
      def setSizeSettings(value: SizeSettings): Self = StObject.set(x, "sizeSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeSettingsUndefined: Self = StObject.set(x, "sizeSettings", js.undefined)
      
      @scala.inline
      def setSortSettings(value: SortSettings): Self = StObject.set(x, "sortSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortSettingsUndefined: Self = StObject.set(x, "sortSettings", js.undefined)
      
      @scala.inline
      def setStackedHeaderRows(value: js.Array[StackedHeaderRow]): Self = StObject.set(x, "stackedHeaderRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackedHeaderRowsUndefined: Self = StObject.set(x, "stackedHeaderRows", js.undefined)
      
      @scala.inline
      def setStackedHeaderRowsVarargs(value: StackedHeaderRow*): Self = StObject.set(x, "stackedHeaderRows", js.Array(value :_*))
      
      @scala.inline
      def setSummaryRows(value: js.Array[SummaryRow]): Self = StObject.set(x, "summaryRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryRowsUndefined: Self = StObject.set(x, "summaryRows", js.undefined)
      
      @scala.inline
      def setSummaryRowsVarargs(value: SummaryRow*): Self = StObject.set(x, "summaryRows", js.Array(value :_*))
      
      @scala.inline
      def setToolbarClick(value: /* e */ ToolbarClickEventArgs => Unit): Self = StObject.set(x, "toolbarClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToolbarClickUndefined: Self = StObject.set(x, "toolbarClick", js.undefined)
      
      @scala.inline
      def setToolbarSettings(value: ToolbarSettings): Self = StObject.set(x, "toolbarSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarSettingsUndefined: Self = StObject.set(x, "toolbarSettings", js.undefined)
      
      @scala.inline
      def setTotalSummaryHeight(value: Double): Self = StObject.set(x, "totalSummaryHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalSummaryHeightUndefined: Self = StObject.set(x, "totalSummaryHeight", js.undefined)
      
      @scala.inline
      def setTreeColumnIndex(value: Double): Self = StObject.set(x, "treeColumnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeColumnIndexUndefined: Self = StObject.set(x, "treeColumnIndex", js.undefined)
    }
  }
  
  trait PageSettings extends StObject {
    
    /** Specifies the current page to display at load time.
      * @Default {1}
      */
    var currentPage: js.UndefOr[Double] = js.undefined
    
    /** Using this property we can specify the number of pages should pager contains, according to this count TreeGrid height will be updated.
      * @Default {8}
      */
    var pageCount: js.UndefOr[Double] = js.undefined
    
    /** This specifies the number of rows to display in each page.
      * @Default {12}
      */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** Specifies the mode of record count in a page, whether it should count all the records or the root to count zero level parent records.
      * @Default {ej.TreeGrid.PageSizeMode.All}
      */
    var pageSizeMode: js.UndefOr[PageSizeMode | String] = js.undefined
    
    /** Specifies the mode of printing the control, whether it should print the all the records or the current page content.
      * @Default {ej.TreeGrid.PrintMode.AllPages}
      */
    var printMode: js.UndefOr[PrintMode | String] = js.undefined
    
    /** Specifies the Custom template for Pager control.
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** Get the value of records which is bound to TreeGrid. The totalRecordsCount value is calculated based on the datasource bound to TreeGrid.
      * @Default {null}
      */
    var totalRecordsCount: js.UndefOr[Double] = js.undefined
  }
  object PageSettings {
    
    @scala.inline
    def apply(): PageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageSettings]
    }
    
    @scala.inline
    implicit class PageSettingsMutableBuilder[Self <: PageSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      @scala.inline
      def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeMode(value: PageSizeMode | String): Self = StObject.set(x, "pageSizeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeModeUndefined: Self = StObject.set(x, "pageSizeMode", js.undefined)
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setPrintMode(value: PrintMode | String): Self = StObject.set(x, "printMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintModeUndefined: Self = StObject.set(x, "printMode", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTotalRecordsCount(value: Double): Self = StObject.set(x, "totalRecordsCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalRecordsCountUndefined: Self = StObject.set(x, "totalRecordsCount", js.undefined)
    }
  }
  
  trait QueryCellInfoEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the selecting cell element.
      */
    var cellElement: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the value of cell.
      */
    var cellValue: js.UndefOr[String] = js.undefined
    
    /** Returns the column of cell belongs.
      */
    var column: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the data of current cell record.
      */
    var data: js.UndefOr[js.Any] = js.undefined
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
  
  trait RecordClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the element of clicked cell.
      */
    var cell: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the index of the clicked cell.
      */
    var cellIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the data of clicked cell.
      */
    var cellValue: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the column name of the clicked cell.
      */
    var columnName: js.UndefOr[String] = js.undefined
    
    /** Returns the element of the clicked row.
      */
    var row: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the index of the clicked row.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
  }
  object RecordClickEventArgs {
    
    @scala.inline
    def apply(): RecordClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordClickEventArgs]
    }
    
    @scala.inline
    implicit class RecordClickEventArgsMutableBuilder[Self <: RecordClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCell(value: js.Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      @scala.inline
      def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      @scala.inline
      def setCellValue(value: js.Any): Self = StObject.set(x, "cellValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellValueUndefined: Self = StObject.set(x, "cellValue", js.undefined)
      
      @scala.inline
      def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
      
      @scala.inline
      def setRow(value: js.Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      @scala.inline
      def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
  
  trait RecordDoubleClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the element of clicked cell.
      */
    var cell: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the index of the clicked cell.
      */
    var cellIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the data of clicked cell.
      */
    var cellValue: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the column name of the clicked cell.
      */
    var columnName: js.UndefOr[String] = js.undefined
    
    /** Returns the element of the clicked row.
      */
    var row: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the index of the clicked row.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
  }
  object RecordDoubleClickEventArgs {
    
    @scala.inline
    def apply(): RecordDoubleClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordDoubleClickEventArgs]
    }
    
    @scala.inline
    implicit class RecordDoubleClickEventArgsMutableBuilder[Self <: RecordDoubleClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCell(value: js.Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      @scala.inline
      def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      @scala.inline
      def setCellValue(value: js.Any): Self = StObject.set(x, "cellValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellValueUndefined: Self = StObject.set(x, "cellValue", js.undefined)
      
      @scala.inline
      def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
      
      @scala.inline
      def setRow(value: js.Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      @scala.inline
      def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
  
  trait RowDataBoundEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the data of rendering row record.
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the row element of rendering row.
      */
    var rowElement: js.UndefOr[js.Any] = js.undefined
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
  
  trait RowDragEventArgs extends StObject {
    
    /** Returns that we can drop over that record or not.
      */
    var canDrop: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the row which we start to drag.
      */
    var draggedRow: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the row index which we start to drag.
      */
    var draggedRowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the drop position details such as insertAbove,insertBelow,insertAsChild and invalidPosition
      */
    var dropPosition: js.UndefOr[String] = js.undefined
    
    /** Returns the TreeGrid model.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the row on which we are dragging.
      */
    var targetRow: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the row index on which we are dragging.
      */
    var targetRowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
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
  
  trait RowDragStartEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the row which we start to drag.
      */
    var draggedRow: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the row index which we start to drag.
      */
    var draggedRowIndex: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the TreeGrid model.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
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
  
  trait RowDragStopEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the row which we start to drag.
      */
    var draggedRow: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the row index which we start to drag.
      */
    var draggedRowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the TreeGrid model.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the row which we are dropped to row.
      */
    var targetRow: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the row index which we are dropped to row.
      */
    var targetRowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
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
  
  trait RowDropActionBeginEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the multiple dragged row collection for multiple reorder
      */
    var draggedRecords: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Returns the row which we start to drag.
      */
    var draggedRow: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the row index which we start to drag.
      */
    var draggedRowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the drop position.
      */
    var dropPosition: js.UndefOr[String] = js.undefined
    
    /** Returns the TreeGrid model.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the row which we are dropped to row.
      */
    var targetRow: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the row index which we are dropped to row.
      */
    var targetRowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RowDropActionBeginEventArgs {
    
    @scala.inline
    def apply(): RowDropActionBeginEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowDropActionBeginEventArgs]
    }
    
    @scala.inline
    implicit class RowDropActionBeginEventArgsMutableBuilder[Self <: RowDropActionBeginEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDraggedRecords(value: js.Array[js.Any]): Self = StObject.set(x, "draggedRecords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedRecordsUndefined: Self = StObject.set(x, "draggedRecords", js.undefined)
      
      @scala.inline
      def setDraggedRecordsVarargs(value: js.Any*): Self = StObject.set(x, "draggedRecords", js.Array(value :_*))
      
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
  
  trait RowSelectedEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the data of selected record.
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the index of selecting row record.
      */
    var recordIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the selecting row element.
      */
    var targetRow: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the event type.
      */
    var `type`: js.UndefOr[String] = js.undefined
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
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RowSelectingEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the data selecting record.
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the previous selected data.
      */
    var previousData: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the previous selected row index.
      */
    var previousIndex: js.UndefOr[String] = js.undefined
    
    /** Returns the previous selected row element.
      */
    var previousTreeGridRow: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the index of selecting row record.
      */
    var recordIndex: js.UndefOr[String] = js.undefined
    
    /** Returns the selecting row element.
      */
    var targetRow: js.UndefOr[js.Any] = js.undefined
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
      def setPreviousData(value: js.Any): Self = StObject.set(x, "previousData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousDataUndefined: Self = StObject.set(x, "previousData", js.undefined)
      
      @scala.inline
      def setPreviousIndex(value: String): Self = StObject.set(x, "previousIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousIndexUndefined: Self = StObject.set(x, "previousIndex", js.undefined)
      
      @scala.inline
      def setPreviousTreeGridRow(value: js.Any): Self = StObject.set(x, "previousTreeGridRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousTreeGridRowUndefined: Self = StObject.set(x, "previousTreeGridRow", js.undefined)
      
      @scala.inline
      def setRecordIndex(value: String): Self = StObject.set(x, "recordIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordIndexUndefined: Self = StObject.set(x, "recordIndex", js.undefined)
      
      @scala.inline
      def setTargetRow(value: js.Any): Self = StObject.set(x, "targetRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetRowUndefined: Self = StObject.set(x, "targetRow", js.undefined)
    }
  }
  
  trait SearchSettings extends StObject {
    
    /** Default Value
      * @Default {[]}
      */
    var fields: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Default Value
      * @Default {true}
      */
    var ignoreCase: js.UndefOr[Boolean] = js.undefined
    
    /** Default Value
      */
    var key: js.UndefOr[String] = js.undefined
    
    /** Specifies the operator for the search key words in toolbar searching.
      * @Default {contains}
      */
    var operator: js.UndefOr[String] = js.undefined
    
    /** Specifies the search mode of records in searching.
      * @Default {ej.TreeGrid.SearchHierarchyMode.Parent}
      */
    var searchHierarchyMode: js.UndefOr[SearchHierarchyMode | String] = js.undefined
  }
  object SearchSettings {
    
    @scala.inline
    def apply(): SearchSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchSettings]
    }
    
    @scala.inline
    implicit class SearchSettingsMutableBuilder[Self <: SearchSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: js.Array[js.Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFieldsVarargs(value: js.Any*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      @scala.inline
      def setSearchHierarchyMode(value: SearchHierarchyMode | String): Self = StObject.set(x, "searchHierarchyMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchHierarchyModeUndefined: Self = StObject.set(x, "searchHierarchyMode", js.undefined)
    }
  }
  
  trait SelectedCellIndex extends StObject {
    
    /** Specifies the cell index to be selected in the row.
      */
    var cellIndex: js.UndefOr[Double] = js.undefined
    
    /** Specifies the row index of the cell to be selected in TreeGrid control
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
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
  
  trait SelectionSettings extends StObject {
    
    /** Enables or disables the selection by hierarchy in check box selection
      * @Default {true}
      */
    var enableHierarchySelection: js.UndefOr[Boolean] = js.undefined
    
    /** Toggles the visibility of the checkbox in column header, using which all the check boxes can be selected or unselected.
      * @Default {true}
      */
    var enableSelectAll: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the type of selection whether to select row or cell.
      * @Default {ej.TreeGrid.SelectionMode.Row}
      */
    var selectionMode: js.UndefOr[typings.std.SelectionMode | String] = js.undefined
    
    /** Specifies the type of selection whether single, multiple or checkbox.
      * @Default {ej.TreeGrid.SelectionType.Single}
      */
    var selectionType: js.UndefOr[SelectionType | String] = js.undefined
  }
  object SelectionSettings {
    
    @scala.inline
    def apply(): SelectionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionSettings]
    }
    
    @scala.inline
    implicit class SelectionSettingsMutableBuilder[Self <: SelectionSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableHierarchySelection(value: Boolean): Self = StObject.set(x, "enableHierarchySelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableHierarchySelectionUndefined: Self = StObject.set(x, "enableHierarchySelection", js.undefined)
      
      @scala.inline
      def setEnableSelectAll(value: Boolean): Self = StObject.set(x, "enableSelectAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSelectAllUndefined: Self = StObject.set(x, "enableSelectAll", js.undefined)
      
      @scala.inline
      def setSelectionMode(value: typings.std.SelectionMode | String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      @scala.inline
      def setSelectionType(value: SelectionType | String): Self = StObject.set(x, "selectionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionTypeUndefined: Self = StObject.set(x, "selectionType", js.undefined)
    }
  }
  
  trait SizeSettings extends StObject {
    
    /** Height of the TreeGrid.
      * @Default {450px}
      */
    var height: js.UndefOr[String] = js.undefined
    
    /** Width of the TreeGrid.
      * @Default {100%}
      */
    var width: js.UndefOr[String] = js.undefined
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
  
  trait SortSettings extends StObject {
    
    /** Option to add columns based on which the rows have to be sorted recursively.
      * @Default {[]}
      */
    var sortedColumns: js.UndefOr[js.Array[SortSettingsSortedColumn]] = js.undefined
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
  
  trait SortSettingsSortedColumn extends StObject {
    
    /** Specifies the sort direction in TreeGrid
      */
    var direction: js.UndefOr[String] = js.undefined
    
    /** Specifies the field to be sorted in TreeGrid
      */
    var field: js.UndefOr[String] = js.undefined
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
  
  trait StackedHeaderRow extends StObject {
    
    /** Gets or sets a value that indicates whether to add stacked header columns into the stacked header rows
      * @Default {[]}
      */
    var stackedHeaderColumns: js.UndefOr[js.Array[StackedHeaderRowsStackedHeaderColumn]] = js.undefined
  }
  object StackedHeaderRow {
    
    @scala.inline
    def apply(): StackedHeaderRow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackedHeaderRow]
    }
    
    @scala.inline
    implicit class StackedHeaderRowMutableBuilder[Self <: StackedHeaderRow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStackedHeaderColumns(value: js.Array[StackedHeaderRowsStackedHeaderColumn]): Self = StObject.set(x, "stackedHeaderColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackedHeaderColumnsUndefined: Self = StObject.set(x, "stackedHeaderColumns", js.undefined)
      
      @scala.inline
      def setStackedHeaderColumnsVarargs(value: StackedHeaderRowsStackedHeaderColumn*): Self = StObject.set(x, "stackedHeaderColumns", js.Array(value :_*))
    }
  }
  
  trait StackedHeaderRowsStackedHeaderColumn extends StObject {
    
    /** Gets or sets a value that indicates the header text for the particular stacked header column.
      * @Default {null}
      */
    var column: js.UndefOr[js.Any] = js.undefined
    
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
    
    @scala.inline
    def apply(): StackedHeaderRowsStackedHeaderColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackedHeaderRowsStackedHeaderColumn]
    }
    
    @scala.inline
    implicit class StackedHeaderRowsStackedHeaderColumnMutableBuilder[Self <: StackedHeaderRowsStackedHeaderColumn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
      
      @scala.inline
      def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  trait SummaryRow extends StObject {
    
    /** Specifies the summary columns in the summary rows.
      */
    var summaryColumns: js.UndefOr[js.Array[SummaryRowsSummaryColumn]] = js.undefined
    
    /** Specifies the title for summary row collection in TreeGrid
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object SummaryRow {
    
    @scala.inline
    def apply(): SummaryRow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SummaryRow]
    }
    
    @scala.inline
    implicit class SummaryRowMutableBuilder[Self <: SummaryRow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSummaryColumns(value: js.Array[SummaryRowsSummaryColumn]): Self = StObject.set(x, "summaryColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryColumnsUndefined: Self = StObject.set(x, "summaryColumns", js.undefined)
      
      @scala.inline
      def setSummaryColumnsVarargs(value: SummaryRowsSummaryColumn*): Self = StObject.set(x, "summaryColumns", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait SummaryRowsSummaryColumn extends StObject {
    
    /** Specifies the custom summary calculate function or text.
      */
    var customSummaryValue: js.UndefOr[String] = js.undefined
    
    /** Specifies summary column used to perform the summary calculation.
      */
    var dataMember: js.UndefOr[String] = js.undefined
    
    /** Specifies the required column to display the summary.
      */
    var displayColumn: js.UndefOr[String] = js.undefined
    
    /** Specifies the format to be applied on the summary column value.
      */
    var format: js.UndefOr[String] = js.undefined
    
    /** Specifies the text to be displayed before the summary column value.
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /** Specifies the text to be displayed after the summary column value.
      */
    var suffix: js.UndefOr[String] = js.undefined
    
    /** Specifies the summary type to perform calculations in a corresponding summary column. See summaryType.
      */
    var summaryType: js.UndefOr[SummaryType | String] = js.undefined
  }
  object SummaryRowsSummaryColumn {
    
    @scala.inline
    def apply(): SummaryRowsSummaryColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SummaryRowsSummaryColumn]
    }
    
    @scala.inline
    implicit class SummaryRowsSummaryColumnMutableBuilder[Self <: SummaryRowsSummaryColumn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomSummaryValue(value: String): Self = StObject.set(x, "customSummaryValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSummaryValueUndefined: Self = StObject.set(x, "customSummaryValue", js.undefined)
      
      @scala.inline
      def setDataMember(value: String): Self = StObject.set(x, "dataMember", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataMemberUndefined: Self = StObject.set(x, "dataMember", js.undefined)
      
      @scala.inline
      def setDisplayColumn(value: String): Self = StObject.set(x, "displayColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayColumnUndefined: Self = StObject.set(x, "displayColumn", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setSummaryType(value: SummaryType | String): Self = StObject.set(x, "summaryType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryTypeUndefined: Self = StObject.set(x, "summaryType", js.undefined)
    }
  }
  
  trait ToolbarClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current item.
      */
    var currentTarget: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the name of the toolbar item on which mouse click has been performed
      */
    var itemName: js.UndefOr[String] = js.undefined
    
    /** Returns the TreeGrid model.
      */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
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
  
  trait ToolbarSettings extends StObject {
    
    /** Allows the user to insert custom toolbar items.
      */
    var customToolbarItems: js.UndefOr[js.Array[ToolbarSettingsCustomToolbarItem]] = js.undefined
    
    /** Shows/hides the toolbar.
      * @Default {false}
      */
    var showToolbar: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the list of toolbar items to be rendered in TreeGrid toolbar
      * @Default {[]}
      */
    var toolbarItems: js.UndefOr[js.Array[ToolbarItems | String]] = js.undefined
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
  
  trait ToolbarSettingsCustomToolbarItem extends StObject {
    
    /** Allows the user to insert the custom icons in toolbar using script templates. Using this property we can bind HTML elements and other EJ controls to TreeGrid toolbar.
      */
    var templateID: js.UndefOr[String] = js.undefined
    
    /** Allows the user to insert the custom icons in toolbar using CSS class name selector.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Allows the user to display custom tooltip text for TreeGrid custom toolbar items.
      */
    var tooltipText: js.UndefOr[String] = js.undefined
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
