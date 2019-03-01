package typings
package fpDashTsLib.libStoreMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT2[L, A] extends js.Object {
  var Store: fpDashTsLib.libStoreMod.Store[L, A]
}

object URI2HKT2 {
  @scala.inline
  def apply[L, A](Store: fpDashTsLib.libStoreMod.Store[L, A]): URI2HKT2[L, A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Store")(Store)
    __obj.asInstanceOf[URI2HKT2[L, A]]
  }
}

