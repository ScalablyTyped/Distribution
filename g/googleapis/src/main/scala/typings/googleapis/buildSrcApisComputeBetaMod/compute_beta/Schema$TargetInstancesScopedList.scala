package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TargetInstancesScopedList extends js.Object {
  /**
    * A list of target instances contained in this scope.
    */
  var targetInstances: js.UndefOr[js.Array[Schema$TargetInstance]] = js.native
  /**
    * Informational warning which replaces the list of addresses when the list
    * is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$TargetInstancesScopedList {
  @scala.inline
  def apply(targetInstances: js.Array[Schema$TargetInstance] = null, warning: Anon_Code = null): Schema$TargetInstancesScopedList = {
    val __obj = js.Dynamic.literal()
    if (targetInstances != null) __obj.updateDynamic("targetInstances")(targetInstances.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetInstancesScopedList]
  }
}

