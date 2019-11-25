package typings.frecency

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SearchQuerySearchResults[T] extends js.Object {
  var searchQuery: T
  var searchResults: js.Array[T]
}

object Anon_SearchQuerySearchResults {
  @scala.inline
  def apply[T](searchQuery: T, searchResults: js.Array[T]): Anon_SearchQuerySearchResults[T] = {
    val __obj = js.Dynamic.literal(searchQuery = searchQuery.asInstanceOf[js.Any], searchResults = searchResults.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_SearchQuerySearchResults[T]]
  }
}

