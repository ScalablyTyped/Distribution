package typings
package atFeathersjsFeathersLib.atFeathersjsFeathersMod.feathersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paginated[T] extends js.Object {
  var data: js.Array[T]
  var limit: scala.Double
  var skip: scala.Double
  var total: scala.Double
}

object Paginated {
  @scala.inline
  def apply[T](data: js.Array[T], limit: scala.Double, skip: scala.Double, total: scala.Double): Paginated[T] = {
    val __obj = js.Dynamic.literal(data = data, limit = limit, skip = skip, total = total)
  
    __obj.asInstanceOf[Paginated[T]]
  }
}

