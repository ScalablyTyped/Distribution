package typings
package eventemitter2Lib.eventemitter2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eventemitter2", "EventEmitter2")
@js.native
class EventEmitter2 () extends js.Object {
  def this(options: ConstructorOptions) = this()
  def addListener(event: java.lang.String, listener: Listener): this.type = js.native
  def emit(event: java.lang.String, values: js.Any*): scala.Boolean = js.native
  def emit(event: js.Array[java.lang.String], values: js.Any*): scala.Boolean = js.native
  def emitAsync(event: java.lang.String, values: js.Any*): js.Promise[js.Array[_]] = js.native
  def emitAsync(event: js.Array[java.lang.String], values: js.Any*): js.Promise[js.Array[_]] = js.native
  def eventNames(): js.Array[java.lang.String] = js.native
  def listeners(event: java.lang.String): js.Array[Listener] = js.native
  def listeners(event: js.Array[java.lang.String]): js.Array[Listener] = js.native
  // TODO: not in documentation by Willian
  def listenersAny(): js.Array[Listener] = js.native
  def many(event: java.lang.String, timesToListen: scala.Double, listener: Listener): this.type = js.native
  def many(event: js.Array[java.lang.String], timesToListen: scala.Double, listener: Listener): this.type = js.native
  def off(event: java.lang.String, listener: Listener): this.type = js.native
  def offAny(listener: Listener): this.type = js.native
  def on(event: java.lang.String, listener: Listener): this.type = js.native
  def on(event: js.Array[java.lang.String], listener: Listener): this.type = js.native
  def onAny(listener: EventAndListener): this.type = js.native
  def once(event: java.lang.String, listener: Listener): this.type = js.native
  def once(event: js.Array[java.lang.String], listener: Listener): this.type = js.native
  def prependAny(listener: EventAndListener): this.type = js.native
  def prependListener(event: java.lang.String, listener: Listener): this.type = js.native
  def prependListener(event: js.Array[java.lang.String], listener: Listener): this.type = js.native
  def prependMany(event: java.lang.String, timesToListen: scala.Double, listener: Listener): this.type = js.native
  def prependMany(event: js.Array[java.lang.String], timesToListen: scala.Double, listener: Listener): this.type = js.native
  def prependOnceListener(event: java.lang.String, listener: Listener): this.type = js.native
  def prependOnceListener(event: js.Array[java.lang.String], listener: Listener): this.type = js.native
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: eventNS): this.type = js.native
  def removeAllListeners(event: java.lang.String): this.type = js.native
  def removeListener(event: java.lang.String, listener: Listener): this.type = js.native
  def removeListener(event: js.Array[java.lang.String], listener: Listener): this.type = js.native
  def setMaxListeners(n: scala.Double): scala.Unit = js.native
}

