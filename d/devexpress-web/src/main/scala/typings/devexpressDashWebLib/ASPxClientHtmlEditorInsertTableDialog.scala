package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Insert Table dialog within the  ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorInsertTableDialog extends ASPxClientHtmlEditorTableDialog {
  /**
    * Provides access to the client object of the "Columns" spin editor in the Html Editor's Table dialogs.
    */
  def GetColumnCountSpinEdit(): ASPxClientSpinEdit
  /**
    * Provides access to the client object of the "Equal column widths" check box in the Html Editor's Table dialogs.
    */
  def GetEqualWidthCheckBox(): ASPxClientCheckBox
  /**
    * Provides access to the client object of the "Rows" spin editor in the Html Editor's Table dialogs.
    */
  def GetRowCountSpinEdit(): ASPxClientSpinEdit
}

