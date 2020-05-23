package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditRecordInserting event.
  */
trait ASPxClientVerticalGridBatchEditRecordInsertingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed record's visible index.
    */
  var visibleIndex: Double
}

object ASPxClientVerticalGridBatchEditRecordInsertingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, visibleIndex: Double): ASPxClientVerticalGridBatchEditRecordInsertingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditRecordInsertingEventArgs]
  }
}

