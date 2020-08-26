package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFloatingActionButton.ContextChanging event.
  */
@js.native
trait ASPxClientFloatingActionButtonContextChangingEventArgs extends ASPxClientEventArgs {
  /**
    * Returns the action related to the event.
    */
  var action: ASPxClientFABAction = js.native
}

object ASPxClientFloatingActionButtonContextChangingEventArgs {
  @scala.inline
  def apply(action: ASPxClientFABAction): ASPxClientFloatingActionButtonContextChangingEventArgs = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFloatingActionButtonContextChangingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientFloatingActionButtonContextChangingEventArgsOps[Self <: ASPxClientFloatingActionButtonContextChangingEventArgs] (val x: Self) extends AnyVal {
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
    def setAction(value: ASPxClientFABAction): Self = this.set("action", value.asInstanceOf[js.Any])
  }
  
}

