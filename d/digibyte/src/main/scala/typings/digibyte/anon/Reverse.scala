package typings.digibyte.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reverse extends js.Object {
  def reverse(a: js.Any): js.Any
}

object Reverse {
  @scala.inline
  def apply(reverse: js.Any => js.Any): Reverse = {
    val __obj = js.Dynamic.literal(reverse = js.Any.fromFunction1(reverse))
    __obj.asInstanceOf[Reverse]
  }
}

