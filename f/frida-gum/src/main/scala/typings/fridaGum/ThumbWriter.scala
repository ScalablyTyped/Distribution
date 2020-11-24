package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generates machine code for arm.
  */
@js.native
trait ThumbWriter extends js.Object {
  
  /**
    * Memory location of the first byte of output.
    */
  var base: NativePointer = js.native
  
  /**
    * Memory location of the next byte of output.
    */
  var code: NativePointer = js.native
  
  /**
    * Commits the first pending reference to the given label, returning
    * `true` on success. Returns `false` if the given label hasn't been
    * defined yet, or there are no more pending references to it.
    */
  def commitLabel(id: String): Boolean = js.native
  
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
    * Current offset in bytes.
    */
  var offset: Double = js.native
  
  /**
    * Program counter at the next byte of output.
    */
  var pc: NativePointer = js.native
  
  /**
    * Puts an ADD instruction.
    */
  def putAddRegImm(dstReg: ArmRegister, immValue: Double): Unit = js.native
  def putAddRegImm(dstReg: ArmRegister, immValue: Int64): Unit = js.native
  def putAddRegImm(dstReg: ArmRegister, immValue: UInt64): Unit = js.native
  
  /**
    * Puts an ADD instruction.
    */
  def putAddRegReg(dstReg: ArmRegister, srcReg: ArmRegister): Unit = js.native
  
  /**
    * Puts an ADD instruction.
    */
  def putAddRegRegImm(dstReg: ArmRegister, leftReg: ArmRegister, rightValue: Double): Unit = js.native
  def putAddRegRegImm(dstReg: ArmRegister, leftReg: ArmRegister, rightValue: Int64): Unit = js.native
  def putAddRegRegImm(dstReg: ArmRegister, leftReg: ArmRegister, rightValue: UInt64): Unit = js.native
  
  /**
    * Puts an ADD instruction.
    */
  def putAddRegRegReg(dstReg: ArmRegister, leftReg: ArmRegister, rightReg: ArmRegister): Unit = js.native
  
  /**
    * Puts an AND instruction.
    */
  def putAndRegRegImm(dstReg: ArmRegister, leftReg: ArmRegister, rightValue: Double): Unit = js.native
  def putAndRegRegImm(dstReg: ArmRegister, leftReg: ArmRegister, rightValue: Int64): Unit = js.native
  def putAndRegRegImm(dstReg: ArmRegister, leftReg: ArmRegister, rightValue: UInt64): Unit = js.native
  
  /**
    * Puts a B COND instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putBCondLabel(cc: ArmConditionCode, labelId: String): Unit = js.native
  
  /**
    * Puts a B COND WIDE instruction.
    */
  def putBCondLabelWide(cc: ArmConditionCode, labelId: String): Unit = js.native
  
  /**
    * Puts a B instruction.
    */
  def putBImm(target: NativePointerValue): Unit = js.native
  
  /**
    * Puts a B instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putBLabel(labelId: String): Unit = js.native
  
  /**
    * Puts a B WIDE instruction.
    */
  def putBLabelWide(labelId: String): Unit = js.native
  
  /**
    * Puts a BEQ instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putBeqLabel(labelId: String): Unit = js.native
  
  /**
    * Puts a BKPT instruction.
    */
  def putBkptImm(imm: Double): Unit = js.native
  
  /**
    * Puts a BL instruction.
    */
  def putBlImm(target: NativePointerValue): Unit = js.native
  
  /**
    * Puts a BL instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putBlLabel(labelId: String): Unit = js.native
  
  /**
    * Puts a BLX instruction.
    */
  def putBlxImm(target: NativePointerValue): Unit = js.native
  
  /**
    * Puts a BLX instruction.
    */
  def putBlxReg(reg: ArmRegister): Unit = js.native
  
  /**
    * Puts a BNE instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putBneLabel(labelId: String): Unit = js.native
  
  /**
    * Puts an OS/architecture-specific breakpoint instruction.
    */
  def putBreakpoint(): Unit = js.native
  
  /**
    * Puts a BX instruction.
    */
  def putBxReg(reg: ArmRegister): Unit = js.native
  
  def putBytes(data: String): Unit = js.native
  def putBytes(data: js.Array[Double]): Unit = js.native
  /**
    * Puts raw data.
    */
  def putBytes(data: ArrayBuffer): Unit = js.native
  
  /**
    * Puts code needed for calling a C function with the specified `args`.
    */
  def putCallAddressWithArguments(func: NativePointerValue, args: js.Array[ArmCallArgument]): Unit = js.native
  
  /**
    * Puts code needed for calling a C function with the specified `args`.
    */
  def putCallRegWithArguments(reg: ArmRegister, args: js.Array[ArmCallArgument]): Unit = js.native
  
  /**
    * Puts a CBNZ instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putCbnzRegLabel(reg: ArmRegister, labelId: String): Unit = js.native
  
  /**
    * Puts a CBZ instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putCbzRegLabel(reg: ArmRegister, labelId: String): Unit = js.native
  
  /**
    * Puts a CMP instruction.
    */
  def putCmpRegImm(reg: ArmRegister, immValue: Double): Unit = js.native
  
  /**
    * Puts a raw instruction.
    */
  def putInstruction(insn: Double): Unit = js.native
  
  /**
    * Puts a raw Thumb-2 instruction.
    */
  def putInstructionWide(upper: Double, lower: Double): Unit = js.native
  
  /**
    * Puts a label at the current position, where `id` is an identifier
    * that may be referenced in past and future `put*Label()` calls.
    */
  def putLabel(id: String): Unit = js.native
  
