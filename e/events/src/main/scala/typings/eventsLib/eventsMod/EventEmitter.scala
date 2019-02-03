package typings
package eventsLib.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("events", "EventEmitter")
@js.native
class EventEmitter () extends js.Object {
  def addListener(`type`: java.lang.String, listener: Listener): this.type = js.native
  def addListener(`type`: scala.Double, listener: Listener): this.type = js.native
  def emit(`type`: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def emit(`type`: scala.Double, args: js.Any*): scala.Boolean = js.native
  def eventNames(): js.Array[java.lang.String | scala.Double] = js.native
  def getMaxListeners(): scala.Double = js.native
  def listenerCount(`type`: java.lang.String): scala.Double = js.native
  def listenerCount(`type`: scala.Double): scala.Double = js.native
  def listeners(`type`: java.lang.String): js.Array[Listener] = js.native
  def listeners(`type`: scala.Double): js.Array[Listener] = js.native
  def off(`type`: java.lang.String, listener: Listener): this.type = js.native
  def off(`type`: scala.Double, listener: Listener): this.type = js.native
  def on(`type`: java.lang.String, listener: Listener): this.type = js.native
  def on(`type`: scala.Double, listener: Listener): this.type = js.native
  def once(`type`: java.lang.String, listener: Listener): this.type = js.native
  def once(`type`: scala.Double, listener: Listener): this.type = js.native
  def prependListener(`type`: java.lang.String, listener: Listener): this.type = js.native
  def prependListener(`type`: scala.Double, listener: Listener): this.type = js.native
  def prependOnceListener(`type`: java.lang.String, listener: Listener): this.type = js.native
  def prependOnceListener(`type`: scala.Double, listener: Listener): this.type = js.native
  def rawListeners(`type`: java.lang.String): js.Array[Listener] = js.native
  def rawListeners(`type`: scala.Double): js.Array[Listener] = js.native
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(`type`: java.lang.String): this.type = js.native
  def removeAllListeners(`type`: scala.Double): this.type = js.native
  def removeListener(`type`: java.lang.String, listener: Listener): this.type = js.native
  def removeListener(`type`: scala.Double, listener: Listener): this.type = js.native
  def setMaxListeners(n: scala.Double): this.type = js.native
}

/* static members */
@JSImport("events", "EventEmitter")
@js.native
object EventEmitter extends js.Object {
  var defaultMaxListeners: scala.Double = js.native
  def listenerCount(emitter: eventsLib.eventsMod.EventEmitter, `type`: java.lang.String): scala.Double = js.native
  def listenerCount(emitter: eventsLib.eventsMod.EventEmitter, `type`: scala.Double): scala.Double = js.native
}

