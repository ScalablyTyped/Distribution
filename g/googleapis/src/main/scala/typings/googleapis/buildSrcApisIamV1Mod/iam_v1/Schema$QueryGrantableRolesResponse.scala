package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The grantable role query response.
  */
@js.native
trait Schema$QueryGrantableRolesResponse extends js.Object {
  /**
    * To retrieve the next page of results, set
    * `QueryGrantableRolesRequest.page_token` to this value.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of matching roles.
    */
  var roles: js.UndefOr[js.Array[Schema$Role]] = js.native
}

object Schema$QueryGrantableRolesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, roles: js.Array[Schema$Role] = null): Schema$QueryGrantableRolesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$QueryGrantableRolesResponse]
  }
}

