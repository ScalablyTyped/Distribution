package typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response returned from the ListAvailableOrgPolicyConstraints method.
  * Returns all `Constraints` that could be set at this level of the hierarchy
  * (contrast with the response from `ListPolicies`, which returns all policies
  * which are set).
  */
@js.native
trait Schema$ListAvailableOrgPolicyConstraintsResponse extends js.Object {
  /**
    * The collection of constraints that are settable on the request resource.
    */
  var constraints: js.UndefOr[js.Array[Schema$Constraint]] = js.native
  /**
    * Page token used to retrieve the next page. This is currently not used.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListAvailableOrgPolicyConstraintsResponse {
  @scala.inline
  def apply(constraints: js.Array[Schema$Constraint] = null, nextPageToken: String = null): Schema$ListAvailableOrgPolicyConstraintsResponse = {
    val __obj = js.Dynamic.literal()
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListAvailableOrgPolicyConstraintsResponse]
  }
}

