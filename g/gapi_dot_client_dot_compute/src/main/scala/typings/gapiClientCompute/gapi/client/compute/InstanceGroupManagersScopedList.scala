package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupManagersScopedList extends js.Object {
  /** [Output Only] The list of managed instance groups that are contained in the specified project and zone. */
  var instanceGroupManagers: js.UndefOr[js.Array[InstanceGroupManager]] = js.native
  /** [Output Only] The warning that replaces the list of managed instance groups when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}

object InstanceGroupManagersScopedList {
  @scala.inline
  def apply(): InstanceGroupManagersScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagersScopedList]
  }
  @scala.inline
  implicit class InstanceGroupManagersScopedListOps[Self <: InstanceGroupManagersScopedList] (val x: Self) extends AnyVal {
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
    def setInstanceGroupManagersVarargs(value: InstanceGroupManager*): Self = this.set("instanceGroupManagers", js.Array(value :_*))
    @scala.inline
    def setInstanceGroupManagers(value: js.Array[InstanceGroupManager]): Self = this.set("instanceGroupManagers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceGroupManagers: Self = this.set("instanceGroupManagers", js.undefined)
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

