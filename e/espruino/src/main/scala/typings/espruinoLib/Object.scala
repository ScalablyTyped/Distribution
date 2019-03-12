package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  def removeListener(event: java.lang.String, listener: js.Any): js.Any
}

object Object {
  @scala.inline
  def apply(removeListener: (java.lang.String, js.Any) => js.Any): Object = {
    val __obj = js.Dynamic.literal(removeListener = js.Any.fromFunction2(removeListener))
  
    __obj.asInstanceOf[Object]
  }
}

