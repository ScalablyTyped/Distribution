package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BqmlIterationResult extends js.Object {
  var durationMs: js.UndefOr[String] = js.undefined
  var evalLoss: js.UndefOr[Double] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var learnRate: js.UndefOr[Double] = js.undefined
  var trainingLoss: js.UndefOr[Double] = js.undefined
}

object BqmlIterationResult {
  @scala.inline
  def apply(
    durationMs: String = null,
    evalLoss: Int | Double = null,
    index: Int | Double = null,
    learnRate: Int | Double = null,
    trainingLoss: Int | Double = null
  ): BqmlIterationResult = {
    val __obj = js.Dynamic.literal()
    if (durationMs != null) __obj.updateDynamic("durationMs")(durationMs)
    if (evalLoss != null) __obj.updateDynamic("evalLoss")(evalLoss.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (learnRate != null) __obj.updateDynamic("learnRate")(learnRate.asInstanceOf[js.Any])
    if (trainingLoss != null) __obj.updateDynamic("trainingLoss")(trainingLoss.asInstanceOf[js.Any])
    __obj.asInstanceOf[BqmlIterationResult]
  }
}

