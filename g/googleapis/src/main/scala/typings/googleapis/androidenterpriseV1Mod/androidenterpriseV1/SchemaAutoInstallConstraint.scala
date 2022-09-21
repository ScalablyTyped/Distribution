package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutoInstallConstraint extends StObject {
  
  /**
    * Charging state constraint.
    */
  var chargingStateConstraint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Device idle state constraint.
    */
  var deviceIdleStateConstraint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Network type constraint.
    */
  var networkTypeConstraint: js.UndefOr[String | Null] = js.undefined
}
object SchemaAutoInstallConstraint {
  
  inline def apply(): SchemaAutoInstallConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoInstallConstraint]
  }
  
  extension [Self <: SchemaAutoInstallConstraint](x: Self) {
    
    inline def setChargingStateConstraint(value: String): Self = StObject.set(x, "chargingStateConstraint", value.asInstanceOf[js.Any])
    
    inline def setChargingStateConstraintNull: Self = StObject.set(x, "chargingStateConstraint", null)
    
    inline def setChargingStateConstraintUndefined: Self = StObject.set(x, "chargingStateConstraint", js.undefined)
    
    inline def setDeviceIdleStateConstraint(value: String): Self = StObject.set(x, "deviceIdleStateConstraint", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdleStateConstraintNull: Self = StObject.set(x, "deviceIdleStateConstraint", null)
    
    inline def setDeviceIdleStateConstraintUndefined: Self = StObject.set(x, "deviceIdleStateConstraint", js.undefined)
    
    inline def setNetworkTypeConstraint(value: String): Self = StObject.set(x, "networkTypeConstraint", value.asInstanceOf[js.Any])
    
    inline def setNetworkTypeConstraintNull: Self = StObject.set(x, "networkTypeConstraint", null)
    
    inline def setNetworkTypeConstraintUndefined: Self = StObject.set(x, "networkTypeConstraint", js.undefined)
  }
}
