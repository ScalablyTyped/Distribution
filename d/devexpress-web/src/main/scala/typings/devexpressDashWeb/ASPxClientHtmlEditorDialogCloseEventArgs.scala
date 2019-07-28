package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the event that fires when the HTML Editor dialogs are closed or are going to be closed.
  */
trait ASPxClientHtmlEditorDialogCloseEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the dialog object related to the event.
    * Value: An ASPxClientHtmlEditorDialogBase object that is the dialog.
    */
  var dialog: ASPxClientHtmlEditorDialogBase
  /**
    * Gets the dialog name related to the event.
    * Value: A string value that is the dialog name.
    */
  var dialogName: String
  /**
    * Gets a string that contains specific information (if any) passed from the client side for server-side processing.
    * Value: A string value representing specific information passed from the client to the server side.
    */
  var parameter: js.Object
}

object ASPxClientHtmlEditorDialogCloseEventArgs {
  @scala.inline
  def apply(dialog: ASPxClientHtmlEditorDialogBase, dialogName: String, parameter: js.Object): ASPxClientHtmlEditorDialogCloseEventArgs = {
    val __obj = js.Dynamic.literal(dialog = dialog, dialogName = dialogName, parameter = parameter)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorDialogCloseEventArgs]
  }
}

