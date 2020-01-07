package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$NodeTemplatesScopedList extends js.Object {
  /**
    * [Output Only] A list of node templates contained in this scope.
    */
  var nodeTemplates: js.UndefOr[js.Array[Schema$NodeTemplate]] = js.native
  /**
    * [Output Only] An informational warning that appears when the node
    * templates list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$NodeTemplatesScopedList {
  @scala.inline
  def apply(nodeTemplates: js.Array[Schema$NodeTemplate] = null, warning: Anon_Code = null): Schema$NodeTemplatesScopedList = {
    val __obj = js.Dynamic.literal()
    if (nodeTemplates != null) __obj.updateDynamic("nodeTemplates")(nodeTemplates.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NodeTemplatesScopedList]
  }
}

