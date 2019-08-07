package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.BatchEditRowInserting event.
  */
@JSGlobal("ASPxClientGridViewBatchEditRowInsertingEventArgs")
@js.native
class ASPxClientGridViewBatchEditRowInsertingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewBatchEditRowInsertingEventArgs class.
    * @param visibleIndex An integer value that specifies the processed row's visible index.
    */
  def this(visibleIndex: Double) = this()
  /**
    * Gets the processed row's visible index.
    */
  var visibleIndex: Double = js.native
}

