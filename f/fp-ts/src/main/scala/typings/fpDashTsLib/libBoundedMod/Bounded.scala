package typings
package fpDashTsLib.libBoundedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounded[A]
  extends fpDashTsLib.libOrdMod.Ord[A] {
  val bottom: A
  val top: A
}

object Bounded {
  @scala.inline
  def apply[A](
    bottom: A,
    compare: js.Function2[A, A, fpDashTsLib.libOrderingMod.Ordering],
    equals: js.Function2[A, A, scala.Boolean],
    top: A
  ): Bounded[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    __obj.updateDynamic("compare")(compare)
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounded[A]]
  }
}

