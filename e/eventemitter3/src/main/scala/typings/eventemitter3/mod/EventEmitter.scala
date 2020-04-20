package typings.eventemitter3.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Minimal `EventEmitter` interface that is molded against the Node.js
  * `EventEmitter` interface.
  */
@js.native
trait EventEmitter[EventTypes /* <: String | js.Symbol | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof EventTypes ]: std.Array<any>}
  */ typings.eventemitter3.eventemitter3Strings.EventEmitter with TopLevel[js.Any]) */] extends js.Object {
  def addListener[T /* <: EventNames[EventTypes] */](event: T, fn: ListenerFn[EventArgs[EventTypes, T]]): this.type = js.native
  def addListener[T /* <: EventNames[EventTypes] */](event: T, fn: ListenerFn[EventArgs[EventTypes, T]], context: js.Any): this.type = js.native
  /**
    * Calls each of the listeners registered for a given event.
    */
  def emit[T /* <: EventNames[EventTypes] */](
    event: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventArgs<EventTypes, T> is not an array type */ args: EventArgs[EventTypes, T]
  ): Boolean = js.native
  /**
    * Return an array listing the events for which the emitter has registered
    * listeners.
    */
  def eventNames(): js.Array[EventNames[EventTypes]] = js.native
  /**
    * Return the number of listeners listening to a given event.
    */
  def listenerCount(event: EventNames[EventTypes]): Double = js.native
  /**
    * Return the listeners registered for a given event.
    */
  def listeners[T /* <: EventNames[EventTypes] */](event: T): js.Array[ListenerFn[EventArgs[EventTypes, T]]] = js.native
  def off[T /* <: EventNames[EventTypes] */](event: T): this.type = js.native
  def off[T /* <: EventNames[EventTypes] */](event: T, fn: ListenerFn[EventArgs[EventTypes, T]]): this.type = js.native
  def off[T /* <: EventNames[EventTypes] */](event: T, fn: ListenerFn[EventArgs[EventTypes, T]], context: js.Any): this.type = js.native
  def off[T /* <: EventNames[EventTypes] */](event: T, fn: ListenerFn[EventArgs[EventTypes, T]], context: js.Any, once: Boolean): this.type = js.native
  /**
    * Add a listener for a given event.
    */
  def on[T /* <: EventNames[EventTypes] */](event: T, fn: ListenerFn[EventArgs[EventTypes, T]]): this.type = js.native
  def on[T /* <: EventNames[EventTypes] */](event: T, fn: ListenerFn[EventArgs[EventTypes, T]], context: js.Any): this.type = js.native
  /**
    * Add a one-time listener for a given event.
    */
  def once[T /* <: EventNames[EventTypes] */](event: T, fn: ListenerFn[EventArgs[EventTypes, T]]): this.type = js.native
  def once[T /* <: EventNames[EventTypes] */](event: T, fn: ListenerFn[EventArgs[EventTypes, T]], context: js.Any): this.type = js.native
  /**
    * Remove all listeners, or those of the specified event.
    */
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: EventNames[EventTypes]): this.type = js.native
  /**
    * Remove the listeners of a given event.
    */
  def removeListener[T /* <: EventNames[EventTypes] */](event: T): this.type = js.native
  def removeListener[T /* <: EventNames[EventTypes] */](event: T, fn: ListenerFn[EventArgs[EventTypes, T]]): this.type = js.native
  def removeListener[T /* <: EventNames[EventTypes] */](event: T, fn: ListenerFn[EventArgs[EventTypes, T]], context: js.Any): this.type = js.native
  def removeListener[T /* <: EventNames[EventTypes] */](event: T, fn: ListenerFn[EventArgs[EventTypes, T]], context: js.Any, once: Boolean): this.type = js.native
}

@JSImport("eventemitter3", "EventEmitter")
@js.native
object EventEmitter extends TopLevel[EventEmitterStatic]

