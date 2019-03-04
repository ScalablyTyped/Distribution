package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditRowRecovering event.
  */
trait ASPxClientGridViewBatchEditRowRecoveringEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets a hashtable that maintains information about recovered cells.
    * Value: A hashtable that stores information about recovered cells.
    */
  var rowValues: js.Object
  /**
    * Gets the processed row's visible index.
    * Value: An integer value that specifies the processed row's visible index.
    */
  var visibleIndex: scala.Double
}

object ASPxClientGridViewBatchEditRowRecoveringEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, rowValues: js.Object, visibleIndex: scala.Double): ASPxClientGridViewBatchEditRowRecoveringEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, rowValues = rowValues, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientGridViewBatchEditRowRecoveringEventArgs]
  }
}

