package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceRule extends js.Object {
  /** A condition which is satisfied if the Android Framework API level on the device does not meet a minimum requirement. */
  var apiLevelCondition: js.UndefOr[ApiLevelCondition] = js.native
  /**
    * If set to true, the rule includes a mitigating action to disable applications so that the device is effectively disabled, but application data is
    * preserved. If the device is running an app in locked task mode, the app will be closed and a UI showing the reason for non-compliance will be
    * displayed.
    */
  var disableApps: js.UndefOr[Boolean] = js.native
  /** A condition which is satisfied if there exists any matching NonComplianceDetail for the device. */
  var nonComplianceDetailCondition: js.UndefOr[NonComplianceDetailCondition] = js.native
}

object ComplianceRule {
  @scala.inline
  def apply(): ComplianceRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceRule]
  }
  @scala.inline
  implicit class ComplianceRuleOps[Self <: ComplianceRule] (val x: Self) extends AnyVal {
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
    def setApiLevelCondition(value: ApiLevelCondition): Self = this.set("apiLevelCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiLevelCondition: Self = this.set("apiLevelCondition", js.undefined)
    @scala.inline
    def setDisableApps(value: Boolean): Self = this.set("disableApps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableApps: Self = this.set("disableApps", js.undefined)
    @scala.inline
    def setNonComplianceDetailCondition(value: NonComplianceDetailCondition): Self = this.set("nonComplianceDetailCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonComplianceDetailCondition: Self = this.set("nonComplianceDetailCondition", js.undefined)
  }
  
}

