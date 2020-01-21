package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a base for client button editor objects.
  */
@JSGlobal("ASPxClientButtonEditBase")
@js.native
class ASPxClientButtonEditBase () extends ASPxClientTextEdit {
  /**
    * Occurs on the client side after an editor button is clicked.
    */
  var ButtonClick: ASPxClientEvent[ASPxClientButtonEditClickEventHandler[ASPxClientButtonEditBase]] = js.native
  /**
    * Returns a button by its index in the button collection. A button.
    * @param number A button index.
    */
  def GetButton(number: Double): js.Any = js.native
  /**
    * Returns a value specifying whether a button is displayed. true, if the button visible; otherwise, false.
    * @param number An integer value specifying the button's index within the ASPxButtonEditBase.Buttons collection.
    */
  def GetButtonVisible(number: Double): Boolean = js.native
  /**
    * Specifies whether the button is visible.
    * @param number An integer value specifying the button's index within the ASPxButtonEditBase.Buttons collection.
    * @param value true, to make the button visible; otherwise, false.
    */
  def SetButtonVisible(number: Double, value: Boolean): Unit = js.native
}