  /**
    * Puts an LDMIA MASK instruction.
    */
  def putLdmiaRegMask(reg: ArmRegister, mask: Double): Unit = js.native
  
  /**
    * Puts an LDR instruction.
    */
  def putLdrRegAddress(reg: ArmRegister, address: NativePointerValue): Unit = js.native
  
  /**
    * Puts an LDR instruction.
    */
  def putLdrRegReg(dstReg: ArmRegister, srcReg: ArmRegister): Unit = js.native
  
  /**
    * Puts an LDR instruction.
    */
  def putLdrRegRegOffset(dstReg: ArmRegister, srcReg: ArmRegister, srcOffset: Double): Unit = js.native
  def putLdrRegRegOffset(dstReg: ArmRegister, srcReg: ArmRegister, srcOffset: Int64): Unit = js.native
  def putLdrRegRegOffset(dstReg: ArmRegister, srcReg: ArmRegister, srcOffset: UInt64): Unit = js.native
  
  /**
    * Puts an LDR instruction.
    */
  def putLdrRegU32(reg: ArmRegister, `val`: Double): Unit = js.native
  
  /**
    * Puts an LDRB instruction.
    */
  def putLdrbRegReg(dstReg: ArmRegister, srcReg: ArmRegister): Unit = js.native
  
  /**
    * Puts a LSLS instruction.
    */
  def putLslsRegRegImm(dstReg: ArmRegister, leftReg: ArmRegister, rightValue: Double): Unit = js.native
  
  /**
    * Puts a LSRS instruction.
    */
  def putLsrsRegRegImm(dstReg: ArmRegister, leftReg: ArmRegister, rightValue: Double): Unit = js.native
  
  /**
    * Puts a MOV CPSR instruction.
    */
  def putMovCpsrReg(reg: ArmRegister): Unit = js.native
  
  /**
    * Puts a MOV CPSR instruction.
    */
  def putMovRegCpsr(reg: ArmRegister): Unit = js.native
  
  /**
    * Puts a MOV instruction.
    */
  def putMovRegReg(dstReg: ArmRegister, srcReg: ArmRegister): Unit = js.native
  
  /**
    * Puts a MOV instruction.
    */
  def putMovRegU8(dstReg: ArmRegister, immValue: Double): Unit = js.native
  
  /**
    * Puts a MRS instruction.
    */
  def putMrsRegReg(dstReg: ArmRegister, srcReg: ArmSystemRegister): Unit = js.native
  
  /**
    * Puts a MSR instruction.
    */
  def putMsrRegReg(dstReg: ArmSystemRegister, srcReg: ArmRegister): Unit = js.native
  
  /**
    * Puts a NOP instruction.
    */
  def putNop(): Unit = js.native
  
  /**
    * Puts a POP instruction with the specified registers.
    */
  def putPopRegs(regs: js.Array[ArmRegister]): Unit = js.native
  
  /**
    * Puts a PUSH instruction with the specified registers.
    */
  def putPushRegs(regs: js.Array[ArmRegister]): Unit = js.native
  
  /**
    * Puts a STR instruction.
    */
  def putStrRegReg(srcReg: ArmRegister, dstReg: ArmRegister): Unit = js.native
  
  /**
    * Puts a STR instruction.
    */
  def putStrRegRegOffset(srcReg: ArmRegister, dstReg: ArmRegister, dstOffset: Double): Unit = js.native
  def putStrRegRegOffset(srcReg: ArmRegister, dstReg: ArmRegister, dstOffset: Int64): Unit = js.native
  def putStrRegRegOffset(srcReg: ArmRegister, dstReg: ArmRegister, dstOffset: UInt64): Unit = js.native
  
  /**
    * Puts a SUB instruction.
    */
  def putSubRegImm(dstReg: ArmRegister, immValue: Double): Unit = js.native
  def putSubRegImm(dstReg: ArmRegister, immValue: Int64): Unit = js.native
  def putSubRegImm(dstReg: ArmRegister, immValue: UInt64): Unit = js.native
  
  /**
    * Puts a SUB instruction.
    */
  def putSubRegReg(dstReg: ArmRegister, srcReg: ArmRegister): Unit = js.native
  
  /**
    * Puts a SUB instruction.
    */
  def putSubRegRegImm(dstReg: ArmRegister, leftReg: ArmRegister, rightValue: Double): Unit = js.native
  def putSubRegRegImm(dstReg: ArmRegister, leftReg: ArmRegister, rightValue: Int64): Unit = js.native
  def putSubRegRegImm(dstReg: ArmRegister, leftReg: ArmRegister, rightValue: UInt64): Unit = js.native
  
  /**
    * Puts a SUB instruction.
    */
  def putSubRegRegReg(dstReg: ArmRegister, leftReg: ArmRegister, rightReg: ArmRegister): Unit = js.native
  
  /**
    * Puts a VLDR instruction.
    */
  def putVldrRegRegOffset(dstReg: ArmRegister, srcReg: ArmRegister, srcOffset: Double): Unit = js.native
  def putVldrRegRegOffset(dstReg: ArmRegister, srcReg: ArmRegister, srcOffset: Int64): Unit = js.native
  def putVldrRegRegOffset(dstReg: ArmRegister, srcReg: ArmRegister, srcOffset: UInt64): Unit = js.native
  
  /**
    * Recycles instance.
    */
  def reset(codeAddress: NativePointerValue): Unit = js.native
  def reset(codeAddress: NativePointerValue, options: ThumbWriterOptions): Unit = js.native
  
  /**
    * Skips `nBytes`.
    */
  def skip(nBytes: Double): Unit = js.native
}
