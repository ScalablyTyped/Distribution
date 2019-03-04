package typings
package fpDashTsLib.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HKT[URI, A] extends js.Object {
  val _A: A
  val _URI: URI
}

object HKT {
  @scala.inline
  def apply[URI, A](_A: A, _URI: URI): HKT[URI, A] = {
    val __obj = js.Dynamic.literal(_A = _A.asInstanceOf[js.Any], _URI = _URI.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HKT[URI, A]]
  }
}

