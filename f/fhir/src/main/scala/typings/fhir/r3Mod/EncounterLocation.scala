package typings.fhir.r3Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.planned
import typings.fhir.fhirStrings.reserved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncounterLocation
  extends StObject
     with BackboneElement {
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The location where the encounter takes place.
    */
  var location: Reference
  
  /**
    * Time period during which the patient was present at the location.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * When the patient is no longer active at a location, then the period end date is entered, and the status may be changed to completed.
    */
  var status: js.UndefOr[planned | active | reserved | completed] = js.undefined
}
object EncounterLocation {
  
  inline def apply(location: Reference): EncounterLocation = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncounterLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncounterLocation] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setStatus(value: planned | active | reserved | completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
