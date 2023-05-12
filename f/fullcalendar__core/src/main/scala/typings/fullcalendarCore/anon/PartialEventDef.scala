package typings.fullcalendarCore.anon

import typings.fullcalendarCore.internalCommonMod.Dictionary
import typings.fullcalendarCore.internalCommonMod.EventUi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@fullcalendar/core.@fullcalendar/core/internal-common.EventDef> */
trait PartialEventDef extends StObject {
  
  var allDay: js.UndefOr[Boolean] = js.undefined
  
  var defId: js.UndefOr[String] = js.undefined
  
  var extendedProps: js.UndefOr[Dictionary] = js.undefined
  
  var groupId: js.UndefOr[String] = js.undefined
  
  var hasEnd: js.UndefOr[Boolean] = js.undefined
  
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  var publicId: js.UndefOr[String] = js.undefined
  
  var recurringDef: js.UndefOr[Duration | Null] = js.undefined
  
  var sourceId: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var ui: js.UndefOr[EventUi] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object PartialEventDef {
  
  inline def apply(): PartialEventDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEventDef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialEventDef] (val x: Self) extends AnyVal {
    
    inline def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    inline def setAllDayUndefined: Self = StObject.set(x, "allDay", js.undefined)
    
    inline def setDefId(value: String): Self = StObject.set(x, "defId", value.asInstanceOf[js.Any])
    
    inline def setDefIdUndefined: Self = StObject.set(x, "defId", js.undefined)
    
    inline def setExtendedProps(value: Dictionary): Self = StObject.set(x, "extendedProps", value.asInstanceOf[js.Any])
    
    inline def setExtendedPropsUndefined: Self = StObject.set(x, "extendedProps", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setHasEnd(value: Boolean): Self = StObject.set(x, "hasEnd", value.asInstanceOf[js.Any])
    
    inline def setHasEndUndefined: Self = StObject.set(x, "hasEnd", js.undefined)
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    inline def setPublicIdUndefined: Self = StObject.set(x, "publicId", js.undefined)
    
    inline def setRecurringDef(value: Duration): Self = StObject.set(x, "recurringDef", value.asInstanceOf[js.Any])
    
    inline def setRecurringDefNull: Self = StObject.set(x, "recurringDef", null)
    
    inline def setRecurringDefUndefined: Self = StObject.set(x, "recurringDef", js.undefined)
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUi(value: EventUi): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
