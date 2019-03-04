package typings
package fpDashTsLib.libFreeMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT2[L, A] extends js.Object {
  var Free: fpDashTsLib.libFreeMod.Free[L, A]
}

object URI2HKT2 {
  @scala.inline
  def apply[L, A](Free: fpDashTsLib.libFreeMod.Free[L, A]): URI2HKT2[L, A] = {
    val __obj = js.Dynamic.literal(Free = Free.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[URI2HKT2[L, A]]
  }
}

