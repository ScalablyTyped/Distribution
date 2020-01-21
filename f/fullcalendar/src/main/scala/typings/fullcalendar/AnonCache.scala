package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCache extends js.Object {
  var cache: Boolean
  var dataType: String
}

object AnonCache {
  @scala.inline
  def apply(cache: Boolean, dataType: String): AnonCache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCache]
  }
}

