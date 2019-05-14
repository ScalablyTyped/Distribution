package typings
package fpDashTsLib.es6IdentityMod.es6HKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT[A] extends js.Object {
  var Identity: fpDashTsLib.es6IdentityMod.Identity[A]
}

object URI2HKT {
  @scala.inline
  def apply[A](Identity: fpDashTsLib.es6IdentityMod.Identity[A]): URI2HKT[A] = {
    val __obj = js.Dynamic.literal(Identity = Identity)
  
    __obj.asInstanceOf[URI2HKT[A]]
  }
}

