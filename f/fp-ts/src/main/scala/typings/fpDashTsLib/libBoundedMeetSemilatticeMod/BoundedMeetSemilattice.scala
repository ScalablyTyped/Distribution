package typings
package fpDashTsLib.libBoundedMeetSemilatticeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundedMeetSemilattice[A]
  extends fpDashTsLib.libMeetSemilatticeMod.MeetSemilattice[A] {
  val one: A
}

object BoundedMeetSemilattice {
  @scala.inline
  def apply[A](meet: js.Function2[A, A, A], one: A): BoundedMeetSemilattice[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("meet")(meet)
    __obj.updateDynamic("one")(one.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundedMeetSemilattice[A]]
  }
}

