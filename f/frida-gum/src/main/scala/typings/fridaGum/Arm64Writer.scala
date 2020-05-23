package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generates machine code for arm64.
  */
@js.native
trait Arm64Writer extends js.Object {
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
    * Determines whether a direct branch is possible between the two
    * given memory locations.
    */
  def canBranchDirectlyBetween(from: NativePointerValue, to: NativePointerValue): Boolean = js.native
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
    * Puts an ADD instruction.
    */
  def putAddRegRegImm(dstReg: Arm64Register, leftReg: Arm64Register, rightValue: Double): Unit = js.native
  def putAddRegRegImm(dstReg: Arm64Register, leftReg: Arm64Register, rightValue: Int64): Unit = js.native
  def putAddRegRegImm(dstReg: Arm64Register, leftReg: Arm64Register, rightValue: UInt64): Unit = js.native
  /**
    * Puts an ADD instruction.
    */
  def putAddRegRegReg(dstReg: Arm64Register, leftReg: Arm64Register, rightReg: Arm64Register): Unit = js.native
  /**
    * Puts an ADRP instruction.
    */
  def putAdrpRegAddress(reg: Arm64Register, address: NativePointerValue): Unit = js.native
  /**
    * Puts an AND instruction.
    */
  def putAndRegRegImm(dstReg: Arm64Register, leftReg: Arm64Register, rightValue: Double): Unit = js.native
  def putAndRegRegImm(dstReg: Arm64Register, leftReg: Arm64Register, rightValue: Int64): Unit = js.native
  def putAndRegRegImm(dstReg: Arm64Register, leftReg: Arm64Register, rightValue: UInt64): Unit = js.native
  /**
    * Puts a B COND instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putBCondLabel(cc: Arm64ConditionCode, labelId: String): Unit = js.native
  /**
    * Puts a B instruction.
    */
  def putBImm(address: NativePointerValue): Unit = js.native
  /**
    * Puts a B instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putBLabel(labelId: String): Unit = js.native
  /**
    * Puts a BL instruction.
    */
  def putBlImm(address: NativePointerValue): Unit = js.native
  /**
    * Puts a BL instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putBlLabel(labelId: String): Unit = js.native
  /**
    * Puts a BLR instruction.
    */
  def putBlrReg(reg: Arm64Register): Unit = js.native
  /**
    * Puts a BLR instruction expecting a raw pointer without
    * any authentication bits.
    */
  def putBlrRegNoAuth(reg: Arm64Register): Unit = js.native
  /**
    * Puts a BR instruction.
    */
  def putBrReg(reg: Arm64Register): Unit = js.native
  /**
    * Puts a BR instruction expecting a raw pointer without
    * any authentication bits.
    */
  def putBrRegNoAuth(reg: Arm64Register): Unit = js.native
  /**
    * Puts code needed for branching/jumping to the given address.
    */
  def putBranchAddress(address: NativePointerValue): Unit = js.native
  /**
    * Puts a BRK instruction.
    */
  def putBrkImm(imm: Double): Unit = js.native
  def putBytes(data: String): Unit = js.native
  def putBytes(data: js.Array[Double]): Unit = js.native
  /**
    * Puts raw data.
    */
  def putBytes(data: ArrayBuffer): Unit = js.native
  /**
    * Puts code needed for calling a C function with the specified `args`.
    */
  def putCallAddressWithArguments(func: NativePointerValue, args: js.Array[Arm64CallArgument]): Unit = js.native
  /**
    * Puts code needed for calling a C function with the specified `args`.
    */
  def putCallRegWithArguments(reg: Arm64Register, args: js.Array[Arm64CallArgument]): Unit = js.native
  /**
    * Puts a CBNZ instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putCbnzRegLabel(reg: Arm64Register, labelId: String): Unit = js.native
  /**
    * Puts a CBZ instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putCbzRegLabel(reg: Arm64Register, labelId: String): Unit = js.native
  /**
    * Puts a CMP instruction.
    */
  def putCmpRegReg(regA: Arm64Register, regB: Arm64Register): Unit = js.native
  /**
    * Puts a raw instruction.
    */
  def putInstruction(insn: Double): Unit = js.native
  /**
    * Puts a label at the current position, where `id` is an identifier
    * that may be referenced in past and future `put*Label()` calls.
    */
  def putLabel(id: String): Unit = js.native
  /**
    * Puts an LDP instruction.
    */
  def putLdpRegRegRegOffset(
    regA: Arm64Register,
    regB: Arm64Register,
    regSrc: Arm64Register,
    srcOffset: Double,
    mode: Arm64IndexMode
  ): Unit = js.native
  def putLdpRegRegRegOffset(
    regA: Arm64Register,
    regB: Arm64Register,
    regSrc: Arm64Register,
    srcOffset: Int64,
    mode: Arm64IndexMode
  ): Unit = js.native
  def putLdpRegRegRegOffset(
    regA: Arm64Register,
    regB: Arm64Register,
    regSrc: Arm64Register,
    srcOffset: UInt64,
    mode: Arm64IndexMode
  ): Unit = js.native
  /**
    * Puts an LDR instruction.
    */
  def putLdrRegAddress(reg: Arm64Register, address: NativePointerValue): Unit = js.native
  /**
    * Puts an LDR instruction with a dangling data reference,
    * returning an opaque ref value that should be passed to `putLdrRegValue()`
    * at the desired location.
    */
  def putLdrRegRef(reg: Arm64Register): Double = js.native
  /**
    * Puts an LDR instruction.
    */
  def putLdrRegRegOffset(dstReg: Arm64Register, srcReg: Arm64Register, srcOffset: Double): Unit = js.native
  def putLdrRegRegOffset(dstReg: Arm64Register, srcReg: Arm64Register, srcOffset: Int64): Unit = js.native
  def putLdrRegRegOffset(dstReg: Arm64Register, srcReg: Arm64Register, srcOffset: UInt64): Unit = js.native
  /**
    * Puts an LDR instruction.
    */
  def putLdrRegU64(reg: Arm64Register, `val`: Double): Unit = js.native
  def putLdrRegU64(reg: Arm64Register, `val`: UInt64): Unit = js.native
  /**
    * Puts the value and updates the LDR instruction
    * from a previous `putLdrRegRef()`.
    */
  def putLdrRegValue(ref: Double, value: NativePointerValue): Unit = js.native
  /**
    * Puts an LDRSW instruction.
    */
  def putLdrswRegRegOffset(dstReg: Arm64Register, srcReg: Arm64Register, srcOffset: Double): Unit = js.native
  def putLdrswRegRegOffset(dstReg: Arm64Register, srcReg: Arm64Register, srcOffset: Int64): Unit = js.native
  def putLdrswRegRegOffset(dstReg: Arm64Register, srcReg: Arm64Register, srcOffset: UInt64): Unit = js.native
  /**
    * Puts a MOV instruction.
    */
  def putMovRegReg(dstReg: Arm64Register, srcReg: Arm64Register): Unit = js.native
  /**
    * Puts a NOP instruction.
    */
  def putNop(): Unit = js.native
  /**
    * Puts code needed for popping all Q registers off the stack.
    */
  def putPopAllQRegisters(): Unit = js.native
  /**
    * Puts code needed for popping all X registers off the stack.
    */
  def putPopAllXRegisters(): Unit = js.native
  /**
    * Puts a POP instruction.
    */
  def putPopRegReg(regA: Arm64Register, regB: Arm64Register): Unit = js.native
  /**
    * Puts code needed for pushing all Q registers on the stack.
    */
  def putPushAllQRegisters(): Unit = js.native
  /**
    * Puts code needed for pushing all X registers on the stack.
    */
  def putPushAllXRegisters(): Unit = js.native
  /**
    * Puts a PUSH instruction.
    */
  def putPushRegReg(regA: Arm64Register, regB: Arm64Register): Unit = js.native
  /**
    * Puts a RET instruction.
    */
  def putRet(): Unit = js.native
  /**
    * Puts a STP instruction.
    */
  def putStpRegRegRegOffset(
    regA: Arm64Register,
    regB: Arm64Register,
    regDst: Arm64Register,
    dstOffset: Double,
    mode: Arm64IndexMode
  ): Unit = js.native
  def putStpRegRegRegOffset(
    regA: Arm64Register,
    regB: Arm64Register,
    regDst: Arm64Register,
    dstOffset: Int64,
    mode: Arm64IndexMode
  ): Unit = js.native
  def putStpRegRegRegOffset(
    regA: Arm64Register,
    regB: Arm64Register,
    regDst: Arm64Register,
    dstOffset: UInt64,
    mode: Arm64IndexMode
  ): Unit = js.native
  /**
    * Puts a STR instruction.
    */
  def putStrRegRegOffset(srcReg: Arm64Register, dstReg: Arm64Register, dstOffset: Double): Unit = js.native
  def putStrRegRegOffset(srcReg: Arm64Register, dstReg: Arm64Register, dstOffset: Int64): Unit = js.native
  def putStrRegRegOffset(srcReg: Arm64Register, dstReg: Arm64Register, dstOffset: UInt64): Unit = js.native
  /**
    * Puts a SUB instruction.
    */
  def putSubRegRegImm(dstReg: Arm64Register, leftReg: Arm64Register, rightValue: Double): Unit = js.native
  def putSubRegRegImm(dstReg: Arm64Register, leftReg: Arm64Register, rightValue: Int64): Unit = js.native
  def putSubRegRegImm(dstReg: Arm64Register, leftReg: Arm64Register, rightValue: UInt64): Unit = js.native
  /**
    * Puts a SUB instruction.
    */
  def putSubRegRegReg(dstReg: Arm64Register, leftReg: Arm64Register, rightReg: Arm64Register): Unit = js.native
  /**
    * Puts a TBNZ instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putTbnzRegImmLabel(reg: Arm64Register, bit: Double, labelId: String): Unit = js.native
  /**
    * Puts a TBZ instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putTbzRegImmLabel(reg: Arm64Register, bit: Double, labelId: String): Unit = js.native
  /**
    * Puts a TST instruction.
    */
  def putTstRegImm(reg: Arm64Register, immValue: Double): Unit = js.native
  def putTstRegImm(reg: Arm64Register, immValue: UInt64): Unit = js.native
  /**
    * Puts an UXTW instruction.
    */
  def putUxtwRegReg(dstReg: Arm64Register, srcReg: Arm64Register): Unit = js.native
  /**
    * Puts an XPACI instruction.
    */
  def putXpaciReg(reg: Arm64Register): Unit = js.native
  /**
    * Recycles instance.
    */
  def reset(codeAddress: NativePointerValue): Unit = js.native
  def reset(codeAddress: NativePointerValue, options: Arm64WriterOptions): Unit = js.native
  /**
    * Signs the given pointer value.
    */
  def sign(value: NativePointerValue): NativePointer = js.native
  /**
    * Skips `nBytes`.
    */
  def skip(nBytes: Double): Unit = js.native
}

