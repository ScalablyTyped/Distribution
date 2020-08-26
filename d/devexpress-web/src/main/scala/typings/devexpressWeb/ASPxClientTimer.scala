package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxTimer object.
  */
@js.native
trait ASPxClientTimer extends ASPxClientControl {
  /**
    * Fires on the client side when the specified timer interval has elapsed, and the timer is enabled.
    */
  var Tick: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTimer]] = js.native
  /**
    * Returns a value indicating whether the timer is enabled.
    */
  def GetEnabled(): Boolean = js.native
  /**
    * Gets the time before the ASPxClientTimer.Tick event is raised relative to the last occurrence of the ASPxClientTimer.Tick event.
    */
  def GetInterval(): Double = js.native
  /**
    * Enables the timer.
    * @param enabled true to turn the timer on; false, to turn the timer off.
    */
  def SetEnabled(enabled: Boolean): Unit = js.native
  /**
    * Specifies the time before the ASPxClientTimer.Tick event is raised relative to the last occurrence of the ASPxClientTimer.Tick event.
    * @param interval An integer value that specifies the number of milliseconds before the Tick event is raised relative to the last occurrence of the Tick event. The value cannot be less than one.
    */
  def SetInterval(interval: Double): Unit = js.native
}

object ASPxClientTimer {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    GetClientVisible: () => Boolean,
    GetEnabled: () => Boolean,
    GetHeight: () => Double,
    GetInterval: () => Double,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetEnabled: Boolean => Unit,
    SetHeight: Double => Unit,
    SetInterval: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    Tick: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTimer]],
    name: String
  ): ASPxClientTimer = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetHeight = js.Any.fromFunction0(GetHeight), GetInterval = js.Any.fromFunction0(GetInterval), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetHeight = js.Any.fromFunction1(SetHeight), SetInterval = js.Any.fromFunction1(SetInterval), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), Tick = Tick.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTimer]
  }
  @scala.inline
  implicit class ASPxClientTimerOps[Self <: ASPxClientTimer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetEnabled(value: () => Boolean): Self = this.set("GetEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setGetInterval(value: () => Double): Self = this.set("GetInterval", js.Any.fromFunction0(value))
    @scala.inline
    def setSetEnabled(value: Boolean => Unit): Self = this.set("SetEnabled", js.Any.fromFunction1(value))
    @scala.inline
    def setSetInterval(value: Double => Unit): Self = this.set("SetInterval", js.Any.fromFunction1(value))
    @scala.inline
    def setTick(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTimer]]): Self = this.set("Tick", value.asInstanceOf[js.Any])
  }
  
}

