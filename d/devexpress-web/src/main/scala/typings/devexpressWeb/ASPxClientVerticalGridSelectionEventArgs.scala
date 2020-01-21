package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.SelectionChanged event.
  */
@JSGlobal("ASPxClientVerticalGridSelectionEventArgs")
@js.native
class ASPxClientVerticalGridSelectionEventArgs protected () extends ASPxClientProcessingModeEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridSelectionEventArgs class.
    * @param visibleIndex An integer value that specifies the visible index of the record whose selected state has been changed. This value is assigned to the ASPxClientVerticalGridSelectionEventArgs.visibleIndex property.
    */
  def this(visibleIndex: Double) = this()
  /**
    * Gets whether all records displayed within a page have been selected or unselected.
    */
  var isAllRecordsOnPage: Boolean = js.native
  /**
    * Gets whether a selection has been changed on the server.
    */
  var isChangedOnServer: Boolean = js.native
  /**
    * Gets whether the record has been selected.
    */
  var isSelected: Boolean = js.native
  /**
    * Gets the visible index of the record whose selected state has been changed.
    */
  var visibleIndex: Double = js.native
}

