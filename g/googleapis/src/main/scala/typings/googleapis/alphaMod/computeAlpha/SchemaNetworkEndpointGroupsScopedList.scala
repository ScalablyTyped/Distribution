package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.AnonCode
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
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaNetworkEndpointGroupsScopedList {
  @scala.inline
  def apply(networkEndpointGroups: js.Array[SchemaNetworkEndpointGroup] = null, warning: AnonCode = null): SchemaNetworkEndpointGroupsScopedList = {
    val __obj = js.Dynamic.literal()
    if (networkEndpointGroups != null) __obj.updateDynamic("networkEndpointGroups")(networkEndpointGroups.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetworkEndpointGroupsScopedList]
  }
}

