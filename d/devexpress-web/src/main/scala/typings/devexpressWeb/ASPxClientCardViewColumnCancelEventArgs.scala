package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the cancelable events of a client ASPxCardView column.
  */
trait ASPxClientCardViewColumnCancelEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed client column.
    */
  var column: ASPxClientCardViewColumn
}

object ASPxClientCardViewColumnCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, column: ASPxClientCardViewColumn): ASPxClientCardViewColumnCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewColumnCancelEventArgs]
  }
}

