package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventDef extends StObject {
  
  var allDay: Boolean
  
  var defId: String
  
  var extendedProps: Dictionary
  
  var groupId: String
  
  var hasEnd: Boolean
  
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  var publicId: String
  
  var recurringDef: typings.fullcalendarCore.anon.Duration | Null
  
  var sourceId: String
  
  var title: String
  
  var ui: EventUi
  
  var url: String
}
object EventDef {
  
  inline def apply(
    allDay: Boolean,
    defId: String,
    extendedProps: Dictionary,
    groupId: String,
    hasEnd: Boolean,
    publicId: String,
    sourceId: String,
    title: String,
    ui: EventUi,
    url: String
  ): EventDef = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], defId = defId.asInstanceOf[js.Any], extendedProps = extendedProps.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], hasEnd = hasEnd.asInstanceOf[js.Any], publicId = publicId.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], recurringDef = null)
    __obj.asInstanceOf[EventDef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventDef] (val x: Self) extends AnyVal {
    
    inline def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    inline def setDefId(value: String): Self = StObject.set(x, "defId", value.asInstanceOf[js.Any])
    
    inline def setExtendedProps(value: Dictionary): Self = StObject.set(x, "extendedProps", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setHasEnd(value: Boolean): Self = StObject.set(x, "hasEnd", value.asInstanceOf[js.Any])
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    inline def setRecurringDef(value: typings.fullcalendarCore.anon.Duration): Self = StObject.set(x, "recurringDef", value.asInstanceOf[js.Any])
    
    inline def setRecurringDefNull: Self = StObject.set(x, "recurringDef", null)
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUi(value: EventUi): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
