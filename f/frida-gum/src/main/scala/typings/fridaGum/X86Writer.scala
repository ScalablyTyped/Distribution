package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generates machine code for x86.
  */
@js.native
trait X86Writer extends StObject {
  
  /**
    * Memory location of the first byte of output.
    */
  var base: NativePointer = js.native
  
  /**
    * Memory location of the next byte of output.
    */
  var code: NativePointer = js.native
  
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
  def putAddRegImm(reg: X86Register, immValue: Double): Unit = js.native
  def putAddRegImm(reg: X86Register, immValue: Int64): Unit = js.native
  def putAddRegImm(reg: X86Register, immValue: UInt64): Unit = js.native
  
  /**
    * Puts an ADD instruction.
    */
  def putAddRegNearPtr(dstReg: X86Register, srcAddress: NativePointerValue): Unit = js.native
  
  /**
    * Puts an ADD instruction.
    */
  def putAddRegReg(dstReg: X86Register, srcReg: X86Register): Unit = js.native
  
  /**
    * Puts an AND instruction.
    */
  def putAndRegReg(dstReg: X86Register, srcReg: X86Register): Unit = js.native
  
  /**
    * Puts an AND instruction.
    */
  def putAndRegU32(reg: X86Register, immValue: Double): Unit = js.native
  
  /**
    * Puts an OS/architecture-specific breakpoint instruction.
    */
  def putBreakpoint(): Unit = js.native
  
  def putBytes(data: String): Unit = js.native
  def putBytes(data: js.Array[Double]): Unit = js.native
  /**
    * Puts raw data.
    */
  def putBytes(data: ArrayBuffer): Unit = js.native
  
  /**
    * Puts a CALL instruction.
    */
  def putCallAddress(address: NativePointerValue): Unit = js.native
  
  /**
    * Like `putCallWithArguments()`, but also
    * ensures that the argument list is aligned on a 16 byte boundary.
    */
  def putCallAddressWithAlignedArguments(func: NativePointerValue, args: js.Array[X86CallArgument]): Unit = js.native
  
  /**
    * Puts code needed for calling a C function with the specified `args`.
    */
  def putCallAddressWithArguments(func: NativePointerValue, args: js.Array[X86CallArgument]): Unit = js.native
  
  /**
    * Puts a CALL instruction.
    */
  def putCallIndirect(addr: NativePointerValue): Unit = js.native
  
  /**
    * Puts a CALL instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putCallIndirectLabel(labelId: String): Unit = js.native
  
  /**
    * Puts a CALL instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putCallNearLabel(labelId: String): Unit = js.native
  
  /**
    * Puts a CALL instruction.
    */
  def putCallReg(reg: X86Register): Unit = js.native
  
  /**
    * Puts a CALL instruction.
    */
  def putCallRegOffsetPtr(reg: X86Register, offset: Double): Unit = js.native
  def putCallRegOffsetPtr(reg: X86Register, offset: Int64): Unit = js.native
  def putCallRegOffsetPtr(reg: X86Register, offset: UInt64): Unit = js.native
  
  /**
    * Puts code needed for calling a C function with the specified `args`.
    */
  def putCallRegOffsetPtrWithArguments(reg: X86Register, offset: Double, args: js.Array[X86CallArgument]): Unit = js.native
  def putCallRegOffsetPtrWithArguments(reg: X86Register, offset: Int64, args: js.Array[X86CallArgument]): Unit = js.native
  def putCallRegOffsetPtrWithArguments(reg: X86Register, offset: UInt64, args: js.Array[X86CallArgument]): Unit = js.native
  
  /**
    * Like `putCallWithArguments()`, but also
    * ensures that the argument list is aligned on a 16 byte boundary.
    */
  def putCallRegWithAlignedArguments(reg: X86Register, args: js.Array[X86CallArgument]): Unit = js.native
  
  /**
    * Puts code needed for calling a C function with the specified `args`.
    */
  def putCallRegWithArguments(reg: X86Register, args: js.Array[X86CallArgument]): Unit = js.native
  
  /**
    * Puts a CLC instruction.
    */
  def putClc(): Unit = js.native
  
  /**
    * Puts a CLD instruction.
    */
  def putCld(): Unit = js.native
  
  /**
    * Puts a CMP instruction.
    */
  def putCmpImmPtrImmU32(immPtr: NativePointerValue, immValue: Double): Unit = js.native
  
  /**
    * Puts a CMP instruction.
    */
  def putCmpRegI32(reg: X86Register, immValue: Double): Unit = js.native
  
