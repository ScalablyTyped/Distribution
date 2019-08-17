package typings.atEmberObject.dashPrivateTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputedPropertyGetterObj[T] extends _ComputedPropertyObj[T] {
  def get(`this`: js.Any, key: String): T
}

object ComputedPropertyGetterObj {
  @scala.inline
  def apply[T](get: (js.Any, String) => T): ComputedPropertyGetterObj[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
  
    __obj.asInstanceOf[ComputedPropertyGetterObj[T]]
  }
}

