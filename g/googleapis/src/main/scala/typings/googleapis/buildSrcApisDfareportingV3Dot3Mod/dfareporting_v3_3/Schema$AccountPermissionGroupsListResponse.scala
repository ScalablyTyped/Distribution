package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Account Permission Group List Response
  */
@js.native
trait Schema$AccountPermissionGroupsListResponse extends js.Object {
  /**
    * Account permission group collection.
    */
  var accountPermissionGroups: js.UndefOr[js.Array[Schema$AccountPermissionGroup]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountPermissionGroupsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$AccountPermissionGroupsListResponse {
  @scala.inline
  def apply(accountPermissionGroups: js.Array[Schema$AccountPermissionGroup] = null, kind: String = null): Schema$AccountPermissionGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    if (accountPermissionGroups != null) __obj.updateDynamic("accountPermissionGroups")(accountPermissionGroups.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountPermissionGroupsListResponse]
  }
}

