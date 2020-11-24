package typings.eventemitter2.mod

import typings.eventemitter2.eventemitter2Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("eventemitter2", "EventEmitter2")
@js.native
class EventEmitter2 () extends js.Object {
  def this(options: ConstructorOptions) = this()
  
  def addListener(event: event | eventNS, listener: ListenerFn): this.type | Listener = js.native
  
  def emit(event: event | eventNS, values: js.Any*): Boolean = js.native
  
  def emitAsync(event: event | eventNS, values: js.Any*): js.Promise[js.Array[_]] = js.native
  
  def eventNames(): js.Array[event | eventNS] = js.native
  def eventNames(nsAsArray: Boolean): js.Array[event | eventNS] = js.native
  
  def getMaxListeners(): Double = js.native
  
  def hasListeners(): Boolean = js.native
  def hasListeners(event: String): Boolean = js.native
  
  def listenTo(target: GeneralEventEmitter, events: event | eventNS): this.type = js.native
  def listenTo(target: GeneralEventEmitter, events: event | eventNS, options: ListenToOptions): this.type = js.native
  def listenTo(target: GeneralEventEmitter, events: js.Array[event]): this.type = js.native
  def listenTo(target: GeneralEventEmitter, events: js.Array[event], options: ListenToOptions): this.type = js.native
  def listenTo(target: GeneralEventEmitter, events: js.Object): this.type = js.native
  def listenTo(target: GeneralEventEmitter, events: js.Object, options: ListenToOptions): this.type = js.native
  
  def listenerCount(): Double = js.native
  def listenerCount(event: event | eventNS): Double = js.native
  
  def listeners(): js.Array[ListenerFn] = js.native
  def listeners(event: event | eventNS): js.Array[ListenerFn] = js.native
  
  def listenersAny(): js.Array[ListenerFn] = js.native
  
  def many(event: event | eventNS, timesToListen: Double, listener: ListenerFn): this.type | Listener = js.native
  def many(event: event | eventNS, timesToListen: Double, listener: ListenerFn, options: Boolean): this.type | Listener = js.native
  def many(event: event | eventNS, timesToListen: Double, listener: ListenerFn, options: OnOptions): this.type | Listener = js.native
  
  def off(event: event | eventNS, listener: ListenerFn): this.type = js.native
  
  def offAny(listener: ListenerFn): this.type = js.native
  
  def on(event: event | eventNS, listener: ListenerFn): this.type | Listener = js.native
  def on(event: event | eventNS, listener: ListenerFn, options: Boolean): this.type | Listener = js.native
  def on(event: event | eventNS, listener: ListenerFn, options: OnOptions): this.type | Listener = js.native
  
  def onAny(listener: EventAndListener): this.type = js.native
  
  def once(event: event | eventNS, listener: ListenerFn): this.type | Listener = js.native
  def once(event: event | eventNS, listener: ListenerFn, options: OnOptions): this.type | Listener = js.native
  @JSName("once")
  def once_true(event: event | eventNS, listener: ListenerFn, options: `true`): this.type | Listener = js.native
  
  def prependAny(listener: EventAndListener): this.type = js.native
  
  def prependListener(event: event | eventNS, listener: ListenerFn): this.type | Listener = js.native
  def prependListener(event: event | eventNS, listener: ListenerFn, options: Boolean): this.type | Listener = js.native
  def prependListener(event: event | eventNS, listener: ListenerFn, options: OnOptions): this.type | Listener = js.native
  
  def prependMany(event: event | eventNS, timesToListen: Double, listener: ListenerFn): this.type | Listener = js.native
  def prependMany(event: event | eventNS, timesToListen: Double, listener: ListenerFn, options: Boolean): this.type | Listener = js.native
  def prependMany(event: event | eventNS, timesToListen: Double, listener: ListenerFn, options: OnOptions): this.type | Listener = js.native
  
  def prependOnceListener(event: event | eventNS, listener: ListenerFn): this.type | Listener = js.native
  def prependOnceListener(event: event | eventNS, listener: ListenerFn, options: Boolean): this.type | Listener = js.native
  def prependOnceListener(event: event | eventNS, listener: ListenerFn, options: OnOptions): this.type | Listener = js.native
  
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: event | eventNS): this.type = js.native
  
  def removeListener(event: event | eventNS, listener: ListenerFn): this.type = js.native
  
  def setMaxListeners(n: Double): Unit = js.native
  
  def stopListeningTo(): Boolean = js.native
  def stopListeningTo(target: js.UndefOr[scala.Nothing], event: event | eventNS): Boolean = js.native
  def stopListeningTo(target: GeneralEventEmitter): Boolean = js.native
  def stopListeningTo(target: GeneralEventEmitter, event: event | eventNS): Boolean = js.native
  
  def waitFor(event: event | eventNS): CancelablePromise[js.Array[_]] = js.native
  def waitFor(event: event | eventNS, filter: WaitForFilter): CancelablePromise[js.Array[_]] = js.native
  def waitFor(event: event | eventNS, options: WaitForOptions): CancelablePromise[js.Array[_]] = js.native
  def waitFor(event: event | eventNS, timeout: Double): CancelablePromise[js.Array[_]] = js.native
}
/* static members */
@JSImport("eventemitter2", "EventEmitter2")
@js.native
object EventEmitter2 extends js.Object {
  
  var defaultMaxListeners: Double = js.native
  
  def once(emitter: EventEmitter2, event: event | eventNS): CancelablePromise[js.Array[_]] = js.native
  def once(emitter: EventEmitter2, event: event | eventNS, options: OnceOptions): CancelablePromise[js.Array[_]] = js.native
}
