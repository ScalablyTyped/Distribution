package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditRecordRecovering event.
  */
trait ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets a hashtable that maintains information about recovered cells.
    * Value: A hashtable that stores information about recovered cells.
    */
  var recordValues: js.Object
  /**
    * Gets the processed record's visible index.
    * Value: An integer value that specifies the processed record's visible index.
    */
  var visibleIndex: scala.Double
}

object ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, recordValues: js.Object, visibleIndex: scala.Double): ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, recordValues = recordValues, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs]
  }
}

