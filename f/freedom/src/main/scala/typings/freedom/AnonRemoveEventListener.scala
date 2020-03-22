package typings.freedom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemoveEventListener extends js.Object {
  def removeEventListener(s: String, f: js.Function, b: Boolean): Unit
}

object AnonRemoveEventListener {
  @scala.inline
  def apply(removeEventListener: (String, js.Function, Boolean) => Unit): AnonRemoveEventListener = {
    val __obj = js.Dynamic.literal(removeEventListener = js.Any.fromFunction3(removeEventListener))
  
    __obj.asInstanceOf[AnonRemoveEventListener]
  }
}

