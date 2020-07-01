package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNodeTemplatesScopedList extends js.Object {
  /**
    * [Output Only] A list of node templates contained in this scope.
    */
  var nodeTemplates: js.UndefOr[js.Array[SchemaNodeTemplate]] = js.native
  /**
    * [Output Only] An informational warning that appears when the node
    * templates list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaNodeTemplatesScopedList {
  @scala.inline
  def apply(nodeTemplates: js.Array[SchemaNodeTemplate] = null, warning: Code = null): SchemaNodeTemplatesScopedList = {
    val __obj = js.Dynamic.literal()
    if (nodeTemplates != null) __obj.updateDynamic("nodeTemplates")(nodeTemplates.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNodeTemplatesScopedList]
  }
}

