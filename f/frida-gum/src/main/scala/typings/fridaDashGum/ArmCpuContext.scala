package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fridaDashGum.CpuContext because Already inherited */ trait ArmCpuContext extends PortableCpuContext {
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
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(lr = lr, pc = pc, r0 = r0, r1 = r1, r10 = r10, r11 = r11, r12 = r12, r2 = r2, r3 = r3, r4 = r4, r5 = r5, r6 = r6, r7 = r7, r8 = r8, r9 = r9, sp = sp)
  
    __obj.asInstanceOf[ArmCpuContext]
  }
}

