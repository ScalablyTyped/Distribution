package typings.devextreme.mod.DevExpress.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadOptions extends js.Object {
  /** @name LoadOptions.customQueryParams */
  var customQueryParams: js.UndefOr[js.Any] = js.native
  /** @name LoadOptions.expand */
  var expand: js.UndefOr[js.Any] = js.native
  /** @name LoadOptions.filter */
  var filter: js.UndefOr[js.Any] = js.native
  /** @name LoadOptions.group */
  var group: js.UndefOr[js.Any] = js.native
  /** @name LoadOptions.groupSummary */
  var groupSummary: js.UndefOr[js.Any] = js.native
  /** @name LoadOptions.parentIds */
  var parentIds: js.UndefOr[js.Array[_]] = js.native
  /** @name LoadOptions.requireGroupCount */
  var requireGroupCount: js.UndefOr[Boolean] = js.native
  /** @name LoadOptions.requireTotalCount */
  var requireTotalCount: js.UndefOr[Boolean] = js.native
  /** @name LoadOptions.searchExpr */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.native
  /** @name LoadOptions.searchOperation */
  var searchOperation: js.UndefOr[String] = js.native
  /** @name LoadOptions.searchValue */
  var searchValue: js.UndefOr[js.Any] = js.native
  /** @name LoadOptions.select */
  var select: js.UndefOr[js.Any] = js.native
  /** @name LoadOptions.skip */
  var skip: js.UndefOr[Double] = js.native
  /** @name LoadOptions.sort */
  var sort: js.UndefOr[js.Any] = js.native
  /** @name LoadOptions.take */
  var take: js.UndefOr[Double] = js.native
  /** @name LoadOptions.totalSummary */
  var totalSummary: js.UndefOr[js.Any] = js.native
  /** @name LoadOptions.userData */
  var userData: js.UndefOr[js.Any] = js.native
}

object LoadOptions {
  @scala.inline
  def apply(): LoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadOptions]
  }
  @scala.inline
  implicit class LoadOptionsOps[Self <: LoadOptions] (val x: Self) extends AnyVal {
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
    def setCustomQueryParams(value: js.Any): Self = this.set("customQueryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomQueryParams: Self = this.set("customQueryParams", js.undefined)
    @scala.inline
    def setExpand(value: js.Any): Self = this.set("expand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    @scala.inline
    def setFilter(value: js.Any): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setGroup(value: js.Any): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setGroupSummary(value: js.Any): Self = this.set("groupSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupSummary: Self = this.set("groupSummary", js.undefined)
    @scala.inline
    def setParentIdsVarargs(value: js.Any*): Self = this.set("parentIds", js.Array(value :_*))
    @scala.inline
    def setParentIds(value: js.Array[_]): Self = this.set("parentIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentIds: Self = this.set("parentIds", js.undefined)
    @scala.inline
    def setRequireGroupCount(value: Boolean): Self = this.set("requireGroupCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireGroupCount: Self = this.set("requireGroupCount", js.undefined)
    @scala.inline
    def setRequireTotalCount(value: Boolean): Self = this.set("requireTotalCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireTotalCount: Self = this.set("requireTotalCount", js.undefined)
    @scala.inline
    def setSearchExprVarargs(value: (String | js.Function)*): Self = this.set("searchExpr", js.Array(value :_*))
    @scala.inline
    def setSearchExpr(value: String | js.Function | (js.Array[String | js.Function])): Self = this.set("searchExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchExpr: Self = this.set("searchExpr", js.undefined)
    @scala.inline
    def setSearchOperation(value: String): Self = this.set("searchOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchOperation: Self = this.set("searchOperation", js.undefined)
    @scala.inline
    def setSearchValue(value: js.Any): Self = this.set("searchValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchValue: Self = this.set("searchValue", js.undefined)
    @scala.inline
    def setSelect(value: js.Any): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setSort(value: js.Any): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setTake(value: Double): Self = this.set("take", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTake: Self = this.set("take", js.undefined)
    @scala.inline
    def setTotalSummary(value: js.Any): Self = this.set("totalSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalSummary: Self = this.set("totalSummary", js.undefined)
    @scala.inline
    def setUserData(value: js.Any): Self = this.set("userData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserData: Self = this.set("userData", js.undefined)
  }
  
}

