package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditRowDeleting event.
  */
trait ASPxClientGridViewBatchEditRowDeletingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets a hashtable that maintains information about deleted cells.
    * Value: A hashtable that stores information about deleted cells.
    */
  var rowValues: js.Object
  /**
    * Gets the processed row's visible index.
    * Value: An integer value that specifies the processed row's visible index.
    */
  var visibleIndex: scala.Double
}

object ASPxClientGridViewBatchEditRowDeletingEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, rowValues: js.Object, visibleIndex: scala.Double): ASPxClientGridViewBatchEditRowDeletingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("rowValues")(rowValues)
    __obj.updateDynamic("visibleIndex")(visibleIndex)
    __obj.asInstanceOf[ASPxClientGridViewBatchEditRowDeletingEventArgs]
  }
}

