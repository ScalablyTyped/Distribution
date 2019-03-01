package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerfSampleSeries extends js.Object {
  /** Basic series represented by a line chart */
  var basicPerfSampleSeries: js.UndefOr[BasicPerfSampleSeries] = js.undefined
  /** A tool results execution ID. */
  var executionId: js.UndefOr[java.lang.String] = js.undefined
  /** A tool results history ID. */
  var historyId: js.UndefOr[java.lang.String] = js.undefined
  /** The cloud project */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /** A sample series id */
  var sampleSeriesId: js.UndefOr[java.lang.String] = js.undefined
  /** A tool results step ID. */
  var stepId: js.UndefOr[java.lang.String] = js.undefined
}

object PerfSampleSeries {
  @scala.inline
  def apply(
    basicPerfSampleSeries: BasicPerfSampleSeries = null,
    executionId: java.lang.String = null,
    historyId: java.lang.String = null,
    projectId: java.lang.String = null,
    sampleSeriesId: java.lang.String = null,
    stepId: java.lang.String = null
  ): PerfSampleSeries = {
    val __obj = js.Dynamic.literal()
    if (basicPerfSampleSeries != null) __obj.updateDynamic("basicPerfSampleSeries")(basicPerfSampleSeries)
    if (executionId != null) __obj.updateDynamic("executionId")(executionId)
    if (historyId != null) __obj.updateDynamic("historyId")(historyId)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (sampleSeriesId != null) __obj.updateDynamic("sampleSeriesId")(sampleSeriesId)
    if (stepId != null) __obj.updateDynamic("stepId")(stepId)
    __obj.asInstanceOf[PerfSampleSeries]
  }
}

