package typings
package eventemitter3Lib.eventemitter3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitter[EventTypes /* <: java.lang.String | js.Symbol */] extends js.Object {
  def addListener(event: EventTypes, fn: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn): this.type = js.native
  def addListener(
    event: EventTypes,
    fn: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn,
    context: js.Any
  ): this.type = js.native
  /**
     * Calls each of the listeners registered for a given event.
     */
  def emit(event: EventTypes, args: js.Any*): scala.Boolean = js.native
  /**
     * Return an array listing the events for which the emitter has registered
     * listeners.
     */
  def eventNames(): js.Array[EventTypes] = js.native
  /**
     * Return the number of listeners listening to a given event.
     */
  def listenerCount(event: EventTypes): scala.Double = js.native
  /**
     * Return the listeners registered for a given event.
     */
  def listeners(event: EventTypes): js.Array[eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn] = js.native
  def off(event: EventTypes): this.type = js.native
  def off(event: EventTypes, fn: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn): this.type = js.native
  def off(
    event: EventTypes,
    fn: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn,
    context: js.Any
  ): this.type = js.native
  def off(
    event: EventTypes,
    fn: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn,
    context: js.Any,
    once: scala.Boolean
  ): this.type = js.native
  /**
     * Add a listener for a given event.
     */
  def on(event: EventTypes, fn: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn): this.type = js.native
  /**
     * Add a listener for a given event.
     */
  def on(
    event: EventTypes,
    fn: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn,
    context: js.Any
  ): this.type = js.native
  /**
     * Add a one-time listener for a given event.
     */
  def once(event: EventTypes, fn: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn): this.type = js.native
  /**
     * Add a one-time listener for a given event.
     */
  def once(
    event: EventTypes,
    fn: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn,
    context: js.Any
  ): this.type = js.native
  /**
     * Remove all listeners, or those of the specified event.
     */
  def removeAllListeners(): this.type = js.native
  /**
     * Remove all listeners, or those of the specified event.
     */
  def removeAllListeners(event: EventTypes): this.type = js.native
  /**
     * Remove the listeners of a given event.
     */
  def removeListener(event: EventTypes): this.type = js.native
  /**
     * Remove the listeners of a given event.
     */
  def removeListener(event: EventTypes, fn: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn): this.type = js.native
  /**
     * Remove the listeners of a given event.
     */
  def removeListener(
    event: EventTypes,
    fn: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn,
    context: js.Any
  ): this.type = js.native
  /**
     * Remove the listeners of a given event.
     */
  def removeListener(
    event: EventTypes,
    fn: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn,
    context: js.Any,
    once: scala.Boolean
  ): this.type = js.native
}

