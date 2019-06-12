package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generates machine code for mips.
  */
@JSGlobal("MipsWriter")
@js.native
class MipsWriter protected () extends js.Object {
  /**
    * Creates a new code writer for generating MIPS machine code
    * written directly to memory at `codeAddress`.
    *
    * @param codeAddress Memory address to write generated code to.
    * @param options Options for customizing code generation.
    */
  def this(codeAddress: NativePointerValue) = this()
  def this(codeAddress: NativePointerValue, options: MipsWriterOptions) = this()
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
    * Puts an ADDI instruction.
    */
  def putAddiRegImm(destReg: MipsRegister, imm: scala.Double): scala.Unit = js.native
  /**
    * Puts an ADDI instruction.
    */
  def putAddiRegRegImm(destReg: MipsRegister, leftReg: MipsRegister, imm: scala.Double): scala.Unit = js.native
  /**
    * Puts an ADDU instruction.
    */
  def putAdduRegRegReg(dstReg: MipsRegister, leftReg: MipsRegister, rightReg: MipsRegister): scala.Unit = js.native
  /**
    * Puts a B instruction.
    */
  def putBOffset(offset: scala.Double): scala.Unit = js.native
  /**
    * Puts a BEQ instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putBeqRegRegLabel(rightReg: MipsRegister, leftReg: MipsRegister, labelId: java.lang.String): scala.Unit = js.native
  /**
    * Puts a BREAK instruction.
    */
  def putBreak(): scala.Unit = js.native
  def putBytes(data: java.lang.String): scala.Unit = js.native
  def putBytes(data: js.Array[scala.Double]): scala.Unit = js.native
  /**
    * Puts raw data.
    */
  def putBytes(data: stdLib.ArrayBuffer): scala.Unit = js.native
  /**
    * Puts code needed for calling a C function with the specified `args`.
    */
  def putCallAddressWithArguments(func: NativePointerValue, args: js.Array[MipsCallArgument]): scala.Unit = js.native
  /**
    * Puts code needed for calling a C function with the specified `args`.
    */
  def putCallRegWithArguments(reg: MipsRegister, args: js.Array[MipsCallArgument]): scala.Unit = js.native
  /**
    * Puts a raw instruction.
    */
  def putInstruction(insn: scala.Double): scala.Unit = js.native
  /**
    * Puts a J instruction.
    */
  def putJAddress(address: NativePointerValue): scala.Unit = js.native
  /**
    * Puts a J instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putJLabel(labelId: java.lang.String): scala.Unit = js.native
  /**
    * Puts a JAL instruction.
    */
  def putJalAddress(address: scala.Double): scala.Unit = js.native
  /**
    * Puts a JALR instruction.
    */
  def putJalrReg(reg: MipsRegister): scala.Unit = js.native
  /**
    * Puts a JR instruction.
    */
  def putJrReg(reg: MipsRegister): scala.Unit = js.native
  /**
    * Puts a LA instruction.
    */
  def putLaRegAddress(reg: MipsRegister, address: NativePointerValue): scala.Unit = js.native
  /**
    * Puts a label at the current position, where `id` is an identifier
    * that may be referenced in past and future `put*Label()` calls.
    */
  def putLabel(id: java.lang.String): scala.Unit = js.native
  /**
    * Puts a LUI instruction.
    */
  def putLuiRegImm(reg: MipsRegister, imm: scala.Double): scala.Unit = js.native
  def putLwRegRegOffset(dstReg: MipsRegister, srcReg: MipsRegister, srcOffset: Int64): scala.Unit = js.native
  def putLwRegRegOffset(dstReg: MipsRegister, srcReg: MipsRegister, srcOffset: UInt64): scala.Unit = js.native
  /**
    * Puts a LW instruction.
    */
  def putLwRegRegOffset(dstReg: MipsRegister, srcReg: MipsRegister, srcOffset: scala.Double): scala.Unit = js.native
  /**
    * Puts a MFHI instruction.
    */
  def putMfhiReg(reg: MipsRegister): scala.Unit = js.native
  /**
    * Puts a MFLO instruction.
    */
  def putMfloReg(reg: MipsRegister): scala.Unit = js.native
  /**
    * Puts a MOVE instruction.
    */
  def putMoveRegReg(dstReg: MipsRegister, srcReg: MipsRegister): scala.Unit = js.native
  /**
    * Puts a MTHI instruction.
    */
  def putMthiReg(reg: MipsRegister): scala.Unit = js.native
  /**
    * Puts a MTLO instruction.
    */
  def putMtloReg(reg: MipsRegister): scala.Unit = js.native
  /**
    * Puts a NOP instruction.
    */
  def putNop(): scala.Unit = js.native
  /**
    * Puts an ORI instruction.
    */
  def putOriRegRegImm(rt: MipsRegister, rs: MipsRegister, imm: scala.Double): scala.Unit = js.native
  /**
    * Puts a POP instruction.
    */
  def putPopReg(reg: MipsRegister): scala.Unit = js.native
  /**
    * Puts a PUSH instruction.
    */
  def putPushReg(reg: MipsRegister): scala.Unit = js.native
  /**
    * Puts a RET instruction.
    */
  def putRet(): scala.Unit = js.native
  /**
    * Puts a SUB instruction.
    */
  def putSubRegRegImm(destReg: MipsRegister, leftReg: MipsRegister, imm: scala.Double): scala.Unit = js.native
  def putSwRegRegOffset(srcReg: MipsRegister, dstReg: MipsRegister, dstOffset: Int64): scala.Unit = js.native
  def putSwRegRegOffset(srcReg: MipsRegister, dstReg: MipsRegister, dstOffset: UInt64): scala.Unit = js.native
  /**
    * Puts a SW instruction.
    */
  def putSwRegRegOffset(srcReg: MipsRegister, dstReg: MipsRegister, dstOffset: scala.Double): scala.Unit = js.native
  /**
    * Recycles instance.
    */
  def reset(codeAddress: NativePointerValue): scala.Unit = js.native
  def reset(codeAddress: NativePointerValue, options: MipsWriterOptions): scala.Unit = js.native
  /**
    * Skips `nBytes`.
    */
  def skip(nBytes: scala.Double): scala.Unit = js.native
}

