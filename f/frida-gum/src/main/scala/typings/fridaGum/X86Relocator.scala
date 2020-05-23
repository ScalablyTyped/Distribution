package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Relocates machine code for x86.
  */
trait X86Relocator extends js.Object {
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
    * Eagerly cleans up memory.
    */
  def dispose(): Unit
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
  def reset(inputCode: NativePointerValue, output: X86Writer): Unit
  /**
    * Skips the instruction that would have been written next.
    */
  def skipOne(): Unit
  /**
    * Skips the instruction that would have been written next,
    * but without a label for internal use. This breaks relocation of branches to
    * locations inside the relocated range, and is an optimization for use-cases
    * where all branches are rewritten (e.g. Frida's Stalker).
    */
  def skipOneNoLabel(): Unit
  /**
    * Writes all buffered instructions.
    */
  def writeAll(): Unit
  /**
    * Writes the next buffered instruction.
    */
  def writeOne(): Boolean
  /**
    * Writes the next buffered instruction, but without a
    * label for internal use. This breaks relocation of branches to locations
    * inside the relocated range, and is an optimization for use-cases where all
    * branches are rewritten (e.g. Frida's Stalker).
    */
  def writeOneNoLabel(): Boolean
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
    writeOneNoLabel: () => Boolean,
    input: Instruction = null
  ): X86Relocator = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), eob = eob.asInstanceOf[js.Any], eoi = eoi.asInstanceOf[js.Any], peekNextWriteInsn = js.Any.fromFunction0(peekNextWriteInsn), peekNextWriteSource = js.Any.fromFunction0(peekNextWriteSource), readOne = js.Any.fromFunction0(readOne), reset = js.Any.fromFunction2(reset), skipOne = js.Any.fromFunction0(skipOne), skipOneNoLabel = js.Any.fromFunction0(skipOneNoLabel), writeAll = js.Any.fromFunction0(writeAll), writeOne = js.Any.fromFunction0(writeOne), writeOneNoLabel = js.Any.fromFunction0(writeOneNoLabel), input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[X86Relocator]
  }
}

