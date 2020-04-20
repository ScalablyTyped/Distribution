package typings.emberObject.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ComputedPropertyObj[T] extends js.Object

object _ComputedPropertyObj {
  @scala.inline
  def ComputedPropertyGetterObj[T](get: String => T): _ComputedPropertyObj[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[_ComputedPropertyObj[T]]
  }
  @scala.inline
  def ComputedPropertySetterObj[T](set: (String, T) => T): _ComputedPropertyObj[T] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[_ComputedPropertyObj[T]]
  }
}

