package typings.fridaGum.ObjC

import typings.fridaGum.NativePointer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyInstance extends StObject {
  
  var handle: NativePointer
}
object ProxyInstance {
  
  inline def apply(handle: NativePointer): ProxyInstance = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyInstance]
  }
  
  extension [Self <: ProxyInstance](x: Self) {
    
    inline def setHandle(value: NativePointer): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
  }
}
