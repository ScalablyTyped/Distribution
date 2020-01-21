package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.SelectionChanged event.
  */
@JSGlobal("ASPxClientCardViewSelectionEventArgs")
@js.native
class ASPxClientCardViewSelectionEventArgs protected () extends ASPxClientProcessingModeEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewSelectionEventArgs class.
    * @param visibleIndex An integer value that specifies the visible index of the card whose selected state has been changed. This value is assigned to the ASPxClientCardViewSelectionEventArgs.visibleIndex property.
    */
  def this(visibleIndex: Double) = this()
  /**
    * Gets whether all cards displayed within a page have been selected or unselected.
    */
  var isAllRecordsOnPage: Boolean = js.native
  /**
    * Gets whether a selection has been changed on the server.
    */
  var isChangedOnServer: Boolean = js.native
  /**
    * Gets whether the card has been selected.
    */
  var isSelected: Boolean = js.native
  /**
    * Gets the visible index of the card whose selected state has been changed.
    */
  var visibleIndex: Double = js.native
}

