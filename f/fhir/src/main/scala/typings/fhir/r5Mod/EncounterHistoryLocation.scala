package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncounterHistoryLocation
  extends StObject
     with BackboneElement {
  
  /**
    * This information is de-normalized from the Location resource to support the easier understanding of the encounter resource and processing in messaging or query.
    * There may be many levels in the hierachy, and this may only pic specific levels that are required for a specific usage scenario.
    */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The location where the encounter takes place.
    */
  var location: Reference
}
object EncounterHistoryLocation {
  
  inline def apply(location: Reference): EncounterHistoryLocation = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncounterHistoryLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncounterHistoryLocation] (val x: Self) extends AnyVal {
    
    inline def setForm(value: CodeableConcept): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
