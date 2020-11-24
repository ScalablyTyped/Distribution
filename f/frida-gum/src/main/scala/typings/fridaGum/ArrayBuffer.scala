package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayBuffer extends js.Object {
  
  /**
    * Gets a pointer to the base address of the ArrayBuffer's backing store.
    * It is the caller's responsibility to keep the buffer alive while the
    * backing store is still being used.
    */
  def unwrap(): NativePointer = js.native
}
object ArrayBuffer {
  
  @scala.inline
  def apply(unwrap: () => NativePointer): ArrayBuffer = {
    val __obj = js.Dynamic.literal(unwrap = js.Any.fromFunction0(unwrap))
    __obj.asInstanceOf[ArrayBuffer]
  }
  
  @scala.inline
  implicit class ArrayBufferOps[Self <: ArrayBuffer] (val x: Self) extends AnyVal {
    
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
    def setUnwrap(value: () => NativePointer): Self = this.set("unwrap", js.Any.fromFunction0(value))
  }
}
