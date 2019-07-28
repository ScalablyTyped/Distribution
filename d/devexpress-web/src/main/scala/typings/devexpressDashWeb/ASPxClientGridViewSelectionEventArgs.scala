package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the SelectionChanged event.
  */
trait ASPxClientGridViewSelectionEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets whether all rows displayed within a page have been selected or unselected.
    * Value: true if all rows displayed within a page have been selected or unselected; otherwise, false.
    */
  var isAllRecordsOnPage: Boolean
  /**
    * Gets whether a selection has been changed on the server.
    * Value: true  if a selection has been changed on the server; otherwise, false.
    */
  var isChangedOnServer: Boolean
  /**
    * Gets whether the row has been selected.
    * Value: true if the row has been selected; otherwise, false.
    */
  var isSelected: Boolean
  /**
    * Gets the visible index of the row whose selected state has been changed.
    * Value: An <see cref="Int32" /> value that specifies the visible index of the row.
    */
  var visibleIndex: Double
}

object ASPxClientGridViewSelectionEventArgs {
  @scala.inline
  def apply(
    isAllRecordsOnPage: Boolean,
    isChangedOnServer: Boolean,
    isSelected: Boolean,
    processOnServer: Boolean,
    visibleIndex: Double
  ): ASPxClientGridViewSelectionEventArgs = {
    val __obj = js.Dynamic.literal(isAllRecordsOnPage = isAllRecordsOnPage, isChangedOnServer = isChangedOnServer, isSelected = isSelected, processOnServer = processOnServer, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientGridViewSelectionEventArgs]
  }
}

