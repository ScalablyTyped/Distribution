package typings.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOrgPoliciesResponse extends js.Object {
  /**
    * Page token used to retrieve the next page. This is currently not used, but
    * the server may at any point start supplying a valid token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The `Policies` that are set on the resource. It will be empty if no
    * `Policies` are set.
    */
  var policies: js.UndefOr[js.Array[OrgPolicy]] = js.native
}

object ListOrgPoliciesResponse {
  @scala.inline
  def apply(): ListOrgPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrgPoliciesResponse]
  }
  @scala.inline
  implicit class ListOrgPoliciesResponseOps[Self <: ListOrgPoliciesResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setPoliciesVarargs(value: OrgPolicy*): Self = this.set("policies", js.Array(value :_*))
    @scala.inline
    def setPolicies(value: js.Array[OrgPolicy]): Self = this.set("policies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicies: Self = this.set("policies", js.undefined)
  }
  
}

