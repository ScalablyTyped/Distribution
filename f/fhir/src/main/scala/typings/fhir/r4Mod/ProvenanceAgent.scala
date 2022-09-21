package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvenanceAgent
  extends StObject
     with BackboneElement {
  
  /**
    * onBehalfOfIdentity should be used when the agent is not a Resource type.
    */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
  
  /**
    * For example: doctor, nurse, clerk, etc.
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * For example: author, performer, enterer, attester, etc.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * whoIdentity should be used when the agent is not a Resource type.
    */
  var who: Reference
}
object ProvenanceAgent {
  
  inline def apply(who: Reference): ProvenanceAgent = {
    val __obj = js.Dynamic.literal(who = who.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvenanceAgent]
  }
  
  extension [Self <: ProvenanceAgent](x: Self) {
    
    inline def setOnBehalfOf(value: Reference): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
    
    inline def setRole(value: js.Array[CodeableConcept]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRoleVarargs(value: CodeableConcept*): Self = StObject.set(x, "role", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWho(value: Reference): Self = StObject.set(x, "who", value.asInstanceOf[js.Any])
  }
}
