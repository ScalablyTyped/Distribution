package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStatefulPolicy extends StObject {
  
  var preservedResources: js.UndefOr[SchemaStatefulPolicyPreservedResources] = js.undefined
  
  var preservedState: js.UndefOr[SchemaStatefulPolicyPreservedState] = js.undefined
}
object SchemaStatefulPolicy {
  
  inline def apply(): SchemaStatefulPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatefulPolicy]
  }
  
  extension [Self <: SchemaStatefulPolicy](x: Self) {
    
    inline def setPreservedResources(value: SchemaStatefulPolicyPreservedResources): Self = StObject.set(x, "preservedResources", value.asInstanceOf[js.Any])
    
    inline def setPreservedResourcesUndefined: Self = StObject.set(x, "preservedResources", js.undefined)
    
    inline def setPreservedState(value: SchemaStatefulPolicyPreservedState): Self = StObject.set(x, "preservedState", value.asInstanceOf[js.Any])
    
    inline def setPreservedStateUndefined: Self = StObject.set(x, "preservedState", js.undefined)
  }
}
