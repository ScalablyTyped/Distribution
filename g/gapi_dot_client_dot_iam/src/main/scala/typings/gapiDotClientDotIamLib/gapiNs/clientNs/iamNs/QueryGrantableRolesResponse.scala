package typings
package gapiDotClientDotIamLib.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryGrantableRolesResponse extends js.Object {
  /**
    * To retrieve the next page of results, set
    * `QueryGrantableRolesRequest.page_token` to this value.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The list of matching roles. */
  var roles: js.UndefOr[js.Array[Role]] = js.undefined
}

object QueryGrantableRolesResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, roles: js.Array[Role] = null): QueryGrantableRolesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (roles != null) __obj.updateDynamic("roles")(roles)
    __obj.asInstanceOf[QueryGrantableRolesResponse]
  }
}

