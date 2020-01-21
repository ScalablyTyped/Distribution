package typings.easyJsend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLimit extends js.Object {
  var limit: Double
  var skip: Double
}

object AnonLimit {
  @scala.inline
  def apply(limit: Double, skip: Double): AnonLimit = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLimit]
  }
}

