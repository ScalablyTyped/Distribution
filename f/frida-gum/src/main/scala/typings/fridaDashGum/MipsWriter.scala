package typings.fridaDashGum

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
  var offset: Double = js.native
  /**
    * Program counter at the next byte of output.
    */
  var pc: NativePointer = js.native
  /**
    * Eagerly cleans up memory.
    */
  def dispose(): Unit = js.native
  /**
    * Resolves label references and writes pending data to memory. You
    * should always call this once you've finished generating code. It
    * is usually also desirable to do this between pieces of unrelated
    * code, e.g. when generating multiple functions in one go.
    */
  def flush(): Unit = js.native
  /**
    * Puts an ADDI instruction.
    */
  def putAddiRegImm(destReg: MipsRegister, imm: Double): Unit = js.native
  /**
    * Puts an ADDI instruction.
    */
  def putAddiRegRegImm(destReg: MipsRegister, leftReg: MipsRegister, imm: Double): Unit = js.native
  /**
    * Puts an ADDU instruction.
    */
  def putAdduRegRegReg(dstReg: MipsRegister, leftReg: MipsRegister, rightReg: MipsRegister): Unit = js.native
  /**
    * Puts a B instruction.
    */
  def putBOffset(offset: Double): Unit = js.native
  /**
    * Puts a BEQ instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putBeqRegRegLabel(rightReg: MipsRegister, leftReg: MipsRegister, labelId: String): Unit = js.native
  /**
    * Puts a BREAK instruction.
    */
  def putBreak(): Unit = js.native
  def putBytes(data: String): Unit = js.native
  def putBytes(data: js.Array[Double]): Unit = js.native
  /**
    * Puts raw data.
    */
  def putBytes(data: ArrayBuffer): Unit = js.native
  /**
    * Puts code needed for calling a C function with the specified `args`.
    */
  def putCallAddressWithArguments(func: NativePointerValue, args: js.Array[MipsCallArgument]): Unit = js.native
  /**
    * Puts code needed for calling a C function with the specified `args`.
    */
  def putCallRegWithArguments(reg: MipsRegister, args: js.Array[MipsCallArgument]): Unit = js.native
  /**
    * Puts a raw instruction.
    */
  def putInstruction(insn: Double): Unit = js.native
  /**
    * Puts a J instruction.
    */
  def putJAddress(address: NativePointerValue): Unit = js.native
  /**
    * Puts a J instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putJLabel(labelId: String): Unit = js.native
  /**
    * Puts a JAL instruction.
    */
  def putJalAddress(address: Double): Unit = js.native
  /**
    * Puts a JALR instruction.
    */
  def putJalrReg(reg: MipsRegister): Unit = js.native
  /**
    * Puts a JR instruction.
    */
  def putJrReg(reg: MipsRegister): Unit = js.native
  /**
    * Puts a LA instruction.
    */
  def putLaRegAddress(reg: MipsRegister, address: NativePointerValue): Unit = js.native
  /**
    * Puts a label at the current position, where `id` is an identifier
    * that may be referenced in past and future `put*Label()` calls.
    */
  def putLabel(id: String): Unit = js.native
  /**
    * Puts a LUI instruction.
    */
  def putLuiRegImm(reg: MipsRegister, imm: Double): Unit = js.native
  /**
    * Puts a LW instruction.
    */
  def putLwRegRegOffset(dstReg: MipsRegister, srcReg: MipsRegister, srcOffset: Double): Unit = js.native
  def putLwRegRegOffset(dstReg: MipsRegister, srcReg: MipsRegister, srcOffset: Int64): Unit = js.native
  def putLwRegRegOffset(dstReg: MipsRegister, srcReg: MipsRegister, srcOffset: UInt64): Unit = js.native
  /**
    * Puts a MFHI instruction.
    */
  def putMfhiReg(reg: MipsRegister): Unit = js.native
  /**
    * Puts a MFLO instruction.
    */
  def putMfloReg(reg: MipsRegister): Unit = js.native
  /**
    * Puts a MOVE instruction.
    */
  def putMoveRegReg(dstReg: MipsRegister, srcReg: MipsRegister): Unit = js.native
  /**
    * Puts a MTHI instruction.
    */
  def putMthiReg(reg: MipsRegister): Unit = js.native
  /**
    * Puts a MTLO instruction.
    */
  def putMtloReg(reg: MipsRegister): Unit = js.native
  /**
    * Puts a NOP instruction.
    */
  def putNop(): Unit = js.native
  /**
    * Puts an ORI instruction.
    */
  def putOriRegRegImm(rt: MipsRegister, rs: MipsRegister, imm: Double): Unit = js.native
  /**
    * Puts a POP instruction.
    */
  def putPopReg(reg: MipsRegister): Unit = js.native
  /**
    * Puts a PUSH instruction.
    */
  def putPushReg(reg: MipsRegister): Unit = js.native
  /**
    * Puts a RET instruction.
    */
  def putRet(): Unit = js.native
  /**
    * Puts a SUB instruction.
    */
  def putSubRegRegImm(destReg: MipsRegister, leftReg: MipsRegister, imm: Double): Unit = js.native
  /**
    * Puts a SW instruction.
    */
  def putSwRegRegOffset(srcReg: MipsRegister, dstReg: MipsRegister, dstOffset: Double): Unit = js.native
  def putSwRegRegOffset(srcReg: MipsRegister, dstReg: MipsRegister, dstOffset: Int64): Unit = js.native
  def putSwRegRegOffset(srcReg: MipsRegister, dstReg: MipsRegister, dstOffset: UInt64): Unit = js.native
  /**
    * Recycles instance.
    */
  def reset(codeAddress: NativePointerValue): Unit = js.native
  def reset(codeAddress: NativePointerValue, options: MipsWriterOptions): Unit = js.native
  /**
    * Skips `nBytes`.
    */
  def skip(nBytes: Double): Unit = js.native
}

