package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsListXpnHostsRequest extends js.Object {
  /**
    * Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host projects. If not specified, the organization will be
    * inferred from the project.
    */
  var organization: js.UndefOr[String] = js.native
}

object ProjectsListXpnHostsRequest {
  @scala.inline
  def apply(): ProjectsListXpnHostsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectsListXpnHostsRequest]
  }
  @scala.inline
  implicit class ProjectsListXpnHostsRequestOps[Self <: ProjectsListXpnHostsRequest] (val x: Self) extends AnyVal {
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
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
  }
  
}

