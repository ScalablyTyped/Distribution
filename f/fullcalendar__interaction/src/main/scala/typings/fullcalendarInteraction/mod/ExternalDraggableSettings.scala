package typings.fullcalendarInteraction.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalDraggableSettings extends StObject {
  
  var appendTo: js.UndefOr[HTMLElement] = js.undefined
  
  var eventData: js.UndefOr[DragMetaGenerator] = js.undefined
  
  var itemSelector: js.UndefOr[String] = js.undefined
  
  var longPressDelay: js.UndefOr[Double] = js.undefined
  
  var minDistance: js.UndefOr[Double] = js.undefined
}
object ExternalDraggableSettings {
  
  inline def apply(): ExternalDraggableSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalDraggableSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExternalDraggableSettings] (val x: Self) extends AnyVal {
    
    inline def setAppendTo(value: HTMLElement): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    inline def setEventData(value: DragMetaGenerator): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
    
    inline def setEventDataFunction1(
      value: /* el */ HTMLElement => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DragMetaInput */ Any
    ): Self = StObject.set(x, "eventData", js.Any.fromFunction1(value))
    
    inline def setEventDataUndefined: Self = StObject.set(x, "eventData", js.undefined)
    
    inline def setItemSelector(value: String): Self = StObject.set(x, "itemSelector", value.asInstanceOf[js.Any])
    
    inline def setItemSelectorUndefined: Self = StObject.set(x, "itemSelector", js.undefined)
    
    inline def setLongPressDelay(value: Double): Self = StObject.set(x, "longPressDelay", value.asInstanceOf[js.Any])
    
    inline def setLongPressDelayUndefined: Self = StObject.set(x, "longPressDelay", js.undefined)
    
    inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
    
    inline def setMinDistanceUndefined: Self = StObject.set(x, "minDistance", js.undefined)
  }
}
