package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.BatchEditEndEditing event.
  */
trait ASPxClientGridViewBatchEditEndEditingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the row's key.
    */
  var key: js.Any
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  var rowValues: js.Any
  /**
    * Gets the visible index of the row whose cells has been edited.
    */
  var visibleIndex: Double
}

object ASPxClientGridViewBatchEditEndEditingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, key: js.Any, rowValues: js.Any, visibleIndex: Double): ASPxClientGridViewBatchEditEndEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowValues = rowValues.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewBatchEditEndEditingEventArgs]
  }
}

