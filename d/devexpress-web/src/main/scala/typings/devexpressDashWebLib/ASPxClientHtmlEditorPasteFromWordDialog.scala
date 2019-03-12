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
    GetCancelButton: () => ASPxClientButton,
    GetFormLayout: () => ASPxClientFormLayout,
    GetOkButton: () => ASPxClientButton,
    GetRemoveFontFamilyCheckBox: () => ASPxClientCheckBox
  ): ASPxClientHtmlEditorPasteFromWordDialog = {
    val __obj = js.Dynamic.literal(GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetOkButton = js.Any.fromFunction0(GetOkButton), GetRemoveFontFamilyCheckBox = js.Any.fromFunction0(GetRemoveFontFamilyCheckBox))
  
    __obj.asInstanceOf[ASPxClientHtmlEditorPasteFromWordDialog]
  }
}

