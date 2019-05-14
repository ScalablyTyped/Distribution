package typings
package fpDashTsLib.es6FieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field[A]
  extends fpDashTsLib.es6RingMod.Ring[A] {
  def degree(a: A): scala.Double
  def div(x: A, y: A): A
  def mod(x: A, y: A): A
}

object Field {
  @scala.inline
  def apply[A](
    add: (A, A) => A,
    degree: A => scala.Double,
    div: (A, A) => A,
    mod: (A, A) => A,
    mul: (A, A) => A,
    one: A,
    sub: (A, A) => A,
    zero: A
  ): Field[A] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), degree = js.Any.fromFunction1(degree), div = js.Any.fromFunction2(div), mod = js.Any.fromFunction2(mod), mul = js.Any.fromFunction2(mul), one = one.asInstanceOf[js.Any], sub = js.Any.fromFunction2(sub), zero = zero.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Field[A]]
  }
}

