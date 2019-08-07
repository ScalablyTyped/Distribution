package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditRecordDeleting event.
  */
@JSGlobal("ASPxClientVerticalGridBatchEditRecordDeletingEventArgs")
@js.native
class ASPxClientVerticalGridBatchEditRecordDeletingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridBatchEditRecordDeletingEventArgs class.
    * @param visibleIndex An integer value that specifies the processed record's visible index.
    * @param recordValues A hashtable that stores information about the processed record's cells.
    */
  def this(visibleIndex: Double, recordValues: js.Any) = this()
  /**
    * Gets a hashtable that maintains information about deleted cells.
    */
  var recordValues: js.Any = js.native
  /**
    * Gets the processed record's visible index.
    */
  var visibleIndex: Double = js.native
}

