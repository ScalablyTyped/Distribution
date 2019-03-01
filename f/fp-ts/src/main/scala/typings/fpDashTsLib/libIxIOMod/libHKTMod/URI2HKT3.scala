package typings
package fpDashTsLib.libIxIOMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT3[U, L, A] extends js.Object {
  var IxIO: fpDashTsLib.libIxIOMod.IxIO[U, L, A]
}

object URI2HKT3 {
  @scala.inline
  def apply[U, L, A](IxIO: fpDashTsLib.libIxIOMod.IxIO[U, L, A]): URI2HKT3[U, L, A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IxIO")(IxIO)
    __obj.asInstanceOf[URI2HKT3[U, L, A]]
  }
}

