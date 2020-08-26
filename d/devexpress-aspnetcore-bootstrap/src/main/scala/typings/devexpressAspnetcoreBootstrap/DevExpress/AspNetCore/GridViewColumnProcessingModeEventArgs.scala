package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridViewColumnProcessingModeEventArgs extends ProcessingModeEventArgs {
  val column: BootstrapGridViewColumn = js.native
}

object GridViewColumnProcessingModeEventArgs {
  @scala.inline
  def apply(column: BootstrapGridViewColumn, processOnServer: Boolean, sender: Control): GridViewColumnProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewColumnProcessingModeEventArgs]
  }
  @scala.inline
  implicit class GridViewColumnProcessingModeEventArgsOps[Self <: GridViewColumnProcessingModeEventArgs] (val x: Self) extends AnyVal {
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

