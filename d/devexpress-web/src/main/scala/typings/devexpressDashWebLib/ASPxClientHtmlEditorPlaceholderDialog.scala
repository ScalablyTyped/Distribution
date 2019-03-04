package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Placeholder dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorPlaceholderDialog extends ASPxClientHtmlEditorDialogBase {
  /**
    * Provides access to the ASPxListBox client object that lists placeholder names in the Html Editor's Placeholder dialog.
    */
  def GetPlaceholderNameListBox(): ASPxClientListBox
}

object ASPxClientHtmlEditorPlaceholderDialog {
  @scala.inline
  def apply(
    GetCancelButton: js.Function0[ASPxClientButton],
    GetFormLayout: js.Function0[ASPxClientFormLayout],
    GetOkButton: js.Function0[ASPxClientButton],
    GetPlaceholderNameListBox: js.Function0[ASPxClientListBox]
  ): ASPxClientHtmlEditorPlaceholderDialog = {
    val __obj = js.Dynamic.literal(GetCancelButton = GetCancelButton, GetFormLayout = GetFormLayout, GetOkButton = GetOkButton, GetPlaceholderNameListBox = GetPlaceholderNameListBox)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorPlaceholderDialog]
  }
}

