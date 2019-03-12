package typings
package fpDashTsLib.libBoundedLatticeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundedLattice[A]
  extends fpDashTsLib.libBoundedJoinSemilatticeMod.BoundedJoinSemilattice[A]
     with fpDashTsLib.libBoundedMeetSemilatticeMod.BoundedMeetSemilattice[A]

object BoundedLattice {
  @scala.inline
  def apply[A](join: (A, A) => A, meet: (A, A) => A, one: A, zero: A): BoundedLattice[A] = {
    val __obj = js.Dynamic.literal(join = js.Any.fromFunction2(join), meet = js.Any.fromFunction2(meet), one = one.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoundedLattice[A]]
  }
}

