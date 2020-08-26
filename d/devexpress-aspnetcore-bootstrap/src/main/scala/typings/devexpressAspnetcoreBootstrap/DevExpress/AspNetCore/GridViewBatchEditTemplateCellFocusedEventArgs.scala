package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridViewBatchEditTemplateCellFocusedEventArgs extends EventArgs {
  val column: BootstrapGridViewColumn = js.native
  var handled: Boolean = js.native
}

object GridViewBatchEditTemplateCellFocusedEventArgs {
  @scala.inline
  def apply(column: BootstrapGridViewColumn, handled: Boolean, sender: Control): GridViewBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewBatchEditTemplateCellFocusedEventArgs]
  }
  @scala.inline
  implicit class GridViewBatchEditTemplateCellFocusedEventArgsOps[Self <: GridViewBatchEditTemplateCellFocusedEventArgs] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setHandled(value: Boolean): Self = this.set("handled", value.asInstanceOf[js.Any])
  }
  
}