  /**
    * Puts a CMP instruction.
    */
  def putCmpRegOffsetPtrReg(regA: X86Register, offset: Double, regB: X86Register): Unit = js.native
  def putCmpRegOffsetPtrReg(regA: X86Register, offset: Int64, regB: X86Register): Unit = js.native
  def putCmpRegOffsetPtrReg(regA: X86Register, offset: UInt64, regB: X86Register): Unit = js.native
  
  /**
    * Puts a CMP instruction.
    */
  def putCmpRegReg(regA: X86Register, regB: X86Register): Unit = js.native
  
  /**
    * Puts a CPUID instruction.
    */
  def putCpuid(): Unit = js.native
  
  /**
    * Puts a DEC instruction.
    */
  def putDecReg(reg: X86Register): Unit = js.native
  
  /**
    * Puts a DEC instruction.
    */
  def putDecRegPtr(target: X86PointerTarget, reg: X86Register): Unit = js.native
  
  /**
    * Puts an INC instruction.
    */
  def putIncReg(reg: X86Register): Unit = js.native
  
  /**
    * Puts an INC instruction.
    */
  def putIncRegPtr(target: X86PointerTarget, reg: X86Register): Unit = js.native
  
  /**
    * Puts a JCC instruction.
    */
  def putJccNear(instructionId: X86InstructionId, target: NativePointerValue, hint: X86BranchHint): Unit = js.native
  
  /**
    * Puts a JCC instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putJccNearLabel(instructionId: X86InstructionId, labelId: String, hint: X86BranchHint): Unit = js.native
  
  /**
    * Puts a JCC instruction.
    */
  def putJccShort(instructionId: X86InstructionId, target: NativePointerValue, hint: X86BranchHint): Unit = js.native
  
  /**
    * Puts a JCC instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putJccShortLabel(instructionId: X86InstructionId, labelId: String, hint: X86BranchHint): Unit = js.native
  
  /**
    * Puts a JMP instruction.
    */
  def putJmpAddress(address: NativePointerValue): Unit = js.native
  
  /**
    * Puts a JMP instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putJmpNearLabel(labelId: String): Unit = js.native
  
  /**
    * Puts a JMP instruction.
    */
  def putJmpNearPtr(address: NativePointerValue): Unit = js.native
  
  /**
    * Puts a JMP instruction.
    */
  def putJmpReg(reg: X86Register): Unit = js.native
  
  /**
    * Puts a JMP instruction.
    */
  def putJmpRegOffsetPtr(reg: X86Register, offset: Double): Unit = js.native
  def putJmpRegOffsetPtr(reg: X86Register, offset: Int64): Unit = js.native
  def putJmpRegOffsetPtr(reg: X86Register, offset: UInt64): Unit = js.native
  
  /**
    * Puts a JMP instruction.
    */
  def putJmpRegPtr(reg: X86Register): Unit = js.native
  
  /**
    * Puts a JMP instruction referencing `labelId`, defined by a past
    * or future `putLabel()`.
    */
  def putJmpShortLabel(labelId: String): Unit = js.native
  
  /**
    * Puts a label at the current position, where `id` is an identifier
    * that may be referenced in past and future `put*Label()` calls.
    */
  def putLabel(id: String): Unit = js.native
  
  /**
    * Puts a LEA instruction.
    */
  def putLeaRegRegOffset(dstReg: X86Register, srcReg: X86Register, srcOffset: Double): Unit = js.native
  def putLeaRegRegOffset(dstReg: X86Register, srcReg: X86Register, srcOffset: Int64): Unit = js.native
  def putLeaRegRegOffset(dstReg: X86Register, srcReg: X86Register, srcOffset: UInt64): Unit = js.native
  
  /**
    * Puts a LEAVE instruction.
    */
  def putLeave(): Unit = js.native
  
  /**
    * Puts an LFENCE instruction.
    */
  def putLfence(): Unit = js.native
  
  /**
    * Puts a LOCK CMPXCHG instruction.
    */
  def putLockCmpxchgRegPtrReg(dstReg: X86Register, srcReg: X86Register): Unit = js.native
  
  /**
    * Puts a LOCK DEC IMM32 instruction.
    */
  def putLockDecImm32Ptr(target: NativePointerValue): Unit = js.native
  
  /**
    * Puts a LOCK INC IMM32 instruction.
    */
  def putLockIncImm32Ptr(target: NativePointerValue): Unit = js.native
  
