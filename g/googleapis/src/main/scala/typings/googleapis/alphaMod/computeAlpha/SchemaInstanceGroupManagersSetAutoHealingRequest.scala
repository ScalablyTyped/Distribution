package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagersSetAutoHealingRequest extends StObject {
  
  var autoHealingPolicies: js.UndefOr[js.Array[SchemaInstanceGroupManagerAutoHealingPolicy]] = js.undefined
}
object SchemaInstanceGroupManagersSetAutoHealingRequest {
  
  inline def apply(): SchemaInstanceGroupManagersSetAutoHealingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersSetAutoHealingRequest]
  }
  
  extension [Self <: SchemaInstanceGroupManagersSetAutoHealingRequest](x: Self) {
    
    inline def setAutoHealingPolicies(value: js.Array[SchemaInstanceGroupManagerAutoHealingPolicy]): Self = StObject.set(x, "autoHealingPolicies", value.asInstanceOf[js.Any])
    
    inline def setAutoHealingPoliciesUndefined: Self = StObject.set(x, "autoHealingPolicies", js.undefined)
    
    inline def setAutoHealingPoliciesVarargs(value: SchemaInstanceGroupManagerAutoHealingPolicy*): Self = StObject.set(x, "autoHealingPolicies", js.Array(value :_*))
  }
}
