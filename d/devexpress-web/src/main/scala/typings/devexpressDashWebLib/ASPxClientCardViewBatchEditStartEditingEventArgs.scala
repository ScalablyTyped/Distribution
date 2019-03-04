package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditStartEditing event.
  */
trait ASPxClientCardViewBatchEditStartEditingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets a hashtable that maintains information about editable cells.
    * Value: A hashtable that stores information about editable cells.
    */
  var cardValues: js.Object
  /**
    * Gets the CardView column that owns a cell that is about to be edited.
    * Value: An <see cref="ASPxClientCardViewColumn" /> object that is the focused CardView column.
    */
  var focusedColumn: ASPxClientCardViewColumn
  /**
    * Gets the visible index of the card whose cells are about to be edited.
    * Value: An <see cref="Int32" /> value that specifies the visible index of the card.
    */
  var visibleIndex: scala.Double
}

object ASPxClientCardViewBatchEditStartEditingEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    cardValues: js.Object,
    focusedColumn: ASPxClientCardViewColumn,
    visibleIndex: scala.Double
  ): ASPxClientCardViewBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, cardValues = cardValues, focusedColumn = focusedColumn, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientCardViewBatchEditStartEditingEventArgs]
  }
}

