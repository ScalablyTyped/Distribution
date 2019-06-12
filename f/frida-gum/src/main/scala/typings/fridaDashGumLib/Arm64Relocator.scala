package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Relocates machine code for arm64.
  */
@JSGlobal("Arm64Relocator")
@js.native
class Arm64Relocator protected () extends js.Object {
  /**
    * Creates a new code relocator for copying AArch64 instructions
    * from one memory location to another, taking care to adjust
    * position-dependent instructions accordingly.
    *
    * @param inputCode Source address to copy instructions from.
    * @param output Arm64Writer pointed at the desired target memory
    *               address.
    */
  def this(inputCode: NativePointerValue, output: Arm64Writer) = this()
  /**
    * Indicates whether end-of-block has been reached, i.e. we've
    * reached a branch of any kind, like CALL, JMP, BL, RET.
    */
  var eob: scala.Boolean = js.native
  /**
    * Indicates whether end-of-input has been reached, e.g. we've
    * reached JMP/B/RET, an instruction after which there may or may
    * not be valid code.
    */
  var eoi: scala.Boolean = js.native
  /**
    * Latest `Instruction` read so far. Starts out `null` and changes
    * on every call to `readOne()`.
    */
  var input: Instruction | scala.Null = js.native
  /**
    * Eagerly cleans up memory.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Peeks at the next `Instruction` to be written or skipped.
    */
  def peekNextWriteInsn(): Instruction | scala.Null = js.native
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
  def readOne(): scala.Double = js.native
  /**
    * Recycles instance.
    */
  def reset(inputCode: NativePointerValue, output: Arm64Writer): scala.Unit = js.native
  /**
    * Skips the instruction that would have been written next.
    */
  def skipOne(): scala.Unit = js.native
  /**
    * Writes all buffered instructions.
    */
  def writeAll(): scala.Unit = js.native
  /**
    * write the next buffered instruction.
    */
  def writeOne(): scala.Boolean = js.native
}

