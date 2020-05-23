package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.BatchEditStartEditing event.
  */
trait ASPxClientCardViewBatchEditStartEditingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  var cardValues: js.Any
  /**
    * Gets the CardView column that owns a cell that is about to be edited.
    */
  var focusedColumn: ASPxClientCardViewColumn
  /**
    * Gets the visible index of the card whose cells are about to be edited.
    */
  var visibleIndex: Double
}

object ASPxClientCardViewBatchEditStartEditingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, cardValues: js.Any, focusedColumn: ASPxClientCardViewColumn, visibleIndex: Double): ASPxClientCardViewBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cardValues = cardValues.asInstanceOf[js.Any], focusedColumn = focusedColumn.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewBatchEditStartEditingEventArgs]
  }
}

