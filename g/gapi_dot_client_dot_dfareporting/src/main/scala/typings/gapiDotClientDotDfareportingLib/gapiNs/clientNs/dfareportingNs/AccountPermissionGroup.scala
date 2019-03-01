package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissionGroup extends js.Object {
  /** ID of this account permission group. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountPermissionGroup". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this account permission group. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object AccountPermissionGroup {
  @scala.inline
  def apply(id: java.lang.String = null, kind: java.lang.String = null, name: java.lang.String = null): AccountPermissionGroup = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AccountPermissionGroup]
  }
}

