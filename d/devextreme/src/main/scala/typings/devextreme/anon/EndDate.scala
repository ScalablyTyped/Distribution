package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndDate extends StObject {
  
  var endDate: js.UndefOr[typings.std.Date] = js.undefined
  
  var startDate: js.UndefOr[typings.std.Date] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object EndDate {
  
  inline def apply(): EndDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndDate]
  }
  
  extension [Self <: EndDate](x: Self) {
    
    inline def setEndDate(value: typings.std.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setStartDate(value: typings.std.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
