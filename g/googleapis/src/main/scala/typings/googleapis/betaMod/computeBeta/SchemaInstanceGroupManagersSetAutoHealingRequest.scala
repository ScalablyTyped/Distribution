package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstanceGroupManagersSetAutoHealingRequest extends StObject {
  
  var autoHealingPolicies: js.UndefOr[js.Array[SchemaInstanceGroupManagerAutoHealingPolicy]] = js.native
}
object SchemaInstanceGroupManagersSetAutoHealingRequest {
  
  @scala.inline
  def apply(): SchemaInstanceGroupManagersSetAutoHealingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersSetAutoHealingRequest]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupManagersSetAutoHealingRequestMutableBuilder[Self <: SchemaInstanceGroupManagersSetAutoHealingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoHealingPolicies(value: js.Array[SchemaInstanceGroupManagerAutoHealingPolicy]): Self = StObject.set(x, "autoHealingPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHealingPoliciesUndefined: Self = StObject.set(x, "autoHealingPolicies", js.undefined)
    
    @scala.inline
    def setAutoHealingPoliciesVarargs(value: SchemaInstanceGroupManagerAutoHealingPolicy*): Self = StObject.set(x, "autoHealingPolicies", js.Array(value :_*))
  }
}
