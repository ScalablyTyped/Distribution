package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNodeGroupsScopedList extends js.Object {
  /**
    * [Output Only] A list of node groups contained in this scope.
    */
  var nodeGroups: js.UndefOr[js.Array[SchemaNodeGroup]] = js.native
  /**
    * [Output Only] An informational warning that appears when the nodeGroup
    * list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaNodeGroupsScopedList {
  @scala.inline
  def apply(nodeGroups: js.Array[SchemaNodeGroup] = null, warning: AnonCode = null): SchemaNodeGroupsScopedList = {
    val __obj = js.Dynamic.literal()
    if (nodeGroups != null) __obj.updateDynamic("nodeGroups")(nodeGroups.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNodeGroupsScopedList]
  }
}

