package typings
package fpDashTsLib.libStrMapMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT[A] extends js.Object {
  var StrMap: fpDashTsLib.libStrMapMod.StrMap[A]
}

object URI2HKT {
  @scala.inline
  def apply[A](StrMap: fpDashTsLib.libStrMapMod.StrMap[A]): URI2HKT[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("StrMap")(StrMap)
    __obj.asInstanceOf[URI2HKT[A]]
  }
}

