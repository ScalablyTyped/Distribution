package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Audio dialog within the  ASPxHtmlEditor.
  */
@JSGlobal("ASPxClientHtmlEditorAudioDialog")
@js.native
class ASPxClientHtmlEditorAudioDialog () extends ASPxClientHtmlEditorMediaDialogBase {
  /**
    * Provides access to the client object of the "Auto play" check box in the Html Editor's Audio dialogs.
    */
  def GetAutoPlayCheckBox(): ASPxClientCheckBox = js.native
  /**
    * Provides access to the client object of the "Loop" check box in the Html Editor's Audio dialogs.
    */
  def GetLoopCheckBox(): ASPxClientCheckBox = js.native
  /**
    * Provides access to the client object of the "Preload mode" combo box in the Html Editor's Audio dialogs.
    */
  def GetPreloadModeComboBox(): ASPxClientComboBox = js.native
  /**
    * Provides access to the client object of the "Show player controls" check box in the Html Editor's Audio dialogs.
    */
  def GetShowPlayerControlsCheckBox(): ASPxClientCheckBox = js.native
}

