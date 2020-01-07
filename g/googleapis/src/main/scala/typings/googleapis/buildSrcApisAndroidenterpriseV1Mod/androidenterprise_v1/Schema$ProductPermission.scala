package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A product permissions resource represents the set of permissions required
  * by a specific app and whether or not they have been accepted by an
  * enterprise admin.  The API can be used to read the set of permissions, and
  * also to update the set to indicate that permissions have been accepted.
  */
@js.native
trait Schema$ProductPermission extends js.Object {
  /**
    * An opaque string uniquely identifying the permission.
    */
  var permissionId: js.UndefOr[String] = js.native
  /**
    * Whether the permission has been accepted or not.
    */
  var state: js.UndefOr[String] = js.native
}

object Schema$ProductPermission {
  @scala.inline
  def apply(permissionId: String = null, state: String = null): Schema$ProductPermission = {
    val __obj = js.Dynamic.literal()
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProductPermission]
  }
}

