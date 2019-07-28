package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClientDotCompute.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetPoolsScopedList extends js.Object {
  /** List of target pools contained in this scope. */
  var targetPools: js.UndefOr[js.Array[TargetPool]] = js.undefined
  /** Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[Anon_Code] = js.undefined
}

object TargetPoolsScopedList {
  @scala.inline
  def apply(targetPools: js.Array[TargetPool] = null, warning: Anon_Code = null): TargetPoolsScopedList = {
    val __obj = js.Dynamic.literal()
    if (targetPools != null) __obj.updateDynamic("targetPools")(targetPools)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[TargetPoolsScopedList]
  }
}

