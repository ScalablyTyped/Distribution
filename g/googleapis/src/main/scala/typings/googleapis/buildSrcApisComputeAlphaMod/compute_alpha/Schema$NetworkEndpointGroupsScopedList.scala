package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$NetworkEndpointGroupsScopedList extends js.Object {
  /**
    * [Output Only] The list of network endpoint groups that are contained in
    * this scope.
    */
  var networkEndpointGroups: js.UndefOr[js.Array[Schema$NetworkEndpointGroup]] = js.native
  /**
    * [Output Only] An informational warning that replaces the list of network
    * endpoint groups when the list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$NetworkEndpointGroupsScopedList {
  @scala.inline
  def apply(networkEndpointGroups: js.Array[Schema$NetworkEndpointGroup] = null, warning: Anon_Code = null): Schema$NetworkEndpointGroupsScopedList = {
    val __obj = js.Dynamic.literal()
    if (networkEndpointGroups != null) __obj.updateDynamic("networkEndpointGroups")(networkEndpointGroups.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NetworkEndpointGroupsScopedList]
  }
}

