package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHtmlEditor.DialogClosed event.
  */
@JSGlobal("ASPxClientHtmlEditorDialogClosedEventArgs")
@js.native
class ASPxClientHtmlEditorDialogClosedEventArgs ()
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

