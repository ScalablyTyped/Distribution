package typings.gapiDotClientDotCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAvailableOrgPolicyConstraintsResponse extends js.Object {
  /** The collection of constraints that are settable on the request resource. */
  var constraints: js.UndefOr[js.Array[Constraint]] = js.undefined
  /** Page token used to retrieve the next page. This is currently not used. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListAvailableOrgPolicyConstraintsResponse {
  @scala.inline
  def apply(constraints: js.Array[Constraint] = null, nextPageToken: String = null): ListAvailableOrgPolicyConstraintsResponse = {
    val __obj = js.Dynamic.literal()
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAvailableOrgPolicyConstraintsResponse]
  }
}

