package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BqmlTrainingRunTrainingOptions extends js.Object {
  var earlyStop: js.UndefOr[Boolean] = js.undefined
  var l1Reg: js.UndefOr[Double] = js.undefined
  var l2Reg: js.UndefOr[Double] = js.undefined
  var learnRate: js.UndefOr[Double] = js.undefined
  var learnRateStrategy: js.UndefOr[String] = js.undefined
  var lineSearchInitLearnRate: js.UndefOr[Double] = js.undefined
  var maxIteration: js.UndefOr[String] = js.undefined
  var minRelProgress: js.UndefOr[Double] = js.undefined
  var warmStart: js.UndefOr[Boolean] = js.undefined
}

object BqmlTrainingRunTrainingOptions {
  @scala.inline
  def apply(
    earlyStop: js.UndefOr[Boolean] = js.undefined,
    l1Reg: js.UndefOr[Double] = js.undefined,
    l2Reg: js.UndefOr[Double] = js.undefined,
    learnRate: js.UndefOr[Double] = js.undefined,
    learnRateStrategy: String = null,
    lineSearchInitLearnRate: js.UndefOr[Double] = js.undefined,
    maxIteration: String = null,
    minRelProgress: js.UndefOr[Double] = js.undefined,
    warmStart: js.UndefOr[Boolean] = js.undefined
  ): BqmlTrainingRunTrainingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(earlyStop)) __obj.updateDynamic("earlyStop")(earlyStop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(l1Reg)) __obj.updateDynamic("l1Reg")(l1Reg.get.asInstanceOf[js.Any])
    if (!js.isUndefined(l2Reg)) __obj.updateDynamic("l2Reg")(l2Reg.get.asInstanceOf[js.Any])
    if (!js.isUndefined(learnRate)) __obj.updateDynamic("learnRate")(learnRate.get.asInstanceOf[js.Any])
    if (learnRateStrategy != null) __obj.updateDynamic("learnRateStrategy")(learnRateStrategy.asInstanceOf[js.Any])
    if (!js.isUndefined(lineSearchInitLearnRate)) __obj.updateDynamic("lineSearchInitLearnRate")(lineSearchInitLearnRate.get.asInstanceOf[js.Any])
    if (maxIteration != null) __obj.updateDynamic("maxIteration")(maxIteration.asInstanceOf[js.Any])
    if (!js.isUndefined(minRelProgress)) __obj.updateDynamic("minRelProgress")(minRelProgress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(warmStart)) __obj.updateDynamic("warmStart")(warmStart.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BqmlTrainingRunTrainingOptions]
  }
}

