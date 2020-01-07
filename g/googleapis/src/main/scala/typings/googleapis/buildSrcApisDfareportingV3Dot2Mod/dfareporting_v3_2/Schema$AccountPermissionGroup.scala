package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AccountPermissionGroups contains a mapping of permission group IDs to
  * names. A permission group is a grouping of account permissions.
  */
@js.native
trait Schema$AccountPermissionGroup extends js.Object {
  /**
    * ID of this account permission group.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountPermissionGroup&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this account permission group.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$AccountPermissionGroup {
  @scala.inline
  def apply(id: String = null, kind: String = null, name: String = null): Schema$AccountPermissionGroup = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountPermissionGroup]
  }
}

