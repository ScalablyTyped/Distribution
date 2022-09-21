package typings.fullcalendarCommon.anon

import typings.fullcalendarCommon.mod.Dictionary
import typings.fullcalendarCommon.mod.EventUi
import typings.fullcalendarCommon.mod.Seg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefId extends StObject {
  
  var _seg: Seg
  
  var allDay: Double
  
  var defId: String
  
  var duration: Double
  
  var end: Double
  
  var extendedProps: Dictionary
  
  var groupId: String
  
  var hasEnd: Boolean
  
  var id: String
  
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  var publicId: String
  
  var recurringDef: TypeData
  
  var sourceId: String
  
  var start: Double
  
  var title: String
  
  var ui: EventUi
  
  var url: String
}
object DefId {
  
  inline def apply(
    _seg: Seg,
    allDay: Double,
    defId: String,
    duration: Double,
    end: Double,
    extendedProps: Dictionary,
    groupId: String,
    hasEnd: Boolean,
    id: String,
    publicId: String,
    recurringDef: TypeData,
    sourceId: String,
    start: Double,
    title: String,
    ui: EventUi,
    url: String
  ): DefId = {
    val __obj = js.Dynamic.literal(_seg = _seg.asInstanceOf[js.Any], allDay = allDay.asInstanceOf[js.Any], defId = defId.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], extendedProps = extendedProps.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], hasEnd = hasEnd.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], publicId = publicId.asInstanceOf[js.Any], recurringDef = recurringDef.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefId]
  }
  
  extension [Self <: DefId](x: Self) {
    
    inline def setAllDay(value: Double): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    inline def setDefId(value: String): Self = StObject.set(x, "defId", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setExtendedProps(value: Dictionary): Self = StObject.set(x, "extendedProps", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setHasEnd(value: Boolean): Self = StObject.set(x, "hasEnd", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    inline def setRecurringDef(value: TypeData): Self = StObject.set(x, "recurringDef", value.asInstanceOf[js.Any])
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUi(value: EventUi): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_seg(value: Seg): Self = StObject.set(x, "_seg", value.asInstanceOf[js.Any])
  }
}
