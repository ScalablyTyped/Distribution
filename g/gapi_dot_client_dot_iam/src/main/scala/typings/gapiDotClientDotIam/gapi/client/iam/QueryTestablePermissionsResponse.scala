package typings.gapiDotClientDotIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryTestablePermissionsResponse extends js.Object {
  /**
    * To retrieve the next page of results, set
    * `QueryTestableRolesRequest.page_token` to this value.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The Permissions testable on the requested resource. */
  var permissions: js.UndefOr[js.Array[Permission]] = js.undefined
}

object QueryTestablePermissionsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, permissions: js.Array[Permission] = null): QueryTestablePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[QueryTestablePermissionsResponse]
  }
}

