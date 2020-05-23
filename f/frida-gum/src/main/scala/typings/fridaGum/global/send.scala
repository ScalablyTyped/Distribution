package typings.fridaGum.global

import typings.fridaGum.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("send")
@js.native
object send extends js.Object {
  /**
    * Sends a JSON-serializable message to your Frida-based application,
    * with (optionally) some raw binary data included. The latter is useful
    * if you e.g. dumped some memory using `NativePointer#readByteArray()`.
    *
    * @param message Any JSON-serializable value.
    * @param data Raw binary data.
    */
  def apply(message: js.Any): Unit = js.native
  def apply(message: js.Any, data: js.Array[Double]): Unit = js.native
  def apply(message: js.Any, data: ArrayBuffer): Unit = js.native
}

