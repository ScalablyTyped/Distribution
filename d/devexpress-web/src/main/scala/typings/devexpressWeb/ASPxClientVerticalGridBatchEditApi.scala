package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides members related to Batch Edit Mode
  */
@js.native
trait ASPxClientVerticalGridBatchEditApi extends js.Object {
  
  /**
    * Adds a new record when ASPxVerticalGrid is in Batch Edit mode.
    */
  def AddNewRecord(): Unit = js.native
  
  /**
    * Deletes the specified record when ASPxVerticalGrid is in Batch Edit mode.
    * @param visibleIndex An integer value that identifies the record index.
    */
  def DeleteRecord(visibleIndex: Double): Unit = js.native
  
  /**
    * Deletes a record with a specified key value when ASPxVerticalGrid is in Batch Edit mode.
    * @param key An object that uniquely identifies the record.
    */
  def DeleteRecordByKey(key: js.Any): Unit = js.native
  
  /**
    * Ends the cell(s) editing.
    */
  def EndEdit(): Unit = js.native
  
  /**
    * Gets a container holding the data cell content. An object that is the HTML container element that contains the data cell's content.
    * @param visibleIndex An integer value that is the visible index.
    * @param columnFieldNameOrId A string value that is the column's Field Name or ID.
    */
  def GetCellTextContainer(visibleIndex: Double, columnFieldNameOrId: String): js.Any = js.native
  
  /**
    * Gets the value of the specified cell. An object containing the specified cell's value.
    * @param visibleIndex A zero-based integer value that specifies a visible index of a record containing the processed cell.
    * @param rowFieldNameOrId A string value that specifies the field name or unique identifier (the row's WebColumnBase.Name property value) of a row containing the processed cell.
    * @param initial true, to return the initial (server) value; false, to return a value currently contained on the client side (modified value).
    */
  def GetCellValue(visibleIndex: Double, rowFieldNameOrId: String): js.Any = js.native
  def GetCellValue(visibleIndex: Double, rowFieldNameOrId: String, initial: Boolean): js.Any = js.native
  
  /**
    * Provides the text displayed within the cell according to the specified display format rule. A string value representing the cell's displayed text.
    * @param columnFieldNameOrId A string value representing the row's unique identifier or field name.
    * @param value An object representing a value.
    */
  def GetColumnDisplayText(columnFieldNameOrId: String, value: js.Any): String = js.native
  
  /**
    * Returns an array of the deleted record visible indices.
    */
  def GetDeletedRecordIndices(): js.Array[Double] = js.native
  
  /**
    * Gets information about the cell currently being edited.
    */
  def GetEditCellInfo(): ASPxClientVerticalGridCellInfo = js.native
  
  /**
    * Returns an array of the inserted record visible indices.
    */
  def GetInsertedRecordIndices(): js.Array[Double] = js.native
  
  /**
    * Returns an array of record visible indices. An array of integer values that are the visible indices of grid records.
    * @param includeDeleted true, to include visible indices of deleted records to the returned array; otherwise, false.
    */
  def GetRecordVisibleIndices(includeDeleted: Boolean): js.Array[Double] = js.native
  
  def GetTotalSummaryValue(summaryItemIndex: String): Double = js.native
  /**
    * Returns the total summary value. The value.
    * @param summaryItemIndex The total summary's index or field name.
    */
  def GetTotalSummaryValue(summaryItemIndex: Double): Double = js.native
  
  /**
    * Returns an object that stores unsaved changes.
    */
  def GetUnsavedChanges(): js.Any = js.native
  
  /**
    * Returns an array of the updated records visible indices.
    */
  def GetUpdatedRecordIndices(): js.Array[Double] = js.native
  
  /**
    * Returns a value that indicates whether the specified data cell's data has been changed. true, if the cell has changed data; otherwise, false.
    * @param visibleIndex An integer value that specifies the visible index of a record.
    * @param rowFieldNameOrId A string value that identifies the row by the name of the data source field to which the row is bound, or by the row's name.
    */
  def HasChanges(): Boolean = js.native
  def HasChanges(visibleIndex: js.UndefOr[scala.Nothing], rowFieldNameOrId: String): Boolean = js.native
  def HasChanges(visibleIndex: Double): Boolean = js.native
  def HasChanges(visibleIndex: Double, rowFieldNameOrId: String): Boolean = js.native
  
