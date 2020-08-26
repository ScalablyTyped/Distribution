package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the cancelable events of a client ASPxGridView column.
  */
@js.native
trait ASPxClientGridViewColumnCancelEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed client column.
    */
  var column: ASPxClientGridViewColumn = js.native
}

object ASPxClientGridViewColumnCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, column: ASPxClientGridViewColumn): ASPxClientGridViewColumnCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewColumnCancelEventArgs]
  }
  @scala.inline
  implicit class ASPxClientGridViewColumnCancelEventArgsOps[Self <: ASPxClientGridViewColumnCancelEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumn(value: ASPxClientGridViewColumn): Self = this.set("column", value.asInstanceOf[js.Any])
  }
  
}

