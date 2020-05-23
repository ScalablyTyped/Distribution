package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.SelectionChanged event.
  */
trait ASPxClientVerticalGridSelectionEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets whether all records displayed within a page have been selected or unselected.
    */
  var isAllRecordsOnPage: Boolean
  /**
    * Gets whether a selection has been changed on the server.
    */
  var isChangedOnServer: Boolean
  /**
    * Gets whether the record has been selected.
    */
  var isSelected: Boolean
  /**
    * Gets the visible index of the record whose selected state has been changed.
    */
  var visibleIndex: Double
}

object ASPxClientVerticalGridSelectionEventArgs {
  @scala.inline
  def apply(
    isAllRecordsOnPage: Boolean,
    isChangedOnServer: Boolean,
    isSelected: Boolean,
    processOnServer: Boolean,
    visibleIndex: Double
  ): ASPxClientVerticalGridSelectionEventArgs = {
    val __obj = js.Dynamic.literal(isAllRecordsOnPage = isAllRecordsOnPage.asInstanceOf[js.Any], isChangedOnServer = isChangedOnServer.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridSelectionEventArgs]
  }
}

