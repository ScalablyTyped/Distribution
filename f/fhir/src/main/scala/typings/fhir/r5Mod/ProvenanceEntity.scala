package typings.fhir.r5Mod

import typings.fhir.fhirStrings.derivation
import typings.fhir.fhirStrings.instantiates
import typings.fhir.fhirStrings.quotation
import typings.fhir.fhirStrings.removal
import typings.fhir.fhirStrings.revision
import typings.fhir.fhirStrings.source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvenanceEntity
  extends StObject
     with BackboneElement {
  
  var _role: js.UndefOr[Element] = js.undefined
  
  /**
    * A usecase where one Provenance.entity.agent is used where the Entity that was used in the creation/updating of the Target, is not in the context of the same custodianship as the Target, and thus the meaning of Provenance.entity.agent is to say that the entity referenced is managed elsewhere and that this Agent provided access to it.  This would be similar to where the Entity being referenced is managed outside FHIR, such as through HL7 v2, v3, or XDS. This might be where the Entity being referenced is managed in another FHIR resource server. Thus it explains the Provenance of that Entity's use in the context of this Provenance activity.
    */
  var agent: js.UndefOr[js.Array[ProvenanceAgent]] = js.undefined
  
  /**
    * How the entity was used during the activity.
    */
  var role: derivation | revision | quotation | source | instantiates | removal
  
  /**
    * whatIdentity should be used for entities that are not a Resource type.
    */
  var what: Reference
}
object ProvenanceEntity {
  
  inline def apply(role: derivation | revision | quotation | source | instantiates | removal, what: Reference): ProvenanceEntity = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], what = what.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvenanceEntity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvenanceEntity] (val x: Self) extends AnyVal {
    
    inline def setAgent(value: js.Array[ProvenanceAgent]): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setAgentVarargs(value: ProvenanceAgent*): Self = StObject.set(x, "agent", js.Array(value*))
    
    inline def setRole(value: derivation | revision | quotation | source | instantiates | removal): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setWhat(value: Reference): Self = StObject.set(x, "what", value.asInstanceOf[js.Any])
    
    inline def set_role(value: Element): Self = StObject.set(x, "_role", value.asInstanceOf[js.Any])
    
    inline def set_roleUndefined: Self = StObject.set(x, "_role", js.undefined)
  }
}
