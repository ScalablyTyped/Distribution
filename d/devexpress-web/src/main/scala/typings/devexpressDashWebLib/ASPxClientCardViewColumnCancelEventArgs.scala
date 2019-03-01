package typings
package devexpressDashWebLib

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
  def apply(cancel: scala.Boolean, column: ASPxClientCardViewColumn): ASPxClientCardViewColumnCancelEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("column")(column)
    __obj.asInstanceOf[ASPxClientCardViewColumnCancelEventArgs]
  }
}

