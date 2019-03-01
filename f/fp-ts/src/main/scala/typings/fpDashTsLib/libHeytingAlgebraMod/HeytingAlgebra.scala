package typings
package fpDashTsLib.libHeytingAlgebraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeytingAlgebra[A]
  extends fpDashTsLib.libBoundedDistributiveLatticeMod.BoundedDistributiveLattice[A] {
  def implies(x: A, y: A): A
  def not(x: A): A
}

object HeytingAlgebra {
  @scala.inline
  def apply[A](
    implies: js.Function2[A, A, A],
    join: js.Function2[A, A, A],
    meet: js.Function2[A, A, A],
    not: js.Function1[A, A],
    one: A,
    zero: A
  ): HeytingAlgebra[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("implies")(implies)
    __obj.updateDynamic("join")(join)
    __obj.updateDynamic("meet")(meet)
    __obj.updateDynamic("not")(not)
    __obj.updateDynamic("one")(one.asInstanceOf[js.Any])
    __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeytingAlgebra[A]]
  }
}

