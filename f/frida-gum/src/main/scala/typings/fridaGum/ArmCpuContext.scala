package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fridaGum.CpuContext because Already inherited */ trait ArmCpuContext
  extends StObject
     with PortableCpuContext {
  
  var lr: NativePointer
  
  var r0: NativePointer
  
  var r1: NativePointer
  
  var r10: NativePointer
  
  var r11: NativePointer
  
  var r12: NativePointer
  
  var r2: NativePointer
  
  var r3: NativePointer
  
  var r4: NativePointer
  
  var r5: NativePointer
  
  var r6: NativePointer
  
  var r7: NativePointer
  
  var r8: NativePointer
  
  var r9: NativePointer
}
object ArmCpuContext {
  
  inline def apply(
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
  ): ArmCpuContext = {
    val __obj = js.Dynamic.literal(lr = lr.asInstanceOf[js.Any], pc = pc.asInstanceOf[js.Any], r0 = r0.asInstanceOf[js.Any], r1 = r1.asInstanceOf[js.Any], r10 = r10.asInstanceOf[js.Any], r11 = r11.asInstanceOf[js.Any], r12 = r12.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any], r3 = r3.asInstanceOf[js.Any], r4 = r4.asInstanceOf[js.Any], r5 = r5.asInstanceOf[js.Any], r6 = r6.asInstanceOf[js.Any], r7 = r7.asInstanceOf[js.Any], r8 = r8.asInstanceOf[js.Any], r9 = r9.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmCpuContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArmCpuContext] (val x: Self) extends AnyVal {
    
    inline def setLr(value: NativePointer): Self = StObject.set(x, "lr", value.asInstanceOf[js.Any])
    
    inline def setR0(value: NativePointer): Self = StObject.set(x, "r0", value.asInstanceOf[js.Any])
    
    inline def setR1(value: NativePointer): Self = StObject.set(x, "r1", value.asInstanceOf[js.Any])
    
    inline def setR10(value: NativePointer): Self = StObject.set(x, "r10", value.asInstanceOf[js.Any])
    
    inline def setR11(value: NativePointer): Self = StObject.set(x, "r11", value.asInstanceOf[js.Any])
    
    inline def setR12(value: NativePointer): Self = StObject.set(x, "r12", value.asInstanceOf[js.Any])
    
    inline def setR2(value: NativePointer): Self = StObject.set(x, "r2", value.asInstanceOf[js.Any])
    
    inline def setR3(value: NativePointer): Self = StObject.set(x, "r3", value.asInstanceOf[js.Any])
    
    inline def setR4(value: NativePointer): Self = StObject.set(x, "r4", value.asInstanceOf[js.Any])
    
    inline def setR5(value: NativePointer): Self = StObject.set(x, "r5", value.asInstanceOf[js.Any])
    
    inline def setR6(value: NativePointer): Self = StObject.set(x, "r6", value.asInstanceOf[js.Any])
    
    inline def setR7(value: NativePointer): Self = StObject.set(x, "r7", value.asInstanceOf[js.Any])
    
    inline def setR8(value: NativePointer): Self = StObject.set(x, "r8", value.asInstanceOf[js.Any])
    
    inline def setR9(value: NativePointer): Self = StObject.set(x, "r9", value.asInstanceOf[js.Any])
  }
}
