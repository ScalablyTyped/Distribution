package typings.fullcalendarCommon.anon

import typings.fullcalendarCommon.mod.EventUi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusinessHours extends StObject {
  
  var businessHours: js.UndefOr[typings.fullcalendarCommon.mod.EventStore] = js.undefined
  
  var ui: js.UndefOr[EventUi] = js.undefined
}
object BusinessHours {
  
  inline def apply(): BusinessHours = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessHours]
  }
  
  extension [Self <: BusinessHours](x: Self) {
    
    inline def setBusinessHours(value: typings.fullcalendarCommon.mod.EventStore): Self = StObject.set(x, "businessHours", value.asInstanceOf[js.Any])
    
    inline def setBusinessHoursUndefined: Self = StObject.set(x, "businessHours", js.undefined)
    
    inline def setUi(value: EventUi): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
  }
}
