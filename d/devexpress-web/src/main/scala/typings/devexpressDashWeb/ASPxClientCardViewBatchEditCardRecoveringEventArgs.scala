package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditCardRecovering event.
  */
trait ASPxClientCardViewBatchEditCardRecoveringEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets a hashtable that maintains information about recovered cells.
    * Value: A hashtable that stores information about recovered cells.
    */
  var cardValues: js.Object
  /**
    * Gets the visible index of the card whose cells has been recovered.
    * Value: An <see cref="Int32" /> value that specifies the visible index of the card.
    */
  var visibleIndex: Double
}

object ASPxClientCardViewBatchEditCardRecoveringEventArgs {
  @scala.inline
  def apply(cancel: Boolean, cardValues: js.Object, visibleIndex: Double): ASPxClientCardViewBatchEditCardRecoveringEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, cardValues = cardValues, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientCardViewBatchEditCardRecoveringEventArgs]
  }
}

