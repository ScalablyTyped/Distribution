package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardViewFocusEventArgs extends ProcessingModeEventArgs {
  val isChangedOnServer: Boolean = js.native
}

object CardViewFocusEventArgs {
  @scala.inline
  def apply(isChangedOnServer: Boolean, processOnServer: Boolean, sender: Control): CardViewFocusEventArgs = {
    val __obj = js.Dynamic.literal(isChangedOnServer = isChangedOnServer.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewFocusEventArgs]
  }
  @scala.inline
  implicit class CardViewFocusEventArgsOps[Self <: CardViewFocusEventArgs] (val x: Self) extends AnyVal {
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
    def setIsChangedOnServer(value: Boolean): Self = this.set("isChangedOnServer", value.asInstanceOf[js.Any])
  }
  
}

