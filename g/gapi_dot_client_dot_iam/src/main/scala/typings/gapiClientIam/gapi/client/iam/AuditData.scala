package typings.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditData extends js.Object {
  /** Policy delta between the original policy and the newly set policy. */
  var policyDelta: js.UndefOr[PolicyDelta] = js.native
}

object AuditData {
  @scala.inline
  def apply(): AuditData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditData]
  }
  @scala.inline
  implicit class AuditDataOps[Self <: AuditData] (val x: Self) extends AnyVal {
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
    def setPolicyDelta(value: PolicyDelta): Self = this.set("policyDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyDelta: Self = this.set("policyDelta", js.undefined)
  }
  
}

