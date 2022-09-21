package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBlockAction extends StObject {
  
  /**
    * Number of days the policy is non-compliant before the device or work profile is blocked. To block access immediately, set to 0. blockAfterDays must be less than wipeAfterDays.
    */
  var blockAfterDays: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Specifies the scope of this BlockAction. Only applicable to devices that are company-owned.
    */
  var blockScope: js.UndefOr[String | Null] = js.undefined
}
object SchemaBlockAction {
  
  inline def apply(): SchemaBlockAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBlockAction]
  }
  
  extension [Self <: SchemaBlockAction](x: Self) {
    
    inline def setBlockAfterDays(value: Double): Self = StObject.set(x, "blockAfterDays", value.asInstanceOf[js.Any])
    
    inline def setBlockAfterDaysNull: Self = StObject.set(x, "blockAfterDays", null)
    
    inline def setBlockAfterDaysUndefined: Self = StObject.set(x, "blockAfterDays", js.undefined)
    
    inline def setBlockScope(value: String): Self = StObject.set(x, "blockScope", value.asInstanceOf[js.Any])
    
    inline def setBlockScopeNull: Self = StObject.set(x, "blockScope", null)
    
    inline def setBlockScopeUndefined: Self = StObject.set(x, "blockScope", js.undefined)
  }
}
