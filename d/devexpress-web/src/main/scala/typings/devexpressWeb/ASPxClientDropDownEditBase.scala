package typings.devexpressWeb

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
    * Occurs on the client side when the <strong>drop down window</strong> is closed.
    */
  var CloseUp: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]] = js.native
  /**
    * Occurs on the client-side when the <strong>drop down window</strong> is opened by the dropdown button click.
    */
  var DropDown: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]] = js.native
  /**
    * Occurs on the client side before the <strong>drop down window</strong> is closed and allows you to cancel the operation.
    */
  var QueryCloseUp: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientDropDownEditBase]] = js.native
  /**
    * Modifies the size of the <strong>drop down window</strong> in accordance with its content.
    */
  def AdjustDropDownWindow(): Unit = js.native
  /**
    * Closes the opened <strong>drop down window</strong> of the editor.
    */
  def HideDropDown(): Unit = js.native
  /**
    * Invokes the editor's <strong>drop down window</strong>.
    */
  def ShowDropDown(): Unit = js.native
}

