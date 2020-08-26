package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientButtonEditBase.ButtonClick event.
  */
@js.native
trait ASPxClientButtonEditClickEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the index of the clicked button.
    */
  var buttonIndex: Double = js.native
}

object ASPxClientButtonEditClickEventArgs {
  @scala.inline
  def apply(buttonIndex: Double, processOnServer: Boolean): ASPxClientButtonEditClickEventArgs = {
    val __obj = js.Dynamic.literal(buttonIndex = buttonIndex.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientButtonEditClickEventArgs]
  }
  @scala.inline
  implicit class ASPxClientButtonEditClickEventArgsOps[Self <: ASPxClientButtonEditClickEventArgs] (val x: Self) extends AnyVal {
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
    def setButtonIndex(value: Double): Self = this.set("buttonIndex", value.asInstanceOf[js.Any])
  }
  
}

