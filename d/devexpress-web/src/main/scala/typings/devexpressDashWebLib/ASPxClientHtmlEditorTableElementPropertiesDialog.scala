package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for Table dialogs within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorTableElementPropertiesDialog extends ASPxClientHtmlEditorTableDialogBase {
  /**
    * Provides access to the client object of the "Horizontal" combo box in the Html Editor's Row/Column/Cell Properties dialog's Alignment group.
    */
  def GetHorizontalAlignmentComboBox(): ASPxClientComboBox
  /**
    * Provides access to the client object of the "Vertical" combo box in the Html Editor's Row/Column/Cell Properties dialog's Alignment group.
    */
  def GetVerticalAlignmentComboBox(): ASPxClientComboBox
}

object ASPxClientHtmlEditorTableElementPropertiesDialog {
  @scala.inline
  def apply(
    GetBackgroundColorColorEdit: js.Function0[ASPxClientColorEdit],
    GetCancelButton: js.Function0[ASPxClientButton],
    GetFormLayout: js.Function0[ASPxClientFormLayout],
    GetHorizontalAlignmentComboBox: js.Function0[ASPxClientComboBox],
    GetOkButton: js.Function0[ASPxClientButton],
    GetVerticalAlignmentComboBox: js.Function0[ASPxClientComboBox]
  ): ASPxClientHtmlEditorTableElementPropertiesDialog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetBackgroundColorColorEdit")(GetBackgroundColorColorEdit)
    __obj.updateDynamic("GetCancelButton")(GetCancelButton)
    __obj.updateDynamic("GetFormLayout")(GetFormLayout)
    __obj.updateDynamic("GetHorizontalAlignmentComboBox")(GetHorizontalAlignmentComboBox)
    __obj.updateDynamic("GetOkButton")(GetOkButton)
    __obj.updateDynamic("GetVerticalAlignmentComboBox")(GetVerticalAlignmentComboBox)
    __obj.asInstanceOf[ASPxClientHtmlEditorTableElementPropertiesDialog]
  }
}

