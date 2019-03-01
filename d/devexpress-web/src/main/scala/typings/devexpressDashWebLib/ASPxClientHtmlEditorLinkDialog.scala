package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Link dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorLinkDialog extends ASPxClientHtmlEditorDialogBase {
  /**
    * Provides access to the client object of the "E-mail to" text box in the Html Editor's Link dialog.
    */
  def GetEmailTextBox(): ASPxClientTextBox
  /**
    * Provides access to the client object of the file manager used in the Link dialog's "Select Document" popup window.
    */
  def GetFileManager(): ASPxClientFileManager
  /**
    * Provides access to the client radio button list object used to specify the link type in the Html Editor's Link dialog.
    */
  def GetLinkTypeRadioButtonList(): ASPxClientRadioButtonList
  /**
    * Provides access to the client object of the "Open in new window" check box in the Html Editor's Link dialog.
    */
  def GetOpenInNewWindowCheckBox(): ASPxClientCheckBox
  /**
    * Provides access to the client object of the "Cancel" button in the Link dialog's "Select Document" popup window.
    */
  def GetSelectDocumentPopupCancelButton(): ASPxClientButton
  /**
    * Provides access to the client popup control object that is the "Select Document" popup window in the Html Editor's Link dialog.
    */
  def GetSelectDocumentPopupControl(): ASPxClientPopupControl
  /**
    * Provides access to the client object of the "Select" button in the Link dialog's "Select Document" popup window.
    */
  def GetSelectDocumentPopupSelectButton(): ASPxClientButton
  /**
    * Provides access to the client object of the "Subject" text box in the Html Editor's Link dialog.
    */
  def GetSubjectTextBox(): ASPxClientTextBox
  /**
    * Provides access to the client object of the "Text" text box in the Html Editor's Link dialog.
    */
  def GetTextTextBox(): ASPxClientTextBox
  /**
    * Provides access to the client object of the "ToolTip" text box in the Html Editor's Link dialog.
    */
  def GetTooltipTextBox(): ASPxClientTextBox
  /**
    * Provides access to the client object of the "URL" text box in the Html Editor's Link dialog.
    */
  def GetUrlTextBox(): ASPxClientTextBox
}

object ASPxClientHtmlEditorLinkDialog {
  @scala.inline
  def apply(
    GetCancelButton: js.Function0[ASPxClientButton],
    GetEmailTextBox: js.Function0[ASPxClientTextBox],
    GetFileManager: js.Function0[ASPxClientFileManager],
    GetFormLayout: js.Function0[ASPxClientFormLayout],
    GetLinkTypeRadioButtonList: js.Function0[ASPxClientRadioButtonList],
    GetOkButton: js.Function0[ASPxClientButton],
    GetOpenInNewWindowCheckBox: js.Function0[ASPxClientCheckBox],
    GetSelectDocumentPopupCancelButton: js.Function0[ASPxClientButton],
    GetSelectDocumentPopupControl: js.Function0[ASPxClientPopupControl],
    GetSelectDocumentPopupSelectButton: js.Function0[ASPxClientButton],
    GetSubjectTextBox: js.Function0[ASPxClientTextBox],
    GetTextTextBox: js.Function0[ASPxClientTextBox],
    GetTooltipTextBox: js.Function0[ASPxClientTextBox],
    GetUrlTextBox: js.Function0[ASPxClientTextBox]
  ): ASPxClientHtmlEditorLinkDialog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetCancelButton")(GetCancelButton)
    __obj.updateDynamic("GetEmailTextBox")(GetEmailTextBox)
    __obj.updateDynamic("GetFileManager")(GetFileManager)
    __obj.updateDynamic("GetFormLayout")(GetFormLayout)
    __obj.updateDynamic("GetLinkTypeRadioButtonList")(GetLinkTypeRadioButtonList)
    __obj.updateDynamic("GetOkButton")(GetOkButton)
    __obj.updateDynamic("GetOpenInNewWindowCheckBox")(GetOpenInNewWindowCheckBox)
    __obj.updateDynamic("GetSelectDocumentPopupCancelButton")(GetSelectDocumentPopupCancelButton)
    __obj.updateDynamic("GetSelectDocumentPopupControl")(GetSelectDocumentPopupControl)
    __obj.updateDynamic("GetSelectDocumentPopupSelectButton")(GetSelectDocumentPopupSelectButton)
    __obj.updateDynamic("GetSubjectTextBox")(GetSubjectTextBox)
    __obj.updateDynamic("GetTextTextBox")(GetTextTextBox)
    __obj.updateDynamic("GetTooltipTextBox")(GetTooltipTextBox)
    __obj.updateDynamic("GetUrlTextBox")(GetUrlTextBox)
    __obj.asInstanceOf[ASPxClientHtmlEditorLinkDialog]
  }
}

