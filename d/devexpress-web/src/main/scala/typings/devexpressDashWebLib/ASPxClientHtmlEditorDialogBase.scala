package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for dialogs within the  ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorDialogBase extends js.Object {
  /**
    * Provides access to the client object of the "Cancel" button in the Html Editor's dialogs.
    */
  def GetCancelButton(): ASPxClientButton
  /**
    * Provides access to the client ASPxFormLayout object that arranges all editors in the Html Editor's dialogs.
    */
  def GetFormLayout(): ASPxClientFormLayout
  /**
    * Provides access to the client object of the "OK" button in the Html Editor's dialogs.
    */
  def GetOkButton(): ASPxClientButton
}

