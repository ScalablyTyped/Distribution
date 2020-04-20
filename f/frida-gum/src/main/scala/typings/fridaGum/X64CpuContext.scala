package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fridaGum.CpuContext because Already inherited */ trait X64CpuContext extends PortableCpuContext {
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
    val __obj = js.Dynamic.literal(pc = pc.asInstanceOf[js.Any], r10 = r10.asInstanceOf[js.Any], r11 = r11.asInstanceOf[js.Any], r12 = r12.asInstanceOf[js.Any], r13 = r13.asInstanceOf[js.Any], r14 = r14.asInstanceOf[js.Any], r15 = r15.asInstanceOf[js.Any], r8 = r8.asInstanceOf[js.Any], r9 = r9.asInstanceOf[js.Any], rax = rax.asInstanceOf[js.Any], rbp = rbp.asInstanceOf[js.Any], rbx = rbx.asInstanceOf[js.Any], rcx = rcx.asInstanceOf[js.Any], rdi = rdi.asInstanceOf[js.Any], rdx = rdx.asInstanceOf[js.Any], rip = rip.asInstanceOf[js.Any], rsi = rsi.asInstanceOf[js.Any], rsp = rsp.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any])
    __obj.asInstanceOf[X64CpuContext]
  }
}

