package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ReportToolbarClientSideEvents.ItemValueChanged event.
  */
@js.native
trait ASPxClientToolbarItemValueChangedEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Provides access to the toolbar's value editor on the client.
    */
  var editor: ASPxClientControl = js.native
  /**
    * Gets the menu item object related to the event.
    */
  var item: ASPxClientMenuItem = js.native
}

object ASPxClientToolbarItemValueChangedEventArgs {
  @scala.inline
  def apply(editor: ASPxClientControl, item: ASPxClientMenuItem, processOnServer: Boolean): ASPxClientToolbarItemValueChangedEventArgs = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientToolbarItemValueChangedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientToolbarItemValueChangedEventArgsOps[Self <: ASPxClientToolbarItemValueChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setEditor(value: ASPxClientControl): Self = this.set("editor", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: ASPxClientMenuItem): Self = this.set("item", value.asInstanceOf[js.Any])
  }
  
}

