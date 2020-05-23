package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.BatchEditRowDeleting event.
  */
trait ASPxClientGridViewBatchEditRowDeletingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the row's key.
    */
  var key: js.Any
  /**
    * Gets a hashtable that maintains information about deleted cells.
    */
  var rowValues: js.Any
  /**
    * Gets the processed row's visible index.
    */
  var visibleIndex: Double
}

object ASPxClientGridViewBatchEditRowDeletingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, key: js.Any, rowValues: js.Any, visibleIndex: Double): ASPxClientGridViewBatchEditRowDeletingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowValues = rowValues.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewBatchEditRowDeletingEventArgs]
  }
}

