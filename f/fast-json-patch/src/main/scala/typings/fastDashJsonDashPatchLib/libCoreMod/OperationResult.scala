package typings
package fastDashJsonDashPatchLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationResult[T] extends js.Object {
  var newDocument: T
  var removed: js.UndefOr[js.Any] = js.undefined
  var test: js.UndefOr[scala.Boolean] = js.undefined
}

object OperationResult {
  @scala.inline
  def apply[T](newDocument: T, removed: js.Any = null, test: js.UndefOr[scala.Boolean] = js.undefined): OperationResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newDocument")(newDocument.asInstanceOf[js.Any])
    if (removed != null) __obj.updateDynamic("removed")(removed)
    if (!js.isUndefined(test)) __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[OperationResult[T]]
  }
}

