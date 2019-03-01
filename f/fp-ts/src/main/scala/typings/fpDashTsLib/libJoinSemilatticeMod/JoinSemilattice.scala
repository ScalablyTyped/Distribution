package typings
package fpDashTsLib.libJoinSemilatticeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoinSemilattice[A] extends js.Object {
  def join(x: A, y: A): A
}

object JoinSemilattice {
  @scala.inline
  def apply[A](join: js.Function2[A, A, A]): JoinSemilattice[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("join")(join)
    __obj.asInstanceOf[JoinSemilattice[A]]
  }
}

