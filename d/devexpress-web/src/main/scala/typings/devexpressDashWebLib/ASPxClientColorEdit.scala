package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxColorEdit control.
  */
trait ASPxClientColorEdit extends ASPxClientDropDownEditBase {
  /**
    * Fires after the selected color has been changed within the color editor via end-user interaction.
    */
  var ColorChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientColorEdit]]
  /**
    * This event is not in effect for the ASPxClientColorEdit. Use the ColorChanged event instead.
    */
  @JSName("TextChanged")
  var TextChanged_ASPxClientColorEdit: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientColorEdit]]
  /**
    * Returns the color editor's value.
    */
  def GetColor(): java.lang.String
  /**
    * Indicates whether the automatic color item is selected.
    */
  def IsAutomaticColorSelected(): scala.Boolean
  /**
    * Specifies the color value for the color editor.
    * @param value A string value specifying the editor color.
    */
  def SetColor(value: java.lang.String): scala.Unit
}

