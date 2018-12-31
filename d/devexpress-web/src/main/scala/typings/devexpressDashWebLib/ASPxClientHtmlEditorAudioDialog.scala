package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Audio dialog within the  ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorAudioDialog extends ASPxClientHtmlEditorMediaDialogBase {
  /**
    * Provides access to the client object of the "Auto play" check box in the Html Editor's Audio dialogs.
    */
  def GetAutoPlayCheckBox(): ASPxClientCheckBox
  /**
    * Provides access to the client object of the "Loop" check box in the Html Editor's Audio dialogs.
    */
  def GetLoopCheckBox(): ASPxClientCheckBox
  /**
    * Provides access to the client object of the "Preload mode" combo box in the Html Editor's Audio dialogs.
    */
  def GetPreloadModeComboBox(): ASPxClientComboBox
  /**
    * Provides access to the client object of the "Show player controls" check box in the Html Editor's Audio dialogs.
    */
  def GetShowPlayerControlsCheckBox(): ASPxClientCheckBox
}

