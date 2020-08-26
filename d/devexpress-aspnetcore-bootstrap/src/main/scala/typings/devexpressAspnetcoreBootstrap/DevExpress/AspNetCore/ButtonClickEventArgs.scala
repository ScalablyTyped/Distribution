package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonClickEventArgs extends ProcessingModeEventArgs {
  val cancelEventAndBubble: Boolean = js.native
}

object ButtonClickEventArgs {
  @scala.inline
  def apply(cancelEventAndBubble: Boolean, processOnServer: Boolean, sender: Control): ButtonClickEventArgs = {
    val __obj = js.Dynamic.literal(cancelEventAndBubble = cancelEventAndBubble.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonClickEventArgs]
  }
  @scala.inline
  implicit class ButtonClickEventArgsOps[Self <: ButtonClickEventArgs] (val x: Self) extends AnyVal {
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
    def setCancelEventAndBubble(value: Boolean): Self = this.set("cancelEventAndBubble", value.asInstanceOf[js.Any])
  }
  
}

