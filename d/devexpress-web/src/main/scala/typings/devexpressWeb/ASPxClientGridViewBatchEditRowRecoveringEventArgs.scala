package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.BatchEditRowRecovering event.
  */
@js.native
trait ASPxClientGridViewBatchEditRowRecoveringEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the row's key.
    */
  var key: js.Any = js.native
  /**
    * Gets a hashtable that maintains information about recovered cells.
    */
  var rowValues: js.Any = js.native
  /**
    * Gets the processed row's visible index.
    */
  var visibleIndex: Double = js.native
}

object ASPxClientGridViewBatchEditRowRecoveringEventArgs {
  @scala.inline
  def apply(cancel: Boolean, key: js.Any, rowValues: js.Any, visibleIndex: Double): ASPxClientGridViewBatchEditRowRecoveringEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowValues = rowValues.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewBatchEditRowRecoveringEventArgs]
  }
  @scala.inline
  implicit class ASPxClientGridViewBatchEditRowRecoveringEventArgsOps[Self <: ASPxClientGridViewBatchEditRowRecoveringEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowValues(value: js.Any): Self = this.set("rowValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibleIndex(value: Double): Self = this.set("visibleIndex", value.asInstanceOf[js.Any])
  }
  
}

