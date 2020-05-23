package typings.egg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayLimit extends js.Object {
  var arrayLimit: Double
  var depth: Double
  var parameterLimit: Double
}

object ArrayLimit {
  @scala.inline
  def apply(arrayLimit: Double, depth: Double, parameterLimit: Double): ArrayLimit = {
    val __obj = js.Dynamic.literal(arrayLimit = arrayLimit.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], parameterLimit = parameterLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayLimit]
  }
}

