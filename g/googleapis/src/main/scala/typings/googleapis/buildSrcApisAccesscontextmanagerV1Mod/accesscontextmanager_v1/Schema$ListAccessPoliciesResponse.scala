package typings.googleapis.buildSrcApisAccesscontextmanagerV1Mod.accesscontextmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to `ListAccessPoliciesRequest`.
  */
@js.native
trait Schema$ListAccessPoliciesResponse extends js.Object {
  /**
    * List of the AccessPolicy instances.
    */
  var accessPolicies: js.UndefOr[js.Array[Schema$AccessPolicy]] = js.native
  /**
    * The pagination token to retrieve the next page of results. If the value
    * is empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListAccessPoliciesResponse {
  @scala.inline
  def apply(accessPolicies: js.Array[Schema$AccessPolicy] = null, nextPageToken: String = null): Schema$ListAccessPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (accessPolicies != null) __obj.updateDynamic("accessPolicies")(accessPolicies.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListAccessPoliciesResponse]
  }
}

