package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClientCompute.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsScopedList extends js.Object {
  /** [Output Only] List of operations contained in this scope. */
  var operations: js.UndefOr[js.Array[Operation]] = js.undefined
  /** [Output Only] Informational warning which replaces the list of operations when the list is empty. */
  var warning: js.UndefOr[AnonCode] = js.undefined
}

object OperationsScopedList {
  @scala.inline
  def apply(operations: js.Array[Operation] = null, warning: AnonCode = null): OperationsScopedList = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationsScopedList]
  }
}

