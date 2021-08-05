package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An entity used in this activity
  */
trait ProvenanceEntity
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'role'.
    */
  var _role: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'whatUri'.
    */
  var _whatUri: js.UndefOr[Element] = js.undefined
  
  /**
    * Entity is attributed to this agent
    */
  var agent: js.UndefOr[js.Array[ProvenanceAgent]] = js.undefined
  
  /**
    * derivation | revision | quotation | source | removal
    */
  var role: code
  
  /**
    * Identity of entity
    */
  var whatIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Identity of entity
    */
  var whatReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identity of entity
    */
  var whatUri: js.UndefOr[uri] = js.undefined
}
object ProvenanceEntity {
  
  inline def apply(role: code): ProvenanceEntity = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvenanceEntity]
  }
  
  extension [Self <: ProvenanceEntity](x: Self) {
    
    inline def setAgent(value: js.Array[ProvenanceAgent]): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setAgentVarargs(value: ProvenanceAgent*): Self = StObject.set(x, "agent", js.Array(value :_*))
    
    inline def setRole(value: code): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setWhatIdentifier(value: Identifier): Self = StObject.set(x, "whatIdentifier", value.asInstanceOf[js.Any])
    
    inline def setWhatIdentifierUndefined: Self = StObject.set(x, "whatIdentifier", js.undefined)
    
    inline def setWhatReference(value: Reference): Self = StObject.set(x, "whatReference", value.asInstanceOf[js.Any])
    
    inline def setWhatReferenceUndefined: Self = StObject.set(x, "whatReference", js.undefined)
    
    inline def setWhatUri(value: uri): Self = StObject.set(x, "whatUri", value.asInstanceOf[js.Any])
    
    inline def setWhatUriUndefined: Self = StObject.set(x, "whatUri", js.undefined)
    
    inline def set_role(value: Element): Self = StObject.set(x, "_role", value.asInstanceOf[js.Any])
    
    inline def set_roleUndefined: Self = StObject.set(x, "_role", js.undefined)
    
    inline def set_whatUri(value: Element): Self = StObject.set(x, "_whatUri", value.asInstanceOf[js.Any])
    
    inline def set_whatUriUndefined: Self = StObject.set(x, "_whatUri", js.undefined)
  }
}
