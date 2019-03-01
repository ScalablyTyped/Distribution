package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPoliciesResponse extends js.Object {
  /** If there are more results, a token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The list of policies. */
  var policies: js.UndefOr[js.Array[Policy]] = js.undefined
}

object ListPoliciesResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, policies: js.Array[Policy] = null): ListPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (policies != null) __obj.updateDynamic("policies")(policies)
    __obj.asInstanceOf[ListPoliciesResponse]
  }
}

