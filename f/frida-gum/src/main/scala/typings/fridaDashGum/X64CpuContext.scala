package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fridaDashGum.CpuContext because Already inherited */ trait X64CpuContext extends PortableCpuContext {
  var r10: NativePointer
  var r11: NativePointer
  var r12: NativePointer
  var r13: NativePointer
  var r14: NativePointer
  var r15: NativePointer
  var r8: NativePointer
  var r9: NativePointer
  var rax: NativePointer
  var rbp: NativePointer
  var rbx: NativePointer
  var rcx: NativePointer
  var rdi: NativePointer
  var rdx: NativePointer
  var rip: NativePointer
  var rsi: NativePointer
  var rsp: NativePointer
}

object X64CpuContext {
  @scala.inline
  def apply(
    pc: NativePointer,
    r10: NativePointer,
    r11: NativePointer,
    r12: NativePointer,
    r13: NativePointer,
    r14: NativePointer,
    r15: NativePointer,
    r8: NativePointer,
    r9: NativePointer,
    rax: NativePointer,
    rbp: NativePointer,
    rbx: NativePointer,
    rcx: NativePointer,
    rdi: NativePointer,
    rdx: NativePointer,
    rip: NativePointer,
    rsi: NativePointer,
    rsp: NativePointer,
    sp: NativePointer
  ): X64CpuContext = {
    val __obj = js.Dynamic.literal(pc = pc, r10 = r10, r11 = r11, r12 = r12, r13 = r13, r14 = r14, r15 = r15, r8 = r8, r9 = r9, rax = rax, rbp = rbp, rbx = rbx, rcx = rcx, rdi = rdi, rdx = rdx, rip = rip, rsi = rsi, rsp = rsp, sp = sp)
  
    __obj.asInstanceOf[X64CpuContext]
  }
}

