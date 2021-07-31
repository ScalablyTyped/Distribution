package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of locations where the patient has been
  */
trait EncounterLocation
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Location the encounter takes place
    */
  var location: Reference
  
  /**
    * Time period during which the patient was present at the location
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * planned | active | reserved | completed
    */
  var status: js.UndefOr[code] = js.undefined
}
object EncounterLocation {
  
  @scala.inline
  def apply(location: Reference): EncounterLocation = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncounterLocation]
  }
  
  @scala.inline
  implicit class EncounterLocationMutableBuilder[Self <: EncounterLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
