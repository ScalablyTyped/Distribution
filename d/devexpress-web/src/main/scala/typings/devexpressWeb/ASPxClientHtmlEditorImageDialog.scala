package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Image dialog within the  ASPxHtmlEditor.
  */
@JSGlobal("ASPxClientHtmlEditorImageDialog")
@js.native
class ASPxClientHtmlEditorImageDialog () extends ASPxClientHtmlEditorMediaDialogBase {
  /**
    * Provides access to the client object of the "Create thumbnail" check box in the Html Editor's Image dialog.
    */
  def GetCreateThumbnailCheckBox(): ASPxClientCheckBox = js.native
  /**
    * Provides access to the client object of the "Description" text box in the Html Editor's Image dialog.
    */
  def GetDescriptionTextBox(): ASPxClientTextBox = js.native
  /**
    * Provides access to the client object of the "Size" combo box in the Html Editor's Image dialog.
    */
  def GetSizeComboBox(): ASPxClientComboBox = js.native
  /**
    * Provides access to the client object of the "New image name" text box in the Html Editor's Image dialog.
    */
  def GetThumbnailNameTextBox(): ASPxClientTextBox = js.native
  /**
    * Provides access to the client object of the "Wrap text around image" check box in the Html Editor's Image dialog.
    */
  def GetWrapTextCheckBox(): ASPxClientCheckBox = js.native
}

