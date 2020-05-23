package typings.elasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bulk extends js.Object {
  var bulk: Double
  var search: Double
}

object Bulk {
  @scala.inline
  def apply(bulk: Double, search: Double): Bulk = {
    val __obj = js.Dynamic.literal(bulk = bulk.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bulk]
  }
}

