package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

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
trait Schema$ComplianceRule extends js.Object {
  /**
    * A condition which is satisfied if the Android Framework API level on the
    * device doesn&#39;t meet a minimum requirement.
    */
  var apiLevelCondition: js.UndefOr[Schema$ApiLevelCondition] = js.native
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
  var nonComplianceDetailCondition: js.UndefOr[Schema$NonComplianceDetailCondition] = js.native
  /**
    * If set, the rule includes a mitigating action to disable apps specified
    * in the list, but app data is preserved.
    */
  var packageNamesToDisable: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ComplianceRule {
  @scala.inline
  def apply(
    apiLevelCondition: Schema$ApiLevelCondition = null,
    disableApps: js.UndefOr[Boolean] = js.undefined,
    nonComplianceDetailCondition: Schema$NonComplianceDetailCondition = null,
    packageNamesToDisable: js.Array[String] = null
  ): Schema$ComplianceRule = {
    val __obj = js.Dynamic.literal()
    if (apiLevelCondition != null) __obj.updateDynamic("apiLevelCondition")(apiLevelCondition.asInstanceOf[js.Any])
    if (!js.isUndefined(disableApps)) __obj.updateDynamic("disableApps")(disableApps.asInstanceOf[js.Any])
    if (nonComplianceDetailCondition != null) __obj.updateDynamic("nonComplianceDetailCondition")(nonComplianceDetailCondition.asInstanceOf[js.Any])
    if (packageNamesToDisable != null) __obj.updateDynamic("packageNamesToDisable")(packageNamesToDisable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ComplianceRule]
  }
}

