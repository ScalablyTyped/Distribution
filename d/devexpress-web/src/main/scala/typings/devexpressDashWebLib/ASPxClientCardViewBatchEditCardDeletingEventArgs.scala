package typings
package devexpressDashWebLib

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
  var visibleIndex: scala.Double
}

object ASPxClientCardViewBatchEditCardDeletingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, cardValues: js.Object, visibleIndex: scala.Double): ASPxClientCardViewBatchEditCardDeletingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("cardValues")(cardValues)
    __obj.updateDynamic("visibleIndex")(visibleIndex)
    __obj.asInstanceOf[ASPxClientCardViewBatchEditCardDeletingEventArgs]
  }
}

