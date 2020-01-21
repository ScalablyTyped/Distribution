package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a request to list policies for a given enterprise.
  */
@js.native
trait SchemaListPoliciesResponse extends js.Object {
  /**
    * If there are more results, a token to retrieve next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of policies.
    */
  var policies: js.UndefOr[js.Array[SchemaPolicy]] = js.native
}

object SchemaListPoliciesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, policies: js.Array[SchemaPolicy] = null): SchemaListPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (policies != null) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListPoliciesResponse]
  }
}

