package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A permission required by the app.
  */
@js.native
trait SchemaApplicationPermission extends js.Object {
  /**
    * A longer description of the permission, providing more detail on what it
    * affects. Localized.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The name of the permission. Localized.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An opaque string uniquely identifying the permission. Not localized.
    */
  var permissionId: js.UndefOr[String] = js.native
}

object SchemaApplicationPermission {
  @scala.inline
  def apply(description: String = null, name: String = null, permissionId: String = null): SchemaApplicationPermission = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApplicationPermission]
  }
}

