package typings
package fpDashTsLib.libRingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ring[A]
  extends fpDashTsLib.libSemiringMod.Semiring[A] {
  def sub(x: A, y: A): A
}

object Ring {
  @scala.inline
  def apply[A](
    add: js.Function2[A, A, A],
    mul: js.Function2[A, A, A],
    one: A,
    sub: js.Function2[A, A, A],
    zero: A
  ): Ring[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("mul")(mul)
    __obj.updateDynamic("one")(one.asInstanceOf[js.Any])
    __obj.updateDynamic("sub")(sub)
    __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ring[A]]
  }
}

