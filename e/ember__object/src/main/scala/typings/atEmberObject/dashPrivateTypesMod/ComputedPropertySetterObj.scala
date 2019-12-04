package typings.atEmberObject.dashPrivateTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputedPropertySetterObj[T] extends _ComputedPropertyObj[T] {
  def set(`this`: js.Any, key: String, value: T): T
}

object ComputedPropertySetterObj {
  @scala.inline
  def apply[T](set: (js.Any, String, T) => T): ComputedPropertySetterObj[T] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction3(set))
  
    __obj.asInstanceOf[ComputedPropertySetterObj[T]]
  }
}

