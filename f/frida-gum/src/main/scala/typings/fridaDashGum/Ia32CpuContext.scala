package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fridaDashGum.CpuContext because Already inherited */ trait Ia32CpuContext extends PortableCpuContext {
  var eax: NativePointer
  var ebp: NativePointer
  var ebx: NativePointer
  var ecx: NativePointer
  var edi: NativePointer
  var edx: NativePointer
  var eip: NativePointer
  var esi: NativePointer
  var esp: NativePointer
}

object Ia32CpuContext {
  @scala.inline
  def apply(
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
  ): Ia32CpuContext = {
    val __obj = js.Dynamic.literal(eax = eax, ebp = ebp, ebx = ebx, ecx = ecx, edi = edi, edx = edx, eip = eip, esi = esi, esp = esp, pc = pc, sp = sp)
  
    __obj.asInstanceOf[Ia32CpuContext]
  }
}

