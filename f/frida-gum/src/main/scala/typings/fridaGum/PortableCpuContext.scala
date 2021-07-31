package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortableCpuContext
  extends StObject
     with CpuContext {
  
  var pc: NativePointer
  
  var sp: NativePointer
}
object PortableCpuContext {
  
  @scala.inline
  def apply(pc: NativePointer, sp: NativePointer): PortableCpuContext = {
    val __obj = js.Dynamic.literal(pc = pc.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortableCpuContext]
  }
  
  @scala.inline
  implicit class PortableCpuContextMutableBuilder[Self <: PortableCpuContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPc(value: NativePointer): Self = StObject.set(x, "pc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSp(value: NativePointer): Self = StObject.set(x, "sp", value.asInstanceOf[js.Any])
  }
}
