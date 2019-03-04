package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxTimer object.
  */
trait ASPxClientTimer extends ASPxClientControl {
  /**
    * Fires on the client side when the specified timer interval has elapsed, and the timer is enabled.
    */
  var Tick: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTimer]]
  /**
    * Returns a value indicating whether the timer is enabled.
    */
  def GetEnabled(): scala.Boolean
  /**
    * Gets the time before the Tick event.
    */
  def GetInterval(): scala.Double
  /**
    * Enables the timer.
    * @param enabled true to turn the timer on; false, to turn the timer off.
    */
  def SetEnabled(enabled: scala.Boolean): scala.Unit
  /**
    * Specifies the time before the Tick event.
    * @param interval An integer value that specifies the number of milliseconds before the Tick event is raised relative to the last occurrence of the Tick event. The value cannot be less than one.
    */
  def SetInterval(interval: scala.Double): scala.Unit
}

object ASPxClientTimer {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    GetClientVisible: js.Function0[scala.Boolean],
    GetEnabled: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetInterval: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetInterval: js.Function1[scala.Double, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    Tick: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTimer]],
    name: java.lang.String
  ): ASPxClientTimer = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, GetClientVisible = GetClientVisible, GetEnabled = GetEnabled, GetHeight = GetHeight, GetInterval = GetInterval, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetClientVisible = SetClientVisible, SetEnabled = SetEnabled, SetHeight = SetHeight, SetInterval = SetInterval, SetVisible = SetVisible, SetWidth = SetWidth, Tick = Tick, name = name)
  
    __obj.asInstanceOf[ASPxClientTimer]
  }
}

