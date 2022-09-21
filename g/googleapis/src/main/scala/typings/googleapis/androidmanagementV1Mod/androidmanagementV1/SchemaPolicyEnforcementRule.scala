package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPolicyEnforcementRule extends StObject {
  
  /**
    * An action to block access to apps and data on a fully managed device or in a work profile. This action also triggers a user-facing notification with information (where possible) on how to correct the compliance issue. Note: wipeAction must also be specified.
    */
  var blockAction: js.UndefOr[SchemaBlockAction] = js.undefined
  
  /**
    * The top-level policy to enforce. For example, applications or passwordPolicies.
    */
  var settingName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An action to reset a fully managed device or delete a work profile. Note: blockAction must also be specified.
    */
  var wipeAction: js.UndefOr[SchemaWipeAction] = js.undefined
}
object SchemaPolicyEnforcementRule {
  
  inline def apply(): SchemaPolicyEnforcementRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyEnforcementRule]
  }
  
  extension [Self <: SchemaPolicyEnforcementRule](x: Self) {
    
    inline def setBlockAction(value: SchemaBlockAction): Self = StObject.set(x, "blockAction", value.asInstanceOf[js.Any])
    
    inline def setBlockActionUndefined: Self = StObject.set(x, "blockAction", js.undefined)
    
    inline def setSettingName(value: String): Self = StObject.set(x, "settingName", value.asInstanceOf[js.Any])
    
    inline def setSettingNameNull: Self = StObject.set(x, "settingName", null)
    
    inline def setSettingNameUndefined: Self = StObject.set(x, "settingName", js.undefined)
    
    inline def setWipeAction(value: SchemaWipeAction): Self = StObject.set(x, "wipeAction", value.asInstanceOf[js.Any])
    
    inline def setWipeActionUndefined: Self = StObject.set(x, "wipeAction", js.undefined)
  }
}
