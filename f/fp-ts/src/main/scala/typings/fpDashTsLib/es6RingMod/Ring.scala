package typings
package fpDashTsLib.es6RingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ring[A]
  extends fpDashTsLib.es6SemiringMod.Semiring[A] {
  def sub(x: A, y: A): A
}

object Ring {
  @scala.inline
  def apply[A](add: (A, A) => A, mul: (A, A) => A, one: A, sub: (A, A) => A, zero: A): Ring[A] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), mul = js.Any.fromFunction2(mul), one = one.asInstanceOf[js.Any], sub = js.Any.fromFunction2(sub), zero = zero.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Ring[A]]
  }
}

