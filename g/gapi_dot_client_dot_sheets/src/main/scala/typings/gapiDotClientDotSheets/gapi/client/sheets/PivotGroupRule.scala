package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGroupRule extends js.Object {
  /** A DateTimeRule. */
  var dateTimeRule: js.UndefOr[DateTimeRule] = js.undefined
  /** A HistogramRule. */
  var histogramRule: js.UndefOr[HistogramRule] = js.undefined
  /** A ManualRule. */
  var manualRule: js.UndefOr[ManualRule] = js.undefined
}

object PivotGroupRule {
  @scala.inline
  def apply(
    dateTimeRule: DateTimeRule = null,
    histogramRule: HistogramRule = null,
    manualRule: ManualRule = null
  ): PivotGroupRule = {
    val __obj = js.Dynamic.literal()
    if (dateTimeRule != null) __obj.updateDynamic("dateTimeRule")(dateTimeRule.asInstanceOf[js.Any])
    if (histogramRule != null) __obj.updateDynamic("histogramRule")(histogramRule.asInstanceOf[js.Any])
    if (manualRule != null) __obj.updateDynamic("manualRule")(manualRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGroupRule]
  }
}

