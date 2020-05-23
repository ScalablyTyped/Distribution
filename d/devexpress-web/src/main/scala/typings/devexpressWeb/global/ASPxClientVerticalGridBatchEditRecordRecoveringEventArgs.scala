package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditRecordRecovering event.
  */
@JSGlobal("ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs")
@js.native
class ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs class.
    * @param visibleIndex An integer value specifying a record's visible index.
    * @param recordValues An object representing record values.
    */
  def this(visibleIndex: Double, recordValues: js.Any) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets a hashtable that maintains information about recovered cells.
    */
  /* CompleteClass */
  override var recordValues: js.Any = js.native
  /**
    * Gets the processed record's visible index.
    */
  /* CompleteClass */
  override var visibleIndex: Double = js.native
}

