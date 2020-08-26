package typings.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOrgPolicyRequest extends js.Object {
  /** Name of the `Constraint` to get the `Policy`. */
  var constraint: js.UndefOr[String] = js.native
}

object GetOrgPolicyRequest {
  @scala.inline
  def apply(): GetOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOrgPolicyRequest]
  }
  @scala.inline
  implicit class GetOrgPolicyRequestOps[Self <: GetOrgPolicyRequest] (val x: Self) extends AnyVal {
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
    def setConstraint(value: String): Self = this.set("constraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraint: Self = this.set("constraint", js.undefined)
  }
  
}

