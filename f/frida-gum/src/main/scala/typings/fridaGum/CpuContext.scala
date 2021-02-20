package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.PortableCpuContext
  - typings.fridaGum.Ia32CpuContext
  - typings.fridaGum.X64CpuContext
  - typings.fridaGum.ArmCpuContext
  - typings.fridaGum.Arm64CpuContext
  - typings.fridaGum.MipsCpuContext
*/
trait CpuContext extends StObject
object CpuContext {
  
  @scala.inline
  def Arm64CpuContext(
    fp: NativePointer,
    lr: NativePointer,
    pc: NativePointer,
    sp: NativePointer,
    x0: NativePointer,
    x1: NativePointer,
    x10: NativePointer,
    x11: NativePointer,
    x12: NativePointer,
    x13: NativePointer,
    x14: NativePointer,
    x15: NativePointer,
    x16: NativePointer,
    x17: NativePointer,
    x18: NativePointer,
    x19: NativePointer,
    x2: NativePointer,
    x20: NativePointer,
    x21: NativePointer,
    x22: NativePointer,
    x23: NativePointer,
    x24: NativePointer,
    x25: NativePointer,
    x26: NativePointer,
    x27: NativePointer,
    x28: NativePointer,
    x3: NativePointer,
    x4: NativePointer,
    x5: NativePointer,
    x6: NativePointer,
    x7: NativePointer,
    x8: NativePointer,
    x9: NativePointer
  ): typings.fridaGum.Arm64CpuContext = {
    val __obj = js.Dynamic.literal(fp = fp.asInstanceOf[js.Any], lr = lr.asInstanceOf[js.Any], pc = pc.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x10 = x10.asInstanceOf[js.Any], x11 = x11.asInstanceOf[js.Any], x12 = x12.asInstanceOf[js.Any], x13 = x13.asInstanceOf[js.Any], x14 = x14.asInstanceOf[js.Any], x15 = x15.asInstanceOf[js.Any], x16 = x16.asInstanceOf[js.Any], x17 = x17.asInstanceOf[js.Any], x18 = x18.asInstanceOf[js.Any], x19 = x19.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], x20 = x20.asInstanceOf[js.Any], x21 = x21.asInstanceOf[js.Any], x22 = x22.asInstanceOf[js.Any], x23 = x23.asInstanceOf[js.Any], x24 = x24.asInstanceOf[js.Any], x25 = x25.asInstanceOf[js.Any], x26 = x26.asInstanceOf[js.Any], x27 = x27.asInstanceOf[js.Any], x28 = x28.asInstanceOf[js.Any], x3 = x3.asInstanceOf[js.Any], x4 = x4.asInstanceOf[js.Any], x5 = x5.asInstanceOf[js.Any], x6 = x6.asInstanceOf[js.Any], x7 = x7.asInstanceOf[js.Any], x8 = x8.asInstanceOf[js.Any], x9 = x9.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.Arm64CpuContext]
  }
  
  @scala.inline
  def ArmCpuContext(
    lr: NativePointer,
    pc: NativePointer,
    r0: NativePointer,
    r1: NativePointer,
    r10: NativePointer,
    r11: NativePointer,
    r12: NativePointer,
    r2: NativePointer,
    r3: NativePointer,
    r4: NativePointer,
    r5: NativePointer,
    r6: NativePointer,
    r7: NativePointer,
    r8: NativePointer,
    r9: NativePointer,
    sp: NativePointer
  ): typings.fridaGum.ArmCpuContext = {
    val __obj = js.Dynamic.literal(lr = lr.asInstanceOf[js.Any], pc = pc.asInstanceOf[js.Any], r0 = r0.asInstanceOf[js.Any], r1 = r1.asInstanceOf[js.Any], r10 = r10.asInstanceOf[js.Any], r11 = r11.asInstanceOf[js.Any], r12 = r12.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any], r3 = r3.asInstanceOf[js.Any], r4 = r4.asInstanceOf[js.Any], r5 = r5.asInstanceOf[js.Any], r6 = r6.asInstanceOf[js.Any], r7 = r7.asInstanceOf[js.Any], r8 = r8.asInstanceOf[js.Any], r9 = r9.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.ArmCpuContext]
  }
  
  @scala.inline
  def Ia32CpuContext(
    eax: NativePointer,
    ebp: NativePointer,
    ebx: NativePointer,
    ecx: NativePointer,
    edi: NativePointer,
    edx: NativePointer,
    eip: NativePointer,
    esi: NativePointer,
    esp: NativePointer,
    pc: NativePointer,
    sp: NativePointer
  ): typings.fridaGum.Ia32CpuContext = {
    val __obj = js.Dynamic.literal(eax = eax.asInstanceOf[js.Any], ebp = ebp.asInstanceOf[js.Any], ebx = ebx.asInstanceOf[js.Any], ecx = ecx.asInstanceOf[js.Any], edi = edi.asInstanceOf[js.Any], edx = edx.asInstanceOf[js.Any], eip = eip.asInstanceOf[js.Any], esi = esi.asInstanceOf[js.Any], esp = esp.asInstanceOf[js.Any], pc = pc.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.Ia32CpuContext]
  }
  
  @scala.inline
  def MipsCpuContext(
    a0: NativePointer,
    a1: NativePointer,
    a2: NativePointer,
    a3: NativePointer,
    at: NativePointer,
    fp: NativePointer,
    gp: NativePointer,
    hi: NativePointer,
    k0: NativePointer,
    k1: NativePointer,
    lo: NativePointer,
    pc: NativePointer,
    ra: NativePointer,
    s0: NativePointer,
    s1: NativePointer,
    s2: NativePointer,
    s3: NativePointer,
    s4: NativePointer,
    s5: NativePointer,
    s6: NativePointer,
    s7: NativePointer,
    sp: NativePointer,
    t0: NativePointer,
    t1: NativePointer,
    t2: NativePointer,
    t3: NativePointer,
    t4: NativePointer,
    t5: NativePointer,
    t6: NativePointer,
    t7: NativePointer,
    t8: NativePointer,
    t9: NativePointer,
    v0: NativePointer,
    v1: NativePointer
  ): typings.fridaGum.MipsCpuContext = {
    val __obj = js.Dynamic.literal(a0 = a0.asInstanceOf[js.Any], a1 = a1.asInstanceOf[js.Any], a2 = a2.asInstanceOf[js.Any], a3 = a3.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], fp = fp.asInstanceOf[js.Any], gp = gp.asInstanceOf[js.Any], hi = hi.asInstanceOf[js.Any], k0 = k0.asInstanceOf[js.Any], k1 = k1.asInstanceOf[js.Any], lo = lo.asInstanceOf[js.Any], pc = pc.asInstanceOf[js.Any], ra = ra.asInstanceOf[js.Any], s0 = s0.asInstanceOf[js.Any], s1 = s1.asInstanceOf[js.Any], s2 = s2.asInstanceOf[js.Any], s3 = s3.asInstanceOf[js.Any], s4 = s4.asInstanceOf[js.Any], s5 = s5.asInstanceOf[js.Any], s6 = s6.asInstanceOf[js.Any], s7 = s7.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any], t0 = t0.asInstanceOf[js.Any], t1 = t1.asInstanceOf[js.Any], t2 = t2.asInstanceOf[js.Any], t3 = t3.asInstanceOf[js.Any], t4 = t4.asInstanceOf[js.Any], t5 = t5.asInstanceOf[js.Any], t6 = t6.asInstanceOf[js.Any], t7 = t7.asInstanceOf[js.Any], t8 = t8.asInstanceOf[js.Any], t9 = t9.asInstanceOf[js.Any], v0 = v0.asInstanceOf[js.Any], v1 = v1.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.MipsCpuContext]
  }
  
  @scala.inline
  def PortableCpuContext(pc: NativePointer, sp: NativePointer): typings.fridaGum.PortableCpuContext = {
    val __obj = js.Dynamic.literal(pc = pc.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.PortableCpuContext]
  }
  
  @scala.inline
  def X64CpuContext(
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
  ): typings.fridaGum.X64CpuContext = {
    val __obj = js.Dynamic.literal(pc = pc.asInstanceOf[js.Any], r10 = r10.asInstanceOf[js.Any], r11 = r11.asInstanceOf[js.Any], r12 = r12.asInstanceOf[js.Any], r13 = r13.asInstanceOf[js.Any], r14 = r14.asInstanceOf[js.Any], r15 = r15.asInstanceOf[js.Any], r8 = r8.asInstanceOf[js.Any], r9 = r9.asInstanceOf[js.Any], rax = rax.asInstanceOf[js.Any], rbp = rbp.asInstanceOf[js.Any], rbx = rbx.asInstanceOf[js.Any], rcx = rcx.asInstanceOf[js.Any], rdi = rdi.asInstanceOf[js.Any], rdx = rdx.asInstanceOf[js.Any], rip = rip.asInstanceOf[js.Any], rsi = rsi.asInstanceOf[js.Any], rsp = rsp.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.X64CpuContext]
  }
}
