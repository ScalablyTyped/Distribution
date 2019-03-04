package typings
package fpDashTsLib.libStateMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT2[L, A] extends js.Object {
  var State: fpDashTsLib.libStateMod.State[L, A]
}

object URI2HKT2 {
  @scala.inline
  def apply[L, A](State: fpDashTsLib.libStateMod.State[L, A]): URI2HKT2[L, A] = {
    val __obj = js.Dynamic.literal(State = State)
  
    __obj.asInstanceOf[URI2HKT2[L, A]]
  }
}

