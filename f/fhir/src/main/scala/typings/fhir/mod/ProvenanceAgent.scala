package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvenanceAgent
  extends StObject
     with BackboneElement {
  
  /**
    * The individual, device or organization that participated in the event.
    */
  var actor: js.UndefOr[Reference] = js.undefined
  
  /**
    * A relationship between two the agents referenced in this resource. This is defined to allow for explicit description of the delegation between agents.  For example, this human author used this device, or one person acted on another's behest.
    */
  var relatedAgent: js.UndefOr[js.Array[ProvenanceAgentRelatedAgent]] = js.undefined
  
  /**
    * The function of the agent with respect to the activity.
    */
  var role: Coding
  
  /**
    * The identity of the agent as known by the authorization system.
    */
  var userId: js.UndefOr[Identifier] = js.undefined
}
object ProvenanceAgent {
  
  inline def apply(role: Coding): ProvenanceAgent = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvenanceAgent]
  }
  
  extension [Self <: ProvenanceAgent](x: Self) {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setRelatedAgent(value: js.Array[ProvenanceAgentRelatedAgent]): Self = StObject.set(x, "relatedAgent", value.asInstanceOf[js.Any])
    
    inline def setRelatedAgentUndefined: Self = StObject.set(x, "relatedAgent", js.undefined)
    
    inline def setRelatedAgentVarargs(value: ProvenanceAgentRelatedAgent*): Self = StObject.set(x, "relatedAgent", js.Array(value*))
    
    inline def setRole(value: Coding): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: Identifier): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
