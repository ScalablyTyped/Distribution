package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs

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
    if (iterationResults != null) __obj.updateDynamic("iterationResults")(iterationResults)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (state != null) __obj.updateDynamic("state")(state)
    if (trainingOptions != null) __obj.updateDynamic("trainingOptions")(trainingOptions)
    __obj.asInstanceOf[BqmlTrainingRun]
  }
}

