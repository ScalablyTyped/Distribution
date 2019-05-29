package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BqmlIterationResult extends js.Object {
  var durationMs: js.UndefOr[java.lang.String] = js.undefined
  var evalLoss: js.UndefOr[scala.Double] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var learnRate: js.UndefOr[scala.Double] = js.undefined
  var trainingLoss: js.UndefOr[scala.Double] = js.undefined
}

object BqmlIterationResult {
  @scala.inline
  def apply(
    durationMs: java.lang.String = null,
    evalLoss: scala.Int | scala.Double = null,
    index: scala.Int | scala.Double = null,
    learnRate: scala.Int | scala.Double = null,
    trainingLoss: scala.Int | scala.Double = null
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

