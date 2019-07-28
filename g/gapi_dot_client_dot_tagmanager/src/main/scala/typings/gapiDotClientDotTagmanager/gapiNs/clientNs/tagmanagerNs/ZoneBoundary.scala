package typings.gapiDotClientDotTagmanager.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneBoundary extends js.Object {
  /** The conditions that, when conjoined, make up the boundary. */
  var condition: js.UndefOr[js.Array[Condition]] = js.undefined
  /** Custom evaluation trigger IDs. A zone will evaluate its boundary conditions when any of the listed triggers are true. */
  var customEvaluationTriggerId: js.UndefOr[js.Array[String]] = js.undefined
}

object ZoneBoundary {
  @scala.inline
  def apply(condition: js.Array[Condition] = null, customEvaluationTriggerId: js.Array[String] = null): ZoneBoundary = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (customEvaluationTriggerId != null) __obj.updateDynamic("customEvaluationTriggerId")(customEvaluationTriggerId)
    __obj.asInstanceOf[ZoneBoundary]
  }
}

