package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a base class for the editors that contain a drop down window.
 */

trait ASPxClientDropDownEditBase extends ASPxClientButtonEditBase {
  /**
       * Occurs on the client side when the drop down window is closed.
       */
  var CloseUp: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]]
  /**
       * Occurs on the client-side when the drop down window is opened.
       */
  var DropDown: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]]
  /**
       * Occurs on the client side before the drop down window is closed and allows you to cancel the operation.
       */
  var QueryCloseUp: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientDropDownEditBase]]
  /**
       * Modifies the size of the drop down window in accordance with its content.
       */
  def AdjustDropDownWindow(): scala.Unit
  /**
       * Closes the opened drop down window of the editor.
       */
  def HideDropDown(): scala.Unit
  /**
       * Invokes the editor's drop down window.
       */
  def ShowDropDown(): scala.Unit
}

