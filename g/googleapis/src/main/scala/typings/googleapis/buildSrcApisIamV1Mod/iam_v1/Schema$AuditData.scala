package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Audit log information specific to Cloud IAM. This message is serialized as
  * an `Any` type in the `ServiceData` message of an `AuditLog` message.
  */
@js.native
trait Schema$AuditData extends js.Object {
  /**
    * Policy delta between the original policy and the newly set policy.
    */
  var policyDelta: js.UndefOr[Schema$PolicyDelta] = js.native
}

object Schema$AuditData {
  @scala.inline
  def apply(policyDelta: Schema$PolicyDelta = null): Schema$AuditData = {
    val __obj = js.Dynamic.literal()
    if (policyDelta != null) __obj.updateDynamic("policyDelta")(policyDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AuditData]
  }
}

