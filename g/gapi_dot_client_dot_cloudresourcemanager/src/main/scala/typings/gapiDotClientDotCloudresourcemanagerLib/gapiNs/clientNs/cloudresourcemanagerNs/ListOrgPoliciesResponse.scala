package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOrgPoliciesResponse extends js.Object {
  /**
    * Page token used to retrieve the next page. This is currently not used, but
    * the server may at any point start supplying a valid token.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The `Policies` that are set on the resource. It will be empty if no
    * `Policies` are set.
    */
  var policies: js.UndefOr[js.Array[OrgPolicy]] = js.undefined
}

object ListOrgPoliciesResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, policies: js.Array[OrgPolicy] = null): ListOrgPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (policies != null) __obj.updateDynamic("policies")(policies)
    __obj.asInstanceOf[ListOrgPoliciesResponse]
  }
}

