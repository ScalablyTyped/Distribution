package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditRowInserting event.
  */
trait ASPxClientGridViewBatchEditRowInsertingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed row's visible index.
    * Value: An integer value that specifies the processed row's visible index.
    */
  var visibleIndex: scala.Double
}

object ASPxClientGridViewBatchEditRowInsertingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, visibleIndex: scala.Double): ASPxClientGridViewBatchEditRowInsertingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("visibleIndex")(visibleIndex)
    __obj.asInstanceOf[ASPxClientGridViewBatchEditRowInsertingEventArgs]
  }
}

