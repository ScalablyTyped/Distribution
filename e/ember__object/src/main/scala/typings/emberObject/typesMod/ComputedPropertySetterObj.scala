package typings.emberObject.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputedPropertySetterObj[T] extends _ComputedPropertyObj[T] {
  def set(key: String, value: T): T
}

object ComputedPropertySetterObj {
  @scala.inline
  def apply[T](set: (String, T) => T): ComputedPropertySetterObj[T] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[ComputedPropertySetterObj[T]]
  }
}

