package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for `TestIamPermissions` method.
  */
@js.native
trait Schema$TestIamPermissionsResponse extends js.Object {
  /**
    * A subset of `TestPermissionsRequest.permissions` that the caller is
    * allowed.
    */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}

object Schema$TestIamPermissionsResponse {
  @scala.inline
  def apply(permissions: js.Array[String] = null): Schema$TestIamPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TestIamPermissionsResponse]
  }
}

