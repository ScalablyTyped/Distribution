package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Zone&#39;s boundaries.
  */
@js.native
trait Schema$ZoneBoundary extends js.Object {
  /**
    * The conditions that, when conjoined, make up the boundary.
    */
  var condition: js.UndefOr[js.Array[Schema$Condition]] = js.native
  /**
    * Custom evaluation trigger IDs. A zone will evaluate its boundary
    * conditions when any of the listed triggers are true.
    */
  var customEvaluationTriggerId: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ZoneBoundary {
  @scala.inline
  def apply(condition: js.Array[Schema$Condition] = null, customEvaluationTriggerId: js.Array[String] = null): Schema$ZoneBoundary = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (customEvaluationTriggerId != null) __obj.updateDynamic("customEvaluationTriggerId")(customEvaluationTriggerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ZoneBoundary]
  }
}

