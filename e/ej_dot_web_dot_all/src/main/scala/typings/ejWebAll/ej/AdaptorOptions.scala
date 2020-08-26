package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdaptorOptions extends js.Object {
  var aggregates: js.UndefOr[String] = js.native
  var count: js.UndefOr[String] = js.native
  var from: js.UndefOr[String] = js.native
  var group: js.UndefOr[String] = js.native
  var requestType: js.UndefOr[String] = js.native
  var search: js.UndefOr[String] = js.native
  var select: js.UndefOr[String] = js.native
  var skip: js.UndefOr[String] = js.native
  var sortBy: js.UndefOr[String] = js.native
  var take: js.UndefOr[String] = js.native
  var where: js.UndefOr[String] = js.native
}

object AdaptorOptions {
  @scala.inline
  def apply(): AdaptorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdaptorOptions]
  }
  @scala.inline
  implicit class AdaptorOptionsOps[Self <: AdaptorOptions] (val x: Self) extends AnyVal {
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
    def setAggregates(value: String): Self = this.set("aggregates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregates: Self = this.set("aggregates", js.undefined)
    @scala.inline
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestType: Self = this.set("requestType", js.undefined)
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    @scala.inline
    def setSelect(value: String): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSkip(value: String): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setSortBy(value: String): Self = this.set("sortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortBy: Self = this.set("sortBy", js.undefined)
    @scala.inline
    def setTake(value: String): Self = this.set("take", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTake: Self = this.set("take", js.undefined)
    @scala.inline
    def setWhere(value: String): Self = this.set("where", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
  
}

