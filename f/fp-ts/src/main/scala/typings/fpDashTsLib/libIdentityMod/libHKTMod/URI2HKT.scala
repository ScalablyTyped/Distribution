package typings
package fpDashTsLib.libIdentityMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT[A] extends js.Object {
  var Identity: fpDashTsLib.libIdentityMod.Identity[A]
}

object URI2HKT {
  @scala.inline
  def apply[A](Identity: fpDashTsLib.libIdentityMod.Identity[A]): URI2HKT[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Identity")(Identity)
    __obj.asInstanceOf[URI2HKT[A]]
  }
}

