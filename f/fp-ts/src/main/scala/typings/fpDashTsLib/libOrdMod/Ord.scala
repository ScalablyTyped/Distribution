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
  def apply[A](compare: (A, A) => fpDashTsLib.libOrderingMod.Ordering, equals: (A, A) => scala.Boolean): Ord[A] = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), equals = js.Any.fromFunction2(equals))
  
    __obj.asInstanceOf[Ord[A]]
  }
}

