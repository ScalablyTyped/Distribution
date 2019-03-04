package typings
package fpDashTsLib.libGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group[A]
  extends fpDashTsLib.libMonoidMod.Monoid[A] {
  def inverse(a: A): A
}

object Group {
  @scala.inline
  def apply[A](concat: js.Function2[A, A, A], empty: A, inverse: js.Function1[A, A]): Group[A] = {
    val __obj = js.Dynamic.literal(concat = concat, empty = empty.asInstanceOf[js.Any], inverse = inverse)
  
    __obj.asInstanceOf[Group[A]]
  }
}

