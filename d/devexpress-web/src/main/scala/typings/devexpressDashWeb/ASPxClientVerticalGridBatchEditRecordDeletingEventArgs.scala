package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditRecordDeleting event.
  */
trait ASPxClientVerticalGridBatchEditRecordDeletingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets a hashtable that maintains information about deleted cells.
    * Value: A hashtable that stores information about deleted cells.
    */
  var recordValues: js.Object
  /**
    * Gets the processed record's visible index.
    * Value: An integer value that specifies the processed record's visible index.
    */
  var visibleIndex: Double
}

object ASPxClientVerticalGridBatchEditRecordDeletingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, recordValues: js.Object, visibleIndex: Double): ASPxClientVerticalGridBatchEditRecordDeletingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, recordValues = recordValues, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditRecordDeletingEventArgs]
  }
}

