package typings
package fpDashTsLib.libWriterMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT2[L, A] extends js.Object {
  var Writer: fpDashTsLib.libWriterMod.Writer[L, A]
}

object URI2HKT2 {
  @scala.inline
  def apply[L, A](Writer: fpDashTsLib.libWriterMod.Writer[L, A]): URI2HKT2[L, A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Writer")(Writer)
    __obj.asInstanceOf[URI2HKT2[L, A]]
  }
}

