package typings.frecency

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSearchQuerySearchResults[T] extends js.Object {
  var searchQuery: T
  var searchResults: js.Array[T]
}

object AnonSearchQuerySearchResults {
  @scala.inline
  def apply[T](searchQuery: T, searchResults: js.Array[T]): AnonSearchQuerySearchResults[T] = {
    val __obj = js.Dynamic.literal(searchQuery = searchQuery.asInstanceOf[js.Any], searchResults = searchResults.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSearchQuerySearchResults[T]]
  }
}

