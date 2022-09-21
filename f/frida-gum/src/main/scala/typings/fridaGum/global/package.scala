package typings.fridaGum.global

import typings.fridaGum.ArrayBuffer
import typings.fridaGum.HexdumpOptions
import typings.fridaGum.ImmediateId
import typings.fridaGum.Int64
import typings.fridaGum.IntervalId
import typings.fridaGum.MessageCallback
import typings.fridaGum.MessageRecvOperation
import typings.fridaGum.NativePointerValue
import typings.fridaGum.ScheduledCallback
import typings.fridaGum.TimeoutId
import typings.fridaGum.UInt64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Short-hand for `ptr("0")`.
  */
inline def NULL: typings.fridaGum.NativePointer = js.Dynamic.global.selectDynamic("NULL").asInstanceOf[typings.fridaGum.NativePointer]

/**
  * Cancels a previously scheduled `clearImmediate()`.
  */
inline def clearImmediate(id: ImmediateId): Unit = js.Dynamic.global.applyDynamic("clearImmediate")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Cancels a previously scheduled `setInterval()`.
  */
inline def clearInterval(id: IntervalId): Unit = js.Dynamic.global.applyDynamic("clearInterval")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Cancels a previously scheduled `setTimeout()`.
  */
inline def clearTimeout(id: TimeoutId): Unit = js.Dynamic.global.applyDynamic("clearTimeout")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def hexdump(target: ArrayBuffer): String = js.Dynamic.global.applyDynamic("hexdump")(target.asInstanceOf[js.Any]).asInstanceOf[String]
inline def hexdump(target: ArrayBuffer, options: HexdumpOptions): String = (js.Dynamic.global.applyDynamic("hexdump")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
inline def hexdump(target: NativePointerValue): String = js.Dynamic.global.applyDynamic("hexdump")(target.asInstanceOf[js.Any]).asInstanceOf[String]
inline def hexdump(target: NativePointerValue, options: HexdumpOptions): String = (js.Dynamic.global.applyDynamic("hexdump")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

/**
  * Short-hand for `new Int64(value)`.
  */
inline def int64(value: String): Int64 = js.Dynamic.global.applyDynamic("int64")(value.asInstanceOf[js.Any]).asInstanceOf[Int64]
inline def int64(value: Double): Int64 = js.Dynamic.global.applyDynamic("int64")(value.asInstanceOf[js.Any]).asInstanceOf[Int64]

/**
  * Short-hand for `new NativePointer(value)`.
  */
inline def ptr(value: String): typings.fridaGum.NativePointer = js.Dynamic.global.applyDynamic("ptr")(value.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.NativePointer]
inline def ptr(value: Double): typings.fridaGum.NativePointer = js.Dynamic.global.applyDynamic("ptr")(value.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.NativePointer]

/**
  * Requests callback to be called on the next message received from your Frida-based application.
  *
  * This will only give you one message, so you need to call `recv()` again to receive the next one.
  */
inline def recv(callback: MessageCallback): MessageRecvOperation = js.Dynamic.global.applyDynamic("recv")(callback.asInstanceOf[js.Any]).asInstanceOf[MessageRecvOperation]
/**
  * Requests callback to be called when the next message of the given `type` has been received from your
  * Frida-based application.
  *
  * This will only give you one message, so you need to call `recv()` again to receive the next one.
  */
inline def recv(`type`: String, callback: MessageCallback): MessageRecvOperation = (js.Dynamic.global.applyDynamic("recv")(`type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MessageRecvOperation]

/**
  * Sends a JSON-serializable message to your Frida-based application,
  * with (optionally) some raw binary data included. The latter is useful
  * if you e.g. dumped some memory using `NativePointer#readByteArray()`.
  *
  * @param message Any JSON-serializable value.
  * @param data Raw binary data.
  */
inline def send(message: Any): Unit = js.Dynamic.global.applyDynamic("send")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def send(message: Any, data: js.Array[Double]): Unit = (js.Dynamic.global.applyDynamic("send")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def send(message: Any, data: ArrayBuffer): Unit = (js.Dynamic.global.applyDynamic("send")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Schedules `func` to be called on Frida's JavaScript thread, optionally passing it the provided params.
  * Returns an id that can be passed to clearImmediate() to cancel it.
  */
inline def setImmediate(func: ScheduledCallback, params: Any*): ImmediateId = js.Dynamic.global.applyDynamic("setImmediate")(List(func.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[ImmediateId]

/**
  * Calls `func` every `delay` milliseconds, optionally passing it the provided params.
  * Returns an id that can be passed to clearInterval() to cancel it.
  */
inline def setInterval(func: ScheduledCallback, delay: Double, params: Any*): IntervalId = (js.Dynamic.global.applyDynamic("setInterval")((List(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).`++`(params.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[IntervalId]

/**
  * Calls `func` after `delay` milliseconds, or if omitted: as soon as Frida's
  * JavaScript thread is idle. Any additional `params` are passed along.
  *
  * Returns an id that can be passed to `clearTimeout()` to cancel it.
  */
inline def setTimeout(func: ScheduledCallback, delay: Double, params: Any*): TimeoutId = (js.Dynamic.global.applyDynamic("setTimeout")((List(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).`++`(params.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[TimeoutId]
inline def setTimeout(func: ScheduledCallback, delay: Unit, params: Any*): TimeoutId = (js.Dynamic.global.applyDynamic("setTimeout")((List(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).`++`(params.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[TimeoutId]

/**
  * Short-hand for `new UInt64(value)`.
  */
inline def uint64(value: String): UInt64 = js.Dynamic.global.applyDynamic("uint64")(value.asInstanceOf[js.Any]).asInstanceOf[UInt64]
inline def uint64(value: Double): UInt64 = js.Dynamic.global.applyDynamic("uint64")(value.asInstanceOf[js.Any]).asInstanceOf[UInt64]
