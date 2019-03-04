package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditEndEditing event.
  */
trait ASPxClientCardViewBatchEditEndEditingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets a hashtable that maintains information about editable cells.
    * Value: A hashtable that stores information about editable cells.
    */
  var cardValues: js.Object
  /**
    * Gets the visible index of the card whose cells have been edited.
    * Value: An <see cref="Int32" /> value that specifies the visible index of the card.
    */
  var visibleIndex: scala.Double
}

object ASPxClientCardViewBatchEditEndEditingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, cardValues: js.Object, visibleIndex: scala.Double): ASPxClientCardViewBatchEditEndEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, cardValues = cardValues, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientCardViewBatchEditEndEditingEventArgs]
  }
}

