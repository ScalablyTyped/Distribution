package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the cancelable events of a client ASPxCardView column.
  */
trait ASPxClientCardViewColumnCancelEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed client column.
    * Value: An ASPxClientCardViewColumn object that represents the processed column.
    */
  var column: ASPxClientCardViewColumn
}

object ASPxClientCardViewColumnCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, column: ASPxClientCardViewColumn): ASPxClientCardViewColumnCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, column = column)
  
    __obj.asInstanceOf[ASPxClientCardViewColumnCancelEventArgs]
  }
}

