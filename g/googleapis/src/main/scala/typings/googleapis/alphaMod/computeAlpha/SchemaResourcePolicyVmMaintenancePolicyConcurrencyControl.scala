package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourcePolicyVmMaintenancePolicyConcurrencyControl extends StObject {
  
  var concurrencyLimit: js.UndefOr[Double | Null] = js.undefined
}
object SchemaResourcePolicyVmMaintenancePolicyConcurrencyControl {
  
  inline def apply(): SchemaResourcePolicyVmMaintenancePolicyConcurrencyControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicyVmMaintenancePolicyConcurrencyControl]
  }
  
  extension [Self <: SchemaResourcePolicyVmMaintenancePolicyConcurrencyControl](x: Self) {
    
    inline def setConcurrencyLimit(value: Double): Self = StObject.set(x, "concurrencyLimit", value.asInstanceOf[js.Any])
    
    inline def setConcurrencyLimitNull: Self = StObject.set(x, "concurrencyLimit", null)
    
    inline def setConcurrencyLimitUndefined: Self = StObject.set(x, "concurrencyLimit", js.undefined)
  }
}
