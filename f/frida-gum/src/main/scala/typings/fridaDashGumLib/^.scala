package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * Short-hand for `ptr("0")`.
    */
  val NULL: NativePointer = js.native
  val NativeFunction: NativeFunctionConstructor = js.native
  val SystemFunction: SystemFunctionConstructor = js.native
  /**
    * Cancels a previously scheduled `clearImmediate()`.
    */
  def clearImmediate(id: ImmediateId): scala.Unit = js.native
  /**
    * Cancels a previously scheduled `setInterval()`.
    */
  def clearInterval(id: IntervalId): scala.Unit = js.native
  /**
    * Cancels a previously scheduled `setTimeout()`.
    */
  def clearTimeout(id: TimeoutId): scala.Unit = js.native
  /**
    * Forces garbage collection.
    *
    * Useful for testing `WeakRef.bind()` logic, but also sometimes needed when
    * using the Duktape runtime and its default GC heuristics proving a bit too
    * lazy.
    */
  def gc(): scala.Unit = js.native
  def hexdump(target: NativePointerValue): java.lang.String = js.native
  def hexdump(target: NativePointerValue, options: HexdumpOptions): java.lang.String = js.native
  def hexdump(target: stdLib.ArrayBuffer): java.lang.String = js.native
  def hexdump(target: stdLib.ArrayBuffer, options: HexdumpOptions): java.lang.String = js.native
  /**
    * Short-hand for `new Int64(value)`.
    */
  def int64(value: java.lang.String): Int64 = js.native
  def int64(value: scala.Double): Int64 = js.native
  /**
    * Short-hand for `new NativePointer(value)`.
    */
  def ptr(value: java.lang.String): NativePointer = js.native
  def ptr(value: scala.Double): NativePointer = js.native
  /**
    * Requests callback to be called on the next message received from your Frida-based application.
    *
    * This will only give you one message, so you need to call `recv()` again to receive the next one.
    */
  def recv(callback: MessageCallback): MessageRecvOperation = js.native
  /**
    * Requests callback to be called when the next message of the given `type` has been received from your
    * Frida-based application.
    *
    * This will only give you one message, so you need to call `recv()` again to receive the next one.
    */
  def recv(`type`: java.lang.String, callback: MessageCallback): MessageRecvOperation = js.native
  /**
    * Sends a JSON-serializable message to your Frida-based application,
    * with (optionally) some raw binary data included. The latter is useful
    * if you e.g. dumped some memory using `NativePointer#readByteArray()`.
    *
    * @param message Any JSON-serializable value.
    * @param data Raw binary data.
    */
  def send(message: js.Any): scala.Unit = js.native
  def send(message: js.Any, data: js.Array[scala.Double]): scala.Unit = js.native
  def send(message: js.Any, data: stdLib.ArrayBuffer): scala.Unit = js.native
  /**
    * Schedules `func` to be called on Frida's JavaScript thread, optionally passing it the provided params.
    * Returns an id that can be passed to clearImmediate() to cancel it.
    */
  def setImmediate(func: ScheduledCallback, params: js.Any*): ImmediateId = js.native
  /**
    * Calls `func` every `delay` milliseconds, optionally passing it the provided params.
    * Returns an id that can be passed to clearInterval() to cancel it.
    */
  def setInterval(func: ScheduledCallback, delay: scala.Double, params: js.Any*): IntervalId = js.native
  /**
    * Calls `func` after `delay` milliseconds, or if omitted: as soon as Frida's
    * JavaScript thread is idle. Any additional `params` are passed along.
    *
    * Returns an id that can be passed to `clearTimeout()` to cancel it.
    */
  def setTimeout(func: ScheduledCallback): TimeoutId = js.native
  def setTimeout(func: ScheduledCallback, delay: scala.Double, params: js.Any*): TimeoutId = js.native
  /**
    * Short-hand for `new UInt64(value)`.
    */
  def uint64(value: java.lang.String): UInt64 = js.native
  def uint64(value: scala.Double): UInt64 = js.native
}

