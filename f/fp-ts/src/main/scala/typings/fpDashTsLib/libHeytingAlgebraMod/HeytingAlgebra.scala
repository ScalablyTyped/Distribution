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
  def apply[A](implies: (A, A) => A, join: (A, A) => A, meet: (A, A) => A, not: A => A, one: A, zero: A): HeytingAlgebra[A] = {
    val __obj = js.Dynamic.literal(implies = js.Any.fromFunction2(implies), join = js.Any.fromFunction2(join), meet = js.Any.fromFunction2(meet), not = js.Any.fromFunction1(not), one = one.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeytingAlgebra[A]]
  }
}