  /**
    * Puts a LOCK XADD instruction.
    */
  def putLockXaddRegPtrReg(dstReg: X86Register, srcReg: X86Register): Unit = js.native
  
  /**
    * Puts a MOV FS instruction.
    */
  def putMovFsU32PtrReg(fsOffset: Double, srcReg: X86Register): Unit = js.native
  
  /**
    * Puts a MOV GS instruction.
    */
  def putMovGsU32PtrReg(fsOffset: Double, srcReg: X86Register): Unit = js.native
  
  /**
    * Puts a MOV instruction.
    */
  def putMovNearPtrReg(dstAddress: NativePointerValue, srcReg: X86Register): Unit = js.native
  
  /**
    * Puts a MOV instruction.
    */
  def putMovRegAddress(dstReg: X86Register, address: NativePointerValue): Unit = js.native
  
  /**
    * Puts a MOV instruction.
    */
  def putMovRegBaseIndexScaleOffsetPtr(dstReg: X86Register, baseReg: X86Register, indexReg: X86Register, scale: Double, offset: Double): Unit = js.native
  def putMovRegBaseIndexScaleOffsetPtr(dstReg: X86Register, baseReg: X86Register, indexReg: X86Register, scale: Double, offset: Int64): Unit = js.native
  def putMovRegBaseIndexScaleOffsetPtr(dstReg: X86Register, baseReg: X86Register, indexReg: X86Register, scale: Double, offset: UInt64): Unit = js.native
  
  /**
    * Puts a MOV FS instruction.
    */
  def putMovRegFsU32Ptr(dstReg: X86Register, fsOffset: Double): Unit = js.native
  
  /**
    * Puts a MOV GS instruction.
    */
  def putMovRegGsU32Ptr(dstReg: X86Register, fsOffset: Double): Unit = js.native
  
  /**
    * Puts a MOV instruction.
    */
  def putMovRegNearPtr(dstReg: X86Register, srcAddress: NativePointerValue): Unit = js.native
  
  /**
    * Puts a MOV instruction.
    */
  def putMovRegOffsetPtrReg(dstReg: X86Register, dstOffset: Double, srcReg: X86Register): Unit = js.native
  def putMovRegOffsetPtrReg(dstReg: X86Register, dstOffset: Int64, srcReg: X86Register): Unit = js.native
  def putMovRegOffsetPtrReg(dstReg: X86Register, dstOffset: UInt64, srcReg: X86Register): Unit = js.native
  
  /**
    * Puts a MOV instruction.
    */
  def putMovRegOffsetPtrU32(dstReg: X86Register, dstOffset: Double, immValue: Double): Unit = js.native
  def putMovRegOffsetPtrU32(dstReg: X86Register, dstOffset: Int64, immValue: Double): Unit = js.native
  def putMovRegOffsetPtrU32(dstReg: X86Register, dstOffset: UInt64, immValue: Double): Unit = js.native
  
  /**
    * Puts a MOV instruction.
    */
  def putMovRegPtrReg(dstReg: X86Register, srcReg: X86Register): Unit = js.native
  
  /**
    * Puts a MOV instruction.
    */
  def putMovRegPtrU32(dstReg: X86Register, immValue: Double): Unit = js.native
  
  /**
    * Puts a MOV instruction.
    */
  def putMovRegReg(dstReg: X86Register, srcReg: X86Register): Unit = js.native
  
  /**
    * Puts a MOV instruction.
    */
  def putMovRegRegOffsetPtr(dstReg: X86Register, srcReg: X86Register, srcOffset: Double): Unit = js.native
  def putMovRegRegOffsetPtr(dstReg: X86Register, srcReg: X86Register, srcOffset: Int64): Unit = js.native
  def putMovRegRegOffsetPtr(dstReg: X86Register, srcReg: X86Register, srcOffset: UInt64): Unit = js.native
  
  /**
    * Puts a MOV instruction.
    */
  def putMovRegRegPtr(dstReg: X86Register, srcReg: X86Register): Unit = js.native
  
  /**
    * Puts a MOV instruction.
    */
  def putMovRegU32(dstReg: X86Register, immValue: Double): Unit = js.native
  
  /**
    * Puts a MOV instruction.
    */
  def putMovRegU64(dstReg: X86Register, immValue: Double): Unit = js.native
  def putMovRegU64(dstReg: X86Register, immValue: UInt64): Unit = js.native
  
  /**
    * Puts a MOVDQU EAX XMM0 instruction.
    */
  def putMovdquEaxOffsetPtrXmm0(offset: Double): Unit = js.native
  
