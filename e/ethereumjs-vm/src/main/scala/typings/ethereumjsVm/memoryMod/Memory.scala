package typings.ethereumjsVm.memoryMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Memory extends js.Object {
  
  var _store: js.Array[Double] = js.native
  
  /**
    * Extends the memory given an offset and size. Rounds extended
    * memory to word-size.
    */
  def extend(offset: Double, size: Double): Unit = js.native
  
  /**
    * Reads a slice of memory from `offset` till `offset + size` as a `Buffer`.
    * It fills up the difference between memory's length and `offset + size` with zeros.
    * @param offset - Starting position
    * @param size - How many bytes to read
    */
  def read(offset: Double, size: Double): Buffer = js.native
  
  /**
    * Writes a byte array with length `size` to memory, starting from `offset`.
    * @param offset - Starting position
    * @param size - How many bytes to write
    * @param value - Value
    */
  def write(offset: Double, size: Double, value: Buffer): Unit = js.native
}
object Memory {
  
  @scala.inline
  def apply(
    _store: js.Array[Double],
    extend: (Double, Double) => Unit,
    read: (Double, Double) => Buffer,
    write: (Double, Double, Buffer) => Unit
  ): Memory = {
    val __obj = js.Dynamic.literal(_store = _store.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), read = js.Any.fromFunction2(read), write = js.Any.fromFunction3(write))
    __obj.asInstanceOf[Memory]
  }
  
  @scala.inline
  implicit class MemoryOps[Self <: Memory] (val x: Self) extends AnyVal {
    
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
    def set_storeVarargs(value: Double*): Self = this.set("_store", js.Array(value :_*))
    
    @scala.inline
    def set_store(value: js.Array[Double]): Self = this.set("_store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtend(value: (Double, Double) => Unit): Self = this.set("extend", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRead(value: (Double, Double) => Buffer): Self = this.set("read", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrite(value: (Double, Double, Buffer) => Unit): Self = this.set("write", js.Any.fromFunction3(value))
  }
}
