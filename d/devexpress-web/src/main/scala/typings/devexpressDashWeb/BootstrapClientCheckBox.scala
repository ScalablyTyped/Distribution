package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the BootstrapCheckBox control.
  */
@JSGlobal("BootstrapClientCheckBox")
@js.native
class BootstrapClientCheckBox () extends ASPxClientEdit {
  /**
    * Occurs on the client side when the editor's checked state has been changed.
    */
  var CheckedChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[BootstrapClientCheckBox]] = js.native
  /**
    * Returns a value which specifies a check box checked state.
    */
  def GetCheckState(): String = js.native
  /**
    * Returns a value indicating whether the check box editor is checked.
    */
  def GetChecked(): Boolean = js.native
  /**
    * Returns the text displayed within the editor.
    */
  def GetText(): String = js.native
  /**
    * Sets a value specifying the state of a check box.
    * @param checkState A string value matches one of the CheckState enumeration values.
    */
  def SetCheckState(checkState: String): Unit = js.native
  /**
    * Sets a value which specifies the checked status of the check box editor.
    * @param isChecked true if the check box editor is checked; otherwise, false.
    */
  def SetChecked(isChecked: Boolean): Unit = js.native
  /**
    * Sets the text to be displayed within the editor.
    * @param text A string value specifying the text to be displayed within the editor.
    */
  def SetText(text: String): Unit = js.native
}

