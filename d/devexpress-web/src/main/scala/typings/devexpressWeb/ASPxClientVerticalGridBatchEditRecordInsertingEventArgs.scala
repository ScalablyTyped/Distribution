package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditRecordInserting event.
  */
@JSGlobal("ASPxClientVerticalGridBatchEditRecordInsertingEventArgs")
@js.native
class ASPxClientVerticalGridBatchEditRecordInsertingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridBatchEditRecordInsertingEventArgs class.
    * @param visibleIndex An integer value that specifies the processed record's visible index.
    */
  def this(visibleIndex: Double) = this()
  /**
    * Gets the processed record's visible index.
    */
  var visibleIndex: Double = js.native
}

