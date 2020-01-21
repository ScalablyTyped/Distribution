package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxColorEdit control.
  */
@JSGlobal("ASPxClientColorEdit")
@js.native
class ASPxClientColorEdit () extends ASPxClientDropDownEditBase {
  /**
    * Fires after the selected color has been changed within the color editor via end-user interaction.
    */
  var ColorChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientColorEdit]] = js.native
  /**
    * This event is not in effect for the ASPxClientColorEdit. Use the ASPxClientColorEdit.ColorChanged event instead.
    */
  @JSName("TextChanged")
  var TextChanged_ASPxClientColorEdit: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientColorEdit]] = js.native
  /**
    * Returns the color editor's value.
    */
  def GetColor(): String = js.native
  /**
    * Indicates whether the automatic color item is selected.
    */
  def IsAutomaticColorSelected(): Boolean = js.native
  /**
    * Specifies the color value for the color editor.
    * @param value A string value specifying the editor color.
    */
  def SetColor(value: String): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientColorEdit")
@js.native
object ASPxClientColorEdit extends js.Object {
  /**
    * Converts the specified object to the ASPxClientColorEdit type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientColorEdit = js.native
}

