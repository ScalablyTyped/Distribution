package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotGroup extends js.Object {
  var groupRule: js.UndefOr[PivotGroupRule] = js.native
  var label: js.UndefOr[String] = js.native
  var repeatHeadings: js.UndefOr[Boolean] = js.native
  var showTotals: js.UndefOr[Boolean] = js.native
  var sortOrder: js.UndefOr[String] = js.native
  var sourceColumnOffset: js.UndefOr[Double] = js.native
  var valueBucket: js.UndefOr[PivotGroupSortValueBucket] = js.native
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

