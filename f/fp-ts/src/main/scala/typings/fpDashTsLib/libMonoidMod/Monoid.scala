package typings
package fpDashTsLib.libMonoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monoid[A]
  extends fpDashTsLib.libMagmaMod.Magma[A] {
  val empty: A
}

object Monoid {
  @scala.inline
  def apply[A](concat: (A, A) => A, empty: A): Monoid[A] = {
    val __obj = js.Dynamic.literal(concat = js.Any.fromFunction2(concat), empty = empty.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Monoid[A]]
  }
}

