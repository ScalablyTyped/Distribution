package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditCardDeleting event.
  */
trait ASPxClientCardViewBatchEditCardDeletingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets a hashtable that maintains information about deleted cells.
    * Value: A hashtable that stores information about deleted cells.
    */
  var cardValues: js.Object
  /**
    * Gets the processed card visible index.
    * Value: An integer value that specifies the processed card visible index.
    */
  var visibleIndex: Double
}

object ASPxClientCardViewBatchEditCardDeletingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, cardValues: js.Object, visibleIndex: Double): ASPxClientCardViewBatchEditCardDeletingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, cardValues = cardValues, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientCardViewBatchEditCardDeletingEventArgs]
  }
}

