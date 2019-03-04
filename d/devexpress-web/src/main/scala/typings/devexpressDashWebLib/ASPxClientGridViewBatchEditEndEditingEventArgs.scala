package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditEndEditing event.
  */
trait ASPxClientGridViewBatchEditEndEditingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets a hashtable that maintains information about editable cells.
    * Value: A hashtable that stores information about editable cells.
    */
  var rowValues: js.Object
  /**
    * Gets the visible index of the row whose cells has been edited.
    * Value: An <see cref="Int32" /> value that specifies the visible index of the row.
    */
  var visibleIndex: scala.Double
}

object ASPxClientGridViewBatchEditEndEditingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, rowValues: js.Object, visibleIndex: scala.Double): ASPxClientGridViewBatchEditEndEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, rowValues = rowValues, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientGridViewBatchEditEndEditingEventArgs]
  }
}

