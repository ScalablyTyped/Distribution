package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a base class for the editors that contain a drop down window.
  */
@JSGlobal("ASPxClientDropDownEditBase")
@js.native
class ASPxClientDropDownEditBase () extends ASPxClientButtonEditBase {
  /**
    * Occurs on the client side when the drop down window is closed.
    */
  var CloseUp: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]] = js.native
  /**
    * Occurs on the client-side when the drop down window is opened by the dropdown button click.
    */
  var DropDown: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]] = js.native
  /**
    * Occurs on the client side before the drop down window is closed and allows you to cancel the operation.
    */
  var QueryCloseUp: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientDropDownEditBase]] = js.native
  /**
    * Modifies the size of the drop down window in accordance with its content.
    */
  def AdjustDropDownWindow(): Unit = js.native
  /**
    * Closes the opened drop down window of the editor.
    */
  def HideDropDown(): Unit = js.native
  /**
    * Invokes the editor's drop down window.
    */
  def ShowDropDown(): Unit = js.native
}

