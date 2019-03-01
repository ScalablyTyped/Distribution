package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsListXpnHostsRequest extends js.Object {
  /**
    * Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host projects. If not specified, the organization will be
    * inferred from the project.
    */
  var organization: js.UndefOr[java.lang.String] = js.undefined
}

object ProjectsListXpnHostsRequest {
  @scala.inline
  def apply(organization: java.lang.String = null): ProjectsListXpnHostsRequest = {
    val __obj = js.Dynamic.literal()
    if (organization != null) __obj.updateDynamic("organization")(organization)
    __obj.asInstanceOf[ProjectsListXpnHostsRequest]
  }
}

