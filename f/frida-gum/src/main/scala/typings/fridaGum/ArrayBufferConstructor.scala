package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  def wrap(address: NativePointerValue, size: Double): ArrayBuffer = js.native
}
object ArrayBufferConstructor {
  
  @scala.inline
  def apply(wrap: (NativePointerValue, Double) => ArrayBuffer): ArrayBufferConstructor = {
    val __obj = js.Dynamic.literal(wrap = js.Any.fromFunction2(wrap))
    __obj.asInstanceOf[ArrayBufferConstructor]
  }
  
  @scala.inline
  implicit class ArrayBufferConstructorOps[Self <: ArrayBufferConstructor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWrap(value: (NativePointerValue, Double) => ArrayBuffer): Self = this.set("wrap", js.Any.fromFunction2(value))
  }
}
