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

