package typings
package fpDashTsLib.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HKT4[URI, X, U, L, A] extends HKT3[URI, U, L, A] {
  val _X: X
}

object HKT4 {
  @scala.inline
  def apply[URI, X, U, L, A](_A: A, _L: L, _U: U, _URI: URI, _X: X): HKT4[URI, X, U, L, A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_A")(_A.asInstanceOf[js.Any])
    __obj.updateDynamic("_L")(_L.asInstanceOf[js.Any])
    __obj.updateDynamic("_U")(_U.asInstanceOf[js.Any])
    __obj.updateDynamic("_URI")(_URI.asInstanceOf[js.Any])
    __obj.updateDynamic("_X")(_X.asInstanceOf[js.Any])
    __obj.asInstanceOf[HKT4[URI, X, U, L, A]]
  }
}

