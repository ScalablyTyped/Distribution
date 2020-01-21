package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAutoscalersScopedList extends js.Object {
  /**
    * [Output Only] A list of autoscalers contained in this scope.
    */
  var autoscalers: js.UndefOr[js.Array[SchemaAutoscaler]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of
    * autoscalers when the list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaAutoscalersScopedList {
  @scala.inline
  def apply(autoscalers: js.Array[SchemaAutoscaler] = null, warning: AnonCode = null): SchemaAutoscalersScopedList = {
    val __obj = js.Dynamic.literal()
    if (autoscalers != null) __obj.updateDynamic("autoscalers")(autoscalers.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAutoscalersScopedList]
  }
}

