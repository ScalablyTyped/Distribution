package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNetworkEndpointGroupsScopedList extends js.Object {
  /**
    * [Output Only] The list of network endpoint groups that are contained in
    * this scope.
    */
  var networkEndpointGroups: js.UndefOr[js.Array[SchemaNetworkEndpointGroup]] = js.native
  /**
    * [Output Only] An informational warning that replaces the list of network
    * endpoint groups when the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaNetworkEndpointGroupsScopedList {
  @scala.inline
  def apply(): SchemaNetworkEndpointGroupsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointGroupsScopedList]
  }
  @scala.inline
  implicit class SchemaNetworkEndpointGroupsScopedListOps[Self <: SchemaNetworkEndpointGroupsScopedList] (val x: Self) extends AnyVal {
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
    def setNetworkEndpointGroupsVarargs(value: SchemaNetworkEndpointGroup*): Self = this.set("networkEndpointGroups", js.Array(value :_*))
    @scala.inline
    def setNetworkEndpointGroups(value: js.Array[SchemaNetworkEndpointGroup]): Self = this.set("networkEndpointGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkEndpointGroups: Self = this.set("networkEndpointGroups", js.undefined)
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

