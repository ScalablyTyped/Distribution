package typings.googleapis.buildSrcApisServiceconsumermanagementV1Mod.serviceconsumermanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Translates to IAM Policy bindings (without auditing at this level)
  */
@js.native
trait Schema$PolicyBinding extends js.Object {
  /**
    * Uses the same format as in IAM policy. `member` must include both a
    * prefix and ID. For example, `user:{emailId}`, `serviceAccount:{emailId}`,
    * `group:{emailId}`.
    */
  var members: js.UndefOr[js.Array[String]] = js.native
  /**
    * Role. (https://cloud.google.com/iam/docs/understanding-roles) For
    * example, `roles/viewer`, `roles/editor`, or `roles/owner`.
    */
  var role: js.UndefOr[String] = js.native
}

object Schema$PolicyBinding {
  @scala.inline
  def apply(members: js.Array[String] = null, role: String = null): Schema$PolicyBinding = {
    val __obj = js.Dynamic.literal()
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PolicyBinding]
  }
}

