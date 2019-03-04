package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Paste From Word dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorPasteFromWordDialog extends ASPxClientHtmlEditorDialogBase {
  /**
    * Provides access to the client object of the "Remove font family" check box in the Html Editor's Flash dialog.
    */
  def GetRemoveFontFamilyCheckBox(): ASPxClientCheckBox
}

object ASPxClientHtmlEditorPasteFromWordDialog {
  @scala.inline
  def apply(
    GetCancelButton: js.Function0[ASPxClientButton],
    GetFormLayout: js.Function0[ASPxClientFormLayout],
    GetOkButton: js.Function0[ASPxClientButton],
    GetRemoveFontFamilyCheckBox: js.Function0[ASPxClientCheckBox]
  ): ASPxClientHtmlEditorPasteFromWordDialog = {
    val __obj = js.Dynamic.literal(GetCancelButton = GetCancelButton, GetFormLayout = GetFormLayout, GetOkButton = GetOkButton, GetRemoveFontFamilyCheckBox = GetRemoveFontFamilyCheckBox)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorPasteFromWordDialog]
  }
}

