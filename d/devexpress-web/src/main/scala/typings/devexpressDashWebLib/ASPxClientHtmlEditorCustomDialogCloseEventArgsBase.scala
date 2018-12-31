package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events that relate to closing a custom dialog.
  */
trait ASPxClientHtmlEditorCustomDialogCloseEventArgsBase extends ASPxClientHtmlEditorCustomDialogEventArgs {
  /**
    * Gets the status of the closed custom dialog.
    * Value: An object representing a custom dialog's closing status. By default, it's the "cancel" string if the dialog operation is canceled, or the "ok" string if a dialog is closed by submitting a file. You can also provide your custom status, if your dialog contains additional buttons.
    */
  var status: js.Object
}

