package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fridaGum.CpuContext because Already inherited */ @js.native
trait Arm64CpuContext extends PortableCpuContext {
  
  var fp: NativePointer = js.native
  
  var lr: NativePointer = js.native
  
  var x0: NativePointer = js.native
  
  var x1: NativePointer = js.native
  
  var x10: NativePointer = js.native
  
  var x11: NativePointer = js.native
  
  var x12: NativePointer = js.native
  
  var x13: NativePointer = js.native
  
  var x14: NativePointer = js.native
  
  var x15: NativePointer = js.native
  
  var x16: NativePointer = js.native
  
  var x17: NativePointer = js.native
  
  var x18: NativePointer = js.native
  
  var x19: NativePointer = js.native
  
  var x2: NativePointer = js.native
  
  var x20: NativePointer = js.native
  
  var x21: NativePointer = js.native
  
  var x22: NativePointer = js.native
  
  var x23: NativePointer = js.native
  
  var x24: NativePointer = js.native
  
  var x25: NativePointer = js.native
  
  var x26: NativePointer = js.native
  
  var x27: NativePointer = js.native
  
  var x28: NativePointer = js.native
  
  var x3: NativePointer = js.native
  
  var x4: NativePointer = js.native
  
  var x5: NativePointer = js.native
  
  var x6: NativePointer = js.native
  
  var x7: NativePointer = js.native
  
  var x8: NativePointer = js.native
  
  var x9: NativePointer = js.native
}
object Arm64CpuContext {
  
  @scala.inline
  def apply(
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
  ): Arm64CpuContext = {
    val __obj = js.Dynamic.literal(fp = fp.asInstanceOf[js.Any], lr = lr.asInstanceOf[js.Any], pc = pc.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x10 = x10.asInstanceOf[js.Any], x11 = x11.asInstanceOf[js.Any], x12 = x12.asInstanceOf[js.Any], x13 = x13.asInstanceOf[js.Any], x14 = x14.asInstanceOf[js.Any], x15 = x15.asInstanceOf[js.Any], x16 = x16.asInstanceOf[js.Any], x17 = x17.asInstanceOf[js.Any], x18 = x18.asInstanceOf[js.Any], x19 = x19.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], x20 = x20.asInstanceOf[js.Any], x21 = x21.asInstanceOf[js.Any], x22 = x22.asInstanceOf[js.Any], x23 = x23.asInstanceOf[js.Any], x24 = x24.asInstanceOf[js.Any], x25 = x25.asInstanceOf[js.Any], x26 = x26.asInstanceOf[js.Any], x27 = x27.asInstanceOf[js.Any], x28 = x28.asInstanceOf[js.Any], x3 = x3.asInstanceOf[js.Any], x4 = x4.asInstanceOf[js.Any], x5 = x5.asInstanceOf[js.Any], x6 = x6.asInstanceOf[js.Any], x7 = x7.asInstanceOf[js.Any], x8 = x8.asInstanceOf[js.Any], x9 = x9.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64CpuContext]
  }
  
  @scala.inline
  implicit class Arm64CpuContextOps[Self <: Arm64CpuContext] (val x: Self) extends AnyVal {
    
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
    def setFp(value: NativePointer): Self = this.set("fp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLr(value: NativePointer): Self = this.set("lr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX0(value: NativePointer): Self = this.set("x0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1(value: NativePointer): Self = this.set("x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX10(value: NativePointer): Self = this.set("x10", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX11(value: NativePointer): Self = this.set("x11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX12(value: NativePointer): Self = this.set("x12", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX13(value: NativePointer): Self = this.set("x13", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX14(value: NativePointer): Self = this.set("x14", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX15(value: NativePointer): Self = this.set("x15", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX16(value: NativePointer): Self = this.set("x16", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX17(value: NativePointer): Self = this.set("x17", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX18(value: NativePointer): Self = this.set("x18", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX19(value: NativePointer): Self = this.set("x19", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2(value: NativePointer): Self = this.set("x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX20(value: NativePointer): Self = this.set("x20", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX21(value: NativePointer): Self = this.set("x21", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX22(value: NativePointer): Self = this.set("x22", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX23(value: NativePointer): Self = this.set("x23", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX24(value: NativePointer): Self = this.set("x24", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX25(value: NativePointer): Self = this.set("x25", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX26(value: NativePointer): Self = this.set("x26", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX27(value: NativePointer): Self = this.set("x27", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX28(value: NativePointer): Self = this.set("x28", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX3(value: NativePointer): Self = this.set("x3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX4(value: NativePointer): Self = this.set("x4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX5(value: NativePointer): Self = this.set("x5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX6(value: NativePointer): Self = this.set("x6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX7(value: NativePointer): Self = this.set("x7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX8(value: NativePointer): Self = this.set("x8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX9(value: NativePointer): Self = this.set("x9", value.asInstanceOf[js.Any])
  }
}
