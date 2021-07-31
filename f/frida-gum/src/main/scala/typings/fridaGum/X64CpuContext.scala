package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fridaGum.CpuContext because Already inherited */ trait X64CpuContext
  extends StObject
     with PortableCpuContext {
  
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
  
  @scala.inline
  implicit class X64CpuContextMutableBuilder[Self <: X64CpuContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setR10(value: NativePointer): Self = StObject.set(x, "r10", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR11(value: NativePointer): Self = StObject.set(x, "r11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR12(value: NativePointer): Self = StObject.set(x, "r12", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR13(value: NativePointer): Self = StObject.set(x, "r13", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR14(value: NativePointer): Self = StObject.set(x, "r14", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR15(value: NativePointer): Self = StObject.set(x, "r15", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR8(value: NativePointer): Self = StObject.set(x, "r8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR9(value: NativePointer): Self = StObject.set(x, "r9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRax(value: NativePointer): Self = StObject.set(x, "rax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRbp(value: NativePointer): Self = StObject.set(x, "rbp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRbx(value: NativePointer): Self = StObject.set(x, "rbx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRcx(value: NativePointer): Self = StObject.set(x, "rcx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdi(value: NativePointer): Self = StObject.set(x, "rdi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdx(value: NativePointer): Self = StObject.set(x, "rdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRip(value: NativePointer): Self = StObject.set(x, "rip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsi(value: NativePointer): Self = StObject.set(x, "rsi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsp(value: NativePointer): Self = StObject.set(x, "rsp", value.asInstanceOf[js.Any])
  }
}
