package typings
package fpDashTsLib.libLatticeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lattice[A]
  extends fpDashTsLib.libJoinSemilatticeMod.JoinSemilattice[A]
     with fpDashTsLib.libMeetSemilatticeMod.MeetSemilattice[A]

object Lattice {
  @scala.inline
  def apply[A](join: (A, A) => A, meet: (A, A) => A): Lattice[A] = {
    val __obj = js.Dynamic.literal(join = js.Any.fromFunction2(join), meet = js.Any.fromFunction2(meet))
  
    __obj.asInstanceOf[Lattice[A]]
  }
}

