package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentRecurrenceTemplateMonthlyTemplate
  extends StObject
     with BackboneElement {
  
  /**
    * Indicates that appointments in the series of recurring appointments should occur on a specific day of the month.
    */
  var dayOfMonth: js.UndefOr[Double] = js.undefined
  
  /**
    * This property is intended to be used with Appointment.recurrenceTemplate.monthly.nthWeek.
    */
  var dayOfWeek: js.UndefOr[Coding] = js.undefined
  
  /**
    * Indicates that recurring appointments should occur every nth month.
    */
  var monthInterval: Double
  
  /**
    * Indicates which week within a month the appointments in the series of recurring appointments should occur on.
    */
  var nthWeekOfMonth: js.UndefOr[Coding] = js.undefined
}
object AppointmentRecurrenceTemplateMonthlyTemplate {
  
  inline def apply(monthInterval: Double): AppointmentRecurrenceTemplateMonthlyTemplate = {
    val __obj = js.Dynamic.literal(monthInterval = monthInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentRecurrenceTemplateMonthlyTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppointmentRecurrenceTemplateMonthlyTemplate] (val x: Self) extends AnyVal {
    
    inline def setDayOfMonth(value: Double): Self = StObject.set(x, "dayOfMonth", value.asInstanceOf[js.Any])
    
    inline def setDayOfMonthUndefined: Self = StObject.set(x, "dayOfMonth", js.undefined)
    
    inline def setDayOfWeek(value: Coding): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
    
    inline def setMonthInterval(value: Double): Self = StObject.set(x, "monthInterval", value.asInstanceOf[js.Any])
    
    inline def setNthWeekOfMonth(value: Coding): Self = StObject.set(x, "nthWeekOfMonth", value.asInstanceOf[js.Any])
    
    inline def setNthWeekOfMonthUndefined: Self = StObject.set(x, "nthWeekOfMonth", js.undefined)
  }
}
