package typings.ethereumjsVm

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoryMod {
  
  @JSImport("ethereumjs-vm/dist/evm/memory", JSImport.Default)
  @js.native
  class default () extends Memory
  
  @js.native
  trait Memory extends StObject {
    
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
    implicit class MemoryMutableBuilder[Self <: Memory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtend(value: (Double, Double) => Unit): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRead(value: (Double, Double) => Buffer): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWrite(value: (Double, Double, Buffer) => Unit): Self = StObject.set(x, "write", js.Any.fromFunction3(value))
      
      @scala.inline
      def set_store(value: js.Array[Double]): Self = StObject.set(x, "_store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_storeVarargs(value: Double*): Self = StObject.set(x, "_store", js.Array(value :_*))
    }
  }
}
