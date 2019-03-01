package typings
package devexpressDashWebLib

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
  var visibleIndex: scala.Double
}

object ASPxClientVerticalGridBatchEditRecordDeletingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, recordValues: js.Object, visibleIndex: scala.Double): ASPxClientVerticalGridBatchEditRecordDeletingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("recordValues")(recordValues)
    __obj.updateDynamic("visibleIndex")(visibleIndex)
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditRecordDeletingEventArgs]
  }
}

