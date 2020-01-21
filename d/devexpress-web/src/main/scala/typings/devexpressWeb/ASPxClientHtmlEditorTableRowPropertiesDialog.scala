package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Row Properties dialog within the ASPxHtmlEditor.
  */
@JSGlobal("ASPxClientHtmlEditorTableRowPropertiesDialog")
@js.native
class ASPxClientHtmlEditorTableRowPropertiesDialog () extends ASPxClientHtmlEditorTableElementPropertiesDialog {
  /**
    * Provides access to the client object of the "Height" combo box in the Html Editor's "Row Properties" dialog.
    */
  def GetHeightTypeComboBox(): ASPxClientComboBox = js.native
  /**
    * Provides access to the client ASPxSpinEdit object that allows you to specify the row height in the Html Editor's "Row Properties" dialog.
    */
  def GetHeightValueSpinEdit(): ASPxClientSpinEdit = js.native
  /**
    * Provides access to the client ASPxComboBox object that allows you to specify the row height measurement unit in the Html Editor's "Row Properties" dialog.
    */
  def GetHeightValueTypeComboBox(): ASPxClientComboBox = js.native
}

