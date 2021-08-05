package typings.fridaGum.global

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
inline def clearImmediate(id: typings.fridaGum.ImmediateId): scala.Unit = js.Dynamic.global.applyDynamic("clearImmediate")(id.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * Cancels a previously scheduled `setInterval()`.
  */
inline def clearInterval(id: typings.fridaGum.IntervalId): scala.Unit = js.Dynamic.global.applyDynamic("clearInterval")(id.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * Cancels a previously scheduled `setTimeout()`.
  */
inline def clearTimeout(id: typings.fridaGum.TimeoutId): scala.Unit = js.Dynamic.global.applyDynamic("clearTimeout")(id.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * Forces garbage collection.
  *
  * Useful for testing `WeakRef.bind()` logic, but also sometimes needed when
  * using the Duktape runtime and its default GC heuristics proving a bit too
  * lazy.
  */
inline def gc(): scala.Unit = js.Dynamic.global.applyDynamic("gc")().asInstanceOf[scala.Unit]

inline def hexdump(target: typings.fridaGum.ArrayBuffer): java.lang.String = js.Dynamic.global.applyDynamic("hexdump")(target.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def hexdump(target: typings.fridaGum.ArrayBuffer, options: typings.fridaGum.HexdumpOptions): java.lang.String = (js.Dynamic.global.applyDynamic("hexdump")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def hexdump(target: typings.fridaGum.NativePointerValue): java.lang.String = js.Dynamic.global.applyDynamic("hexdump")(target.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def hexdump(target: typings.fridaGum.NativePointerValue, options: typings.fridaGum.HexdumpOptions): java.lang.String = (js.Dynamic.global.applyDynamic("hexdump")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

/**
  * Short-hand for `new Int64(value)`.
  */
inline def int64(value: java.lang.String): typings.fridaGum.Int64 = js.Dynamic.global.applyDynamic("int64")(value.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.Int64]
inline def int64(value: scala.Double): typings.fridaGum.Int64 = js.Dynamic.global.applyDynamic("int64")(value.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.Int64]

/**
  * Short-hand for `new NativePointer(value)`.
  */
inline def ptr(value: java.lang.String): typings.fridaGum.NativePointer = js.Dynamic.global.applyDynamic("ptr")(value.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.NativePointer]
inline def ptr(value: scala.Double): typings.fridaGum.NativePointer = js.Dynamic.global.applyDynamic("ptr")(value.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.NativePointer]

/**
  * Requests callback to be called on the next message received from your Frida-based application.
  *
  * This will only give you one message, so you need to call `recv()` again to receive the next one.
  */
inline def recv(callback: typings.fridaGum.MessageCallback): typings.fridaGum.MessageRecvOperation = js.Dynamic.global.applyDynamic("recv")(callback.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.MessageRecvOperation]
/**
  * Requests callback to be called when the next message of the given `type` has been received from your
  * Frida-based application.
  *
  * This will only give you one message, so you need to call `recv()` again to receive the next one.
  */
inline def recv(`type`: java.lang.String, callback: typings.fridaGum.MessageCallback): typings.fridaGum.MessageRecvOperation = (js.Dynamic.global.applyDynamic("recv")(`type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.fridaGum.MessageRecvOperation]

/**
  * Sends a JSON-serializable message to your Frida-based application,
  * with (optionally) some raw binary data included. The latter is useful
  * if you e.g. dumped some memory using `NativePointer#readByteArray()`.
  *
  * @param message Any JSON-serializable value.
  * @param data Raw binary data.
  */
inline def send(message: js.Any): scala.Unit = js.Dynamic.global.applyDynamic("send")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
inline def send(message: js.Any, data: js.Array[scala.Double]): scala.Unit = (js.Dynamic.global.applyDynamic("send")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def send(message: js.Any, data: typings.fridaGum.ArrayBuffer): scala.Unit = (js.Dynamic.global.applyDynamic("send")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/**
  * Schedules `func` to be called on Frida's JavaScript thread, optionally passing it the provided params.
  * Returns an id that can be passed to clearImmediate() to cancel it.
  */
inline def setImmediate(func: typings.fridaGum.ScheduledCallback, params: js.Any*): typings.fridaGum.ImmediateId = (js.Dynamic.global.applyDynamic("setImmediate")(func.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.fridaGum.ImmediateId]

/**
  * Calls `func` every `delay` milliseconds, optionally passing it the provided params.
  * Returns an id that can be passed to clearInterval() to cancel it.
  */
inline def setInterval(func: typings.fridaGum.ScheduledCallback, delay: scala.Double, params: js.Any*): typings.fridaGum.IntervalId = (js.Dynamic.global.applyDynamic("setInterval")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.fridaGum.IntervalId]

/**
  * Calls `func` after `delay` milliseconds, or if omitted: as soon as Frida's
  * JavaScript thread is idle. Any additional `params` are passed along.
  *
  * Returns an id that can be passed to `clearTimeout()` to cancel it.
  */
inline def setTimeout(func: typings.fridaGum.ScheduledCallback, delay: scala.Double, params: js.Any*): typings.fridaGum.TimeoutId = (js.Dynamic.global.applyDynamic("setTimeout")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.fridaGum.TimeoutId]
inline def setTimeout(func: typings.fridaGum.ScheduledCallback, delay: scala.Unit, params: js.Any*): typings.fridaGum.TimeoutId = (js.Dynamic.global.applyDynamic("setTimeout")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.fridaGum.TimeoutId]

/**
  * Short-hand for `new UInt64(value)`.
  */
inline def uint64(value: java.lang.String): typings.fridaGum.UInt64 = js.Dynamic.global.applyDynamic("uint64")(value.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.UInt64]
inline def uint64(value: scala.Double): typings.fridaGum.UInt64 = js.Dynamic.global.applyDynamic("uint64")(value.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.UInt64]
