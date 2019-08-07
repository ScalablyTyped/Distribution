package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Video dialog within the ASPxHtmlEditor.
  */
@JSGlobal("ASPxClientHtmlEditorVideoDialog")
@js.native
class ASPxClientHtmlEditorVideoDialog () extends ASPxClientHtmlEditorMediaDialogBase {
  /**
    * Provides access to the client object of the "Auto play" check box in the Html Editor's Video dialog.
    */
  def GetAutoPlayCheckBox(): ASPxClientCheckBox = js.native
  /**
    * Provides access to the client object of the "Loop" check box in the Html Editor's Video dialog.
    */
  def GetLoopCheckBox(): ASPxClientCheckBox = js.native
  /**
    * Provides access to the client object of the "Poster URL" text box in the Html Editor's Video dialog.
    */
  def GetPosterTextBox(): ASPxClientTextBox = js.native
  /**
    * Provides access to the client object of the "Preload mode" combo box in the Html Editor's Video dialog.
    */
  def GetPreloadModeComboBox(): ASPxClientComboBox = js.native
  /**
    * Provides access to the client object of the "Show player controls" check box in the Html Editor's Video dialog.
    */
  def GetShowPlayerControlsCheckBox(): ASPxClientCheckBox = js.native
}

