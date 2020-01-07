package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$NodeTypesScopedList extends js.Object {
  /**
    * [Output Only] A list of node types contained in this scope.
    */
  var nodeTypes: js.UndefOr[js.Array[Schema$NodeType]] = js.native
  /**
    * [Output Only] An informational warning that appears when the node types
    * list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$NodeTypesScopedList {
  @scala.inline
  def apply(nodeTypes: js.Array[Schema$NodeType] = null, warning: Anon_Code = null): Schema$NodeTypesScopedList = {
    val __obj = js.Dynamic.literal()
    if (nodeTypes != null) __obj.updateDynamic("nodeTypes")(nodeTypes.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NodeTypesScopedList]
  }
}

