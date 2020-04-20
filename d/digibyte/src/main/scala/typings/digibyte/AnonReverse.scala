package typings.digibyte

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReverse extends js.Object {
  def reverse(a: js.Any): js.Any
}

object AnonReverse {
  @scala.inline
  def apply(reverse: js.Any => js.Any): AnonReverse = {
    val __obj = js.Dynamic.literal(reverse = js.Any.fromFunction1(reverse))
    __obj.asInstanceOf[AnonReverse]
  }
}

