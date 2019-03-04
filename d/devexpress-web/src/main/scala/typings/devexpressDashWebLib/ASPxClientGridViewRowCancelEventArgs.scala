package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the RowExpanding events.
  */
trait ASPxClientGridViewRowCancelEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed row's visible index.
    * Value: An integer zero-based index that identifies the processed row.
    */
  var visibleIndex: scala.Double
}

object ASPxClientGridViewRowCancelEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, visibleIndex: scala.Double): ASPxClientGridViewRowCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientGridViewRowCancelEventArgs]
  }
}

