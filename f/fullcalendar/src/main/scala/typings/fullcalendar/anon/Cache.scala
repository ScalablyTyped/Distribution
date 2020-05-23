package typings.fullcalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  var cache: Boolean
  var dataType: String
}

object Cache {
  @scala.inline
  def apply(cache: Boolean, dataType: String): Cache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
}

