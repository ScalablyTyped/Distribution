package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OperationsScopedList extends js.Object {
  /**
    * [Output Only] A list of operations contained in this scope.
    */
  var operations: js.UndefOr[js.Array[Schema$Operation]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of operations
    * when the list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$OperationsScopedList {
  @scala.inline
  def apply(operations: js.Array[Schema$Operation] = null, warning: Anon_Code = null): Schema$OperationsScopedList = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OperationsScopedList]
  }
}

