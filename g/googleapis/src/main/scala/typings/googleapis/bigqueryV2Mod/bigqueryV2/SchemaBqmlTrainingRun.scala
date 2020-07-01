package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.anon.EarlyStop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBqmlTrainingRun extends js.Object {
  /**
    * [Output-only, Beta] List of each iteration results.
    */
  var iterationResults: js.UndefOr[js.Array[SchemaBqmlIterationResult]] = js.native
  /**
    * [Output-only, Beta] Training run start time in milliseconds since the
    * epoch.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * [Output-only, Beta] Different state applicable for a training run. IN
    * PROGRESS: Training run is in progress. FAILED: Training run ended due to
    * a non-retryable failure. SUCCEEDED: Training run successfully completed.
    * CANCELLED: Training run cancelled by the user.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * [Output-only, Beta] Training options used by this training run. These
    * options are mutable for subsequent training runs. Default values are
    * explicitly stored for options not specified in the input query of the
    * first training run. For subsequent training runs, any option not
    * explicitly specified in the input query will be copied from the previous
    * training run.
    */
  var trainingOptions: js.UndefOr[EarlyStop] = js.native
}

object SchemaBqmlTrainingRun {
  @scala.inline
  def apply(
    iterationResults: js.Array[SchemaBqmlIterationResult] = null,
    startTime: String = null,
    state: String = null,
    trainingOptions: EarlyStop = null
  ): SchemaBqmlTrainingRun = {
    val __obj = js.Dynamic.literal()
    if (iterationResults != null) __obj.updateDynamic("iterationResults")(iterationResults.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (trainingOptions != null) __obj.updateDynamic("trainingOptions")(trainingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBqmlTrainingRun]
  }
}

