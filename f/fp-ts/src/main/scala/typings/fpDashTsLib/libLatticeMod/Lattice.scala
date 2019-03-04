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
  def apply[A](join: js.Function2[A, A, A], meet: js.Function2[A, A, A]): Lattice[A] = {
    val __obj = js.Dynamic.literal(join = join, meet = meet)
  
    __obj.asInstanceOf[Lattice[A]]
  }
}

