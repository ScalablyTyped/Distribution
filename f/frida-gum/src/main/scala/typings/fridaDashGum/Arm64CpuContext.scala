package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fridaDashGum.CpuContext because Already inherited */ trait Arm64CpuContext extends PortableCpuContext {
  var fp: NativePointer
  var lr: NativePointer
  var x0: NativePointer
  var x1: NativePointer
  var x10: NativePointer
  var x11: NativePointer
  var x12: NativePointer
  var x13: NativePointer
  var x14: NativePointer
  var x15: NativePointer
  var x16: NativePointer
  var x17: NativePointer
  var x18: NativePointer
  var x19: NativePointer
  var x2: NativePointer
  var x20: NativePointer
  var x21: NativePointer
  var x22: NativePointer
  var x23: NativePointer
  var x24: NativePointer
  var x25: NativePointer
  var x26: NativePointer
  var x27: NativePointer
  var x28: NativePointer
  var x3: NativePointer
  var x4: NativePointer
  var x5: NativePointer
  var x6: NativePointer
  var x7: NativePointer
  var x8: NativePointer
  var x9: NativePointer
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
    val __obj = js.Dynamic.literal(fp = fp, lr = lr, pc = pc, sp = sp, x0 = x0, x1 = x1, x10 = x10, x11 = x11, x12 = x12, x13 = x13, x14 = x14, x15 = x15, x16 = x16, x17 = x17, x18 = x18, x19 = x19, x2 = x2, x20 = x20, x21 = x21, x22 = x22, x23 = x23, x24 = x24, x25 = x25, x26 = x26, x27 = x27, x28 = x28, x3 = x3, x4 = x4, x5 = x5, x6 = x6, x7 = x7, x8 = x8, x9 = x9)
  
    __obj.asInstanceOf[Arm64CpuContext]
  }
}

