package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides members related to Batch Edit Mode
 */
@js.native
trait ASPxClientCardViewBatchEditApi extends js.Object {
  /**
       * Adds a new card when ASPxCardView is in Batch Edit mode.
       */
  def AddNewCard(): scala.Unit = js.native
  /**
       * Deletes the specified card when ASPxCardView is in Batch Edit mode.
       * @param visibleIndex An integer value that identifies the card index.
       */
  def DeleteCard(visibleIndex: scala.Double): scala.Unit = js.native
  /**
       * Deletes a card with a specified key value when ASPxCardView is in Batch Edit mode.
       * @param key An object that uniquely identifies the card.
       */
  def DeleteCardByKey(key: js.Object): scala.Unit = js.native
  /**
       * Ends cell or card editing.
       */
  def EndEdit(): scala.Unit = js.native
  /**
       * Returns an array of card visible indices.
       * @param includeDeleted true, to include visible indices of deleted cards to the returned array; otherwise, false.
       */
  def GetCardVisibleIndices(includeDeleted: scala.Boolean): js.Array[scala.Double] = js.native
  /**
       * Gets a container holding a data cell content.
       * @param visibleIndex An integer value that is the visible index.
       * @param columnFieldNameOrId A string value that is the column's Field Name or ID.
       */
  def GetCellTextContainer(visibleIndex: scala.Double, columnFieldNameOrId: java.lang.String): js.Object = js.native
  /**
       * Gets the value of the specified cell.
       * @param visibleIndex A zero-based integer value that specifies the visible index of a card containing the processed cell.
       * @param columnFieldNameOrId A string value that specifies the field name or unique identifier (the column's Name property value) of a column containing the processed cell.
       * @param initial true, to return the initial (server) value; false, to return a value currently contained on the client side (modified value).
       */
  def GetCellValue(visibleIndex: scala.Double, columnFieldNameOrId: java.lang.String): js.Object = js.native
  /**
       * Gets the value of the specified cell.
       * @param visibleIndex A zero-based integer value that specifies the visible index of a card containing the processed cell.
       * @param columnFieldNameOrId A string value that specifies the field name or unique identifier (the column's Name property value) of a column containing the processed cell.
       * @param initial true, to return the initial (server) value; false, to return a value currently contained on the client side (modified value).
       */
  def GetCellValue(visibleIndex: scala.Double, columnFieldNameOrId: java.lang.String, initial: scala.Boolean): js.Object = js.native
  /**
       * Provides the text displayed within the cell according to the specified display format rule.
       * @param columnFieldNameOrId A string value representing the column's unique identifier or field name.
       * @param value An object representing a value.
       */
  def GetColumnDisplayText(columnFieldNameOrId: java.lang.String, value: js.Object): java.lang.String = js.native
  /**
       * Returns an array of the deleted card visible indices.
       */
  def GetDeletedCardIndices(): js.Array[scala.Double] = js.native
  /**
       * Gets information about the cell currently being edited.
       */
  def GetEditCellInfo(): ASPxClientCardViewCellInfo = js.native
  /**
       * Returns an array of the inserted card visible indices.
       */
  def GetInsertedCardIndices(): js.Array[scala.Double] = js.native
  /**
       * Returns an object that stores unsaved changes.
       */
  def GetUnsavedChanges(): js.Object = js.native
  /**
       * Returns an array of the updated cards' visible indices.
       */
  def GetUpdatedCardIndices(): js.Array[scala.Double] = js.native
  /**
       * Returns a value that indicates whether the card view has changed data.
       */
  def HasChanges(): scala.Boolean = js.native
  /**
       * Returns a value that indicates whether the specified card has changed data.
       * @param visibleIndex An integer value that specifies the visible index of a card.
       */
  def HasChanges(visibleIndex: scala.Double): scala.Boolean = js.native
  /**
       * Returns a value that indicates whether the specified cell's data has been changed.
       * @param visibleIndex An integer value that specifies the visible index of a card.
       * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
       */
  def HasChanges(visibleIndex: scala.Double, columnFieldNameOrId: java.lang.String): scala.Boolean = js.native
  /**
       * Indicates if the card with the specified visible index is deleted.
       * @param visibleIndex An integer value that identifies the card by its visible index.
       */
  def IsDeletedCard(visibleIndex: scala.Double): scala.Boolean = js.native
  /**
       * Indicates if the card with the specified visible index is newly created.
       * @param visibleIndex An integer value that identifies the card by its visible index.
       */
  def IsNewCard(visibleIndex: scala.Double): scala.Boolean = js.native
  /**
       * Programmatically moves the focus to the previous cell in the card
       */
  def MoveFocusBackward(): scala.Boolean = js.native
  /**
       * Programmatically moves the focus to the next cell in the card.
       */
  def MoveFocusForward(): scala.Boolean = js.native
  /**
       * Recovers the specified card when ASPxCardView is in Batch Edit mode.
       * @param visibleIndex An integer value that identifies the card index.
       */
  def RecoverCard(visibleIndex: scala.Double): scala.Unit = js.native
  /**
       * Recovers a card with a specified key value when ASPxCardView is in Batch Edit mode.
       * @param key An object that uniquely identifies the card.
       */
  def RecoverCardByKey(key: js.Object): scala.Unit = js.native
  /**
       * Resets changes in the specified card.
       * @param visibleIndex An integer value that specifies the visible index of a card.
       */
  def ResetChanges(visibleIndex: scala.Double): scala.Unit = js.native
  /**
       * Resets changes in the specified cell.
       * @param visibleIndex An integer value that specifies the visible index of a card containing the processed cell.
       * @param columnIndex A string value that specifies the field name or unique identifier (the column's Name property value) of a column containing the processed cell.
       */
  def ResetChanges(visibleIndex: scala.Double, columnIndex: scala.Double): scala.Unit = js.native
  /**
       * Sets the value of the specified cell.
       * @param visibleIndex An integer zero-based index that identifies the card containing the processed cell.
       * @param columnFieldNameOrId A string value that specifies the field name or unique identifier (the column's Name property value) of a column containing the processed cell.
       * @param value An object that contains the new cell value.
       */
  def SetCellValue(visibleIndex: scala.Double, columnFieldNameOrId: java.lang.String, value: js.Object): scala.Unit = js.native
  /**
       * Sets the value of the specified cell.
       * @param visibleIndex An integer zero-based index that identifies the card containing the processed cell.
       * @param columnFieldNameOrId A string value that specifies the field name or unique identifier (the column's Name property value) of a column containing the processed cell.
       * @param value An object that contains the new cell value.
       * @param displayText A string value that specifies the cell display text.
       * @param cancelCellHighlighting true to cancel highlighting of the modified cell, false to highlight the modified cell.
       */
  def SetCellValue(
    visibleIndex: scala.Double,
    columnFieldNameOrId: java.lang.String,
    value: js.Object,
    displayText: java.lang.String
  ): scala.Unit = js.native
  /**
       * Sets the value of the specified cell.
       * @param visibleIndex An integer zero-based index that identifies the card containing the processed cell.
       * @param columnFieldNameOrId A string value that specifies the field name or unique identifier (the column's Name property value) of a column containing the processed cell.
       * @param value An object that contains the new cell value.
       * @param displayText A string value that specifies the cell display text.
       * @param cancelCellHighlighting true to cancel highlighting of the modified cell, false to highlight the modified cell.
       */
  def SetCellValue(
    visibleIndex: scala.Double,
    columnFieldNameOrId: java.lang.String,
    value: js.Object,
    displayText: java.lang.String,
    cancelCellHighlighting: scala.Boolean
  ): scala.Unit = js.native
  /**
       * Switches the specified cell to edit mode.
       * @param visibleIndex A zero-based integer value that specifies the visible index of a card containing the processed cell.
       * @param columnIndex A zero-based integer value that identifies the column which contains the processed cell in the column collection.
       */
  def StartEdit(visibleIndex: scala.Double, columnIndex: scala.Double): scala.Unit = js.native
  /**
       * Performs validation of CardView data contained in the specified card when the CardView operates in Batch Edit mode.
       * @param visibleIndex An integer value specifying the visible index of the validated card.
       */
  def ValidateCard(visibleIndex: scala.Double): scala.Boolean = js.native
  /**
       * Performs validation of CardView data contained in the cards when the CardView operates in Batch Edit mode.
       * @param validateOnlyModified true, if only modified cards should be validated; otherwise, false.
       */
  def ValidateCards(): scala.Boolean = js.native
  /**
       * Performs validation of CardView data contained in the cards when the CardView operates in Batch Edit mode.
       * @param validateOnlyModified true, if only modified cards should be validated; otherwise, false.
       */
  def ValidateCards(validateOnlyModified: scala.Boolean): scala.Boolean = js.native
}

