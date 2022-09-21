package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvenanceAgent
  extends StObject
     with BackboneElement {
  
  var _onBehalfOfUri: js.UndefOr[Element] = js.undefined
  
  var _whoUri: js.UndefOr[Element] = js.undefined
  
  /**
    * The individual, device, or organization for whom the change was made.
    */
  var onBehalfOfReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The individual, device, or organization for whom the change was made.
    */
  var onBehalfOfUri: js.UndefOr[String] = js.undefined
  
  /**
    * The type of relationship between agents.
    */
  var relatedAgentType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * For example: author, performer, enterer, attester, doctor, nurse, clerk, etc.
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The individual, device or organization that participated in the event.
    */
  var whoReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The individual, device or organization that participated in the event.
    */
  var whoUri: js.UndefOr[String] = js.undefined
}
object ProvenanceAgent {
  
  inline def apply(): ProvenanceAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvenanceAgent]
  }
  
  extension [Self <: ProvenanceAgent](x: Self) {
    
    inline def setOnBehalfOfReference(value: Reference): Self = StObject.set(x, "onBehalfOfReference", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfReferenceUndefined: Self = StObject.set(x, "onBehalfOfReference", js.undefined)
    
    inline def setOnBehalfOfUri(value: String): Self = StObject.set(x, "onBehalfOfUri", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfUriUndefined: Self = StObject.set(x, "onBehalfOfUri", js.undefined)
    
    inline def setRelatedAgentType(value: CodeableConcept): Self = StObject.set(x, "relatedAgentType", value.asInstanceOf[js.Any])
    
    inline def setRelatedAgentTypeUndefined: Self = StObject.set(x, "relatedAgentType", js.undefined)
    
    inline def setRole(value: js.Array[CodeableConcept]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRoleVarargs(value: CodeableConcept*): Self = StObject.set(x, "role", js.Array(value*))
    
    inline def setWhoReference(value: Reference): Self = StObject.set(x, "whoReference", value.asInstanceOf[js.Any])
    
    inline def setWhoReferenceUndefined: Self = StObject.set(x, "whoReference", js.undefined)
    
    inline def setWhoUri(value: String): Self = StObject.set(x, "whoUri", value.asInstanceOf[js.Any])
    
    inline def setWhoUriUndefined: Self = StObject.set(x, "whoUri", js.undefined)
    
    inline def set_onBehalfOfUri(value: Element): Self = StObject.set(x, "_onBehalfOfUri", value.asInstanceOf[js.Any])
    
    inline def set_onBehalfOfUriUndefined: Self = StObject.set(x, "_onBehalfOfUri", js.undefined)
    
    inline def set_whoUri(value: Element): Self = StObject.set(x, "_whoUri", value.asInstanceOf[js.Any])
    
    inline def set_whoUriUndefined: Self = StObject.set(x, "_whoUri", js.undefined)
  }
}
