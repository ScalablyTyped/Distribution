package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Active extends StObject {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var every: js.UndefOr[Double] = js.undefined
  
  var expirationDate: js.UndefOr[String] = js.undefined
  
  var repeats: js.UndefOr[String] = js.undefined
  
  var repeatsOnWeekDays: js.UndefOr[js.Array[String]] = js.undefined
  
  var runsOnDayOfMonth: js.UndefOr[String] = js.undefined
  
  var startDate: js.UndefOr[String] = js.undefined
}
object Active {
  
  inline def apply(): Active = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Active]
  }
  
  extension [Self <: Active](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setEvery(value: Double): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
    
    inline def setEveryUndefined: Self = StObject.set(x, "every", js.undefined)
    
    inline def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setRepeats(value: String): Self = StObject.set(x, "repeats", value.asInstanceOf[js.Any])
    
    inline def setRepeatsOnWeekDays(value: js.Array[String]): Self = StObject.set(x, "repeatsOnWeekDays", value.asInstanceOf[js.Any])
    
    inline def setRepeatsOnWeekDaysUndefined: Self = StObject.set(x, "repeatsOnWeekDays", js.undefined)
    
    inline def setRepeatsOnWeekDaysVarargs(value: String*): Self = StObject.set(x, "repeatsOnWeekDays", js.Array(value*))
    
    inline def setRepeatsUndefined: Self = StObject.set(x, "repeats", js.undefined)
    
    inline def setRunsOnDayOfMonth(value: String): Self = StObject.set(x, "runsOnDayOfMonth", value.asInstanceOf[js.Any])
    
    inline def setRunsOnDayOfMonthUndefined: Self = StObject.set(x, "runsOnDayOfMonth", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
