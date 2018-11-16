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

