package typings.gapiDotClientDotIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRolesResponse extends js.Object {
  /**
    * To retrieve the next page of results, set
    * `ListRolesRequest.page_token` to this value.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The Roles defined on this resource. */
  var roles: js.UndefOr[js.Array[Role]] = js.undefined
}

object ListRolesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, roles: js.Array[Role] = null): ListRolesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRolesResponse]
  }
}

