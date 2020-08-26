package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotGroup extends js.Object {
  /** The group rule to apply to this row/column group. */
  var groupRule: js.UndefOr[PivotGroupRule] = js.native
  /**
    * The labels to use for the row/column groups which can be customized. For
    * example, in the following pivot table, the row label is `Region` (which
    * could be renamed to `State`) and the column label is `Product` (which
    * could be renamed `Item`). Pivot tables created before December 2017 do
    * not have header labels. If you'd like to add header labels to an existing
    * pivot table, please delete the existing pivot table and then create a new
    * pivot table with same parameters.
    *
    * +--------------+---------+-------+
    * | SUM of Units | Product |       |
    * | Region       | Pen     | Paper |
    * +--------------+---------+-------+
    * | New York     |     345 |    98 |
    * | Oregon       |     234 |   123 |
    * | Tennessee    |     531 |   415 |
    * +--------------+---------+-------+
    * | Grand Total  |    1110 |   636 |
    * +--------------+---------+-------+
    */
  var label: js.UndefOr[String] = js.native
  /**
    * True if the headings in this pivot group should be repeated.
    * This is only valid for row groupings and is ignored by columns.
    *
    * By default, we minimize repitition of headings by not showing higher
    * level headings where they are the same. For example, even though the
    * third row below corresponds to "Q1 Mar", "Q1" is not shown because
    * it is redundant with previous rows. Setting repeat_headings to true
    * would cause "Q1" to be repeated for "Feb" and "Mar".
    *
    * +--------------+
    * | Q1     | Jan |
    * |        | Feb |
    * |        | Mar |
    * +--------+-----+
    * | Q1 Total     |
    * +--------------+
    */
  var repeatHeadings: js.UndefOr[Boolean] = js.native
  /** True if the pivot table should include the totals for this grouping. */
  var showTotals: js.UndefOr[Boolean] = js.native
  /** The order the values in this group should be sorted. */
  var sortOrder: js.UndefOr[String] = js.native
  /**
    * The column offset of the source range that this grouping is based on.
    *
    * For example, if the source was `C10:E15`, a `sourceColumnOffset` of `0`
    * means this group refers to column `C`, whereas the offset `1` would
    * refer to column `D`.
    */
  var sourceColumnOffset: js.UndefOr[Double] = js.native
  /**
    * The bucket of the opposite pivot group to sort by.
    * If not specified, sorting is alphabetical by this group's values.
    */
  var valueBucket: js.UndefOr[PivotGroupSortValueBucket] = js.native
  /** Metadata about values in the grouping. */
  var valueMetadata: js.UndefOr[js.Array[PivotGroupValueMetadata]] = js.native
}

object PivotGroup {
  @scala.inline
  def apply(): PivotGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGroup]
  }
  @scala.inline
  implicit class PivotGroupOps[Self <: PivotGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGroupRule(value: PivotGroupRule): Self = this.set("groupRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupRule: Self = this.set("groupRule", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setRepeatHeadings(value: Boolean): Self = this.set("repeatHeadings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatHeadings: Self = this.set("repeatHeadings", js.undefined)
    @scala.inline
    def setShowTotals(value: Boolean): Self = this.set("showTotals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTotals: Self = this.set("showTotals", js.undefined)
    @scala.inline
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    @scala.inline
    def setSourceColumnOffset(value: Double): Self = this.set("sourceColumnOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceColumnOffset: Self = this.set("sourceColumnOffset", js.undefined)
    @scala.inline
    def setValueBucket(value: PivotGroupSortValueBucket): Self = this.set("valueBucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueBucket: Self = this.set("valueBucket", js.undefined)
    @scala.inline
    def setValueMetadataVarargs(value: PivotGroupValueMetadata*): Self = this.set("valueMetadata", js.Array(value :_*))
    @scala.inline
    def setValueMetadata(value: js.Array[PivotGroupValueMetadata]): Self = this.set("valueMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueMetadata: Self = this.set("valueMetadata", js.undefined)
  }
  
}

