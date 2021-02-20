package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectWrapper extends NativePointerValue {
  
  var handle: NativePointer = js.native
}
object ObjectWrapper {
  
  @scala.inline
  def apply(handle: NativePointer): ObjectWrapper = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectWrapper]
  }
  
  @scala.inline
  implicit class ObjectWrapperMutableBuilder[Self <: ObjectWrapper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandle(value: NativePointer): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
  }
}
