package typings.feathersjsFeathers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paginated[T] extends js.Object {
  var data: js.Array[T]
  var limit: Double
  var skip: Double
  var total: Double
}

object Paginated {
  @scala.inline
  def apply[T](data: js.Array[T], limit: Double, skip: Double, total: Double): Paginated[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paginated[T]]
  }
}

