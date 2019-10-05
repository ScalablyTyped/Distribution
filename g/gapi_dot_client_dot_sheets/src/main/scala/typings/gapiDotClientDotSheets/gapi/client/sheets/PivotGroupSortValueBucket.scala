package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGroupSortValueBucket extends js.Object {
  /**
    * Determines the bucket from which values are chosen to sort.
    *
    * For example, in a pivot table with one row group & two column groups,
    * the row group can list up to two values. The first value corresponds
    * to a value within the first column group, and the second value
    * corresponds to a value in the second column group.  If no values
    * are listed, this would indicate that the row should be sorted according
    * to the "Grand Total" over the column groups. If a single value is listed,
    * this would correspond to using the "Total" of that bucket.
    */
  var buckets: js.UndefOr[js.Array[ExtendedValue]] = js.undefined
  /**
    * The offset in the PivotTable.values list which the values in this
    * grouping should be sorted by.
    */
  var valuesIndex: js.UndefOr[Double] = js.undefined
}

object PivotGroupSortValueBucket {
  @scala.inline
  def apply(buckets: js.Array[ExtendedValue] = null, valuesIndex: Int | Double = null): PivotGroupSortValueBucket = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets)
    if (valuesIndex != null) __obj.updateDynamic("valuesIndex")(valuesIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGroupSortValueBucket]
  }
}

