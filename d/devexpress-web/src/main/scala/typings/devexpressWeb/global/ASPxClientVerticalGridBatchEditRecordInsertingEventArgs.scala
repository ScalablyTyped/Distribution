package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditRecordInserting event.
  */
@JSGlobal("ASPxClientVerticalGridBatchEditRecordInsertingEventArgs")
@js.native
class ASPxClientVerticalGridBatchEditRecordInsertingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientVerticalGridBatchEditRecordInsertingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridBatchEditRecordInsertingEventArgs class.
    * @param visibleIndex An integer value that specifies the processed record's visible index.
    */
  def this(visibleIndex: Double) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets the processed record's visible index.
    */
  /* CompleteClass */
  override var visibleIndex: Double = js.native
}

