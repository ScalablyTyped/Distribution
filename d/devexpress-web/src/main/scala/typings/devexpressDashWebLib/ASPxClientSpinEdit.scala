package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxSpinEdit control.
  */
@js.native
trait ASPxClientSpinEdit extends ASPxClientSpinEditBase {
  /**
    * Occurs on the client side when the editor's value is altered in any way.
    */
  var NumberChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientSpinEdit]] = js.native
  /**
    * Gets the maximum value of the editor.
    */
  def GetMaxValue(): scala.Double = js.native
  /**
    * Gets the minimum value of the editor.
    */
  def GetMinValue(): scala.Double = js.native
  /**
    * Gets a number which represents the spin editor's value.
    */
  def GetNumber(): scala.Double = js.native
  /**
    * Sets the maximum value of the editor.
    * @param value A decimal value specifying the maximum value of the editor.
    */
  def SetMaxValue(value: scala.Double): scala.Unit = js.native
  /**
    * Sets the minimum value of the editor.
    * @param value A decimal value specifying the minimum value of the editor.
    */
  def SetMinValue(value: scala.Double): scala.Unit = js.native
  /**
    * Sets the spin editor's value.
    * @param number A decimal number specifying the value to assign to the spin editor.
    */
  def SetNumber(number: scala.Double): scala.Unit = js.native
  /**
    * Specifies the value of the spin edit control on the client side.
    * @param number A Decimal value specifying the control value.
    */
  def SetValue(number: scala.Double): scala.Unit = js.native
}

