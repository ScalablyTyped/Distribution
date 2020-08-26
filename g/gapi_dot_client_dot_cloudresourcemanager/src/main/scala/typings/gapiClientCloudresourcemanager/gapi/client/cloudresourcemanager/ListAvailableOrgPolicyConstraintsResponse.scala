package typings.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAvailableOrgPolicyConstraintsResponse extends js.Object {
  /** The collection of constraints that are settable on the request resource. */
  var constraints: js.UndefOr[js.Array[Constraint]] = js.native
  /** Page token used to retrieve the next page. This is currently not used. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListAvailableOrgPolicyConstraintsResponse {
  @scala.inline
  def apply(): ListAvailableOrgPolicyConstraintsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableOrgPolicyConstraintsResponse]
  }
  @scala.inline
  implicit class ListAvailableOrgPolicyConstraintsResponseOps[Self <: ListAvailableOrgPolicyConstraintsResponse] (val x: Self) extends AnyVal {
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
    def setConstraintsVarargs(value: Constraint*): Self = this.set("constraints", js.Array(value :_*))
    @scala.inline
    def setConstraints(value: js.Array[Constraint]): Self = this.set("constraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

