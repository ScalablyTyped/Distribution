package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectWrapper
  extends StObject
     with NativePointerValue {
  
  var handle: NativePointer
}
object ObjectWrapper {
  
  inline def apply(handle: NativePointer): ObjectWrapper = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectWrapper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectWrapper] (val x: Self) extends AnyVal {
    
    inline def setHandle(value: NativePointer): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
  }
}
