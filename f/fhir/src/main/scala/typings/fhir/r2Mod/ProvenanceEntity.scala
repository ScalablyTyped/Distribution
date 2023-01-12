package typings.fhir.r2Mod

import typings.fhir.fhirStrings.derivation
import typings.fhir.fhirStrings.quotation
import typings.fhir.fhirStrings.revision
import typings.fhir.fhirStrings.source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvenanceEntity
  extends StObject
     with BackboneElement {
  
  var _display: js.UndefOr[Element] = js.undefined
  
  var _reference: js.UndefOr[Element] = js.undefined
  
  var _role: js.UndefOr[Element] = js.undefined
  
  /**
    * The entity is attributed to an agent to express the agent's responsibility for that entity, possibly along with other agents. This description can be understood as shorthand for saying that the agent was responsible for the activity which generated the entity.
    */
  var agent: js.UndefOr[ProvenanceAgent] = js.undefined
  
  /**
    * Human-readable description of the entity.
    */
  var display: js.UndefOr[String] = js.undefined
  
  /**
    * Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative.
    */
  var reference: String
  
  /**
    * How the entity was used during the activity.
    */
  var role: derivation | revision | quotation | source
  
  /**
    * If the type is "resource" then the resource itself was the participant. If the type is a type of resource, then the entity identified by the resource is the participant.
    */
  var `type`: Coding
}
object ProvenanceEntity {
  
  inline def apply(reference: String, role: derivation | revision | quotation | source, `type`: Coding): ProvenanceEntity = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvenanceEntity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvenanceEntity] (val x: Self) extends AnyVal {
    
    inline def setAgent(value: ProvenanceAgent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setRole(value: derivation | revision | quotation | source): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setType(value: Coding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    inline def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
    
    inline def set_reference(value: Element): Self = StObject.set(x, "_reference", value.asInstanceOf[js.Any])
    
    inline def set_referenceUndefined: Self = StObject.set(x, "_reference", js.undefined)
    
    inline def set_role(value: Element): Self = StObject.set(x, "_role", value.asInstanceOf[js.Any])
    
    inline def set_roleUndefined: Self = StObject.set(x, "_role", js.undefined)
  }
}
