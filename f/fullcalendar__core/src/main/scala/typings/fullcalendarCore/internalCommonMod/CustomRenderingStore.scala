package typings.fullcalendarCore.internalCommonMod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomRenderingStore[RenderProps]
  extends StObject
     with Store[Map[String, CustomRendering[RenderProps]]] {
  
  def handle(customRendering: CustomRendering[RenderProps]): Unit
  
  /* private */ var map: Any
}
object CustomRenderingStore {
  
  inline def apply[RenderProps](
    currentValue: Any,
    handle: CustomRendering[RenderProps] => Unit,
    handlers: Any,
    map: Any,
    set: Map[String, CustomRendering[RenderProps]] => Unit,
    subscribe: js.Function1[Map[String, CustomRendering[RenderProps]], Unit] => Unit
  ): CustomRenderingStore[RenderProps] = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], handle = js.Any.fromFunction1(handle), handlers = handlers.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[CustomRenderingStore[RenderProps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomRenderingStore[?], RenderProps] (val x: Self & CustomRenderingStore[RenderProps]) extends AnyVal {
    
    inline def setHandle(value: CustomRendering[RenderProps] => Unit): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
    
    inline def setMap(value: Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
  }
}
