package typings
package fpDashTsLib.libFreeGroupMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT[A] extends js.Object {
  var FreeGroup: fpDashTsLib.libFreeGroupMod.FreeGroup[A]
}

object URI2HKT {
  @scala.inline
  def apply[A](FreeGroup: fpDashTsLib.libFreeGroupMod.FreeGroup[A]): URI2HKT[A] = {
    val __obj = js.Dynamic.literal(FreeGroup = FreeGroup)
  
    __obj.asInstanceOf[URI2HKT[A]]
  }
}

