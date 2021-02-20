package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayBuffer extends StObject {
  
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
  implicit class ArrayBufferMutableBuilder[Self <: ArrayBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnwrap(value: () => NativePointer): Self = StObject.set(x, "unwrap", js.Any.fromFunction0(value))
  }
}
