package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides members related to Batch Edit Mode
  */
@js.native
trait ASPxClientGridViewBatchEditApi extends js.Object {
  /**
    * Adds a new row when ASPxGridView is in Batch Edit mode.
    */
  def AddNewRow(): Unit = js.native
  /**
    * Deletes the specified row when ASPxGridView is in Batch Edit.
    * @param visibleIndex An integer value that identifies the row index.
    */
  def DeleteRow(visibleIndex: Double): Unit = js.native
  /**
    * Deletes a row with a specified key value when ASPxGridView is in Batch Edit mode.
    * @param key An object that uniquely identifies the row.
    */
  def DeleteRowByKey(key: js.Any): Unit = js.native
  /**
    * Ends cell or row editing.
    */
  def EndEdit(): Unit = js.native
  /**
    * Gets a container holding a data cell content. A HTML container element that contains the data cell's content.
    * @param visibleIndex An integer value that is the visible index.
    * @param columnFieldNameOrId A string value that is the column's Field Name or ID.
    */
  def GetCellTextContainer(visibleIndex: Double, columnFieldNameOrId: String): js.Any = js.native
  /**
    * Gets a container holding a data cell content. An object that is the HTML container element that contains the data cell's content.
    * @param key A String value that identifies the row by its key value.
    * @param columnFieldNameOrId A string value that is the column's Field Name or ID.
    */
  def GetCellTextContainerByKey(key: js.Any, columnFieldNameOrId: String): js.Any = js.native
  /**
    * Gets the value of the specified cell. An object containing the specified cell's value.
    * @param visibleIndex A zero-based integer value that specifies a visible index of a row containing the processed cell.
    * @param columnFieldNameOrId A string value that specifies the field name or unique identifier (the column's WebColumnBase.Name property value) of a column containing the processed cell.
    * @param initial true, to return the initial (server) value; false, to return a value currently contained on the client side (modified value).
    */
  def GetCellValue(visibleIndex: Double, columnFieldNameOrId: String): js.Any = js.native
  def GetCellValue(visibleIndex: Double, columnFieldNameOrId: String, initial: Boolean): js.Any = js.native
  /**
    * Gets the value of the specified cell. An object containing the specified cell's value.
    * @param key A String value that identifies the row by its key value.
    * @param columnFieldNameOrId A string value that specifies the field name or unique identifier (the column's WebColumnBase.Name property value) of a column containing the processed cell.
    * @param initial true, to return the initial (server) value; false, to return a value currently contained on the client side (modified value).
    */
  def GetCellValueByKey(key: js.Any, columnFieldNameOrId: String): js.Any = js.native
  def GetCellValueByKey(key: js.Any, columnFieldNameOrId: String, initial: Boolean): js.Any = js.native
  /**
    * Provides the text displayed within the cell according to the specified display format rule. A string value representing the cell's displayed text.
    * @param columnFieldNameOrId A string value representing the column's unique identifier or field name.
    * @param value An object representing a value.
    */
  def GetColumnDisplayText(columnFieldNameOrId: String, value: js.Any): String = js.native
  /**
    * Returns an array of the deleted row visible indices.
    */
  def GetDeletedRowIndices(): js.Array[Double] = js.native
  /**
    * Gets information about the cell currently being edited.
    */
  def GetEditCellInfo(): ASPxClientGridViewCellInfo = js.native
  def GetGroupSummaryValue(groupRowVisibleIndex: Double, summaryItemIndex: String): Double = js.native
  /**
    * Returns the group summery value. The group summary value.
    * @param groupRowVisibleIndex The group row's visible index.
    * @param summaryItemIndex The summary's index or field name.
    */
  def GetGroupSummaryValue(groupRowVisibleIndex: Double, summaryItemIndex: Double): Double = js.native
  /**
    * Returns an array of the inserted row visible indices.
    */
  def GetInsertedRowIndices(): js.Array[Double] = js.native
  /**
    * Returns an array of row visible indices. An array of integer values that are the visible indices of grid rows.
    * @param includeDeleted true, to include visible indices of deleted rows to the returned array; otherwise, false.
    */
  def GetRowVisibleIndices(includeDeleted: Boolean): js.Array[Double] = js.native
  def GetTotalSummaryValue(summaryItemIndex: String): Double = js.native
  /**
    * Returns the total summary value. The total summary value.
    * @param summaryItemIndex The total summary's index or field name.
    */
  def GetTotalSummaryValue(summaryItemIndex: Double): Double = js.native
  /**
    * Returns an object that stores unsaved changes.
    */
  def GetUnsavedChanges(): js.Any = js.native
  /**
    * Returns an array of the updated rows visible indices.
    */
  def GetUpdatedRowIndices(): js.Array[Double] = js.native
  /**
    * Returns a value that indicates whether the specified data cell's data has been changed. true, if the cell has changed data; otherwise, false.
    * @param visibleIndex An integer value that specifies the visible index of a row.
    * @param columnFieldNameOrId A string value that identifies the column by the name of the data source field to which the column is bound, or by the column's name.
    */
  def HasChanges(): Boolean = js.native
  def HasChanges(visibleIndex: js.UndefOr[scala.Nothing], columnFieldNameOrId: String): Boolean = js.native
  def HasChanges(visibleIndex: Double): Boolean = js.native
  def HasChanges(visibleIndex: Double, columnFieldNameOrId: String): Boolean = js.native
  /**
    * Returns a value that indicates whether the specified data cell's data has been changed. true, if the cell has changed data; otherwise, false.
    * @param key A String value that identifies the row by its key value.
    * @param columnFieldNameOrId A string value that identifies the column by the name of the data source field to which the column is bound, or by the column's name.
    */
  def HasChangesByKey(key: js.Any): Boolean = js.native
  def HasChangesByKey(key: js.Any, columnFieldNameOrId: String): Boolean = js.native
  /**
    * Switches the grid from the 'Preview Changes' mode to edit mode.
    */
  def HideChangesPreview(): Unit = js.native
  /**
    * Returns a value that specifies whether the row is located on the current page. true, if the row is located on the current page; otherwise, false.
    * @param key A String value that identifies the row by its key value.
    */
  def IsCurrentPageRow(key: js.Any): Boolean = js.native
  /**
    * Indicates if the row with specified visible index is deleted. true, if the row is deleted; otherwise, false.
    * @param visibleIndex An integer value that identifies the row by its visible index.
    */
  def IsDeletedRow(visibleIndex: Double): Boolean = js.native
  /**
    * Indicates if the row with specified key is deleted. true, if the row is deleted; otherwise, false.
    * @param key A String value that identifies the row by its key value.
    */
  def IsDeletedRowByKey(key: js.Any): Boolean = js.native
  /**
    * Indicates if the row with specified visible index is newly created. true, if the row is new; otherwise, false.
    * @param visibleIndex An integer value that identifies the row by its visible index.
    */
  def IsNewRow(visibleIndex: Double): Boolean = js.native
  /**
    * Programmatically moves the focus to the previous cell in the row.
    */
  def MoveFocusBackward(): Boolean = js.native
  /**
    * Programmatically moves the focus to the next cell in the row.
    */
  def MoveFocusForward(): Boolean = js.native
  /**
    * Recovers the specified row when ASPxGridView is in Batch Edit mode.
    * @param visibleIndex An integer value that identifies the row index.
    */
  def RecoverRow(visibleIndex: Double): Unit = js.native
  /**
    * Recovers a row with a specified key value when ASPxGridView is in Batch Edit mode.
    * @param key An object that uniquely identifies the row.
    */
  def RecoverRowByKey(key: js.Any): Unit = js.native
  /**
    * Resets changes in the specified cell.
    * @param visibleIndex An integer value that specifies the visible index of a row containing the processed cell.
    * @param columnIndex An integer value that specifies the field name or unique identifier (the column's WebColumnBase.Name property value) of a column containing the processed cell.
    */
  def ResetChanges(visibleIndex: Double): Unit = js.native
  def ResetChanges(visibleIndex: Double, columnIndex: Double): Unit = js.native
  /**
    * Resets changes in the specified cell.
    * @param key A String value that identifies the row by its key value.
    * @param columnIndex A zero-based index that identifies the column in the column collection (the column's CollectionItem.Index property value).
    */
  def ResetChangesByKey(key: js.Any): Unit = js.native
  def ResetChangesByKey(key: js.Any, columnIndex: Double): Unit = js.native
  /**
    * Sets the value of the specified cell.
    * @param visibleIndex An integer zero-based index that identifies the row containing the processed cell.
    * @param columnFieldNameOrId A string value that specifies the field name or unique identifier (the column's WebColumnBase.Name property value) of a column containing the processed cell.
    * @param value An object that contains the new cell value.
    * @param displayText A string value that specifies the cell display text.
    * @param cancelCellHighlighting true to cancel highlighting of the modified cell, false to highlight the modified cell.
    */
  def SetCellValue(visibleIndex: Double, columnFieldNameOrId: String, value: js.Any): Unit = js.native
  def SetCellValue(
    visibleIndex: Double,
    columnFieldNameOrId: String,
    value: js.Any,
    displayText: js.UndefOr[scala.Nothing],
    cancelCellHighlighting: Boolean
  ): Unit = js.native
  def SetCellValue(visibleIndex: Double, columnFieldNameOrId: String, value: js.Any, displayText: String): Unit = js.native
  def SetCellValue(
    visibleIndex: Double,
    columnFieldNameOrId: String,
    value: js.Any,
    displayText: String,
    cancelCellHighlighting: Boolean
  ): Unit = js.native
  /**
    * Sets the value of the specified cell.
    * @param key A String value that identifies the row by its key value.
    * @param columnFieldNameOrId A string value that specifies the field name or unique identifier (the column's WebColumnBase.Name property value) of a column containing the processed cell.
    * @param value An object that contains the new cell value.
    * @param displayText A string value that specifies the cell display text.
    * @param cancelCellHighlighting true to cancel highlighting of the modified cell, false to highlight the modified cell.
    */
  def SetCellValueByKey(key: js.Any, columnFieldNameOrId: String, value: js.Any): Unit = js.native
  def SetCellValueByKey(
    key: js.Any,
    columnFieldNameOrId: String,
    value: js.Any,
    displayText: js.UndefOr[scala.Nothing],
    cancelCellHighlighting: Boolean
  ): Unit = js.native
  def SetCellValueByKey(key: js.Any, columnFieldNameOrId: String, value: js.Any, displayText: String): Unit = js.native
  def SetCellValueByKey(
    key: js.Any,
    columnFieldNameOrId: String,
    value: js.Any,
    displayText: String,
    cancelCellHighlighting: Boolean
  ): Unit = js.native
  /**
    * Switches the grid to 'Preview Changes' mode.
    */
  def ShowChangesPreview(): Unit = js.native
  /**
    * Switches the specified cell to edit mode.
    * @param visibleIndex A zero-based integer value that specifies the visible index of a row containing the processed cell.
    * @param columnIndex A zero-based integer value that identifies the column which contains the processed cell in the column collection.
    */
  def StartEdit(visibleIndex: Double, columnIndex: Double): Unit = js.native
  /**
    * Switches the specified cell to edit mode.
    * @param key Identifies the cell by its key value.
    * @param columnIndex Identifies the column that contains the processed cell in the column collection.
    */
  def StartEditByKey(key: js.Any, columnIndex: Double): Unit = js.native
  /**
    * Performs validation of grid data contained in the specified row when the grid operates in Batch Edit mode. true, if data in the specified row data passes validation; otherwise, false.
    * @param visibleIndex An integer value specifying the visible index of the validated row.
    */
  def ValidateRow(visibleIndex: Double): Boolean = js.native
  /**
    * Performs validation of grid data contained in the specified row when the grid operates in Batch Edit mode. true, if data in the specified row data passes validation; otherwise, false.
    * @param key A String value that identifies the row by its key value.
    */
  def ValidateRowByKey(key: js.Any): Boolean = js.native
  /**
    * Validate grid data contained in all rows when the grid operates in Batch Edit mode. true, if data in all rows passes validation; otherwise, false.
    * @param validateOnlyModified true, if only modified rows should be validated; otherwise, false.
    * @param validateOnCurrentPageOnly true, to validate rows that are located only on the current page; otherwise, false.
    */
  def ValidateRows(): Boolean = js.native
  def ValidateRows(validateOnlyModified: js.UndefOr[scala.Nothing], validateOnCurrentPageOnly: Boolean): Boolean = js.native
  def ValidateRows(validateOnlyModified: Boolean): Boolean = js.native
  def ValidateRows(validateOnlyModified: Boolean, validateOnCurrentPageOnly: Boolean): Boolean = js.native
}

