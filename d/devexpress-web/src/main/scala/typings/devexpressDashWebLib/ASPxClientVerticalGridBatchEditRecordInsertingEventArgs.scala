package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditRecordInserting event.
  */
trait ASPxClientVerticalGridBatchEditRecordInsertingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed record's visible index.
    * Value: An integer value that specifies the processed record's visible index.
    */
  var visibleIndex: scala.Double
}

object ASPxClientVerticalGridBatchEditRecordInsertingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, visibleIndex: scala.Double): ASPxClientVerticalGridBatchEditRecordInsertingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditRecordInsertingEventArgs]
  }
}

