package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClientDotCompute.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetInstancesScopedList extends js.Object {
  /** List of target instances contained in this scope. */
  var targetInstances: js.UndefOr[js.Array[TargetInstance]] = js.undefined
  /** Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[Anon_Code] = js.undefined
}

object TargetInstancesScopedList {
  @scala.inline
  def apply(targetInstances: js.Array[TargetInstance] = null, warning: Anon_Code = null): TargetInstancesScopedList = {
    val __obj = js.Dynamic.literal()
    if (targetInstances != null) __obj.updateDynamic("targetInstances")(targetInstances.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetInstancesScopedList]
  }
}

