package typings.fuseJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name[T] extends js.Object {
  var name: /* keyof T */ String
  var weight: Double
}

object Name {
  @scala.inline
  def apply[T](name: /* keyof T */ String, weight: Double): Name[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name[T]]
  }
}

