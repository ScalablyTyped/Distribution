package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TargetPoolsScopedList extends js.Object {
  /**
    * A list of target pools contained in this scope.
    */
  var targetPools: js.UndefOr[js.Array[Schema$TargetPool]] = js.native
  /**
    * Informational warning which replaces the list of addresses when the list
    * is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$TargetPoolsScopedList {
  @scala.inline
  def apply(targetPools: js.Array[Schema$TargetPool] = null, warning: Anon_Code = null): Schema$TargetPoolsScopedList = {
    val __obj = js.Dynamic.literal()
    if (targetPools != null) __obj.updateDynamic("targetPools")(targetPools.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetPoolsScopedList]
  }
}

