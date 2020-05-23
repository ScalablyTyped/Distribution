package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGroup extends js.Object {
  var groupRule: js.UndefOr[PivotGroupRule] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var repeatHeadings: js.UndefOr[Boolean] = js.undefined
  var showTotals: js.UndefOr[Boolean] = js.undefined
  var sortOrder: js.UndefOr[String] = js.undefined
  var sourceColumnOffset: js.UndefOr[Double] = js.undefined
  var valueBucket: js.UndefOr[PivotGroupSortValueBucket] = js.undefined
  var valueMetadata: js.UndefOr[js.Array[PivotGroupValueMetadata]] = js.undefined
}

object PivotGroup {
  @scala.inline
  def apply(
    groupRule: PivotGroupRule = null,
    label: String = null,
    repeatHeadings: js.UndefOr[Boolean] = js.undefined,
    showTotals: js.UndefOr[Boolean] = js.undefined,
    sortOrder: String = null,
    sourceColumnOffset: js.UndefOr[Double] = js.undefined,
    valueBucket: PivotGroupSortValueBucket = null,
    valueMetadata: js.Array[PivotGroupValueMetadata] = null
  ): PivotGroup = {
    val __obj = js.Dynamic.literal()
    if (groupRule != null) __obj.updateDynamic("groupRule")(groupRule.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(repeatHeadings)) __obj.updateDynamic("repeatHeadings")(repeatHeadings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTotals)) __obj.updateDynamic("showTotals")(showTotals.get.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceColumnOffset)) __obj.updateDynamic("sourceColumnOffset")(sourceColumnOffset.get.asInstanceOf[js.Any])
    if (valueBucket != null) __obj.updateDynamic("valueBucket")(valueBucket.asInstanceOf[js.Any])
    if (valueMetadata != null) __obj.updateDynamic("valueMetadata")(valueMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGroup]
  }
}

