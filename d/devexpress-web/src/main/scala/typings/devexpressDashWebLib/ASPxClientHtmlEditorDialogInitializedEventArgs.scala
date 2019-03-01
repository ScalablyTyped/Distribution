package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the DialogInitialized client event.
  */
trait ASPxClientHtmlEditorDialogInitializedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a dialog object related to the event.
    * Value: A ASPxClientHtmlEditorDialogBase object that is the dialog.
    */
  var dialog: ASPxClientHtmlEditorDialogBase
  /**
    * Gets the name of the dialog that has been initialized.
    * Value: A string value that is the name of the initialized dialog.
    */
  var dialogName: java.lang.String
}

object ASPxClientHtmlEditorDialogInitializedEventArgs {
  @scala.inline
  def apply(dialog: ASPxClientHtmlEditorDialogBase, dialogName: java.lang.String): ASPxClientHtmlEditorDialogInitializedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dialog")(dialog)
    __obj.updateDynamic("dialogName")(dialogName)
    __obj.asInstanceOf[ASPxClientHtmlEditorDialogInitializedEventArgs]
  }
}

