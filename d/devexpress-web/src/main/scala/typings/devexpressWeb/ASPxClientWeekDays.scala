package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains days and groups of days for use in recurrence patterns.
  */
trait ASPxClientWeekDays extends StObject {
  
  /**
    * Specifies every day of the week.
    */
  var EveryDay: Double
  
  /**
    * Specifies Friday.
    */
  var Friday: Double
  
  /**
    * Specifies Monday.
    */
  var Monday: Double
  
  /**
    * Specifies Saturday.
    */
  var Saturday: Double
  
  /**
    * Specifies Sunday.
    */
  var Sunday: Double
  
  /**
    * Specifies Thursday.
    */
  var Thursday: Double
  
  /**
    * Specifies Tuesday.
    */
  var Tuesday: Double
  
  /**
    * Specifies Wednesday.
    */
  var Wednesday: Double
  
  /**
    * Specifies Saturday and Sunday.
    */
  var WeekendDays: Double
  
  /**
    * Specifies work days (Monday, Tuesday, Wednesday, Thursday and Friday).
    */
  var WorkDays: Double
}
object ASPxClientWeekDays {
  
  inline def apply(
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
  
  extension [Self <: ASPxClientWeekDays](x: Self) {
    
    inline def setEveryDay(value: Double): Self = StObject.set(x, "EveryDay", value.asInstanceOf[js.Any])
    
    inline def setFriday(value: Double): Self = StObject.set(x, "Friday", value.asInstanceOf[js.Any])
    
    inline def setMonday(value: Double): Self = StObject.set(x, "Monday", value.asInstanceOf[js.Any])
    
    inline def setSaturday(value: Double): Self = StObject.set(x, "Saturday", value.asInstanceOf[js.Any])
    
    inline def setSunday(value: Double): Self = StObject.set(x, "Sunday", value.asInstanceOf[js.Any])
    
    inline def setThursday(value: Double): Self = StObject.set(x, "Thursday", value.asInstanceOf[js.Any])
    
    inline def setTuesday(value: Double): Self = StObject.set(x, "Tuesday", value.asInstanceOf[js.Any])
    
    inline def setWednesday(value: Double): Self = StObject.set(x, "Wednesday", value.asInstanceOf[js.Any])
    
    inline def setWeekendDays(value: Double): Self = StObject.set(x, "WeekendDays", value.asInstanceOf[js.Any])
    
    inline def setWorkDays(value: Double): Self = StObject.set(x, "WorkDays", value.asInstanceOf[js.Any])
  }
}
