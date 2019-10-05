package typings.gapiDotClientDotIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditData extends js.Object {
  /** Policy delta between the original policy and the newly set policy. */
  var policyDelta: js.UndefOr[PolicyDelta] = js.undefined
}

object AuditData {
  @scala.inline
  def apply(policyDelta: PolicyDelta = null): AuditData = {
    val __obj = js.Dynamic.literal()
    if (policyDelta != null) __obj.updateDynamic("policyDelta")(policyDelta)
    __obj.asInstanceOf[AuditData]
  }
}

