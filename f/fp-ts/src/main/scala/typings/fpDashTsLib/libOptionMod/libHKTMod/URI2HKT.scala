package typings
package fpDashTsLib.libOptionMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT[A] extends js.Object {
  var Option: fpDashTsLib.libOptionMod.Option[A]
}

object URI2HKT {
  @scala.inline
  def apply[A](Option: fpDashTsLib.libOptionMod.Option[A]): URI2HKT[A] = {
    val __obj = js.Dynamic.literal(Option = Option)
  
    __obj.asInstanceOf[URI2HKT[A]]
  }
}

