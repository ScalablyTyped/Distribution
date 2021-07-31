package typings.fridaGum.global

import typings.fridaGum.NativePointerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Relocates machine code for x86.
  */
@JSGlobal("X86Relocator")
@js.native
class X86Relocator protected ()
  extends StObject
     with typings.fridaGum.X86Relocator {
  /**
    * Creates a new code relocator for copying x86 instructions
    * from one memory location to another, taking care to adjust
    * position-dependent instructions accordingly.
    *
    * @param inputCode Source address to copy instructions from.
    * @param output X86Writer pointed at the desired target memory
    *               address.
    */
  def this(inputCode: NativePointerValue, output: typings.fridaGum.X86Writer) = this()
  
  /**
    * Eagerly cleans up memory.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * Indicates whether end-of-block has been reached, i.e. we've
    * reached a branch of any kind, like CALL, JMP, BL, RET.
    */
  /* CompleteClass */
  var eob: Boolean = js.native
  
  /**
    * Indicates whether end-of-input has been reached, e.g. we've
    * reached JMP/B/RET, an instruction after which there may or may
    * not be valid code.
    */
  /* CompleteClass */
  var eoi: Boolean = js.native
  
  /**
    * Latest `Instruction` read so far. Starts out `null` and changes
    * on every call to `readOne()`.
    */
  /* CompleteClass */
  var input: typings.fridaGum.Instruction | Null = js.native
  
  /**
    * Peeks at the next `Instruction` to be written or skipped.
    */
  /* CompleteClass */
  override def peekNextWriteInsn(): typings.fridaGum.Instruction | Null = js.native
  
  /**
    * Peeks at the address of the next instruction to be written or skipped.
    */
  /* CompleteClass */
  override def peekNextWriteSource(): typings.fridaGum.NativePointer = js.native
  
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
  /* CompleteClass */
  override def readOne(): Double = js.native
  
  /**
    * Recycles instance.
    */
  /* CompleteClass */
  override def reset(inputCode: NativePointerValue, output: typings.fridaGum.X86Writer): Unit = js.native
  
  /**
    * Skips the instruction that would have been written next.
    */
  /* CompleteClass */
  override def skipOne(): Unit = js.native
  
  /**
    * Skips the instruction that would have been written next,
    * but without a label for internal use. This breaks relocation of branches to
    * locations inside the relocated range, and is an optimization for use-cases
    * where all branches are rewritten (e.g. Frida's Stalker).
    */
  /* CompleteClass */
  override def skipOneNoLabel(): Unit = js.native
  
  /**
    * Writes all buffered instructions.
    */
  /* CompleteClass */
  override def writeAll(): Unit = js.native
  
  /**
    * Writes the next buffered instruction.
    */
  /* CompleteClass */
  override def writeOne(): Boolean = js.native
  
  /**
    * Writes the next buffered instruction, but without a
    * label for internal use. This breaks relocation of branches to locations
    * inside the relocated range, and is an optimization for use-cases where all
    * branches are rewritten (e.g. Frida's Stalker).
    */
  /* CompleteClass */
  override def writeOneNoLabel(): Boolean = js.native
}
