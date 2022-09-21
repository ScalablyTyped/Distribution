package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuthorizationConfig extends StObject {
  
  /**
    * List of RbacPolicies.
    */
  var policies: js.UndefOr[js.Array[SchemaRbacPolicy]] = js.undefined
}
object SchemaAuthorizationConfig {
  
  inline def apply(): SchemaAuthorizationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthorizationConfig]
  }
  
  extension [Self <: SchemaAuthorizationConfig](x: Self) {
    
    inline def setPolicies(value: js.Array[SchemaRbacPolicy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: SchemaRbacPolicy*): Self = StObject.set(x, "policies", js.Array(value*))
  }
}
