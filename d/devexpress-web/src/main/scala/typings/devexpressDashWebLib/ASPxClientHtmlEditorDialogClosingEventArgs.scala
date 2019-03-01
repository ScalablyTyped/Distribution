package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the DialogClosing event.
  */
trait ASPxClientHtmlEditorDialogClosingEventArgs extends ASPxClientHtmlEditorDialogCloseEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    * Value: true, if the action that raised the event should be canceled; otherwise, false.
    */
  var cancel: scala.Boolean
}

object ASPxClientHtmlEditorDialogClosingEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    dialog: ASPxClientHtmlEditorDialogBase,
    dialogName: java.lang.String,
    parameter: js.Object
  ): ASPxClientHtmlEditorDialogClosingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("dialog")(dialog)
    __obj.updateDynamic("dialogName")(dialogName)
    __obj.updateDynamic("parameter")(parameter)
    __obj.asInstanceOf[ASPxClientHtmlEditorDialogClosingEventArgs]
  }
}

