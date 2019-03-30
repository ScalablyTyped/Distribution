package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BqmlIterationResult extends js.Object {
  var durationMs: js.UndefOr[java.lang.String] = js.undefined
  var evalLoss: js.UndefOr[stdLib.Number] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var learnRate: js.UndefOr[stdLib.Number] = js.undefined
  var trainingLoss: js.UndefOr[stdLib.Number] = js.undefined
}

object BqmlIterationResult {
  @scala.inline
  def apply(
    durationMs: java.lang.String = null,
    evalLoss: stdLib.Number = null,
    index: scala.Int | scala.Double = null,
    learnRate: stdLib.Number = null,
    trainingLoss: stdLib.Number = null
  ): BqmlIterationResult = {
    val __obj = js.Dynamic.literal()
    if (durationMs != null) __obj.updateDynamic("durationMs")(durationMs)
    if (evalLoss != null) __obj.updateDynamic("evalLoss")(evalLoss)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (learnRate != null) __obj.updateDynamic("learnRate")(learnRate)
    if (trainingLoss != null) __obj.updateDynamic("trainingLoss")(trainingLoss)
    __obj.asInstanceOf[BqmlIterationResult]
  }
}

