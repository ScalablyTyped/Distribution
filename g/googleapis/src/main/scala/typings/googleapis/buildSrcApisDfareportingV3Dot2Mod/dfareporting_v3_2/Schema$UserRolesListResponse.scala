package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User Role List Response
  */
@js.native
trait Schema$UserRolesListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#userRolesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * User role collection.
    */
  var userRoles: js.UndefOr[js.Array[Schema$UserRole]] = js.native
}

object Schema$UserRolesListResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, userRoles: js.Array[Schema$UserRole] = null): Schema$UserRolesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (userRoles != null) __obj.updateDynamic("userRoles")(userRoles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserRolesListResponse]
  }
}

