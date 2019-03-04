package typings
package fpDashTsLib.libBoundedJoinSemilatticeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundedJoinSemilattice[A]
  extends fpDashTsLib.libJoinSemilatticeMod.JoinSemilattice[A] {
  val zero: A
}

object BoundedJoinSemilattice {
  @scala.inline
  def apply[A](join: js.Function2[A, A, A], zero: A): BoundedJoinSemilattice[A] = {
    val __obj = js.Dynamic.literal(join = join, zero = zero.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoundedJoinSemilattice[A]]
  }
}

