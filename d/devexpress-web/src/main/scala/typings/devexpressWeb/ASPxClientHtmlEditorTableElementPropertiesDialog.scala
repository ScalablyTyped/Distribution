package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for Table dialogs within the ASPxHtmlEditor.
  */
@JSGlobal("ASPxClientHtmlEditorTableElementPropertiesDialog")
@js.native
class ASPxClientHtmlEditorTableElementPropertiesDialog () extends ASPxClientHtmlEditorTableDialogBase {
  /**
    * Provides access to the client object of the "Horizontal" combo box in the Html Editor's Row/Column/Cell Properties dialog's Alignment group.
    */
  def GetHorizontalAlignmentComboBox(): ASPxClientComboBox = js.native
  /**
    * Provides access to the client object of the "Vertical" combo box in the Html Editor's Row/Column/Cell Properties dialog's Alignment group.
    */
  def GetVerticalAlignmentComboBox(): ASPxClientComboBox = js.native
}

