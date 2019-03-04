package typings
package fpDashTsLib.libFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field[A]
  extends fpDashTsLib.libRingMod.Ring[A] {
  def degree(a: A): scala.Double
  def div(x: A, y: A): A
  def mod(x: A, y: A): A
}

object Field {
  @scala.inline
  def apply[A](
    add: js.Function2[A, A, A],
    degree: js.Function1[A, scala.Double],
    div: js.Function2[A, A, A],
    mod: js.Function2[A, A, A],
    mul: js.Function2[A, A, A],
    one: A,
    sub: js.Function2[A, A, A],
    zero: A
  ): Field[A] = {
    val __obj = js.Dynamic.literal(add = add, degree = degree, div = div, mod = mod, mul = mul, one = one.asInstanceOf[js.Any], sub = sub, zero = zero.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Field[A]]
  }
}

