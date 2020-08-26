package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditRecordDeleting event.
  */
@js.native
trait ASPxClientVerticalGridBatchEditRecordDeletingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets a hashtable that maintains information about deleted cells.
    */
  var recordValues: js.Any = js.native
  /**
    * Gets the processed record's visible index.
    */
  var visibleIndex: Double = js.native
}

object ASPxClientVerticalGridBatchEditRecordDeletingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, recordValues: js.Any, visibleIndex: Double): ASPxClientVerticalGridBatchEditRecordDeletingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], recordValues = recordValues.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditRecordDeletingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientVerticalGridBatchEditRecordDeletingEventArgsOps[Self <: ASPxClientVerticalGridBatchEditRecordDeletingEventArgs] (val x: Self) extends AnyVal {
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
    def setRecordValues(value: js.Any): Self = this.set("recordValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibleIndex(value: Double): Self = this.set("visibleIndex", value.asInstanceOf[js.Any])
  }
  
}

