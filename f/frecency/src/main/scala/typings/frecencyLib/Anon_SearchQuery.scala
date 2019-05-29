package typings
package frecencyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SearchQuery[T] extends js.Object {
  var searchQuery: T
  var selectedId: java.lang.String
}

object Anon_SearchQuery {
  @scala.inline
  def apply[T](searchQuery: T, selectedId: java.lang.String): Anon_SearchQuery[T] = {
    val __obj = js.Dynamic.literal(searchQuery = searchQuery.asInstanceOf[js.Any], selectedId = selectedId)
  
    __obj.asInstanceOf[Anon_SearchQuery[T]]
  }
}

