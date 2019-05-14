package typings
package fpDashTsLib.es6StoreMod.es6HKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT2[L, A] extends js.Object {
  var Store: fpDashTsLib.es6StoreMod.Store[L, A]
}

object URI2HKT2 {
  @scala.inline
  def apply[L, A](Store: fpDashTsLib.es6StoreMod.Store[L, A]): URI2HKT2[L, A] = {
    val __obj = js.Dynamic.literal(Store = Store)
  
    __obj.asInstanceOf[URI2HKT2[L, A]]
  }
}

