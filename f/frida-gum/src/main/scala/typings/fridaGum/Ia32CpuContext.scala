package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fridaGum.CpuContext because Already inherited */ trait Ia32CpuContext extends PortableCpuContext {
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
    val __obj = js.Dynamic.literal(eax = eax.asInstanceOf[js.Any], ebp = ebp.asInstanceOf[js.Any], ebx = ebx.asInstanceOf[js.Any], ecx = ecx.asInstanceOf[js.Any], edi = edi.asInstanceOf[js.Any], edx = edx.asInstanceOf[js.Any], eip = eip.asInstanceOf[js.Any], esi = esi.asInstanceOf[js.Any], esp = esp.asInstanceOf[js.Any], pc = pc.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ia32CpuContext]
  }
}

