package typings.fullcalendarCore.anon

import typings.fullcalendarCore.fullcalendarCoreStrings.CHANGE_DATE
import typings.fullcalendarCore.internalCommonMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateMarker
  extends StObject
     with Action {
  
  var dateMarker: js.Date
  
  var `type`: CHANGE_DATE
}
object DateMarker {
  
  inline def apply(dateMarker: js.Date): DateMarker = {
    val __obj = js.Dynamic.literal(dateMarker = dateMarker.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CHANGE_DATE")
    __obj.asInstanceOf[DateMarker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateMarker] (val x: Self) extends AnyVal {
    
    inline def setDateMarker(value: js.Date): Self = StObject.set(x, "dateMarker", value.asInstanceOf[js.Any])
    
    inline def setType(value: CHANGE_DATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
