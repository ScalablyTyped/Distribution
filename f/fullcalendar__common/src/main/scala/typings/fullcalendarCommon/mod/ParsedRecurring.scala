package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedRecurring[RecurringData] extends StObject {
  
  var allDayGuess: Boolean | Null
  
  var duration: Duration | Null
  
  var typeData: RecurringData
}
object ParsedRecurring {
  
  inline def apply[RecurringData](typeData: RecurringData): ParsedRecurring[RecurringData] = {
    val __obj = js.Dynamic.literal(typeData = typeData.asInstanceOf[js.Any], allDayGuess = null, duration = null)
    __obj.asInstanceOf[ParsedRecurring[RecurringData]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParsedRecurring[?], RecurringData] (val x: Self & ParsedRecurring[RecurringData]) extends AnyVal {
    
    inline def setAllDayGuess(value: Boolean): Self = StObject.set(x, "allDayGuess", value.asInstanceOf[js.Any])
    
    inline def setAllDayGuessNull: Self = StObject.set(x, "allDayGuess", null)
    
    inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setTypeData(value: RecurringData): Self = StObject.set(x, "typeData", value.asInstanceOf[js.Any])
  }
}
