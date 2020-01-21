package typings.fuseJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName[T] extends js.Object {
  var name: String
  var weight: Double
}

object AnonName {
  @scala.inline
  def apply[T](name: String, weight: Double): AnonName[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName[T]]
  }
}

