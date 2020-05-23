package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHtmlEditor.DialogInitialized client event.
  */
trait ASPxClientHtmlEditorDialogInitializedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a dialog object related to the event.
    */
  var dialog: ASPxClientHtmlEditorDialogBase
  /**
    * Gets the name of the dialog that has been initialized.
    */
  var dialogName: String
}

object ASPxClientHtmlEditorDialogInitializedEventArgs {
  @scala.inline
  def apply(dialog: ASPxClientHtmlEditorDialogBase, dialogName: String): ASPxClientHtmlEditorDialogInitializedEventArgs = {
    val __obj = js.Dynamic.literal(dialog = dialog.asInstanceOf[js.Any], dialogName = dialogName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorDialogInitializedEventArgs]
  }
}

