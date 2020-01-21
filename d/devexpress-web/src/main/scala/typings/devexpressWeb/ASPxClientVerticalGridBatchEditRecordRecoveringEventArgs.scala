package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditRecordRecovering event.
  */
@JSGlobal("ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs")
@js.native
class ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs class.
    * @param visibleIndex An integer value specifying a record's visible index.
    * @param recordValues An object representing record values.
    */
  def this(visibleIndex: Double, recordValues: js.Any) = this()
  /**
    * Gets a hashtable that maintains information about recovered cells.
    */
  var recordValues: js.Any = js.native
  /**
    * Gets the processed record's visible index.
    */
  var visibleIndex: Double = js.native
}

