package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupManagerStatus extends js.Object {
  /**
    * [Output Only] A bit indicating whether the managed instance group is in a
    * stable state. A stable state means that: none of the instances in the
    * managed instance group is currently undergoing any type of change (for
    * example, creation, restart, or deletion); no future changes are scheduled
    * for instances in the managed instance group; and the managed instance
    * group itself is not being modified.
    */
  var isStable: js.UndefOr[Boolean] = js.native
  /**
    * [Output Only] A status of consistency of Instances&#39; versions with
    * their target version specified by version field on Instance Group
    * Manager.
    */
  var versionTarget: js.UndefOr[SchemaInstanceGroupManagerStatusVersionTarget] = js.native
}

object SchemaInstanceGroupManagerStatus {
  @scala.inline
  def apply(
    isStable: js.UndefOr[Boolean] = js.undefined,
    versionTarget: SchemaInstanceGroupManagerStatusVersionTarget = null
  ): SchemaInstanceGroupManagerStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isStable)) __obj.updateDynamic("isStable")(isStable.asInstanceOf[js.Any])
    if (versionTarget != null) __obj.updateDynamic("versionTarget")(versionTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstanceGroupManagerStatus]
  }
}

