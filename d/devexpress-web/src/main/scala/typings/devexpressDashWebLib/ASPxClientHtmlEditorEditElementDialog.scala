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
    val __obj = js.Dynamic.literal(GetBorderColorColorEdit = GetBorderColorColorEdit, GetBorderStyleComboBox = GetBorderStyleComboBox, GetBorderWidthSpinEdit = GetBorderWidthSpinEdit, GetBottomMarginTextBox = GetBottomMarginTextBox, GetCancelButton = GetCancelButton, GetCssClassNameComboBox = GetCssClassNameComboBox, GetFormLayout = GetFormLayout, GetLeftMarginTextBox = GetLeftMarginTextBox, GetOkButton = GetOkButton, GetRightMarginTextBox = GetRightMarginTextBox, GetTopMarginTextBox = GetTopMarginTextBox)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorEditElementDialog]
  }
}

