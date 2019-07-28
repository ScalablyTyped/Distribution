package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the SelectionChanged event.
  */
trait ASPxClientCardViewSelectionEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets whether all cards displayed within a page have been selected or unselected.
    * Value: true if all cards displayed within a page have been selected or unselected; otherwise, false.
    */
  var isAllRecordsOnPage: Boolean
  /**
    * Gets whether a selection has been changed on the server.
    * Value: true  if a selection has been changed on the server; otherwise, false.
    */
  var isChangedOnServer: Boolean
  /**
    * Gets whether the card has been selected.
    * Value: true if the card has been selected; otherwise, false.
    */
  var isSelected: Boolean
  /**
    * Gets the visible index of the card whose selected state has been changed.
    * Value: An <see cref="Int32" /> value that specifies the visible index of the card.
    */
  var visibleIndex: Double
}

object ASPxClientCardViewSelectionEventArgs {
  @scala.inline
  def apply(
    isAllRecordsOnPage: Boolean,
    isChangedOnServer: Boolean,
    isSelected: Boolean,
    processOnServer: Boolean,
    visibleIndex: Double
  ): ASPxClientCardViewSelectionEventArgs = {
    val __obj = js.Dynamic.literal(isAllRecordsOnPage = isAllRecordsOnPage, isChangedOnServer = isChangedOnServer, isSelected = isSelected, processOnServer = processOnServer, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientCardViewSelectionEventArgs]
  }
}

