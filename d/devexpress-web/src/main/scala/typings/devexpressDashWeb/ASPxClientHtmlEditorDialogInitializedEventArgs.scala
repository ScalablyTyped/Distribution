package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHtmlEditor.DialogInitialized client event.
  */
@JSGlobal("ASPxClientHtmlEditorDialogInitializedEventArgs")
@js.native
class ASPxClientHtmlEditorDialogInitializedEventArgs () extends ASPxClientEventArgs {
  /**
    * Gets a dialog object related to the event.
    */
  var dialog: ASPxClientHtmlEditorDialogBase = js.native
  /**
    * Gets the name of the dialog that has been initialized.
    */
  var dialogName: String = js.native
}

