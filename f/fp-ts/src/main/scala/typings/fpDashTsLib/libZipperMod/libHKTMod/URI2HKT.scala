package typings
package fpDashTsLib.libZipperMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT[A] extends js.Object {
  var Zipper: fpDashTsLib.libZipperMod.Zipper[A]
}

object URI2HKT {
  @scala.inline
  def apply[A](Zipper: fpDashTsLib.libZipperMod.Zipper[A]): URI2HKT[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Zipper")(Zipper)
    __obj.asInstanceOf[URI2HKT[A]]
  }
}

