package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  /** A longer description of the Permissions resource, giving more details of what it affects. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#permission". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the permission. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** An opaque string uniquely identifying the permission. */
  var permissionId: js.UndefOr[java.lang.String] = js.undefined
}

object Permission {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    permissionId: java.lang.String = null
  ): Permission = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId)
    __obj.asInstanceOf[Permission]
  }
}

