package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rule declaring which mitigating actions to take when a device is not
  * compliant with its policy. For every rule, there is always an implicit
  * mitigating action to set policy_compliant to false for the Device resource,
  * and display a message on the device indicating that the device is not
  * compliant with its policy. Other mitigating actions may optionally be taken
  * as well, depending on the field values in the rule.
  */
@js.native
trait SchemaComplianceRule extends js.Object {
  /**
    * A condition which is satisfied if the Android Framework API level on the
    * device doesn&#39;t meet a minimum requirement.
    */
  var apiLevelCondition: js.UndefOr[SchemaApiLevelCondition] = js.native
  /**
    * If set to true, the rule includes a mitigating action to disable apps so
    * that the device is effectively disabled, but app data is preserved. If
    * the device is running an app in locked task mode, the app will be closed
    * and a UI showing the reason for non-compliance will be displayed.
    */
  var disableApps: js.UndefOr[Boolean] = js.native
  /**
    * A condition which is satisfied if there exists any matching
    * NonComplianceDetail for the device.
    */
  var nonComplianceDetailCondition: js.UndefOr[SchemaNonComplianceDetailCondition] = js.native
  /**
    * If set, the rule includes a mitigating action to disable apps specified
    * in the list, but app data is preserved.
    */
  var packageNamesToDisable: js.UndefOr[js.Array[String]] = js.native
}

object SchemaComplianceRule {
  @scala.inline
  def apply(): SchemaComplianceRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComplianceRule]
  }
  @scala.inline
  implicit class SchemaComplianceRuleOps[Self <: SchemaComplianceRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiLevelCondition(value: SchemaApiLevelCondition): Self = this.set("apiLevelCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiLevelCondition: Self = this.set("apiLevelCondition", js.undefined)
    @scala.inline
    def setDisableApps(value: Boolean): Self = this.set("disableApps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableApps: Self = this.set("disableApps", js.undefined)
    @scala.inline
    def setNonComplianceDetailCondition(value: SchemaNonComplianceDetailCondition): Self = this.set("nonComplianceDetailCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonComplianceDetailCondition: Self = this.set("nonComplianceDetailCondition", js.undefined)
    @scala.inline
    def setPackageNamesToDisableVarargs(value: String*): Self = this.set("packageNamesToDisable", js.Array(value :_*))
    @scala.inline
    def setPackageNamesToDisable(value: js.Array[String]): Self = this.set("packageNamesToDisable", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageNamesToDisable: Self = this.set("packageNamesToDisable", js.undefined)
  }
  
}

