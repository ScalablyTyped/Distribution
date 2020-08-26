package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFiltersResponse extends js.Object {
  var filter: js.UndefOr[js.Array[Filter]] = js.native
}

object ListFiltersResponse {
  @scala.inline
  def apply(): ListFiltersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFiltersResponse]
  }
  @scala.inline
  implicit class ListFiltersResponseOps[Self <: ListFiltersResponse] (val x: Self) extends AnyVal {
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
    def setFilterVarargs(value: Filter*): Self = this.set("filter", js.Array(value :_*))
    @scala.inline
    def setFilter(value: js.Array[Filter]): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
  }
  
}

