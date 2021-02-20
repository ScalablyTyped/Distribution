package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fridaGum.CpuContext because Already inherited */ @js.native
trait Ia32CpuContext extends PortableCpuContext {
  
  var eax: NativePointer = js.native
  
  var ebp: NativePointer = js.native
  
  var ebx: NativePointer = js.native
  
  var ecx: NativePointer = js.native
  
  var edi: NativePointer = js.native
  
  var edx: NativePointer = js.native
  
  var eip: NativePointer = js.native
  
  var esi: NativePointer = js.native
  
  var esp: NativePointer = js.native
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
  
  @scala.inline
  implicit class Ia32CpuContextMutableBuilder[Self <: Ia32CpuContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEax(value: NativePointer): Self = StObject.set(x, "eax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbp(value: NativePointer): Self = StObject.set(x, "ebp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbx(value: NativePointer): Self = StObject.set(x, "ebx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcx(value: NativePointer): Self = StObject.set(x, "ecx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdi(value: NativePointer): Self = StObject.set(x, "edi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdx(value: NativePointer): Self = StObject.set(x, "edx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEip(value: NativePointer): Self = StObject.set(x, "eip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEsi(value: NativePointer): Self = StObject.set(x, "esi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEsp(value: NativePointer): Self = StObject.set(x, "esp", value.asInstanceOf[js.Any])
  }
}
