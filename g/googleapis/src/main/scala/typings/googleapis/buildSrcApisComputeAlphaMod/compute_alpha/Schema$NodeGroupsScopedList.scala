package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$NodeGroupsScopedList extends js.Object {
  /**
    * [Output Only] A list of node groups contained in this scope.
    */
  var nodeGroups: js.UndefOr[js.Array[Schema$NodeGroup]] = js.native
  /**
    * [Output Only] An informational warning that appears when the nodeGroup
    * list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$NodeGroupsScopedList {
  @scala.inline
  def apply(nodeGroups: js.Array[Schema$NodeGroup] = null, warning: Anon_Code = null): Schema$NodeGroupsScopedList = {
    val __obj = js.Dynamic.literal()
    if (nodeGroups != null) __obj.updateDynamic("nodeGroups")(nodeGroups.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NodeGroupsScopedList]
  }
}

