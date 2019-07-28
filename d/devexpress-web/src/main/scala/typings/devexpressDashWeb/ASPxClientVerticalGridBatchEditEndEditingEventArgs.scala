package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditEndEditing event.
  */
trait ASPxClientVerticalGridBatchEditEndEditingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets a hashtable that maintains information about editable cells.
    * Value: Gets a hashtable that maintains information about editable cells.
    */
  var recordValues: js.Object
  /**
    * Gets the visible index of the record whose cells have been edited.
    * Value: An <see cref="Int32" /> value that specifies the visible index of the record.
    */
  var visibleIndex: Double
}

object ASPxClientVerticalGridBatchEditEndEditingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, recordValues: js.Object, visibleIndex: Double): ASPxClientVerticalGridBatchEditEndEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, recordValues = recordValues, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditEndEditingEventArgs]
  }
}

