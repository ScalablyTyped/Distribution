package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSummaryProcess extends js.Object {
  var summaryProcess: js.UndefOr[String] = js.undefined
  var totalValue: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object AnonSummaryProcess {
  @scala.inline
  def apply(summaryProcess: String = null, totalValue: js.Any = null, value: js.Any = null): AnonSummaryProcess = {
    val __obj = js.Dynamic.literal()
    if (summaryProcess != null) __obj.updateDynamic("summaryProcess")(summaryProcess.asInstanceOf[js.Any])
    if (totalValue != null) __obj.updateDynamic("totalValue")(totalValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSummaryProcess]
  }
}

