package typings
package fpDashTsLib.libTheseMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT2[L, A] extends js.Object {
  var These: fpDashTsLib.libTheseMod.These[L, A]
}

object URI2HKT2 {
  @scala.inline
  def apply[L, A](These: fpDashTsLib.libTheseMod.These[L, A]): URI2HKT2[L, A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("These")(These)
    __obj.asInstanceOf[URI2HKT2[L, A]]
  }
}

