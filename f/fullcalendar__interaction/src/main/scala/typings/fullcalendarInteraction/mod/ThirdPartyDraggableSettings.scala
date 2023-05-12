package typings.fullcalendarInteraction.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThirdPartyDraggableSettings extends StObject {
  
  var eventData: js.UndefOr[DragMetaGenerator] = js.undefined
  
  var itemSelector: js.UndefOr[String] = js.undefined
  
  var mirrorSelector: js.UndefOr[String] = js.undefined
}
object ThirdPartyDraggableSettings {
  
  inline def apply(): ThirdPartyDraggableSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyDraggableSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThirdPartyDraggableSettings] (val x: Self) extends AnyVal {
    
    inline def setEventData(value: DragMetaGenerator): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
    
    inline def setEventDataFunction1(
      value: /* el */ HTMLElement => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DragMetaInput */ Any
    ): Self = StObject.set(x, "eventData", js.Any.fromFunction1(value))
    
    inline def setEventDataUndefined: Self = StObject.set(x, "eventData", js.undefined)
    
    inline def setItemSelector(value: String): Self = StObject.set(x, "itemSelector", value.asInstanceOf[js.Any])
    
    inline def setItemSelectorUndefined: Self = StObject.set(x, "itemSelector", js.undefined)
    
    inline def setMirrorSelector(value: String): Self = StObject.set(x, "mirrorSelector", value.asInstanceOf[js.Any])
    
    inline def setMirrorSelectorUndefined: Self = StObject.set(x, "mirrorSelector", js.undefined)
  }
}
