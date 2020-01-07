package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response containing permissions which can be tested on a resource.
  */
@js.native
trait Schema$QueryTestablePermissionsResponse extends js.Object {
  /**
    * To retrieve the next page of results, set
    * `QueryTestableRolesRequest.page_token` to this value.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The Permissions testable on the requested resource.
    */
  var permissions: js.UndefOr[js.Array[Schema$Permission]] = js.native
}

object Schema$QueryTestablePermissionsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, permissions: js.Array[Schema$Permission] = null): Schema$QueryTestablePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$QueryTestablePermissionsResponse]
  }
}

