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
  def apply[A](join: js.Function2[A, A, A], meet: js.Function2[A, A, A], one: A, zero: A): BoundedLattice[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("join")(join)
    __obj.updateDynamic("meet")(meet)
    __obj.updateDynamic("one")(one.asInstanceOf[js.Any])
    __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundedLattice[A]]
  }
}

