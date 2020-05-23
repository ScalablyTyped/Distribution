package typings.easyJsend.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Limit extends js.Object {
  var limit: Double
  var skip: Double
}

object Limit {
  @scala.inline
  def apply(limit: Double, skip: Double): Limit = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
}

