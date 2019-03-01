package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAvailableOrgPolicyConstraintsResponse extends js.Object {
  /** The collection of constraints that are settable on the request resource. */
  var constraints: js.UndefOr[js.Array[Constraint]] = js.undefined
  /** Page token used to retrieve the next page. This is currently not used. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListAvailableOrgPolicyConstraintsResponse {
  @scala.inline
  def apply(constraints: js.Array[Constraint] = null, nextPageToken: java.lang.String = null): ListAvailableOrgPolicyConstraintsResponse = {
    val __obj = js.Dynamic.literal()
    if (constraints != null) __obj.updateDynamic("constraints")(constraints)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListAvailableOrgPolicyConstraintsResponse]
  }
}

