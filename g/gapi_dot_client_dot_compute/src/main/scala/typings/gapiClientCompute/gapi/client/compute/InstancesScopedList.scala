package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancesScopedList extends js.Object {
  /** [Output Only] List of instances contained in this scope. */
  var instances: js.UndefOr[js.Array[Instance]] = js.native
  /** [Output Only] Informational warning which replaces the list of instances when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}

object InstancesScopedList {
  @scala.inline
  def apply(): InstancesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesScopedList]
  }
  @scala.inline
  implicit class InstancesScopedListOps[Self <: InstancesScopedList] (val x: Self) extends AnyVal {
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
    def setInstancesVarargs(value: Instance*): Self = this.set("instances", js.Array(value :_*))
    @scala.inline
    def setInstances(value: js.Array[Instance]): Self = this.set("instances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstances: Self = this.set("instances", js.undefined)
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

