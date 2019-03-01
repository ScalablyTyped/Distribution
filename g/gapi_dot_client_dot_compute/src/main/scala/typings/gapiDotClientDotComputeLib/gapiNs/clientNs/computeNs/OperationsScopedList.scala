package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsScopedList extends js.Object {
  /** [Output Only] List of operations contained in this scope. */
  var operations: js.UndefOr[js.Array[Operation]] = js.undefined
  /** [Output Only] Informational warning which replaces the list of operations when the list is empty. */
  var warning: js.UndefOr[gapiDotClientDotComputeLib.Anon_Code] = js.undefined
}

object OperationsScopedList {
  @scala.inline
  def apply(operations: js.Array[Operation] = null, warning: gapiDotClientDotComputeLib.Anon_Code = null): OperationsScopedList = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[OperationsScopedList]
  }
}

