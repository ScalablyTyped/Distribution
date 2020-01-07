package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource representing a collection of performance samples (or data points)
  */
@js.native
trait Schema$PerfSampleSeries extends js.Object {
  /**
    * Basic series represented by a line chart
    */
  var basicPerfSampleSeries: js.UndefOr[Schema$BasicPerfSampleSeries] = js.native
  /**
    * A tool results execution ID.
    */
  var executionId: js.UndefOr[String] = js.native
  /**
    * A tool results history ID.
    */
  var historyId: js.UndefOr[String] = js.native
  /**
    * The cloud project
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * A sample series id
    */
  var sampleSeriesId: js.UndefOr[String] = js.native
  /**
    * A tool results step ID.
    */
  var stepId: js.UndefOr[String] = js.native
}

object Schema$PerfSampleSeries {
  @scala.inline
  def apply(
    basicPerfSampleSeries: Schema$BasicPerfSampleSeries = null,
    executionId: String = null,
    historyId: String = null,
    projectId: String = null,
    sampleSeriesId: String = null,
    stepId: String = null
  ): Schema$PerfSampleSeries = {
    val __obj = js.Dynamic.literal()
    if (basicPerfSampleSeries != null) __obj.updateDynamic("basicPerfSampleSeries")(basicPerfSampleSeries.asInstanceOf[js.Any])
    if (executionId != null) __obj.updateDynamic("executionId")(executionId.asInstanceOf[js.Any])
    if (historyId != null) __obj.updateDynamic("historyId")(historyId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (sampleSeriesId != null) __obj.updateDynamic("sampleSeriesId")(sampleSeriesId.asInstanceOf[js.Any])
    if (stepId != null) __obj.updateDynamic("stepId")(stepId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PerfSampleSeries]
  }
}

