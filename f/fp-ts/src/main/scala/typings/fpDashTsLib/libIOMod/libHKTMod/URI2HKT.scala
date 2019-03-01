package typings
package fpDashTsLib.libIOMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT[A] extends js.Object {
  var IO: fpDashTsLib.libIOMod.IO[A]
}

object URI2HKT {
  @scala.inline
  def apply[A](IO: fpDashTsLib.libIOMod.IO[A]): URI2HKT[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IO")(IO)
    __obj.asInstanceOf[URI2HKT[A]]
  }
}

