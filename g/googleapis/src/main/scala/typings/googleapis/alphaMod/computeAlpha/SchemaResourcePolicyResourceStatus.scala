package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourcePolicyResourceStatus extends StObject {
  
  /**
    * [Output Only] Specifies a set of output values reffering to the instance_schedule_policy system status. This field should have the same name as corresponding policy field.
    */
  var instanceSchedulePolicy: js.UndefOr[SchemaResourcePolicyResourceStatusInstanceSchedulePolicyStatus] = js.undefined
}
object SchemaResourcePolicyResourceStatus {
  
  inline def apply(): SchemaResourcePolicyResourceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicyResourceStatus]
  }
  
  extension [Self <: SchemaResourcePolicyResourceStatus](x: Self) {
    
    inline def setInstanceSchedulePolicy(value: SchemaResourcePolicyResourceStatusInstanceSchedulePolicyStatus): Self = StObject.set(x, "instanceSchedulePolicy", value.asInstanceOf[js.Any])
    
    inline def setInstanceSchedulePolicyUndefined: Self = StObject.set(x, "instanceSchedulePolicy", js.undefined)
  }
}
