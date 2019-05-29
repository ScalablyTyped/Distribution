package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BqmlTrainingRunTrainingOptions extends js.Object {
  var earlyStop: js.UndefOr[scala.Boolean] = js.undefined
  var l1Reg: js.UndefOr[scala.Double] = js.undefined
  var l2Reg: js.UndefOr[scala.Double] = js.undefined
  var learnRate: js.UndefOr[scala.Double] = js.undefined
  var learnRateStrategy: js.UndefOr[java.lang.String] = js.undefined
  var lineSearchInitLearnRate: js.UndefOr[scala.Double] = js.undefined
  var maxIteration: js.UndefOr[java.lang.String] = js.undefined
  var minRelProgress: js.UndefOr[scala.Double] = js.undefined
  var warmStart: js.UndefOr[scala.Boolean] = js.undefined
}

object BqmlTrainingRunTrainingOptions {
  @scala.inline
  def apply(
    earlyStop: js.UndefOr[scala.Boolean] = js.undefined,
    l1Reg: scala.Int | scala.Double = null,
    l2Reg: scala.Int | scala.Double = null,
    learnRate: scala.Int | scala.Double = null,
    learnRateStrategy: java.lang.String = null,
    lineSearchInitLearnRate: scala.Int | scala.Double = null,
    maxIteration: java.lang.String = null,
    minRelProgress: scala.Int | scala.Double = null,
    warmStart: js.UndefOr[scala.Boolean] = js.undefined
  ): BqmlTrainingRunTrainingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(earlyStop)) __obj.updateDynamic("earlyStop")(earlyStop)
    if (l1Reg != null) __obj.updateDynamic("l1Reg")(l1Reg.asInstanceOf[js.Any])
    if (l2Reg != null) __obj.updateDynamic("l2Reg")(l2Reg.asInstanceOf[js.Any])
    if (learnRate != null) __obj.updateDynamic("learnRate")(learnRate.asInstanceOf[js.Any])
    if (learnRateStrategy != null) __obj.updateDynamic("learnRateStrategy")(learnRateStrategy)
    if (lineSearchInitLearnRate != null) __obj.updateDynamic("lineSearchInitLearnRate")(lineSearchInitLearnRate.asInstanceOf[js.Any])
    if (maxIteration != null) __obj.updateDynamic("maxIteration")(maxIteration)
    if (minRelProgress != null) __obj.updateDynamic("minRelProgress")(minRelProgress.asInstanceOf[js.Any])
    if (!js.isUndefined(warmStart)) __obj.updateDynamic("warmStart")(warmStart)
    __obj.asInstanceOf[BqmlTrainingRunTrainingOptions]
  }
}

