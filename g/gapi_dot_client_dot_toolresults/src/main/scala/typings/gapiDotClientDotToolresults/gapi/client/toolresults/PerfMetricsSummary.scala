package typings.gapiDotClientDotToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerfMetricsSummary extends js.Object {
  var appStartTime: js.UndefOr[AppStartTime] = js.undefined
  /** A tool results execution ID. */
  var executionId: js.UndefOr[String] = js.undefined
  /** Graphics statistics for the entire run. Statistics are reset at the beginning of the run and collected at the end of the run. */
  var graphicsStats: js.UndefOr[GraphicsStats] = js.undefined
  /** A tool results history ID. */
  var historyId: js.UndefOr[String] = js.undefined
  /** Describes the environment in which the performance metrics were collected */
  var perfEnvironment: js.UndefOr[PerfEnvironment] = js.undefined
  /** Set of resource collected */
  var perfMetrics: js.UndefOr[js.Array[String]] = js.undefined
  /** The cloud project */
  var projectId: js.UndefOr[String] = js.undefined
  /** A tool results step ID. */
  var stepId: js.UndefOr[String] = js.undefined
}

object PerfMetricsSummary {
  @scala.inline
  def apply(
    appStartTime: AppStartTime = null,
    executionId: String = null,
    graphicsStats: GraphicsStats = null,
    historyId: String = null,
    perfEnvironment: PerfEnvironment = null,
    perfMetrics: js.Array[String] = null,
    projectId: String = null,
    stepId: String = null
  ): PerfMetricsSummary = {
    val __obj = js.Dynamic.literal()
    if (appStartTime != null) __obj.updateDynamic("appStartTime")(appStartTime.asInstanceOf[js.Any])
    if (executionId != null) __obj.updateDynamic("executionId")(executionId.asInstanceOf[js.Any])
    if (graphicsStats != null) __obj.updateDynamic("graphicsStats")(graphicsStats.asInstanceOf[js.Any])
    if (historyId != null) __obj.updateDynamic("historyId")(historyId.asInstanceOf[js.Any])
    if (perfEnvironment != null) __obj.updateDynamic("perfEnvironment")(perfEnvironment.asInstanceOf[js.Any])
    if (perfMetrics != null) __obj.updateDynamic("perfMetrics")(perfMetrics.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (stepId != null) __obj.updateDynamic("stepId")(stepId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerfMetricsSummary]
  }
}

