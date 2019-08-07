package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides members related to Batch Edit Mode
  */
@JSGlobal("ASPxClientCardViewBatchEditApi")
@js.native
class ASPxClientCardViewBatchEditApi () extends js.Object {
  /**
    * Adds a new card when ASPxCardView is in Batch Edit mode.
    */
  def AddNewCard(): Unit = js.native
  /**
    * Deletes the specified card when ASPxCardView is in Batch Edit mode.
    * @param visibleIndex An integer value that identifies the card index.
    */
  def DeleteCard(visibleIndex: Double): Unit = js.native
  /**
    * Deletes a card with a specified key value when ASPxCardView is in Batch Edit mode.
    * @param key An object that uniquely identifies the card.
    */
  def DeleteCardByKey(key: js.Any): Unit = js.native
  /**
    * Ends cell or card editing.
    */
  def EndEdit(): Unit = js.native
  /**
    * Returns an array of card visible indices. An array of integer values that are the visible indices of cards.
    * @param includeDeleted true, to include visible indices of deleted cards to the returned array; otherwise, false.
    */
  def GetCardVisibleIndices(includeDeleted: Boolean): js.Array[Double] = js.native
  /**
    * Gets a container holding a data cell content. An object that is the HTML container element that contains the data cell's content.
    * @param visibleIndex An integer value that is the visible index.
    * @param columnFieldNameOrId A string value that is the column's Field Name or ID.
    */
  def GetCellTextContainer(visibleIndex: Double, columnFieldNameOrId: String): js.Any = js.native
  /**
    * Gets the value of the specified cell. An object containing the specified cell's value.
    * @param visibleIndex A zero-based integer value that specifies the visible index of a card containing the processed cell.
    * @param columnFieldNameOrId A string value that specifies the field name or unique identifier (the column's WebColumnBase.Name property value) of a column containing the processed cell.
    * @param initial true, to return the initial (server) value; false, to return a value currently contained on the client side (modified value).
    */
  def GetCellValue(visibleIndex: Double, columnFieldNameOrId: String): js.Any = js.native
  def GetCellValue(visibleIndex: Double, columnFieldNameOrId: String, initial: Boolean): js.Any = js.native
  /**
    * Provides the text displayed within the cell according to the specified display format rule. A string value representing the cell's displayed text.
    * @param columnFieldNameOrId A string value representing the column's unique identifier or field name.
    * @param value An object representing a value.
    */
  def GetColumnDisplayText(columnFieldNameOrId: String, value: js.Any): String = js.native
  /**
    * Returns an array of the deleted card visible indices.
    */
  def GetDeletedCardIndices(): js.Array[Double] = js.native
  /**
    * Gets information about the cell currently being edited.
    */
  def GetEditCellInfo(): ASPxClientCardViewCellInfo = js.native
  /**
    * Returns an array of the inserted card visible indices.
    */
  def GetInsertedCardIndices(): js.Array[Double] = js.native
  /**
    * Returns an object that stores unsaved changes.
    */
  def GetUnsavedChanges(): js.Any = js.native
  /**
    * Returns an array of the updated cards' visible indices.
    */
  def GetUpdatedCardIndices(): js.Array[Double] = js.native
  /**
    * Returns a value that indicates whether the specified cell's data has been changed. true, if the cell has changed data; otherwise, false.
    * @param visibleIndex An integer value that specifies the visible index of a card.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's WebColumnBase.Name property value).
    */
  def HasChanges(): Boolean = js.native
  def HasChanges(visibleIndex: Double): Boolean = js.native
  def HasChanges(visibleIndex: Double, columnFieldNameOrId: String): Boolean = js.native
  /**
    * Indicates if the card with the specified visible index is deleted. true, if the card is deleted; otherwise, false.
    * @param visibleIndex An integer value that identifies the card by its visible index.
    */
  def IsDeletedCard(visibleIndex: Double): Boolean = js.native
  /**
    * Indicates if the card with the specified visible index is newly created. true, if the row is new; otherwise, false.
    * @param visibleIndex An integer value that identifies the card by its visible index.
    */
  def IsNewCard(visibleIndex: Double): Boolean = js.native
  /**
    * Programmatically moves the focus to the previous cell in the card
    */
  def MoveFocusBackward(): Boolean = js.native
  /**
    * Programmatically moves the focus to the next cell in the card.
    */
  def MoveFocusForward(): Boolean = js.native
  /**
    * Recovers the specified card when ASPxCardView is in Batch Edit mode.
    * @param visibleIndex An integer value that identifies the card index.
    */
  def RecoverCard(visibleIndex: Double): Unit = js.native
  /**
    * Recovers a card with a specified key value when ASPxCardView is in Batch Edit mode.
    * @param key An object that uniquely identifies the card.
    */
  def RecoverCardByKey(key: js.Any): Unit = js.native
  /**
    * Resets changes in the specified cell.
    * @param visibleIndex An integer value that specifies the visible index of a card containing the processed cell.
    * @param columnIndex A string value that specifies the field name or unique identifier (the column's WebColumnBase.Name property value) of a column containing the processed cell.
    */
  def ResetChanges(visibleIndex: Double): Unit = js.native
  def ResetChanges(visibleIndex: Double, columnIndex: Double): Unit = js.native
  /**
    * Sets the value of the specified cell.
    * @param visibleIndex An integer zero-based index that identifies the card containing the processed cell.
    * @param columnFieldNameOrId A string value that specifies the field name or unique identifier (the column's WebColumnBase.Name property value) of a column containing the processed cell.
    * @param value An object that contains the new cell value.
    * @param displayText A string value that specifies the cell display text.
    * @param cancelCellHighlighting true to cancel highlighting of the modified cell, false to highlight the modified cell.
    */
  def SetCellValue(visibleIndex: Double, columnFieldNameOrId: String, value: js.Any): Unit = js.native
  def SetCellValue(visibleIndex: Double, columnFieldNameOrId: String, value: js.Any, displayText: String): Unit = js.native
  def SetCellValue(
    visibleIndex: Double,
    columnFieldNameOrId: String,
    value: js.Any,
    displayText: String,
    cancelCellHighlighting: Boolean
  ): Unit = js.native
  /**
    * Switches the specified cell to edit mode.
    * @param visibleIndex A zero-based integer value that specifies the visible index of a card containing the processed cell.
    * @param columnIndex A zero-based integer value that identifies the column which contains the processed cell in the column collection.
    */
  def StartEdit(visibleIndex: Double, columnIndex: Double): Unit = js.native
  /**
    * Performs validation of CardView data contained in the specified card when the CardView operates in Batch Edit mode. true, if data in the specified card data passes validation; otherwise, false.
    * @param visibleIndex An integer value specifying the visible index of the validated card.
    */
  def ValidateCard(visibleIndex: Double): Boolean = js.native
  /**
    * Performs validation of CardView data contained in the cards when the CardView operates in Batch Edit mode. true, if data in the cards data passes validation; otherwise, false.
    * @param validateOnlyModified true, if only modified cards should be validated; otherwise, false.
    */
  def ValidateCards(): Boolean = js.native
  def ValidateCards(validateOnlyModified: Boolean): Boolean = js.native
}