  /**
    * Puts a MOVDQU XMM0 ESP instruction.
    */
  def putMovdquXmm0EspOffsetPtr(offset: Double): Unit = js.native
  
  /**
    * Puts a MOVQ EAX XMM0 instruction.
    */
  def putMovqEaxOffsetPtrXmm0(offset: Double): Unit = js.native
  
  /**
    * Puts a MOVQ XMM0 ESP instruction.
    */
  def putMovqXmm0EspOffsetPtr(offset: Double): Unit = js.native
  
  /**
    * Puts a NOP instruction.
    */
  def putNop(): Unit = js.native
  
  /**
    * Puts `n` NOP instructions.
    */
  def putNopPadding(n: Double): Unit = js.native
  
  /**
    * Puts `n` guard instruction.
    */
  def putPadding(n: Double): Unit = js.native
  
  /**
    * Puts a PAUSE instruction.
    */
  def putPause(): Unit = js.native
  
  /**
    * Puts a POP instruction.
    */
  def putPopReg(reg: X86Register): Unit = js.native
  
  /**
    * Puts a POPAX instruction.
    */
  def putPopax(): Unit = js.native
  
  /**
    * Puts a POPFX instruction.
    */
  def putPopfx(): Unit = js.native
  
  /**
    * Puts a PUSH instruction.
    */
  def putPushImmPtr(immPtr: NativePointerValue): Unit = js.native
  
  /**
    * Puts a PUSH instruction.
    */
  def putPushNearPtr(address: NativePointerValue): Unit = js.native
  
  /**
    * Puts a PUSH instruction.
    */
  def putPushReg(reg: X86Register): Unit = js.native
  
  /**
    * Puts a PUSH instruction.
    */
  def putPushU32(immValue: Double): Unit = js.native
  
  /**
    * Puts a PUSHAX instruction.
    */
  def putPushax(): Unit = js.native
  
  /**
    * Puts a PUSHFX instruction.
    */
  def putPushfx(): Unit = js.native
  
  /**
    * Puts an RDTSC instruction.
    */
  def putRdtsc(): Unit = js.native
  
  /**
    * Puts a RET instruction.
    */
  def putRet(): Unit = js.native
  
  /**
    * Puts a RET instruction.
    */
  def putRetImm(immValue: Double): Unit = js.native
  
  /**
    * Puts an int8.
    */
  def putS8(value: Double): Unit = js.native
  
  /**
    * Puts a SHL instruction.
    */
  def putShlRegU8(reg: X86Register, immValue: Double): Unit = js.native
  
  /**
    * Puts a SHR instruction.
    */
  def putShrRegU8(reg: X86Register, immValue: Double): Unit = js.native
  
  /**
    * Puts a STC instruction.
    */
  def putStc(): Unit = js.native
  
  /**
    * Puts a STD instruction.
    */
  def putStd(): Unit = js.native
  
  /**
    * Puts a SUB instruction.
    */
  def putSubRegImm(reg: X86Register, immValue: Double): Unit = js.native
  def putSubRegImm(reg: X86Register, immValue: Int64): Unit = js.native
  def putSubRegImm(reg: X86Register, immValue: UInt64): Unit = js.native
  
  /**
    * Puts a SUB instruction.
    */
  def putSubRegNearPtr(dstReg: X86Register, srcAddress: NativePointerValue): Unit = js.native
  
  /**
    * Puts a SUB instruction.
    */
  def putSubRegReg(dstReg: X86Register, srcReg: X86Register): Unit = js.native
  
  /**
    * Puts a TEST instruction.
    */
  def putTestRegReg(regA: X86Register, regB: X86Register): Unit = js.native
  
  /**
    * Puts a TEST instruction.
    */
  def putTestRegU32(reg: X86Register, immValue: Double): Unit = js.native
  
  /**
    * Puts a uint8.
    */
  def putU8(value: Double): Unit = js.native
  
  /**
    * Puts an XCHG instruction.
    */
  def putXchgRegRegPtr(leftReg: X86Register, rightReg: X86Register): Unit = js.native
  
  /**
    * Puts an XOR instruction.
    */
  def putXorRegReg(dstReg: X86Register, srcReg: X86Register): Unit = js.native
  
  /**
    * Recycles instance.
    */
  def reset(codeAddress: NativePointerValue): Unit = js.native
  def reset(codeAddress: NativePointerValue, options: X86WriterOptions): Unit = js.native
}
