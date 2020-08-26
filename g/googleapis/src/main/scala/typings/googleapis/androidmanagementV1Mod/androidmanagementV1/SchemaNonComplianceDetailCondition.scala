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
  def apply(): SchemaNonComplianceDetailCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonComplianceDetailCondition]
  }
  @scala.inline
  implicit class SchemaNonComplianceDetailConditionOps[Self <: SchemaNonComplianceDetailCondition] (val x: Self) extends AnyVal {
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
    def setNonComplianceReason(value: String): Self = this.set("nonComplianceReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonComplianceReason: Self = this.set("nonComplianceReason", js.undefined)
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    @scala.inline
    def setSettingName(value: String): Self = this.set("settingName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingName: Self = this.set("settingName", js.undefined)
  }
  
}

