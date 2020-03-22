package typings.devextreme.mod.DevExpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicesObject extends js.Object {
  /** Gets information on the current device. */
  def current(): Device = js.native
  /** Overrides actual device information to force the application to operate as if it was running on a specified device. */
  def current(deviceName: String): Unit = js.native
  def current(deviceName: Device): Unit = js.native
  /** Detaches all event handlers from a single event. */
  def off(eventName: String): this.type = js.native
  /** Detaches a particular event handler from a single event. */
  def off(eventName: String, eventHandler: js.Function): this.type = js.native
  /** Subscribes to an event. */
  def on(eventName: String, eventHandler: js.Function): this.type = js.native
  /** Subscribes to events. */
  def on(events: js.Any): this.type = js.native
  /** Returns the current device orientation. */
  def orientation(): String = js.native
  /** Returns real information about the current device regardless of the value passed to the devices.current(deviceName) method. */
  def real(): Device = js.native
}

