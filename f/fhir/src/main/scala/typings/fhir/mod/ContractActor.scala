package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractActor
  extends StObject
     with BackboneElement {
  
  /**
    * Who or what actors are assigned roles in this Contract.
    */
  var entity: Reference
  
  /**
    * Role type of actors assigned roles in this Contract.
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object ContractActor {
  
  inline def apply(entity: Reference): ContractActor = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractActor]
  }
  
  extension [Self <: ContractActor](x: Self) {
    
    inline def setEntity(value: Reference): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setRole(value: js.Array[CodeableConcept]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRoleVarargs(value: CodeableConcept*): Self = StObject.set(x, "role", js.Array(value*))
  }
}
