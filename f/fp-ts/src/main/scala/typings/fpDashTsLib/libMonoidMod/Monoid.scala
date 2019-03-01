package typings
package fpDashTsLib.libMonoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monoid[A]
  extends fpDashTsLib.libSemigroupMod.Semigroup[A] {
  val empty: A
}

object Monoid {
  @scala.inline
  def apply[A](concat: js.Function2[A, A, A], empty: A): Monoid[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("concat")(concat)
    __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Monoid[A]]
  }
}

