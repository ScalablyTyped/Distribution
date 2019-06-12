package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generates machine code for arm.
  */
@JSGlobal("ArmWriter")
@js.native
class ArmWriter protected () extends js.Object {
  /**
    * Creates a new code writer for generating ARM machine code
    * written directly to memory at `codeAddress`.
    *
    * @param codeAddress Memory address to write generated code to.
    * @param options Options for customizing code generation.
    */
  def this(codeAddress: NativePointerValue) = this()
  def this(codeAddress: NativePointerValue, options: ArmWriterOptions) = this()
  /**
    * Memory location of the first byte of output.
    */
  var base: NativePointer = js.native
  /**
    * Memory location of the next byte of output.
    */
  var code: NativePointer = js.native
  /**
    * Current offset in bytes.
    */
  var offset: scala.Double = js.native
  /**
    * Program counter at the next byte of output.
    */
  var pc: NativePointer = js.native
  /**
    * Eagerly cleans up memory.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Resolves label references and writes pending data to memory. You
    * should always call this once you've finished generating code. It
    * is usually also desirable to do this between pieces of unrelated
    * code, e.g. when generating multiple functions in one go.
    */
  def flush(): scala.Unit = js.native
  /**
    * Puts an ADD instruction.
    */
  def putAddRegRegImm(dstReg: ArmRegister, srcReg: ArmRegister, immVal: scala.Double): scala.Unit = js.native
  /**
    * Puts a B instruction.
    */
  def putBImm(target: NativePointerValue): scala.Unit = js.native
  /**
    * Puts a B instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putBLabel(labelId: java.lang.String): scala.Unit = js.native
  /**
    * Puts an OS/architecture-specific breakpoint instruction.
    */
  def putBreakpoint(): scala.Unit = js.native
  /**
    * Puts a BX instruction.
    */
  def putBxReg(reg: ArmRegister): scala.Unit = js.native
  def putBytes(data: java.lang.String): scala.Unit = js.native
  def putBytes(data: js.Array[scala.Double]): scala.Unit = js.native
  /**
    * Puts raw data.
    */
  def putBytes(data: stdLib.ArrayBuffer): scala.Unit = js.native
  /**
    * Puts a raw instruction.
    */
  def putInstruction(insn: scala.Double): scala.Unit = js.native
  /**
    * Puts a label at the current position, where `id` is an identifier
    * that may be referenced in past and future `put*Label()` calls.
    */
  def putLabel(id: java.lang.String): scala.Unit = js.native
  /**
    * Puts an LDR instruction.
    */
  def putLdrRegAddress(reg: ArmRegister, address: NativePointerValue): scala.Unit = js.native
  /**
    * Puts an LDR instruction.
    */
  def putLdrRegRegImm(dstReg: ArmRegister, srcReg: ArmRegister, immVal: scala.Double): scala.Unit = js.native
  /**
    * Puts an LDR instruction.
    */
  def putLdrRegU32(reg: ArmRegister, `val`: scala.Double): scala.Unit = js.native
  /**
    * Puts a NOP instruction.
    */
  def putNop(): scala.Unit = js.native
  /**
    * Recycles instance.
    */
  def reset(codeAddress: NativePointerValue): scala.Unit = js.native
  def reset(codeAddress: NativePointerValue, options: ArmWriterOptions): scala.Unit = js.native
  /**
    * Skips `nBytes`.
    */
  def skip(nBytes: scala.Double): scala.Unit = js.native
}

