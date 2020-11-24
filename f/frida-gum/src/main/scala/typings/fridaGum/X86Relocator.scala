package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Relocates machine code for x86.
  */
@js.native
trait X86Relocator extends js.Object {
  
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
  def reset(inputCode: NativePointerValue, output: X86Writer): Unit = js.native
  
  /**
    * Skips the instruction that would have been written next.
    */
  def skipOne(): Unit = js.native
  
  /**
    * Skips the instruction that would have been written next,
    * but without a label for internal use. This breaks relocation of branches to
    * locations inside the relocated range, and is an optimization for use-cases
    * where all branches are rewritten (e.g. Frida's Stalker).
    */
  def skipOneNoLabel(): Unit = js.native
  
  /**
    * Writes all buffered instructions.
    */
  def writeAll(): Unit = js.native
  
  /**
    * Writes the next buffered instruction.
    */
  def writeOne(): Boolean = js.native
  
  /**
    * Writes the next buffered instruction, but without a
    * label for internal use. This breaks relocation of branches to locations
    * inside the relocated range, and is an optimization for use-cases where all
    * branches are rewritten (e.g. Frida's Stalker).
    */
  def writeOneNoLabel(): Boolean = js.native
}
object X86Relocator {
  
  @scala.inline
  def apply(
    dispose: () => Unit,
    eob: Boolean,
    eoi: Boolean,
    peekNextWriteInsn: () => Instruction | Null,
    peekNextWriteSource: () => NativePointer,
    readOne: () => Double,
    reset: (NativePointerValue, X86Writer) => Unit,
    skipOne: () => Unit,
    skipOneNoLabel: () => Unit,
    writeAll: () => Unit,
    writeOne: () => Boolean,
    writeOneNoLabel: () => Boolean
  ): X86Relocator = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), eob = eob.asInstanceOf[js.Any], eoi = eoi.asInstanceOf[js.Any], peekNextWriteInsn = js.Any.fromFunction0(peekNextWriteInsn), peekNextWriteSource = js.Any.fromFunction0(peekNextWriteSource), readOne = js.Any.fromFunction0(readOne), reset = js.Any.fromFunction2(reset), skipOne = js.Any.fromFunction0(skipOne), skipOneNoLabel = js.Any.fromFunction0(skipOneNoLabel), writeAll = js.Any.fromFunction0(writeAll), writeOne = js.Any.fromFunction0(writeOne), writeOneNoLabel = js.Any.fromFunction0(writeOneNoLabel))
    __obj.asInstanceOf[X86Relocator]
  }
  
  @scala.inline
  implicit class X86RelocatorOps[Self <: X86Relocator] (val x: Self) extends AnyVal {
    
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
    def setReset(value: (NativePointerValue, X86Writer) => Unit): Self = this.set("reset", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSkipOne(value: () => Unit): Self = this.set("skipOne", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSkipOneNoLabel(value: () => Unit): Self = this.set("skipOneNoLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWriteAll(value: () => Unit): Self = this.set("writeAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWriteOne(value: () => Boolean): Self = this.set("writeOne", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWriteOneNoLabel(value: () => Boolean): Self = this.set("writeOneNoLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInput(value: Instruction): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputNull: Self = this.set("input", null)
  }
}
