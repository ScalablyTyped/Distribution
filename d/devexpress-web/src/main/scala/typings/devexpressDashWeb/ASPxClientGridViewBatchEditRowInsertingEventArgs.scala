package typings.devexpressDashWeb

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
  var visibleIndex: Double
}

object ASPxClientGridViewBatchEditRowInsertingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, visibleIndex: Double): ASPxClientGridViewBatchEditRowInsertingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientGridViewBatchEditRowInsertingEventArgs]
  }
}

