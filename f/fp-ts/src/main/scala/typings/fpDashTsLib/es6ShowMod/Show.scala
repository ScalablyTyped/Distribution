package typings
package fpDashTsLib.es6ShowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Show[A] extends js.Object {
  def show(a: A): java.lang.String
}

object Show {
  @scala.inline
  def apply[A](show: A => java.lang.String): Show[A] = {
    val __obj = js.Dynamic.literal(show = js.Any.fromFunction1(show))
  
    __obj.asInstanceOf[Show[A]]
  }
}

