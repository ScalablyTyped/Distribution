package typings.fhir.r5Mod

import typings.fhir.fhirStrings.create
import typings.fhir.fhirStrings.delete_
import typings.fhir.fhirStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionTopicResourceTrigger
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _fhirPathCriteria: js.UndefOr[Element] = js.undefined
  
  var _resource: js.UndefOr[Element] = js.undefined
  
  var _supportedInteraction: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Implementation of particular subscription topics might not use a computable definition and instead base their design on the definition.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * FHIRPath expression with %previous and %current vars.
    */
  var fhirPathCriteria: js.UndefOr[String] = js.undefined
  
  /**
    * The FHIR query based rules that the server should use to determine when to trigger a notification for this subscription topic.
    */
  var queryCriteria: js.UndefOr[SubscriptionTopicResourceTriggerQueryCriteria] = js.undefined
  
  /**
    * URL of the Resource that is the type used in this resource trigger.  Relative URLs are relative to the StructureDefinition root of the implemented FHIR version (e.g., http://hl7.org/fhir/StructureDefinition). For example, "Patient" maps to http://hl7.org/fhir/StructureDefinition/Patient.  For more information, see <a href="elementdefinition-definitions.html#ElementDefinition.type.code">ElementDefinition.type.code</a>.
    */
  var resource: String
  
  /**
    * The FHIR RESTful interaction which can be used to trigger a notification for the SubscriptionTopic. Multiple values are considered OR joined (e.g., CREATE or UPDATE).
    */
  var supportedInteraction: js.UndefOr[js.Array[create | update | delete_]] = js.undefined
}
object SubscriptionTopicResourceTrigger {
  
  inline def apply(resource: String): SubscriptionTopicResourceTrigger = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionTopicResourceTrigger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionTopicResourceTrigger] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFhirPathCriteria(value: String): Self = StObject.set(x, "fhirPathCriteria", value.asInstanceOf[js.Any])
    
    inline def setFhirPathCriteriaUndefined: Self = StObject.set(x, "fhirPathCriteria", js.undefined)
    
    inline def setQueryCriteria(value: SubscriptionTopicResourceTriggerQueryCriteria): Self = StObject.set(x, "queryCriteria", value.asInstanceOf[js.Any])
    
    inline def setQueryCriteriaUndefined: Self = StObject.set(x, "queryCriteria", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setSupportedInteraction(value: js.Array[create | update | delete_]): Self = StObject.set(x, "supportedInteraction", value.asInstanceOf[js.Any])
    
    inline def setSupportedInteractionUndefined: Self = StObject.set(x, "supportedInteraction", js.undefined)
    
    inline def setSupportedInteractionVarargs(value: (create | update | delete_)*): Self = StObject.set(x, "supportedInteraction", js.Array(value*))
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_fhirPathCriteria(value: Element): Self = StObject.set(x, "_fhirPathCriteria", value.asInstanceOf[js.Any])
    
    inline def set_fhirPathCriteriaUndefined: Self = StObject.set(x, "_fhirPathCriteria", js.undefined)
    
    inline def set_resource(value: Element): Self = StObject.set(x, "_resource", value.asInstanceOf[js.Any])
    
    inline def set_resourceUndefined: Self = StObject.set(x, "_resource", js.undefined)
    
    inline def set_supportedInteraction(value: js.Array[Element]): Self = StObject.set(x, "_supportedInteraction", value.asInstanceOf[js.Any])
    
    inline def set_supportedInteractionUndefined: Self = StObject.set(x, "_supportedInteraction", js.undefined)
    
    inline def set_supportedInteractionVarargs(value: Element*): Self = StObject.set(x, "_supportedInteraction", js.Array(value*))
  }
}
