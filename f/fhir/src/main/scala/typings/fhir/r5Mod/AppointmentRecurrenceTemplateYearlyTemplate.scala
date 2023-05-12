package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentRecurrenceTemplateYearlyTemplate
  extends StObject
     with BackboneElement {
  
  /**
    * Appointment recurs every nth year.
    */
  var yearInterval: Double
}
object AppointmentRecurrenceTemplateYearlyTemplate {
  
  inline def apply(yearInterval: Double): AppointmentRecurrenceTemplateYearlyTemplate = {
    val __obj = js.Dynamic.literal(yearInterval = yearInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentRecurrenceTemplateYearlyTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppointmentRecurrenceTemplateYearlyTemplate] (val x: Self) extends AnyVal {
    
    inline def setYearInterval(value: Double): Self = StObject.set(x, "yearInterval", value.asInstanceOf[js.Any])
  }
}
