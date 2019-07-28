package typings.eventemitter2.eventemitter2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eventemitter2", "EventEmitter2")
@js.native
class EventEmitter2 () extends js.Object {
  def this(options: ConstructorOptions) = this()
  def addListener(event: String, listener: Listener): this.type = js.native
  def emit(event: String, values: js.Any*): Boolean = js.native
  def emit(event: js.Array[String], values: js.Any*): Boolean = js.native
  def emitAsync(event: String, values: js.Any*): js.Promise[js.Array[_]] = js.native
  def emitAsync(event: js.Array[String], values: js.Any*): js.Promise[js.Array[_]] = js.native
  def eventNames(): js.Array[String] = js.native
  def listeners(event: String): js.Array[Listener] = js.native
  def listeners(event: js.Array[String]): js.Array[Listener] = js.native
  // TODO: not in documentation by Willian
  def listenersAny(): js.Array[Listener] = js.native
  def many(event: String, timesToListen: Double, listener: Listener): this.type = js.native
  def many(event: js.Array[String], timesToListen: Double, listener: Listener): this.type = js.native
  def off(event: String, listener: Listener): this.type = js.native
  def offAny(listener: Listener): this.type = js.native
  def on(event: String, listener: Listener): this.type = js.native
  def on(event: js.Array[String], listener: Listener): this.type = js.native
  def onAny(listener: EventAndListener): this.type = js.native
  def once(event: String, listener: Listener): this.type = js.native
  def once(event: js.Array[String], listener: Listener): this.type = js.native
  def prependAny(listener: EventAndListener): this.type = js.native
  def prependListener(event: String, listener: Listener): this.type = js.native
  def prependListener(event: js.Array[String], listener: Listener): this.type = js.native
  def prependMany(event: String, timesToListen: Double, listener: Listener): this.type = js.native
  def prependMany(event: js.Array[String], timesToListen: Double, listener: Listener): this.type = js.native
  def prependOnceListener(event: String, listener: Listener): this.type = js.native
  def prependOnceListener(event: js.Array[String], listener: Listener): this.type = js.native
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: String): this.type = js.native
  def removeAllListeners(event: eventNS): this.type = js.native
  def removeListener(event: String, listener: Listener): this.type = js.native
  def removeListener(event: js.Array[String], listener: Listener): this.type = js.native
  def setMaxListeners(n: Double): Unit = js.native
}

