package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Relocates machine code for arm.
  */
@js.native
trait ThumbRelocator extends js.Object {
  
  /**
    * Copies out the next buffered instruction without advancing the
    * output cursor, allowing the same instruction to be written out
    * multiple times.
    */
  def copyOne(): Boolean = js.native
  
  /**
    * Eagerly cleans up memory.
    */
  def dispose(): Unit = js.native
  
  /**
    * Indicates whether end-of-block has been reached, i.e. we've
    * reached a branch of any kind, like CALL, JMP, BL, RET.
    */
  var eob: Boolean = js.native
  
  /**
    * Indicates whether end-of-input has been reached, e.g. we've
    * reached JMP/B/RET, an instruction after which there may or may
    * not be valid code.
    */
  var eoi: Boolean = js.native
  
  /**
    * Latest `Instruction` read so far. Starts out `null` and changes
    * on every call to `readOne()`.
    */
  var input: Instruction | Null = js.native
  
  /**
    * Peeks at the next `Instruction` to be written or skipped.
    */
  def peekNextWriteInsn(): Instruction | Null = js.native
  
  /**
    * Peeks at the address of the next instruction to be written or skipped.
    */
  def peekNextWriteSource(): NativePointer = js.native
  
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
  def readOne(): Double = js.native
  
  /**
    * Recycles instance.
    */
  def reset(inputCode: NativePointerValue, output: ThumbWriter): Unit = js.native
  
  /**
    * Skips the instruction that would have been written next.
    */
  def skipOne(): Unit = js.native
  
  /**
    * Writes all buffered instructions.
    */
  def writeAll(): Unit = js.native
  
  /**
    * Writes the next buffered instruction.
    */
  def writeOne(): Boolean = js.native
}
object ThumbRelocator {
  
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(copyOne = js.Any.fromFunction0(copyOne), dispose = js.Any.fromFunction0(dispose), eob = eob.asInstanceOf[js.Any], eoi = eoi.asInstanceOf[js.Any], peekNextWriteInsn = js.Any.fromFunction0(peekNextWriteInsn), peekNextWriteSource = js.Any.fromFunction0(peekNextWriteSource), readOne = js.Any.fromFunction0(readOne), reset = js.Any.fromFunction2(reset), skipOne = js.Any.fromFunction0(skipOne), writeAll = js.Any.fromFunction0(writeAll), writeOne = js.Any.fromFunction0(writeOne))
    __obj.asInstanceOf[ThumbRelocator]
  }
  
  @scala.inline
  implicit class ThumbRelocatorOps[Self <: ThumbRelocator] (val x: Self) extends AnyVal {
    
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
    def setCopyOne(value: () => Boolean): Self = this.set("copyOne", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEob(value: Boolean): Self = this.set("eob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEoi(value: Boolean): Self = this.set("eoi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeekNextWriteInsn(value: () => Instruction | Null): Self = this.set("peekNextWriteInsn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPeekNextWriteSource(value: () => NativePointer): Self = this.set("peekNextWriteSource", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadOne(value: () => Double): Self = this.set("readOne", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: (NativePointerValue, ThumbWriter) => Unit): Self = this.set("reset", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSkipOne(value: () => Unit): Self = this.set("skipOne", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWriteAll(value: () => Unit): Self = this.set("writeAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWriteOne(value: () => Boolean): Self = this.set("writeOne", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInput(value: Instruction): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputNull: Self = this.set("input", null)
  }
}
