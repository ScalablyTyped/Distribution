package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxTimer object.
  */
@JSGlobal("ASPxClientTimer")
@js.native
class ASPxClientTimer () extends ASPxClientControl {
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

/* static members */
@JSGlobal("ASPxClientTimer")
@js.native
object ASPxClientTimer extends js.Object {
  /**
    * Converts the specified object to the ASPxClientTimer type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientTimer = js.native
}

