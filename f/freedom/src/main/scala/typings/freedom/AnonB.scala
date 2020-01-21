package typings.freedom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonB extends js.Object {
  def removeEventListener(s: String, f: js.Function, b: Boolean): Unit
}

object AnonB {
  @scala.inline
  def apply(removeEventListener: (String, js.Function, Boolean) => Unit): AnonB = {
    val __obj = js.Dynamic.literal(removeEventListener = js.Any.fromFunction3(removeEventListener))
  
    __obj.asInstanceOf[AnonB]
  }
}

