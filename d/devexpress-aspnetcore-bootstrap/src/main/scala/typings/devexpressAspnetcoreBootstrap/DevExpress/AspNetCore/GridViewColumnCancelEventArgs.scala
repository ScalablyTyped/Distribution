package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridViewColumnCancelEventArgs extends CancelEventArgs {
  val column: BootstrapGridViewColumn = js.native
}

object GridViewColumnCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, column: BootstrapGridViewColumn, sender: Control): GridViewColumnCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewColumnCancelEventArgs]
  }
  @scala.inline
  implicit class GridViewColumnCancelEventArgsOps[Self <: GridViewColumnCancelEventArgs] (val x: Self) extends AnyVal {
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
    def setColumn(value: BootstrapGridViewColumn): Self = this.set("column", value.asInstanceOf[js.Any])
  }
  
}

