package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BqmlTrainingRunTrainingOptions extends js.Object {
  var earlyStop: js.UndefOr[scala.Boolean] = js.undefined
  var l1Reg: js.UndefOr[stdLib.Number] = js.undefined
  var l2Reg: js.UndefOr[stdLib.Number] = js.undefined
  var learnRate: js.UndefOr[stdLib.Number] = js.undefined
  var learnRateStrategy: js.UndefOr[java.lang.String] = js.undefined
  var lineSearchInitLearnRate: js.UndefOr[stdLib.Number] = js.undefined
  var maxIteration: js.UndefOr[java.lang.String] = js.undefined
  var minRelProgress: js.UndefOr[stdLib.Number] = js.undefined
  var warmStart: js.UndefOr[scala.Boolean] = js.undefined
}

object BqmlTrainingRunTrainingOptions {
  @scala.inline
  def apply(
    earlyStop: js.UndefOr[scala.Boolean] = js.undefined,
    l1Reg: stdLib.Number = null,
    l2Reg: stdLib.Number = null,
    learnRate: stdLib.Number = null,
    learnRateStrategy: java.lang.String = null,
    lineSearchInitLearnRate: stdLib.Number = null,
    maxIteration: java.lang.String = null,
    minRelProgress: stdLib.Number = null,
    warmStart: js.UndefOr[scala.Boolean] = js.undefined
  ): BqmlTrainingRunTrainingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(earlyStop)) __obj.updateDynamic("earlyStop")(earlyStop)
    if (l1Reg != null) __obj.updateDynamic("l1Reg")(l1Reg)
    if (l2Reg != null) __obj.updateDynamic("l2Reg")(l2Reg)
    if (learnRate != null) __obj.updateDynamic("learnRate")(learnRate)
    if (learnRateStrategy != null) __obj.updateDynamic("learnRateStrategy")(learnRateStrategy)
    if (lineSearchInitLearnRate != null) __obj.updateDynamic("lineSearchInitLearnRate")(lineSearchInitLearnRate)
    if (maxIteration != null) __obj.updateDynamic("maxIteration")(maxIteration)
    if (minRelProgress != null) __obj.updateDynamic("minRelProgress")(minRelProgress)
    if (!js.isUndefined(warmStart)) __obj.updateDynamic("warmStart")(warmStart)
    __obj.asInstanceOf[BqmlTrainingRunTrainingOptions]
  }
}

