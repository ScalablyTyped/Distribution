package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the event that fires when the HTML Editor dialogs are closed or are going to be closed.
  */
trait ASPxClientHtmlEditorDialogCloseEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the dialog object related to the event.
    */
  var dialog: ASPxClientHtmlEditorDialogBase
  /**
    * Gets the dialog name related to the event.
    */
  var dialogName: String
  /**
    * Gets a string that contains specific information (if any) passed from the client side for server-side processing.
    */
  var parameter: js.Any
}

object ASPxClientHtmlEditorDialogCloseEventArgs {
  @scala.inline
  def apply(dialog: ASPxClientHtmlEditorDialogBase, dialogName: String, parameter: js.Any): ASPxClientHtmlEditorDialogCloseEventArgs = {
    val __obj = js.Dynamic.literal(dialog = dialog.asInstanceOf[js.Any], dialogName = dialogName.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorDialogCloseEventArgs]
  }
}

