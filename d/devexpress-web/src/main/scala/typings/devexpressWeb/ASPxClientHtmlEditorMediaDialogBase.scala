package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the media dialogs within the ASPxHtmlEditor.
  */
@JSGlobal("ASPxClientHtmlEditorMediaDialogBase")
@js.native
class ASPxClientHtmlEditorMediaDialogBase () extends ASPxClientHtmlEditorEditElementDialog {
  /**
    * Provides access to the client object of the "Height" spin editor in the Html Editor's Audio/Video/Flash dialogs.
    */
  def GetHeightSpinEdit(): ASPxClientSpinEdit = js.native
  /**
    * Provides access to the client object of the media file selector that allows you to insert/change media files in the Html Editor's Audio/Video/Flash dialogs.
    */
  def GetMediaFileSelector(): ASPxClientMediaFileSelector = js.native
  /**
    * Provides access to the client object of the "More options" check box in the Html Editor's Audio/Video/Flash/Image dialogs.
    */
  def GetMoreOptionsCheckBox(): ASPxClientCheckBox = js.native
  /**
    * Provides access to the client object of the "Position" combo box in the Html Editor's Audio/Video/Flash/Image dialogs.
    */
  def GetPositionComboBox(): ASPxClientComboBox = js.native
  /**
    * Provides access to the client object of the "Width" spin editor in the Html Editor's Audio/Video/Flash dialogs.
    */
  def GetWidthSpinEdit(): ASPxClientSpinEdit = js.native
}

