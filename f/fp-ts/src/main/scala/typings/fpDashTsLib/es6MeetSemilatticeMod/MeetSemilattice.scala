package typings
package fpDashTsLib.es6MeetSemilatticeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeetSemilattice[A] extends js.Object {
  def meet(x: A, y: A): A
}

object MeetSemilattice {
  @scala.inline
  def apply[A](meet: (A, A) => A): MeetSemilattice[A] = {
    val __obj = js.Dynamic.literal(meet = js.Any.fromFunction2(meet))
  
    __obj.asInstanceOf[MeetSemilattice[A]]
  }
}

