package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNonComplianceDetailCondition extends StObject {
  
  /**
    * The reason the device is not in compliance with the setting. If not set, then this condition matches any reason.
    */
  var nonComplianceReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The package name of the app that's out of compliance. If not set, then this condition matches any package name.
    */
  var packageName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the policy setting. This is the JSON field name of a top-level Policy field. If not set, then this condition matches any setting name.
    */
  var settingName: js.UndefOr[String | Null] = js.undefined
}
object SchemaNonComplianceDetailCondition {
  
  inline def apply(): SchemaNonComplianceDetailCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonComplianceDetailCondition]
  }
  
  extension [Self <: SchemaNonComplianceDetailCondition](x: Self) {
    
    inline def setNonComplianceReason(value: String): Self = StObject.set(x, "nonComplianceReason", value.asInstanceOf[js.Any])
    
    inline def setNonComplianceReasonNull: Self = StObject.set(x, "nonComplianceReason", null)
    
    inline def setNonComplianceReasonUndefined: Self = StObject.set(x, "nonComplianceReason", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameNull: Self = StObject.set(x, "packageName", null)
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setSettingName(value: String): Self = StObject.set(x, "settingName", value.asInstanceOf[js.Any])
    
    inline def setSettingNameNull: Self = StObject.set(x, "settingName", null)
    
    inline def setSettingNameUndefined: Self = StObject.set(x, "settingName", js.undefined)
  }
}
