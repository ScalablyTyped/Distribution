package typings.fhir.mod

import typings.fhir.fhirStrings.`derived-from`
import typings.fhir.fhirStrings.`has-member`
import typings.fhir.fhirStrings.`interfered-by`
import typings.fhir.fhirStrings.`qualified-by`
import typings.fhir.fhirStrings.`sequel-to`
import typings.fhir.fhirStrings.replaces
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObservationRelated
  extends StObject
     with BackboneElement {
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * A reference to the observation or [[[QuestionnaireResponse]]] resource that is related to this observation.
    */
  var target: Reference
  
  /**
    * A relationship type SHOULD be provided.
    */
  var `type`: js.UndefOr[
    `has-member` | `derived-from` | `sequel-to` | replaces | `qualified-by` | `interfered-by`
  ] = js.undefined
}
object ObservationRelated {
  
  inline def apply(target: Reference): ObservationRelated = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObservationRelated]
  }
  
  extension [Self <: ObservationRelated](x: Self) {
    
    inline def setTarget(value: Reference): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: `has-member` | `derived-from` | `sequel-to` | replaces | `qualified-by` | `interfered-by`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
