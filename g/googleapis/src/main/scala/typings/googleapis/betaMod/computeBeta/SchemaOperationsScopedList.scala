package typings.googleapis.betaMod.computeBeta

import typings.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOperationsScopedList extends js.Object {
  /**
    * [Output Only] A list of operations contained in this scope.
    */
  var operations: js.UndefOr[js.Array[SchemaOperation]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of operations
    * when the list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaOperationsScopedList {
  @scala.inline
  def apply(operations: js.Array[SchemaOperation] = null, warning: AnonCode = null): SchemaOperationsScopedList = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOperationsScopedList]
  }
}

