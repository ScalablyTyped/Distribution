package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An optional setting on a PivotGroup that defines buckets for the values in
  * the source data column rather than breaking out each individual value. Only
  * one PivotGroup with a group rule may be added for each column in the source
  * data, though on any given column you may add both a PivotGroup that has a
  * rule and a PivotGroup that does not.
  */
@js.native
trait Schema$PivotGroupRule extends js.Object {
  /**
    * A DateTimeRule.
    */
  var dateTimeRule: js.UndefOr[Schema$DateTimeRule] = js.native
  /**
    * A HistogramRule.
    */
  var histogramRule: js.UndefOr[Schema$HistogramRule] = js.native
  /**
    * A ManualRule.
    */
  var manualRule: js.UndefOr[Schema$ManualRule] = js.native
}

object Schema$PivotGroupRule {
  @scala.inline
  def apply(
    dateTimeRule: Schema$DateTimeRule = null,
    histogramRule: Schema$HistogramRule = null,
    manualRule: Schema$ManualRule = null
  ): Schema$PivotGroupRule = {
    val __obj = js.Dynamic.literal()
    if (dateTimeRule != null) __obj.updateDynamic("dateTimeRule")(dateTimeRule.asInstanceOf[js.Any])
    if (histogramRule != null) __obj.updateDynamic("histogramRule")(histogramRule.asInstanceOf[js.Any])
    if (manualRule != null) __obj.updateDynamic("manualRule")(manualRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PivotGroupRule]
  }
}

