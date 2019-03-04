package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxTitleIndex object.
  */
trait ASPxClientTitleIndex extends ASPxClientControl {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTitleIndex]]
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientTitleIndex.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTitleIndex]]
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTitleIndex]]
  /**
    * Fires after an item has been clicked.
    */
  var ItemClick: ASPxClientEvent[ASPxClientTitleIndexItemEventHandler[ASPxClientTitleIndex]]
}

object ASPxClientTitleIndex {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTitleIndex]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTitleIndex]],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTitleIndex]],
    GetClientVisible: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    ItemClick: ASPxClientEvent[ASPxClientTitleIndexItemEventHandler[ASPxClientTitleIndex]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): ASPxClientTitleIndex = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, BeginCallback = BeginCallback, CallbackError = CallbackError, EndCallback = EndCallback, GetClientVisible = GetClientVisible, GetHeight = GetHeight, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, ItemClick = ItemClick, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetClientVisible = SetClientVisible, SetHeight = SetHeight, SetVisible = SetVisible, SetWidth = SetWidth, name = name)
  
    __obj.asInstanceOf[ASPxClientTitleIndex]
  }
}

