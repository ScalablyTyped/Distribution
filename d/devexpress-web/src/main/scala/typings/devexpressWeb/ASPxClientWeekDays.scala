package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains days and groups of days for use in recurrence patterns.
  */
@js.native
trait ASPxClientWeekDays extends StObject {
  
  /**
    * Specifies every day of the week.
    */
  var EveryDay: Double = js.native
  
  /**
    * Specifies Friday.
    */
  var Friday: Double = js.native
  
  /**
    * Specifies Monday.
    */
  var Monday: Double = js.native
  
  /**
    * Specifies Saturday.
    */
  var Saturday: Double = js.native
  
  /**
    * Specifies Sunday.
    */
  var Sunday: Double = js.native
  
  /**
    * Specifies Thursday.
    */
  var Thursday: Double = js.native
  
  /**
    * Specifies Tuesday.
    */
  var Tuesday: Double = js.native
  
  /**
    * Specifies Wednesday.
    */
  var Wednesday: Double = js.native
  
  /**
    * Specifies Saturday and Sunday.
    */
  var WeekendDays: Double = js.native
  
  /**
    * Specifies work days (Monday, Tuesday, Wednesday, Thursday and Friday).
    */
  var WorkDays: Double = js.native
}
object ASPxClientWeekDays {
  
  @scala.inline
  def apply(
    EveryDay: Double,
    Friday: Double,
    Monday: Double,
    Saturday: Double,
    Sunday: Double,
    Thursday: Double,
    Tuesday: Double,
    Wednesday: Double,
    WeekendDays: Double,
    WorkDays: Double
  ): ASPxClientWeekDays = {
    val __obj = js.Dynamic.literal(EveryDay = EveryDay.asInstanceOf[js.Any], Friday = Friday.asInstanceOf[js.Any], Monday = Monday.asInstanceOf[js.Any], Saturday = Saturday.asInstanceOf[js.Any], Sunday = Sunday.asInstanceOf[js.Any], Thursday = Thursday.asInstanceOf[js.Any], Tuesday = Tuesday.asInstanceOf[js.Any], Wednesday = Wednesday.asInstanceOf[js.Any], WeekendDays = WeekendDays.asInstanceOf[js.Any], WorkDays = WorkDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWeekDays]
  }
  
  @scala.inline
  implicit class ASPxClientWeekDaysMutableBuilder[Self <: ASPxClientWeekDays] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEveryDay(value: Double): Self = StObject.set(x, "EveryDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriday(value: Double): Self = StObject.set(x, "Friday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonday(value: Double): Self = StObject.set(x, "Monday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaturday(value: Double): Self = StObject.set(x, "Saturday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSunday(value: Double): Self = StObject.set(x, "Sunday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThursday(value: Double): Self = StObject.set(x, "Thursday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTuesday(value: Double): Self = StObject.set(x, "Tuesday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWednesday(value: Double): Self = StObject.set(x, "Wednesday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekendDays(value: Double): Self = StObject.set(x, "WeekendDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkDays(value: Double): Self = StObject.set(x, "WorkDays", value.asInstanceOf[js.Any])
  }
}
