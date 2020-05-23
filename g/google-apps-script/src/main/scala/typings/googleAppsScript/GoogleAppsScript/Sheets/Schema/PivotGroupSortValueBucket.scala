package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGroupSortValueBucket extends js.Object {
  var buckets: js.UndefOr[js.Array[ExtendedValue]] = js.undefined
  var valuesIndex: js.UndefOr[Double] = js.undefined
}

object PivotGroupSortValueBucket {
  @scala.inline
  def apply(buckets: js.Array[ExtendedValue] = null, valuesIndex: js.UndefOr[Double] = js.undefined): PivotGroupSortValueBucket = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets.asInstanceOf[js.Any])
    if (!js.isUndefined(valuesIndex)) __obj.updateDynamic("valuesIndex")(valuesIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGroupSortValueBucket]
  }
}

