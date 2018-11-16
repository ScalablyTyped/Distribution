package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides client functionality for the media dialogs within the ASPxHtmlEditor.
 */

trait ASPxClientHtmlEditorMediaDialogBase extends ASPxClientHtmlEditorEditElementDialog {
  /**
       * Provides access to the client object of the "Height" spin editor in the Html Editor's Audio/Video/Flash dialogs.
       */
  def GetHeightSpinEdit(): ASPxClientSpinEdit
  /**
       * Provides access to the client object of the media file selector that allows you to insert/change media files in the Html Editor's Audio/Video/Flash dialogs.
       */
  def GetMediaFileSelector(): ASPxClientMediaFileSelector
  /**
       * Provides access to the client object of the "More options" check box in the Html Editor's Audio/Video/Flash/Image dialogs.
       */
  def GetMoreOptionsCheckBox(): ASPxClientCheckBox
  /**
       * Provides access to the client object of the "Position" combo box in the Html Editor's Audio/Video/Flash/Image dialogs.
       */
  def GetPositionComboBox(): ASPxClientComboBox
  /**
       * Provides access to the client object of the "Width" spin editor in the Html Editor's Audio/Video/Flash dialogs.
       */
  def GetWidthSpinEdit(): ASPxClientSpinEdit
}

