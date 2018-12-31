package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides members related to Batch Edit Mode
  */
@js.native
trait ASPxClientVerticalGridBatchEditApi extends js.Object {
  /**
    * Adds a new record when ASPxVerticalGrid is in Batch Edit mode.
    */
  def AddNewRecord(): scala.Unit = js.native
  /**
    * Deletes the specified record when ASPxVerticalGrid is in Batch Edit mode.
    * @param visibleIndex An integer value that identifies the record index.
    */
  def DeleteRecord(visibleIndex: scala.Double): scala.Unit = js.native
  /**
    * Deletes a record with a specified key value when ASPxVerticalGrid is in Batch Edit mode.
    * @param key An object that uniquely identifies the record.
    */
  def DeleteRecordByKey(key: js.Object): scala.Unit = js.native
  /**
    * Ends the cell(s) editing.
    */
  def EndEdit(): scala.Unit = js.native
  /**
    * Gets a container holding the data cell content.
    * @param visibleIndex An integer value that is the visible index.
    * @param columnFieldNameOrId A string value that is the column's Field Name or ID.
    */
  def GetCellTextContainer(visibleIndex: scala.Double, columnFieldNameOrId: java.lang.String): js.Object = js.native
  /**
    * Gets the value of the specified cell.
    * @param visibleIndex A zero-based integer value that specifies a visible index of a record containing the processed cell.
    * @param rowFieldNameOrId A string value that specifies the field name or unique identifier (the row's Name property value) of a row containing the processed cell.
    * @param initial true, to return the initial (server) value; false, to return a value currently contained on the client side (modified value).
    */
  def GetCellValue(visibleIndex: scala.Double, rowFieldNameOrId: java.lang.String): js.Object = js.native
  def GetCellValue(visibleIndex: scala.Double, rowFieldNameOrId: java.lang.String, initial: scala.Boolean): js.Object = js.native
  /**
    * Provides the text displayed within the cell according to the specified display format rule.
    * @param columnFieldNameOrId A string value representing the row's unique identifier or field name.
    * @param value An object representing a value.
    */
  def GetColumnDisplayText(columnFieldNameOrId: java.lang.String, value: js.Object): java.lang.String = js.native
  /**
    * Returns an array of the deleted record visible indices.
    */
  def GetDeletedRecordIndices(): js.Array[scala.Double] = js.native
  /**
    * Gets information about the cell currently being edited.
    */
  def GetEditCellInfo(): ASPxClientVerticalGridCellInfo = js.native
  /**
    * Returns an array of the inserted record visible indices.
    */
  def GetInsertedRecordIndices(): js.Array[scala.Double] = js.native
  /**
    * Returns an array of record visible indices.
    * @param includeDeleted true, to include visible indices of deleted records to the returned array; otherwise, false.
    */
  def GetRecordVisibleIndices(includeDeleted: scala.Boolean): js.Array[scala.Double] = js.native
  /**
    * Returns an object that stores unsaved changes.
    */
  def GetUnsavedChanges(): js.Object = js.native
  /**
    * Returns an array of the updated records visible indices.
    */
  def GetUpdatedRecordIndices(): js.Array[scala.Double] = js.native
  /**
    * Returns a value that indicates whether the vertical grid has changed data.
    */
  def HasChanges(): scala.Boolean = js.native
  /**
    * Returns a value that indicates whether the specified record has changed data.
    * @param visibleIndex An integer value that specifies the visible index of a record.
    */
  def HasChanges(visibleIndex: scala.Double): scala.Boolean = js.native
  /**
    * Returns a value that indicates whether the specified data cell's data has been changed.
    * @param visibleIndex An integer value that specifies the visible index of a record.
    * @param rowFieldNameOrId A string value that identifies the row by the name of the data source field to which the row is bound, or by the row's name.
    */
  def HasChanges(visibleIndex: scala.Double, rowFieldNameOrId: java.lang.String): scala.Boolean = js.native
  /**
    * Indicates if the record with the specified visible index is deleted.
    * @param visibleIndex An integer value that identifies the record by its visible index.
    */
  def IsDeletedRecord(visibleIndex: scala.Double): scala.Boolean = js.native
  /**
    * Indicates if the record with specified visible index is newly created.
    * @param visibleIndex An integer value that identifies the record by its visible index.
    */
  def IsNewRecord(visibleIndex: scala.Double): scala.Boolean = js.native
  /**
    * Programmatically moves the focus to the previous cell in the record.
    */
  def MoveFocusBackward(): scala.Boolean = js.native
  /**
    * Programmatically moves the focus to the next cell in the record.
    */
  def MoveFocusForward(): scala.Boolean = js.native
  /**
    * Recovers the specified record when ASPxVerticalGrid is in Batch Edit mode.
    * @param visibleIndex An integer value that identifies the record index.
    */
  def RecoverRecord(visibleIndex: scala.Double): scala.Unit = js.native
  /**
    * Recovers a record with a specified key value when ASPxVerticalGrid is in Batch Edit mode.
    * @param key An object that uniquely identifies the record.
    */
  def RecoverRecordByKey(key: js.Object): scala.Unit = js.native
  /**
    * Resets changes in the specified record.
    * @param visibleIndex An integer value that specifies the visible index of a record.
    */
  def ResetChanges(visibleIndex: scala.Double): scala.Unit = js.native
  /**
    * Resets changes in the specified cell.
    * @param visibleIndex An integer value that specifies the visible index of a record containing the processed cell.
    * @param rowIndex A string value that specifies the field name or unique identifier (the row's Name property value) of a row containing the processed cell.
    */
  def ResetChanges(visibleIndex: scala.Double, rowIndex: scala.Double): scala.Unit = js.native
  /**
    * Sets the value of the specified cell.
    * @param visibleIndex An integer zero-based index that identifies the record containing the processed cell.
    * @param rowFieldNameOrId A string value that specifies the field name or unique identifier (the row's Name property value) of a row containing the processed cell.
    * @param value An object that contains the new cell value.
    */
  def SetCellValue(visibleIndex: scala.Double, rowFieldNameOrId: java.lang.String, value: js.Object): scala.Unit = js.native
  /**
    * Sets the value of the specified cell.
    * @param visibleIndex An integer zero-based index that identifies the row containing the processed cell.
    * @param rowFieldNameOrId A string value that specifies the field name or unique identifier (the column's Name property value) of a column containing the processed cell.
    * @param value An object that contains the new cell value.
    * @param displayText A string value that specifies the cell display text.
    * @param cancelCellHighlighting true to cancel highlighting of the modified cell, false to highlight the modified cell.
    */
  def SetCellValue(
    visibleIndex: scala.Double,
    rowFieldNameOrId: java.lang.String,
    value: js.Object,
    displayText: java.lang.String
  ): scala.Unit = js.native
  def SetCellValue(
    visibleIndex: scala.Double,
    rowFieldNameOrId: java.lang.String,
    value: js.Object,
    displayText: java.lang.String,
    cancelCellHighlighting: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Switches the specified cell to batch edit mode.
    * @param visibleIndex A zero-based integer value that specifies the visible index of a record containing the processed cell.
    * @param rowIndex A zero-based integer value that identifies the row which contains the processed cell in the rows collection.
    */
  def StartEdit(visibleIndex: scala.Double, rowIndex: scala.Double): scala.Unit = js.native
  /**
    * Performs validation of grid data contained in the specified record when the grid operates in batch edit mode.
    * @param visibleIndex An integer value specifying the visible index of the validated record.
    */
  def ValidateRecord(visibleIndex: scala.Double): scala.Boolean = js.native
  /**
    * Performs validation of grid data contained in all records when the grid operates in batch edit mode.
    * @param validateOnlyModified true, if only modified records should be validated; otherwise, false.
    */
  def ValidateRecords(): scala.Boolean = js.native
  def ValidateRecords(validateOnlyModified: scala.Boolean): scala.Boolean = js.native
}

