package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ProjectsListXpnHostsRequest extends js.Object {
  /**
    * Optional organization ID managed by Cloud Resource Manager, for which to
    * list shared VPC host projects. If not specified, the organization will be
    * inferred from the project.
    */
  var organization: js.UndefOr[String] = js.native
}

object Schema$ProjectsListXpnHostsRequest {
  @scala.inline
  def apply(organization: String = null): Schema$ProjectsListXpnHostsRequest = {
    val __obj = js.Dynamic.literal()
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProjectsListXpnHostsRequest]
  }
}

