package typings
package fpDashTsLib.libTreeMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT[A] extends js.Object {
  var Tree: fpDashTsLib.libTreeMod.Tree[A]
}

object URI2HKT {
  @scala.inline
  def apply[A](Tree: fpDashTsLib.libTreeMod.Tree[A]): URI2HKT[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Tree")(Tree)
    __obj.asInstanceOf[URI2HKT[A]]
  }
}

