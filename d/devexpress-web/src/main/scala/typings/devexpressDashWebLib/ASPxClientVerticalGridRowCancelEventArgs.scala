package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the cancelable events of a client ASPxVerticalGrid row.
  */
trait ASPxClientVerticalGridRowCancelEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed client row.
    * Value: An ASPxClientVerticalGridRow object that represents the processed row.
    */
  var row: ASPxClientVerticalGridRow
}

object ASPxClientVerticalGridRowCancelEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, row: ASPxClientVerticalGridRow): ASPxClientVerticalGridRowCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, row = row)
  
    __obj.asInstanceOf[ASPxClientVerticalGridRowCancelEventArgs]
  }
}

