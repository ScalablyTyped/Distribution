package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List user permissions response.
  */
@js.native
trait Schema$ListUserPermissionsResponse extends js.Object {
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * All GTM UserPermissions of a GTM Account.
    */
  var userPermission: js.UndefOr[js.Array[Schema$UserPermission]] = js.native
}

object Schema$ListUserPermissionsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, userPermission: js.Array[Schema$UserPermission] = null): Schema$ListUserPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (userPermission != null) __obj.updateDynamic("userPermission")(userPermission.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListUserPermissionsResponse]
  }
}

