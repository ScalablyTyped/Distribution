package typings
package diDashLiteLib.DiLiteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FactoryEnum extends js.Object {
  def func[T](`type`: T, args: js.Any): T
}

object FactoryEnum {
  @scala.inline
  def apply(func: js.Function2[js.Any, js.Any, js.Any]): FactoryEnum = {
    val __obj = js.Dynamic.literal(func = func)
  
    __obj.asInstanceOf[FactoryEnum]
  }
}

