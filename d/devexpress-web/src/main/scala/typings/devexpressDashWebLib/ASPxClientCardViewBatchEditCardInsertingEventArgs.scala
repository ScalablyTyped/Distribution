package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditCardInserting event.
  */
trait ASPxClientCardViewBatchEditCardInsertingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed card visible index.
    * Value: An integer value that specifies the processed card visible index.
    */
  var visibleIndex: scala.Double
}

object ASPxClientCardViewBatchEditCardInsertingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, visibleIndex: scala.Double): ASPxClientCardViewBatchEditCardInsertingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("visibleIndex")(visibleIndex)
    __obj.asInstanceOf[ASPxClientCardViewBatchEditCardInsertingEventArgs]
  }
}

