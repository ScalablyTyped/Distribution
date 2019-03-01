package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerfMetricsSummary extends js.Object {
  var appStartTime: js.UndefOr[AppStartTime] = js.undefined
  /** A tool results execution ID. */
  var executionId: js.UndefOr[java.lang.String] = js.undefined
  /** Graphics statistics for the entire run. Statistics are reset at the beginning of the run and collected at the end of the run. */
  var graphicsStats: js.UndefOr[GraphicsStats] = js.undefined
  /** A tool results history ID. */
  var historyId: js.UndefOr[java.lang.String] = js.undefined
  /** Describes the environment in which the performance metrics were collected */
  var perfEnvironment: js.UndefOr[PerfEnvironment] = js.undefined
  /** Set of resource collected */
  var perfMetrics: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The cloud project */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /** A tool results step ID. */
  var stepId: js.UndefOr[java.lang.String] = js.undefined
}

object PerfMetricsSummary {
  @scala.inline
  def apply(
    appStartTime: AppStartTime = null,
    executionId: java.lang.String = null,
    graphicsStats: GraphicsStats = null,
    historyId: java.lang.String = null,
    perfEnvironment: PerfEnvironment = null,
    perfMetrics: js.Array[java.lang.String] = null,
    projectId: java.lang.String = null,
    stepId: java.lang.String = null
  ): PerfMetricsSummary = {
    val __obj = js.Dynamic.literal()
    if (appStartTime != null) __obj.updateDynamic("appStartTime")(appStartTime)
    if (executionId != null) __obj.updateDynamic("executionId")(executionId)
    if (graphicsStats != null) __obj.updateDynamic("graphicsStats")(graphicsStats)
    if (historyId != null) __obj.updateDynamic("historyId")(historyId)
    if (perfEnvironment != null) __obj.updateDynamic("perfEnvironment")(perfEnvironment)
    if (perfMetrics != null) __obj.updateDynamic("perfMetrics")(perfMetrics)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (stepId != null) __obj.updateDynamic("stepId")(stepId)
    __obj.asInstanceOf[PerfMetricsSummary]
  }
}

