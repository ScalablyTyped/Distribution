package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for dialogs within the  ASPxHtmlEditor.
  */
@JSGlobal("ASPxClientHtmlEditorDialogBase")
@js.native
class ASPxClientHtmlEditorDialogBase () extends js.Object {
  /**
    * Provides access to the client object of the "Cancel" button in the Html Editor's dialogs.
    */
  def GetCancelButton(): ASPxClientButton = js.native
  /**
    * Provides access to the client ASPxFormLayout object that arranges all editors in the Html Editor's dialogs.
    */
  def GetFormLayout(): ASPxClientFormLayout = js.native
  /**
    * Provides access to the client object of the "OK" button in the Html Editor's dialogs.
    */
  def GetOkButton(): ASPxClientButton = js.native
}

