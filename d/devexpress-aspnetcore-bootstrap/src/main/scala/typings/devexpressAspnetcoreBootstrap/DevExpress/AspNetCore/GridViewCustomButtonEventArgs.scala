package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridViewCustomButtonEventArgs extends ProcessingModeEventArgs {
  val buttonID: String = js.native
  val visibleIndex: Double = js.native
}

object GridViewCustomButtonEventArgs {
  @scala.inline
  def apply(buttonID: String, processOnServer: Boolean, sender: Control, visibleIndex: Double): GridViewCustomButtonEventArgs = {
    val __obj = js.Dynamic.literal(buttonID = buttonID.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewCustomButtonEventArgs]
  }
  @scala.inline
  implicit class GridViewCustomButtonEventArgsOps[Self <: GridViewCustomButtonEventArgs] (val x: Self) extends AnyVal {
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
    def setButtonID(value: String): Self = this.set("buttonID", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibleIndex(value: Double): Self = this.set("visibleIndex", value.asInstanceOf[js.Any])
  }
  
}

