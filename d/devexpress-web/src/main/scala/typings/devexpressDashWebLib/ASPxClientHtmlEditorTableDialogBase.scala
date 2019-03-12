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
    GetBackgroundColorColorEdit: () => ASPxClientColorEdit,
    GetCancelButton: () => ASPxClientButton,
    GetFormLayout: () => ASPxClientFormLayout,
    GetOkButton: () => ASPxClientButton
  ): ASPxClientHtmlEditorTableDialogBase = {
    val __obj = js.Dynamic.literal(GetBackgroundColorColorEdit = js.Any.fromFunction0(GetBackgroundColorColorEdit), GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetOkButton = js.Any.fromFunction0(GetOkButton))
  
    __obj.asInstanceOf[ASPxClientHtmlEditorTableDialogBase]
  }
}

