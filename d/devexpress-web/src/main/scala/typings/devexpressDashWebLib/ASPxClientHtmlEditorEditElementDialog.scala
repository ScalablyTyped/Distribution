package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for Html Editor dialogs operated with its elements.
  */
trait ASPxClientHtmlEditorEditElementDialog extends ASPxClientHtmlEditorDialogBase {
  /**
    * Provides access to the client object of the "Border color" color editor in the Html Editor's dialogs (Style Settings).
    */
  def GetBorderColorColorEdit(): ASPxClientColorEdit
  /**
    * Provides access to the client object of the "Border style" combo box in the Html Editor's dialogs (Style Settings).
    */
  def GetBorderStyleComboBox(): ASPxClientComboBox
  /**
    * Provides access to the client object of the "Border width" spin editor in the Html Editor's dialogs (Style Settings).
    */
  def GetBorderWidthSpinEdit(): ASPxClientSpinEdit
  /**
    * Provides access to the client object of the "Bottom margin" text box in the Html Editor's dialogs (Style Settings).
    */
  def GetBottomMarginTextBox(): ASPxClientTextBox
  /**
    * Provides access to the client object of the "CSS class" combo box in the Html Editor's dialogs (Style Settings).
    */
  def GetCssClassNameComboBox(): ASPxClientComboBox
  /**
    * Provides access to the client object of the "Left margin" text box in the Html Editor's dialogs (Style Settings).
    */
  def GetLeftMarginTextBox(): ASPxClientTextBox
  /**
    * Provides access to the client object of the "Right margin" text box in the Html Editor's dialogs (Style Settings).
    */
  def GetRightMarginTextBox(): ASPxClientTextBox
  /**
    * Provides access to the client object of the "Top margin" text box in the Html Editor's dialogs (Style Settings).
    */
  def GetTopMarginTextBox(): ASPxClientTextBox
}

object ASPxClientHtmlEditorEditElementDialog {
  @scala.inline
  def apply(
    GetBorderColorColorEdit: js.Function0[ASPxClientColorEdit],
    GetBorderStyleComboBox: js.Function0[ASPxClientComboBox],
    GetBorderWidthSpinEdit: js.Function0[ASPxClientSpinEdit],
    GetBottomMarginTextBox: js.Function0[ASPxClientTextBox],
    GetCancelButton: js.Function0[ASPxClientButton],
    GetCssClassNameComboBox: js.Function0[ASPxClientComboBox],
    GetFormLayout: js.Function0[ASPxClientFormLayout],
    GetLeftMarginTextBox: js.Function0[ASPxClientTextBox],
    GetOkButton: js.Function0[ASPxClientButton],
    GetRightMarginTextBox: js.Function0[ASPxClientTextBox],
    GetTopMarginTextBox: js.Function0[ASPxClientTextBox]
  ): ASPxClientHtmlEditorEditElementDialog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetBorderColorColorEdit")(GetBorderColorColorEdit)
    __obj.updateDynamic("GetBorderStyleComboBox")(GetBorderStyleComboBox)
    __obj.updateDynamic("GetBorderWidthSpinEdit")(GetBorderWidthSpinEdit)
    __obj.updateDynamic("GetBottomMarginTextBox")(GetBottomMarginTextBox)
    __obj.updateDynamic("GetCancelButton")(GetCancelButton)
    __obj.updateDynamic("GetCssClassNameComboBox")(GetCssClassNameComboBox)
    __obj.updateDynamic("GetFormLayout")(GetFormLayout)
    __obj.updateDynamic("GetLeftMarginTextBox")(GetLeftMarginTextBox)
    __obj.updateDynamic("GetOkButton")(GetOkButton)
    __obj.updateDynamic("GetRightMarginTextBox")(GetRightMarginTextBox)
    __obj.updateDynamic("GetTopMarginTextBox")(GetTopMarginTextBox)
    __obj.asInstanceOf[ASPxClientHtmlEditorEditElementDialog]
  }
}

