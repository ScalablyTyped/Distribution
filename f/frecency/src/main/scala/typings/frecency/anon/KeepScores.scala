package typings.frecency.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeepScores[T] extends js.Object {
  var keepScores: js.UndefOr[Boolean] = js.native
  var searchQuery: T = js.native
  var searchResults: js.Array[T] = js.native
}

object KeepScores {
  @scala.inline
  def apply[T](searchQuery: T, searchResults: js.Array[T]): KeepScores[T] = {
    val __obj = js.Dynamic.literal(searchQuery = searchQuery.asInstanceOf[js.Any], searchResults = searchResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepScores[T]]
  }
  @scala.inline
  implicit class KeepScoresOps[Self <: KeepScores[_], T] (val x: Self with KeepScores[T]) extends AnyVal {
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
    def setSearchResultsVarargs(value: T*): Self = this.set("searchResults", js.Array(value :_*))
    @scala.inline
    def setSearchResults(value: js.Array[T]): Self = this.set("searchResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeepScores(value: Boolean): Self = this.set("keepScores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepScores: Self = this.set("keepScores", js.undefined)
  }
  
}

