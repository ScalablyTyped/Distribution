package typings
package fpDashTsLib.es6JoinSemilatticeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoinSemilattice[A] extends js.Object {
  def join(x: A, y: A): A
}

object JoinSemilattice {
  @scala.inline
  def apply[A](join: (A, A) => A): JoinSemilattice[A] = {
    val __obj = js.Dynamic.literal(join = js.Any.fromFunction2(join))
  
    __obj.asInstanceOf[JoinSemilattice[A]]
  }
}

