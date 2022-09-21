package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractTermActor
  extends StObject
     with BackboneElement {
  
  /**
    * The actor assigned a role in this Contract Provision.
    */
  var entity: Reference
  
  /**
    * Role played by the actor assigned this role in this Contract Provision.
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object ContractTermActor {
  
  inline def apply(entity: Reference): ContractTermActor = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractTermActor]
  }
  
  extension [Self <: ContractTermActor](x: Self) {
    
    inline def setEntity(value: Reference): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setRole(value: js.Array[CodeableConcept]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRoleVarargs(value: CodeableConcept*): Self = StObject.set(x, "role", js.Array(value*))
  }
}
