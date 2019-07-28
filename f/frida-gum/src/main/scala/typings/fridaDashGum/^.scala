package typings.fridaDashGum

import typings.std.ArrayBuffer
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
  def clearImmediate(id: ImmediateId): Unit = js.native
  /**
    * Cancels a previously scheduled `setInterval()`.
    */
  def clearInterval(id: IntervalId): Unit = js.native
  /**
    * Cancels a previously scheduled `setTimeout()`.
    */
  def clearTimeout(id: TimeoutId): Unit = js.native
  /**
    * Forces garbage collection.
    *
    * Useful for testing `WeakRef.bind()` logic, but also sometimes needed when
    * using the Duktape runtime and its default GC heuristics proving a bit too
    * lazy.
    */
  def gc(): Unit = js.native
  def hexdump(target: NativePointerValue): String = js.native
  def hexdump(target: NativePointerValue, options: HexdumpOptions): String = js.native
  def hexdump(target: ArrayBuffer): String = js.native
  def hexdump(target: ArrayBuffer, options: HexdumpOptions): String = js.native
  /**
    * Short-hand for `new Int64(value)`.
    */
  def int64(value: String): Int64 = js.native
  def int64(value: Double): Int64 = js.native
  /**
    * Short-hand for `new NativePointer(value)`.
    */
  def ptr(value: String): NativePointer = js.native
  def ptr(value: Double): NativePointer = js.native
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
  def recv(`type`: String, callback: MessageCallback): MessageRecvOperation = js.native
  /**
    * Sends a JSON-serializable message to your Frida-based application,
    * with (optionally) some raw binary data included. The latter is useful
    * if you e.g. dumped some memory using `NativePointer#readByteArray()`.
    *
    * @param message Any JSON-serializable value.
    * @param data Raw binary data.
    */
  def send(message: js.Any): Unit = js.native
  def send(message: js.Any, data: js.Array[Double]): Unit = js.native
  def send(message: js.Any, data: ArrayBuffer): Unit = js.native
  /**
    * Schedules `func` to be called on Frida's JavaScript thread, optionally passing it the provided params.
    * Returns an id that can be passed to clearImmediate() to cancel it.
    */
  def setImmediate(func: ScheduledCallback, params: js.Any*): ImmediateId = js.native
  /**
    * Calls `func` every `delay` milliseconds, optionally passing it the provided params.
    * Returns an id that can be passed to clearInterval() to cancel it.
    */
  def setInterval(func: ScheduledCallback, delay: Double, params: js.Any*): IntervalId = js.native
  /**
    * Calls `func` after `delay` milliseconds, or if omitted: as soon as Frida's
    * JavaScript thread is idle. Any additional `params` are passed along.
    *
    * Returns an id that can be passed to `clearTimeout()` to cancel it.
    */
  def setTimeout(func: ScheduledCallback): TimeoutId = js.native
  def setTimeout(func: ScheduledCallback, delay: Double, params: js.Any*): TimeoutId = js.native
  /**
    * Short-hand for `new UInt64(value)`.
    */
  def uint64(value: String): UInt64 = js.native
  def uint64(value: Double): UInt64 = js.native
}

