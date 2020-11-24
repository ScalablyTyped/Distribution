package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fridaGum.CpuContext because Already inherited */ @js.native
trait X64CpuContext extends PortableCpuContext {
  
  var r10: NativePointer = js.native
  
  var r11: NativePointer = js.native
  
  var r12: NativePointer = js.native
  
  var r13: NativePointer = js.native
  
  var r14: NativePointer = js.native
  
  var r15: NativePointer = js.native
  
  var r8: NativePointer = js.native
  
  var r9: NativePointer = js.native
  
  var rax: NativePointer = js.native
  
  var rbp: NativePointer = js.native
  
  var rbx: NativePointer = js.native
  
  var rcx: NativePointer = js.native
  
  var rdi: NativePointer = js.native
  
  var rdx: NativePointer = js.native
  
  var rip: NativePointer = js.native
  
  var rsi: NativePointer = js.native
  
  var rsp: NativePointer = js.native
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
  
  @scala.inline
  implicit class X64CpuContextOps[Self <: X64CpuContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setR10(value: NativePointer): Self = this.set("r10", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR11(value: NativePointer): Self = this.set("r11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR12(value: NativePointer): Self = this.set("r12", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR13(value: NativePointer): Self = this.set("r13", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR14(value: NativePointer): Self = this.set("r14", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR15(value: NativePointer): Self = this.set("r15", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR8(value: NativePointer): Self = this.set("r8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR9(value: NativePointer): Self = this.set("r9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRax(value: NativePointer): Self = this.set("rax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRbp(value: NativePointer): Self = this.set("rbp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRbx(value: NativePointer): Self = this.set("rbx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRcx(value: NativePointer): Self = this.set("rcx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdi(value: NativePointer): Self = this.set("rdi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdx(value: NativePointer): Self = this.set("rdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRip(value: NativePointer): Self = this.set("rip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsi(value: NativePointer): Self = this.set("rsi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsp(value: NativePointer): Self = this.set("rsp", value.asInstanceOf[js.Any])
  }
}
