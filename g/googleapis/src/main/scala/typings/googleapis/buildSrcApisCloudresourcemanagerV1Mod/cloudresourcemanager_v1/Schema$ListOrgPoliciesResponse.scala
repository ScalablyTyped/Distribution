package typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response returned from the ListOrgPolicies method. It will be empty if
  * no `Policies` are set on the resource.
  */
@js.native
trait Schema$ListOrgPoliciesResponse extends js.Object {
  /**
    * Page token used to retrieve the next page. This is currently not used,
    * but the server may at any point start supplying a valid token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The `Policies` that are set on the resource. It will be empty if no
    * `Policies` are set.
    */
  var policies: js.UndefOr[js.Array[Schema$OrgPolicy]] = js.native
}

object Schema$ListOrgPoliciesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, policies: js.Array[Schema$OrgPolicy] = null): Schema$ListOrgPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (policies != null) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListOrgPoliciesResponse]
  }
}

