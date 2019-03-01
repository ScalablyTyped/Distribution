package typings
package fpDashTsLib.libMeetSemilatticeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeetSemilattice[A] extends js.Object {
  def meet(x: A, y: A): A
}

object MeetSemilattice {
  @scala.inline
  def apply[A](meet: js.Function2[A, A, A]): MeetSemilattice[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("meet")(meet)
    __obj.asInstanceOf[MeetSemilattice[A]]
  }
}

