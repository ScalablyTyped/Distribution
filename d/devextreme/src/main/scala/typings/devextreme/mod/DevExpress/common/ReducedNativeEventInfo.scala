package typings.devextreme.mod.DevExpress.common

import typings.devextreme.mod.DevExpress.common.grids.GridBase
import typings.devextreme.mod.DevExpress.events.DxEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<devextreme.devextreme.DevExpress.events.NativeEventInfo<TComponent, std.PointerEvent | std.MouseEvent | std.TouchEvent>, 'component' | 'event'>> */
trait ReducedNativeEventInfo[TComponent /* <: GridBase[Any, Any] */] extends StObject {
  
  var component: TComponent
  
  var event: DxEvent[PointerEvent | MouseEvent | TouchEvent]
}
object ReducedNativeEventInfo {
  
  inline def apply[TComponent /* <: GridBase[Any, Any] */](component: TComponent, event: DxEvent[PointerEvent | MouseEvent | TouchEvent]): ReducedNativeEventInfo[TComponent] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReducedNativeEventInfo[TComponent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReducedNativeEventInfo[?], TComponent /* <: GridBase[Any, Any] */] (val x: Self & ReducedNativeEventInfo[TComponent]) extends AnyVal {
    
    inline def setComponent(value: TComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: DxEvent[PointerEvent | MouseEvent | TouchEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
