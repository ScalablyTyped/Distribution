package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentRecurrenceTemplateWeeklyTemplate
  extends StObject
     with BackboneElement {
  
  var _friday: js.UndefOr[Element] = js.undefined
  
  var _monday: js.UndefOr[Element] = js.undefined
  
  var _saturday: js.UndefOr[Element] = js.undefined
  
  var _sunday: js.UndefOr[Element] = js.undefined
  
  var _thursday: js.UndefOr[Element] = js.undefined
  
  var _tuesday: js.UndefOr[Element] = js.undefined
  
  var _wednesday: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates that recurring appointments should occur on Fridays.
    */
  var friday: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates that recurring appointments should occur on Mondays.
    */
  var monday: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates that recurring appointments should occur on Saturdays.
    */
  var saturday: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates that recurring appointments should occur on Sundays.
    */
  var sunday: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates that recurring appointments should occur on Thursdays.
    */
  var thursday: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates that recurring appointments should occur on Tuesdays.
    */
  var tuesday: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates that recurring appointments should occur on Wednesdays.
    */
  var wednesday: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The interval defines if the recurrence is every nth week. The default is every week, so it is expected that this value will be 2 or more.
    * e.g. For recurring every second week this interval would be 2, or every third week the interval would be 3.
    */
  var weekInterval: js.UndefOr[Double] = js.undefined
}
object AppointmentRecurrenceTemplateWeeklyTemplate {
  
  inline def apply(): AppointmentRecurrenceTemplateWeeklyTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentRecurrenceTemplateWeeklyTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppointmentRecurrenceTemplateWeeklyTemplate] (val x: Self) extends AnyVal {
    
    inline def setFriday(value: Boolean): Self = StObject.set(x, "friday", value.asInstanceOf[js.Any])
    
    inline def setFridayUndefined: Self = StObject.set(x, "friday", js.undefined)
    
    inline def setMonday(value: Boolean): Self = StObject.set(x, "monday", value.asInstanceOf[js.Any])
    
    inline def setMondayUndefined: Self = StObject.set(x, "monday", js.undefined)
    
    inline def setSaturday(value: Boolean): Self = StObject.set(x, "saturday", value.asInstanceOf[js.Any])
    
    inline def setSaturdayUndefined: Self = StObject.set(x, "saturday", js.undefined)
    
    inline def setSunday(value: Boolean): Self = StObject.set(x, "sunday", value.asInstanceOf[js.Any])
    
    inline def setSundayUndefined: Self = StObject.set(x, "sunday", js.undefined)
    
    inline def setThursday(value: Boolean): Self = StObject.set(x, "thursday", value.asInstanceOf[js.Any])
    
    inline def setThursdayUndefined: Self = StObject.set(x, "thursday", js.undefined)
    
    inline def setTuesday(value: Boolean): Self = StObject.set(x, "tuesday", value.asInstanceOf[js.Any])
    
    inline def setTuesdayUndefined: Self = StObject.set(x, "tuesday", js.undefined)
    
    inline def setWednesday(value: Boolean): Self = StObject.set(x, "wednesday", value.asInstanceOf[js.Any])
    
    inline def setWednesdayUndefined: Self = StObject.set(x, "wednesday", js.undefined)
    
    inline def setWeekInterval(value: Double): Self = StObject.set(x, "weekInterval", value.asInstanceOf[js.Any])
    
    inline def setWeekIntervalUndefined: Self = StObject.set(x, "weekInterval", js.undefined)
    
    inline def set_friday(value: Element): Self = StObject.set(x, "_friday", value.asInstanceOf[js.Any])
    
    inline def set_fridayUndefined: Self = StObject.set(x, "_friday", js.undefined)
    
    inline def set_monday(value: Element): Self = StObject.set(x, "_monday", value.asInstanceOf[js.Any])
    
    inline def set_mondayUndefined: Self = StObject.set(x, "_monday", js.undefined)
    
    inline def set_saturday(value: Element): Self = StObject.set(x, "_saturday", value.asInstanceOf[js.Any])
    
    inline def set_saturdayUndefined: Self = StObject.set(x, "_saturday", js.undefined)
    
    inline def set_sunday(value: Element): Self = StObject.set(x, "_sunday", value.asInstanceOf[js.Any])
    
    inline def set_sundayUndefined: Self = StObject.set(x, "_sunday", js.undefined)
    
    inline def set_thursday(value: Element): Self = StObject.set(x, "_thursday", value.asInstanceOf[js.Any])
    
    inline def set_thursdayUndefined: Self = StObject.set(x, "_thursday", js.undefined)
    
    inline def set_tuesday(value: Element): Self = StObject.set(x, "_tuesday", value.asInstanceOf[js.Any])
    
    inline def set_tuesdayUndefined: Self = StObject.set(x, "_tuesday", js.undefined)
    
    inline def set_wednesday(value: Element): Self = StObject.set(x, "_wednesday", value.asInstanceOf[js.Any])
    
    inline def set_wednesdayUndefined: Self = StObject.set(x, "_wednesday", js.undefined)
  }
}
