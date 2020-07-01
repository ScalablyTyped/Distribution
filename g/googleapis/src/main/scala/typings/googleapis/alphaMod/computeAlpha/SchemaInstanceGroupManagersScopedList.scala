package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupManagersScopedList extends js.Object {
  /**
    * [Output Only] The list of managed instance groups that are contained in
    * the specified project and zone.
    */
  var instanceGroupManagers: js.UndefOr[js.Array[SchemaInstanceGroupManager]] = js.native
  /**
    * [Output Only] The warning that replaces the list of managed instance
    * groups when the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaInstanceGroupManagersScopedList {
  @scala.inline
  def apply(instanceGroupManagers: js.Array[SchemaInstanceGroupManager] = null, warning: Code = null): SchemaInstanceGroupManagersScopedList = {
    val __obj = js.Dynamic.literal()
    if (instanceGroupManagers != null) __obj.updateDynamic("instanceGroupManagers")(instanceGroupManagers.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstanceGroupManagersScopedList]
  }
}

