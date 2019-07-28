package typings.devexpressDashWeb

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
  def DeleteRowByKey(key: js.Object): Unit = js.native
  /**
    * Ends cell or row editing.
    */
  def EndEdit(): Unit = js.native
  /**
    * Gets a container holding a data cell content.
    * @param visibleIndex An integer value that is the visible index.
    * @param columnFieldNameOrId A string value that is the column's Field Name or ID.
    */
  def GetCellTextContainer(visibleIndex: Double, columnFieldNameOrId: String): js.Object = js.native
  /**
    * Gets the value of the specified cell.
    * @param visibleIndex A zero-based integer value that specifies a visible index of a row containing the processed cell.
    * @param columnFieldNameOrId A string value that specifies the field name or unique identifier (the column's Name property value) of a column containing the processed cell.
    * @param initial true, to return the initial (server) value; false, to return a value currently contained on the client side (modified value).
    */
  def GetCellValue(visibleIndex: Double, columnFieldNameOrId: String): js.Object = js.native
  def GetCellValue(visibleIndex: Double, columnFieldNameOrId: String, initial: Boolean): js.Object = js.native
  /**
    * Provides the text displayed within the cell according to the specified display format rule.
    * @param columnFieldNameOrId A string value representing the column's unique identifier or field name.
    * @param value An object representing a value.
    */
  def GetColumnDisplayText(columnFieldNameOrId: String, value: js.Object): String = js.native
  /**
    * Returns an array of the deleted row visible indices.
    */
  def GetDeletedRowIndices(): js.Array[Double] = js.native
  /**
    * Gets information about the cell currently being edited.
    */
  def GetEditCellInfo(): ASPxClientGridViewCellInfo = js.native
  /**
    * Returns an array of the inserted row visible indices.
    */
  def GetInsertedRowIndices(): js.Array[Double] = js.native
  /**
    * Returns an array of row visible indices.
    * @param includeDeleted true, to include visible indices of deleted rows to the returned array; otherwise, false.
    */
  def GetRowVisibleIndices(includeDeleted: Boolean): js.Array[Double] = js.native
  /**
    * Returns an object that stores unsaved changes.
    */
  def GetUnsavedChanges(): js.Object = js.native
  /**
    * Returns an array of the updated rows visible indices.
    */
  def GetUpdatedRowIndices(): js.Array[Double] = js.native
  /**
    * Returns a value that indicates whether the grid has changed data.
    */
  def HasChanges(): Boolean = js.native
  /**
    * Returns a value that indicates whether the specified row has changed data.
    * @param visibleIndex An integer value that specifies the visible index of a row.
    */
  def HasChanges(visibleIndex: Double): Boolean = js.native
  /**
    * Returns a value that indicates whether the specified data cell's data has been changed.
    * @param visibleIndex An integer value that specifies the visible index of a row.
    * @param columnFieldNameOrId A string value that identifies the column by the name of the data source field to which the column is bound, or by the column's name.
    */
  def HasChanges(visibleIndex: Double, columnFieldNameOrId: String): Boolean = js.native
  def HideChangesPreview(): Unit = js.native
  /**
    * Indicates if the row with specified visible index is deleted.
    * @param visibleIndex An integer value that identifies the row by its visible index.
    */
  def IsDeletedRow(visibleIndex: Double): Boolean = js.native
  /**
    * Indicates if the row with specified visible index is newly created.
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
  def RecoverRowByKey(key: js.Object): Unit = js.native
  /**
    * Resets changes in the specified row.
    * @param visibleIndex An integer value that specifies the visible index of a row.
    */
  def ResetChanges(visibleIndex: Double): Unit = js.native
  /**
    * Resets changes in the specified cell.
    * @param visibleIndex An integer value that specifies the visible index of a row containing the processed cell.
    * @param columnIndex An integer value that specifies the field name or unique identifier (the column's Name property value) of a column containing the processed cell.
    */
  def ResetChanges(visibleIndex: Double, columnIndex: Double): Unit = js.native
  /**
    * Sets the value of the specified cell.
    * @param visibleIndex An integer zero-based index that identifies the row containing the processed cell.
    * @param columnFieldNameOrId A string value that specifies the field name or unique identifier (the column's Name property value) of a column containing the processed cell.
    * @param value An object that contains the new cell value.
    */
  def SetCellValue(visibleIndex: Double, columnFieldNameOrId: String, value: js.Object): Unit = js.native
  /**
    * Sets the value of the specified cell.
    * @param visibleIndex An integer zero-based index that identifies the row containing the processed cell.
    * @param columnFieldNameOrId A string value that specifies the field name or unique identifier (the column's Name property value) of a column containing the processed cell.
    * @param value An object that contains the new cell value.
    * @param displayText A string value that specifies the cell display text.
    * @param cancelCellHighlighting true to cancel highlighting of the modified cell, false to highlight the modified cell.
    */
  def SetCellValue(visibleIndex: Double, columnFieldNameOrId: String, value: js.Object, displayText: String): Unit = js.native
  def SetCellValue(
    visibleIndex: Double,
    columnFieldNameOrId: String,
    value: js.Object,
    displayText: String,
    cancelCellHighlighting: Boolean
  ): Unit = js.native
  def ShowChangesPreview(): Unit = js.native
  /**
    * Switches the specified cell to edit mode.
    * @param visibleIndex A zero-based integer value that specifies the visible index of a row containing the processed cell.
    * @param columnIndex A zero-based integer value that identifies the column which contains the processed cell in the column collection.
    */
  def StartEdit(visibleIndex: Double, columnIndex: Double): Unit = js.native
  /**
    * Performs validation of grid data contained in the specified row when the grid operates in Batch Edit mode.
    * @param visibleIndex An integer value specifying the visible index of the validated row.
    */
  def ValidateRow(visibleIndex: Double): Boolean = js.native
  /**
    * Performs validation of grid data contained in all rows when the grid operates in Batch Edit mode.
    * @param validateOnlyModified true, if only modified rows should be validated; otherwise, false.
    */
  def ValidateRows(): Boolean = js.native
  def ValidateRows(validateOnlyModified: Boolean): Boolean = js.native
}

