package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents the client-side equivalent of the ASPxRatingControl control.
 */

trait ASPxClientRatingControl extends ASPxClientControl {
  /**
       * Fires on the server after an item has been clicked.
       */
  var ItemClick: ASPxClientEvent[ASPxClientRatingControlItemClickEventHandler[ASPxClientRatingControl]]
  /**
       * Occurs on the client side when the mouse cursor moves outside a rating control item.
       */
  var ItemMouseOut: ASPxClientEvent[ASPxClientRatingControlItemMouseEventHandler[ASPxClientRatingControl]]
  /**
       * Occurs on the client side when the mouse cursor is moved into a rating control item.
       */
  var ItemMouseOver: ASPxClientEvent[ASPxClientRatingControlItemMouseEventHandler[ASPxClientRatingControl]]
  /**
       * Returns a value indicating whether the control's status is read-only.
       */
  def GetReadOnly(): scala.Boolean
  /**
       * Gets the item tooltip title specified by the item index.
       * @param index An integer value specifying the item index.
       */
  def GetTitle(index: scala.Double): java.lang.String
  /**
       * Returns the value of the ASPxRatingControl.
       */
  def GetValue(): scala.Double
  /**
       * Specifies whether the control's status is read-only.
       * @param value true to make the control read-only; otherwise, false.
       */
  def SetReadOnly(value: scala.Boolean): scala.Unit
  /**
       * Modifies the value of the ASPxRatingControl on the client side.
       * @param value A decimal value representing the value of the control.
       */
  def SetValue(value: scala.Double): scala.Unit
}

