package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events that relate to command processing (ASPxClientHtmlEditor.CommandExecuted, ASPxClientHtmlEditor.CustomCommand).
  */
@js.native
trait ASPxClientHtmlEditorCommandEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the processed command.
    */
  var commandName: String = js.native
  /**
    * Gets an optional parameter that complements the processed command.
    */
  var parameter: js.Any = js.native
}

object ASPxClientHtmlEditorCommandEventArgs {
  @scala.inline
  def apply(commandName: String, parameter: js.Any): ASPxClientHtmlEditorCommandEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCommandEventArgs]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorCommandEventArgsOps[Self <: ASPxClientHtmlEditorCommandEventArgs] (val x: Self) extends AnyVal {
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
    def setCommandName(value: String): Self = this.set("commandName", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameter(value: js.Any): Self = this.set("parameter", value.asInstanceOf[js.Any])
  }
  
}

