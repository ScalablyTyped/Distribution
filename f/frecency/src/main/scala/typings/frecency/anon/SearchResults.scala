package typings.frecency.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResults[T] extends js.Object {
  var searchQuery: T
  var searchResults: js.Array[T]
}

object SearchResults {
  @scala.inline
  def apply[T](searchQuery: T, searchResults: js.Array[T]): SearchResults[T] = {
    val __obj = js.Dynamic.literal(searchQuery = searchQuery.asInstanceOf[js.Any], searchResults = searchResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResults[T]]
  }
}

