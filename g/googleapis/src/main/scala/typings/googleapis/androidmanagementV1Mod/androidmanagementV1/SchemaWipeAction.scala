package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWipeAction extends StObject {
  
  /**
    * Whether the factory-reset protection data is preserved on the device. This setting doesn’t apply to work profiles.
    */
  var preserveFrp: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Number of days the policy is non-compliant before the device or work profile is wiped. wipeAfterDays must be greater than blockAfterDays.
    */
  var wipeAfterDays: js.UndefOr[Double | Null] = js.undefined
}
object SchemaWipeAction {
  
  inline def apply(): SchemaWipeAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWipeAction]
  }
  
  extension [Self <: SchemaWipeAction](x: Self) {
    
    inline def setPreserveFrp(value: Boolean): Self = StObject.set(x, "preserveFrp", value.asInstanceOf[js.Any])
    
    inline def setPreserveFrpNull: Self = StObject.set(x, "preserveFrp", null)
    
    inline def setPreserveFrpUndefined: Self = StObject.set(x, "preserveFrp", js.undefined)
    
    inline def setWipeAfterDays(value: Double): Self = StObject.set(x, "wipeAfterDays", value.asInstanceOf[js.Any])
    
    inline def setWipeAfterDaysNull: Self = StObject.set(x, "wipeAfterDays", null)
    
    inline def setWipeAfterDaysUndefined: Self = StObject.set(x, "wipeAfterDays", js.undefined)
  }
}
