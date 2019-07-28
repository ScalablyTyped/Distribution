package typings.digibyte

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_A extends js.Object {
  def reverse(a: js.Any): js.Any
}

object Anon_A {
  @scala.inline
  def apply(reverse: js.Any => js.Any): Anon_A = {
    val __obj = js.Dynamic.literal(reverse = js.Any.fromFunction1(reverse))
  
    __obj.asInstanceOf[Anon_A]
  }
}

