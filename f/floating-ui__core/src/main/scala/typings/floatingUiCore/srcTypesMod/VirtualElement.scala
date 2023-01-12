package typings.floatingUiCore.srcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualElement extends StObject {
  
  var contextElement: js.UndefOr[Any] = js.undefined
  
  def getBoundingClientRect(): ClientRectObject
}
object VirtualElement {
  
  inline def apply(getBoundingClientRect: () => ClientRectObject): VirtualElement = {
    val __obj = js.Dynamic.literal(getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect))
    __obj.asInstanceOf[VirtualElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualElement] (val x: Self) extends AnyVal {
    
    inline def setContextElement(value: Any): Self = StObject.set(x, "contextElement", value.asInstanceOf[js.Any])
    
    inline def setContextElementUndefined: Self = StObject.set(x, "contextElement", js.undefined)
    
    inline def setGetBoundingClientRect(value: () => ClientRectObject): Self = StObject.set(x, "getBoundingClientRect", js.Any.fromFunction0(value))
  }
}
