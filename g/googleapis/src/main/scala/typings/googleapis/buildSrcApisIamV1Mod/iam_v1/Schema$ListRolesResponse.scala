package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response containing the roles defined under a resource.
  */
@js.native
trait Schema$ListRolesResponse extends js.Object {
  /**
    * To retrieve the next page of results, set `ListRolesRequest.page_token`
    * to this value.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The Roles defined on this resource.
    */
  var roles: js.UndefOr[js.Array[Schema$Role]] = js.native
}

object Schema$ListRolesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, roles: js.Array[Schema$Role] = null): Schema$ListRolesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListRolesResponse]
  }
}

