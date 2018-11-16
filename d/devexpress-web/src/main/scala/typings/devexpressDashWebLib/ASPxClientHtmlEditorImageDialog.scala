package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides client functionality for the Image dialog within the  ASPxHtmlEditor.
 */

trait ASPxClientHtmlEditorImageDialog extends ASPxClientHtmlEditorMediaDialogBase {
  /**
       * Provides access to the client object of the "Create thumbnail" check box in the Html Editor's Image dialog.
       */
  def GetCreateThumbnailCheckBox(): ASPxClientCheckBox
  /**
       * Provides access to the client object of the "Description" text box in the Html Editor's Image dialog.
       */
  def GetDescriptionTextBox(): ASPxClientTextBox
  /**
       * Provides access to the client object of the "Size" combo box in the Html Editor's Image dialog.
       */
  def GetSizeComboBox(): ASPxClientComboBox
  /**
       * Provides access to the client object of the "New image name" text box in the Html Editor's Image dialog.
       */
  def GetThumbnailNameTextBox(): ASPxClientTextBox
  /**
       * Provides access to the client object of the "Wrap text around image" check box in the Html Editor's Image dialog.
       */
  def GetWrapTextCheckBox(): ASPxClientCheckBox
}

