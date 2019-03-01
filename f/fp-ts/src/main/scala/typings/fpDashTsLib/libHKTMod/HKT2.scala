package typings
package fpDashTsLib.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HKT2[URI, L, A] extends HKT[URI, A] {
  val _L: L
}

object HKT2 {
  @scala.inline
  def apply[URI, L, A](_A: A, _L: L, _URI: URI): HKT2[URI, L, A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_A")(_A.asInstanceOf[js.Any])
    __obj.updateDynamic("_L")(_L.asInstanceOf[js.Any])
    __obj.updateDynamic("_URI")(_URI.asInstanceOf[js.Any])
    __obj.asInstanceOf[HKT2[URI, L, A]]
  }
}

