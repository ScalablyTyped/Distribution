package typings.fridaGum.ObjC

import typings.fridaGum.NativePointer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyInstance extends StObject {
  
  var handle: NativePointer = js.native
}
object ProxyInstance {
  
  @scala.inline
  def apply(handle: NativePointer): ProxyInstance = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyInstance]
  }
  
  @scala.inline
  implicit class ProxyInstanceMutableBuilder[Self <: ProxyInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandle(value: NativePointer): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
  }
}
