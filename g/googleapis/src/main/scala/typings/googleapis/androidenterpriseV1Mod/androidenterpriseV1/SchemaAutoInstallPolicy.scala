package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutoInstallPolicy extends StObject {
  
  /**
    * The constraints for auto-installing the app. You can specify a maximum of one constraint.
    */
  var autoInstallConstraint: js.UndefOr[js.Array[SchemaAutoInstallConstraint]] = js.undefined
  
  /**
    * The auto-install mode. If unset defaults to "doNotAutoInstall".
    */
  var autoInstallMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The priority of the install, as an unsigned integer. A lower number means higher priority.
    */
  var autoInstallPriority: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The minimum version of the app. If a lower version of the app is installed, then the app will be auto-updated according to the auto-install constraints, instead of waiting for the regular auto-update. You can set a minimum version code for at most 20 apps per device.
    */
  var minimumVersionCode: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAutoInstallPolicy {
  
  inline def apply(): SchemaAutoInstallPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoInstallPolicy]
  }
  
  extension [Self <: SchemaAutoInstallPolicy](x: Self) {
    
    inline def setAutoInstallConstraint(value: js.Array[SchemaAutoInstallConstraint]): Self = StObject.set(x, "autoInstallConstraint", value.asInstanceOf[js.Any])
    
    inline def setAutoInstallConstraintUndefined: Self = StObject.set(x, "autoInstallConstraint", js.undefined)
    
    inline def setAutoInstallConstraintVarargs(value: SchemaAutoInstallConstraint*): Self = StObject.set(x, "autoInstallConstraint", js.Array(value*))
    
    inline def setAutoInstallMode(value: String): Self = StObject.set(x, "autoInstallMode", value.asInstanceOf[js.Any])
    
    inline def setAutoInstallModeNull: Self = StObject.set(x, "autoInstallMode", null)
    
    inline def setAutoInstallModeUndefined: Self = StObject.set(x, "autoInstallMode", js.undefined)
    
    inline def setAutoInstallPriority(value: Double): Self = StObject.set(x, "autoInstallPriority", value.asInstanceOf[js.Any])
    
    inline def setAutoInstallPriorityNull: Self = StObject.set(x, "autoInstallPriority", null)
    
    inline def setAutoInstallPriorityUndefined: Self = StObject.set(x, "autoInstallPriority", js.undefined)
    
    inline def setMinimumVersionCode(value: Double): Self = StObject.set(x, "minimumVersionCode", value.asInstanceOf[js.Any])
    
    inline def setMinimumVersionCodeNull: Self = StObject.set(x, "minimumVersionCode", null)
    
    inline def setMinimumVersionCodeUndefined: Self = StObject.set(x, "minimumVersionCode", js.undefined)
  }
}
