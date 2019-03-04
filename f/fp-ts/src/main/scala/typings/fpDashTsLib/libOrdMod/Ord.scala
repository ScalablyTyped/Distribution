package typings
package fpDashTsLib.libOrdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ord[A]
  extends fpDashTsLib.libSetoidMod.Setoid[A] {
  def compare(x: A, y: A): fpDashTsLib.libOrderingMod.Ordering
}

object Ord {
  @scala.inline
  def apply[A](
    compare: js.Function2[A, A, fpDashTsLib.libOrderingMod.Ordering],
    equals: js.Function2[A, A, scala.Boolean]
  ): Ord[A] = {
    val __obj = js.Dynamic.literal(compare = compare, equals = equals)
  
    __obj.asInstanceOf[Ord[A]]
  }
}

