package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Account Permission List Response
  */
@js.native
trait Schema$AccountPermissionsListResponse extends js.Object {
  /**
    * Account permission collection.
    */
  var accountPermissions: js.UndefOr[js.Array[Schema$AccountPermission]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountPermissionsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$AccountPermissionsListResponse {
  @scala.inline
  def apply(accountPermissions: js.Array[Schema$AccountPermission] = null, kind: String = null): Schema$AccountPermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (accountPermissions != null) __obj.updateDynamic("accountPermissions")(accountPermissions.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountPermissionsListResponse]
  }
}

