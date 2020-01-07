package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AutoscalersScopedList extends js.Object {
  /**
    * [Output Only] A list of autoscalers contained in this scope.
    */
  var autoscalers: js.UndefOr[js.Array[Schema$Autoscaler]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of
    * autoscalers when the list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$AutoscalersScopedList {
  @scala.inline
  def apply(autoscalers: js.Array[Schema$Autoscaler] = null, warning: Anon_Code = null): Schema$AutoscalersScopedList = {
    val __obj = js.Dynamic.literal()
    if (autoscalers != null) __obj.updateDynamic("autoscalers")(autoscalers.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AutoscalersScopedList]
  }
}

