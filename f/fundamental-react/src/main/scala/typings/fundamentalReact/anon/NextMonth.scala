package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextMonth extends StObject {
  
  var nextMonth: js.UndefOr[String] = js.undefined
  
  var previousMonth: js.UndefOr[String] = js.undefined
  
  var show12NextYears: js.UndefOr[String] = js.undefined
  
  var show12PreviousYears: js.UndefOr[String] = js.undefined
}
object NextMonth {
  
  inline def apply(): NextMonth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NextMonth]
  }
  
  extension [Self <: NextMonth](x: Self) {
    
    inline def setNextMonth(value: String): Self = StObject.set(x, "nextMonth", value.asInstanceOf[js.Any])
    
    inline def setNextMonthUndefined: Self = StObject.set(x, "nextMonth", js.undefined)
    
    inline def setPreviousMonth(value: String): Self = StObject.set(x, "previousMonth", value.asInstanceOf[js.Any])
    
    inline def setPreviousMonthUndefined: Self = StObject.set(x, "previousMonth", js.undefined)
    
    inline def setShow12NextYears(value: String): Self = StObject.set(x, "show12NextYears", value.asInstanceOf[js.Any])
    
    inline def setShow12NextYearsUndefined: Self = StObject.set(x, "show12NextYears", js.undefined)
    
    inline def setShow12PreviousYears(value: String): Self = StObject.set(x, "show12PreviousYears", value.asInstanceOf[js.Any])
    
    inline def setShow12PreviousYearsUndefined: Self = StObject.set(x, "show12PreviousYears", js.undefined)
  }
}
