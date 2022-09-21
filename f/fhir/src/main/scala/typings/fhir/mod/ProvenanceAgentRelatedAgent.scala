package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvenanceAgentRelatedAgent
  extends StObject
     with BackboneElement {
  
  var _target: js.UndefOr[Element] = js.undefined
  
  /**
    * An internal reference to another agent listed in this provenance by its identifier.
    */
  var target: String
  
  /**
    * The type of relationship between agents.
    */
  var `type`: CodeableConcept
}
object ProvenanceAgentRelatedAgent {
  
  inline def apply(target: String, `type`: CodeableConcept): ProvenanceAgentRelatedAgent = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvenanceAgentRelatedAgent]
  }
  
  extension [Self <: ProvenanceAgentRelatedAgent](x: Self) {
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_target(value: Element): Self = StObject.set(x, "_target", value.asInstanceOf[js.Any])
    
    inline def set_targetUndefined: Self = StObject.set(x, "_target", js.undefined)
  }
}
