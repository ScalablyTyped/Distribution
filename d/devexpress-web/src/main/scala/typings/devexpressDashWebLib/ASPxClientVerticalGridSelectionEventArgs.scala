package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the SelectionChanged event.
  */
trait ASPxClientVerticalGridSelectionEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets whether all records displayed within a page have been selected or unselected.
    * Value: true if all records displayed within a page have been selected or unselected; otherwise, false.
    */
  var isAllRecordsOnPage: scala.Boolean
  /**
    * Gets whether a selection has been changed on the server.
    * Value: true  if a selection has been changed on the server; otherwise, false.
    */
  var isChangedOnServer: scala.Boolean
  /**
    * Gets whether the record has been selected.
    * Value: true, if the record has been selected; otherwise, false.
    */
  var isSelected: scala.Boolean
  /**
    * Gets the visible index of the record whose selected state has been changed.
    * Value: An <see cref="Int32" /> value that specifies the visible index of the record.
    */
  var visibleIndex: scala.Double
}

object ASPxClientVerticalGridSelectionEventArgs {
  @scala.inline
  def apply(
    isAllRecordsOnPage: scala.Boolean,
    isChangedOnServer: scala.Boolean,
    isSelected: scala.Boolean,
    processOnServer: scala.Boolean,
    visibleIndex: scala.Double
  ): ASPxClientVerticalGridSelectionEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isAllRecordsOnPage")(isAllRecordsOnPage)
    __obj.updateDynamic("isChangedOnServer")(isChangedOnServer)
    __obj.updateDynamic("isSelected")(isSelected)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.updateDynamic("visibleIndex")(visibleIndex)
    __obj.asInstanceOf[ASPxClientVerticalGridSelectionEventArgs]
  }
}

