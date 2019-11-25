package typings.gapiDotClientDotCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOrgPoliciesResponse extends js.Object {
  /**
    * Page token used to retrieve the next page. This is currently not used, but
    * the server may at any point start supplying a valid token.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /**
    * The `Policies` that are set on the resource. It will be empty if no
    * `Policies` are set.
    */
  var policies: js.UndefOr[js.Array[OrgPolicy]] = js.undefined
}

object ListOrgPoliciesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, policies: js.Array[OrgPolicy] = null): ListOrgPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (policies != null) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOrgPoliciesResponse]
  }
}

