package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An ID for a user or group as seen in Permission items.
  */
@js.native
trait Schema$PermissionId extends js.Object {
  /**
    * The permission ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * This is always drive#permissionId.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$PermissionId {
  @scala.inline
  def apply(id: String = null, kind: String = null): Schema$PermissionId = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PermissionId]
  }
}

