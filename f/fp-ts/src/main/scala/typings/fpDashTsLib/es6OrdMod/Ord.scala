package typings
package fpDashTsLib.es6OrdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ord[A]
  extends fpDashTsLib.es6SetoidMod.Setoid[A] {
  def compare(x: A, y: A): fpDashTsLib.es6OrderingMod.Ordering
}

object Ord {
  @scala.inline
  def apply[A](compare: (A, A) => fpDashTsLib.es6OrderingMod.Ordering, equals: (A, A) => scala.Boolean): Ord[A] = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), equals = js.Any.fromFunction2(equals))
  
    __obj.asInstanceOf[Ord[A]]
  }
}

