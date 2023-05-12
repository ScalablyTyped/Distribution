package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentRecurrenceTemplate
  extends StObject
     with BackboneElement {
  
  var _excludingDate: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _lastOccurrenceDate: js.UndefOr[Element] = js.undefined
  
  var _occurrenceDate: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * excludingDate is an alternative to excludingRecurrenceId.  You may say either that 12/25/XXXX should be excluded using excludingDate, or you may indicate the recurrenceId of the appointment that would fall on the excluded date in the excludingRecurrenceId property.
    */
  var excludingDate: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * excludingRecurrenceId is an alternative to excludingDate.  You may say either that 12/25/XXXX should be excluded using excludingDate, or you may indicate the recurrenceId of the appointment that would fall on the excluded date in the excludingRecurrenceId property.
    */
  var excludingRecurrenceId: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Recurring appointments will not occur after this date.
    */
  var lastOccurrenceDate: js.UndefOr[String] = js.undefined
  
  /**
    * Information about monthly recurring appointments.
    */
  var monthlyTemplate: js.UndefOr[AppointmentRecurrenceTemplateMonthlyTemplate] = js.undefined
  
  /**
    * How many appointments are planned in the recurrence.
    */
  var occurrenceCount: js.UndefOr[Double] = js.undefined
  
  /**
    * The list of specific dates that will have appointments generated.
    */
  var occurrenceDate: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * How often the appointment series should recur.
    */
  var recurrenceType: CodeableConcept
  
  /**
    * The timezone of the recurring appointment occurrences.
    */
  var timezone: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Information about weekly recurring appointments.
    */
  var weeklyTemplate: js.UndefOr[AppointmentRecurrenceTemplateWeeklyTemplate] = js.undefined
  
  /**
    * Information about yearly recurring appointments.
    */
  var yearlyTemplate: js.UndefOr[AppointmentRecurrenceTemplateYearlyTemplate] = js.undefined
}
object AppointmentRecurrenceTemplate {
  
  inline def apply(recurrenceType: CodeableConcept): AppointmentRecurrenceTemplate = {
    val __obj = js.Dynamic.literal(recurrenceType = recurrenceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentRecurrenceTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppointmentRecurrenceTemplate] (val x: Self) extends AnyVal {
    
    inline def setExcludingDate(value: js.Array[String]): Self = StObject.set(x, "excludingDate", value.asInstanceOf[js.Any])
    
    inline def setExcludingDateUndefined: Self = StObject.set(x, "excludingDate", js.undefined)
    
    inline def setExcludingDateVarargs(value: String*): Self = StObject.set(x, "excludingDate", js.Array(value*))
    
    inline def setExcludingRecurrenceId(value: js.Array[Double]): Self = StObject.set(x, "excludingRecurrenceId", value.asInstanceOf[js.Any])
    
    inline def setExcludingRecurrenceIdUndefined: Self = StObject.set(x, "excludingRecurrenceId", js.undefined)
    
    inline def setExcludingRecurrenceIdVarargs(value: Double*): Self = StObject.set(x, "excludingRecurrenceId", js.Array(value*))
    
    inline def setLastOccurrenceDate(value: String): Self = StObject.set(x, "lastOccurrenceDate", value.asInstanceOf[js.Any])
    
    inline def setLastOccurrenceDateUndefined: Self = StObject.set(x, "lastOccurrenceDate", js.undefined)
    
    inline def setMonthlyTemplate(value: AppointmentRecurrenceTemplateMonthlyTemplate): Self = StObject.set(x, "monthlyTemplate", value.asInstanceOf[js.Any])
    
    inline def setMonthlyTemplateUndefined: Self = StObject.set(x, "monthlyTemplate", js.undefined)
    
    inline def setOccurrenceCount(value: Double): Self = StObject.set(x, "occurrenceCount", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceCountUndefined: Self = StObject.set(x, "occurrenceCount", js.undefined)
    
    inline def setOccurrenceDate(value: js.Array[String]): Self = StObject.set(x, "occurrenceDate", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDateUndefined: Self = StObject.set(x, "occurrenceDate", js.undefined)
    
    inline def setOccurrenceDateVarargs(value: String*): Self = StObject.set(x, "occurrenceDate", js.Array(value*))
    
    inline def setRecurrenceType(value: CodeableConcept): Self = StObject.set(x, "recurrenceType", value.asInstanceOf[js.Any])
    
    inline def setTimezone(value: CodeableConcept): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    inline def setWeeklyTemplate(value: AppointmentRecurrenceTemplateWeeklyTemplate): Self = StObject.set(x, "weeklyTemplate", value.asInstanceOf[js.Any])
    
    inline def setWeeklyTemplateUndefined: Self = StObject.set(x, "weeklyTemplate", js.undefined)
    
    inline def setYearlyTemplate(value: AppointmentRecurrenceTemplateYearlyTemplate): Self = StObject.set(x, "yearlyTemplate", value.asInstanceOf[js.Any])
    
    inline def setYearlyTemplateUndefined: Self = StObject.set(x, "yearlyTemplate", js.undefined)
    
    inline def set_excludingDate(value: js.Array[Element]): Self = StObject.set(x, "_excludingDate", value.asInstanceOf[js.Any])
    
    inline def set_excludingDateUndefined: Self = StObject.set(x, "_excludingDate", js.undefined)
    
    inline def set_excludingDateVarargs(value: Element*): Self = StObject.set(x, "_excludingDate", js.Array(value*))
    
    inline def set_lastOccurrenceDate(value: Element): Self = StObject.set(x, "_lastOccurrenceDate", value.asInstanceOf[js.Any])
    
    inline def set_lastOccurrenceDateUndefined: Self = StObject.set(x, "_lastOccurrenceDate", js.undefined)
    
    inline def set_occurrenceDate(value: js.Array[Element]): Self = StObject.set(x, "_occurrenceDate", value.asInstanceOf[js.Any])
    
    inline def set_occurrenceDateUndefined: Self = StObject.set(x, "_occurrenceDate", js.undefined)
    
    inline def set_occurrenceDateVarargs(value: Element*): Self = StObject.set(x, "_occurrenceDate", js.Array(value*))
  }
}
