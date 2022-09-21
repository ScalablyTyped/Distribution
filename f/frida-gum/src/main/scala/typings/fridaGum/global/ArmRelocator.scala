package typings.fridaGum.global

import typings.fridaGum.NativePointerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Relocates machine code for arm.
  */
@JSGlobal("ArmRelocator")
@js.native
open class ArmRelocator protected ()
  extends StObject
     with typings.fridaGum.ArmRelocator {
  /**
    * Creates a new code relocator for copying ARM instructions
    * from one memory location to another, taking care to adjust
    * position-dependent instructions accordingly.
    *
    * @param inputCode Source address to copy instructions from.
    * @param output ArmWriter pointed at the desired target memory
    *               address.
    */
  def this(inputCode: NativePointerValue, output: typings.fridaGum.ArmWriter) = this()
  
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
  override def reset(inputCode: NativePointerValue, output: typings.fridaGum.ArmWriter): Unit = js.native
  
  /**
    * Skips the instruction that would have been written next.
    */
  /* CompleteClass */
  override def skipOne(): Unit = js.native
  
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
}
