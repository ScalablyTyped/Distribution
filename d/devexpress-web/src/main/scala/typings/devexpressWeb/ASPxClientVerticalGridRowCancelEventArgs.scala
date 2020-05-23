package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the cancelable events of a client ASPxVerticalGrid row.
  */
trait ASPxClientVerticalGridRowCancelEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed client row.
    */
  var row: ASPxClientVerticalGridRow
}

object ASPxClientVerticalGridRowCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, row: ASPxClientVerticalGridRow): ASPxClientVerticalGridRowCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridRowCancelEventArgs]
  }
}

