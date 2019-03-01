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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdjustControl")(AdjustControl)
    __obj.updateDynamic("GetClientVisible")(GetClientVisible)
    __obj.updateDynamic("GetEnabled")(GetEnabled)
    __obj.updateDynamic("GetHeight")(GetHeight)
    __obj.updateDynamic("GetInterval")(GetInterval)
    __obj.updateDynamic("GetMainElement")(GetMainElement)
    __obj.updateDynamic("GetParentControl")(GetParentControl)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("GetWidth")(GetWidth)
    __obj.updateDynamic("InCallback")(InCallback)
    __obj.updateDynamic("Init")(Init)
    __obj.updateDynamic("SendMessageToAssistiveTechnology")(SendMessageToAssistiveTechnology)
    __obj.updateDynamic("SetClientVisible")(SetClientVisible)
    __obj.updateDynamic("SetEnabled")(SetEnabled)
    __obj.updateDynamic("SetHeight")(SetHeight)
    __obj.updateDynamic("SetInterval")(SetInterval)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("SetWidth")(SetWidth)
    __obj.updateDynamic("Tick")(Tick)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientTimer]
  }
}

