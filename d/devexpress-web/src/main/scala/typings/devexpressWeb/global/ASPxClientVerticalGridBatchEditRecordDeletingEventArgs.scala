package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditRecordDeleting event.
  */
@JSGlobal("ASPxClientVerticalGridBatchEditRecordDeletingEventArgs")
@js.native
class ASPxClientVerticalGridBatchEditRecordDeletingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientVerticalGridBatchEditRecordDeletingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridBatchEditRecordDeletingEventArgs class.
    * @param visibleIndex An integer value that specifies the processed record's visible index.
    * @param recordValues A hashtable that stores information about the processed record's cells.
    */
  def this(visibleIndex: Double, recordValues: js.Any) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets a hashtable that maintains information about deleted cells.
    */
  /* CompleteClass */
  override var recordValues: js.Any = js.native
  /**
    * Gets the processed record's visible index.
    */
  /* CompleteClass */
  override var visibleIndex: Double = js.native
}

