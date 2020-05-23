package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoscalersScopedList extends js.Object {
  /** [Output Only] List of autoscalers contained in this scope. */
  var autoscalers: js.UndefOr[js.Array[Autoscaler]] = js.undefined
  /** [Output Only] Informational warning which replaces the list of autoscalers when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}

object AutoscalersScopedList {
  @scala.inline
  def apply(autoscalers: js.Array[Autoscaler] = null, warning: Code = null): AutoscalersScopedList = {
    val __obj = js.Dynamic.literal()
    if (autoscalers != null) __obj.updateDynamic("autoscalers")(autoscalers.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalersScopedList]
  }
}

