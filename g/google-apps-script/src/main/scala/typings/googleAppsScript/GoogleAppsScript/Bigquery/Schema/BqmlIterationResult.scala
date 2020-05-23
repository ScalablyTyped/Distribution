package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

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
    evalLoss: js.UndefOr[Double] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    learnRate: js.UndefOr[Double] = js.undefined,
    trainingLoss: js.UndefOr[Double] = js.undefined
  ): BqmlIterationResult = {
    val __obj = js.Dynamic.literal()
    if (durationMs != null) __obj.updateDynamic("durationMs")(durationMs.asInstanceOf[js.Any])
    if (!js.isUndefined(evalLoss)) __obj.updateDynamic("evalLoss")(evalLoss.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(learnRate)) __obj.updateDynamic("learnRate")(learnRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trainingLoss)) __obj.updateDynamic("trainingLoss")(trainingLoss.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BqmlIterationResult]
  }
}

