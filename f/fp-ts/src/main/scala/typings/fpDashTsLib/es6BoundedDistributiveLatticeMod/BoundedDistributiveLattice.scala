package typings
package fpDashTsLib.es6BoundedDistributiveLatticeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundedDistributiveLattice[A]
  extends fpDashTsLib.es6BoundedLatticeMod.BoundedLattice[A]
     with fpDashTsLib.es6LatticeMod.Lattice[A]

object BoundedDistributiveLattice {
  @scala.inline
  def apply[A](join: (A, A) => A, meet: (A, A) => A, one: A, zero: A): BoundedDistributiveLattice[A] = {
    val __obj = js.Dynamic.literal(join = js.Any.fromFunction2(join), meet = js.Any.fromFunction2(meet), one = one.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoundedDistributiveLattice[A]]
  }
}

