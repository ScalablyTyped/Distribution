package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Relocates machine code for arm.
  */
trait ThumbRelocator extends StObject {
  
  /**
    * Copies out the next buffered instruction without advancing the
    * output cursor, allowing the same instruction to be written out
    * multiple times.
    */
  def copyOne(): Boolean
  
  /**
    * Eagerly cleans up memory.
    */
  def dispose(): Unit
  
  /**
    * Indicates whether end-of-block has been reached, i.e. we've
    * reached a branch of any kind, like CALL, JMP, BL, RET.
    */
  var eob: Boolean
  
  /**
    * Indicates whether end-of-input has been reached, e.g. we've
    * reached JMP/B/RET, an instruction after which there may or may
    * not be valid code.
    */
  var eoi: Boolean
  
  /**
    * Latest `Instruction` read so far. Starts out `null` and changes
    * on every call to `readOne()`.
    */
  var input: Instruction | Null
  
  /**
    * Peeks at the next `Instruction` to be written or skipped.
    */
  def peekNextWriteInsn(): Instruction | Null
  
  /**
    * Peeks at the address of the next instruction to be written or skipped.
    */
  def peekNextWriteSource(): NativePointer
  
  /**
    * Reads the next instruction into the relocator's internal buffer
    * and returns the number of bytes read so far, including previous
    * calls.
    *
    * You may keep calling this method to keep buffering, or immediately
    * call either `writeOne()` or `skipOne()`. Or, you can buffer up
    * until the desired point and then call `writeAll()`.
    *
    * Returns zero when end-of-input is reached, which means the `eoi`
    * property is now `true`.
    */
  def readOne(): Double
  
  /**
    * Recycles instance.
    */
  def reset(inputCode: NativePointerValue, output: ThumbWriter): Unit
  
  /**
    * Skips the instruction that would have been written next.
    */
  def skipOne(): Unit
  
  /**
    * Writes all buffered instructions.
    */
  def writeAll(): Unit
  
  /**
    * Writes the next buffered instruction.
    */
  def writeOne(): Boolean
}
object ThumbRelocator {
  
  inline def apply(
    copyOne: () => Boolean,
    dispose: () => Unit,
    eob: Boolean,
    eoi: Boolean,
    peekNextWriteInsn: () => Instruction | Null,
    peekNextWriteSource: () => NativePointer,
    readOne: () => Double,
    reset: (NativePointerValue, ThumbWriter) => Unit,
    skipOne: () => Unit,
    writeAll: () => Unit,
    writeOne: () => Boolean
  ): ThumbRelocator = {
    val __obj = js.Dynamic.literal(copyOne = js.Any.fromFunction0(copyOne), dispose = js.Any.fromFunction0(dispose), eob = eob.asInstanceOf[js.Any], eoi = eoi.asInstanceOf[js.Any], peekNextWriteInsn = js.Any.fromFunction0(peekNextWriteInsn), peekNextWriteSource = js.Any.fromFunction0(peekNextWriteSource), readOne = js.Any.fromFunction0(readOne), reset = js.Any.fromFunction2(reset), skipOne = js.Any.fromFunction0(skipOne), writeAll = js.Any.fromFunction0(writeAll), writeOne = js.Any.fromFunction0(writeOne), input = null)
    __obj.asInstanceOf[ThumbRelocator]
  }
  
  extension [Self <: ThumbRelocator](x: Self) {
    
    inline def setCopyOne(value: () => Boolean): Self = StObject.set(x, "copyOne", js.Any.fromFunction0(value))
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setEob(value: Boolean): Self = StObject.set(x, "eob", value.asInstanceOf[js.Any])
    
    inline def setEoi(value: Boolean): Self = StObject.set(x, "eoi", value.asInstanceOf[js.Any])
    
    inline def setInput(value: Instruction): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputNull: Self = StObject.set(x, "input", null)
    
    inline def setPeekNextWriteInsn(value: () => Instruction | Null): Self = StObject.set(x, "peekNextWriteInsn", js.Any.fromFunction0(value))
    
    inline def setPeekNextWriteSource(value: () => NativePointer): Self = StObject.set(x, "peekNextWriteSource", js.Any.fromFunction0(value))
    
    inline def setReadOne(value: () => Double): Self = StObject.set(x, "readOne", js.Any.fromFunction0(value))
    
    inline def setReset(value: (NativePointerValue, ThumbWriter) => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction2(value))
    
    inline def setSkipOne(value: () => Unit): Self = StObject.set(x, "skipOne", js.Any.fromFunction0(value))
    
    inline def setWriteAll(value: () => Unit): Self = StObject.set(x, "writeAll", js.Any.fromFunction0(value))
    
    inline def setWriteOne(value: () => Boolean): Self = StObject.set(x, "writeOne", js.Any.fromFunction0(value))
  }
}
