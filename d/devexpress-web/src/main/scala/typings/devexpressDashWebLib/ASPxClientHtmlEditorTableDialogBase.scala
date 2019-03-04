package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides base client functionality for the Table dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorTableDialogBase extends ASPxClientHtmlEditorDialogBase {
  /**
    * Provides access to the client object of the "Background color" color editor in the Html Editor's Table dialogs.
    */
  def GetBackgroundColorColorEdit(): ASPxClientColorEdit
}

object ASPxClientHtmlEditorTableDialogBase {
  @scala.inline
  def apply(
    GetBackgroundColorColorEdit: js.Function0[ASPxClientColorEdit],
    GetCancelButton: js.Function0[ASPxClientButton],
    GetFormLayout: js.Function0[ASPxClientFormLayout],
    GetOkButton: js.Function0[ASPxClientButton]
  ): ASPxClientHtmlEditorTableDialogBase = {
    val __obj = js.Dynamic.literal(GetBackgroundColorColorEdit = GetBackgroundColorColorEdit, GetCancelButton = GetCancelButton, GetFormLayout = GetFormLayout, GetOkButton = GetOkButton)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorTableDialogBase]
  }
}

