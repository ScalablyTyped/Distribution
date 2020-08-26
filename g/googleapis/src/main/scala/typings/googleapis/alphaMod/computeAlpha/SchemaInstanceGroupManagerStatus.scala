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
  def apply(): SchemaInstanceGroupManagerStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerStatus]
  }
  @scala.inline
  implicit class SchemaInstanceGroupManagerStatusOps[Self <: SchemaInstanceGroupManagerStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsStable(value: Boolean): Self = this.set("isStable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsStable: Self = this.set("isStable", js.undefined)
    @scala.inline
    def setVersionTarget(value: SchemaInstanceGroupManagerStatusVersionTarget): Self = this.set("versionTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionTarget: Self = this.set("versionTarget", js.undefined)
  }
  
}

