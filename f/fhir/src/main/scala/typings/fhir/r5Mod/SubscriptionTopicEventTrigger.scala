package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionTopicEventTrigger
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _resource: js.UndefOr[Element] = js.undefined
  
  /**
    * Implementation of particular subscription topics might not use a computable definition and instead base their design on the definition.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A well-defined event which can be used to trigger notifications from the SubscriptionTopic.
    */
  var event: CodeableConcept
  
  /**
    * URL of the Resource that is the focus type used in this event trigger.  Relative URLs are relative to the StructureDefinition root of the implemented FHIR version (e.g., http://hl7.org/fhir/StructureDefinition). For example, "Patient" maps to http://hl7.org/fhir/StructureDefinition/Patient.  For more information, see <a href="elementdefinition-definitions.html#ElementDefinition.type.code">ElementDefinition.type.code</a>.
    */
  var resource: String
}
object SubscriptionTopicEventTrigger {
  
  inline def apply(event: CodeableConcept, resource: String): SubscriptionTopicEventTrigger = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionTopicEventTrigger]
  }
  
  extension [Self <: SubscriptionTopicEventTrigger](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEvent(value: CodeableConcept): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_resource(value: Element): Self = StObject.set(x, "_resource", value.asInstanceOf[js.Any])
    
    inline def set_resourceUndefined: Self = StObject.set(x, "_resource", js.undefined)
  }
}
