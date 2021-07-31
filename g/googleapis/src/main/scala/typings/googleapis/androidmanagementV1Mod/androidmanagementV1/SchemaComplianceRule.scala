package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rule declaring which mitigating actions to take when a device is not
  * compliant with its policy. For every rule, there is always an implicit
  * mitigating action to set policy_compliant to false for the Device resource,
  * and display a message on the device indicating that the device is not
  * compliant with its policy. Other mitigating actions may optionally be taken
  * as well, depending on the field values in the rule.
  */
trait SchemaComplianceRule extends StObject {
  
  /**
    * A condition which is satisfied if the Android Framework API level on the
    * device doesn&#39;t meet a minimum requirement.
    */
  var apiLevelCondition: js.UndefOr[SchemaApiLevelCondition] = js.undefined
  
  /**
    * If set to true, the rule includes a mitigating action to disable apps so
    * that the device is effectively disabled, but app data is preserved. If
    * the device is running an app in locked task mode, the app will be closed
    * and a UI showing the reason for non-compliance will be displayed.
    */
  var disableApps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A condition which is satisfied if there exists any matching
    * NonComplianceDetail for the device.
    */
  var nonComplianceDetailCondition: js.UndefOr[SchemaNonComplianceDetailCondition] = js.undefined
  
  /**
    * If set, the rule includes a mitigating action to disable apps specified
    * in the list, but app data is preserved.
    */
  var packageNamesToDisable: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaComplianceRule {
  
  @scala.inline
  def apply(): SchemaComplianceRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComplianceRule]
  }
  
  @scala.inline
  implicit class SchemaComplianceRuleMutableBuilder[Self <: SchemaComplianceRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiLevelCondition(value: SchemaApiLevelCondition): Self = StObject.set(x, "apiLevelCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiLevelConditionUndefined: Self = StObject.set(x, "apiLevelCondition", js.undefined)
    
    @scala.inline
    def setDisableApps(value: Boolean): Self = StObject.set(x, "disableApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAppsUndefined: Self = StObject.set(x, "disableApps", js.undefined)
    
    @scala.inline
    def setNonComplianceDetailCondition(value: SchemaNonComplianceDetailCondition): Self = StObject.set(x, "nonComplianceDetailCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonComplianceDetailConditionUndefined: Self = StObject.set(x, "nonComplianceDetailCondition", js.undefined)
    
    @scala.inline
    def setPackageNamesToDisable(value: js.Array[String]): Self = StObject.set(x, "packageNamesToDisable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNamesToDisableUndefined: Self = StObject.set(x, "packageNamesToDisable", js.undefined)
    
    @scala.inline
    def setPackageNamesToDisableVarargs(value: String*): Self = StObject.set(x, "packageNamesToDisable", js.Array(value :_*))
  }
}
