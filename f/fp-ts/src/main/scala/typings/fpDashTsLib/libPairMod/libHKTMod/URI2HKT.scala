package typings
package fpDashTsLib.libPairMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT[A] extends js.Object {
  var Pair: fpDashTsLib.libPairMod.Pair[A]
}

object URI2HKT {
  @scala.inline
  def apply[A](Pair: fpDashTsLib.libPairMod.Pair[A]): URI2HKT[A] = {
    val __obj = js.Dynamic.literal(Pair = Pair)
  
    __obj.asInstanceOf[URI2HKT[A]]
  }
}

