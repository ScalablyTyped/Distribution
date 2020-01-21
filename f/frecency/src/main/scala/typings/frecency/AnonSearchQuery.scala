package typings.frecency

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSearchQuery[T] extends js.Object {
  var searchQuery: T
  var selectedId: String
}

object AnonSearchQuery {
  @scala.inline
  def apply[T](searchQuery: T, selectedId: String): AnonSearchQuery[T] = {
    val __obj = js.Dynamic.literal(searchQuery = searchQuery.asInstanceOf[js.Any], selectedId = selectedId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSearchQuery[T]]
  }
}