  /**
    * Indicates if the record with the specified visible index is deleted. true, if the record is deleted; otherwise, false.
    * @param visibleIndex An integer value that identifies the record by its visible index.
    */
  def IsDeletedRecord(visibleIndex: Double): Boolean = js.native
  
  /**
    * Indicates if the record with specified visible index is newly created. true, if the record is new; otherwise, false.
    * @param visibleIndex An integer value that identifies the record by its visible index.
    */
  def IsNewRecord(visibleIndex: Double): Boolean = js.native
  
  /**
    * Programmatically moves the focus to the previous cell in the record.
    */
  def MoveFocusBackward(): Boolean = js.native
  
  /**
    * Programmatically moves the focus to the next cell in the record.
    */
  def MoveFocusForward(): Boolean = js.native
  
  /**
    * Recovers the specified record when ASPxVerticalGrid is in Batch Edit mode.
    * @param visibleIndex An integer value that identifies the record index.
    */
  def RecoverRecord(visibleIndex: Double): Unit = js.native
  
  /**
    * Recovers a record with a specified key value when ASPxVerticalGrid is in Batch Edit mode.
    * @param key An object that uniquely identifies the record.
    */
  def RecoverRecordByKey(key: js.Any): Unit = js.native
  
  /**
    * Resets changes in the specified cell.
    * @param visibleIndex An integer value that specifies the visible index of a record containing the processed cell.
    * @param rowIndex A string value that specifies the field name or unique identifier (the row's WebColumnBase.Name property value) of a row containing the processed cell.
    */
  def ResetChanges(visibleIndex: Double): Unit = js.native
  def ResetChanges(visibleIndex: Double, rowIndex: Double): Unit = js.native
  
  /**
    * Sets the value of the specified cell.
    * @param visibleIndex An integer zero-based index that identifies the row containing the processed cell.
    * @param rowFieldNameOrId A string value that specifies the field name or unique identifier (the column's WebColumnBase.Name property value) of a column containing the processed cell.
    * @param value An object that contains the new cell value.
    * @param displayText A string value that specifies the cell display text.
    * @param cancelCellHighlighting true to cancel highlighting of the modified cell, false to highlight the modified cell.
    */
  def SetCellValue(visibleIndex: Double, rowFieldNameOrId: String, value: js.Any): Unit = js.native
  def SetCellValue(
    visibleIndex: Double,
    rowFieldNameOrId: String,
    value: js.Any,
    displayText: js.UndefOr[scala.Nothing],
    cancelCellHighlighting: Boolean
  ): Unit = js.native
  def SetCellValue(visibleIndex: Double, rowFieldNameOrId: String, value: js.Any, displayText: String): Unit = js.native
  def SetCellValue(
    visibleIndex: Double,
    rowFieldNameOrId: String,
    value: js.Any,
    displayText: String,
    cancelCellHighlighting: Boolean
  ): Unit = js.native
  
  /**
    * Switches the specified cell to batch edit mode.
    * @param visibleIndex A zero-based integer value that specifies the visible index of a record containing the processed cell.
    * @param rowIndex A zero-based integer value that identifies the row which contains the processed cell in the rows collection.
    */
  def StartEdit(visibleIndex: Double, rowIndex: Double): Unit = js.native
  
  /**
    * Performs validation of grid data contained in the specified record when the grid operates in batch edit mode. true, if data in the specified record passes validation; otherwise, false.
    * @param visibleIndex An integer value specifying the visible index of the validated record.
    */
  def ValidateRecord(visibleIndex: Double): Boolean = js.native
  
  /**
    * Performs validation of grid data contained in all records when the grid operates in batch edit mode. true, if data in all records passes validation; otherwise, false.
    * @param validateOnlyModified true, if only modified records should be validated; otherwise, false.
    */
  def ValidateRecords(): Boolean = js.native
  def ValidateRecords(validateOnlyModified: Boolean): Boolean = js.native
}
