package typings
package devexpressDashWebLib

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
  var isAllRecordsOnPage: scala.Boolean
  /**
    * Gets whether a selection has been changed on the server.
    * Value: true  if a selection has been changed on the server; otherwise, false.
    */
  var isChangedOnServer: scala.Boolean
  /**
    * Gets whether the card has been selected.
    * Value: true if the card has been selected; otherwise, false.
    */
  var isSelected: scala.Boolean
  /**
    * Gets the visible index of the card whose selected state has been changed.
    * Value: An <see cref="Int32" /> value that specifies the visible index of the card.
    */
  var visibleIndex: scala.Double
}

object ASPxClientCardViewSelectionEventArgs {
  @scala.inline
  def apply(
    isAllRecordsOnPage: scala.Boolean,
    isChangedOnServer: scala.Boolean,
    isSelected: scala.Boolean,
    processOnServer: scala.Boolean,
    visibleIndex: scala.Double
  ): ASPxClientCardViewSelectionEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isAllRecordsOnPage")(isAllRecordsOnPage)
    __obj.updateDynamic("isChangedOnServer")(isChangedOnServer)
    __obj.updateDynamic("isSelected")(isSelected)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.updateDynamic("visibleIndex")(visibleIndex)
    __obj.asInstanceOf[ASPxClientCardViewSelectionEventArgs]
  }
}

