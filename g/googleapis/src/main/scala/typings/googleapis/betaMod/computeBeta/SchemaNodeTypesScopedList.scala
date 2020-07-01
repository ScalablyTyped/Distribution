package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNodeTypesScopedList extends js.Object {
  /**
    * [Output Only] A list of node types contained in this scope.
    */
  var nodeTypes: js.UndefOr[js.Array[SchemaNodeType]] = js.native
  /**
    * [Output Only] An informational warning that appears when the node types
    * list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaNodeTypesScopedList {
  @scala.inline
  def apply(nodeTypes: js.Array[SchemaNodeType] = null, warning: Code = null): SchemaNodeTypesScopedList = {
    val __obj = js.Dynamic.literal()
    if (nodeTypes != null) __obj.updateDynamic("nodeTypes")(nodeTypes.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNodeTypesScopedList]
  }
}

