package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generates machine code for x86.
  */
@JSGlobal("X86Writer")
@js.native
class X86Writer protected () extends js.Object {
  /**
    * Creates a new code writer for generating x86 machine code
    * written directly to memory at `codeAddress`.
    *
    * @param codeAddress Memory address to write generated code to.
    * @param options Options for customizing code generation.
    */
  def this(codeAddress: NativePointerValue) = this()
  def this(codeAddress: NativePointerValue, options: X86WriterOptions) = this()
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
  def putAddRegImm(reg: X86Register, immValue: Int64): scala.Unit = js.native
  def putAddRegImm(reg: X86Register, immValue: UInt64): scala.Unit = js.native
  /**
    * Puts an ADD instruction.
    */
  def putAddRegImm(reg: X86Register, immValue: scala.Double): scala.Unit = js.native
  /**
    * Puts an ADD instruction.
    */
  def putAddRegNearPtr(dstReg: X86Register, srcAddress: NativePointerValue): scala.Unit = js.native
  /**
    * Puts an ADD instruction.
    */
  def putAddRegReg(dstReg: X86Register, srcReg: X86Register): scala.Unit = js.native
  /**
    * Puts an AND instruction.
    */
  def putAndRegReg(dstReg: X86Register, srcReg: X86Register): scala.Unit = js.native
  /**
    * Puts an AND instruction.
    */
  def putAndRegU32(reg: X86Register, immValue: scala.Double): scala.Unit = js.native
  /**
    * Puts an OS/architecture-specific breakpoint instruction.
    */
  def putBreakpoint(): scala.Unit = js.native
  def putBytes(data: java.lang.String): scala.Unit = js.native
  def putBytes(data: js.Array[scala.Double]): scala.Unit = js.native
  /**
    * Puts raw data.
    */
  def putBytes(data: stdLib.ArrayBuffer): scala.Unit = js.native
  /**
    * Puts a CALL instruction.
    */
  def putCallAddress(address: NativePointerValue): scala.Unit = js.native
  /**
    * Like `putCallWithArguments()`, but also
    * ensures that the argument list is aligned on a 16 byte boundary.
    */
  def putCallAddressWithAlignedArguments(func: NativePointerValue, args: js.Array[X86CallArgument]): scala.Unit = js.native
  /**
    * Puts code needed for calling a C function with the specified `args`.
    */
  def putCallAddressWithArguments(func: NativePointerValue, args: js.Array[X86CallArgument]): scala.Unit = js.native
  /**
    * Puts a CALL instruction.
    */
  def putCallIndirect(addr: NativePointerValue): scala.Unit = js.native
  /**
    * Puts a CALL instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putCallIndirectLabel(labelId: java.lang.String): scala.Unit = js.native
  /**
    * Puts a CALL instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putCallNearLabel(labelId: java.lang.String): scala.Unit = js.native
  /**
    * Puts a CALL instruction.
    */
  def putCallReg(reg: X86Register): scala.Unit = js.native
  def putCallRegOffsetPtr(reg: X86Register, offset: Int64): scala.Unit = js.native
  def putCallRegOffsetPtr(reg: X86Register, offset: UInt64): scala.Unit = js.native
  /**
    * Puts a CALL instruction.
    */
  def putCallRegOffsetPtr(reg: X86Register, offset: scala.Double): scala.Unit = js.native
  def putCallRegOffsetPtrWithArguments(reg: X86Register, offset: Int64, args: js.Array[X86CallArgument]): scala.Unit = js.native
  def putCallRegOffsetPtrWithArguments(reg: X86Register, offset: UInt64, args: js.Array[X86CallArgument]): scala.Unit = js.native
  /**
    * Puts code needed for calling a C function with the specified `args`.
    */
  def putCallRegOffsetPtrWithArguments(reg: X86Register, offset: scala.Double, args: js.Array[X86CallArgument]): scala.Unit = js.native
  /**
    * Like `putCallWithArguments()`, but also
    * ensures that the argument list is aligned on a 16 byte boundary.
    */
  def putCallRegWithAlignedArguments(reg: X86Register, args: js.Array[X86CallArgument]): scala.Unit = js.native
  /**
    * Puts code needed for calling a C function with the specified `args`.
    */
  def putCallRegWithArguments(reg: X86Register, args: js.Array[X86CallArgument]): scala.Unit = js.native
  /**
    * Puts a CLC instruction.
    */
  def putClc(): scala.Unit = js.native
  /**
    * Puts a CLD instruction.
    */
  def putCld(): scala.Unit = js.native
  /**
    * Puts a CMP instruction.
    */
  def putCmpImmPtrImmU32(immPtr: NativePointerValue, immValue: scala.Double): scala.Unit = js.native
  /**
    * Puts a CMP instruction.
    */
  def putCmpRegI32(reg: X86Register, immValue: scala.Double): scala.Unit = js.native
  def putCmpRegOffsetPtrReg(regA: X86Register, offset: Int64, regB: X86Register): scala.Unit = js.native
  def putCmpRegOffsetPtrReg(regA: X86Register, offset: UInt64, regB: X86Register): scala.Unit = js.native
  /**
    * Puts a CMP instruction.
    */
  def putCmpRegOffsetPtrReg(regA: X86Register, offset: scala.Double, regB: X86Register): scala.Unit = js.native
  /**
    * Puts a CMP instruction.
    */
  def putCmpRegReg(regA: X86Register, regB: X86Register): scala.Unit = js.native
  /**
    * Puts a CPUID instruction.
    */
  def putCpuid(): scala.Unit = js.native
  /**
    * Puts a DEC instruction.
    */
  def putDecReg(reg: X86Register): scala.Unit = js.native
  /**
    * Puts a DEC instruction.
    */
  def putDecRegPtr(target: X86PointerTarget, reg: X86Register): scala.Unit = js.native
  /**
    * Puts an INC instruction.
    */
  def putIncReg(reg: X86Register): scala.Unit = js.native
  /**
    * Puts an INC instruction.
    */
  def putIncRegPtr(target: X86PointerTarget, reg: X86Register): scala.Unit = js.native
  /**
    * Puts a JCC instruction.
    */
  def putJccNear(instructionId: X86InstructionId, target: NativePointerValue, hint: X86BranchHint): scala.Unit = js.native
  /**
    * Puts a JCC instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putJccNearLabel(instructionId: X86InstructionId, labelId: java.lang.String, hint: X86BranchHint): scala.Unit = js.native
  /**
    * Puts a JCC instruction.
    */
  def putJccShort(instructionId: X86InstructionId, target: NativePointerValue, hint: X86BranchHint): scala.Unit = js.native
  /**
    * Puts a JCC instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putJccShortLabel(instructionId: X86InstructionId, labelId: java.lang.String, hint: X86BranchHint): scala.Unit = js.native
  /**
    * Puts a JMP instruction.
    */
  def putJmpAddress(address: NativePointerValue): scala.Unit = js.native
  /**
    * Puts a JMP instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putJmpNearLabel(labelId: java.lang.String): scala.Unit = js.native
  /**
    * Puts a JMP instruction.
    */
  def putJmpNearPtr(address: NativePointerValue): scala.Unit = js.native
  /**
    * Puts a JMP instruction.
    */
  def putJmpReg(reg: X86Register): scala.Unit = js.native
  def putJmpRegOffsetPtr(reg: X86Register, offset: Int64): scala.Unit = js.native
  def putJmpRegOffsetPtr(reg: X86Register, offset: UInt64): scala.Unit = js.native
  /**
    * Puts a JMP instruction.
    */
  def putJmpRegOffsetPtr(reg: X86Register, offset: scala.Double): scala.Unit = js.native
  /**
    * Puts a JMP instruction.
    */
  def putJmpRegPtr(reg: X86Register): scala.Unit = js.native
  /**
    * Puts a JMP instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putJmpShortLabel(labelId: java.lang.String): scala.Unit = js.native
  /**
    * Puts a label at the current position, where `id` is an identifier
    * that may be referenced in past and future `put*Label()` calls.
    */
  def putLabel(id: java.lang.String): scala.Unit = js.native
  def putLeaRegRegOffset(dstReg: X86Register, srcReg: X86Register, srcOffset: Int64): scala.Unit = js.native
  def putLeaRegRegOffset(dstReg: X86Register, srcReg: X86Register, srcOffset: UInt64): scala.Unit = js.native
  /**
    * Puts a LEA instruction.
    */
  def putLeaRegRegOffset(dstReg: X86Register, srcReg: X86Register, srcOffset: scala.Double): scala.Unit = js.native
  /**
    * Puts a LEAVE instruction.
    */
  def putLeave(): scala.Unit = js.native
  /**
    * Puts an LFENCE instruction.
    */
  def putLfence(): scala.Unit = js.native
  /**
    * Puts a LOCK CMPXCHG instruction.
    */
  def putLockCmpxchgRegPtrReg(dstReg: X86Register, srcReg: X86Register): scala.Unit = js.native
  /**
    * Puts a LOCK DEC IMM32 instruction.
    */
  def putLockDecImm32Ptr(target: NativePointerValue): scala.Unit = js.native
  /**
    * Puts a LOCK INC IMM32 instruction.
    */
  def putLockIncImm32Ptr(target: NativePointerValue): scala.Unit = js.native
  /**
    * Puts a LOCK XADD instruction.
    */
  def putLockXaddRegPtrReg(dstReg: X86Register, srcReg: X86Register): scala.Unit = js.native
  /**
    * Puts a MOV FS instruction.
    */
  def putMovFsU32PtrReg(fsOffset: scala.Double, srcReg: X86Register): scala.Unit = js.native
  /**
    * Puts a MOV GS instruction.
    */
  def putMovGsU32PtrReg(fsOffset: scala.Double, srcReg: X86Register): scala.Unit = js.native
  /**
    * Puts a MOV instruction.
    */
  def putMovNearPtrReg(dstAddress: NativePointerValue, srcReg: X86Register): scala.Unit = js.native
  /**
    * Puts a MOV instruction.
    */
  def putMovRegAddress(dstReg: X86Register, address: NativePointerValue): scala.Unit = js.native
  def putMovRegBaseIndexScaleOffsetPtr(
    dstReg: X86Register,
    baseReg: X86Register,
    indexReg: X86Register,
    scale: scala.Double,
    offset: Int64
  ): scala.Unit = js.native
  def putMovRegBaseIndexScaleOffsetPtr(
    dstReg: X86Register,
    baseReg: X86Register,
    indexReg: X86Register,
    scale: scala.Double,
    offset: UInt64
  ): scala.Unit = js.native
  /**
    * Puts a MOV instruction.
    */
  def putMovRegBaseIndexScaleOffsetPtr(
    dstReg: X86Register,
    baseReg: X86Register,
    indexReg: X86Register,
    scale: scala.Double,
    offset: scala.Double
  ): scala.Unit = js.native
  /**
    * Puts a MOV FS instruction.
    */
  def putMovRegFsU32Ptr(dstReg: X86Register, fsOffset: scala.Double): scala.Unit = js.native
  /**
    * Puts a MOV GS instruction.
    */
  def putMovRegGsU32Ptr(dstReg: X86Register, fsOffset: scala.Double): scala.Unit = js.native
  /**
    * Puts a MOV instruction.
    */
  def putMovRegNearPtr(dstReg: X86Register, srcAddress: NativePointerValue): scala.Unit = js.native
  def putMovRegOffsetPtrReg(dstReg: X86Register, dstOffset: Int64, srcReg: X86Register): scala.Unit = js.native
  def putMovRegOffsetPtrReg(dstReg: X86Register, dstOffset: UInt64, srcReg: X86Register): scala.Unit = js.native
  /**
    * Puts a MOV instruction.
    */
  def putMovRegOffsetPtrReg(dstReg: X86Register, dstOffset: scala.Double, srcReg: X86Register): scala.Unit = js.native
  def putMovRegOffsetPtrU32(dstReg: X86Register, dstOffset: Int64, immValue: scala.Double): scala.Unit = js.native
  def putMovRegOffsetPtrU32(dstReg: X86Register, dstOffset: UInt64, immValue: scala.Double): scala.Unit = js.native
  /**
    * Puts a MOV instruction.
    */
  def putMovRegOffsetPtrU32(dstReg: X86Register, dstOffset: scala.Double, immValue: scala.Double): scala.Unit = js.native
  /**
    * Puts a MOV instruction.
    */
  def putMovRegPtrReg(dstReg: X86Register, srcReg: X86Register): scala.Unit = js.native
  /**
    * Puts a MOV instruction.
    */
  def putMovRegPtrU32(dstReg: X86Register, immValue: scala.Double): scala.Unit = js.native
  /**
    * Puts a MOV instruction.
    */
  def putMovRegReg(dstReg: X86Register, srcReg: X86Register): scala.Unit = js.native
  def putMovRegRegOffsetPtr(dstReg: X86Register, srcReg: X86Register, srcOffset: Int64): scala.Unit = js.native
  def putMovRegRegOffsetPtr(dstReg: X86Register, srcReg: X86Register, srcOffset: UInt64): scala.Unit = js.native
  /**
    * Puts a MOV instruction.
    */
  def putMovRegRegOffsetPtr(dstReg: X86Register, srcReg: X86Register, srcOffset: scala.Double): scala.Unit = js.native
  /**
    * Puts a MOV instruction.
    */
  def putMovRegRegPtr(dstReg: X86Register, srcReg: X86Register): scala.Unit = js.native
  /**
    * Puts a MOV instruction.
    */
  def putMovRegU32(dstReg: X86Register, immValue: scala.Double): scala.Unit = js.native
  def putMovRegU64(dstReg: X86Register, immValue: UInt64): scala.Unit = js.native
  /**
    * Puts a MOV instruction.
    */
  def putMovRegU64(dstReg: X86Register, immValue: scala.Double): scala.Unit = js.native
  /**
    * Puts a MOVDQU EAX XMM0 instruction.
    */
  def putMovdquEaxOffsetPtrXmm0(offset: scala.Double): scala.Unit = js.native
  /**
    * Puts a MOVDQU XMM0 ESP instruction.
    */
  def putMovdquXmm0EspOffsetPtr(offset: scala.Double): scala.Unit = js.native
  /**
    * Puts a MOVQ EAX XMM0 instruction.
    */
  def putMovqEaxOffsetPtrXmm0(offset: scala.Double): scala.Unit = js.native
  /**
    * Puts a MOVQ XMM0 ESP instruction.
    */
  def putMovqXmm0EspOffsetPtr(offset: scala.Double): scala.Unit = js.native
  /**
    * Puts a NOP instruction.
    */
  def putNop(): scala.Unit = js.native
  /**
    * Puts `n` NOP instructions.
    */
  def putNopPadding(n: scala.Double): scala.Unit = js.native
  /**
    * Puts `n` guard instruction.
    */
  def putPadding(n: scala.Double): scala.Unit = js.native
  /**
    * Puts a PAUSE instruction.
    */
  def putPause(): scala.Unit = js.native
  /**
    * Puts a POP instruction.
    */
  def putPopReg(reg: X86Register): scala.Unit = js.native
  /**
    * Puts a POPAX instruction.
    */
  def putPopax(): scala.Unit = js.native
  /**
    * Puts a POPFX instruction.
    */
  def putPopfx(): scala.Unit = js.native
  /**
    * Puts a PUSH instruction.
    */
  def putPushImmPtr(immPtr: NativePointerValue): scala.Unit = js.native
  /**
    * Puts a PUSH instruction.
    */
  def putPushNearPtr(address: NativePointerValue): scala.Unit = js.native
  /**
    * Puts a PUSH instruction.
    */
  def putPushReg(reg: X86Register): scala.Unit = js.native
  /**
    * Puts a PUSH instruction.
    */
  def putPushU32(immValue: scala.Double): scala.Unit = js.native
  /**
    * Puts a PUSHAX instruction.
    */
  def putPushax(): scala.Unit = js.native
  /**
    * Puts a PUSHFX instruction.
    */
  def putPushfx(): scala.Unit = js.native
  /**
    * Puts an RDTSC instruction.
    */
  def putRdtsc(): scala.Unit = js.native
  /**
    * Puts a RET instruction.
    */
  def putRet(): scala.Unit = js.native
  /**
    * Puts a RET instruction.
    */
  def putRetImm(immValue: scala.Double): scala.Unit = js.native
  /**
    * Puts an int8.
    */
  def putS8(value: scala.Double): scala.Unit = js.native
  /**
    * Puts a SHL instruction.
    */
  def putShlRegU8(reg: X86Register, immValue: scala.Double): scala.Unit = js.native
  /**
    * Puts a SHR instruction.
    */
  def putShrRegU8(reg: X86Register, immValue: scala.Double): scala.Unit = js.native
  /**
    * Puts a STC instruction.
    */
  def putStc(): scala.Unit = js.native
  /**
    * Puts a STD instruction.
    */
  def putStd(): scala.Unit = js.native
  def putSubRegImm(reg: X86Register, immValue: Int64): scala.Unit = js.native
  def putSubRegImm(reg: X86Register, immValue: UInt64): scala.Unit = js.native
  /**
    * Puts a SUB instruction.
    */
  def putSubRegImm(reg: X86Register, immValue: scala.Double): scala.Unit = js.native
  /**
    * Puts a SUB instruction.
    */
  def putSubRegNearPtr(dstReg: X86Register, srcAddress: NativePointerValue): scala.Unit = js.native
  /**
    * Puts a SUB instruction.
    */
  def putSubRegReg(dstReg: X86Register, srcReg: X86Register): scala.Unit = js.native
  /**
    * Puts a TEST instruction.
    */
  def putTestRegReg(regA: X86Register, regB: X86Register): scala.Unit = js.native
  /**
    * Puts a TEST instruction.
    */
  def putTestRegU32(reg: X86Register, immValue: scala.Double): scala.Unit = js.native
  /**
    * Puts a uint8.
    */
  def putU8(value: scala.Double): scala.Unit = js.native
  /**
    * Puts an XCHG instruction.
    */
  def putXchgRegRegPtr(leftReg: X86Register, rightReg: X86Register): scala.Unit = js.native
  /**
    * Puts an XOR instruction.
    */
  def putXorRegReg(dstReg: X86Register, srcReg: X86Register): scala.Unit = js.native
  /**
    * Recycles instance.
    */
  def reset(codeAddress: NativePointerValue): scala.Unit = js.native
  def reset(codeAddress: NativePointerValue, options: X86WriterOptions): scala.Unit = js.native
}

