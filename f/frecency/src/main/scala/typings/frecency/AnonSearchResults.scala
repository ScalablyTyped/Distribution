package typings.frecency

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSearchResults[T] extends js.Object {
  var searchQuery: T
  var searchResults: js.Array[T]
}

object AnonSearchResults {
  @scala.inline
  def apply[T](searchQuery: T, searchResults: js.Array[T]): AnonSearchResults[T] = {
    val __obj = js.Dynamic.literal(searchQuery = searchQuery.asInstanceOf[js.Any], searchResults = searchResults.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSearchResults[T]]
  }
}

