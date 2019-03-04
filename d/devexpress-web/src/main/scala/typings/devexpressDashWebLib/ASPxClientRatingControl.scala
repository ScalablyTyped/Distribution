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

object ASPxClientRatingControl {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    GetClientVisible: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetReadOnly: js.Function0[scala.Boolean],
    GetTitle: js.Function1[scala.Double, java.lang.String],
    GetValue: js.Function0[scala.Double],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    ItemClick: ASPxClientEvent[ASPxClientRatingControlItemClickEventHandler[ASPxClientRatingControl]],
    ItemMouseOut: ASPxClientEvent[ASPxClientRatingControlItemMouseEventHandler[ASPxClientRatingControl]],
    ItemMouseOver: ASPxClientEvent[ASPxClientRatingControlItemMouseEventHandler[ASPxClientRatingControl]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetReadOnly: js.Function1[scala.Boolean, scala.Unit],
    SetValue: js.Function1[scala.Double, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): ASPxClientRatingControl = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, GetClientVisible = GetClientVisible, GetHeight = GetHeight, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetReadOnly = GetReadOnly, GetTitle = GetTitle, GetValue = GetValue, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, ItemClick = ItemClick, ItemMouseOut = ItemMouseOut, ItemMouseOver = ItemMouseOver, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetClientVisible = SetClientVisible, SetHeight = SetHeight, SetReadOnly = SetReadOnly, SetValue = SetValue, SetVisible = SetVisible, SetWidth = SetWidth, name = name)
  
    __obj.asInstanceOf[ASPxClientRatingControl]
  }
}

