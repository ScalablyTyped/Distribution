package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxCheckBox control.
  */
@JSGlobal("ASPxClientCheckBox")
@js.native
class ASPxClientCheckBox () extends ASPxClientEdit {
  /**
    * Occurs on the client side when the editor's checked state is changed.
    */
  var CheckedChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCheckBox]] = js.native
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

/* static members */
@JSGlobal("ASPxClientCheckBox")
@js.native
object ASPxClientCheckBox extends js.Object {
  /**
    * Converts the specified object to the ASPxClientCheckBox type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientCheckBox = js.native
}

