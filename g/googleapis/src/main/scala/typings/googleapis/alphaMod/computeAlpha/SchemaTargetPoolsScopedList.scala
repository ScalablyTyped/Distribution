package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetPoolsScopedList extends js.Object {
  /**
    * A list of target pools contained in this scope.
    */
  var targetPools: js.UndefOr[js.Array[SchemaTargetPool]] = js.native
  /**
    * Informational warning which replaces the list of addresses when the list
    * is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaTargetPoolsScopedList {
  @scala.inline
  def apply(targetPools: js.Array[SchemaTargetPool] = null, warning: AnonCode = null): SchemaTargetPoolsScopedList = {
    val __obj = js.Dynamic.literal()
    if (targetPools != null) __obj.updateDynamic("targetPools")(targetPools.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetPoolsScopedList]
  }
}

