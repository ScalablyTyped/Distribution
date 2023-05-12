package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`re-run`
import typings.fhir.fhirStrings.reflex
import typings.fhir.fhirStrings.repeat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObservationTriggeredBy
  extends StObject
     with BackboneElement {
  
  var _reason: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Reference to the triggering observation.
    */
  var observation: Reference
  
  /**
    * Provides the reason why this observation was performed as a result of the observation(s) referenced.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * The type of trigger.
    * Reflex | Repeat | Re-run.
    */
  var `type`: reflex | repeat | `re-run`
}
object ObservationTriggeredBy {
  
  inline def apply(observation: Reference, `type`: reflex | repeat | `re-run`): ObservationTriggeredBy = {
    val __obj = js.Dynamic.literal(observation = observation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObservationTriggeredBy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObservationTriggeredBy] (val x: Self) extends AnyVal {
    
    inline def setObservation(value: Reference): Self = StObject.set(x, "observation", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setType(value: reflex | repeat | `re-run`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_reason(value: Element): Self = StObject.set(x, "_reason", value.asInstanceOf[js.Any])
    
    inline def set_reasonUndefined: Self = StObject.set(x, "_reason", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
