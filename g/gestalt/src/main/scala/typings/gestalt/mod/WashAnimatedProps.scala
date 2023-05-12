package typings.gestalt.mod

import typings.gestalt.anon.Event
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WashAnimatedProps extends StObject {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var image: js.UndefOr[Node] = js.undefined
  
  var onMouseEnter: js.UndefOr[AbstractEventHandler[MouseEvent[HTMLDivElement, NativeMouseEvent], js.Object]] = js.undefined
  
  var onMouseLeave: js.UndefOr[AbstractEventHandler[MouseEvent[HTMLDivElement, NativeMouseEvent], js.Object]] = js.undefined
}
object WashAnimatedProps {
  
  inline def apply(): WashAnimatedProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WashAnimatedProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WashAnimatedProps] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setImage(value: Node): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setOnMouseEnter(value: /* arg */ js.Object & (Event[MouseEvent[HTMLDivElement, NativeMouseEvent]]) => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: /* arg */ js.Object & (Event[MouseEvent[HTMLDivElement, NativeMouseEvent]]) => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
  }
}
