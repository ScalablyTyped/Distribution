package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a base for client button editor objects.
  */
trait ASPxClientButtonEditBase extends ASPxClientTextEdit {
  /**
    * Occurs on the client side after an editor button is clicked.
    */
  var ButtonClick: ASPxClientEvent[ASPxClientButtonEditClickEventHandler[ASPxClientButtonEditBase]]
  /**
    * Returns a value specifying whether a button is displayed.
    * @param number An integer value specifying the button's index within the Buttons collection.
    */
  def GetButtonVisible(number: scala.Double): scala.Boolean
  /**
    * Specifies whether the button is visible.
    * @param number An integer value specifying the button's index within the Buttons collection.
    * @param value true, to make the button visible; otherwise, false.
    */
  def SetButtonVisible(number: scala.Double, value: scala.Boolean): scala.Unit
}

