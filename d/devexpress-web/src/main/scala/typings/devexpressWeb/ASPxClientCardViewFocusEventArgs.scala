package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the corresponding event.
  */
@js.native
trait ASPxClientCardViewFocusEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets whether card focusing has been changed on the server.
    */
  var isChangedOnServer: Boolean = js.native
}

object ASPxClientCardViewFocusEventArgs {
  @scala.inline
  def apply(isChangedOnServer: Boolean, processOnServer: Boolean): ASPxClientCardViewFocusEventArgs = {
    val __obj = js.Dynamic.literal(isChangedOnServer = isChangedOnServer.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewFocusEventArgs]
  }
  @scala.inline
  implicit class ASPxClientCardViewFocusEventArgsOps[Self <: ASPxClientCardViewFocusEventArgs] (val x: Self) extends AnyVal {
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

