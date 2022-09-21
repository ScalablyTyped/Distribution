package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagerAutoHealingPolicyAutoHealingTriggers extends StObject {
  
  /**
    * If you have configured an application-based health check for the group, this field controls whether to trigger VM autohealing based on a failed health check. Valid values are: - ON (default): The group recreates running VMs that fail the application-based health check. - OFF: When set to OFF, you can still observe instance health state, but the group does not recreate VMs that fail the application-based health check. This is useful for troubleshooting and setting up your health check configuration.
    */
  var onHealthCheck: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceGroupManagerAutoHealingPolicyAutoHealingTriggers {
  
  inline def apply(): SchemaInstanceGroupManagerAutoHealingPolicyAutoHealingTriggers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerAutoHealingPolicyAutoHealingTriggers]
  }
  
  extension [Self <: SchemaInstanceGroupManagerAutoHealingPolicyAutoHealingTriggers](x: Self) {
    
    inline def setOnHealthCheck(value: String): Self = StObject.set(x, "onHealthCheck", value.asInstanceOf[js.Any])
    
    inline def setOnHealthCheckNull: Self = StObject.set(x, "onHealthCheck", null)
    
    inline def setOnHealthCheckUndefined: Self = StObject.set(x, "onHealthCheck", js.undefined)
  }
}
