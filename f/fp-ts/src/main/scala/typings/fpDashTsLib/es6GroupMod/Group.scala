package typings
package fpDashTsLib.es6GroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group[A]
  extends fpDashTsLib.es6MonoidMod.Monoid[A] {
  def inverse(a: A): A
}

object Group {
  @scala.inline
  def apply[A](concat: (A, A) => A, empty: A, inverse: A => A): Group[A] = {
    val __obj = js.Dynamic.literal(concat = js.Any.fromFunction2(concat), empty = empty.asInstanceOf[js.Any], inverse = js.Any.fromFunction1(inverse))
  
    __obj.asInstanceOf[Group[A]]
  }
}

