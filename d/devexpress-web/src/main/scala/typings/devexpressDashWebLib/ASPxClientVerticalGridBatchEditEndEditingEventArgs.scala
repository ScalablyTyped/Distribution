package typings
package devexpressDashWebLib

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
  var visibleIndex: scala.Double
}

object ASPxClientVerticalGridBatchEditEndEditingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, recordValues: js.Object, visibleIndex: scala.Double): ASPxClientVerticalGridBatchEditEndEditingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("recordValues")(recordValues)
    __obj.updateDynamic("visibleIndex")(visibleIndex)
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditEndEditingEventArgs]
  }
}

