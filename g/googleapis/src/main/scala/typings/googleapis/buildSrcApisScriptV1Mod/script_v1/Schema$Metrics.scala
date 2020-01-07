package typings.googleapis.buildSrcApisScriptV1Mod.script_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource containing usage stats for a given script, based on the supplied
  * filter and mask present in the request.
  */
@js.native
trait Schema$Metrics extends js.Object {
  /**
    * Number of active users.
    */
  var activeUsers: js.UndefOr[js.Array[Schema$MetricsValue]] = js.native
  /**
    * Number of failed executions.
    */
  var failedExecutions: js.UndefOr[js.Array[Schema$MetricsValue]] = js.native
  /**
    * Number of total executions.
    */
  var totalExecutions: js.UndefOr[js.Array[Schema$MetricsValue]] = js.native
}

object Schema$Metrics {
  @scala.inline
  def apply(
    activeUsers: js.Array[Schema$MetricsValue] = null,
    failedExecutions: js.Array[Schema$MetricsValue] = null,
    totalExecutions: js.Array[Schema$MetricsValue] = null
  ): Schema$Metrics = {
    val __obj = js.Dynamic.literal()
    if (activeUsers != null) __obj.updateDynamic("activeUsers")(activeUsers.asInstanceOf[js.Any])
    if (failedExecutions != null) __obj.updateDynamic("failedExecutions")(failedExecutions.asInstanceOf[js.Any])
    if (totalExecutions != null) __obj.updateDynamic("totalExecutions")(totalExecutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Metrics]
  }
}

