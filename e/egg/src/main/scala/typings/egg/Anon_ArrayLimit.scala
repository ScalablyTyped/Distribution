package typings.egg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrayLimit extends js.Object {
  var arrayLimit: Double
  var depth: Double
  var parameterLimit: Double
}

object Anon_ArrayLimit {
  @scala.inline
  def apply(arrayLimit: Double, depth: Double, parameterLimit: Double): Anon_ArrayLimit = {
    val __obj = js.Dynamic.literal(arrayLimit = arrayLimit.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], parameterLimit = parameterLimit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ArrayLimit]
  }
}

