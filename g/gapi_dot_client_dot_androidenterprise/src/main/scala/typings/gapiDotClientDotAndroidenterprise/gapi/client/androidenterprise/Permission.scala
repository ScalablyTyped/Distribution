package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  /** A longer description of the Permissions resource, giving more details of what it affects. */
  var description: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#permission". */
  var kind: js.UndefOr[String] = js.undefined
  /** The name of the permission. */
  var name: js.UndefOr[String] = js.undefined
  /** An opaque string uniquely identifying the permission. */
  var permissionId: js.UndefOr[String] = js.undefined
}

object Permission {
  @scala.inline
  def apply(description: String = null, kind: String = null, name: String = null, permissionId: String = null): Permission = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permission]
  }
}

