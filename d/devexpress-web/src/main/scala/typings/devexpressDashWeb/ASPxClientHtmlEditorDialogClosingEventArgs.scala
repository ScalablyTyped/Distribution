package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the DialogClosing event.
  */
trait ASPxClientHtmlEditorDialogClosingEventArgs extends ASPxClientHtmlEditorDialogCloseEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    * Value: true, if the action that raised the event should be canceled; otherwise, false.
    */
  var cancel: Boolean
}

object ASPxClientHtmlEditorDialogClosingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, dialog: ASPxClientHtmlEditorDialogBase, dialogName: String, parameter: js.Object): ASPxClientHtmlEditorDialogClosingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, dialog = dialog, dialogName = dialogName, parameter = parameter)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorDialogClosingEventArgs]
  }
}

