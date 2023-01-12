package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Declare client constants that specify the Gantt's view type.
  */
trait ASPxClientGanttViewType extends StObject {
  
  /**
    * Displays days.
    */
  var Days: Double
  
  /**
    * Displays hours.
    */
  var Hours: Double
  
  /**
    * Display months.
    */
  var Months: Double
  
  /**
    * Displays weeks.
    */
  var Weeks: Double
}
object ASPxClientGanttViewType {
  
  inline def apply(Days: Double, Hours: Double, Months: Double, Weeks: Double): ASPxClientGanttViewType = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Hours = Hours.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], Weeks = Weeks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttViewType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientGanttViewType] (val x: Self) extends AnyVal {
    
    inline def setDays(value: Double): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
    
    inline def setHours(value: Double): Self = StObject.set(x, "Hours", value.asInstanceOf[js.Any])
    
    inline def setMonths(value: Double): Self = StObject.set(x, "Months", value.asInstanceOf[js.Any])
    
    inline def setWeeks(value: Double): Self = StObject.set(x, "Weeks", value.asInstanceOf[js.Any])
  }
}
