package typings.frecency.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchQuery[T] extends js.Object {
  var searchQuery: T
  var selectedId: String
}

object SearchQuery {
  @scala.inline
  def apply[T](searchQuery: T, selectedId: String): SearchQuery[T] = {
    val __obj = js.Dynamic.literal(searchQuery = searchQuery.asInstanceOf[js.Any], selectedId = selectedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQuery[T]]
  }
}

