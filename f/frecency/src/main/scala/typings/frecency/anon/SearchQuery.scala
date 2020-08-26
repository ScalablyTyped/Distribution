package typings.frecency.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchQuery[T] extends js.Object {
  var searchQuery: T = js.native
  var selectedId: String = js.native
}

object SearchQuery {
  @scala.inline
  def apply[T](searchQuery: T, selectedId: String): SearchQuery[T] = {
    val __obj = js.Dynamic.literal(searchQuery = searchQuery.asInstanceOf[js.Any], selectedId = selectedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQuery[T]]
  }
  @scala.inline
  implicit class SearchQueryOps[Self <: SearchQuery[_], T] (val x: Self with SearchQuery[T]) extends AnyVal {
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
    def setSearchQuery(value: T): Self = this.set("searchQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedId(value: String): Self = this.set("selectedId", value.asInstanceOf[js.Any])
  }
  
}

