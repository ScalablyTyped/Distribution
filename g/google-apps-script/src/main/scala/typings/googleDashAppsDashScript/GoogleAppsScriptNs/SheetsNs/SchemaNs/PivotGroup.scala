package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

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
    sourceColumnOffset: Int | Double = null,
    valueBucket: PivotGroupSortValueBucket = null,
    valueMetadata: js.Array[PivotGroupValueMetadata] = null
  ): PivotGroup = {
    val __obj = js.Dynamic.literal()
    if (groupRule != null) __obj.updateDynamic("groupRule")(groupRule)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(repeatHeadings)) __obj.updateDynamic("repeatHeadings")(repeatHeadings)
    if (!js.isUndefined(showTotals)) __obj.updateDynamic("showTotals")(showTotals)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    if (sourceColumnOffset != null) __obj.updateDynamic("sourceColumnOffset")(sourceColumnOffset.asInstanceOf[js.Any])
    if (valueBucket != null) __obj.updateDynamic("valueBucket")(valueBucket)
    if (valueMetadata != null) __obj.updateDynamic("valueMetadata")(valueMetadata)
    __obj.asInstanceOf[PivotGroup]
  }
}

