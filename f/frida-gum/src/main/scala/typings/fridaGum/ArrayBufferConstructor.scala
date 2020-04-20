package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayBufferConstructor extends js.Object {
  /**
    * Creates an ArrayBuffer backed by an existing memory region. Unlike
    * the NativePointer `read*()` and `write*()` APIs, no validation is
    * performed on access, meaning a bad pointer will crash the process.
    *
    * @param address Base address of the region. Passing `NULL` will result
    *                in an empty buffer.
    * @param size Size of the region. Passing `0` will result in an empty
    *             buffer.
    */
  def wrap(address: NativePointerValue, size: Double): ArrayBuffer
}

object ArrayBufferConstructor {
  @scala.inline
  def apply(wrap: (NativePointerValue, Double) => ArrayBuffer): ArrayBufferConstructor = {
    val __obj = js.Dynamic.literal(wrap = js.Any.fromFunction2(wrap))
    __obj.asInstanceOf[ArrayBufferConstructor]
  }
}

