package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Active extends StObject {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var every: js.UndefOr[Double] = js.native
  
  var expirationDate: js.UndefOr[String] = js.native
  
  var repeats: js.UndefOr[String] = js.native
  
  var repeatsOnWeekDays: js.UndefOr[js.Array[String]] = js.native
  
  var runsOnDayOfMonth: js.UndefOr[String] = js.native
  
  var startDate: js.UndefOr[String] = js.native
}
object Active {
  
  @scala.inline
  def apply(): Active = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Active]
  }
  
  @scala.inline
  implicit class ActiveMutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setEvery(value: Double): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEveryUndefined: Self = StObject.set(x, "every", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    @scala.inline
    def setRepeats(value: String): Self = StObject.set(x, "repeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatsOnWeekDays(value: js.Array[String]): Self = StObject.set(x, "repeatsOnWeekDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatsOnWeekDaysUndefined: Self = StObject.set(x, "repeatsOnWeekDays", js.undefined)
    
    @scala.inline
    def setRepeatsOnWeekDaysVarargs(value: String*): Self = StObject.set(x, "repeatsOnWeekDays", js.Array(value :_*))
    
    @scala.inline
    def setRepeatsUndefined: Self = StObject.set(x, "repeats", js.undefined)
    
    @scala.inline
    def setRunsOnDayOfMonth(value: String): Self = StObject.set(x, "runsOnDayOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunsOnDayOfMonthUndefined: Self = StObject.set(x, "runsOnDayOfMonth", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
