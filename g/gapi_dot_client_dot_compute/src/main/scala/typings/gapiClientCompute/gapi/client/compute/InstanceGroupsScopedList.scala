package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupsScopedList extends js.Object {
  /** [Output Only] The list of instance groups that are contained in this scope. */
  var instanceGroups: js.UndefOr[js.Array[InstanceGroup]] = js.native
  /** [Output Only] An informational warning that replaces the list of instance groups when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}

object InstanceGroupsScopedList {
  @scala.inline
  def apply(): InstanceGroupsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupsScopedList]
  }
  @scala.inline
  implicit class InstanceGroupsScopedListOps[Self <: InstanceGroupsScopedList] (val x: Self) extends AnyVal {
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
    def setInstanceGroupsVarargs(value: InstanceGroup*): Self = this.set("instanceGroups", js.Array(value :_*))
    @scala.inline
    def setInstanceGroups(value: js.Array[InstanceGroup]): Self = this.set("instanceGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceGroups: Self = this.set("instanceGroups", js.undefined)
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

