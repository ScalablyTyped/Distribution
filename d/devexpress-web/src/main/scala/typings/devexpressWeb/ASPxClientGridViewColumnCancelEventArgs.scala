package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the cancelable events of a client ASPxGridView column.
  */
trait ASPxClientGridViewColumnCancelEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed client column.
    */
  var column: ASPxClientGridViewColumn
}

object ASPxClientGridViewColumnCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, column: ASPxClientGridViewColumn): ASPxClientGridViewColumnCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewColumnCancelEventArgs]
  }
}

