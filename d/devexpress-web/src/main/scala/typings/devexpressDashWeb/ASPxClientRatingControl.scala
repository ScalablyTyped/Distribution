package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxRatingControl control.
  */
@JSGlobal("ASPxClientRatingControl")
@js.native
class ASPxClientRatingControl () extends ASPxClientControl {
  /**
    * Fires on the server after an item has been clicked.
    */
  var ItemClick: ASPxClientEvent[ASPxClientRatingControlItemClickEventHandler[ASPxClientRatingControl]] = js.native
  /**
    * Occurs on the client side when the mouse cursor moves outside a rating control item.
    */
  var ItemMouseOut: ASPxClientEvent[ASPxClientRatingControlItemMouseEventHandler[ASPxClientRatingControl]] = js.native
  /**
    * Occurs on the client side when the mouse cursor is moved into a rating control item.
    */
  var ItemMouseOver: ASPxClientEvent[ASPxClientRatingControlItemMouseEventHandler[ASPxClientRatingControl]] = js.native
  /**
    * Returns a value indicating whether the control's status is read-only.
    */
  def GetReadOnly(): Boolean = js.native
  /**
    * Gets the item tooltip title specified by the item index. A string that is the specified item tooltip title.
    * @param index An integer value specifying the item index.
    */
  def GetTitle(index: Double): String = js.native
  /**
    * Returns the value of the ASPxRatingControl.
    */
  def GetValue(): Double = js.native
  /**
    * Specifies whether the control's status is read-only.
    * @param value true to make the control read-only; otherwise, false.
    */
  def SetReadOnly(value: Boolean): Unit = js.native
  /**
    * Modifies the value of the ASPxRatingControl on the client side.
    * @param value A decimal value representing the value of the control.
    */
  def SetValue(value: Double): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientRatingControl")
@js.native
object ASPxClientRatingControl extends js.Object {
  /**
    * Converts the specified object to the ASPxClientRatingControl type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientRatingControl = js.native
}

