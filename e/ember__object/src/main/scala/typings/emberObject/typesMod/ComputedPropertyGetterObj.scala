package typings.emberObject.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputedPropertyGetterObj[T] extends _ComputedPropertyObj[T] {
  def get(key: String): T
}

object ComputedPropertyGetterObj {
  @scala.inline
  def apply[T](get: String => T): ComputedPropertyGetterObj[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[ComputedPropertyGetterObj[T]]
  }
}

