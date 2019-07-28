package typings.events.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("events", "EventEmitter")
@js.native
class EventEmitter () extends js.Object {
  def addListener(`type`: String, listener: Listener): this.type = js.native
  def addListener(`type`: Double, listener: Listener): this.type = js.native
  def emit(`type`: String, args: js.Any*): Boolean = js.native
  def emit(`type`: Double, args: js.Any*): Boolean = js.native
  def eventNames(): js.Array[String | Double] = js.native
  def getMaxListeners(): Double = js.native
  def listenerCount(`type`: String): Double = js.native
  def listenerCount(`type`: Double): Double = js.native
  def listeners(`type`: String): js.Array[Listener] = js.native
  def listeners(`type`: Double): js.Array[Listener] = js.native
  def off(`type`: String, listener: Listener): this.type = js.native
  def off(`type`: Double, listener: Listener): this.type = js.native
  def on(`type`: String, listener: Listener): this.type = js.native
  def on(`type`: Double, listener: Listener): this.type = js.native
  def once(`type`: String, listener: Listener): this.type = js.native
  def once(`type`: Double, listener: Listener): this.type = js.native
  def prependListener(`type`: String, listener: Listener): this.type = js.native
  def prependListener(`type`: Double, listener: Listener): this.type = js.native
  def prependOnceListener(`type`: String, listener: Listener): this.type = js.native
  def prependOnceListener(`type`: Double, listener: Listener): this.type = js.native
  def rawListeners(`type`: String): js.Array[Listener] = js.native
  def rawListeners(`type`: Double): js.Array[Listener] = js.native
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(`type`: String): this.type = js.native
  def removeAllListeners(`type`: Double): this.type = js.native
  def removeListener(`type`: String, listener: Listener): this.type = js.native
  def removeListener(`type`: Double, listener: Listener): this.type = js.native
  def setMaxListeners(n: Double): this.type = js.native
}

/* static members */
@JSImport("events", "EventEmitter")
@js.native
object EventEmitter extends js.Object {
  var defaultMaxListeners: Double = js.native
  def listenerCount(emitter: EventEmitter, `type`: String): Double = js.native
  def listenerCount(emitter: EventEmitter, `type`: Double): Double = js.native
}

