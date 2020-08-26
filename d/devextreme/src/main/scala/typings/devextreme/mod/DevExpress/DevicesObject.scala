package typings.devextreme.mod.DevExpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicesObject extends js.Object {
  /** @name DevicesObject.current() */
  def current(): Device = js.native
  /** @name DevicesObject.current(deviceName) */
  def current(deviceName: String): Unit = js.native
  def current(deviceName: Device): Unit = js.native
  /** @name DevicesObject.off(eventName) */
  def off(eventName: String): this.type = js.native
  /** @name DevicesObject.off(eventName, eventHandler) */
  def off(eventName: String, eventHandler: js.Function): this.type = js.native
  /** @name DevicesObject.on(eventName, eventHandler) */
  def on(eventName: String, eventHandler: js.Function): this.type = js.native
  /** @name DevicesObject.on(events) */
  def on(events: js.Any): this.type = js.native
  /** @name DevicesObject.orientation() */
  def orientation(): String = js.native
  /** @name DevicesObject.real() */
  def real(): Device = js.native
}

