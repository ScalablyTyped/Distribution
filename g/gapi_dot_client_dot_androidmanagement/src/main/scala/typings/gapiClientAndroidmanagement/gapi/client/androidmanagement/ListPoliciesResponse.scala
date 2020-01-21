package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPoliciesResponse extends js.Object {
  /** If there are more results, a token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The list of policies. */
  var policies: js.UndefOr[js.Array[Policy]] = js.undefined
}

object ListPoliciesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, policies: js.Array[Policy] = null): ListPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (policies != null) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPoliciesResponse]
  }
}

