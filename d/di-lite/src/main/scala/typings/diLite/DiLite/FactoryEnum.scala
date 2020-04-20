package typings.diLite.DiLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FactoryEnum extends js.Object {
  def func[T](`type`: T, args: js.Any): T
}

object FactoryEnum {
  @scala.inline
  def apply(func: (js.Any, js.Any) => js.Any): FactoryEnum = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction2(func))
    __obj.asInstanceOf[FactoryEnum]
  }
}

