package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the cancelable events of a client ASPxGridView column.
  */
trait ASPxClientGridViewColumnCancelEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed client column.
    * Value: An ASPxClientGridViewColumn object that represents the processed column.
    */
  var column: ASPxClientGridViewColumn
}

object ASPxClientGridViewColumnCancelEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, column: ASPxClientGridViewColumn): ASPxClientGridViewColumnCancelEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("column")(column)
    __obj.asInstanceOf[ASPxClientGridViewColumnCancelEventArgs]
  }
}

