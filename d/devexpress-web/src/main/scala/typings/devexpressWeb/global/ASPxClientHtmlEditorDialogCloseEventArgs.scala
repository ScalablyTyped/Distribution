package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the event that fires when the HTML Editor dialogs are closed or are going to be closed.
  */
@JSGlobal("ASPxClientHtmlEditorDialogCloseEventArgs")
@js.native
class ASPxClientHtmlEditorDialogCloseEventArgs ()
  extends typings.devexpressWeb.ASPxClientHtmlEditorDialogCloseEventArgs {
  /**
    * Gets the dialog object related to the event.
    */
  /* CompleteClass */
  override var dialog: typings.devexpressWeb.ASPxClientHtmlEditorDialogBase = js.native
  /**
    * Gets the dialog name related to the event.
    */
  /* CompleteClass */
  override var dialogName: String = js.native
  /**
    * Gets a string that contains specific information (if any) passed from the client side for server-side processing.
    */
  /* CompleteClass */
  override var parameter: js.Any = js.native
}

