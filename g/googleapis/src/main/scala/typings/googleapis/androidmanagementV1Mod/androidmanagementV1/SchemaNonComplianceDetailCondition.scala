package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A compliance rule condition which is satisfied if there exists any matching
  * NonComplianceDetail for the device. A NonComplianceDetail matches a
  * NonComplianceDetailCondition if all the fields which are set within the
  * NonComplianceDetailCondition match the corresponding NonComplianceDetail
  * fields.
  */
@js.native
trait SchemaNonComplianceDetailCondition extends js.Object {
  /**
    * The reason the device is not in compliance with the setting. If not set,
    * then this condition matches any reason.
    */
  var nonComplianceReason: js.UndefOr[String] = js.native
  /**
    * The package name of the app that&#39;s out of compliance. If not set,
    * then this condition matches any package name.
    */
  var packageName: js.UndefOr[String] = js.native
  /**
    * The name of the policy setting. This is the JSON field name of a
    * top-level Policy field. If not set, then this condition matches any
    * setting name.
    */
  var settingName: js.UndefOr[String] = js.native
}

object SchemaNonComplianceDetailCondition {
  @scala.inline
  def apply(nonComplianceReason: String = null, packageName: String = null, settingName: String = null): SchemaNonComplianceDetailCondition = {
    val __obj = js.Dynamic.literal()
    if (nonComplianceReason != null) __obj.updateDynamic("nonComplianceReason")(nonComplianceReason.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    if (settingName != null) __obj.updateDynamic("settingName")(settingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNonComplianceDetailCondition]
  }
}

