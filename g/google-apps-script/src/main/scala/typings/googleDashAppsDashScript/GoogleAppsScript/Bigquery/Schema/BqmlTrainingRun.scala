package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BqmlTrainingRun extends js.Object {
  var iterationResults: js.UndefOr[js.Array[BqmlIterationResult]] = js.undefined
  var startTime: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var trainingOptions: js.UndefOr[BqmlTrainingRunTrainingOptions] = js.undefined
}

object BqmlTrainingRun {
  @scala.inline
  def apply(
    iterationResults: js.Array[BqmlIterationResult] = null,
    startTime: String = null,
    state: String = null,
    trainingOptions: BqmlTrainingRunTrainingOptions = null
  ): BqmlTrainingRun = {
    val __obj = js.Dynamic.literal()
    if (iterationResults != null) __obj.updateDynamic("iterationResults")(iterationResults.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (trainingOptions != null) __obj.updateDynamic("trainingOptions")(trainingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BqmlTrainingRun]
  }
}

