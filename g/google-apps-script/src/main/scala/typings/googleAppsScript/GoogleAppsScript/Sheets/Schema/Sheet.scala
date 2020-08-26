package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sheet extends js.Object {
  var bandedRanges: js.UndefOr[js.Array[BandedRange]] = js.native
  var basicFilter: js.UndefOr[BasicFilter] = js.native
  var charts: js.UndefOr[js.Array[EmbeddedChart]] = js.native
  var columnGroups: js.UndefOr[js.Array[DimensionGroup]] = js.native
  var conditionalFormats: js.UndefOr[js.Array[ConditionalFormatRule]] = js.native
  var data: js.UndefOr[js.Array[GridData]] = js.native
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.native
  var filterViews: js.UndefOr[js.Array[FilterView]] = js.native
  var merges: js.UndefOr[js.Array[GridRange]] = js.native
  var properties: js.UndefOr[SheetProperties] = js.native
  var protectedRanges: js.UndefOr[js.Array[ProtectedRange]] = js.native
  var rowGroups: js.UndefOr[js.Array[DimensionGroup]] = js.native
}

object Sheet {
  @scala.inline
  def apply(): Sheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sheet]
  }
  @scala.inline
  implicit class SheetOps[Self <: Sheet] (val x: Self) extends AnyVal {
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
    def setBandedRangesVarargs(value: BandedRange*): Self = this.set("bandedRanges", js.Array(value :_*))
    @scala.inline
    def setBandedRanges(value: js.Array[BandedRange]): Self = this.set("bandedRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBandedRanges: Self = this.set("bandedRanges", js.undefined)
    @scala.inline
    def setBasicFilter(value: BasicFilter): Self = this.set("basicFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasicFilter: Self = this.set("basicFilter", js.undefined)
    @scala.inline
    def setChartsVarargs(value: EmbeddedChart*): Self = this.set("charts", js.Array(value :_*))
    @scala.inline
    def setCharts(value: js.Array[EmbeddedChart]): Self = this.set("charts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharts: Self = this.set("charts", js.undefined)
    @scala.inline
    def setColumnGroupsVarargs(value: DimensionGroup*): Self = this.set("columnGroups", js.Array(value :_*))
    @scala.inline
    def setColumnGroups(value: js.Array[DimensionGroup]): Self = this.set("columnGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnGroups: Self = this.set("columnGroups", js.undefined)
    @scala.inline
    def setConditionalFormatsVarargs(value: ConditionalFormatRule*): Self = this.set("conditionalFormats", js.Array(value :_*))
    @scala.inline
    def setConditionalFormats(value: js.Array[ConditionalFormatRule]): Self = this.set("conditionalFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditionalFormats: Self = this.set("conditionalFormats", js.undefined)
    @scala.inline
    def setDataVarargs(value: GridData*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[GridData]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDeveloperMetadataVarargs(value: DeveloperMetadata*): Self = this.set("developerMetadata", js.Array(value :_*))
    @scala.inline
    def setDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = this.set("developerMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloperMetadata: Self = this.set("developerMetadata", js.undefined)
    @scala.inline
    def setFilterViewsVarargs(value: FilterView*): Self = this.set("filterViews", js.Array(value :_*))
    @scala.inline
    def setFilterViews(value: js.Array[FilterView]): Self = this.set("filterViews", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterViews: Self = this.set("filterViews", js.undefined)
    @scala.inline
    def setMergesVarargs(value: GridRange*): Self = this.set("merges", js.Array(value :_*))
    @scala.inline
    def setMerges(value: js.Array[GridRange]): Self = this.set("merges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerges: Self = this.set("merges", js.undefined)
    @scala.inline
    def setProperties(value: SheetProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setProtectedRangesVarargs(value: ProtectedRange*): Self = this.set("protectedRanges", js.Array(value :_*))
    @scala.inline
    def setProtectedRanges(value: js.Array[ProtectedRange]): Self = this.set("protectedRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtectedRanges: Self = this.set("protectedRanges", js.undefined)
    @scala.inline
    def setRowGroupsVarargs(value: DimensionGroup*): Self = this.set("rowGroups", js.Array(value :_*))
    @scala.inline
    def setRowGroups(value: js.Array[DimensionGroup]): Self = this.set("rowGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowGroups: Self = this.set("rowGroups", js.undefined)
  }
  
}

